package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.DivergenceShare;

/**
 * The placement as a person reads it: the subjects a scope stands nearest, what a taxonomy of chance would
 * have offered instead, and — stated whether or not it flatters the reading — whether the two can be told
 * apart.
 *
 * <p>Every row says outright whether it is kept and why, because a table of distances alone leaves a reader
 * to work out which of its rows is the result. One row can be: the nearest subject read, where that subject
 * also stands nearer than the best of a whole taxonomy of chance draws.
 */
public class SubjectReport {

    /** arXiv's own listing for a subject, which is where its published statement of that subject is. */
    private static final String SUBJECT_LISTING = "https://arxiv.org/list/%s/recent";

    /** arXiv's own taxonomy page, which is where the groups the subjects are filed under are stated. */
    private static final String TAXONOMY_PAGE = "https://arxiv.org/category_taxonomy";

    private final DivergenceShare divergence = new DivergenceShare();

    public String render(final List<SubjectPlacement.Placement> placements, final SubjectNull.Chance chance,
                         final int held) {
        return nearest(placements, chance, held) + String.format("%n") + verdict(chance);
    }

    private String nearest(final List<SubjectPlacement.Placement> placements, final SubjectNull.Chance chance,
                           final int held) {
        final StringBuilder table = new StringBuilder(String.format(
                "| Subject | Group | Divergence | Kept | Why | Met on |%n|---|---|--:|---|---|---|%n"));
        placements.stream().limit(held).forEach(placement -> table.append(
                row(placement, verdictOn(placements, placement, chance))));
        return table.toString();
    }

    private static SubjectVerdict verdictOn(final List<SubjectPlacement.Placement> placements,
                                            final SubjectPlacement.Placement placement,
                                            final SubjectNull.Chance chance) {
        return SubjectVerdict.on(placement.bits(), chance.chanceNearest(),
                placement.equals(placements.getFirst()));
    }

    private String row(final SubjectPlacement.Placement placement, final SubjectVerdict verdict) {
        return String.format("| [`%s` %s](%s) | [%s](%s) | %s | %s | %s | %s |%n",
                placement.concept(), placement.label(), SUBJECT_LISTING.formatted(placement.concept()),
                placement.group(), TAXONOMY_PAGE, divergence.of(placement.bits()), verdict.decision(),
                verdict.reason(), String.join(", ", placement.carriedBy()));
    }

    private String verdict(final SubjectNull.Chance chance) {
        return String.format("The nearest subject stands **%s** of the maximum divergence away — 0%% is two "
                        + "readings that are identical and 100%% is two sharing no subject at all. Across %d "
                        + "draws, the nearest a taxonomy of chance offered a field of %d subjects was "
                        + "**%s**, so this placement **%s**.%n",
                divergence.of(chance.nearest()), chance.resamples(), chance.subjects(),
                divergence.of(chance.chanceNearest()),
                chance.standsApart() ? "stands apart from chance" : "says only that the taxonomy is large");
    }
}
