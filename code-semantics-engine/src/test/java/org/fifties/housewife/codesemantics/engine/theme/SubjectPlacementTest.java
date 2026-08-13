package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SubjectPlacementTest {

    private static final TopicDistribution SCOPE =
            new TopicDistribution(Map.of("linguistics", 0.7, "computing", 0.3));

    private static final SubjectTopics NEAR = new SubjectTopics("cs.CL", "Computation and Language",
            "grp_cs", new TopicDistribution(Map.of("linguistics", 0.6, "computing", 0.4)), 1);

    private static final SubjectTopics FAR = new SubjectTopics("astro-ph", "Astrophysics", "grp_physics",
            new TopicDistribution(Map.of("astronomy", 1.0)), 1);

    private final SubjectPlacement placement = SubjectPlacement.byDivergence();

    @Test
    void ranksTheSubjectAScopeReadsMostLikeFirst() {
        assertThat(placement.of(SCOPE, List.of(FAR, NEAR))).extracting(SubjectPlacement.Placement::concept)
                .containsExactly("cs.CL", "astro-ph");
    }

    @Test
    void reportsADistanceOnTheSameBoundedScaleTwoScopesAreComparedOn() {
        final List<SubjectPlacement.Placement> placements = placement.of(SCOPE, List.of(NEAR, FAR));
        assertAll(
                () -> assertThat(placements).allSatisfy(each ->
                        assertThat(each.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(placements.getLast().bits())
                        .as("nothing shared is the whole bit the statistic can spend")
                        .isEqualTo(1.0));
    }

    @Test
    void carriesTheGroupASubjectRollsUpToSoAPlacementCanBeReadAtThatLevel() {
        assertThat(placement.of(SCOPE, List.of(NEAR)).getFirst().group()).isEqualTo("grp_cs");
    }

    @Test
    void placesNothingAgainstAnEmptyTaxonomy() {
        assertThat(placement.of(SCOPE, List.of())).isEmpty();
    }
}
