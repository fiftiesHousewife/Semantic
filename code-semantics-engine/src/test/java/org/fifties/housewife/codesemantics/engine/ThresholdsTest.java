package org.fifties.housewife.codesemantics.engine;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ThresholdsTest {

    @Test
    void statesTheEvidenceMassAnAxisMustCarryBeforeItIsDecided() {
        assertThat(Thresholds.defaults().minimumEvidenceMass()).isEqualTo(0.50);
    }

    @Test
    void tunesOneThresholdWithoutRestatingTheRest() {
        final Thresholds tuned = Thresholds.builder().minimumEvidenceMass(1.25).build();

        assertAll(
                () -> assertThat(tuned.minimumEvidenceMass()).isEqualTo(1.25),
                () -> assertThat(Thresholds.defaults().minimumEvidenceMass())
                        .as("a tuned copy must not rewrite the defaults every other reading shares")
                        .isEqualTo(0.50));
    }
}
