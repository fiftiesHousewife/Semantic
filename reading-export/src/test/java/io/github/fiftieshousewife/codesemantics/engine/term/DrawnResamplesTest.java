package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DrawnResamplesTest {

    @Test
    void drawsTheDealsEveryPublishedReadingTakesWhereTheCallerNamesNone() {
        assertThat(new DrawnResamples(Optional.empty()).count()).isEqualTo(TermOrderNull.RESAMPLES);
    }

    @Test
    void drawsTheDealCountTheCallerNames() {
        assertThat(new DrawnResamples(Optional.of(10_000)).count()).isEqualTo(10_000);
    }
}
