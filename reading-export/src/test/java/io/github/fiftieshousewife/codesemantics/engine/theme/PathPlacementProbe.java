package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.term.ConceptTopics;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;

/**
 * Every path of the reading placed against every bundled subject scheme, printed side by side.
 *
 * <p>Two paths reach a subject and only one of them used to. The vocabulary path reads the words a repository
 * declares; the concept path reads the publisher's prose about the concepts it writes. Each becomes a
 * distribution over the same dictionary topics, so one placement compares both, and each is drawn against
 * its own scheme's own null.
 *
 * <p>Nothing here votes. It prints, and the expected result it prints against was written down before it was
 * built.
 */
public final class PathPlacementProbe {

    /** The topics recorded as this repository's expected result, before any of this existed. */
    private static final List<String> EXPECTED = List.of("linguistics and terminology studies",
            "Semantic Web and Ontologies", "Natural Language Processing Techniques");

    private static final int TOP = 10;

    private PathPlacementProbe() {
    }

    public static void main(final String[] args) {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        System.out.printf("Reading %s%n%n", reading.root());

        final ConceptTopics concepts = ConceptTopics.fromClasspath();
        final List<ReadingPath> paths = new java.util.ArrayList<>();
        paths.add(new ReadingPath("vocabulary", reading.themes().repository().comparison(), ""));
        java.util.stream.Stream.of(MatchedTaxonomies.values()).forEach(taxonomy -> {
            final var matched = reading.terms(taxonomy).matched();
            paths.add(new ReadingPath("concepts " + taxonomy.index().source(), concepts.of(matched),
                    String.format(Locale.ROOT, "%d of %d matched concepts state prose",
                            concepts.describedAmong(matched), matched.sightings().stream()
                                    .mapToInt(sighting -> sighting.concepts().size()).sum())));
        });
        paths.forEach(path -> report(path, TreeReading.SEED));
        agreement(paths);
    }

    /**
     * One path's reading, taken once. Each placement against OpenAlex draws a 999-resample null over 4,516
     * subjects, so a caller that asked for the same field twice would pay for it twice.
     */
    private record ReadingPath(String name, TopicDistribution reading, String note) {
    }

    private static void report(final ReadingPath path, final long seed) {
        final TopicDistribution read = path.reading();
        System.out.printf("== %-18s %3d topics%s%n", path.name(), read.topics().size(),
                path.note().isBlank() ? "" : "   (" + path.note() + ")");
        if (read.isEmpty()) {
            System.out.printf("   ABSTAINS — nothing to place%n%n");
            return;
        }
        placed("arXiv", PlacedField.ofArxiv(read, seed));
        final PlacedField openAlex = PlacedField.ofOpenAlex(read, seed);
        placed("OpenAlex", openAlex);
        placed("CSO", PlacedField.ofCso(read, seed));
        expected(openAlex);
        System.out.println();
    }

    /** The field size is printed beside the bar because a chance bar is set by how many subjects it ran over. */
    private static void placed(final String scheme, final PlacedField field) {
        System.out.printf("   %-9s broad  %-44s %.4f  chance %.4f over %4d  %s%n", scheme,
                field.nearestArchive().label(), field.nearestArchive().bits(),
                field.archiveChance().chanceNearest(), field.archives().size(),
                verdict(field.archiveChance().standsApart()));
        System.out.printf("   %-9s leaf   %-44s %.4f  chance %.4f over %4d  %s%n", scheme,
                field.nearestCategory().label(), field.nearestCategory().bits(),
                field.categoryChance().chanceNearest(), field.categories().size(),
                verdict(field.categoryChance().standsApart()));
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
     * How far the paths agree, over the topics all of them place mass in. Two paths that rank alike are one
     * path read twice, and combining them would state a corroboration neither earned.
     */
    private static void agreement(final List<ReadingPath> paths) {
        System.out.println("== agreement between the paths, Spearman's rho");
        final List<TopicDistribution> read = paths.stream().map(ReadingPath::reading).toList();
        for (int first = 0; first < paths.size(); first++) {
            for (int second = first + 1; second < paths.size(); second++) {
                System.out.printf("   %-11s %-11s %s%n", paths.get(first).name(), paths.get(second).name(),
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
