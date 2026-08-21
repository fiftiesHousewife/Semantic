package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PublishedRunsTest {

    private static final String NOTHING = "";

    private static SkosConcept published(final String label) {
        return new SkosConcept(label, label, NOTHING, NOTHING, "topic", NOTHING, NOTHING, NOTHING);
    }

    private static PublishedRuns runs(final String... labels) {
        return new PublishedRuns(IdentifierWords.fromClasspath(),
                List.of(labels).stream().map(PublishedRunsTest::published).toList());
    }

    @Test
    void findsARunAPublisherStatesWhateverCaseEitherSideWroteIt() {
        assertThat(runs("Word Sense Disambiguation").statedBy("word sense disambiguation"))
                .extracting(SkosConcept::prefLabel)
                .containsExactly("Word Sense Disambiguation");
    }

    @Test
    void findsARunNoPublisherStates() {
        assertThat(runs("Word Sense Disambiguation").statedBy("interest rate swap")).isEmpty();
    }

    @Test
    void readsAPublishedLabelThroughTheSameSplitterTheRepositoryIsReadWith() {
        assertAll(
                () -> assertThat(runs("Text-Mining").statedBy("text mining")).hasSize(1),
                () -> assertThat(runs("XMLSchema").statedBy("xml schema")).hasSize(1));
    }

    @Test
    void keepsEveryPublisherOfTheSameRunRatherThanTheFirst() {
        assertThat(runs("Text Mining", "Text Mining").statedBy("text mining")).hasSize(2);
    }

    @Test
    void statesHowManyRunsItHolds() {
        assertThat(runs("Text Mining", "Word Sense Disambiguation").size()).isEqualTo(2);
    }
}
