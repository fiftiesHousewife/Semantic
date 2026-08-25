package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.reference.PooledWordShares;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusSpecificityTest {

    private final CorpusSpecificity bundled = CorpusSpecificity.fromClasspath();

    @Test
    void narrowsLeastForTheWordWorkingJavaDeclaresMostDensely() {
        assertAll(
                () -> assertThat(bundled.of("get")).isLessThan(bundled.of("trade")),
                () -> assertThat(bundled.of("id")).isLessThan(bundled.of("notional")),
                () -> assertThat(bundled.of("name")).isLessThan(bundled.of("curve")));
    }

    @Test
    void narrowsFullyForAWordTheCorpusNeverDeclared() {
        assertAll(
                () -> assertThat(bundled.of("notional")).isEqualTo(1.0),
                () -> assertThat(bundled.of("aeron")).isEqualTo(1.0));
    }

    @Test
    void weighsTheCommonestWordAboveNothingSoItVotesRatherThanAbstaining() {
        assertThat(over("get\t900\t0.9", "trade\t100\t0.1").of("get")).isGreaterThan(0.0);
    }

    @Test
    void staysWithinTheBoundTheCorpusOwnLengthSets() {
        assertAll(
                () -> assertThat(bundled.of("get")).isBetween(0.0, 1.0),
                () -> assertThat(bundled.of("the")).isBetween(0.0, 1.0),
                () -> assertThat(bundled.of("gas")).isBetween(0.0, 1.0));
    }

    @Test
    void ranksTwoWordsOfEqualShareByTheirSpellingSoEveryRunWeighsThemAlike() {
        final CorpusSpecificity tied = over("beta\t5\t0.5", "alpha\t5\t0.5");
        assertThat(tied.of("alpha")).isLessThan(tied.of("beta"));
    }

    private static CorpusSpecificity over(final String... rows) {
        return new CorpusSpecificity(new PooledWordShares(Stream.of(rows)));
    }
}
