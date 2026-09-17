package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class DistinctiveSubjectsTest {

    private static TopicDistribution of(final Map<String, Double> shares) {
        return TopicDistribution.ofCitedMass(shares);
    }

    @Test
    void discardsALabelEverySubjectCarriesInTheSameShare() {
        final List<TopicDistribution> scheme = List.of(
                of(Map.of("finance", 0.5, "banking", 0.5)),
                of(Map.of("finance", 0.5, "surgery", 0.5)));

        final List<TopicDistribution> distinctive = new DistinctiveSubjects().over(scheme);

        assertAll(
                () -> assertThat(distinctive.getFirst().shareOf("finance"))
                        .as("both carry it in the same share, so it separates neither")
                        .isZero(),
                () -> assertThat(distinctive.getFirst().shareOf("banking")).isEqualTo(1.0),
                () -> assertThat(distinctive.getLast().shareOf("surgery")).isEqualTo(1.0));
    }

    @Test
    void keepsWhatOneSubjectCarriesMoreOfThanTheSchemeDoes() {
        final List<TopicDistribution> scheme = List.of(
                of(Map.of("finance", 0.9, "computing", 0.1)),
                of(Map.of("finance", 0.1, "computing", 0.9)));

        final List<TopicDistribution> distinctive = new DistinctiveSubjects().over(scheme);

        assertAll(
                () -> assertThat(distinctive.getFirst().shareOf("finance")).isEqualTo(1.0),
                () -> assertThat(distinctive.getFirst().shareOf("computing")).isZero(),
                () -> assertThat(distinctive.getLast().shareOf("computing")).isEqualTo(1.0));
    }

    @Test
    void movesSubjectsFurtherApartThanTheSchemeLeavesThem() {
        final JensenShannon divergence = new JensenShannon();
        final List<TopicDistribution> scheme = List.of(
                of(Map.of("music", 0.49, "chemistry", 0.49, "finance", 0.02)),
                of(Map.of("music", 0.49, "chemistry", 0.49, "surgery", 0.02)));

        final List<TopicDistribution> distinctive = new DistinctiveSubjects().over(scheme);

        assertAll(
                () -> assertThat(divergence.divergence(scheme.get(0), scheme.get(1)))
                        .as("two subjects sharing 98% of their mass are nearly indistinguishable")
                        .isLessThan(0.1),
                () -> assertThat(divergence.divergence(distinctive.get(0), distinctive.get(1)))
                        .as("what is left once the scheme's own mean is removed separates them")
                        .isEqualTo(1.0, within(0.001)));
    }

    @Test
    void leavesASubjectCarryingNothingDistinctiveEmptyRatherThanEven() {
        final List<TopicDistribution> scheme = List.of(
                of(Map.of("music", 0.5, "chemistry", 0.5)),
                of(Map.of("music", 0.5, "chemistry", 0.5)));

        assertThat(new DistinctiveSubjects().over(scheme))
                .as("a subject that reads exactly as the scheme does states nothing of its own")
                .allSatisfy(subject -> assertThat(subject.isEmpty()).isTrue());
    }

    @Test
    void statesNothingForAnEmptyScheme() {
        assertThat(new DistinctiveSubjects().over(List.of())).isEmpty();
    }
}
