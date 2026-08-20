package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopicSizes;
import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.RegisteredFormats;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.JavaSourceScopes;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.InjectedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;
import io.github.fiftieshousewife.codesemantics.engine.term.TermSighting;

/**
 * Places the repository under reading among OpenAlex's topics by the runs of words it declares, rather than
 * by comparing two distributions over dictionary labels.
 *
 * <p>The scheme's own keywords are the matchable side — a publisher stating {@code Word Sense
 * Disambiguation} has vouched for the run — so the existing term matcher reads a subject scheme with
 * nothing new written for it.
 *
 * <p>The expected result is stated as a rank rather than as a named topic: given the Apache DOAP category
 * token the project publishes for itself, do the topics whose own account states that token outrank the
 * topics that do not? Nobody here picks a winner, and the bar is fixed at 0.5 by the statistic's own
 * definition.
 *
 * <p>Three readings are printed rather than one, because which of them to vote on is the open question and
 * a probe that answered it silently would have decided it. Every match, the matches the branch rule
 * corroborates, and the runs of more than one word.
 *
 * <p>Each is printed under both scorings for the same reason. Summed occurrence mass ranks a topic by how
 * often its keywords were written; two shares rank it by how many of them were written. Which one places a
 * repository better is what the probe is run to find out.
 *
 * <p>Two further arms split every match by whether the IANA media type registry states each of its words as
 * a format name. A repository that parses a format writes that format's name as freely as one that studies
 * it, so the split says how much of a placement rests on the formats a tool reads. The registry also states
 * ordinary English — {@code index}, {@code collection}, {@code node} — so the split is a measurement and
 * never a vote, and the runs it caught are printed for a reader to argue with.
 */
public final class PhraseMatchedSubjectsProbe {

    private static final String KEYWORDS_OF_OPENALEX = "openalex keywords";

    /** Enough of the caught runs to see what the registry claimed; the count above them is all of them. */
    private static final int FORMAT_RUNS_SHOWN = 25;

    private PhraseMatchedSubjectsProbe() {
    }

    public static void main(final String[] args) throws IOException {
        if (args.length < 1 || args[0].isBlank()) {
            throw new IllegalArgumentException("Usage: PhraseMatchedSubjectsProbe <domain token>. The token "
                    + "is the expected result and is stated by the project's own publisher, never chosen "
                    + "here — an Apache DOAP category token such as content, build-management or security.");
        }
        final String token = args[0];
        final List<SkosConcept> topics = OpenAlexTopics.fromClasspath().described();
        final List<SkosConcept> keywords = new PublishedKeywords().in(topics);

        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final CorroboratedReading reading = CorroboratedReading.of(
                InjectedTerms.of(InjectedTaxonomy.of(keywords, KEYWORDS_OF_OPENALEX), KEYWORDS_OF_OPENALEX),
                keywords, parsed);

        final List<TermSighting> every = reading.every().sightings();
        final List<TermSighting> corroborated = reading.matched().sightings();
        final List<TermSighting> runs = every.stream().filter(sighting -> sighting.length() > 1).toList();

        System.out.printf("%n%s%n", root);
        System.out.printf("%d topics, %d keywords published%n", topics.size(), keywords.size());
        System.out.printf("expected result: a topic stating %s outranks one that does not%n", token);

        final SubjectArms arms = new SubjectArms(topics, keywords, new StatedDomainToken(token), token,
                KeywordSpecificity.fromClasspath());
        arms.print("every match", every);
        breadth(arms, every);
        java.util.Arrays.stream(TermRung.values()).forEach(rung -> {
            final List<TermSighting> found = reading.every().at(rung).sightings();
            arms.print("rung: " + rung.normalisation(), found);
            arms.print("rung: " + rung.normalisation() + ", runs of more than one word",
                    found.stream().filter(sighting -> sighting.length() > 1).toList());
        });
        arms.print("corroborated by the branch rule", corroborated);
        arms.print("runs of more than one word", runs);

        final RegisteredFormats formats = RegisteredFormats.fromClasspath();
        final List<TermSighting> namingFormats = every.stream()
                .filter(sighting -> formats.namesAll(sighting.words()))
                .toList();
        final List<TermSighting> namingNothingRegistered = every.stream()
                .filter(sighting -> !formats.namesAll(sighting.words()))
                .toList();
        printFormatRuns(namingFormats);
        arms.print("every match, less the runs the media type registry names", namingNothingRegistered);
        arms.print("only the runs the media type registry names", namingFormats);
    }

    /**
     * The same match under each candidate use of the counts OpenAlex sizes a topic by, printed beside the
     * unweighted reading so neither is adopted on the strength of being reasonable.
     *
     * <p>The share favours a broad topic and the specificity a narrow one, and they are opposite readings of
     * one figure. The specificity is {@code log(rank + 1) / log(size + 1)} over the topics ordered by the
     * works counted under them, which is the scale {@link WordSpecificity} takes over a frequency list with
     * one difference: the offset. {@code log(rank) / log(size)} gives the top-ranked entry a weight of
     * exactly zero, which silences it rather than weighing it — measured here as Tika reaching 862 topics
     * under that form against 863 under every other. The offset leaves the bound derived from the file's own
     * length and puts the result in {@code (0, 1]}, so the broadest topic still votes at the smallest weight
     * the file can express.
     */
    private static void breadth(final SubjectArms arms, final List<TermSighting> every) {
        final OpenAlexTopicSizes sizes = OpenAlexTopicSizes.fromClasspath();
        final double largest = Math.log(sizes.size() + 1.0);
        final java.util.function.ToDoubleFunction<String> narrowness =
                topic -> Math.log(sizes.rankOf(topic) + 1.0) / largest;
        arms.massWeighted("every match", "summed mass by the topic's share of the literature", every,
                sizes::share);
        arms.massWeighted("every match", "summed mass by how little the topic covers", every, narrowness);
        arms.weighted("every match", "two shares by the topic's share of the literature", every,
                sizes::share);
        arms.weighted("every match", "two shares by how little the topic covers", every, narrowness);
    }

    /** The runs the registry caught, most-written first, so a reader can see what the split rests on. */
    private static void printFormatRuns(final List<TermSighting> namingFormats) {
        System.out.printf("%n== runs every word of which the IANA media type registry states — %d of them%n",
                namingFormats.size());
        namingFormats.stream()
                .sorted(Comparator.comparingDouble(TermSighting::mass).reversed())
                .limit(FORMAT_RUNS_SHOWN)
                .forEach(sighting -> System.out.printf("%-28s %6d occurrences  mass %8.2f  %s%n",
                        sighting.term(), sighting.occurrences(), sighting.mass(), sighting.firstSite()));
    }
}
