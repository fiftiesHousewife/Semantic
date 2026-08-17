package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FunctionPlacementTest {

    private static final Map<String, List<String>> FRAMEWORK = Map.of(
            "GV", List.of("The organisation states its policy and its risk appetite",
                    "Leadership sets the direction of the security programme"),
            "DE", List.of("Anomalies and events are detected and analysed",
                    "Continuous monitoring finds indicators of compromise"),
            "RC", List.of("Recovery plans are executed and communicated",
                    "Restoration of services after an incident is verified"));

    private static final TopicDistribution CODE = TopicDistribution.ofCitedMass(
            Map.of("computing", 7.0, "linguistics", 2.0, "law", 1.0));

    private final FunctionPlacement placement =
            new FunctionPlacement(SubjectAreas.fromClasspath(), new JensenShannon()::divergence,
                    new PermutedAssignment(), 30);

    @Test
    void placesTheScopeAgainstEveryFunctionTheFrameworkStates() {
        assertThat(placement.of(CODE, FRAMEWORK)).extracting(SubjectPlacement.Placement::concept)
                .containsExactlyInAnyOrder("GV", "DE", "RC");
    }

    @Test
    void ordersTheFunctionsNearestFirst() {
        assertThat(placement.of(CODE, FRAMEWORK)).extracting(SubjectPlacement.Placement::bits)
                .isSortedAccordingTo(java.util.Comparator.naturalOrder());
    }

    @Test
    void statesEveryDivergenceInsideTheBoundItsOwnDefinitionGivesIt() {
        assertThat(placement.of(CODE, FRAMEWORK))
                .allSatisfy(placed -> assertThat(placed.bits()).isBetween(0.0, 1.0));
    }

    @Test
    void poolsAFunctionFromWhatEachStatementCommitsReadOnItsOwn() {
        final SubjectAreas areas = SubjectAreas.fromClasspath();
        final List<FileTopics> readings = FRAMEWORK.get("DE").stream()
                .map(statement -> areas.topicsIn("DE", statement))
                .toList();
        final TopicDistribution pooled = TopicDistribution.of(readings.stream()
                        .flatMap(reading -> reading.massByTopic().entrySet().stream())
                        .collect(Collectors.groupingBy(Map.Entry::getKey,
                                Collectors.summingDouble(Map.Entry::getValue))),
                readings.stream().mapToDouble(FileTopics::unplacedMass).sum());

        assertThat(placement.of(CODE, FRAMEWORK))
                .filteredOn(placed -> placed.concept().equals("DE"))
                .singleElement()
                .extracting(SubjectPlacement.Placement::bits)
                .isEqualTo(new JensenShannon().divergence(CODE, pooled));
    }

    @Test
    void drawsAChancePartitionOverTheSameFieldSizeAndTheSameStatements() {
        final double nearest = placement.of(CODE, FRAMEWORK).getFirst().bits();
        final SubjectNull.Chance chance = placement.chance(nearest, CODE, FRAMEWORK, new Random(5L));

        assertAll(
                () -> assertThat(chance.subjects()).isEqualTo(3),
                () -> assertThat(chance.nearest()).isEqualTo(nearest),
                () -> assertThat(chance.chanceNearest()).isBetween(0.0, 1.0),
                () -> assertThat(chance.resamples()).isPositive());
    }

    @Test
    void reproducesTheSameChanceFromTheSameSeed() {
        final double nearest = placement.of(CODE, FRAMEWORK).getFirst().bits();

        assertThat(placement.chance(nearest, CODE, FRAMEWORK, new Random(9L)).chanceNearest())
                .isEqualTo(placement.chance(nearest, CODE, FRAMEWORK, new Random(9L)).chanceNearest());
    }
}
