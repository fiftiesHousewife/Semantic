package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.MeasuredCode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class MetricBandTest {

    /** A repository whose methods carry three statements in the middle and eight at the 75th centile. */
    private static final MeasuredCode.Spread REPOSITORY = new MeasuredCode.Spread(3, 8, 780);

    @Test
    void readsAFigureAtOrBelowTheRepositorysMiddleAsTypicalOfIt() {
        assertAll(
                () -> assertThat(MetricBand.of(1, REPOSITORY)).isEqualTo(MetricBand.TYPICAL),
                () -> assertThat(MetricBand.of(3, REPOSITORY)).isEqualTo(MetricBand.TYPICAL));
    }

    @Test
    void readsAFigureUpToTheUpperQuartileAsHigherThanTheMiddle() {
        assertAll(
                () -> assertThat(MetricBand.of(4, REPOSITORY)).isEqualTo(MetricBand.HIGHER),
                () -> assertThat(MetricBand.of(8, REPOSITORY)).isEqualTo(MetricBand.HIGHER));
    }

    @Test
    void readsAFigureAboveTheUpperQuartileAsTheOneWorthLookingAt() {
        assertAll(
                () -> assertThat(MetricBand.of(9, REPOSITORY)).isEqualTo(MetricBand.UNUSUAL),
                () -> assertThat(MetricBand.of(57, REPOSITORY)).isEqualTo(MetricBand.UNUSUAL));
    }

    @Test
    void takesTheStricterOfTheRepositoryAndMcCabesOwnLimitForComplexity() {
        final MeasuredCode.Spread lenient = new MeasuredCode.Spread(20, 40, 116);

        assertAll(
                () -> assertThat(MetricBand.ofComplexity(11, lenient))
                        .as("McCabe proposes ten as the limit for one module, so eleven is unusual "
                                + "however complex the repository around it")
                        .isEqualTo(MetricBand.UNUSUAL),
                () -> assertThat(MetricBand.ofComplexity(10, lenient)).isEqualTo(MetricBand.TYPICAL),
                () -> assertThat(MetricBand.ofComplexity(9, new MeasuredCode.Spread(1, 2, 116)))
                        .as("and a figure above this repository's own quartile is unusual here even "
                                + "where McCabe would allow it")
                        .isEqualTo(MetricBand.UNUSUAL));
    }

    @Test
    void readsEveryFigureAsTypicalWhereNothingWasMeasuredToCompareAgainst() {
        assertThat(MetricBand.of(57, new MeasuredCode.Spread(0, 0, 0)))
                .as("a report with no repository beside it marks nothing rather than marking all of it")
                .isEqualTo(MetricBand.TYPICAL);
    }

    @Test
    void marksEachBandWithAShapeOfItsOwnRatherThanAColour() {
        assertAll(
                () -> assertThat(MetricBand.TYPICAL.mark()).isEqualTo("\u2713"),
                () -> assertThat(MetricBand.HIGHER.mark()).isEqualTo("\u2013"),
                () -> assertThat(MetricBand.UNUSUAL.mark()).isEqualTo("\u2717"),
                () -> assertThat(Stream.of(MetricBand.values()).map(MetricBand::mark).distinct())
                        .as("a reader who sees no colour still tells the three apart")
                        .hasSize(MetricBand.values().length));
    }

    @Test
    void namesEachBandForWhatItMeasuresAgainstRatherThanForAVerdict() {
        assertAll(
                () -> assertThat(MetricBand.TYPICAL.shown()).isEqualTo("at or below the median"),
                () -> assertThat(MetricBand.HIGHER.shown()).isEqualTo("up to the 75th centile"),
                () -> assertThat(MetricBand.UNUSUAL.shown()).isEqualTo("above the 75th centile"));
    }
}
