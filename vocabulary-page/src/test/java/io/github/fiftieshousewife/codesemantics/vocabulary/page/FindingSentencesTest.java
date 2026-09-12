package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedConcept;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSummary;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.export.SetAside;
import io.github.fiftieshousewife.codesemantics.engine.export.SightingSite;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindingSentencesTest {

    private static final List<String> FIELD =
            List.of("OLiA", "CWE", "FIX", "FpML", "FIBO", "BIAN", "CSO");

    private final FindingSentences sentences = new FindingSentences();

    private static ExportedTaxonomy vocabulary(final String source, final int phrases, final int bar,
                                               final List<ExportedConcept> concepts) {
        return new ExportedTaxonomy(source, concepts, List.of(),
                Map.of("words", phrases, "lemmas", 0, "expansions", 0, "senses", 0),
                new ExportedTaxonomy.Bar(phrases, bar, bar - 1, bar == 0 ? 0.0 : (double) phrases / bar, phrases * 20, bar * 20, bar == 0 ? 0.0 : (double) phrases / bar,
                        0, 0.001, 7, FIELD, 999));
    }

    private static ExportedConcept oneWordConcept(final String label) {
        return new ExportedConcept(label, label.toLowerCase(java.util.Locale.ROOT), "words",
                "", "", "", "a branch", List.of("a branch"), 4, 0.5, 1, 0.9,
                new SightingSite("A.java", 1));
    }

    private static ReadingExport reading(final List<ExportedAnswer> answers,
                                         final List<ExportedTaxonomy> taxonomies,
                                         final List<SetAside.RefusedVocabulary> refused,
                                         final List<ExportedPlacement> placedIn) {
        return ReadingExport.of(
                new ExportedSummary("a-repository", "c0ffee", answers, List.of(), List.of(), placedIn,
                        List.of(), List.of(), List.of(), 0.9, 0.5,
                        new ExportedSummary.Counts(0, 0, 0)),
                List.of(), Map.of(), List.of(), taxonomies,
                new SetAside(0, 0, 0, 0, 0, 0, refused, 0, 0, 0));
    }

    @Test
    void statesAPhraseAnswerWithTheDealArithmeticThePlacementAndTheProse() {
        final ReadingExport reading = reading(
                List.of(ExportedAnswer.fromATaxonomy("FIX", List.of("Session"), "MsgSeqNum",
                        "Integer message sequence number.", "52 phrases", 10.4)),
                List.of(vocabulary("FIX", 52, 5, List.of())), List.of(), List.of());

        assertThat(sentences.of(reading)).singleElement()
                .isEqualTo("FIX states 52 of its phrases in this repository’s declared names, against "
                        + "the 5 the best of a field of 7 reaches by dealing its own words at random. "
                        + "It places MsgSeqNum under Session. “Integer message sequence number.”");
    }

    @Test
    void writesTheWholeStatedPathBetweenSeparators() {
        final ReadingExport reading = reading(
                List.of(ExportedAnswer.fromATaxonomy("FIBO",
                        List.of("Aspect", "Value", "QuantitativeValue"), "PresentValue", null,
                        "47 phrases", 2.8)),
                List.of(vocabulary("FIBO", 47, 17, List.of())), List.of(), List.of());

        assertThat(sentences.of(reading)).singleElement().asString()
                .contains("It places PresentValue under Aspect › Value › QuantitativeValue.")
                .doesNotContain("“");
    }

    @Test
    void namesTheMostWrittenConceptWhereThePublisherPlacesItNowhere() {
        final ReadingExport reading = reading(
                List.of(ExportedAnswer.fromATaxonomy("FpML", List.of(), "PartyName", null,
                        "6 phrases", 1.5)),
                List.of(vocabulary("FpML", 6, 4, List.of())), List.of(), List.of());

        assertThat(sentences.of(reading)).singleElement().asString()
                .contains("Its most-written concept is PartyName.");
    }

    @Test
    void statesAOneWordAnswerWhereNoVocabularysBarWasFormed() {
        final ReadingExport reading = reading(
                List.of(ExportedAnswer.fromATaxonomy("OLiA", List.of("a branch"), "Verb", null,
                        "2 one-word terms", 0.0)),
                List.of(vocabulary("OLiA", 0, 0,
                        List.of(oneWordConcept("Verb"), oneWordConcept("Noun")))),
                List.of(), List.of());

        assertThat(sentences.of(reading)).singleElement().asString()
                .startsWith("The repository writes 2 of OLiA’s one-word terms, each beside another "
                        + "concept of the branch its publisher files it in.");
    }

    @Test
    void statesASchemeAnswerAsBitsNearerThanItsShuffleInsideItsGrouping() {
        final ReadingExport reading = reading(
                List.of(ExportedAnswer.fromASubjectScheme("arXiv", List.of("Computer Science"),
                        "Computation and Language", "0.053 bits nearer than chance reached", 0.053)),
                List.of(), List.of(), List.of());

        assertThat(sentences.of(reading)).singleElement()
                .isEqualTo("arXiv’s nearest subject is Computation and Language, inside Computer "
                        + "Science — 0.053 bits nearer than the nearest subject of a scheme built "
                        + "by shuffling the real descriptions.");
    }

    @Test
    void saysNothingQualifiedWithTheCountOfVocabulariesJudged() {
        final ReadingExport reading = reading(List.of(ExportedAnswer.NONE), List.of(),
                List.of(new SetAside.RefusedVocabulary("CSO",
                                new ExportedTaxonomy.Bar(1, 2, 1, 0.5, 20, 40, 0.5, 500, 0.5, 7, FIELD, 999)),
                        new SetAside.RefusedVocabulary("FIX",
                                new ExportedTaxonomy.Bar(0, 3, 2, 0.0, 0, 60, 0.0, 999, 1.0, 7, FIELD, 999))),
                List.of());

        assertThat(sentences.of(reading)).singleElement()
                .isEqualTo("Nothing qualified: the 2 vocabularies judged wrote no more of their "
                        + "phrases here than deals of their own words reach, and no scheme’s nearest "
                        + "subject is nearer than its shuffle reaches.");
    }

    @Test
    void statesAPlacementTheShuffleCannotSeparateWithBothFiguresAndTheContenderCount() {
        final ExportedPlacement.Level level = ExportedPlacement.Level.of(
                "Authorship Attribution and Profiling", 0.421, 0.494, List.of(),
                List.of(contender("Authorship Attribution and Profiling"), contender("Text Mining"),
                        contender("Stylometry")));

        assertThat(sentences.placement("OpenAlex", level))
                .isEqualTo("OpenAlex’s nearest subject is Authorship Attribution and Profiling, at "
                        + "0.421 bits against the 0.494 its shuffle reaches — 3 subjects are "
                        + "nearer than the shuffle, and the instrument cannot separate them.");
    }

    @Test
    void statesAPlacementNoNearerThanItsShuffleAsNoPlacement() {
        final ExportedPlacement.Level level = ExportedPlacement.Level.of(
                "Computer Science", 0.45, 0.40, List.of(), List.of());

        assertThat(sentences.placement("arXiv", level))
                .isEqualTo("arXiv’s nearest subject is Computer Science, at 0.450 bits against the "
                        + "0.400 its shuffle reaches — no nearer than the shuffle, so the scheme "
                        + "places this repository nowhere.");
    }

    @Test
    void statesASeparatedPlacementWithItsTwoFigures() {
        final ExportedPlacement.Level level = ExportedPlacement.Level.of(
                "Computer Science", 0.332, 0.412, List.of(),
                List.of(contender("Computer Science")));

        assertThat(sentences.placement("arXiv", level))
                .isEqualTo("arXiv’s nearest subject is Computer Science, at 0.332 bits against the "
                        + "0.412 its shuffle reaches, and no other subject is nearer than the shuffle.");
    }

    private static ExportedPlacement.Contender contender(final String subject) {
        return new ExportedPlacement.Contender(subject, 0.4, List.of());
    }
}
