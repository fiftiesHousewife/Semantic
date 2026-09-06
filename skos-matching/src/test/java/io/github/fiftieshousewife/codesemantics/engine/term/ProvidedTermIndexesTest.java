package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;

class ProvidedTermIndexesTest {

    @Test
    void findsWhatTheClasspathProvidesInTheOrderOfTheSourcesOwnNames() {
        assertThat(ProvidedTermIndexes.fromClasspath())
                .extracting(TermIndex::source)
                .containsExactly("Atlas fixture", "Zebra fixture");
    }

    @Test
    void aProvidedIndexAnswersItsOwnTerms() {
        final TermIndex atlas = ProvidedTermIndexes.fromClasspath().getFirst();

        assertThat(atlas.conceptsOf(List.of("map", "projection")))
                .extracting(SkosConcept::prefLabel)
                .containsExactly("MapProjection");
    }
}
