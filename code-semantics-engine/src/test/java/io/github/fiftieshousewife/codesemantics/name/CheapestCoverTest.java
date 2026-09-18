package io.github.fiftieshousewife.codesemantics.name;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The search alone, with no residual candidates around it. Every piece it returns is one the cost function
 * reads, and where more than one run of pieces spans the text it returns the cheapest.
 */
class CheapestCoverTest {

    private final PieceCost cost = new PieceCost(WordRanks.fromClasspath(), CitedTokens.NONE);

    private final CheapestCover cover = new CheapestCover(cost);

    @Test
    void coversTheWholeTextOrReturnsNothing() {
        assertAll(
                () -> assertThat(cover.of("pushevent")).map(Parse::pieces).contains(List.of("push", "event")),
                () -> assertThat(cover.of("gharchive"))
                        .as("the frequency list gives gh no rank, so no run of pieces spans the text")
                        .isEmpty());
    }

    @Test
    void readsTheTextWholeWhereThatIsCheaperThanSplittingIt() {
        assertThat(cover.of("notebook")).map(Parse::pieces)
                .as("note and book also span it, and two pieces cost more than the one word")
                .contains(List.of("notebook"));
    }

    @Test
    void returnsNothingForATextShorterThanOnePiece() {
        assertThat(cover.of("a")).isEmpty();
    }

    @Test
    void costsACoverAsTheSumOfItsPieces() {
        final Parse parse = cover.of("pushevent").orElseThrow();

        assertThat(parse.cost()).isEqualTo(parse.pieces().stream().mapToDouble(cost::of).sum());
    }
}
