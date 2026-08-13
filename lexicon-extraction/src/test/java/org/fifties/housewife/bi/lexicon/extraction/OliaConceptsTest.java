package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class OliaConceptsTest {

    private static final OwlClass NOUN =
            new OwlClass("http://purl.org/olia/olia.owl#Noun", "Noun", "noun", "");

    private static final OwlClass COMMON_NOUN = new OwlClass("http://purl.org/olia/olia.owl#CommonNoun",
            "CommonNoun", "common noun", "Noun");

    private static final OwlClass IMPORTED = new OwlClass("http://purl.org/olia/olia.owl#Determiner",
            "Determiner", "Determiner", "PronounOrDeterminer");

    private final List<SkosConcept> concepts = new OliaConcepts().in(List.of(NOUN, COMMON_NOUN, IMPORTED));

    @Test
    void takesTheTermAsPublishedBecauseThatIsWhatTheCodeWouldWrite() {
        assertThat(concepts).extracting(SkosConcept::prefLabel)
                .containsExactly("Noun", "CommonNoun", "Determiner");
    }

    @Test
    void keepsTheClassTheOntologyStatesBeneathAnother() {
        assertThat(concept("CommonNoun").broader()).isEqualTo("Noun");
    }

    @Test
    void dropsASuperclassTheFileStatesButDoesNotItselfCarry() {
        assertThat(concept("Determiner").broader())
                .as("a roll-up must not climb to a concept nothing here can answer for")
                .isEmpty();
    }

    @Test
    void takesTheLabelOnlyWhereItSaysSomethingTheIdentifierDoesNot() {
        assertAll(
                () -> assertThat(concept("CommonNoun").altLabel()).isEqualTo("common noun"),
                () -> assertThat(concept("Determiner").altLabel()).isEmpty());
    }

    @Test
    void namesTheOntologyDocumentAConceptWasPublishedIn() {
        assertThat(concepts).extracting(SkosConcept::module).containsOnly("olia.owl");
    }

    @Test
    void statesNoDefinitionBecauseTheOntologyStatesNone() {
        assertThat(concepts).allMatch(concept -> concept.definition().isEmpty());
    }

    private SkosConcept concept(final String term) {
        return concepts.stream().filter(concept -> term.equals(concept.prefLabel())).findFirst()
                .orElseThrow();
    }
}
