package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AnswerRungsTest {

    private static final SightingSite SOMEWHERE = new SightingSite("A.java", 1);

    private static ExportedTaxonomy.Concept phrase(final String concept, final String placedUnder,
                                                   final int occurrences) {
        return new ExportedTaxonomy.Concept(concept, concept.toLowerCase(java.util.Locale.ROOT),
                "what " + concept + " means", placedUnder, placedUnder, occurrences, 0.5, 2, 0.9,
                SOMEWHERE);
    }

    private static ExportedTaxonomy cleared(final String vocabulary, final String placedUnder,
                                            final int phrases, final int bar) {
        return new ExportedTaxonomy(vocabulary, List.of(phrase(vocabulary + "Concept", placedUnder, 10)),
                List.of(), Map.of(),
                new ExportedTaxonomy.Bar(phrases, bar, bar - 1, (double) phrases / bar, 7, 999));
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
                new SetAside(0, 0, 0, 0, 0, 0, 0, 0, 0));
    }

    @Test
    void answersWithEveryVocabularyThatClearedThePhraseBarRatherThanTheBestOfThem() {
        final List<ExportedAnswer> answers = AnswerRungs.answering(reading(
                List.of(cleared("FIBO", "", 6, 3), cleared("BIAN", "Cards", 3, 2),
                        cleared("FIX", "Common", 7, 5)),
                List.of()));
        assertAll(
                () -> assertThat(answers).extracting(ExportedAnswer::source)
                        .containsExactly("FIBO", "BIAN", "FIX"),
                () -> assertThat(answers).extracting(ExportedAnswer::placedUnder)
                        .contains("Cards"));
    }

    @Test
    void leavesOutAVocabularyWhoseBarWasNeverFormed() {
        final List<ExportedAnswer> answers = AnswerRungs.answering(reading(
                List.of(cleared("OLiA", "WordClass", 4, 2), cleared("CWE", "", 1, 0)), List.of()));
        assertThat(answers).extracting(ExportedAnswer::source).containsExactly("OLiA");
    }

    @Test
    void answersWithEverySchemeLevelStandingApartWhereNoVocabularySpoke() {
        final List<ExportedAnswer> answers = AnswerRungs.answering(reading(List.of(),
                List.of(new ExportedPlacement("arXiv", level("Computer Science", true),
                                level("Computation and Language", true)),
                        new ExportedPlacement("CSO", level("linguistics", true),
                                level("speech communication", false)))));
        assertAll(
                () -> assertThat(answers).extracting(ExportedAnswer::result).containsExactly(
                        "Computer Science", "Computation and Language", "linguistics"),
                () -> assertThat(answers).extracting(ExportedAnswer::sourceType)
                        .containsOnly("subject scheme"));
    }

    @Test
    void statesOneAnswerSayingSoWhereNothingQualified() {
        assertThat(AnswerRungs.answering(reading(List.of(), List.of())))
                .containsExactly(ExportedAnswer.NONE);
    }

    @Test
    void backsOffBetweenRungsAndNeverInsideOne() {
        final List<ExportedAnswer> answers = AnswerRungs.answering(reading(
                List.of(cleared("FIBO", "", 6, 3)),
                List.of(new ExportedPlacement("arXiv", level("Computer Science", true),
                        level("Computation and Language", true)))));
        assertThat(answers).extracting(ExportedAnswer::sourceType).containsOnly("taxonomy");
    }
}
