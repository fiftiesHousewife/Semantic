package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Optional;

import org.fifties.housewife.codesemantics.engine.DivergenceShare;

/**
 * What the placement rests on, as a reader checks it: the nearest subject at each description length, and
 * the length at which it first changes.
 *
 * <p>A placement whose winner survives to a quarter of every description is reading what the subjects are
 * about. One that moves at a half is reading how much each publisher wrote.
 */
public class DescriptionLengthReport {

    /** The share below which a changed winner no longer condemns the placement, from Song and Roth's own study. */
    private static final double SURVIVES_TO = 0.25;

    private final DivergenceShare divergence = new DivergenceShare();

    public String render(final List<PlacementByDescriptionLength.Placed> placements) {
        return table(placements) + String.format("%n") + verdict(placements);
    }

    private String table(final List<PlacementByDescriptionLength.Placed> placements) {
        final StringBuilder table = new StringBuilder(String.format(
                "| Share of each description | Median words | Nearest subject | Divergence |%n"
                        + "|---|--:|---|--:|%n"));
        placements.forEach(placed -> table.append(String.format("| %s | %d | `%s` %s | %s |%n",
                shareAsFraction(placed.share()), placed.medianWords(), placed.concept(), placed.label(),
                divergence.of(placed.bits()))));
        return table.toString();
    }

    /** The subject a shorter description first places the repository under, where a shorter one does. */
    Optional<PlacementByDescriptionLength.Placed> firstChange(
            final List<PlacementByDescriptionLength.Placed> placements) {
        final String atFullLength = placements.getFirst().concept();
        return placements.stream().filter(placed -> !placed.concept().equals(atFullLength)).findFirst();
    }

    /** True where the winner changes above the share the literature reports a reading surviving to. */
    boolean readsDescriptionLength(final List<PlacementByDescriptionLength.Placed> placements) {
        return firstChange(placements).filter(change -> change.share() > SURVIVES_TO).isPresent();
    }

    private String verdict(final List<PlacementByDescriptionLength.Placed> placements) {
        return firstChange(placements)
                .map(change -> String.format("The nearest subject changes to **`%s` %s** once each "
                                + "description is cut to %s of the words arXiv wrote, so the placement "
                                + "**%s**.%n", change.concept(), change.label(),
                        shareAsFraction(change.share()),
                        readsDescriptionLength(placements)
                                ? "reads description length rather than subject matter"
                                : "holds down to the length the literature reports a reading surviving to"))
                .orElseGet(() -> String.format("**`%s` %s stands nearest at every length read**, down to %s "
                                + "of the words arXiv wrote, so the placement reads what the subjects are "
                                + "about rather than how much each publisher wrote.%n",
                        placements.getFirst().concept(), placements.getFirst().label(),
                        shareAsFraction(placements.getLast().share())));
    }

    /** Written as the fraction it is, because 0.0625 states nothing a reader can hold beside 1/16. */
    private String shareAsFraction(final double share) {
        return share == 1.0 ? "full" : "1/" + Math.round(1.0 / share);
    }
}
