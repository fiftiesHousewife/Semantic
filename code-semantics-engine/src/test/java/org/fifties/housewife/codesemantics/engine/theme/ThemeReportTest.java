package org.fifties.housewife.codesemantics.engine.theme;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.behaviour.Behaviour;
import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;
import org.fifties.housewife.codesemantics.engine.theme.JensenShannon.Contribution;
import org.fifties.housewife.codesemantics.engine.theme.PermutationNull.Chance;
import org.fifties.housewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ThemeReportTest {

    private static final FileTopics FILE = new FileTopics("engine/src/main/java/Reading.java", 120,
            Map.of("linguistics", 9.0, "music", 1.0), Map.of("linguistics", 9.0, "music", 0.5),
            Map.of("linguistics", 90, "music", 10), 4, 104);

    private final TopicWitnesses witnesses = new TopicWitnesses();

    private RepositoryThemes themes(final Chance chance) {
        witnesses.record("linguistics", "word", "word segmenter", "Reading.java:7",
                EvidenceSource.WORDNET_DOMAIN, 1.0);
        witnesses.record("music", "string", "string builder", "Reading.java:9",
                EvidenceSource.WIKTIONARY_TOPIC, 1.0);
        final TopicDistribution intensity = FILE.distribution();
        final ScopeThemes scope = new ScopeThemes("engine/src/main/java", 1, 1, 120, intensity);
        return new RepositoryThemes(List.of(scope), new ScopeThemes("repository", 1, 1, 120, intensity),
                List.of(new ScopeDivergence("engine/src/main/java", 0.25,
                        List.of(new Contribution("linguistics", 0.05, 0.20, 0.9, 0.5),
                                new Contribution("music", 0.0125, 0.05, 0.1, 0.5)),
                        chance)),
                new TopicRankings(List.of(FILE),
                        Map.of(FILE.path(), new ValueShare<>("linguistics", 0.9, 9.0)), witnesses)
                        .of(intensity),
                List.of(FILE), Map.of(FILE.path(), new ValueShare<>("linguistics", 0.9, 9.0)),
                witnesses, sightings(), List.of(new ForeignWords.ForeignWord("harvest", 0.87, 4,
                        List.of("agriculture"), "Reading.java:11")),
                List.of(new Behaviour("refuse", List.of("a", "line", "range", "that", "runs", "backwards"),
                        "refusesALineRangeThatRunsBackwards", "SourceAnchorTest.java:71")),
                Duration.ofMillis(2_500));
    }

    private static WordSightings sightings() {
        final WordSightings seen = new WordSightings();
        seen.saw("harvest", "Reading.java:11", true);
        return seen;
    }

    private static Chance beatingChance() {
        return new Chance(0.25, 0.05, 0.20, 0.10, 0, 999);
    }

    private static Chance withinChance() {
        return new Chance(0.25, 0.30, -0.05, 0.40, 640, 999);
    }

    @Test
    void ranksTheRepositorysTopicsWithTheWordsCarryingThem() {
        final String report = new ThemeReport().render(themes(beatingChance()));

        assertAll(
                () -> assertThat(report)
                        .contains("| `linguistics` | 0.9000 | 100.0% | 90 | 1 | 120 | 100.0% |"),
                () -> assertThat(report).contains("`word`&nbsp;1"),
                () -> assertThat(report)
                        .as("music took half its mass from prose, and the row says so")
                        .contains("| `music` | 0.1000 | 50.0% | 10 | 0 | 0 | 0.0% |"));
    }

    @Test
    void statesTheDivergenceBesideTheFieldItHadToBeat() {
        assertThat(new ThemeReport().render(themes(beatingChance())))
                .contains("**0.2500 bits** from the repository, against a null median of 0.0500 over 999 "
                        + "resamples of the same size — an excess of +0.2000, and 0 of those draws diverged "
                        + "at least as far.");
    }

    @Test
    void ranksAScopesTopicsOnlyWhenItStoodOutsideItsOwnNull() {
        assertAll(
                () -> assertThat(new ThemeReport().render(themes(beatingChance())))
                        .contains("| 20.0% | `linguistics` | 0.9000 | 0.5000 | **over** |"),
                () -> assertThat(new ThemeReport().render(themes(withinChance())))
                        .as("a caveat is not what gets quoted, so nothing is ranked at all")
                        .doesNotContain("| 20.0% | `linguistics` |")
                        .contains("no topical content beyond its size"));
    }

    @Test
    void reportsWhatTheReadingCostAndWhatItCouldNotResolve() {
        final String report = new ThemeReport().render(themes(beatingChance()));

        assertAll(
                () -> assertThat(report).contains("Read, compared and resampled in 2.5 s"),
                () -> assertThat(report).contains("0 files no topic could be resolved for"));
    }
}
