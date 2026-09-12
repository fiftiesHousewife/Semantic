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
import static org.junit.jupiter.api.Assertions.assertAll;

class ReadingPageTest {

    private static final List<String> FIELD =
            List.of("OLiA", "CWE", "FIX", "FpML", "FIBO", "BIAN", "CSO");

    private static ExportedConcept concept(final String label, final String term,
                                           final String definition, final String description,
                                           final String statedFor, final int occurrences) {
        return new ExportedConcept(label, term, "words", definition, description, statedFor,
                "Session", List.of("Session"), occurrences, 0.8, 2, 1.0,
                new SightingSite("A.java", 1));
    }

    private static ReadingExport reading() {
        final ExportedPlacement.Level archive = ExportedPlacement.Level.of("Computer Science",
                0.332, 0.412,
                List.of(new ExportedPlacement.CarryingTopic("linguistics", 0.142, 0.095, List.of())),
                List.of(new ExportedPlacement.Contender("Computer Science", 0.332, List.of())));
        final ExportedPlacement.Level category = ExportedPlacement.Level.of(
                "Computation and Language", 0.45, 0.40, List.of(), List.of());
        return ReadingExport.of(
                new ExportedSummary("quickfixj", "c0ffee",
                        List.of(ExportedAnswer.fromATaxonomy("FIX", List.of("Session"), "MsgSeqNum",
                                "Integer message sequence number.", "52 phrases", 10.4)),
                        List.of("computing"), List.of("WordNet Domains"),
                        List.of(new ExportedPlacement("arXiv", archive, category)),
                        List.of(), List.of(), List.of(), 0.981, 0.843,
                        new ExportedSummary.Counts(0, 0, 2)),
                List.of(), Map.of(), List.of(),
                List.of(new ExportedTaxonomy("FIX",
                        List.of(concept("MsgSeqNum", "msg seq num",
                                        "Integer message sequence number.",
                                        "Integer message sequence number.", "MsgSeqNum", 18),
                                concept("RawData", "raw data", "",
                                        "The session layer of the protocol.", "Session", 3)),
                        List.of(), Map.of("words", 52, "lemmas", 0, "expansions", 0, "senses", 0),
                        new ExportedTaxonomy.Bar(52, 5, 3, 10.4, 1040, 100, 10.4, 0, 0.001, 7, FIELD, 999))),
                new SetAside(0, 0, 0, 0, 0, 0,
                        List.of(new SetAside.RefusedVocabulary("CSO",
                                new ExportedTaxonomy.Bar(1, 2, 1, 0.5, 20, 40, 0.5, 500, 0.5, 7, FIELD, 999))),
                        0, 0, 0));
    }

    private final String page = new ReadingPage("", "").markup(reading(), "{}");

    @Test
    void leadsWithTheFindingSentences() {
        assertAll(
                () -> assertThat(page).contains("<h1>quickfixj</h1>"),
                () -> assertThat(page).contains("FIX states 52 of its phrases"),
                () -> assertThat(page).contains("It places MsgSeqNum under Session."));
    }

    @Test
    void listsEachMatchedTermWithItsConceptAndThePublishersPath() {
        assertThat(page).contains("msg seq num")
                .contains("MsgSeqNum, under Session, written 18 times");
    }

    @Test
    void quotesAConceptsOwnDefinitionAndAttributesBorrowedProse() {
        assertAll(
                () -> assertThat(page).contains("“Integer message sequence number.”"),
                () -> assertThat(page)
                        .as("prose stated for a level above the concept is attributed, never passed off")
                        .contains("FIX states no prose for RawData; the nearest described level is "
                                + "Session: “The session layer of the protocol.”"));
    }

    @Test
    void statesEachRefusedVocabularyWithItsTwoCounts() {
        assertThat(page).contains("The repository writes 1 of CSO’s phrases; a deal of CSO’s own "
                + "words reaches 2, so CSO says nothing here.");
    }

    @Test
    void statesBothPlacementLevelsAgainstTheirShuffles() {
        assertAll(
                () -> assertThat(page).contains("arXiv’s nearest subject is Computer Science, at "
                        + "0.332 bits against the 0.412 its shuffle reaches"),
                () -> assertThat(page).contains("no nearer than the shuffle, so the scheme places "
                        + "this repository nowhere."),
                () -> assertThat(page)
                        .as("the topics a placement rests on show both shares")
                        .contains("linguistics — 14.2% of the repository, 9.5% of the subject’s "
                                + "description"));
    }

    @Test
    void statesTheTwoSharesEverythingRestsOn() {
        assertThat(page)
                .contains("Some bundled resource can be cited for 98.1% of the word occurrences")
                .contains("84.3% of the observed evidence resolves to no subject");
    }

    @Test
    void saysSoWhereNoVocabularyIsPublished() {
        final ReadingExport bare = ReadingExport.of(
                new ExportedSummary("maven", "c0ffee", List.of(ExportedAnswer.NONE), List.of(),
                        List.of(), List.of(), List.of(), List.of(), List.of(), 0.9, 0.8,
                        new ExportedSummary.Counts(0, 0, 0)),
                List.of(), Map.of(), List.of(), List.of(),
                new SetAside(0, 0, 0, 0, 0, 0, List.of(), 0, 0, 0));

        assertThat(new ReadingPage("", "").markup(bare, "{}"))
                .contains("No published vocabulary wrote more of its phrases here than a deal of its "
                        + "own words reaches.");
    }
}
