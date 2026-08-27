package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.groups.Tuple.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class FixConceptsTest {

    private static final String ORCHESTRA = """
            <?xml version="1.0" encoding="UTF-8"?>
            <fixr:repository xmlns:fixr="http://fixprotocol.io/2020/orchestra/repository" name="FIX.Latest">
              <fixr:sections>
                <fixr:section name="PostTrade">
                  <fixr:annotation>
                    <fixr:documentation purpose="SYNOPSIS">Post trade messages including trade
                        reporting, allocation, confirmation and settlement.</fixr:documentation>
                  </fixr:annotation>
                </fixr:section>
              </fixr:sections>
              <fixr:categories>
                <fixr:category name="Confirmation" section="PostTrade"/>
              </fixr:categories>
              <fixr:messages>
                <fixr:message name="ConfirmationRequest" abbrName="CnfmReq" category="Confirmation">
                  <fixr:annotation>
                    <fixr:documentation purpose="SYNOPSIS">Requests a confirmation.</fixr:documentation>
                    <fixr:documentation purpose="ELABORATION">Sent by the buy side.</fixr:documentation>
                  </fixr:annotation>
                </fixr:message>
              </fixr:messages>
              <fixr:components>
                <fixr:component name="SettlInstructionsData" category="Confirmation"/>
              </fixr:components>
              <fixr:groups>
                <fixr:group name="SettlParties" category="Confirmation"/>
              </fixr:groups>
              <fixr:fields>
                <fixr:field name="SettlDate" abbrName="SettlDt">
                  <fixr:annotation>
                    <fixr:documentation purpose="SYNOPSIS">Specific date of trade
                        settlement.</fixr:documentation>
                  </fixr:annotation>
                </fixr:field>
                <fixr:field name="Spread"/>
              </fixr:fields>
              <fixr:datatypes>
                <fixr:datatype name="Qty"/>
              </fixr:datatypes>
              <fixr:codeSets>
                <fixr:codeSet name="SettlTypeCodeSet"/>
              </fixr:codeSets>
            </fixr:repository>
            """;

    private static List<SkosConcept> read() {
        return new FixConcepts().in(ORCHESTRA.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void readsEachStatedKindAsConceptsOfTheRepositorysNamespace() {
        assertThat(read()).extracting(SkosConcept::concept)
                .contains("http://fixprotocol.io/2020/orchestra/repository#section/PostTrade",
                        "http://fixprotocol.io/2020/orchestra/repository#message/ConfirmationRequest",
                        "http://fixprotocol.io/2020/orchestra/repository#field/SettlDate");
    }

    @Test
    void statesTheHierarchyThePublisherStates() {
        assertAll(
                () -> assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("Confirmation"))
                        .extracting(SkosConcept::broader)
                        .containsExactly("PostTrade"),
                () -> assertThat(read())
                        .filteredOn(concept -> concept.prefLabel().equals("ConfirmationRequest"))
                        .extracting(SkosConcept::broader, SkosConcept::module)
                        .containsExactly(tuple("Confirmation", "PostTrade")),
                () -> assertThat(read())
                        .filteredOn(concept -> concept.prefLabel().equals("SettlDate"))
                        .extracting(SkosConcept::broader)
                        .containsExactly(""));
    }

    @Test
    void carriesTheAbbreviatedNameThePublisherStatesAsAltLabel() {
        assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("ConfirmationRequest"))
                .extracting(SkosConcept::altLabel)
                .containsExactly("CnfmReq");
    }

    @Test
    void joinsTheDocumentationsInThePublishersOrderWithLineBreaksCollapsed() {
        assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("ConfirmationRequest"))
                .extracting(SkosConcept::definition)
                .containsExactly("Requests a confirmation. | Sent by the buy side.");
    }

    @Test
    void namesEachConceptsKind() {
        assertThat(read()).extracting(SkosConcept::kind)
                .contains("section", "category", "message", "component", "group", "field");
    }

    @Test
    void leavesDatatypesAndCodeSetsUnread() {
        assertAll(
                () -> assertThat(read()).hasSize(7),
                () -> assertThat(read()).extracting(SkosConcept::prefLabel)
                        .doesNotContain("Qty", "SettlTypeCodeSet"));
    }
}
