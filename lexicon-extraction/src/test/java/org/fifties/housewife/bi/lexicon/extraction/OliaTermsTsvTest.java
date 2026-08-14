package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class OliaTermsTsvTest {

    private static final List<SkosConcept> CONCEPTS = List.of(
            new SkosConcept("http://purl.org/olia/olia.owl#CommonNoun", "CommonNoun", "common noun", "Noun",
                    "class", "olia.owl", "A noun that is not a name.",
                    "EAGLES"));

    private static final String SOURCE = "https://example.invalid/olia.owl";

    private final String rendered = new OliaTermsTsv().render(CONCEPTS, SOURCE);

    @Test
    void statesWhereTheOntologyCameFromAndOnWhatTerms() {
        assertAll(
                () -> assertThat(rendered).contains("# Source: OLiA's core ontology olia.owl"),
                () -> assertThat(rendered).contains(SOURCE),
                () -> assertThat(rendered).contains("# Licence: CC BY 3.0 Unported"));
    }

    @Test
    void carriesTheAttributionTheLicenceRequires() {
        assertAll(
                () -> assertThat(rendered).contains("Christian Chiarcos"),
                () -> assertThat(rendered).contains("Ontologies of Linguistic Annotation"));
    }

    @Test
    void saysTheCodeAndTheDataAreNotUnderTheSameTerms() {
        assertThat(rendered).contains("code is Apache-2.0 and its data is not");
    }

    @Test
    void saysThisTaxonomyIsMeantToBeMatchedUnlikeTheOnesBesideIt() {
        assertThat(rendered).contains("meant to be");
    }

    @Test
    void writesEveryTermBelowTheHeader() {
        assertThat(rendered).endsWith(
                "http://purl.org/olia/olia.owl#CommonNoun\tCommonNoun\tcommon noun\tNoun\tclass\tolia.owl\t"
                        + "A noun that is not a name.\tEAGLES\n");
    }
}
