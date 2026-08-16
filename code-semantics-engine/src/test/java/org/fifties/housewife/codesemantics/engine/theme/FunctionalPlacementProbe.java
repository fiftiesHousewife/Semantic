package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.reading.TreeReading;

/**
 * Places the repository under reading against a functional taxonomy held in a file rather than on the
 * classpath, so a candidate source can be measured before anything decides to bundle it.
 *
 * <p>The placement machinery is source-agnostic already — {@link SubjectAreas#of} takes concepts and asks
 * where they came from — so this adds no reading. It exists to keep an unbundled source out of the
 * classpath while it is still a candidate, which is what the extractor plan requires.
 *
 * <p>Run it against a vocabulary of a field the repository has nothing to do with and the honest result is
 * that nothing clears the null. That is the control, and a source failing it is not thereby a bad source.
 */
public final class FunctionalPlacementProbe {

    private static final int COLUMNS = 8;
    private static final int HELD = 12;

    private FunctionalPlacementProbe() {
    }

    public static void main(final String[] args) throws IOException {
        if (args.length < 1) {
            throw new IllegalArgumentException("Usage: FunctionalPlacementProbe <taxonomy tsv>");
        }
        final List<SkosConcept> published = concepts(Path.of(args[0]));
        final TopicDistribution repository =
                TreeReading.ofTheCloneUnderReading().themes().repository().comparison();

        final List<SubjectTopics> read = SubjectAreas.fromClasspath().of(published);
        final List<SubjectPlacement.Placement> placements =
                SubjectPlacement.byDivergence().of(repository, read);
        final SubjectNull.Chance chance = SubjectNull.seeded(TreeReading.SEED).of(
                placements.getFirst().bits(), repository,
                published.stream().map(SkosConcept::definition).toList());

        System.out.printf("%n%d concepts stated, %d the reading could place%n", published.size(), read.size());
        System.out.printf("%-52s %10s  %s%n", "subject", "divergence", "met on");
        placements.stream().limit(HELD).forEach(placement -> System.out.printf("%-52s %9.1f%%  %s%n",
                placement.label().isBlank() ? placement.concept() : placement.label(),
                100.0 * placement.bits(), String.join(", ", placement.carriedBy())));
        System.out.printf("%nnearest %.1f%%, chance reaches %.1f%% over %d draws of a field of %d — %s%n",
                100.0 * chance.nearest(), 100.0 * chance.chanceNearest(), chance.resamples(),
                chance.subjects(),
                chance.standsApart() ? "STANDS APART FROM CHANCE" : "says only that the taxonomy is large");
    }

    /** The bundled TSV shape, read from anywhere: comment lines out, eight tab-separated columns. */
    static List<SkosConcept> concepts(final Path taxonomy) throws IOException {
        return Files.readAllLines(taxonomy, StandardCharsets.UTF_8).stream()
                .filter(line -> !line.startsWith("#") && !line.isBlank())
                .map(line -> line.split("\t", -1))
                .filter(columns -> columns.length >= COLUMNS)
                .map(columns -> new SkosConcept(columns[0], columns[1], columns[2], columns[3],
                        columns[4], columns[5], columns[6], columns[7]))
                .filter(concept -> !concept.definition().isBlank())
                .toList();
    }

    static String percentage(final double share) {
        return String.format(Locale.ROOT, "%.1f%%", 100.0 * share);
    }
}
