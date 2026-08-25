package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.bi.lexicon.CsoTopics;
import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.UnreadPhrases.UnreadPhrase;

/**
 * How much of what the dictionaries could not read a subject scheme states in its own words.
 *
 * <p>The reading places a run by asking a dictionary what its words mean. Where no dictionary carries them
 * the run is unread, and a scheme's own vocabulary is a second place to ask: {@code trade date} is in no
 * general dictionary and is a term some publisher indexes research by. This prints what each bundled scheme
 * would reach, side by side, so a decision to read a scheme as a vocabulary is taken against the runs it
 * would actually buy.
 *
 * <p>Nothing here votes and no published figure moves. It counts.
 *
 * <p>Runs are counted twice over: distinct runs, and the occurrences behind them. The two disagree, and a
 * scheme reaching many rare runs and one reaching few common ones are different findings.
 */
public final class UnplacedRunProbe {

    private static final int SHOWN = 14;

    private UnplacedRunProbe() {
    }

    /** One scheme's reach over the runs nothing read. */
    private record Reach(String scheme, int states, int runs, int occurrences, List<UnreadPhrase> biggest) {
    }

    public static void main(final String[] arguments) {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final List<UnreadPhrase> unplaced = reading.themes().workings().unread().all();
        final IdentifierWords identifiers = IdentifierWords.fromClasspath();

        System.out.printf("%s: %d runs nothing read, %d occurrences%n", reading.root().getFileName(),
                unplaced.size(), unplaced.stream().mapToInt(UnreadPhrase::occurrences).sum());
        byReason(unplaced);

        schemes(identifiers).forEach((scheme, runs) -> print(reachOf(scheme, runs, unplaced), unplaced));
    }

    /** The three bundled schemes, each as the runs of words it publishes. */
    private static Map<String, PublishedRuns> schemes(final IdentifierWords identifiers) {
        final OpenAlexTopics openAlex = OpenAlexTopics.fromClasspath();
        return new java.util.LinkedHashMap<>(Map.of(
                "CSO topics", new PublishedRuns(identifiers, CsoTopics.fromClasspath().concepts()),
                "OpenAlex topics", new PublishedRuns(identifiers, openAlex.concepts()),
                "OpenAlex keywords",
                new PublishedRuns(identifiers, new PublishedKeywords().in(openAlex.described())),
                "arXiv categories", new PublishedRuns(identifiers, ArxivSubjects.fromClasspath().concepts())));
    }

    private static Reach reachOf(final String scheme, final PublishedRuns published,
                                 final List<UnreadPhrase> unplaced) {
        final List<UnreadPhrase> reached = unplaced.stream()
                .filter(run -> !published.statedBy(run.phrase()).isEmpty())
                .toList();
        return new Reach(scheme, published.size(), reached.size(),
                reached.stream().mapToInt(UnreadPhrase::occurrences).sum(),
                reached.stream().limit(SHOWN).toList());
    }

    private static void print(final Reach reach, final List<UnreadPhrase> unplaced) {
        final int occurrences = unplaced.stream().mapToInt(UnreadPhrase::occurrences).sum();
        System.out.printf("%n== %s — %d runs published%n", reach.scheme(), reach.states());
        System.out.printf("   reaches %d of %d runs (%.2f%%), %d of %d occurrences (%.2f%%)%n",
                reach.runs(), unplaced.size(), 100.0 * reach.runs() / unplaced.size(),
                reach.occurrences(), occurrences, 100.0 * reach.occurrences() / occurrences);
        reach.biggest().forEach(run -> System.out.printf("      %6d  %-40s %s%n",
                run.occurrences(), run.phrase(), run.reason()));
    }

    private static void byReason(final List<UnreadPhrase> unplaced) {
        java.util.Arrays.stream(UnreadReason.values()).forEach(reason -> {
            final List<UnreadPhrase> runs = unplaced.stream()
                    .filter(run -> run.reason() == reason).toList();
            System.out.printf("   %-28s %5d runs, %7d occurrences%n", reason, runs.size(),
                    runs.stream().mapToInt(UnreadPhrase::occurrences).sum());
        });
    }
}
