package org.fifties.housewife.codesemantics.engine.reading;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.engine.parse.NameForm;
import org.fifties.housewife.codesemantics.engine.parse.NameOccurrence;
import org.fifties.housewife.codesemantics.model.EvidenceSource;

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

    private final Map<String, Integer> occurrencesByWord = new HashMap<>();
    private final Map<String, String> firstSiteByWord = new HashMap<>();

    private final Map<String, Integer> occurrencesByForm = new HashMap<>();

    private int declarations;
    private int proseWords;
    private int gluedRunsRead;

    public LegibilityTally(final CitedWords cited, final IdentifierWords words) {
        this.cited = cited;
        this.words = words;
    }

    public void add(final String site, final NameOccurrence occurrence) {
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
            phrase.words().forEach(word -> {
                occurrencesByWord.merge(word, 1, Integer::sum);
                firstSiteByWord.putIfAbsent(word, site + ":" + occurrence.line());
            });
        });
    }

    /** How many word occurrences each syntactic form contributed — the mix behind every figure below. */
    public Map<String, Integer> wordsByForm() {
        return Map.copyOf(occurrencesByForm);
    }

    public ScopeLegibility reading(final String name, final int files) {
        final Map<String, Set<EvidenceSource>> sourcesByWord = occurrencesByWord.keySet().stream()
                .collect(Collectors.toUnmodifiableMap(Function.identity(), cited::citing));
        return new ScopeLegibility(name, files, counts(sourcesByWord), occurrencesBySource(sourcesByWord),
                soleOccurrencesBySource(sourcesByWord), unread(sourcesByWord));
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
