package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.PublishedSubjects;
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
        return of(ArxivSubjects.fromClasspath(), reading, SubjectAreas.archivesFromClasspath(),
                SubjectAreas.publishedFromClasspath(), seed);
    }

    /**
     * Placed against OpenAlex's topics, pooled to the subfield for the broader level.
     *
     * <p><b>The topics are read from OpenAlex's keywords</b>, which is its account of the subject; its other
     * account describes the cluster the topic was built from and every one of the 4,516 opens with the same
     * four words. The null is drawn from the same account, so chance is filled from the vocabulary the
     * comparison runs on.
     */
    public static PlacedField ofOpenAlex(final TopicDistribution reading, final long seed) {
        return of(OpenAlexTopics.fromClasspath(), reading, SubjectAreas.subfieldsFromClasspath(),
                SubjectAreas.topicsFromClasspath(), seed);
    }

    /**
     * Any scheme stating prose per subject, at the two levels it states them at. The broader level is the
     * scheme's own {@code broader} column pooled, so nothing here decides which subjects belong together.
     */
    public static PlacedField of(final PublishedSubjects taxonomy, final TopicDistribution reading,
                                 final List<SubjectTopics> broaderRead,
                                 final List<SubjectTopics> leavesRead, final long seed) {
        final List<SkosConcept> described = taxonomy.describedBySubjectMatter();
        final List<SkosConcept> broader = new PooledDescriptions().broaderThan(described, taxonomy);
        final List<SubjectPlacement.Placement> byBroader =
                SubjectPlacement.byDivergence().of(reading, broaderRead);
        final List<SubjectPlacement.Placement> byLeaf =
                SubjectPlacement.byDivergence().of(reading, leavesRead);
        return new PlacedField(taxonomy.scheme(),
                byBroader, chance(reading, byBroader, broader, seed),
                byLeaf, chance(reading, byLeaf, described, seed));
    }

    private static SubjectNull.Chance chance(final TopicDistribution reading,
                                             final List<SubjectPlacement.Placement> placed,
                                             final List<SkosConcept> subjects, final long seed) {
        return SubjectNull.seeded(seed).of(placed.getFirst().bits(), reading,
                subjects.stream().map(SkosConcept::definition).toList());
    }
}
