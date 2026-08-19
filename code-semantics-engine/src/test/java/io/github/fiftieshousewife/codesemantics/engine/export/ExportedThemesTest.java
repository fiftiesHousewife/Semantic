package io.github.fiftieshousewife.codesemantics.engine.export;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ValueShare;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary.Distinctive;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary.Field;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary.Legibility;
import io.github.fiftieshousewife.codesemantics.engine.theme.FileTopics;
import io.github.fiftieshousewife.codesemantics.engine.theme.JensenShannon.Contribution;
import io.github.fiftieshousewife.codesemantics.engine.theme.PermutationNull.Chance;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.theme.ScopeDivergence;
import io.github.fiftieshousewife.codesemantics.engine.theme.ScopeThemes;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicWitnesses;
import io.github.fiftieshousewife.codesemantics.engine.theme.WordSightings;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalStateException;
import static org.assertj.core.data.Offset.offset;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedThemesTest {

    private static final String SCOPE = "engine/src/main/java";

    private static final FileTopics FILE = new FileTopics(SCOPE + "/Reading.java", 120,
            Map.of("linguistics", 9.0, "music", 1.0), 4.0, Map.of("linguistics", 9.0, "music", 0.5),
            Map.of("linguistics", 90, "music", 10), 4, 104);

    private final TopicWitnesses witnesses = new TopicWitnesses();

    private final ExportedThemes themes = new ExportedThemes(4);

    private RepositoryThemes reading() {
        witnesses.record("linguistics", "word", "word segmenter", "Reading.java:7",
                EvidenceSource.WORDNET_DOMAIN, 3.0);
        witnesses.record("linguistics", "lemma", "lemma of a word", "Reading.java:8",
                EvidenceSource.WIKTIONARY_TOPIC, 2.0);
        witnesses.record("music", "string", "string builder", "Reading.java:9",
                EvidenceSource.WIKTIONARY_TOPIC, 1.0);
        final TopicDistribution intensity = FILE.distribution();
        final ScopeThemes scope = new ScopeThemes(SCOPE, 1, 1, 120, intensity, intensity.amongWhatWasPlaced());
        return new RepositoryThemes(List.of(scope), scope,
                List.of(new ScopeDivergence(SCOPE, 0.25,
                        List.of(new Contribution("linguistics", 0.20, 0.80, 0.9, 0.5),
                                new Contribution("music", 0.05, 0.20, 0.1, 0.5)),
                        new Chance(0.25, 0.05, 0.20, 0.10, 0, 999))),
                List.of(), List.of(FILE), Map.of(FILE.path(), new ValueShare<>("linguistics", 0.9, 9.0)),
                witnesses, new WordSightings(), List.of(), List.of(), Duration.ofMillis(1));
    }

    private static ReadingSummary summary(final List<String> topics) {
        return new ReadingSummary("CodeSemantics", new Legibility(0.98, 100, 1, 0.7, 0.76),
                new Field(new Field.Nearest("Computer Science", 0.34, 0.41),
                        new Field.Nearest("cs.CL Computation and Language", 0.395, 0.445), "math", 0.38),
                List.of(new Distinctive(SCOPE, 0.25, topics)), topics, List.of());
    }

    @Test
    void carriesEachTopicWithItsShareItsBitsAndTheWordsThatProducedIt() {
        final List<ExportedTheme> exported = themes.in(summary(List.of("linguistics")), reading());

        assertAll(
                () -> assertThat(exported).singleElement().extracting(ExportedTheme::topic)
                        .isEqualTo("linguistics"),
                () -> assertThat(exported.getFirst().scope()).isEqualTo(SCOPE),
                () -> assertThat(exported.getFirst().divergenceBits()).isEqualTo(0.20),
                () -> assertThat(exported.getFirst().shareOfRepository())
                        .as("a share is of everything observed, so the mass nothing placed stays in it")
                        .isCloseTo(9.0 / 14.0, offset(1e-9)),
                () -> assertThat(exported.getFirst().carriedBy()).map(ExportedWitness::word)
                        .containsExactly("word", "lemma"));
    }

    @Test
    void carriesEachWitnessesOccurrencesMassAndNamingResource() {
        final ExportedWitness carried =
                themes.in(summary(List.of("linguistics")), reading()).getFirst().carriedBy().getFirst();

        assertAll(
                () -> assertThat(carried.word()).isEqualTo("word"),
                () -> assertThat(carried.occurrences()).isEqualTo(1),
                () -> assertThat(carried.mass()).isEqualTo(3.0),
                () -> assertThat(carried.sources())
                        .containsExactly(EvidenceSource.WORDNET_DOMAIN.displayName()));
    }

    @Test
    void quotesThePhraseAWordWasReadInWithTheFileAndLineItWasWrittenAt() {
        final ExportedQuotation quoted = themes.in(summary(List.of("linguistics")), reading())
                .getFirst().carriedBy().getFirst().quotations().getFirst();

        assertAll(
                () -> assertThat(quoted.phrase()).isEqualTo("word segmenter"),
                () -> assertThat(quoted.site().file()).isEqualTo("Reading.java"),
                () -> assertThat(quoted.site().line()).isEqualTo(7));
    }

    @Test
    void ordersTheRowsByTheirTermOfADivergence() {
        assertThat(themes.in(summary(List.of("music", "linguistics")), reading()))
                .map(ExportedTheme::topic)
                .containsExactly("linguistics", "music");
    }

    @Test
    void reportsATopicCarryingNoneOfItsScopesDivergenceAsADefectRatherThanAsAZero() {
        assertThatIllegalStateException()
                .isThrownBy(() -> themes.in(summary(List.of("geology")), reading()))
                .withMessageContaining("geology");
    }
}
