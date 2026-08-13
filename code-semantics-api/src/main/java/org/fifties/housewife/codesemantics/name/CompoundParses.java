package org.fifties.housewife.codesemantics.name;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Optional;

/**
 * Every way a glued run of letters can be covered by pieces something reads, each priced. The search is the
 * cheapest-cover dynamic programme over {@link PieceCost}, plus the parses that spend one leading residual.
 *
 * <p>Only the leading edge tolerates a residual, and it pairs only with a remainder that is itself a single
 * word or cited token — a branding initialism glued to one word, as in {@code gharchive} — never with a chain
 * of fragments, which is how an opaque identifier would otherwise sneak through. An unrecognised trailing run
 * against a known stem is morphology rather than branding, and {@link WordMorphology} reads it there:
 * periodicity is periodic grown by a suffix, not a compound of periodic and a word called ity.
 */
final class CompoundParses {

    /** One candidate reading of a compound: its pieces in order, and what they cost to read. */
    record Parse(List<String> pieces, double cost) {

        Parse prepend(final String residual, final double residualCost) {
            final List<String> extended = new ArrayList<>();
            extended.add(residual);
            extended.addAll(pieces);
            return new Parse(List.copyOf(extended), cost + residualCost);
        }
    }

    private static final int MIN_PIECE_LENGTH = 2;
    private static final int MIN_RESIDUAL_LENGTH = 2;
    private static final int MAX_RESIDUAL_LENGTH = 3;

    private final PieceCost pieceCost;

    CompoundParses(final PieceCost pieceCost) {
        this.pieceCost = pieceCost;
    }

    List<Parse> of(final String compound) {
        final List<Parse> candidates = new ArrayList<>();
        cheapestCover(compound).ifPresent(candidates::add);
        for (int length = MIN_RESIDUAL_LENGTH;
                length <= Math.min(MAX_RESIDUAL_LENGTH, compound.length() - MIN_PIECE_LENGTH); length++) {
            final String leading = compound.substring(0, length);
            singlePiece(compound.substring(length))
                    .map(parse -> parse.prepend(leading, pieceCost.residualCost()))
                    .ifPresent(candidates::add);
        }
        return List.copyOf(candidates);
    }

    private Optional<Parse> singlePiece(final String text) {
        final double cost = pieceCost.of(text);
        return cost == PieceCost.UNPARSEABLE ? Optional.empty() : Optional.of(new Parse(List.of(text), cost));
    }

    /**
     * The cheapest full cover of the text by pieces something reads. A text something reads whole covers
     * itself in one piece, which is the honest answer to what it costs; refusing to segment a token the
     * vocabulary already knows is {@link WordSegmenter}'s judgement to make and not this search's.
     */
    private Optional<Parse> cheapestCover(final String text) {
        final int length = text.length();
        if (length < MIN_PIECE_LENGTH) {
            return Optional.empty();
        }
        final double[] costToParse = new double[length + 1];
        final int[] pieceStart = new int[length + 1];
        Arrays.fill(costToParse, PieceCost.UNPARSEABLE);
        costToParse[0] = 0.0;
        for (int end = MIN_PIECE_LENGTH; end <= length; end++) {
            for (int start = 0; start + MIN_PIECE_LENGTH <= end; start++) {
                if (costToParse[start] == PieceCost.UNPARSEABLE) {
                    continue;
                }
                final double candidate = costToParse[start] + pieceCost.of(text.substring(start, end));
                if (candidate < costToParse[end]) {
                    costToParse[end] = candidate;
                    pieceStart[end] = start;
                }
            }
        }
        return costToParse[length] == PieceCost.UNPARSEABLE
                ? Optional.empty()
                : Optional.of(new Parse(piecesOf(text, pieceStart), costToParse[length]));
    }

    private static List<String> piecesOf(final String text, final int[] pieceStart) {
        final Deque<String> pieces = new ArrayDeque<>();
        for (int end = text.length(); end > 0; end = pieceStart[end]) {
            pieces.addFirst(text.substring(pieceStart[end], end));
        }
        return List.copyOf(pieces);
    }
}
