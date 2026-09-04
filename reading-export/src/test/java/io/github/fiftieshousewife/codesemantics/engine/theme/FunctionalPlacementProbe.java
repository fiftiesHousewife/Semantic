package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.lexicon.BianServiceDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Places the repository under reading against a functional taxonomy: the bundled BIAN Service Landscape,
 * or the file a caller names, so a candidate source is measured by the same reading that would bundle it.
 *
 * <p>The placement machinery is source-agnostic already — {@link SubjectAreas#of} takes concepts and asks
 * where they came from — so this adds no reading.
 *
 * <p>Run it against a vocabulary of a field the repository has nothing to do with and the honest result is
 * that nothing clears the null. That is the control, and a source failing it is not thereby a bad source.
 *
 * <p><b>BIAN has failed that control twice.</b> {@link PlacedField#ofBian} states the second measurement:
 * at both of the levels BIAN publishes, it stood apart on nine of the eleven evaluation members and could
 * not separate the two that are actually about banking. Both levels are drawn here so a repair is measured
 * against the same table rather than against this one-level reading.
 */
public final class FunctionalPlacementProbe {

    private static final int HELD = 12;

    private FunctionalPlacementProbe() {
    }

    public static void main(final String[] args) throws IOException {
        final InjectedTaxonomy taxonomy = args.length < 1 || args[0].isBlank()
                ? InjectedTaxonomy.of(BianServiceDomains.fromClasspath().concepts(), "BIAN")
                : InjectedTaxonomy.named(Path.of(args[0]));
        final int held = args.length < 2 ? HELD : Integer.parseInt(args[1]);
        final List<SkosConcept> published = taxonomy.described();
        final TopicDistribution repository =
                TreeReading.ofTheCloneUnderReading().themes().repository().comparison();

        final List<SubjectTopics> read = SubjectAreas.fromClasspath().of(published);
        final List<SubjectPlacement.Placement> placements =
                SubjectPlacement.byDivergence().of(repository, read);
        final SubjectNull.Chance chance = SubjectNull.seeded(TreeReading.SEED).of(
                placements.getFirst().bits(), repository,
                published.stream().map(SkosConcept::definition).toList());
        pooled(repository);

        System.out.printf("%n%s — %d concepts stated, %d the reading could place%n", taxonomy.source(),
                published.size(), read.size());
        System.out.printf("%-52s %10s  %s%n", "subject", "divergence", "met on");
        placements.stream().limit(held).forEach(placement -> System.out.printf("%-52s %9.1f%%  %s%n",
                placement.label().isBlank() ? placement.concept() : placement.label(),
                100.0 * placement.bits(), String.join(", ", placement.carriedBy().stream().map(SharedMass.Shared::topic).toList())));
        System.out.printf("%nnearest %.1f%%, chance reaches %.1f%% over %d draws of a field of %d — %s%n",
                100.0 * chance.nearest(), 100.0 * chance.chanceNearest(), chance.resamples(),
                chance.subjects(),
                chance.standsApart() ? "STANDS APART FROM CHANCE" : "says only that the taxonomy is large");
    }

    /**
     * The same tree at both of the levels BIAN publishes, which is what a reading would draw. The
     * business-domain level is the one that stood apart on nine of eleven members and named two subjects
     * between them, so it is printed beside the service domains rather than left to be inferred.
     */
    private static void pooled(final TopicDistribution repository) {
        final PlacedField field = PlacedField.ofBian(repository, TreeReading.SEED);
        System.out.printf("%n%s at both levels%n", field.scheme());
        System.out.printf("  business domain %-34s %.4f vs chance %.4f — %s%n",
                field.nearestArchive().label(), field.nearestArchive().bits(),
                field.archiveChance().chanceNearest(),
                field.archiveChance().standsApart() ? "STANDS APART" : "within chance");
        System.out.printf("  service domain  %-34s %.4f vs chance %.4f — %s%n",
                field.nearestCategory().label(), field.nearestCategory().bits(),
                field.categoryChance().chanceNearest(),
                field.categoryChance().standsApart() ? "STANDS APART" : "within chance");
    }
}
