package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermReportTest {

    /** The splitter the match itself uses, so a page shows the form the reading matched on. */
    private static String asWords(final String label) {
        return String.join(" ", org.fifties.housewife.codesemantics.engine.reading
                .IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("olia#" + label, label, "", broader, "class", "olia.owl", "", "");
    }

    /** One branch the repository works in, and one whole region of the field it never enters. */
    private static final List<SkosConcept> TAXONOMY = List.of(
            concept("Constituent", ""),
            concept("Phrase", "Constituent"),
            concept("NounPhrase", "Phrase"),
            concept("PragmaticRelation", ""),
            concept("Contrast", "PragmaticRelation"));

    private final TaxonomyTree tree = TaxonomyTree.of(TAXONOMY, Map.of("Phrase", 34, "NounPhrase", 1), TermReportTest::asWords);

    private final String rendered = new TermReport().render("OLiA", new MatchedTerms(List.of(
            new TermSighting(List.of("phrase"), List.of(concept("Phrase", "Constituent")), TermRung.WORDS,
                    0.83, 34, List.of("Tokeniser.java:44"))),
            5_000, 300, 200, Map.of(TermRung.WORDS, 200), Map.of(List.of("set"), 1_754)), tree);

    @Test
    void placesTheRepositoryInTheTaxonomyBeforeSayingAnythingElse() {
        assertAll(
                () -> assertThat(rendered).contains("publishes **5 concepts**"),
                () -> assertThat(rendered).contains("writes **2 of them, 35 times**"),
                () -> assertThat(rendered).contains("**1 of the taxonomy's 2 root branches**"));
    }

    @Test
    void ranksABranchByDistinctConceptsAndNotByHowOftenTheyWereWritten() {
        assertThat(rendered)
                .as("two concepts under Constituent, thirty-five occurrences between them")
                .contains("| `Constituent` | 2 | 3 | 35 |");
    }

    @Test
    void namesWhatABranchsClaimRestsOn() {
        assertThat(rendered).contains("`Phrase`\u00A034", "`NounPhrase`\u00A01");
    }

    @Test
    void leavesOutABranchTheRepositoryNeverReaches() {
        assertThat(rendered)
                .as("the viewer closes it rather than dropping it; a table has no such affordance")
                .doesNotContain("PragmaticRelation");
    }

    @Test
    void leavesTheRungsToOneTableAtTheEnd() {
        assertThat(rendered.substring(rendered.indexOf("## Matches per normalisation")))
                .contains("| the words themselves | 34 | 1 | 100.0% |");
    }
}
