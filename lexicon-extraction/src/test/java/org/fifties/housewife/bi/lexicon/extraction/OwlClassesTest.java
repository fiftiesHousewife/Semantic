package org.fifties.housewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.STRING;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.as;
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
                <rdfs:comment>A noun that is not
                  a name.</rdfs:comment>
                <owl:versionInfo>EAGLES</owl:versionInfo>
                <rdfs:subClassOf rdf:resource="http://purl.org/olia/olia.owl#Noun"/>
                <rdfs:subClassOf>
                  <owl:Restriction>
                    <rdfs:comment>a condition is not a concept and states no meaning</rdfs:comment>
                    <owl:onProperty rdf:resource="http://purl.org/olia/system.owl#hasTag"/>
                  </owl:Restriction>
                </rdfs:subClassOf>
              </owl:Class>
              <owl:Class rdf:about="#Noun"/>
              <owl:Class rdf:about="http://purl.org/olia/olia.owl#CommonNoun">
                <rdfs:comment>Not a proper noun.</rdfs:comment>
                <owl:versionInfo>Santorini 1991</owl:versionInfo>
              </owl:Class>
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
                () -> assertThat(noun.statedIn("http://www.w3.org/2000/01/rdf-schema#label")).containsExactly("common noun"),
                () -> assertThat(noun.broader()).isEqualTo("Noun"));
    }

    @Test
    void readsWhatTheOntologySaysAConceptMeansAndWhereItTookItFrom() {
        final OwlClass noun = owl("CommonNoun");
        assertAll(
                () -> assertThat(noun.statedIn("http://www.w3.org/2000/01/rdf-schema#comment")).first(as(STRING)).contains("A noun that is not"),
                () -> assertThat(noun.statedIn("http://www.w3.org/2002/07/owl#versionInfo")).contains("EAGLES"));
    }

    @Test
    void keepsEveryStatementOfARepeatedPropertyWhereAClassIsWrittenOutTwice() {
        final OwlClass noun = owl("CommonNoun");
        assertAll(
                () -> assertThat(noun.statedIn("http://www.w3.org/2000/01/rdf-schema#comment"))
                        .as("a definition stated in the second class element is one the ontology states")
                        .hasSize(2).last(as(STRING)).isEqualTo("Not a proper noun."),
                () -> assertThat(noun.statedIn("http://www.w3.org/2002/07/owl#versionInfo")).containsExactly("EAGLES", "Santorini 1991"));
    }

    @Test
    void passesOverWhatANestedRestrictionSaysAboutItself() {
        assertThat(owl("CommonNoun").statedIn("http://www.w3.org/2000/01/rdf-schema#comment"))
                .as("a condition inside a class is not a statement about the class")
                .noneMatch(comment -> comment.contains("a condition is not a concept"));
    }

    @Test
    void statesNothingForAConceptTheOntologyDefinesNowhere() {
        assertAll(
                () -> assertThat(owl("Noun").statedIn("http://www.w3.org/2000/01/rdf-schema#comment")).isEmpty(),
                () -> assertThat(owl("Noun").statedIn("http://www.w3.org/2002/07/owl#versionInfo")).isEmpty());
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
        assertThat(owl("Noun").statedIn("http://www.w3.org/2000/01/rdf-schema#label"))
                .containsExactly("noun");
    }

    @Test
    void passesOverAnAnonymousClassBecauseARestrictionStatesAConditionNotAConcept() {
        assertThat(classes).extracting(OwlClass::id)
                .doesNotContain("an anonymous restriction is not a concept");
    }

    @Test
    void readsASuperclassWrittenAsANestedClassRatherThanAsAReference() {
        final String nested = """
                <?xml version="1.0"?>
                <rdf:RDF xml:base="http://purl.org/olia/olia.owl"
                         xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                         xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
                         xmlns:owl="http://www.w3.org/2002/07/owl#">
                  <owl:Class rdf:about="#FiniteVerb">
                    <rdfs:subClassOf>
                      <owl:Class rdf:about="#Verb"/>
                    </rdfs:subClassOf>
                  </owl:Class>
                </rdf:RDF>
                """;

        assertThat(new OwlClasses().in(nested.getBytes(StandardCharsets.UTF_8)).stream()
                .filter(owl -> "FiniteVerb".equals(owl.id())).findFirst().orElseThrow().broader())
                .as("OLiA writes 627 of its 1,422 superclasses this way, and an attribute-only reading "
                        + "lost every one of them — leaving more than half the ontology as loose roots")
                .isEqualTo("Verb");
    }

    @Test
    void readsAClassDeclaredByIdRatherThanByAbout() {
        final String byId = """
                <?xml version="1.0"?>
                <rdf:RDF xml:base="http://purl.org/olia/olia.owl"
                         xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
                         xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
                         xmlns:owl="http://www.w3.org/2002/07/owl#">
                  <owl:Class rdf:ID="QualitativeVerb">
                    <rdfs:subClassOf rdf:resource="#MainVerb"/>
                  </owl:Class>
                </rdf:RDF>
                """;

        assertThat(new OwlClasses().in(byId.getBytes(StandardCharsets.UTF_8)))
                .as("a class states its own name with rdf:ID as readily as with rdf:about")
                .extracting(OwlClass::id).contains("QualitativeVerb");
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
