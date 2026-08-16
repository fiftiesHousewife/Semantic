package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlacementByDescriptionLengthTest {

    private static final List<Double> SHARES = List.of(1.0, 0.5, 0.25, 0.0625);

    private static final TopicDistribution REPOSITORY = TopicDistribution.ofCitedMass(
            Map.of("computing", 6.0, "linguistics", 3.0, "mathematics", 1.0));

    private final List<SkosConcept> subjects =
            ArxivSubjects.fromClasspath().described().stream().limit(20).toList();

    private final PlacementByDescriptionLength placements = PlacementByDescriptionLength.fromClasspath();

    @Test
    void placesTheRepositoryOnceAtEachShareInTheOrderAsked() {
        assertThat(placements.of(REPOSITORY, subjects, SHARES)).extracting(
                PlacementByDescriptionLength.Placed::share).containsExactlyElementsOf(SHARES);
    }

    @Test
    void namesASubjectTheTaxonomyStatesAndADivergenceInsideItsOwnBound() {
        final List<String> stated = subjects.stream().map(SkosConcept::concept).toList();

        assertThat(placements.of(REPOSITORY, subjects, SHARES)).allSatisfy(placed -> assertAll(
                () -> assertThat(placed.concept()).isIn(stated),
                () -> assertThat(placed.bits()).isBetween(0.0, 1.0)));
    }

    @Test
    void agreesWithTheUntruncatedPlacementAtTheFullLength() {
        final String nearest = SubjectPlacement.byDivergence()
                .of(REPOSITORY, SubjectAreas.fromClasspath().of(subjects)).getFirst().concept();

        assertThat(placements.of(REPOSITORY, subjects, List.of(1.0)).getFirst().concept())
                .isEqualTo(nearest);
    }

    @Test
    void readsShorterDescriptionsAtEverySmallerShare() {
        assertThat(placements.of(REPOSITORY, subjects, SHARES))
                .extracting(PlacementByDescriptionLength.Placed::medianWords)
                .isSortedAccordingTo(java.util.Comparator.reverseOrder());
    }
}
