package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class WrittenByDepthTest {

    private static String asWords(final String label) {
        return String.join(" ", IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("x#" + label, label, "", broader, "class", "x.owl", "", "");
    }

    private static final List<SkosConcept> TAXONOMY = List.of(
            concept("MorphosyntacticCategory", ""),
            concept("Noun", "MorphosyntacticCategory"),
            concept("CommonNoun", "Noun"),
            concept("Relation", ""),
            concept("PragmaticRelation", "Relation"),
            concept("Cause", "PragmaticRelation"),
            concept("Result", "Cause"));

    private static WrittenByDepth after(final Map<String, Integer> written) {
        final TaxonomyTree tree = TaxonomyTree.of(TAXONOMY, written, WrittenByDepthTest::asWords);
        return WrittenByDepth.of(tree.writtenHere(), StatedDepth.of(tree));
    }

    @Test
    void countsTheConceptsAndTheTimesTheyWereWrittenAtEachRungBelowTheRoot() {
        final WrittenByDepth written = after(Map.of("Noun", 31, "CommonNoun", 1, "Result", 836));

        assertAll(
                () -> assertThat(written.concepts()).isEqualTo(3),
                () -> assertThat(written.spans()).isEqualTo(868),
                () -> assertThat(written.at(1)).isEqualTo(new WrittenByDepth.Rung(1, 31)),
                () -> assertThat(written.at(2)).isEqualTo(new WrittenByDepth.Rung(1, 1)),
                () -> assertThat(written.at(3)).isEqualTo(new WrittenByDepth.Rung(1, 836)));
    }

    @Test
    void readsARungNothingWasWrittenAtAsEmptyRatherThanAbsent() {
        assertThat(after(Map.of("Noun", 31)).at(2)).isEqualTo(new WrittenByDepth.Rung(0, 0));
    }

    @Test
    void weighsTheMeanRungByHowOftenEachConceptWasWrittenAsWellAsByHowManyThereWere() {
        final WrittenByDepth written = after(Map.of("Noun", 1, "Result", 99));

        assertAll(
                () -> assertThat(written.meanRungPerConcept()).isCloseTo(2.0, within(1e-9)),
                () -> assertThat(written.meanRungPerSpan()).isCloseTo(2.98, within(1e-9)));
    }

    @Test
    void readsAReadingThatFoundNothingAsHavingNoMeanRatherThanDividingByZero() {
        final WrittenByDepth written = after(Map.of());

        assertAll(
                () -> assertThat(written.concepts()).isZero(),
                () -> assertThat(written.meanRungPerConcept()).isZero(),
                () -> assertThat(written.meanRungPerSpan()).isZero());
    }

    @Test
    void namesTheDeepestRungAnythingWasWrittenAtSoATableKnowsWhereToStop() {
        assertThat(after(Map.of("Noun", 31, "Result", 836)).deepestWritten()).isEqualTo(3);
    }
}
