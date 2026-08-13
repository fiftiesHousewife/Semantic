package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

/**
 * The placement as a person reads it: the subjects a scope stands nearest, what a taxonomy of chance would
 * have offered instead, and — stated whether or not it flatters the reading — whether the two can be told
 * apart.
 */
public class SubjectReport {

    public String render(final List<SubjectPlacement.Placement> placements, final SubjectNull.Chance chance,
                         final int held) {
        return nearest(placements, held) + String.format("%n") + verdict(chance);
    }

    private static String nearest(final List<SubjectPlacement.Placement> placements, final int held) {
        final StringBuilder table = new StringBuilder(
                String.format("| Subject | Group | Distance | Met on |%n|---|---|--:|---|%n"));
        placements.stream().limit(held).forEach(placement -> table.append(String.format(
                "| `%s` %s | %s | %.4f | %s |%n",
                placement.concept(), placement.label(), placement.group(), placement.bits(),
                String.join(", ", placement.carriedBy()))));
        return table.toString();
    }

    private static String verdict(final SubjectNull.Chance chance) {
        return String.format("The nearest subject stands **%.4f bits** away. Across %d draws, the nearest a "
                        + "taxonomy of chance offered a field of %d subjects was **%.4f bits**, so this "
                        + "placement **%s**.%n",
                chance.nearest(), chance.resamples(), chance.subjects(), chance.chanceNearest(),
                chance.standsApart() ? "stands apart from chance" : "says only that the taxonomy is large");
    }
}
