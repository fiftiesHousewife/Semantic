package org.fifties.housewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class FiboManifestTest {

    private static final String MANIFEST = """
            <?xml version="1.0"?>
            <rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                     xmlns:owl="http://www.w3.org/2002/07/owl#">
              <owl:Ontology rdf:about="https://spec.edmcouncil.org/fibo/ontology/AboutFIBOProd-TBoxOnly/">
                <owl:imports rdf:resource="https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"/>
                <owl:imports rdf:resource="https://spec.edmcouncil.org/fibo/ontology/SEC/Debt/DebtInstruments/"/>
                <owl:imports rdf:resource="https://spec.edmcouncil.org/fibo/ontology/DER/RateDerivatives/IRSwaps/"/>
                <owl:imports rdf:resource="https://www.omg.org/spec/Commons/AnnotationVocabulary/"/>
              </owl:Ontology>
            </rdf:RDF>
            """;

    private final FiboManifest manifest = new FiboManifest();

    @Test
    void readsEachImportedOntologyAsThePathTheRepositoryLaysItOutAt() {
        assertThat(ontologiesIn(MANIFEST))
                .containsExactly("DER/RateDerivatives/IRSwaps.rdf", "SEC/Debt/DebtInstruments.rdf");
    }

    @Test
    void passesOverAnImportOfSomebodyElsesOntology() {
        assertThat(ontologiesIn(MANIFEST))
                .as("a file set carries what it carries, and the Commons vocabulary is not FIBO's to ship")
                .noneMatch(path -> path.contains("Commons"));
    }

    @Test
    void namesAnOntologyOnceHoweverOftenTheManifestImportsIt() {
        assertThat(ontologiesIn(MANIFEST)).containsOnlyOnce("DER/RateDerivatives/IRSwaps.rdf");
    }

    @Test
    void refusesADocumentThatImportsNoFiboOntologyRatherThanReadingItAsEmpty() {
        assertThatThrownBy(() -> ontologiesIn("<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"/>"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("production manifest");
    }

    private java.util.List<String> ontologiesIn(final String document) {
        return manifest.ontologiesIn(document.getBytes(StandardCharsets.UTF_8));
    }
}
