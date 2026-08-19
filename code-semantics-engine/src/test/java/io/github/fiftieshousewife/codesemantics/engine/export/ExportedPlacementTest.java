package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedPlacementTest {

    private static final List<String> MEETS_ON = List.of("linguistics", "computing");

    @Test
    void standsApartOnlyWhereTheSubjectIsNearerThanTheNearestChanceOneIs() {
        assertAll(
                () -> assertThat(level("Computer Science", 0.3408, 0.4124).standsApartFromChance()).isTrue(),
                () -> assertThat(level("cs.CL Computation and Language", 0.3950, 0.4455)
                        .standsApartFromChance()).isTrue(),
                () -> assertThat(level("cs", 0.42, 0.40).standsApartFromChance()).isFalse());
    }

    @Test
    void holdsEverySubjectStandingNearerThanChanceDidAndNotOnlyTheNearest() {
        final ExportedPlacement.Level placed = ExportedPlacement.Level.of("Computation and Language",
                0.3650, 0.3801, MEETS_ON, List.of(
                        new ExportedPlacement.Contender("Computation and Language", 0.3650, MEETS_ON),
                        new ExportedPlacement.Contender("Medical Research and Practices", 0.3712, MEETS_ON)));

        assertAll(
                () -> assertThat(placed.nearerThanChance()).hasSize(2),
                () -> assertThat(placed.nearerThanChance().getFirst().subject())
                        .as("the nearest subject stands among the band it leads rather than beside it")
                        .isEqualTo(placed.subject()),
                () -> assertThat(placed.carriedBy()).isEqualTo(MEETS_ON));
    }

    private static ExportedPlacement.Level level(final String subject, final double bits,
                                                 final double chance) {
        return ExportedPlacement.Level.of(subject, bits, chance, MEETS_ON, List.of());
    }
}
