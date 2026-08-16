package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DescriptionLengthReportTest {

    private final DescriptionLengthReport report = new DescriptionLengthReport();

    private static PlacementByDescriptionLength.Placed placed(final double share, final String concept) {
        return new PlacementByDescriptionLength.Placed(share, 18, concept, "Computation and Language", 0.39);
    }

    @Test
    void findsNoChangeWhereOneSubjectStandsNearestAtEveryLength() {
        assertThat(report.firstChange(List.of(placed(1.0, "cs.CL"), placed(0.5, "cs.CL"),
                placed(0.25, "cs.CL"), placed(0.0625, "cs.CL")))).isEmpty();
    }

    @Test
    void namesTheLongestDescriptionAtWhichAnotherSubjectStandsNearest() {
        assertThat(report.firstChange(List.of(placed(1.0, "cs.CL"), placed(0.5, "cs.CL"),
                placed(0.25, "cs.IR"), placed(0.0625, "cs.SY"))))
                .hasValueSatisfying(change -> assertAll(
                        () -> assertThat(change.share()).isEqualTo(0.25),
                        () -> assertThat(change.concept()).isEqualTo("cs.IR")));
    }

    @Test
    void readsAPlacementThatMovesAtAHalfAsOneThatMeasuresLength() {
        assertAll(
                () -> assertThat(report.readsDescriptionLength(List.of(placed(1.0, "cs.CL"),
                        placed(0.5, "cs.IR"), placed(0.25, "cs.IR")))).isTrue(),
                () -> assertThat(report.readsDescriptionLength(List.of(placed(1.0, "cs.CL"),
                        placed(0.5, "cs.CL"), placed(0.25, "cs.IR")))).isFalse(),
                () -> assertThat(report.readsDescriptionLength(List.of(placed(1.0, "cs.CL"),
                        placed(0.5, "cs.CL"), placed(0.25, "cs.CL")))).isFalse());
    }

    @Test
    void statesEveryLengthItReadAndTheSubjectEachOnePlaced() {
        final String rendered = report.render(List.of(placed(1.0, "cs.CL"), placed(0.5, "cs.IR")));

        assertAll(
                () -> assertThat(rendered).contains("cs.CL", "cs.IR", "18"),
                () -> assertThat(rendered).contains("1/2"),
                () -> assertThat(rendered).doesNotContain("&nbsp;"));
    }
}
