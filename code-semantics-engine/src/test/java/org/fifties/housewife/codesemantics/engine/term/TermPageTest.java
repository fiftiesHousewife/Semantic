package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermPageTest {

    private static final TermGraph.Match CONTRAST = new TermGraph.Match("contrast", "Contrast",
            List.of("Relation", "CoherenceRelation", "Contrast"), 0.76, 2, 1.53, 1, "Page.java:28");

    private static final TermGraph.Match VERB = new TermGraph.Match("verb", "Verb",
            List.of("Verb"), 0.91, 31, 28.12, 1, "Behaviour.java:20");

    private static final TermGraph.Match COMMON_NOUN = new TermGraph.Match("common noun", "CommonNoun",
            List.of("CommonNoun"), 0.96, 2, 1.93, 2, "OliaConceptsTest.java:16");

    private final TermGraph graph = new TermGraph("CodeSemantics", "OLiA", "the words themselves",
            35, 5000, 3, 10, 6, Map.of(1, 33, 2, 2),
            List.of(new TermGraph.Branch("Verb", 31, 28.12, List.of(VERB)),
                    new TermGraph.Branch("Relation", 2, 1.53, List.of(CONTRAST)),
                    new TermGraph.Branch("CommonNoun", 2, 1.93, List.of(COMMON_NOUN))));

    private final String page = new TermPage().of(graph);

    @Test
    void namesTheTaxonomyItDrewAndTheRepositoryItReads() {
        assertThat(page).contains("Terms — CodeSemantics").contains("CodeSemantics · OLiA");
    }

    @Test
    void namesTheRungItDrawsSoNobodyReadsItAsEveryMatchFound() {
        assertThat(page).contains("matched on the words themselves");
    }

    @Test
    void drawsARowForEveryTermThatMatched() {
        assertAll(
                () -> assertThat(page).contains(">Contrast<", ">Verb<", ">CommonNoun<"),
                () -> assertThat(page).contains("Behaviour.java:20"));
    }

    @Test
    void indentsAMatchByHowManySuperclassesItsPublisherStatesAboveIt() {
        assertAll(
                () -> assertThat(page).as("Contrast sits two below the root the ontology names for it")
                        .contains("--depth:2"),
                () -> assertThat(page).as("and Verb stands at its own root").contains("--depth:0"));
    }

    @Test
    void drawsAConceptNothingWasReadAsWithoutABar() {
        assertThat(page.substring(page.indexOf("CoherenceRelation") - 120, page.indexOf("CoherenceRelation")))
                .as("a rung is on the path and is not evidence")
                .contains("class=\"rung\"")
                .doesNotContain("bar-fill");
    }

    @Test
    void drawsEveryBarAsAShareOfTheHeaviestMatch() {
        assertAll(
                () -> assertThat(page).contains("width:100.00%"),
                () -> assertThat(graph.heaviestMatch()).isEqualTo(28.12));
    }

    @Test
    void marksATermOfMoreThanOneWordApartFromTheRest() {
        assertThat(page).contains("badge badge-long").contains("2 words");
    }

    @Test
    void splitsTheSpansByTermLengthWhereAReaderSeesItFirst() {
        assertThat(page.indexOf("split-part")).isLessThan(page.indexOf("branches"));
    }

    @Test
    void separatesTheTermsTheOntologyPlacesFromTheOnesItDoesNot() {
        assertAll(
                () -> assertThat(graph.stated()).extracting(TermGraph.Branch::root)
                        .containsExactly("Relation"),
                () -> assertThat(graph.unplaced()).extracting(TermGraph.Branch::root)
                        .containsExactly("Verb", "CommonNoun"));
    }

    @Test
    void carriesItsOwnStylesheetRatherThanReachingForOne() {
        assertThat(page).contains("<style>").contains("--depth");
    }
}
