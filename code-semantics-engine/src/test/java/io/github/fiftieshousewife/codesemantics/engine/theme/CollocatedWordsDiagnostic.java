package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
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
 * What reading a name's words in the order they were written buys: which runs of adjacent words a topical
 * resource publishes as one entry, how often this repository writes them, and what the resource says about
 * the run that it does not say about the words apart.
 *
 * <p>It is the measurement the phrase reading is judged on, and it prints the runs rather than a summary
 * statistic, because the question the plan asks — whether a published run is a phrase or two unrelated words
 * written next to each other — is one a reader answers by looking at a list.
 *
 * <p>The last section is what the edge rule removes. A collocation dictionary states {@code to the} and
 * {@code out of} beside {@code noun phrase}, and those runs are printed here with what they would have voted
 * for, so the rule that refuses them can be read against the evidence rather than taken on trust.
 */
@Tag("diagnostic")
class CollocatedWordsDiagnostic {

    private static final int RUNS_PRINTED = 45;

    private final IdentifierWords words = IdentifierWords.fromClasspath();
    private final PublishedPhrases published = PublishedPhrases.fromClasspath();
    private final ContentWords content = ContentWords.fromClasspath();
    private final CollocatedWords collocated = new CollocatedWords(published, content);
    private final TopicCitations citations = TopicCitations.fromClasspath();

    @Test
    void countsThePublishedRunsThisRepositoryWritesAndWhatTheySay() {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final Path root = tree.root();
        final ParsedRepository parsed = tree.parsed();

        final Counted everything = counted(parsed, form -> true);

        report(root.getFileName() + " — every phrase", everything);
        report(root.getFileName() + " — names the author chose", counted(parsed, NameForm::isChosenName));
        report(root.getFileName() + " — prose", counted(parsed, NameForm::isProse));
        reportRefusedAtTheEdge(parsed);

        assertAll(
                () -> assertThat(published.longestRun())
                        .as("the walk is bounded by the longest run the resources themselves publish")
                        .isGreaterThan(1),
                () -> assertThat(everything.phrases())
                        .as("a repository of names has phrases to read").isPositive(),
                () -> assertThat(everything.runsWritten().keySet())
                        .as("every run counted is one a resource publishes")
                        .allMatch(published::states));
    }

    private record Counted(int phrases, int carryingARun, Map<String, Integer> runsWritten) { }

    private Counted counted(final ParsedRepository parsed, final Predicate<NameForm> forms) {
        final List<List<String>> read = phrasesIn(parsed, forms).map(collocated::of).toList();
        final Map<String, Integer> runsWritten = new HashMap<>();
        read.stream().flatMap(phrase -> phrase.stream().filter(published::states))
                .forEach(run -> runsWritten.merge(run, 1, Integer::sum));
        return new Counted(read.size(),
                (int) read.stream().filter(phrase -> phrase.stream().anyMatch(published::states)).count(),
                runsWritten);
    }

    /**
     * Every published run this repository writes whose first or last word carries no subject on its own —
     * the ones the edge rule refuses, counted the same way so the two lists can be read side by side.
     */
    private void reportRefusedAtTheEdge(final ParsedRepository parsed) {
        final Map<String, Integer> refused = new HashMap<>();
        phrasesIn(parsed, form -> true)
                .flatMap(phrase -> IntStream.range(0, phrase.size())
                        .boxed()
                        .flatMap(from -> IntStream.rangeClosed(2, Math.min(published.longestRun(),
                                        phrase.size() - from))
                                .mapToObj(run -> written(phrase, from, from + run))))
                .filter(published::states)
                .filter(run -> !edgesCarrySubject(run))
                .forEach(run -> refused.merge(run, 1, Integer::sum));
        System.out.printf("%n  refused at the edge: %d distinct runs, %d occurrences%n",
                refused.size(), refused.values().stream().mapToInt(Integer::intValue).sum());
        print(refused);
    }

    private boolean edgesCarrySubject(final String run) {
        final List<String> parts = List.of(run.split(PublishedPhrases.JOINER, -1));
        return content.lemmaOf(parts.getFirst()).isPresent()
                && content.lemmaOf(parts.getLast()).isPresent();
    }

    private static String written(final List<String> phrase, final int from, final int to) {
        return String.join(PublishedPhrases.JOINER, phrase.subList(from, to)).toLowerCase(Locale.ROOT);
    }

    private Stream<List<String>> phrasesIn(final ParsedRepository parsed, final Predicate<NameForm> forms) {
        return occurrencesIn(parsed).stream()
                .filter(occurrence -> forms.test(occurrence.form()))
                .flatMap(occurrence -> occurrence.form().vocabulary()
                        .phrasesOf(occurrence.text(), words).stream())
                .map(IdentifierReading::words);
    }

    private static List<NameOccurrence> occurrencesIn(final ParsedRepository parsed) {
        return parsed.files().stream().flatMap(file -> file.occurrences().stream()).toList();
    }

    private void report(final String reading, final Counted counted) {
        System.out.printf("%n%s: %d phrases, %d carrying a published run (%.2f%%), %d distinct runs,"
                        + " over %d published entries reaching %d words%n",
                reading, counted.phrases(), counted.carryingARun(),
                100.0 * counted.carryingARun() / counted.phrases(), counted.runsWritten().size(),
                published.size(), published.longestRun());
        print(counted.runsWritten());
    }

    private void print(final Map<String, Integer> runs) {
        runs.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry::getKey))
                .limit(RUNS_PRINTED)
                .forEach(run -> System.out.printf("  %5d  %-28s %s%n", run.getValue(), run.getKey(),
                        saidOf(run.getKey())));
    }

    /** What the resources say about the run as a run, which is what reading it as one can be worth. */
    private String saidOf(final String run) {
        final List<TopicVote> votes = citations.of(run);
        return votes.isEmpty() ? "(nothing said of the run)"
                : votes.stream().map(TopicVote::topic).distinct().sorted().toList().toString();
    }
}
