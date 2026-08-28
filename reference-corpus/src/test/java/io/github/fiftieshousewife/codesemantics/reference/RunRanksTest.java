package io.github.fiftieshousewife.codesemantics.reference;

import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RunRanksTest {

    @Test
    void ranksTheDensestRunFirstAndKnowsNothingOfARunTheCorpusNeverWrote() {
        final RunRanks ranks = new RunRanks(Map.of("test_case", 1, "time_zone", 2));
        assertAll(
                () -> assertThat(ranks.rank("test_case")).isOne(),
                () -> assertThat(ranks.rank("cap_floor")).isEqualTo(RunRanks.UNKNOWN_RANK),
                () -> assertThat(ranks.knows("cap_floor")).isFalse(),
                () -> assertThat(ranks.size()).isEqualTo(2));
    }

    @Test
    void asksInTheCaseTheTableIsKeyedBy() {
        assertThat(new RunRanks(Map.of("time_zone", 1)).rank("Time_Zone")).isOne();
    }

    @Test
    void ranksTheBundledTableByRowSoTheScaleIsTheTableSOwnLength() {
        final RunRanks bundled = RunRanks.fromClasspath();
        assertAll(
                () -> assertThat(bundled.size()).isGreaterThan(1_000),
                () -> assertThat(bundled.rank("time_zone")).isPositive(),
                () -> assertThat(bundled.rank("time_zone")).isLessThan(bundled.rank("country_code")),
                () -> assertThat(bundled.knows("cap_floor"))
                        .as("a run only a finance vocabulary states is not what working Java writes")
                        .isFalse());
    }

    @Test
    void boundsSpecificityInTheUnitIntervalByItsOwnLength() {
        final RunRanks bundled = RunRanks.fromClasspath();
        final double specificity = Math.log(bundled.rank("country_code")) / Math.log(bundled.size());
        assertThat(specificity).isBetween(0.0, 1.0);
    }
}
