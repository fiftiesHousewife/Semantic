package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.theme.SubjectPlacement.Placement;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlacedFieldTest {

    private static final Placement NEAREST =
            new Placement("cs", "Computer Science", "cs", 0.3408, List.of("computing"));

    private static final Placement RUNNER_UP =
            new Placement("math", "Mathematics", "math", 0.3661, List.of("mathematics"));

    private static PlacedField placed(final double chanceNearest) {
        return new PlacedField("arXiv", List.of(NEAREST, RUNNER_UP),
                new SubjectNull.Chance(0.3408, chanceNearest, 152, 999));
    }

    @Test
    void namesTheNearestSubjectAndTheOneBehindIt() {
        assertAll(
                () -> assertThat(placed(0.4124).nearest()).isEqualTo(NEAREST),
                () -> assertThat(placed(0.4124).runnerUp()).isEqualTo(RUNNER_UP),
                () -> assertThat(placed(0.4124).scheme()).isEqualTo("arXiv"));
    }

    @Test
    void carriesTheChancePlacementBesideTheRealOne() {
        assertAll(
                () -> assertThat(placed(0.4124).chance().standsApart())
                        .as("something is always nearest, so only the chance placement makes it a result")
                        .isTrue(),
                () -> assertThat(placed(0.3000).chance().standsApart()).isFalse());
    }
}
