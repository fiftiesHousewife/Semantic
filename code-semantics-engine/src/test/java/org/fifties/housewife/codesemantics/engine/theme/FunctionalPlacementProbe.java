package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

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

    private static final int HELD = 12;

    private FunctionalPlacementProbe() {
    }

    public static void main(final String[] args) throws IOException {
        if (args.length < 1) {
            throw new IllegalArgumentException("Usage: FunctionalPlacementProbe <taxonomy tsv>");
        }
        final InjectedTaxonomy taxonomy = InjectedTaxonomy.named(Path.of(args[0]));
        final List<SkosConcept> published = taxonomy.described();
        final TopicDistribution repository =
                TreeReading.ofTheCloneUnderReading().themes().repository().comparison();

        final List<SubjectTopics> read = SubjectAreas.fromClasspath().of(published);
        final List<SubjectPlacement.Placement> placements =
                SubjectPlacement.byDivergence().of(repository, read);
        final SubjectNull.Chance chance = SubjectNull.seeded(TreeReading.SEED).of(
                placements.getFirst().bits(), repository,
                published.stream().map(SkosConcept::definition).toList());

        System.out.printf("%n%s — %d concepts stated, %d the reading could place%n", taxonomy.source(),
                published.size(), read.size());
        System.out.printf("%-52s %10s  %s%n", "subject", "divergence", "met on");
        placements.stream().limit(HELD).forEach(placement -> System.out.printf("%-52s %9.1f%%  %s%n",
                placement.label().isBlank() ? placement.concept() : placement.label(),
                100.0 * placement.bits(), String.join(", ", placement.carriedBy())));
        System.out.printf("%nnearest %.1f%%, chance reaches %.1f%% over %d draws of a field of %d — %s%n",
                100.0 * chance.nearest(), 100.0 * chance.chanceNearest(), chance.resamples(),
                chance.subjects(),
                chance.standsApart() ? "STANDS APART FROM CHANCE" : "says only that the taxonomy is large");
    }

}
