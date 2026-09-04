package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FpmlConceptsTest {

    private static final String SCHEMA = """
            <?xml version="1.0" encoding="utf-8"?>
            <xsd:schema xmlns="http://www.fpml.org/FpML-5/confirmation"
                        xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                        targetNamespace="http://www.fpml.org/FpML-5/confirmation">
              <xsd:complexType name="Swap">
                <xsd:annotation>
                  <xsd:documentation xml:lang="en">A type defining swap streams and additional payments
                      between the principal parties involved in the swap.</xsd:documentation>
                </xsd:annotation>
                <xsd:complexContent>
                  <xsd:extension base="Product">
                    <xsd:sequence/>
                  </xsd:extension>
                </xsd:complexContent>
              </xsd:complexType>
              <xsd:complexType name="Product">
                <xsd:sequence/>
              </xsd:complexType>
              <xsd:complexType name="HourMinuteTime">
                <xsd:simpleContent>
                  <xsd:extension base="xsd:token"/>
                </xsd:simpleContent>
              </xsd:complexType>
              <xsd:complexType name="AccountId">
                <xsd:simpleContent>
                  <xsd:extension base="NonEmptyScheme"/>
                </xsd:simpleContent>
              </xsd:complexType>
              <xsd:simpleType name="Scheme">
                <xsd:restriction base="xsd:anyURI"/>
              </xsd:simpleType>
              <xsd:simpleType name="NonEmptyScheme">
                <xsd:restriction base="Scheme"/>
              </xsd:simpleType>
              <xsd:complexType name="PartyRole">
                <xsd:complexContent>
                  <xsd:extension base="Classifier">
                    <xsd:sequence/>
                  </xsd:extension>
                </xsd:complexContent>
              </xsd:complexType>
              <xsd:element name="swap" type="Swap"/>
            </xsd:schema>
            """;

    private static List<SkosConcept> read() {
        return new FpmlConcepts().in(List.of(new ContentDigest.Member("fpml-ird-5-11.xsd",
                SCHEMA.getBytes(StandardCharsets.UTF_8))));
    }

    @Test
    void readsAComplexTypeAsOneConceptOfTheSchemasOwnNamespace() {
        assertThat(read()).extracting(SkosConcept::concept)
                .contains("http://www.fpml.org/FpML-5/confirmation#Swap");
    }

    @Test
    void statesTheExtensionBaseAsBroader() {
        assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("Swap"))
                .extracting(SkosConcept::broader)
                .containsExactly("Product");
    }

    @Test
    void dropsABaseTheSchemaStatesWithAPrefixOfAnotherNamespace() {
        assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("HourMinuteTime"))
                .extracting(SkosConcept::broader)
                .containsExactly("");
    }

    @Test
    void statesABaseTheSchemaDeclaresASimpleTypeAsAFormatAndNotAsABroaderSubject() {
        assertAll(
                () -> assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("AccountId"))
                        .as("FpML declares NonEmptyScheme a simple type, so it is a format constraint and "
                                + "not a subject to climb to")
                        .extracting(SkosConcept::broader)
                        .containsExactly(""),
                () -> assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("AccountId"))
                        .as("the publisher stated it, so it is kept out of the subject walk rather than "
                                + "thrown away")
                        .extracting(SkosConcept::note)
                        .containsExactly("NonEmptyScheme"));
    }

    @Test
    void carriesABaseTheSetDeclaresNothingAtAllFor() {
        assertAll(
                () -> assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("PartyRole"))
                        .as("FIBO places 228 rows under the OMG Commons Ontology Library's own classes, "
                                + "and a rule dropping an undeclared base would take those with it")
                        .extracting(SkosConcept::broader)
                        .containsExactly("Classifier"),
                () -> assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("PartyRole"))
                        .extracting(SkosConcept::note)
                        .containsExactly(""));
    }

    @Test
    void collapsesTheDocumentationsOwnLineBreaksToOneSpaceEach() {
        assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("Swap"))
                .extracting(SkosConcept::definition)
                .containsExactly("A type defining swap streams and additional payments "
                        + "between the principal parties involved in the swap.");
    }

    @Test
    void namesTheModuleAfterTheSchemaFilesOwnProductArea() {
        assertThat(read()).extracting(SkosConcept::module).containsOnly("ird");
    }

    @Test
    void leavesSimpleTypesAndGlobalElementsUnread() {
        final List<SkosConcept> concepts = read();

        assertAll(
                () -> assertThat(concepts).hasSize(5),
                () -> assertThat(concepts).extracting(SkosConcept::prefLabel)
                        .doesNotContain("Scheme", "NonEmptyScheme", "swap"));
    }
}
