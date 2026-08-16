package org.fifties.housewife.codesemantics.engine.reading;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class LegibilityReportTest {

    private static final ScopeLegibility SCOPE = new ScopeLegibility("engine/src/main/java", 12,
            new OccurrenceCounts(500, 900, 1_100, 1_600, 40, 800, 200),
            Map.of(EvidenceSource.WORD_FREQUENCY, 1_500, EvidenceSource.WORDNET_SENSE, 900),
            Map.of(EvidenceSource.WORD_FREQUENCY, 700, EvidenceSource.WORDNET_SENSE, 100),
            new UnreadWords(Map.of("dsl", 30, "tconst", 4), Map.of("dsl", "Reading.java:7",
                    "tconst", "Reading.java:9")),
            new WrittenWords());

    private final RepositoryLegibility reading =
            new RepositoryLegibility(List.of(SCOPE), SCOPE, Duration.ofMillis(2_400));

    private final String report = new LegibilityReport().render(reading);

    @Test
    void reportsEveryShareBesideTheCountItCameFrom() {
        assertAll(
                () -> assertThat(report).contains("| `engine/src/main/java` | 12 | 500 | 900 "
                        + "| 1,100 (55.0%) | 1,600 | **0.800** |"),
                () -> assertThat(report).contains("**engine/src/main/java**"));
    }

    @Test
    void namesTheResourcesThatCarriedTheReadingMostFirst() {
        assertThat(report).containsSubsequence("lexicon:word-frequency", "lexicon:wordnet-sense");
    }

    @Test
    void reportsTheSharesOfOverlappingResourcesWithoutPretendingTheySumToOne() {
        assertAll(
                () -> assertThat(report).contains("| `lexicon:word-frequency` | 1,500 | 75.0% | 700 |"),
                () -> assertThat(report).contains("| `lexicon:wordnet-sense` | 900 | 45.0% | 100 |"));
    }

    @Test
    void saysWhatEachResourceCarriesByItself() {
        assertThat(SCOPE.occurrencesRestingOn(EvidenceSource.WORD_FREQUENCY)).isEqualTo(700);
    }

    @Test
    void namesWhatNothingCouldReadAndWhereToSeeIt() {
        assertThat(report).contains("| `dsl` | 30 | `Reading.java:7` |");
    }

    @Test
    void statesTheLengthOfTheTailAsWellAsItsHead() {
        assertThat(report).contains("2,000 occurrences of 800 distinct surfaces, 200 of them (25.0%)");
    }

    @Test
    void recordsWhatTheReadingCost() {
        assertThat(report).contains("Read 12 files in 2.4 s — 200.0 ms a file");
    }
}
