package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * Where a reading stands among the published subjects of a scheme, at both levels the scheme states, each
 * with the nearest a taxonomy of chance offers beside it.
 *
 * <p>Both levels are reported because each answers a question the other cannot. An archive pools every
 * category's description under it, so it is compared against enough prose for the divergence to be stable —
 * and it is broad enough that {@code Computer Science} says little about a Java library. A category is
 * compared against the thirty to eighty words the scheme states for it alone, which is a weaker measurement
 * and a far sharper answer.
 *
 * <p>Neither is a result without its chance placement: some subject is always nearest.
 */
public record PlacedField(String scheme, List<SubjectPlacement.Placement> archives,
                          SubjectNull.Chance archiveChance, List<SubjectPlacement.Placement> categories,
                          SubjectNull.Chance categoryChance) {

    private static final String ARXIV = "arXiv";

    public PlacedField {
        archives = List.copyOf(archives);
        categories = List.copyOf(categories);
    }

    /** The nearest archive, which is the level the placement's own null is strongest at. */
    public SubjectPlacement.Placement nearestArchive() {
        return archives.getFirst();
    }

    /** The archive behind it, which says how close the leading call was. */
    public SubjectPlacement.Placement runnerUpArchive() {
        return archives.get(1);
    }

    /** The nearest single category, which is the sharpest answer the scheme can give. */
    public SubjectPlacement.Placement nearestCategory() {
        return categories.getFirst();
    }

    /** Placed against arXiv's own taxonomy at both levels, each drawn against chance at the stated seed. */
    public static PlacedField ofArxiv(final TopicDistribution reading, final long seed) {
        final ArxivSubjects taxonomy = ArxivSubjects.fromClasspath();
        final List<SkosConcept> described = taxonomy.described();
        final List<SkosConcept> archives = new PooledDescriptions().broaderThan(described, taxonomy);
        final List<SubjectPlacement.Placement> byArchive =
                SubjectPlacement.byDivergence().of(reading, SubjectAreas.archivesFromClasspath());
        final List<SubjectPlacement.Placement> byCategory =
                SubjectPlacement.byDivergence().of(reading, SubjectAreas.publishedFromClasspath());
        return new PlacedField(ARXIV,
                byArchive, chance(reading, byArchive, archives, seed),
                byCategory, chance(reading, byCategory, described, seed));
    }

    private static SubjectNull.Chance chance(final TopicDistribution reading,
                                             final List<SubjectPlacement.Placement> placed,
                                             final List<SkosConcept> subjects, final long seed) {
        return SubjectNull.seeded(seed).of(placed.getFirst().bits(), reading,
                subjects.stream().map(SkosConcept::definition).toList());
    }
}
