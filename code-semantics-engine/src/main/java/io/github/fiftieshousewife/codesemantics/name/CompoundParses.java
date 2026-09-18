package io.github.fiftieshousewife.codesemantics.name;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Every way of reading one glued compound that is worth scoring: the cheapest cover of the whole text, and
 * the covers reached by spending one leading residual on a run nothing reads.
 *
 * <p>The residual exists for a branded prefix. {@code gharchive} is gh / archive to a reader and nothing to
 * a frequency list, because {@code gh} is no word — so a parse may leave one short leading run unread and
 * pay for it, and {@link CheapestCover} answers for the rest. One residual and only at the front: a parse
 * allowed two has stopped reading and started guessing.
 */
final class CompoundParses {

    /** Below this a leading run is a letter, and above it a residual is dearer than reading the text. */
    private static final int MIN_RESIDUAL_LENGTH = 2;
    private static final int MAX_RESIDUAL_LENGTH = 3;

    /** What has to be left for the cover after a residual has taken its share. */
    private static final int MIN_PIECE_LENGTH = 2;

    private final PieceCost pieceCost;

    private final CheapestCover cover;

    CompoundParses(final PieceCost pieceCost) {
        this.pieceCost = pieceCost;
        this.cover = new CheapestCover(pieceCost);
    }

    List<Parse> of(final String compound) {
        return Stream.concat(
                        cover.of(compound).stream(),
                        residualParsesOf(compound))
                .toList();
    }

    /** One candidate per leading run a residual could cover, where something reads all that is left. */
    private Stream<Parse> residualParsesOf(final String compound) {
        final int longest = Math.min(MAX_RESIDUAL_LENGTH, compound.length() - MIN_PIECE_LENGTH);
        return IntStream.rangeClosed(MIN_RESIDUAL_LENGTH, longest)
                .mapToObj(length -> afterResidualOf(compound, length))
                .flatMap(Optional::stream);
    }

    /**
     * The compound read as a residual of this length and one piece after it. The remainder must be read
     * whole: a residual beside a segmented remainder is two guesses and not one.
     */
    private Optional<Parse> afterResidualOf(final String compound, final int length) {
        return singlePiece(compound.substring(length))
                .map(parse -> parse.prepend(compound.substring(0, length), pieceCost.residualCost()));
    }

    private Optional<Parse> singlePiece(final String text) {
        final double cost = pieceCost.of(text);
        return cost == PieceCost.UNPARSEABLE ? Optional.empty() : Optional.of(new Parse(List.of(text), cost));
    }
}
