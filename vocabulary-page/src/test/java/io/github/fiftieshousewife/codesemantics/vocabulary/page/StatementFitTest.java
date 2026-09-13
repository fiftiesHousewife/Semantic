package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedStatement;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatementFitTest {

    @Test
    void readsTheTwoConventionalSignificanceLevelsAsTheBands() {
        assertAll(
                () -> assertThat(band(0.962)).isEqualTo(StatementFit.HIGH),
                () -> assertThat(band(0.95)).isEqualTo(StatementFit.HIGH),
                () -> assertThat(band(0.94)).isEqualTo(StatementFit.MEDIUM),
                () -> assertThat(band(0.90)).isEqualTo(StatementFit.MEDIUM),
                () -> assertThat(band(0.30)).isEqualTo(StatementFit.UNCERTAIN));
    }

    @Test
    void namesNoBandWhereNoStatementWasFetched() {
        assertThat(StatementFit.of(null)).isEmpty();
    }

    @Test
    void wordsEachBandForAReaderRatherThanForAThreshold() {
        assertAll(
                () -> assertThat(StatementFit.HIGH.shown()).isEqualTo("high"),
                () -> assertThat(StatementFit.MEDIUM.shown()).isEqualTo("medium"),
                () -> assertThat(StatementFit.UNCERTAIN.shown()).isEqualTo("uncertain"));
    }

    private static StatementFit band(final double chanceRate) {
        return StatementFit.of(new ExportedStatement(3, 33, 0.4, 0.6, chanceRate, 999, List.of()))
                .orElseThrow();
    }
}
