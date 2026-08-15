package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DepthReportTest {

    private static String asWords(final String label) {
        return String.join(" ", IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("x#" + label, label, "", broader, "class", "x.owl", "", "");
    }

    private static final List<SkosConcept> TAXONOMY = List.of(
            concept("MorphosyntacticCategory", ""),
            concept("Noun", "MorphosyntacticCategory"),
            concept("Verb", "MorphosyntacticCategory"),
            concept("Relation", ""),
            concept("PragmaticRelation", "Relation"),
            concept("Cause", "PragmaticRelation"),
            concept("Result", "Cause"));

    private static TaxonomyTree tree(final Map<String, Integer> written) {
        return TaxonomyTree.of(TAXONOMY, written, DepthReportTest::asWords);
    }

    private static final TaxonomyTree EVERY =
            tree(Map.of("Noun", 31, "Verb", 33, "Result", 836, "PragmaticRelation", 5));
    private static final TaxonomyTree CORROBORATED = tree(Map.of("Noun", 31, "Verb", 33, "Result", 836));

    private static String rendered() {
        return new DepthReport().render(StatedDepth.of(EVERY), EVERY, CORROBORATED);
    }

    @Test
    void statesWhatWasWrittenAtEachRungThePublisherPlacedAConceptOn() {
        assertAll(
                () -> assertThat(rendered()).contains("| 1 | 2 | 64 |"),
                () -> assertThat(rendered()).contains("Rungs below the root"));
    }

    @Test
    void putsTheMatchesTheBranchAdmittedBesideTheOnesItRefusedBecauseThatIsWhatSettlesIt() {
        assertAll(
                () -> assertThat(rendered()).contains("what the branch admitted"),
                () -> assertThat(rendered()).contains("what the branch refused"));
    }

    @Test
    void namesTheDeepestConceptsWrittenSoAReaderCanJudgeThemOneAtATime() {
        assertThat(rendered()).contains("`Result`&nbsp;3&nbsp;rungs,&nbsp;836");
    }

    @Test
    void countsOneRungInTheSingular() {
        assertThat(rendered()).contains("`Noun`&nbsp;1&nbsp;rung,&nbsp;31");
    }

    @Test
    void reportsAReadingThatRefusedNothingWithoutInventingARowForIt() {
        assertThat(new DepthReport().render(StatedDepth.of(EVERY), EVERY, EVERY))
                .contains("| what the branch refused | 0 |");
    }
}
