package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.theme.SubjectPlacement.Placement;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlacedFieldTest {

    private static final Placement ARCHIVE =
            new Placement("cs", "Computer Science", "grp_cs", 0.3399, List.of("linguistics"));

    private static final Placement RUNNER_UP =
            new Placement("eess", "Electrical Engineering", "grp_eess", 0.4848, List.of("computing"));

    private static final Placement CATEGORY =
            new Placement("cs.CL", "Computation and Language", "grp_cs", 0.3950, List.of("linguistics"));

    private static PlacedField placed(final double archiveChance, final double categoryChance) {
        return new PlacedField("arXiv", List.of(ARCHIVE, RUNNER_UP),
                new SubjectNull.Chance(0.3399, archiveChance, 12, 999),
                List.of(CATEGORY), new SubjectNull.Chance(0.3950, categoryChance, 152, 995));
    }

    @Test
    void namesTheNearestAtBothLevelsTheSchemeStates() {
        assertAll(
                () -> assertThat(placed(0.4125, 0.4455).nearestArchive()).isEqualTo(ARCHIVE),
                () -> assertThat(placed(0.4125, 0.4455).nearestCategory()).isEqualTo(CATEGORY),
                () -> assertThat(placed(0.4125, 0.4455).runnerUpArchive()).isEqualTo(RUNNER_UP),
                () -> assertThat(placed(0.4125, 0.4455).scheme()).isEqualTo("arXiv"));
    }

    @Test
    void carriesAChancePlacementForEachLevel() {
        assertAll(
                () -> assertThat(placed(0.4125, 0.4455).archiveChance().standsApart())
                        .as("some subject is always nearest, so only the chance placement makes it a result")
                        .isTrue(),
                () -> assertThat(placed(0.4125, 0.4455).categoryChance().standsApart()).isTrue(),
                () -> assertThat(placed(0.3000, 0.3000).archiveChance().standsApart()).isFalse(),
                () -> assertThat(placed(0.3000, 0.3000).categoryChance().standsApart()).isFalse());
    }
}
