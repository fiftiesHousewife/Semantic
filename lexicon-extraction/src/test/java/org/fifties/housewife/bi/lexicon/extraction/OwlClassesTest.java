package org.fifties.housewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class OwlClassesTest {

    private static final String ONTOLOGY = """
            <?xml version="1.0"?>
            <rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                     xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
                     xmlns:owl="http://www.w3.org/2002/07/owl#"
                     xml:base="http://purl.org/olia/olia.owl">
              <owl:Class rdf:about="http://purl.org/olia/olia.owl#CommonNoun">
                <rdfs:label>common noun</rdfs:label>
                <rdfs:subClassOf rdf:resource="http://purl.org/olia/olia.owl#Noun"/>
                <rdfs:subClassOf>
                  <owl:Restriction>
                    <owl:onProperty rdf:resource="http://purl.org/olia/system.owl#hasTag"/>
                  </owl:Restriction>
                </rdfs:subClassOf>
              </owl:Class>
              <owl:Class rdf:about="#Noun"/>
              <owl:Class rdf:about="http://purl.org/olia/olia.owl#Noun">
                <rdfs:label>noun</rdfs:label>
              </owl:Class>
              <owl:Class>
                <rdfs:label>an anonymous restriction is not a concept</rdfs:label>
              </owl:Class>
            </rdf:RDF>
            """;

    private final List<OwlClass> classes = new OwlClasses().in(ONTOLOGY.getBytes(StandardCharsets.UTF_8));

    @Test
    void readsAClassAsTheOntologyIdentifiesLabelsAndNestsIt() {
        final OwlClass noun = owl("CommonNoun");
        assertAll(
                () -> assertThat(noun.concept()).isEqualTo("http://purl.org/olia/olia.owl#CommonNoun"),
                () -> assertThat(noun.label()).isEqualTo("common noun"),
                () -> assertThat(noun.broader()).isEqualTo("Noun"));
    }

    @Test
    void takesTheFragmentAsTheTermBecauseThatIsWhatAProgramWouldWrite() {
        assertThat(classes).extracting(OwlClass::id).contains("CommonNoun", "Noun");
    }

    @Test
    void readsAFragmentReferenceAsTheConceptItsOwnBaseResolvesItTo() {
        assertAll(
                () -> assertThat(classes).extracting(OwlClass::concept)
                        .doesNotContain("#Noun")
                        .contains("http://purl.org/olia/olia.owl#Noun"),
                () -> assertThat(classes).hasSize(2));
    }

    @Test
    void keepsWhatTheOntologySaysWhereItWritesTheSameClassOutTwice() {
        assertThat(owl("Noun").label()).isEqualTo("noun");
    }

    @Test
    void passesOverAnAnonymousClassBecauseARestrictionStatesAConditionNotAConcept() {
        assertThat(classes).extracting(OwlClass::label)
                .doesNotContain("an anonymous restriction is not a concept");
    }

    @Test
    void takesOnlyASuperclassStatedByNameAndNotTheRestrictionBesideIt() {
        assertThat(owl("CommonNoun").broader()).isEqualTo("Noun");
    }

    @Test
    void refusesADocumentStatingNoNamedClassRatherThanReadingItAsEmpty() {
        assertThatThrownBy(() -> new OwlClasses().in("""
                <rdf:RDF xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"/>
                """.getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("no named OWL class");
    }

    @Test
    void refusesADocumentThatIsNotXmlAtAll() {
        assertThatThrownBy(() -> new OwlClasses().in("not xml".getBytes(StandardCharsets.UTF_8)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Malformed RDF/XML");
    }

    private OwlClass owl(final String id) {
        return classes.stream().filter(owl -> id.equals(owl.id())).findFirst().orElseThrow();
    }
}
