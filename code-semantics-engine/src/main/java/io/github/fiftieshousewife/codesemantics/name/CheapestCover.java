package io.github.fiftieshousewife.codesemantics.name;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Optional;

/**
 * The cheapest way to cover a text end to end with pieces something reads, or nothing where no run of
 * pieces spans it.
 *
 * <p>A shortest path over the positions of the text: the cheapest cover ending at each position is the
 * cheapest cover ending somewhere earlier plus the piece between. Every prefix is therefore priced once
 * rather than once per parse containing it, which is what keeps a long compound from costing exponentially.
 *
 * <p>Whether to segment at all is {@link WordSegmenter}'s judgement. This answers only how, and answers
 * for a text the vocabulary already reads whole with that text in one piece.
 */
final class CheapestCover {

    /** Shorter than this is not a piece, so a text shorter than one piece has no cover. */
    private static final int MIN_PIECE_LENGTH = 2;

    private final PieceCost pieceCost;

    CheapestCover(final PieceCost pieceCost) {
        this.pieceCost = pieceCost;
    }

    Optional<Parse> of(final String text) {
        if (text.length() < MIN_PIECE_LENGTH) {
            return Optional.empty();
        }
        final Covering covering = priced(text);
        return covering.spans()
                ? Optional.of(new Parse(covering.piecesOf(text), covering.whole()))
                : Optional.empty();
    }

    /**
     * The cheapest cover of every prefix, filled shortest first so each answer is already known when the
     * next needs it. The loops carry indices into a shared table and stay loops for that reason.
     */
    private Covering priced(final String text) {
        final Covering covering = Covering.over(text.length());
        for (int end = MIN_PIECE_LENGTH; end <= text.length(); end++) {
            for (int start = 0; start + MIN_PIECE_LENGTH <= end; start++) {
                if (covering.unreachable(start)) {
                    continue;
                }
                covering.reach(end, start, pieceCost.of(text.substring(start, end)));
            }
        }
        return covering;
    }

    /**
     * What the cheapest cover of each prefix costs, and where the piece ending it began. Working state
     * and not a value: it is filled in place as the search runs, so two of them are never compared.
     */
    private static final class Covering {

        private final double[] costTo;
        private final int[] pieceStart;

        private Covering(final double[] costTo, final int[] pieceStart) {
            this.costTo = costTo;
            this.pieceStart = pieceStart;
        }

        private static Covering over(final int length) {
            final double[] costTo = new double[length + 1];
            Arrays.fill(costTo, PieceCost.UNPARSEABLE);
            costTo[0] = 0.0;
            return new Covering(costTo, new int[length + 1]);
        }

        private boolean unreachable(final int position) {
            return costTo[position] == PieceCost.UNPARSEABLE;
        }

        /** Records a cheaper way of ending a piece here, and leaves a dearer one alone. */
        private void reach(final int end, final int start, final double piece) {
            final double candidate = costTo[start] + piece;
            if (candidate < costTo[end]) {
                costTo[end] = candidate;
                pieceStart[end] = start;
            }
        }

        private boolean spans() {
            return !unreachable(costTo.length - 1);
        }

        private double whole() {
            return costTo[costTo.length - 1];
        }

        /** The pieces themselves, walked back from the end through where each one began. */
        private List<String> piecesOf(final String text) {
            final Deque<String> pieces = new ArrayDeque<>();
            for (int end = text.length(); end > 0; end = pieceStart[end]) {
                pieces.addFirst(text.substring(pieceStart[end], end));
            }
            return List.copyOf(pieces);
        }
    }
}
