package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Element;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class FixFieldPlacementsTest {

    private static final String ORCHESTRA = """
            <?xml version="1.0" encoding="UTF-8"?>
            <fixr:repository xmlns:fixr="http://fixprotocol.io/2020/orchestra/repository">
              <fixr:messages>
                <fixr:message id="1" name="ConfirmationRequest" category="Confirmation">
                  <fixr:structure>
                    <fixr:fieldRef id="64"/>
                    <fixr:fieldRef id="1"/>
                    <fixr:fieldRef id="100"/>
                  </fixr:structure>
                </fixr:message>
              </fixr:messages>
              <fixr:components>
                <fixr:component id="2" name="SettlInstructionsData" category="Allocation">
                  <fixr:fieldRef id="1"/>
                </fixr:component>
                <fixr:component id="3" name="CommissionData" category="Common">
                  <fixr:fieldRef id="15"/>
                </fixr:component>
                <fixr:component id="4" name="Uncategorised" category="">
                  <fixr:fieldRef id="64"/>
                </fixr:component>
              </fixr:components>
              <fixr:groups>
                <fixr:group id="5" name="SettlParties" category="CrossOrders">
                  <fixr:fieldRef id="100"/>
                </fixr:group>
              </fixr:groups>
            </fixr:repository>
            """;

    private static final Map<String, String> SECTIONS = Map.of(
            "Confirmation", "PostTrade", "Allocation", "PostTrade", "CrossOrders", "Trade", "Common", "");

    private static FixFieldPlacements read() {
        return FixFieldPlacements.in(containers(), SECTIONS);
    }

    private static List<Element> containers() {
        return RdfXml.elements(RdfXml.parsed(ORCHESTRA.getBytes(StandardCharsets.UTF_8))
                        .getDocumentElement().getChildNodes())
                .flatMap(plural -> RdfXml.elements(plural.getChildNodes()))
                .toList();
    }

    @Test
    void placesAFieldUnderTheOneCategoryEveryContainerNamingItStates() {
        assertThat(read().under("64")).isEqualTo("Confirmation");
    }

    @Test
    void placesAFieldUnderEveryCategoryNamingItWhenTwoOfOneSectionDo() {
        assertAll(
                () -> assertThat(read().under("1")).isEqualTo("Confirmation | Allocation"),
                () -> assertThat(read().sectionOf("1"))
                        .as("both categories sit in one section, so the module is that section")
                        .isEqualTo("PostTrade"));
    }

    @Test
    void placesAFieldUnderEveryCategoryNamingItWhenTheySitInDifferentSections() {
        assertAll(
                () -> assertThat(read().under("100"))
                        .as("a field the publisher puts in two places is not one it places nowhere")
                        .isEqualTo("Confirmation | CrossOrders"),
                () -> assertThat(read().sectionOf("100"))
                        .as("the module is one column and the publisher states two sections")
                        .isEmpty());
    }

    @Test
    void placesNothingForAFieldNoContainerNames() {
        assertThat(read().under("999")).isEmpty();
    }

    @Test
    void placesAFieldUnderACategoryThePublisherStatesNoSectionFor() {
        assertAll(
                () -> assertThat(read().under("15")).isEqualTo("Common"),
                () -> assertThat(read().sectionOf("15")).isEmpty());
    }

    @Test
    void namesTheSectionAPlacingCategorySitsIn() {
        assertThat(read().sectionOf("64")).isEqualTo("PostTrade");
    }
}
