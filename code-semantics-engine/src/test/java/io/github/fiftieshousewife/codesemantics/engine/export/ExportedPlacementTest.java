package io.github.fiftieshousewife.codesemantics.engine.export;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedPlacementTest {

    @Test
    void standsApartOnlyWhereTheSubjectIsNearerThanTheNearestChanceOneIs() {
        assertAll(
                () -> assertThat(ExportedPlacement.Level.of("Computer Science", 0.3408, 0.4124)
                        .standsApartFromChance()).isTrue(),
                () -> assertThat(ExportedPlacement.Level.of("cs.CL Computation and Language", 0.3950, 0.4455)
                        .standsApartFromChance()).isTrue(),
                () -> assertThat(ExportedPlacement.Level.of("cs", 0.42, 0.40).standsApartFromChance())
                        .isFalse());
    }
}
