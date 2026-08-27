package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CweConceptsTest {

    private static final String CATALOG = """
            <?xml version="1.0" encoding="UTF-8"?>
            <Weakness_Catalog xmlns="http://cwe.mitre.org/cwe-7" Name="CWE" Version="4.13">
              <Weaknesses>
                <Weakness ID="284" Name="Improper Access Control" Abstraction="Pillar">
                  <Description>The product does not restrict access.</Description>
                </Weakness>
                <Weakness ID="732" Name="Incorrect Permission Assignment for Critical Resource"
                          Abstraction="Class">
                  <Description>The product specifies permissions
                      that allow unintended actors to read or modify it.</Description>
                  <Related_Weaknesses>
                    <Related_Weakness Nature="ChildOf" CWE_ID="284" View_ID="1000" Ordinal="Primary"/>
                    <Related_Weakness Nature="ChildOf" CWE_ID="284" View_ID="900"/>
                  </Related_Weaknesses>
                </Weakness>
                <Weakness ID="79" Name="Improper Neutralization of Input During Web Page Generation"
                          Abstraction="Base">
                  <Description>The product does not neutralize user input.</Description>
                  <Alternate_Terms>
                    <Alternate_Term><Term>XSS</Term></Alternate_Term>
                    <Alternate_Term><Term>Cross-Site Scripting</Term></Alternate_Term>
                  </Alternate_Terms>
                </Weakness>
              </Weaknesses>
              <Categories>
                <Category ID="2" Name="7PK - Environment"/>
              </Categories>
              <Views>
                <View ID="1000" Name="Research Concepts"/>
              </Views>
            </Weakness_Catalog>
            """;

    private static List<SkosConcept> read() {
        return new CweConcepts().in(CATALOG.getBytes(StandardCharsets.UTF_8));
    }

    @Test
    void readsAWeaknessAsOneConceptAtItsOwnPermalink() {
        assertThat(read()).filteredOn(concept -> concept.prefLabel().equals("Improper Access Control"))
                .extracting(SkosConcept::concept)
                .containsExactly("https://cwe.mitre.org/data/definitions/284.html");
    }

    @Test
    void statesTheResearchViewsChildOfAsBroaderByTheParentsOwnName() {
        assertThat(read())
                .filteredOn(concept -> concept.concept().endsWith("/732.html"))
                .extracting(SkosConcept::broader)
                .containsExactly("Improper Access Control");
    }

    @Test
    void namesEachWeaknesssAbstractionAsItsKind() {
        assertThat(read()).extracting(SkosConcept::kind)
                .contains("Pillar", "Class", "Base");
    }

    @Test
    void poolsThePublishersAlternateTermsAsAltLabel() {
        assertThat(read())
                .filteredOn(concept -> concept.concept().endsWith("/79.html"))
                .extracting(SkosConcept::altLabel)
                .containsExactly("XSS | Cross-Site Scripting");
    }

    @Test
    void carriesTheDescriptionWithItsLineBreaksCollapsed() {
        assertThat(read())
                .filteredOn(concept -> concept.concept().endsWith("/732.html"))
                .extracting(SkosConcept::definition)
                .containsExactly("The product specifies permissions that allow unintended actors to "
                        + "read or modify it.");
    }

    @Test
    void leavesCategoriesAndViewsUnread() {
        assertAll(
                () -> assertThat(read()).hasSize(3),
                () -> assertThat(read()).extracting(SkosConcept::prefLabel)
                        .doesNotContain("7PK - Environment", "Research Concepts"));
    }
}
