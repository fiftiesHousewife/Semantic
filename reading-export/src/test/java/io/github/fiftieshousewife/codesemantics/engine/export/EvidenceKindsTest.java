package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class EvidenceKindsTest {

    private static final SightingSite SOMEWHERE = new SightingSite("A.java", 1);

    private static List<String> pathOf(final String placedUnder) {
        return placedUnder.isBlank() ? List.of() : List.of(placedUnder);
    }

    private static ExportedConcept phrase(final String concept, final String placedUnder,
                                                   final int occurrences) {
        return new ExportedConcept(concept, concept.toLowerCase(java.util.Locale.ROOT), "words",
                "what " + concept + " means", "what " + concept + " means", concept, placedUnder,
                pathOf(placedUnder), occurrences, 0.5, 2, 0.9, SOMEWHERE);
    }

    private static ExportedTaxonomy cleared(final String vocabulary, final String placedUnder,
                                            final int phrases, final int bar) {
        return new ExportedTaxonomy(vocabulary, List.of(phrase(vocabulary + "Concept", placedUnder, 10)),
                List.of(), Map.of(),
                new ExportedTaxonomy.Bar(phrases, bar, bar - 1, (double) phrases / bar, 0, 0.001, 7, 999));
    }

    private static ExportedPlacement.Level level(final String subject, final boolean apart) {
        return apart
                ? new ExportedPlacement.Level(subject, 0.3, 0.4, true, List.of(), List.of())
                : new ExportedPlacement.Level(subject, 0.4, 0.3, false, List.of(), List.of());
    }

    private static ReadingExport reading(final List<ExportedTaxonomy> taxonomies,
                                         final List<ExportedPlacement> placedIn) {
        return ReadingExport.of(
                new ExportedSummary("a-repository", "c0ffee", List.of(ExportedAnswer.NONE),
                        List.of("computing"), List.of("WordNet Domains"), placedIn, List.of(), List.of(),
                        List.of(), 0.98, 0.8, new ExportedSummary.Counts(0, 0, 0)),
                List.of(), Map.of(), List.of(), taxonomies,
                new SetAside(0, 0, 0, 0, 0, 0, List.of(), 0, 0, 0));
    }

    private static ExportedConcept concept(final String name, final String placedUnder,
                                                    final String definition, final int occurrences) {
        return new ExportedConcept(name, name.toLowerCase(java.util.Locale.ROOT), "words", definition,
                definition, definition.isBlank() ? "" : name, placedUnder, pathOf(placedUnder), occurrences,
                0.5, 2, 0.9, SOMEWHERE);
    }

    private static ExportedTaxonomy vocabulary(final List<ExportedConcept> concepts) {
        return new ExportedTaxonomy("FpML", concepts, List.of(), Map.of(),
                new ExportedTaxonomy.Bar(4, 2, 1, 2.0, 0, 0.001, 7, 999));
    }

    @Test
    void answersWithAConceptThePublisherPlacesRatherThanOneItStatesNothingAbove() {
        final List<ExportedAnswer> answers = EvidenceKinds.answering(reading(
                List.of(vocabulary(List.of(
                        concept("Message", "", "the basic structure of all FpML messages", 693),
                        concept("Swap", "Product", "swap streams and additional payments", 18)))),
                List.of()));
        assertAll(
                () -> assertThat(answers).singleElement()
                        .extracting(ExportedAnswer::result, ExportedAnswer::statedPath)
                        .containsExactly("Swap — swap streams and additional payments",
                                List.of("Product")),
                () -> assertThat(answers).singleElement().extracting(ExportedAnswer::result)
                        .asString().doesNotContain("Message"));
    }

    @Test
    void stillPrefersADefinedConceptToAPlacedOneTheSourceSaysNothingAbout() {
        final List<ExportedAnswer> answers = EvidenceKinds.answering(reading(
                List.of(vocabulary(List.of(
                        concept("Cards", "Business", "", 900),
                        concept("CardCapture", "", "capture the card payment transaction", 4)))),
                List.of()));
        assertThat(answers).singleElement().extracting(ExportedAnswer::result)
                .asString().startsWith("CardCapture — ");
    }

    @Test
    void answersWithTheMostWrittenWhereTwoAreStatedAlike() {
        final List<ExportedAnswer> answers = EvidenceKinds.answering(reading(
                List.of(vocabulary(List.of(
                        concept("Rare", "Product", "a rare one", 2),
                        concept("Common", "Product", "a common one", 40)))),
                List.of()));
        assertThat(answers).singleElement().extracting(ExportedAnswer::result)
                .asString().startsWith("Common — ");
    }

    @Test
    void answersWithEveryVocabularyThatClearedThePhraseBarRatherThanTheBestOfThem() {
        final List<ExportedAnswer> answers = EvidenceKinds.answering(reading(
                List.of(cleared("FIBO", "", 6, 3), cleared("BIAN", "Cards", 3, 2),
                        cleared("FIX", "Common", 7, 5)),
                List.of()));
        assertAll(
                () -> assertThat(answers).extracting(ExportedAnswer::source)
                        .containsExactly("FIBO", "BIAN", "FIX"),
                () -> assertThat(answers).extracting(ExportedAnswer::statedPath)
                        .contains(List.of("Cards")));
    }

    @Test
    void leavesOutAVocabularyWhoseBarWasNeverFormed() {
        final List<ExportedAnswer> answers = EvidenceKinds.answering(reading(
                List.of(cleared("OLiA", "WordClass", 4, 2), cleared("CWE", "", 1, 0)), List.of()));
        assertThat(answers).extracting(ExportedAnswer::source).containsExactly("OLiA");
    }

    @Test
    void answersOncePerSchemeWithItsArchiveAsThePathToItsCategory() {
        final List<ExportedAnswer> answers = EvidenceKinds.answering(reading(List.of(),
                List.of(new ExportedPlacement("arXiv", level("Computer Science", true),
                                level("Computation and Language", true)),
                        new ExportedPlacement("CSO", level("linguistics", true),
                                level("speech communication", false)))));
        assertAll(
                () -> assertThat(answers).extracting(ExportedAnswer::source)
                        .as("naming a scheme twice says which level neither time")
                        .containsExactly("arXiv", "CSO"),
                () -> assertThat(answers).extracting(ExportedAnswer::result)
                        .containsExactly("Computation and Language", "linguistics"),
                () -> assertThat(answers).extracting(ExportedAnswer::statedPath)
                        .containsExactly(List.of("Computer Science"), List.of()),
                () -> assertThat(answers).extracting(ExportedAnswer::sourceType)
                        .containsOnly("subject scheme"));
    }

    @Test
    void leavesOutASchemeNeitherOfWhoseLevelsStandsApartFromChance() {
        assertThat(EvidenceKinds.answering(reading(List.of(),
                List.of(new ExportedPlacement("arXiv", level("Computer Science", false),
                        level("Computation and Language", false))))))
                .containsExactly(ExportedAnswer.NONE);
    }

    @Test
    void statesEachSourceTypesStrengthInItsOwnUnitAndLeavesOutTheOtherOne() {
        final List<ExportedAnswer> vocabularies = EvidenceKinds.answering(reading(
                List.of(cleared("FIX", "Session", 52, 5)), List.of()));
        final List<ExportedAnswer> schemes = EvidenceKinds.answering(reading(List.of(),
                List.of(new ExportedPlacement("arXiv", level("Computer Science", true),
                        level("Computation and Language", true)))));
        assertAll(
                () -> assertThat(vocabularies).singleElement()
                        .extracting(ExportedAnswer::timesItsBar, ExportedAnswer::bitsPastChance)
                        .as("a vocabulary has no distance in bits, and states none rather than zero")
                        .containsExactly(52.0 / 5.0, null),
                () -> assertThat(schemes).singleElement()
                        .extracting(ExportedAnswer::timesItsBar)
                        .as("a scheme faces no permutation bar, and states none rather than zero")
                        .isNull(),
                () -> assertThat(schemes.getFirst().bitsPastChance())
                        .isCloseTo(0.1, within(1e-9)),
                () -> assertThat(schemes).singleElement().extracting(ExportedAnswer::qualifiedBy)
                        .asString().isEqualTo("0.100 bits nearer than chance reached"));
    }

    @Test
    void refusesAnAnswerStatingAStrengthItsSourceTypeCannotHave() {
        assertThatThrownBy(() -> new ExportedAnswer("taxonomy", "FIX", List.of(), "Session",
                "cleared", 2.0, 0.1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("only a subject scheme stands a distance");
    }

    @Test
    void statesOneAnswerSayingSoWhereNothingQualified() {
        assertThat(EvidenceKinds.answering(reading(List.of(), List.of())))
                .containsExactly(ExportedAnswer.NONE);
    }

    @Test
    void backsOffBetweenKindsAndNeverInsideOne() {
        final List<ExportedAnswer> answers = EvidenceKinds.answering(reading(
                List.of(cleared("FIBO", "", 6, 3)),
                List.of(new ExportedPlacement("arXiv", level("Computer Science", true),
                        level("Computation and Language", true)))));
        assertThat(answers).extracting(ExportedAnswer::sourceType).containsOnly("taxonomy");
    }
}
