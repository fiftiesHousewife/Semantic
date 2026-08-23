package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DuplicateReportTest {

    private static final NearDuplicates.Judged NEAR =
            new NearDuplicates.Judged("copy", "copyAgain", 4000, 3200, 0.000_4, 0.002_1);
    private static final NearDuplicates.Judged APART =
            new NearDuplicates.Judged("copy", "apart", 4000, 3600, 0.998_0, 0.002_5);

    @Test
    void printsEveryPairWithItsOwnDistanceAndTheDistanceChanceReaches() {
        final String printed = new DuplicateReport().of(List.of(NEAR, APART), List.of("copyAgain"));
        assertAll(
                () -> assertThat(printed).contains("copy", "copyAgain", "apart"),
                () -> assertThat(printed).contains("0.000400", "0.002100", "0.998000"),
                () -> assertThat(printed).contains("drawn twice, so a re-draw refuses: copyAgain"));
    }

    @Test
    void saysSoWhereNoPairIsNearerThanChance() {
        assertThat(new DuplicateReport().of(List.of(APART), List.of()))
                .contains("no pair is nearer than chance");
    }
}
