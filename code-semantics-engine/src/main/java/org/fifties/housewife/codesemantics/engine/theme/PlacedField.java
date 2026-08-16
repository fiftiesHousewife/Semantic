package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * Where a reading stands among the published subjects of a scheme, with the nearest a taxonomy of chance
 * offers beside it.
 *
 * <p>The two are computed together because neither is a result alone: something is always nearest, and only
 * the chance placement says whether being nearest means anything.
 *
 * <p>The descriptions are pooled at the archive the scheme states each category under, so a placement is
 * against a body of prose the publisher wrote rather than against one sentence.
 */
public record PlacedField(String scheme, List<SubjectPlacement.Placement> placements,
                          SubjectNull.Chance chance) {

    private static final String ARXIV = "arXiv";

    public PlacedField {
        placements = List.copyOf(placements);
    }

    /** The nearest of the scheme's subjects, which is what the reading places the repository in. */
    public SubjectPlacement.Placement nearest() {
        return placements.getFirst();
    }

    public SubjectPlacement.Placement runnerUp() {
        return placements.get(1);
    }

    /** Placed against arXiv's own taxonomy, drawn against a chance one at the stated seed. */
    public static PlacedField ofArxiv(final TopicDistribution reading, final long seed) {
        final ArxivSubjects taxonomy = ArxivSubjects.fromClasspath();
        final List<SkosConcept> archives = new PooledDescriptions().broaderThan(taxonomy.described(), taxonomy);
        final List<SubjectPlacement.Placement> placements = SubjectPlacement.byDivergence()
                .of(reading, SubjectAreas.fromClasspath().of(archives));
        return new PlacedField(ARXIV, placements, SubjectNull.seeded(seed).of(placements.getFirst().bits(),
                reading, archives.stream().map(SkosConcept::definition).toList()));
    }
}
