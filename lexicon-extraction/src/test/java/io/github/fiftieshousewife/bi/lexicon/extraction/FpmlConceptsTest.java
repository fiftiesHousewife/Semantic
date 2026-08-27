package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
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
    void dropsABaseNamingATypeTheSetCarriesNoComplexTypeFor() {
        assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("AccountId"))
                .as("NonEmptyScheme is a simple type, and a roll-up must not climb to a concept "
                        + "nothing here can answer for")
                .extracting(SkosConcept::broader)
                .containsExactly("");
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
                () -> assertThat(concepts).hasSize(4),
                () -> assertThat(concepts).extracting(SkosConcept::prefLabel)
                        .doesNotContain("Scheme", "swap"));
    }
}
