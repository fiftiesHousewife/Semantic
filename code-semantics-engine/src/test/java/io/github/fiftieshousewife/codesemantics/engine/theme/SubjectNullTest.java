package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SubjectNullTest {

    private static final List<String> DESCRIPTIONS = List.of(
            "Covers indexing, dictionaries, retrieval, content and analysis.",
            "Enriched categories, topoi, abelian categories, monoidal categories, homological algebra.",
            "Covers natural language processing, computational linguistics and speech.");

    private static final TopicDistribution SCOPE =
            new TopicDistribution(Map.of("linguistics", 0.7, "computing", 0.3), 0.0);

    private static final int DRAWS = 40;

    private final SubjectNull chance = new SubjectNull(SubjectAreas.fromClasspath(),
            new JensenShannon()::divergence, DRAWS, new Random(20260813L));

    @Test
    void readsTheBestOfAFieldFromHowLargeTheFieldIsRatherThanFromAChosenRank() {
        assertAll(
                () -> assertThat(SubjectNull.bestOf(152, 999)).isEqualTo(6),
                () -> assertThat(SubjectNull.bestOf(1, 999))
                        .as("a field of one gets one attempt, so its bar is the median")
                        .isEqualTo(499),
                () -> assertThat(SubjectNull.bestOf(4000, 999))
                        .as("a field larger than the draws cannot ask for a rank nobody drew")
                        .isEqualTo(0));
    }

    @Test
    void drawsAFieldOfChanceSubjectsFromThePooledVocabularyOfTheRealOnes() {
        final SubjectNull.Chance drawn = chance.of(0.2, SCOPE, DESCRIPTIONS);
        assertAll(
                () -> assertThat(drawn.subjects()).isEqualTo(DESCRIPTIONS.size()),
                () -> assertThat(drawn.resamples()).isLessThanOrEqualTo(DRAWS),
                () -> assertThat(drawn.chanceNearest()).isBetween(0.0, 1.0));
    }

    @Test
    void saysAPlacementStandsApartOnlyWhereItBeatsTheNearestChanceOffered() {
        final SubjectNull.Chance drawn = chance.of(0.2, SCOPE, DESCRIPTIONS);
        assertAll(
                () -> assertThat(new SubjectNull.Chance(drawn.chanceNearest() - 0.01, drawn.chanceNearest(),
                        3, DRAWS).standsApart()).isTrue(),
                () -> assertThat(new SubjectNull.Chance(drawn.chanceNearest() + 0.01, drawn.chanceNearest(),
                        3, DRAWS).standsApart()).isFalse());
    }

    @Test
    void drawsTheSameFieldTwiceFromTheSameSeedSoAReportCanBeCompared() {
        assertThat(new SubjectNull(SubjectAreas.fromClasspath(), new JensenShannon()::divergence, DRAWS,
                new Random(20260813L)).of(0.2, SCOPE, DESCRIPTIONS).chanceNearest())
                .isEqualTo(chance.of(0.2, SCOPE, DESCRIPTIONS).chanceNearest());
    }
}
