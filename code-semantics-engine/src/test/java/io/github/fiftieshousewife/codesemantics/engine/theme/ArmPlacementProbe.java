package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;

/**
 * Every arm of the reading placed against every bundled subject scheme, printed side by side.
 *
 * <p>Two arms reach a subject and only one of them used to. The vocabulary arm reads the words a repository
 * declares; the concept arm reads the publisher's prose about the concepts it writes. Each becomes a
 * distribution over the same dictionary topics, so one placement compares both, and each is drawn against
 * its own scheme's own null.
 *
 * <p>Nothing here votes. It prints, and the expected result it prints against was written down before it was
 * built.
 */
public final class ArmPlacementProbe {

    /** The topics recorded as this repository's expected result, before any of this existed. */
    private static final List<String> EXPECTED = List.of("linguistics and terminology studies",
            "Semantic Web and Ontologies", "Natural Language Processing Techniques");

    private static final int TOP = 10;

    private ArmPlacementProbe() {
    }

    public static void main(final String[] args) {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        System.out.printf("Reading %s%n%n", reading.root());

        final ConceptTopics concepts = ConceptTopics.fromClasspath();
        final List<Arm> arms = new java.util.ArrayList<>();
        arms.add(new Arm("vocabulary", reading.themes().repository().comparison(), ""));
        java.util.stream.Stream.of(MatchedTaxonomies.values()).forEach(taxonomy -> {
            final var matched = reading.terms(taxonomy).matched();
            arms.add(new Arm("concepts " + taxonomy.index().source(), concepts.of(matched),
                    String.format(Locale.ROOT, "%d of %d matched concepts state prose",
                            concepts.describedAmong(matched), matched.sightings().stream()
                                    .mapToInt(sighting -> sighting.concepts().size()).sum())));
        });
        arms.forEach(arm -> report(arm, TreeReading.SEED));
        agreement(arms);
    }

    /**
     * One arm's reading, taken once. Each placement against OpenAlex draws a 999-resample null over 4,516
     * subjects, so a caller that asked for the same field twice would pay for it twice.
     */
    private record Arm(String name, TopicDistribution reading, String note) {
    }

    private static void report(final Arm arm, final long seed) {
        final TopicDistribution read = arm.reading();
        System.out.printf("== %-18s %3d topics%s%n", arm.name(), read.topics().size(),
                arm.note().isBlank() ? "" : "   (" + arm.note() + ")");
        if (read.isEmpty()) {
            System.out.printf("   ABSTAINS — nothing to place%n%n");
            return;
        }
        placed("arXiv", PlacedField.ofArxiv(read, seed));
        final PlacedField openAlex = PlacedField.ofOpenAlex(read, seed);
        placed("OpenAlex", openAlex);
        expected(openAlex);
        System.out.println();
    }

    private static void placed(final String scheme, final PlacedField field) {
        System.out.printf("   %-9s broad  %-44s %.4f  chance %.4f  %s%n", scheme,
                field.nearestArchive().label(), field.nearestArchive().bits(),
                field.archiveChance().chanceNearest(), verdict(field.archiveChance().standsApart()));
        System.out.printf("   %-9s leaf   %-44s %.4f  chance %.4f  %s%n", scheme,
                field.nearestCategory().label(), field.nearestCategory().bits(),
                field.categoryChance().chanceNearest(), verdict(field.categoryChance().standsApart()));
    }

    /**
     * Whether any of the three topics recorded in advance reaches the top ten, and how many do. The count
     * matters because three chances is three times the licence one topic would give.
     */
    private static void expected(final PlacedField field) {
        final List<String> top = field.categories().stream().limit(TOP)
                .map(SubjectPlacement.Placement::label).toList();
        final List<String> hit = EXPECTED.stream().filter(top::contains).toList();
        System.out.printf("   expected  %d of %d in the top %d%s%n", hit.size(), EXPECTED.size(), TOP,
                hit.isEmpty() ? "" : " — " + String.join(", ", hit));
        EXPECTED.forEach(topic -> System.out.printf("      %-44s %s%n", topic, rankOf(field, topic)));
    }

    private static String rankOf(final PlacedField field, final String topic) {
        final List<SubjectPlacement.Placement> placed = field.categories();
        return java.util.stream.IntStream.range(0, placed.size())
                .filter(place -> placed.get(place).label().equals(topic))
                .mapToObj(place -> String.format(Locale.ROOT, "%d of %d", place + 1, placed.size()))
                .findFirst()
                .orElse("not reached");
    }

    /**
     * How far the arms agree, over the topics all of them place mass in. Two arms that rank alike are one
     * arm read twice, and combining them would state a corroboration neither earned.
     */
    private static void agreement(final List<Arm> arms) {
        System.out.println("== agreement between the arms, Spearman's rho");
        final List<TopicDistribution> read = arms.stream().map(Arm::reading).toList();
        for (int first = 0; first < arms.size(); first++) {
            for (int second = first + 1; second < arms.size(); second++) {
                System.out.printf("   %-11s %-11s %s%n", arms.get(first).name(), arms.get(second).name(),
                        correlation(read.get(first), read.get(second)));
            }
        }
    }

    private static String correlation(final TopicDistribution one, final TopicDistribution other) {
        final long shared = one.topics().stream().filter(other.topics()::contains).count();
        return new RankCorrelation().between(one, other).stream()
                .mapToObj(rho -> String.format(Locale.ROOT, "%.4f over %d topics either holds, %d both",
                        rho, TopicDistribution.support(one, other).size(), shared))
                .findFirst()
                .orElse("no order to speak of");
    }

    private static String verdict(final boolean standsApart) {
        return standsApart ? "stands apart" : "WITHIN CHANCE";
    }
}
