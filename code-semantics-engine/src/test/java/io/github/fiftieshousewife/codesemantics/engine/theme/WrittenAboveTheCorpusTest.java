package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class WrittenAboveTheCorpusTest {

    private static final Map<String, Double> CORPUS = Map.of("get", 0.5, "x", 0.2, "curve", 0.001);

    @Test
    void weighsOneWordDifferentlyForTwoRepositoriesThatWriteItAtDifferentRates() {
        final WrittenAboveTheCorpus maths = new WrittenAboveTheCorpus(Map.of("x", 0.6), CORPUS);
        final WrittenAboveTheCorpus build = new WrittenAboveTheCorpus(Map.of("x", 0.02), CORPUS);
        assertThat(maths.of("x")).isGreaterThan(build.of("x"));
    }

    @Test
    void weighsAWordTheCorpusNeverWroteAsAWholeOccurrence() {
        assertThat(new WrittenAboveTheCorpus(Map.of("notional", 0.01), CORPUS).of("notional")).isEqualTo(1.0);
    }

    @Test
    void weighsAWordWrittenAtTheCorpusOwnRateAtAHalf() {
        assertThat(new WrittenAboveTheCorpus(Map.of("get", 0.5), CORPUS).of("get"))
                .isCloseTo(0.5, within(1.0e-9));
    }

    @Test
    void keepsAWordTheCorpusWritesFarMoreDenselyAboveNothingSoItStillVotes() {
        final WrittenAboveTheCorpus rare = new WrittenAboveTheCorpus(Map.of("get", 1.0e-9), CORPUS);
        assertAll(
                () -> assertThat(rare.of("get")).isGreaterThan(0.0),
                () -> assertThat(rare.of("get")).isLessThan(0.001));
    }

    @Test
    void staysWithinTheBoundItsOwnArithmeticSets() {
        final WrittenAboveTheCorpus over = new WrittenAboveTheCorpus(
                Map.of("get", 0.4, "x", 0.3, "curve", 0.3), CORPUS);
        assertAll(
                () -> assertThat(over.of("get")).isBetween(0.0, 1.0),
                () -> assertThat(over.of("x")).isBetween(0.0, 1.0),
                () -> assertThat(over.of("curve")).isBetween(0.0, 1.0));
    }
}
