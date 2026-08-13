package org.fifties.housewife.bi.lexicon;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class NistCsfFunctionsTest {

    private final NistCsfFunctions framework = NistCsfFunctions.fromClasspath();

    @Test
    void statesTheSixFunctionsTheFrameworkPartitionsActivityInto() {
        assertThat(framework.functions()).containsExactly("DE", "GV", "ID", "PR", "RC", "RS");
    }

    @Test
    void carriesTheCategoriesAndSubcategoriesThePublicationSaysItHas() {
        assertAll(
                () -> assertThat(kind("function")).hasSize(6),
                () -> assertThat(kind("category")).hasSize(22),
                () -> assertThat(kind("subcategory")).hasSize(106));
    }

    @Test
    void readsAConceptAsThePublisherLabelsAndDefinesIt() {
        final SkosConcept context = framework.conceptOf("GV.OC");
        assertAll(
                () -> assertThat(context.prefLabel()).isEqualTo("Organizational Context"),
                () -> assertThat(context.altLabel()).isEqualTo("Organizational Context (GV.OC)"),
                () -> assertThat(context.broader()).isEqualTo("GV"),
                () -> assertThat(context.module()).isEqualTo("GV"),
                () -> assertThat(context.definition()).contains("mission, stakeholder expectations"));
    }

    @Test
    void namesNothingBroaderThanAFunction() {
        assertThat(kind("function")).allMatch(function -> function.broader().isEmpty());
    }

    @Test
    void statesEveryConceptItNamesAsBroaderThanAnother() {
        assertThat(framework.concepts().stream().map(SkosConcept::concept).toList())
                .containsAll(framework.concepts().stream().map(SkosConcept::broader)
                        .filter(broader -> !broader.isEmpty()).toList());
    }

    @Test
    void rollsEveryConceptUpToAFunctionItAlsoStates() {
        assertThat(framework.concepts()).allMatch(concept -> framework.functions().contains(concept.module()));
    }

    @Test
    void givesAFunctionTheSentencesItsOutcomesAreStatedIn() {
        assertThat(framework.definitionsUnder("GV"))
                .hasSize(38)
                .contains("The organizational mission is understood and informs cybersecurity risk "
                        + "management");
    }

    @Test
    void refusesAConceptTheFrameworkDoesNotStateRatherThanAnsweringEmptily() {
        assertThatThrownBy(() -> framework.conceptOf("ID.BE"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("ID.BE");
    }

    private List<SkosConcept> kind(final String kind) {
        return framework.concepts().stream().filter(concept -> kind.equals(concept.kind())).toList();
    }
}
