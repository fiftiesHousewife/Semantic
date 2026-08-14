package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class OliaConceptsTest {

    private static final OwlClass NOUN =
            new OwlClass("http://purl.org/olia/olia.owl#Noun", "Noun", "noun", "",
                    List.of("A word that names a\n\tthing.", "A word that names a\n\tthing."), List.of("EAGLES"));

    private static final OwlClass COMMON_NOUN = new OwlClass("http://purl.org/olia/olia.owl#CommonNoun",
            "CommonNoun", "common noun", "Noun", List.of("A noun that is not a name.", "Not a proper noun."),
            List.of());

    private static final OwlClass IMPORTED = new OwlClass("http://purl.org/olia/olia.owl#Determiner",
            "Determiner", "Determiner", "PronounOrDeterminer", List.of(), List.of());

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
    void carriesWhatTheOntologySaysAConceptMeans() {
        assertThat(concept("CommonNoun").definition())
                .as("1,272 of these were discarded for as long as this conversion existed")
                .isEqualTo("A noun that is not a name. | Not a proper noun.");
    }

    @Test
    void carriesWhereTheOntologySaysItTookTheConceptFrom() {
        assertThat(concept("Noun").note()).isEqualTo("EAGLES");
    }

    @Test
    void statesTheSameDefinitionOnceWhereTheOntologyWroteTheClassOutTwice() {
        assertThat(concept("Noun").definition()).isEqualTo("A word that names a thing.");
    }

    @Test
    void statesNothingWhereTheOntologyStatesNothing() {
        assertThat(concept("Determiner").definition()).isEmpty();
    }

    private SkosConcept concept(final String term) {
        return concepts.stream().filter(concept -> term.equals(concept.prefLabel())).findFirst()
                .orElseThrow();
    }
}
