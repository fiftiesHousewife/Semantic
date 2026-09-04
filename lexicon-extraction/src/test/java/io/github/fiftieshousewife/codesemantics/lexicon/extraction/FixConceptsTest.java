package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
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
                <fixr:category name="Allocation" section="PostTrade"/>
                <fixr:category name="Common"/>
              </fixr:categories>
              <fixr:messages>
                <fixr:message name="ConfirmationRequest" abbrName="CnfmReq" category="Confirmation">
                  <fixr:annotation>
                    <fixr:documentation purpose="SYNOPSIS">Requests a confirmation.</fixr:documentation>
                    <fixr:documentation purpose="ELABORATION">Sent by the buy side.</fixr:documentation>
                  </fixr:annotation>
                  <fixr:structure>
                    <fixr:fieldRef id="64"/>
                    <fixr:fieldRef id="218"/>
                  </fixr:structure>
                </fixr:message>
              </fixr:messages>
              <fixr:components>
                <fixr:component name="SettlInstructionsData" category="Confirmation"/>
                <fixr:component name="CommissionData" category="Common">
                  <fixr:fieldRef id="15"/>
                </fixr:component>
              </fixr:components>
              <fixr:groups>
                <fixr:group name="SettlParties" category="Allocation">
                  <fixr:fieldRef id="218"/>
                </fixr:group>
              </fixr:groups>
              <fixr:fields>
                <fixr:field id="64" name="SettlDate" abbrName="SettlDt">
                  <fixr:annotation>
                    <fixr:documentation purpose="SYNOPSIS">Specific date of trade
                        settlement.</fixr:documentation>
                  </fixr:annotation>
                </fixr:field>
                <fixr:field id="218" name="Spread"/>
                <fixr:field id="15" name="Currency"/>
                <fixr:field id="999" name="ApplExtID"/>
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
                        .extracting(SkosConcept::broader, SkosConcept::module)
                        .containsExactly(tuple("Confirmation", "PostTrade")));
    }

    @Test
    void placesAFieldUnderEveryCategoryTheContainersNamingItState() {
        assertAll(
                () -> assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("Spread"))
                        .extracting(SkosConcept::broader, SkosConcept::module)
                        .containsExactly(tuple("Confirmation | Allocation", "PostTrade")),
                () -> assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("Currency"))
                        .extracting(SkosConcept::broader, SkosConcept::module)
                        .containsExactly(tuple("Common", "")),
                () -> assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("ApplExtID"))
                        .extracting(SkosConcept::broader, SkosConcept::module)
                        .containsExactly(tuple("", "")));
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
                () -> assertThat(read()).hasSize(12),
                () -> assertThat(read()).extracting(SkosConcept::prefLabel)
                        .doesNotContain("Qty", "SettlTypeCodeSet"));
    }
}
