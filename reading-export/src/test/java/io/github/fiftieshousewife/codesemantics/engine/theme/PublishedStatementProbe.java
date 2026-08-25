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
 * description's word areas — {@code cluster}, {@code papers}, {@code topics}, {@code focuses}. The
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

    /** Enough of the ranking to see what the reading would report. */
    private static final int SHOWN = 15;

    private static final int TEN = 10;

    private PublishedStatementProbe() {
    }

    public static void main(final String[] args) {
        if (args.length < 1 || args[0].isBlank()) {
            throw new IllegalArgumentException("Usage: PublishedStatementProbe <subject area>. The area is a "
                    + "subject area the scheme itself states — a field such as Computer Science or a subfield "
                    + "such as Finance — recorded in the evaluation manifest before the reading runs. A "
                    + "second argument draws the null at that seed instead of the reading's own.");
        }
        final String area = args[0];
        final long seed = args.length > 1 ? Long.parseLong(args[1]) : TreeReading.SEED;
        final List<SkosConcept> published = OpenAlexTopics.fromClasspath().described();
        final PlacedUnder expectation = PlacedUnder.in(OpenAlexTopics.fromClasspath(), area);
        final Map<String, ProbabilityOfSuperiority.Expectation> marked = published.stream()
                .collect(Collectors.toMap(SkosConcept::concept, expectation::of));

        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final TopicDistribution read = reading.themes().repository().comparison();
        System.out.printf("%n%s%n", reading.root());
        System.out.printf("%d topics described; the expectation marks %d of them%n", published.size(),
                marked.values().stream()
                        .filter(met -> met == ProbabilityOfSuperiority.Expectation.MEETS_IT).count());
        System.out.printf("expected result: a topic under %s outranks one that is not%n", area);

        System.out.printf("the null is drawn at seed %d%n", seed);
        place("both statements, as the reading takes them", published, read, marked, area, seed);
        place("the prose statement alone", statedAs(published, PROSE), read, marked, area, seed);
        place("the keyword statement alone", statedAs(published, KEYWORDS), read, marked, area, seed);
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
                              final String area, final long seed) {
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
        ranked(placed, marked, chance.chanceNearest(), area);
        new SuperiorityFigures(area).print(scored(placed, marked));
    }

    /**
     * The nearest subjects in order, with the band chance cannot separate marked off, so a reader can see
     * what the reading would actually report rather than one label and a statistic over four thousand rows.
     */
    private static void ranked(final List<SubjectPlacement.Placement> placed,
                               final Map<String, ProbabilityOfSuperiority.Expectation> marked,
                               final double chanceNearest, final String area) {
        final long band = placed.stream().filter(one -> one.bits() < chanceNearest).count();
        System.out.printf("  %d nearer than chance; the %d nearest:%n", band, SHOWN);
        consolidation(placed, chanceNearest);
        placed.stream().limit(SHOWN).forEach(one -> System.out.printf("     %-56s %.4f%s%s%n", one.label(),
                one.bits(), one.bits() < chanceNearest ? "  in band" : "        ",
                marked.getOrDefault(one.concept(), ProbabilityOfSuperiority.Expectation.DOES_NOT)
                        == ProbabilityOfSuperiority.Expectation.MEETS_IT ? "  <- under " + area : ""));
    }

    /**
     * Where the band and the ten nearest sit in the publisher's own hierarchy.
     *
     * <p>The band is the subjects the instrument cannot separate, so the question is whether they agree
     * about anything coarser. If they concentrate in one subfield the reading has an answer it cannot state
     * at topic level; if they only agree at field level, that is the level it can speak at.
     */
    private static void consolidation(final List<SubjectPlacement.Placement> placed,
                                      final double chanceNearest) {
        final OpenAlexTopics scheme = OpenAlexTopics.fromClasspath();
        final List<SubjectPlacement.Placement> band = placed.stream()
                .filter(one -> one.bits() < chanceNearest).toList();
        concentration("band", band.isEmpty() ? placed.stream().limit(SHOWN).toList() : band, scheme);
        concentration("ten nearest", placed.stream().limit(TEN).toList(), scheme);
    }

    private static void concentration(final String of, final List<SubjectPlacement.Placement> among,
                                      final OpenAlexTopics scheme) {
        final Map<String, Long> subfields = groupedBy(among, scheme, 1);
        final Map<String, Long> fields = groupedBy(among, scheme, 2);
        System.out.printf("  %-12s of %d: %s%n", of, among.size(), leading(subfields, among.size()));
        System.out.printf("  %-12s          %s%n", "", leading(fields, among.size()));
    }

    /** The label a topic rolls up to, walked the stated number of steps up the publisher's own chain. */
    private static Map<String, Long> groupedBy(final List<SubjectPlacement.Placement> among,
                                               final OpenAlexTopics scheme, final int steps) {
        return among.stream().collect(Collectors.groupingBy(one -> {
            String at = one.concept();
            for (int step = 0; step < steps; step++) {
                at = scheme.conceptOf(at).broader();
            }
            return scheme.conceptOf(at).prefLabel();
        }, Collectors.counting()));
    }

    private static String leading(final Map<String, Long> grouped, final int of) {
        return grouped.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .map(one -> String.format("%s %d/%d", one.getKey(), one.getValue(), of))
                .collect(Collectors.joining(", "));
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
