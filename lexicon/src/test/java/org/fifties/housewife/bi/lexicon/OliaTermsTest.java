package org.fifties.housewife.bi.lexicon;

import java.util.function.Function;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class OliaTermsTest {

    private final OliaTerms terms = OliaTerms.fromClasspath();

    @Test
    void statesTheVocabularyOfLinguisticAnnotation() {
        assertThat(terms.terms()).hasSize(1312)
                .contains("Noun", "Verb", "Phrase", "CommonNoun", "AdjectivePhrase", "Determiner");
    }

    @Test
    void findsATermWhateverCaseItIsAskedIn() {
        assertAll(
                () -> assertThat(terms.conceptsOf("commonnoun")).isNotEmpty(),
                () -> assertThat(terms.conceptsOf("CommonNoun")).isNotEmpty(),
                () -> assertThat(terms.conceptsOf("COMMONNOUN")).isNotEmpty());
    }

    @Test
    void namesTheOntologysOwnIdentifierRatherThanANormalisedCopyOfIt() {
        assertAll(
                () -> assertThat(terms.conceptsOf("commonnoun").getFirst().prefLabel())
                        .isEqualTo("CommonNoun"),
                () -> assertThat(terms.conceptsOf("commonnoun").getFirst().concept())
                        .isEqualTo("http://purl.org/olia/olia.owl#CommonNoun"));
    }

    @Test
    void carriesTheClassTheOntologyStatesATermBeneath() {
        assertThat(terms.conceptsOf("pragmaticfeature").getFirst().broader())
                .isEqualTo("LinguisticConcept");
    }

    @Test
    void statesTheSuperclassTheOntologyNamesHoweverItSpellsIt() {
        assertThat(terms.conceptsOf("commonnoun").getFirst().broader())
                .as("written as a class nested inside the subClassOf rather than as a reference on it — "
                        + "the spelling this extraction could not read, and 627 of the ontology's 1,422 "
                        + "superclasses are written that way")
                .isEqualTo("Noun");
    }

    @Test
    void abstainsOnATermTheOntologyDoesNotState() {
        assertThat(terms.conceptsOf("interestrateswap")).isEmpty();
    }

    @Test
    void carriesTheTermsARelativeReferenceWouldOtherwiseHaveHidden() {
        assertThat(terms.conceptsOf("questionword"))
                .as("a concept written as a bare fragment reads back as a comment unless it is resolved")
                .isNotEmpty();
    }

    @Test
    void carriesWhatTheOntologySaysEachConceptMeans() {
        assertAll(
                () -> assertThat(withA(SkosConcept::definition))
                        .as("THE LOSS, MEASURED. The ontology states rdfs:comment on 1,216 of its 1,312 "
                                + "classes and every one of them was written into this file as an empty "
                                + "column, on the belief that OLiA states its meaning only through its "
                                + "hierarchy. A definition is prose, and prose is what makes a concept "
                                + "matchable by what it means rather than by what it is called.")
                        .isEqualTo(1216),
                () -> assertThat(statementsOf(SkosConcept::definition))
                        .as("and where it states two definitions for one concept both are carried, so the "
                                + "count of statements exceeds the count of concepts")
                        .isEqualTo(1271),
                () -> assertThat(terms.conceptsOf("commonnoun").getFirst().definition())
                        .contains("a noun that signifies a non-specific member of a group"));
    }

    @Test
    void carriesWhereTheOntologySaysItTookEachConceptFrom() {
        assertAll(
                () -> assertThat(withA(SkosConcept::note))
                        .as("THE LOSS, MEASURED. owl:versionInfo names the tagset or the published scheme "
                                + "a concept was adopted to cover — EAGLES, the Penn Treebank guidelines, "
                                + "TuBa-D/Z — and it is the only thing in this shape that makes a match "
                                + "citable to a scheme outside the taxonomy.")
                        .isEqualTo(780),
                () -> assertThat(statementsOf(SkosConcept::note)).isEqualTo(949),
                () -> assertThat(terms.conceptsOf("commonnoun").getFirst().note()).contains("EAGLES"));
    }

    @Test
    void readsEveryRowBackAsTheColumnsItWasWrittenAs() {
        assertThat(terms.concepts())
                .as("a field carrying a tab or a line break would be read back as a column or a row "
                        + "nobody wrote, and the definitions are prose the ontology laid out over lines")
                .allSatisfy(concept -> assertThat(concept.definition()).doesNotContain("\t", "\n"));
    }

    private long withA(final Function<SkosConcept, String> property) {
        return terms.concepts().stream().map(property).filter(stated -> !stated.isEmpty()).count();
    }

    private long statementsOf(final Function<SkosConcept, String> property) {
        return terms.concepts().stream().map(property).filter(stated -> !stated.isEmpty())
                .mapToLong(stated -> stated.split(java.util.regex.Pattern.quote(SkosConcept.STATEMENTS), -1).length)
                .sum();
    }
}
