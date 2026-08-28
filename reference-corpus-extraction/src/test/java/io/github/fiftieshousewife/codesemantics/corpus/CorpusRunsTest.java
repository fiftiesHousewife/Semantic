package io.github.fiftieshousewife.codesemantics.corpus;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusRunsTest {

    @Test
    void keepsTheRunsAndLeavesEverySingleWordBehind() {
        assertThat(CorpusRuns.runsOf(written()).declared().words())
                .containsExactlyInAnyOrder("time_zone", "cap_floor");
    }

    @Test
    void carriesEveryCountAcrossUntouched() {
        final WrittenWords runs = CorpusRuns.runsOf(written()).declared();
        assertAll(
                () -> assertThat(runs.occurrencesOf("time_zone")).isEqualTo(3),
                () -> assertThat(runs.occurrencesOf("cap_floor")).isOne());
    }

    @Test
    void takesTheSharesAgainOverTheRunsAloneSoTheTableIsADistributionOverRuns() {
        final WrittenWords runs = CorpusRuns.runsOf(written()).declared();
        assertAll(
                () -> assertThat(runs.totalOccurrences()).isEqualTo(4),
                () -> assertThat(runs.shareByWord().get("time_zone")).isCloseTo(0.75, within(1.0e-9)),
                () -> assertThat(runs.shareByWord().values().stream()
                        .mapToDouble(Double::doubleValue).sum()).isCloseTo(1.0, within(1.0e-9)));
    }

    @Test
    void keepsTheNameTheManifestPinsTheRepositoryUnder() {
        assertThat(CorpusRuns.runsOf(written()).name()).isEqualTo("kettle");
    }

    private static CountedRepository written() {
        final WrittenWords declared = new WrittenWords();
        declared.saw("time_zone", "Clock.java:1", true);
        declared.saw("time_zone", "Clock.java:3", true);
        declared.saw("time_zone", "Clock.java:5", true);
        declared.saw("cap_floor", "Swap.java:1", true);
        declared.saw("kettle", "Kettle.java:1", true);
        declared.saw("depth", "Kettle.java:2", true);
        return new CountedRepository("kettle", declared);
    }
}
