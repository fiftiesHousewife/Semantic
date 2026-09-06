package io.github.fiftieshousewife.codesemantics.name;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CompoundParsesTest {

    private final CompoundParses parses =
            new CompoundParses(new PieceCost(WordRanks.fromClasspath(), CitedTokens.NONE));

    private List<String> cheapestOf(final String compound) {
        return parses.of(compound).stream()
                .min(Comparator.comparingDouble(CompoundParses.Parse::cost))
                .map(CompoundParses.Parse::pieces)
                .orElse(List.of());
    }

    @Test
    void coversAGluedCompoundWithTheCheapestWordsThatSpanIt() {
        assertAll(
                () -> assertThat(cheapestOf("pushevent")).containsExactly("push", "event"),
                () -> assertThat(cheapestOf("openfoodfacts")).containsExactly("open", "food", "facts"));
    }

    @Test
    void spendsItsOneLeadingResidualOnABrandingInitialism() {
        assertThat(parses.of("gharchive"))
                .extracting(CompoundParses.Parse::pieces)
                .contains(List.of("gh", "archive"));
    }

    @Test
    void spendsTheResidualOnlyOnARemainderSomethingReadsWhole() {
        assertThat(parses.of("gharchive"))
                .filteredOn(parse -> "gh".equals(parse.pieces().getFirst()))
                .allSatisfy(parse -> assertThat(parse.pieces()).hasSize(2));
    }

    @Test
    void refusesTheResidualToARemainderThatIsItselfACompound() {
        assertThat(parses.of("ghpushevent"))
                .as("gh + push + event would let any initialism glued to any two words parse")
                .isEmpty();
    }

    @Test
    void readsNoParseAtAllWhenNothingCoversTheRun() {
        assertAll(
                () -> assertThat(parses.of("qzxfgh")).isEmpty(),
                () -> assertThat(parses.of("tconst")).isEmpty());
    }
}
