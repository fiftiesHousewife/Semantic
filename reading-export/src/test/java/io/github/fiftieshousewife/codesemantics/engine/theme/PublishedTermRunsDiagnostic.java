package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.bi.lexicon.WiktionaryTopics;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * What the bundled term vocabularies would add to the unit a reading counts in: how many runs they state
 * that the two topical dictionaries do not, how many of those a repository writes, how many of those any
 * topical resource can then say anything about, and how many stand inside a published subject's own
 * description.
 *
 * <p>No reading runs on this index; it is built here so the trade can be priced without moving a figure. A
 * run a term vocabulary states and no dictionary labels is counted in the denominator and votes nothing, so
 * the words inside it stop voting. The last measurement is the one that decides it: an arXiv subject
 * description is a few dozen units long, so a run absorbed there is a large share of that subject's whole
 * signal.
 */
@Tag("diagnostic")
class PublishedTermRunsDiagnostic {

    private static final int RUNS_PRINTED = 40;

    private final IdentifierWords words = IdentifierWords.fromClasspath();
    private final TopicCitations citations = TopicCitations.fromClasspath();
    private final Set<String> fromDictionaries = dictionaryRuns();
    private final Set<String> fromVocabularies = PublishedTermRuns.fromClasspath().written();
    private final Set<String> onlyTheVocabularies = fromVocabularies.stream()
            .filter(run -> !fromDictionaries.contains(run))
            .collect(Collectors.toUnmodifiableSet());
    private final CollocatedWords collocated = new CollocatedWords(
            new PublishedPhrases(pooled(fromDictionaries, fromVocabularies)),
            ContentWords.fromClasspath());

    @Test
    void countsWhatTheTermVocabulariesAddToTheUnit() {
        System.out.printf("%nthe index%n  dictionaries %d runs, longest %d%n"
                        + "  term vocabularies %d runs, longest %d%n"
                        + "  the vocabularies add %d the dictionaries do not state%n",
                fromDictionaries.size(), longestIn(fromDictionaries),
                fromVocabularies.size(), longestIn(fromVocabularies), onlyTheVocabularies.size());

        final ParsedRepository parsed = TreeReading.ofTheCloneUnderReading().parsed();
        final Map<String, Integer> read = new HashMap<>();
        parsed.files().stream()
                .flatMap(file -> file.occurrences().stream())
                .flatMap(occurrence -> phrasesOf(occurrence).stream())
                .map(reading -> collocated.of(reading.words()))
                .flatMap(phrase -> phrase.stream().filter(PublishedTermRunsDiagnostic::isARun))
                .forEach(run -> read.merge(run, 1, Integer::sum));
        final Map<String, Integer> newlyRead = restrictedToTheVocabularies(read);

        report("runs this repository writes", read);
        report("runs only a term vocabulary states", newlyRead);
        report("of those, runs no topical resource labels", unlabelled(newlyRead));

        assertAll(
                () -> assertThat(onlyTheVocabularies)
                        .as("the vocabularies state runs the dictionaries do not").isNotEmpty(),
                () -> assertThat(onlyTheVocabularies)
                        .as("no reading runs on this index")
                        .noneMatch(PublishedPhrases.fromClasspath()::states));
    }

    @Test
    void countsWhatTheSameUnitAbsorbsInThePublishedSubjectDescriptions() {
        final List<List<String>> descriptions = ArxivSubjects.fromClasspath().concepts().stream()
                .flatMap(subject -> subject.definitions().stream())
                .map(description -> collocated.of(words.of(description).words()))
                .toList();
        final Map<String, Integer> absorbed = new HashMap<>();
        descriptions.stream()
                .flatMap(List::stream)
                .filter(onlyTheVocabularies::contains)
                .forEach(run -> absorbed.merge(run, 1, Integer::sum));

        final int unitsRead = descriptions.stream().mapToInt(List::size).sum();
        System.out.printf("%narXiv subject descriptions: %d, %d units read, %d units the mean description%n",
                descriptions.size(), unitsRead, unitsRead / descriptions.size());
        report("runs a term vocabulary states inside a published subject description", absorbed);

        assertThat(unitsRead).isPositive();
    }

    private Map<String, Integer> restrictedToTheVocabularies(final Map<String, Integer> runs) {
        return runs.entrySet().stream()
                .filter(run -> onlyTheVocabularies.contains(run.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /** The runs of these that no topical resource says anything about, which are the ones that vote nothing. */
    private Map<String, Integer> unlabelled(final Map<String, Integer> runs) {
        return runs.entrySet().stream()
                .filter(run -> citations.of(run.getKey()).isEmpty())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private List<IdentifierReading> phrasesOf(final NameOccurrence occurrence) {
        return occurrence.form().vocabulary().phrasesOf(occurrence.text(), words);
    }

    private static boolean isARun(final String unit) {
        return unit.contains(PublishedPhrases.JOINER);
    }

    private static void report(final String heading, final Map<String, Integer> runs) {
        System.out.printf("%n%s: %d distinct, %d occurrences%n", heading, runs.size(),
                runs.values().stream().mapToInt(Integer::intValue).sum());
        runs.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(RUNS_PRINTED)
                .forEach(run -> System.out.printf("    %-44s %d%n", run.getKey(), run.getValue()));
    }

    private static int longestIn(final Set<String> runs) {
        return runs.stream().mapToInt(run -> run.split(PublishedPhrases.JOINER, -1).length).max().orElse(1);
    }

    private static Set<String> pooled(final Set<String> dictionaries, final Set<String> vocabularies) {
        return Stream.concat(dictionaries.stream(), vocabularies.stream())
                .collect(Collectors.toUnmodifiableSet());
    }

    private static Set<String> dictionaryRuns() {
        return Stream.concat(WordNetLexicon.fromClasspath().labelledCollocations().stream(),
                        WiktionaryTopics.fromClasspath().collocations().stream())
                .map(entry -> entry.toLowerCase(Locale.ROOT))
                .collect(Collectors.toUnmodifiableSet());
    }
}
