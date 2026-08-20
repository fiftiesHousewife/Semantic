package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * Places a repository against OpenAlex's topics three times: once against each statement the publisher
 * makes about a topic, and once against both together as the reading takes them today.
 *
 * <p>OpenAlex states two accounts of a topic and arXiv states one. All 4,516 of the descriptions open with
 * the same four words, and the words appearing in more than half of them carry a third of every
 * description's word tokens — {@code cluster}, {@code papers}, {@code topics}, {@code focuses}. The
 * dictionary labels those, so a share of every topic's reading is the template rather than the subject. The
 * keywords carry no template. Which of the two places a repository better is what this is run to find out.
 *
 * <p>The expected result is read off the <b>published</b> account whichever statement is being placed
 * against, so one expectation scores all three readings. Scoring each against its own account would ask
 * three different questions and report them as one.
 *
 * <p>Score is {@code 1 − bits}, so nearer ranks higher and the statistic reads the way it does on a phrase
 * match. A divergence scores every topic, so the whole-scheme and topics-reached figures coincide here;
 * they differ on a phrase match, where most topics score nothing.
 */
public final class PublishedStatementProbe {

    /** OpenAlex writes the prose first and the keywords second, which is the order the extraction keeps. */
    private static final int PROSE = 0;

    private static final int KEYWORDS = 1;

    /** Enough pairs that the mean is steady to a thousandth, few enough not to cost a second reading. */
    private static final int PAIRS = 20000;

    private static final int COMMONEST = 8;

    private PublishedStatementProbe() {
    }

    public static void main(final String[] args) {
        if (args.length < 1 || args[0].isBlank()) {
            throw new IllegalArgumentException("Usage: PublishedStatementProbe <domain token>. The token is "
                    + "the expected result and is stated by the project's own publisher, never chosen here "
                    + "— an Apache DOAP category token such as content, build-management or security. A "
                    + "second argument draws the null at that seed instead of the reading's own.");
        }
        final String token = args[0];
        final long seed = args.length > 1 ? Long.parseLong(args[1]) : TreeReading.SEED;
        final List<SkosConcept> published = OpenAlexTopics.fromClasspath().described();
        final StatedDomainToken expectation = new StatedDomainToken(token);
        final Map<String, ProbabilityOfSuperiority.Expectation> marked = published.stream()
                .collect(Collectors.toMap(SkosConcept::concept, expectation::of));

        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final TopicDistribution read = reading.themes().repository().comparison();
        System.out.printf("%n%s%n", reading.root());
        System.out.printf("%d topics described; the expectation marks %d of them%n", published.size(),
                marked.values().stream()
                        .filter(met -> met == ProbabilityOfSuperiority.Expectation.MEETS_IT).count());
        System.out.printf("expected result: a topic stating %s outranks one that does not%n", token);

        System.out.printf("the null is drawn at seed %d%n", seed);
        place("both statements, as the reading takes them", published, read, marked, token, seed);
        place("the prose statement alone", statedAs(published, PROSE), read, marked, token, seed);
        place("the keyword statement alone", statedAs(published, KEYWORDS), read, marked, token, seed);
    }

    /**
     * One account of every topic, restated as the whole of what the topic says. A topic the publisher gives
     * only one account of yields nothing at the second, which is a fact about that topic rather than a gap.
     */
    private static List<SkosConcept> statedAs(final List<SkosConcept> topics, final int account) {
        return topics.stream()
                .filter(topic -> topic.definitions().size() > account)
                .map(topic -> restated(topic, topic.definitions().get(account)))
                .toList();
    }

    private static SkosConcept restated(final SkosConcept topic, final String account) {
        return new SkosConcept(topic.concept(), topic.prefLabel(), topic.altLabel(), topic.broader(),
                topic.kind(), topic.module(), account, topic.note());
    }

    private static void place(final String heading, final List<SkosConcept> subjects,
                              final TopicDistribution read,
                              final Map<String, ProbabilityOfSuperiority.Expectation> marked,
                              final String token, final long seed) {
        final List<SubjectTopics> areas = SubjectAreas.fromClasspath().of(subjects);
        System.out.printf("%n== %s — %d of %d topics read%n", heading, areas.size(), subjects.size());
        census(areas, seed);
        final List<SubjectPlacement.Placement> placed = SubjectPlacement.byDivergence().of(read, areas);
        final SubjectNull.Chance chance = SubjectNull.seeded(seed).of(placed.getFirst().bits(),
                read, subjects.stream().map(SkosConcept::definition).toList());
        System.out.printf("  nearest %s %.4f bits; chance reaches %.4f — %s%n",
                placed.getFirst().label(), placed.getFirst().bits(), chance.chanceNearest(),
                chance.standsApart() ? "STANDS APART" : "within chance");
        System.out.printf("  carried by %s%n", String.join(", ", placed.getFirst().carriedBy().stream()
                .map(SharedMass.Shared::topic).toList()));
        new SuperiorityFigures(token).print(scored(placed, marked));
    }

    /**
     * What a statement yields before any repository is placed against it: how many labels a topic reads as,
     * how far two topics stand apart on average, and the labels most topics carry.
     *
     * <p>A scheme whose subjects all read alike cannot rank them however good the repository's reading is,
     * and a label nearly every subject carries separates none of them. Both are properties of the scheme
     * alone, so they are measured without a repository and hold for every repository.
     */
    private static void census(final List<SubjectTopics> areas, final long seed) {
        final Map<String, Long> carrying = areas.stream()
                .flatMap(area -> area.distribution().topics().stream())
                .collect(Collectors.groupingBy(label -> label, Collectors.counting()));
        System.out.printf("  %.1f labels per topic; %d distinct labels; topics stand %.4f bits apart%n",
                areas.stream().mapToInt(area -> area.distribution().topics().size()).average().orElseThrow(),
                carrying.size(), apartness(areas, seed));
        System.out.printf("  commonest labels: %s%n", carrying.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(COMMONEST)
                .map(label -> String.format("%s %.0f%%", label.getKey(),
                        100.0 * label.getValue() / areas.size()))
                .collect(Collectors.joining(", ")));
    }

    /** The mean divergence between two topics of the scheme, over pairs drawn at the stated seed. */
    private static double apartness(final List<SubjectTopics> areas, final long seed) {
        final java.util.Random draws = new java.util.Random(seed);
        final JensenShannon divergence = new JensenShannon();
        return java.util.stream.IntStream.range(0, PAIRS)
                .mapToDouble(pair -> divergence.divergence(
                        areas.get(draws.nextInt(areas.size())).distribution(),
                        areas.get(draws.nextInt(areas.size())).distribution()))
                .average().orElseThrow();
    }

    /** Nearer ranks higher, and a divergence is bounded at one bit, so its complement is the score. */
    private static List<ProbabilityOfSuperiority.Scored> scored(
            final List<SubjectPlacement.Placement> placed,
            final Map<String, ProbabilityOfSuperiority.Expectation> marked) {
        return placed.stream()
                .map(place -> new ProbabilityOfSuperiority.Scored(place.label(), 1.0 - place.bits(),
                        marked.getOrDefault(place.concept(),
                                ProbabilityOfSuperiority.Expectation.DOES_NOT)))
                .toList();
    }
}
