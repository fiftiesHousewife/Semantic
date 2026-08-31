package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PhrasesTheBarCountedTest {

    private static final SightingSite SOMEWHERE = new SightingSite("A.java", 1);

    private static ExportedConcept found(final String term, final String normalisation) {
        return new ExportedConcept(term, term, normalisation, "what it means", "what it means", term,
                "Product", List.of("Product"), 9, 0.5, term.split(" ").length, 0.9, SOMEWHERE);
    }

    private static ExportedTaxonomy publishing(final ExportedConcept... concepts) {
        return new ExportedTaxonomy("FpML", List.of(concepts), List.of(), Map.of(),
                new ExportedTaxonomy.Bar(1, 0, 0, 1.0, 0, 0.001, 7, 999));
    }

    private final PhrasesTheBarCounted counted = new PhrasesTheBarCounted();

    @Test
    void leavesOutATermADictionaryReachedAboveTheLevelTheBarWasDrawnAt() {
        assertThat(counted.in(publishing(found("cash flow", "words"), found("payment date", "lemmas"),
                found("business centre", "senses"), found("id document", "expansions"))))
                .containsExactly("cash flow");
    }

    @Test
    void leavesOutATermOfOneWordBecauseTheBarCountsOnlyPhrases() {
        assertThat(counted.in(publishing(found("cash flow", "words"), found("swap", "words"))))
                .containsExactly("cash flow");
    }

    @Test
    void countsATermTwoConceptsReadAsOnce() {
        assertThat(counted.in(publishing(found("cash flow", "words"), found("cash flow", "words"))))
                .containsExactly("cash flow");
    }
}
