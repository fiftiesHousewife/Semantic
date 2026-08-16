package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SubjectReportTest {

    private static final List<SubjectPlacement.Placement> PLACEMENTS = List.of(
            new SubjectPlacement.Placement("cs.CL", "Computation and Language", "grp_cs", 0.4031,
                    List.of("linguistics", "computing")),
            new SubjectPlacement.Placement("math.CT", "Category Theory", "grp_math", 0.5512,
                    List.of("mathematics")));

    private final SubjectReport report = new SubjectReport();

    @Test
    void statesTheSubjectsAScopeStandsNearestAndHowFar() {
        assertThat(report.render(PLACEMENTS, standingApart(), 2))
                .contains("| [`cs.CL` Computation and Language](https://arxiv.org/list/cs.CL/recent) "
                        + "| [grp_cs](https://arxiv.org/category_taxonomy) | 40.3% | keep "
                        + "| the nearest subject read, and nearer than chance reaches "
                        + "| linguistics, computing |");
    }

    @Test
    void holdsBackWhatItWasAskedToHoldBack() {
        assertThat(report.render(PLACEMENTS, standingApart(), 1)).doesNotContain("math.CT");
    }

    @Test
    void saysWhetherThePlacementCanBeToldFromChanceEitherWay() {
        assertAll(
                () -> assertThat(report.render(PLACEMENTS, standingApart(), 2))
                        .contains("stands apart from chance"),
                () -> assertThat(report.render(PLACEMENTS, lostInTheField(), 2))
                        .contains("says only that the taxonomy is large"));
    }

    private static SubjectNull.Chance standingApart() {
        return new SubjectNull.Chance(0.4031, 0.4300, 152, 999);
    }

    private static SubjectNull.Chance lostInTheField() {
        return new SubjectNull.Chance(0.4031, 0.3900, 152, 999);
    }
}
