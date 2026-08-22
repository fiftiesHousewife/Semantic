package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

/**
 * Accumulates one scope's identifier occurrences into a {@link ScopeLegibility}. Words are tallied as they
 * arrive and cited once each at the end, so a corpus writing {@code evidence} a thousand times pays for one
 * dictionary lookup rather than a thousand.
 *
 * <p>Nothing has to be set aside here, because the parse never offered it. The language's own words are
 * never declarations; the platform's and the framework's names are uses of someone else's declarations; and
 * both are gone before the first word is counted. What arrives is what this repository named and wrote.
 */
public final class LegibilityTally {

    private final CitedWords cited;
    private final IdentifierWords words;
    private final PublishedRuns runs;

    private final Map<String, Integer> occurrencesByWord = new HashMap<>();
    private final Map<String, String> firstSiteByWord = new HashMap<>();
    private final WrittenWords written = new WrittenWords();

    private final Map<String, Integer> occurrencesByForm = new HashMap<>();

    private int declarations;
    private int proseWords;
    private int gluedRunsRead;

    public LegibilityTally(final CitedWords cited, final IdentifierWords words, final PublishedRuns runs) {
        this.cited = cited;
        this.words = words;
        this.runs = runs;
    }

    public void add(final String site, final String scope, final NameOccurrence occurrence) {
        final NameForm form = occurrence.form();
        if (!form.isProse()) {
            declarations++;
        }
        form.vocabulary().phrasesOf(occurrence.text(), words).forEach(phrase -> {
            gluedRunsRead += phrase.gluedRunsRead();
            if (form.isProse()) {
                proseWords += phrase.words().size();
            }
            occurrencesByForm.merge(form.name(), phrase.words().size(), Integer::sum);
            cite(phrase.words(), site + ":" + occurrence.line());
            record(runs.of(phrase.words()), site + ":" + occurrence.line(), form.isChosenName(),
                    PublishedSourceSets.sourceSetOf(scope));
        });
    }

    /** What λ is taken over: every word as the splitter produced it, whether or not anything reads it. */
    private void cite(final List<String> phrase, final String site) {
        phrase.forEach(word -> {
            occurrencesByWord.merge(word, 1, Integer::sum);
            firstSiteByWord.putIfAbsent(word, site);
        });
    }

    /**
     * What the vocabulary reading ranks: the same phrase with each published run standing as one word.
     *
     * <p>A word a source set's own layout supplies is not read. {@code PageCursorTest} in
     * {@code src/test/java} says {@code test} because Maven's standard directory layout says so, not because
     * its author chose it, and {@code PhraseTopics} has always refused it on that citation. Asking the same
     * rule here is what keeps one question from having two answers.
     *
     * <p>The two tallies answer different questions and only one of them folds. λ is the share of word
     * occurrences a resource can be cited for, and a run read as one word is still two words written; the
     * vocabulary reading asks what this repository called things, and {@code part of speech} is one thing
     * it called something.
     */
    private void record(final List<String> phrase, final String site, final boolean chosenAsName,
                        final String layoutWord) {
        phrase.stream()
                .filter(word -> !word.equals(layoutWord))
                .forEach(word -> written.saw(word, site, chosenAsName));
    }

    /** Every word the scope wrote, cited or not — what the vocabulary reading ranks. */
    public WrittenWords written() {
        return written;
    }

    /** How many word occurrences each syntactic form contributed — the mix behind every figure below. */
    public Map<String, Integer> wordsByForm() {
        return Map.copyOf(occurrencesByForm);
    }

    public ScopeLegibility reading(final String name, final int files) {
        final Map<String, Set<EvidenceSource>> sourcesByWord = occurrencesByWord.keySet().stream()
                .collect(Collectors.toUnmodifiableMap(Function.identity(), cited::citing));
        return new ScopeLegibility(name, files, counts(sourcesByWord), occurrencesBySource(sourcesByWord),
                soleOccurrencesBySource(sourcesByWord), unread(sourcesByWord), written);
    }

    private OccurrenceCounts counts(final Map<String, Set<EvidenceSource>> sourcesByWord) {
        final int words = occurrencesOf(occurrencesByWord.keySet());
        return new OccurrenceCounts(declarations, words - proseWords, proseWords,
                occurrencesOf(cited(sourcesByWord)), gluedRunsRead, occurrencesByWord.size(),
                wordsSeenOnce());
    }

    private Map<EvidenceSource, Integer> occurrencesBySource(
            final Map<String, Set<EvidenceSource>> sourcesByWord) {
        final Map<EvidenceSource, Integer> bySource = new EnumMap<>(EvidenceSource.class);
        sourcesByWord.forEach((word, sources) ->
                sources.forEach(source -> bySource.merge(source, occurrencesByWord.get(word), Integer::sum)));
        return bySource;
    }

    /** What each resource carries by itself: the occurrences of words it is the only citation for. */
    private Map<EvidenceSource, Integer> soleOccurrencesBySource(
            final Map<String, Set<EvidenceSource>> sourcesByWord) {
        final Map<EvidenceSource, Integer> alone = new EnumMap<>(EvidenceSource.class);
        sourcesByWord.entrySet().stream()
                .filter(word -> word.getValue().size() == 1)
                .forEach(word -> alone.merge(word.getValue().iterator().next(),
                        occurrencesByWord.get(word.getKey()), Integer::sum));
        return alone;
    }

    private UnreadWords unread(final Map<String, Set<EvidenceSource>> sourcesByWord) {
        final Set<String> unread = sourcesByWord.entrySet().stream()
                .filter(word -> word.getValue().isEmpty())
                .map(Map.Entry::getKey)
                .collect(Collectors.toUnmodifiableSet());
        return new UnreadWords(
                unread.stream().collect(Collectors.toUnmodifiableMap(Function.identity(), occurrencesByWord::get)),
                unread.stream().collect(Collectors.toUnmodifiableMap(Function.identity(), firstSiteByWord::get)));
    }

    private static Set<String> cited(final Map<String, Set<EvidenceSource>> sourcesByWord) {
        return sourcesByWord.entrySet().stream()
                .filter(word -> !word.getValue().isEmpty())
                .map(Map.Entry::getKey)
                .collect(Collectors.toUnmodifiableSet());
    }

    private int occurrencesOf(final Collection<String> surfaces) {
        return surfaces.stream().mapToInt(occurrencesByWord::get).sum();
    }

    private int wordsSeenOnce() {
        return (int) occurrencesByWord.values().stream().filter(occurrences -> occurrences == 1).count();
    }
}
