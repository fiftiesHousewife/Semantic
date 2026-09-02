package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedConcept;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.SetAside;
import io.github.fiftieshousewife.codesemantics.engine.export.SightingSite;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class DrawnReadingsTest {

    private final DrawnReadings drawn = new DrawnReadings();

    private static final List<SetAside.RefusedVocabulary> REFUSED = List.of(
            new SetAside.RefusedVocabulary("CSO", new ExportedTaxonomy.Bar(17, 16, 9, 1.06, 0, 0.001, 7, 999)),
            new SetAside.RefusedVocabulary("FIX", new ExportedTaxonomy.Bar(3, 5, 2, 0.6, 0, 0.001, 7, 999)));

    /** The record checks the flag against its own two figures, so the pair follows the flag. */
    private static ExportedPlacement.Level level(final String subject, final boolean apart) {
        return apart
                ? new ExportedPlacement.Level(subject, 0.3, 0.4, true, List.of(), List.of())
                : new ExportedPlacement.Level(subject, 0.4, 0.3, false, List.of(), List.of());
    }

    private static ExportedAnswer taxonomy(final String source, final String result,
                                           final double timesItsBar) {
        return ExportedAnswer.fromATaxonomy(source, List.of("a branch"), result,
                "22 phrases against the 2 a deal reaches", timesItsBar);
    }

    private static ReadingRow row(final String repository, final List<ExportedAnswer> answers,
                                  final List<ExportedTaxonomy> vocabularies,
                                  final Optional<String> statedArea) {
        return new ReadingRow(repository, answers, List.of("linguistics"), vocabularies,
                List.of(new ExportedPlacement("OpenAlex", level("Artificial Intelligence", true),
                        level("Natural Language Processing Techniques", true))),
                0.981, REFUSED, statedArea);
    }

    private static ReadingRow row(final String repository, final ExportedAnswer answer) {
        return row(repository, List.of(answer), List.of(), Optional.empty());
    }

    private static DrawnReading.DrawnAnswer only(final DrawnReading.Drawing drawing) {
        return drawing.readings().getFirst().answers().getFirst();
    }

    @Test
    void statesEachSourcesStrengthInTheUnitItsOwnSourceTypeUses() {
        final DrawnReading.Drawing vocabularies = drawn.of(
                List.of(row("quickfixj", taxonomy("FIX", "MsgSeqNum — a sequence number", 10.4))),
                StatedAreas.none());
        final DrawnReading.Drawing schemes = drawn.of(
                List.of(row("maven", ExportedAnswer.fromASubjectScheme("arXiv", List.of("Computer Science"),
                        "Audio and Speech Processing", "0.053 bits nearer than chance reached", 0.053))),
                StatedAreas.none());
        assertAll(
                () -> assertThat(only(vocabularies))
                        .extracting(DrawnReading.DrawnAnswer::strength, DrawnReading.DrawnAnswer::unit)
                        .containsExactly(10.4, DrawnReading.DrawnAnswer.TIMES_ITS_BAR),
                () -> assertThat(only(schemes))
                        .extracting(DrawnReading.DrawnAnswer::strength, DrawnReading.DrawnAnswer::unit)
                        .as("a bar multiple and a distance in bits share no axis")
                        .containsExactly(0.053, DrawnReading.DrawnAnswer.BITS_PAST_CHANCE));
    }

    @Test
    void carriesTheWholeStatedPathRatherThanItsTwoEnds() {
        final DrawnReading.Drawing drawing = drawn.of(List.of(row("strata",
                ExportedAnswer.fromATaxonomy("FIBO",
                        List.of("Aspect", "Value", "QuantitativeValue"),
                        "PresentValue — value of an asset today", "47 phrases", 2.8))),
                StatedAreas.none());
        assertThat(only(drawing).statedPath())
                .as("the two ends of this path dropped Value between them")
                .containsExactly("Aspect", "Value", "QuantitativeValue");
    }

    @Test
    void statesNoPathWhereThePublisherPlacesTheConceptNowhere() {
        final DrawnReading.Drawing drawing = drawn.of(List.of(row("tika",
                ExportedAnswer.fromATaxonomy("FpML", List.of(), "PartyName — a party's name",
                        "6 phrases", 1.5))), StatedAreas.none());
        assertThat(only(drawing).statedPath())
                .as("FpML declares 616 of its 1,405 types with no base type")
                .isEmpty();
    }

    @Test
    void splitsTheConceptFromWhatItsPublisherSaysItMeans() {
        final DrawnReading.Drawing drawing = drawn.of(List.of(row("mine", taxonomy("OLiA",
                "BaseForm — Strong inflection is a characteristic of lexemes. "
                        + "In traditional English tagsets, ambiguities are not resolved.", 2.0))),
                StatedAreas.none());
        assertAll(
                () -> assertThat(only(drawing).concept()).isEqualTo("BaseForm"),
                () -> assertThat(only(drawing).definition())
                        .as("a publisher writes as much as it likes and all of it is evidence")
                        .startsWith("Strong inflection")
                        .endsWith("ambiguities are not resolved."));
    }

    @Test
    void statesTheConceptAloneWhereThePublisherDefinesNothing() {
        final DrawnReading.Drawing drawing = drawn.of(List.of(row("maven",
                ExportedAnswer.fromASubjectScheme("arXiv", List.of(), "Computer Science",
                        "0.053 bits", 0.053))), StatedAreas.none());
        assertAll(
                () -> assertThat(only(drawing).concept()).isEqualTo("Computer Science"),
                () -> assertThat(only(drawing).definition()).isEmpty());
    }

    @Test
    void ordersReadingsAndTheirAnswersByHowFarPastTheirOwnBarTheyStand() {
        final DrawnReading.Drawing drawing = drawn.of(List.of(
                row("santuario", taxonomy("CSO", "key agreement", 1.3)),
                row("jpos", List.of(taxonomy("BIAN", "Card Capture", 1.5),
                        taxonomy("FIBO", "MerchantIdentifier", 2.0)), List.of(), Optional.empty()),
                row("quickfixj", taxonomy("FIX", "MsgSeqNum", 10.4))), StatedAreas.none());
        assertAll(
                () -> assertThat(drawing.readings()).extracting(DrawnReading::repository)
                        .containsExactly("quickfixj", "jpos", "santuario"),
                () -> assertThat(drawing.readings().get(1).answers())
                        .extracting(DrawnReading.DrawnAnswer::source)
                        .as("two sources answering one reading are rarely equal evidence")
                        .containsExactly("FIBO", "BIAN"));
    }

    @Test
    void namesEverySourceThatAnsweredAnywhereSoTheFigureCanBeTransposed() {
        final DrawnReading.Drawing drawing = drawn.of(List.of(
                row("quickfixj", taxonomy("FIX", "MsgSeqNum", 10.4)),
                row("jpos", List.of(taxonomy("FIX", "RawData", 1.4), taxonomy("BIAN", "Cards", 1.5)),
                        List.of(), Optional.empty())), StatedAreas.none());
        assertThat(drawing.publishers()).containsExactly("FIX", "BIAN");
    }

    @Test
    void carriesEveryBranchThePublisherStatesForThePhrasesTheRepositoryWrote() {
        final ExportedConcept written = new ExportedConcept("public keys",
                "public keys", "words", "", "", "", "public key cryptography",
                List.of("cryptography", "public key cryptography"), 52, 0.5, 2, 0.9,
                new SightingSite("A.java", 1));
        final ExportedConcept alsoWritten = new ExportedConcept("file systems",
                "file systems", "words", "", "", "", "operating systems",
                List.of("computer science", "operating systems"), 8, 0.5, 2, 0.9,
                new SightingSite("B.java", 1));
        final DrawnReading.Drawing drawing = drawn.of(List.of(row("santuario",
                List.of(taxonomy("CSO", "public keys", 2.0)),
                List.of(new ExportedTaxonomy("CSO", List.of(written, alsoWritten), List.of(), Map.of(),
                        new ExportedTaxonomy.Bar(2, 1, 0, 2.0, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none());
        assertAll(
                () -> assertThat(only(drawing).branches()).extracting(WrittenBranch::branch)
                        .containsExactly("public key cryptography", "operating systems"),
                () -> assertThat(only(drawing).branches().getFirst().concepts())
                        .extracting(WrittenConcept::concept).containsExactly("public keys"),
                () -> assertThat(only(drawing).phrases()).isEqualTo(2));
    }

    @Test
    void carriesTheLevelAPublisherDescribesWhenItDescribesTheConceptNowhere() {
        final ExportedConcept keys = new ExportedConcept("public keys", "public keys", "words", "",
                "a cryptosystem of key pairs", "public key cryptography", "public key cryptography",
                List.of("computer security", "public key cryptography"), 52, 0.5, 2, 0.9,
                new SightingSite("A.java", 1));
        final DrawnReading santuario = drawn.of(List.of(row("santuario",
                List.of(taxonomy("CSO", "public keys", 2.0)),
                List.of(new ExportedTaxonomy("CSO", List.of(keys), List.of(), Map.of(),
                        new ExportedTaxonomy.Bar(2, 1, 0, 2.0, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();

        final WrittenConcept written = santuario.subjects().getFirst().concepts().getFirst();
        assertAll(
                () -> assertThat(written.description()).isEqualTo("a cryptosystem of key pairs"),
                () -> assertThat(written.descriptionStatedFor())
                        .as("a summary of the branch is not a definition of what sits in it, so the page "
                                + "has to be able to say whose it is")
                        .isEqualTo("public key cryptography"));
    }

    @Test
    void carriesTheLevelAMatchWasFoundAtSoThePageCanSayWhichTheBarCounted() {
        final ExportedConcept reached = new ExportedConcept("PaymentDates", "payment date", "lemmas",
                "the dates a payment falls on", "the dates a payment falls on", "PaymentDates", "Product",
                List.of("Product"), 350, 0.5, 2, 0.9, new SightingSite("A.java", 1));
        final DrawnReading strata = drawn.of(List.of(row("strata",
                List.of(taxonomy("FpML", "PaymentDates", 2.0)),
                List.of(new ExportedTaxonomy("FpML", List.of(reached), List.of(), Map.of(),
                        new ExportedTaxonomy.Bar(1, 0, 0, 2.0, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();

        assertThat(strata.subjects().getFirst().concepts().getFirst().normalisation())
                .as("the bar counts the words level, and a match a dictionary reached is not in it")
                .isEqualTo("lemmas");
    }

    @Test
    void poolsWhatEveryAnsweringPublisherPlacesThePhrasesUnder() {
        final ExportedConcept agreement = new ExportedConcept("key agreement",
                "key agreement", "words", "a protocol whereby two parties agree a shared key",
                "a protocol whereby two parties agree a shared key", "key agreement",
                "public key cryptography | encryption",
                List.of("computer security", "public key cryptography"), 60, 0.5, 2, 0.9,
                new SightingSite("A.java", 1));
        final ExportedConcept certificates = new ExportedConcept(
                "public key certificates", "public key certificates", "words", "", "", "",
                "public key cryptography",
                List.of("computer security", "public key cryptography"), 18, 0.5, 2, 0.9,
                new SightingSite("B.java", 1));
        final ExportedConcept hashes = new ExportedConcept("hash functions",
                "hash functions", "words", "", "", "", "cryptography",
                List.of("computer security", "cryptography"), 12, 0.5, 2, 0.9,
                new SightingSite("C.java", 1));
        final DrawnReading santuario = drawn.of(List.of(row("santuario",
                List.of(taxonomy("CSO", "key agreement — a protocol", 1.3)),
                List.of(new ExportedTaxonomy("CSO", List.of(agreement, certificates, hashes), List.of(),
                        Map.of(), new ExportedTaxonomy.Bar(9, 7, 6, 1.3, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertAll(
                () -> assertThat(santuario.subjects()).extracting(DrawnReading.Subject::subject)
                        .as("a publisher naming several parents is taken at the first, and CSO defines "
                                + "key agreement where it defines nothing under cryptography")
                        .containsExactly("public key cryptography", "cryptography"),
                () -> assertThat(santuario.subjects().getFirst().occurrences()).isEqualTo(78),
                () -> assertThat(santuario.subjects().getFirst().concepts())
                        .extracting(WrittenConcept::concept)
                        .containsExactly("key agreement", "public key certificates"),
                () -> assertThat(santuario.subjects().getFirst().concepts().getFirst().description())
                        .as("PresentValue and key agreement are identifiers; the definition is the "
                                + "meaning and travels with the label")
                        .isEqualTo("a protocol whereby two parties agree a shared key"));
    }

    @Test
    void ranksTwoDescribedSubjectsByTheShareOfTheRepositoryWrittenUnderThem() {
        final ExportedConcept written = new ExportedConcept("MsgSeqNum",
                "msg seq num", "words", "Integer message sequence number", "Integer message sequence number",
                "MsgSeqNum", "Session", List.of("Session"),
                800, 0.5, 3, 0.9,
                new SightingSite("A.java", 1));
        final ExportedConcept alsoWritten = new ExportedConcept("key agreement",
                "key agreement", "words", "a protocol", "a protocol", "key agreement", "public key cryptography",
                List.of("public key cryptography"), 9, 0.5, 2, 0.9,
                new SightingSite("B.java", 1));
        final DrawnReading reading = drawn.of(List.of(row("mine",
                List.of(taxonomy("FIX", "MsgSeqNum", 10.4), taxonomy("CSO", "key agreement", 1.3)),
                List.of(new ExportedTaxonomy("FIX", List.of(written), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(52, 5, 4, 10.4, 0, 0.001, 7, 999)),
                        new ExportedTaxonomy("CSO", List.of(alsoWritten), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(9, 7, 6, 1.3, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertThat(reading.subjects()).extracting(DrawnReading.Subject::subject)
                .as("FIX says what MsgSeqNum means and CSO says what key agreement means, so what "
                        + "separates them is that the repository wrote 800 of the first and 9 of the second")
                .containsExactly("Session", "public key cryptography");
    }

    @Test
    void refusesToRankAnUndescribedEnglishLabelAboveASubjectItsPublisherDescribes() {
        final ExportedConcept deposit = new ExportedConcept("Term Deposit",
                "term deposit", "words", "a deposit held for a fixed term", "a deposit held for a fixed term",
                "Term Deposit", "Loans and Deposits",
                List.of("Loans and Deposits"), 43, 0.5, 2, 0.9, new SightingSite("A.java", 1));
        final ExportedConcept functions = new ExportedConcept("value functions",
                "value functions", "words", "", "", "", "reinforcement learning",
                List.of("reinforcement learning"), 39, 0.5, 2, 0.9,
                new SightingSite("B.java", 1));
        final DrawnReading strata = drawn.of(List.of(row("strata",
                List.of(taxonomy("BIAN", "Term Deposit", 2.0), taxonomy("CSO", "value functions", 1.06)),
                List.of(new ExportedTaxonomy("BIAN", List.of(deposit), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(2, 1, 0, 2.0, 0, 0.001, 7, 999)),
                        new ExportedTaxonomy("CSO", List.of(functions), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(17, 16, 15, 1.06, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertThat(strata.subjects()).extracting(DrawnReading.Subject::subject)
                .as("CSO labels in English and says nothing about value functions, where BIAN says what "
                        + "a Term Deposit is — reinforcement learning is not what a derivatives library "
                        + "is about")
                .containsExactly("Loans and Deposits", "reinforcement learning");
    }

    @Test
    void namesWhatEachAnsweringStandardIsItselfAbout() {
        final DrawnReading reading = drawn.of(List.of(row("mine",
                List.of(taxonomy("FpML", "DateOffset", 2.8), taxonomy("CSO", "cubic spline", 1.1)),
                List.of(), Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertThat(reading.about())
                .as("a repository writing DateOffset is doing derivatives, and the identifier says so "
                        + "to nobody")
                .containsExactly("derivatives", "computer science");
    }

    @Test
    void refusesAStandardsOwnSubjectWhereAMajorityOfTheReadingsNameIt() {
        final DrawnReading.Drawing drawing = drawn.of(List.of(
                row("strata", List.of(taxonomy("FpML", "DateOffset", 2.8),
                        taxonomy("CSO", "cubic spline", 1.1)), List.of(), Optional.empty()),
                row("aeron", taxonomy("CSO", "ring buffer", 1.1)),
                row("besu", taxonomy("CSO", "merkle tree", 1.6))), StatedAreas.none());
        assertAll(
                () -> assertThat(drawing.readings().get(0).about())
                        .as("computer science is on every line and separates no reading from another")
                        .containsExactly("derivatives"),
                () -> assertThat(drawing.readings().get(1).about()).isEmpty());
    }

    @Test
    void namesAStandardAMinorityOfTheReadingsShare() {
        final DrawnReading.Drawing drawing = drawn.of(List.of(
                row("strata", taxonomy("FpML", "DateOffset", 2.8)),
                row("aeron", taxonomy("CSO", "ring buffer", 1.1)),
                row("besu", taxonomy("CSO", "merkle tree", 1.6))), StatedAreas.none());
        assertThat(drawing.readings().get(0).about()).containsExactly("derivatives");
    }

    @Test
    void namesTheOnlyStandardThatAnsweredWhereOneReadingIsDrawn() {
        final DrawnReading.Drawing drawing = drawn.of(
                List.of(row("aeron", taxonomy("CSO", "ring buffer", 1.1))), StatedAreas.none());
        assertThat(drawing.readings().getFirst().about())
                .as("one reading has nothing to be told apart from")
                .containsExactly("computer science");
    }

    @Test
    void givesEverySubjectANameAReaderCanRead() {
        final ExportedConcept handling = new ExportedConcept("ExecutionReport",
                "execution report", "words", "", "", "", "SingleGeneralOrderHandling",
                List.of("SingleGeneralOrderHandling"), 16, 0.5, 2, 0.9,
                new SightingSite("A.java", 1));
        final ExportedConcept sequence = new ExportedConcept("SeqNum",
                "seq num", "words", "Integer message sequence number.", "Integer message sequence number.", "SeqNum",
                "MsgSeqNum",
                List.of("MsgSeqNum"), 659, 0.5, 3, 0.9, new SightingSite("B.java", 1));
        final DrawnReading quickfixj = drawn.of(List.of(row("quickfixj",
                List.of(taxonomy("FIX", "MsgSeqNum", 10.4)),
                List.of(new ExportedTaxonomy("FIX", List.of(sequence, handling), List.of(), Map.of(),
                        new ExportedTaxonomy.Bar(52, 5, 4, 10.4, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertAll(
                () -> assertThat(quickfixj.subjects()).extracting(DrawnReading.Subject::readable)
                        .as("the shorthand gets the best name grammar can give it, and FIX states what "
                                + "SeqNum means where it states nothing under SingleGeneralOrderHandling")
                        .containsExactly("msg seq num", "single general order handling"),
                () -> assertThat(quickfixj.subjects()).extracting(DrawnReading.Subject::subject)
                        .as("the publisher's own label is kept beside the readable name")
                        .containsExactly("MsgSeqNum", "SingleGeneralOrderHandling"));
    }

    @Test
    void ranksAnIdentifierEveryWordOfWhichEnglishRanksAboveOneCarryingShorthand() {
        final ExportedConcept handling = new ExportedConcept("ExecutionReport",
                "execution report", "words", "", "", "", "SingleGeneralOrderHandling",
                List.of("SingleGeneralOrderHandling"), 16, 0.5, 2, 0.9,
                new SightingSite("A.java", 1));
        final ExportedConcept sequence = new ExportedConcept("SeqNum",
                "seq num", "words", "", "", "", "MsgSeqNum",
                List.of("MsgSeqNum"), 659, 0.5, 3, 0.9, new SightingSite("B.java", 1));
        final DrawnReading quickfixj = drawn.of(List.of(row("quickfixj",
                List.of(taxonomy("FIX", "MsgSeqNum", 10.4)),
                List.of(new ExportedTaxonomy("FIX", List.of(sequence, handling), List.of(), Map.of(),
                        new ExportedTaxonomy.Bar(52, 5, 4, 10.4, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertThat(quickfixj.subjects()).extracting(DrawnReading.Subject::readable)
                .as("FIX describes neither, so how the label reads decides: every word of "
                        + "SingleGeneralOrderHandling is English and msg is not, however much oftener "
                        + "the repository wrote the second")
                .containsExactly("single general order handling", "msg seq num");
    }

    @Test
    void ordersTheDescriptionByWhatThePublisherDescribesWhileTheAnswersKeepTheirChanceRate() {
        final ExportedConcept keys = new ExportedConcept("public keys",
                "public keys", "words", "", "", "", "public key cryptography",
                List.of("public key cryptography"), 30, 0.5, 2, 0.9, new SightingSite("A.java", 1));
        final ExportedConcept capture = new ExportedConcept("Card Capture",
                "card capture", "words", "", "the capture of a card transaction at the point of service",
                "Card Capture", "Cards", List.of("Cards"), 9, 0.5, 2, 0.9,
                new SightingSite("B.java", 1));
        final DrawnReading jpos = drawn.of(List.of(row("jpos",
                List.of(taxonomy("CSO", "public keys", 1.6), taxonomy("BIAN", "Card Capture", 1.5)),
                List.of(new ExportedTaxonomy("CSO", List.of(keys), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(16, 10, 9, 1.6, 0, 0.001, 7, 999)),
                        new ExportedTaxonomy("BIAN", List.of(capture), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(3, 2, 1, 1.5, 40, 0.041, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertAll(
                () -> assertThat(jpos.answers()).extracting(DrawnReading.DrawnAnswer::source)
                        .as("chance reached CSO's count least often, which is what says whose evidence "
                                + "is the stronger")
                        .containsExactly("CSO", "BIAN"),
                () -> assertThat(jpos.subjects()).extracting(DrawnReading.Subject::subject)
                        .as("BIAN says what Card Capture is and CSO says nothing about public keys, and "
                                + "the evidence ordering is not the description's")
                        .containsExactly("Cards", "public key cryptography"));
    }

    private static ExportedTaxonomy vocabulary(final String source, final int phrases, final int byChance,
                                               final int atLeastAsExtreme) {
        return new ExportedTaxonomy(source, List.of(), List.of(), Map.of(),
                new ExportedTaxonomy.Bar(phrases, byChance, byChance, (double) phrases / byChance,
                        atLeastAsExtreme, (atLeastAsExtreme + 1.0) / 1000, 7, 999));
    }

    @Test
    void ranksTheSourceChanceReachedLeastOftenAboveTheOneThatWroteMorePhrases() {
        final DrawnReading jpos = drawn.of(List.of(row("jpos",
                List.of(taxonomy("CSO", "public key cryptography", 1.6),
                        taxonomy("BIAN", "Card Capture", 1.5)),
                List.of(vocabulary("CSO", 16, 10, 40), vocabulary("BIAN", 3, 2, 4)),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertThat(jpos.answers()).extracting(DrawnReading.DrawnAnswer::source)
                .as("a count scales with how many terms a publisher states, and a probability does not")
                .containsExactly("BIAN", "CSO");
    }

    @Test
    void separatesTwoSourcesChanceNeverReachedByHowFarPastTheirBarTheyStand() {
        final DrawnReading both = drawn.of(List.of(row("mine",
                List.of(taxonomy("FIX", "MsgSeqNum", 10.4), taxonomy("BIAN", "Card Capture", 1.5)),
                List.of(vocabulary("FIX", 52, 5, 0), vocabulary("BIAN", 3, 2, 0)),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertThat(both.answers()).extracting(DrawnReading.DrawnAnswer::source)
                .as("999 deals cannot separate two counts no deal reached, so the count breaks the tie")
                .containsExactly("FIX", "BIAN");
    }

    @Test
    void ranksASourceByHowManyPhrasesBeyondChanceItReachedRatherThanByTheRatio() {
        final ExportedConcept weakness = new ExportedConcept("Process Control",
                "process control", "words", "", "", "", "External Control", List.of("External Control"), 4, 0.5, 2, 0.9,
                new SightingSite("A.java", 1));
        final ExportedConcept topic = new ExportedConcept("target language",
                "target language", "words", "", "", "", "machine translations", List.of("machine translations"), 35,
                0.5,
                2, 0.9, new SightingSite("B.java", 1));
        final DrawnReading tika = drawn.of(List.of(row("tika",
                List.of(taxonomy("CWE", "Process Control", 2.0), taxonomy("CSO", "target language", 1.43)),
                List.of(new ExportedTaxonomy("CWE", List.of(weakness), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(4, 2, 1, 2.0, 0, 0.001, 7, 999)),
                        new ExportedTaxonomy("CSO", List.of(topic), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(30, 21, 16, 1.43, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertAll(
                () -> assertThat(tika.answers()).extracting(DrawnReading.DrawnAnswer::source)
                        .as("four matches against a chance of two and thirty against twenty-one are not "
                                + "the same evidence, and the ratio calls the first the stronger")
                        .containsExactly("CSO", "CWE"),
                () -> assertThat(tika.answers()).extracting(DrawnReading.DrawnAnswer::beyondChance)
                        .containsExactly(9, 2),
                () -> assertThat(tika.subjects()).extracting(DrawnReading.Subject::subject)
                        .containsExactly("machine translations", "External Control"));
    }

    @Test
    void groupsAConceptUnderTheNearestLevelThatIsNotTheVocabularysOwnField() {
        final ExportedConcept beneathTheField = new ExportedConcept("MiscFeeType",
                "misc fee type", "words", "", "", "", "Common", List.of(), 4, 0.5, 3, 0.9,
                new SightingSite("A.java", 1));
        final DrawnReading quickfixj = drawn.of(List.of(row("quickfixj",
                List.of(taxonomy("FIX", "MiscFeeType", 10.4)),
                List.of(new ExportedTaxonomy("FIX", List.of(beneathTheField), List.of(), Map.of(),
                        new ExportedTaxonomy.Bar(52, 5, 3, 10.4, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertAll(
                () -> assertThat(quickfixj.subjects()).extracting(DrawnReading.Subject::subject)
                        .as("Common holds 68% of FIX and names only the vocabulary that matched, so a "
                                + "concept placed directly beneath it is placed nowhere a reader can use")
                        .containsExactly(""),
                () -> assertThat(quickfixj.subjects()).extracting(DrawnReading.Subject::readable)
                        .as("named by the phrase itself, since the publisher named no usable subject")
                        .containsExactly("misc fee type"));
    }

    @Test
    void keepsTwoPublishersNamingOneSubjectApart() {
        final ExportedConcept written = new ExportedConcept("Session", "session", "words", "", "", "",
                "Common", List.of(), 4, 0.5, 2, 0.9, new SightingSite("A.java", 1));
        final DrawnReading reading = drawn.of(List.of(row("mine",
                List.of(taxonomy("FIX", "MsgSeqNum", 2.0), taxonomy("FpML", "Scheme", 1.5)),
                List.of(new ExportedTaxonomy("FIX", List.of(written), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(4, 2, 1, 2.0, 0, 0.001, 7, 999)),
                        new ExportedTaxonomy("FpML", List.of(written), List.of(), Map.of(),
                                new ExportedTaxonomy.Bar(3, 2, 1, 1.5, 0, 0.001, 7, 999))),
                Optional.empty())), StatedAreas.none()).readings().getFirst();
        assertThat(reading.subjects()).extracting(DrawnReading.Subject::source)
                .as("deciding two publishers meant the same thing is a judgement nothing here can cite")
                .containsExactly("FIX", "FpML");
    }

    @Test
    void drawsWhereEverySchemePlacesItEvenWhereAVocabularyAnswered() {
        final DrawnReading reading = drawn.of(
                List.of(row("mine", taxonomy("OLiA", "BaseForm — strong inflection", 2.0))),
                StatedAreas.none()).readings().getFirst();
        assertAll(
                () -> assertThat(reading.placedIn()).singleElement()
                        .extracting(DrawnReading.Placement::scheme,
                                DrawnReading.Placement::archive, DrawnReading.Placement::category)
                        .as("BaseForm says nothing to a reader and Artificial Intelligence says a great "
                                + "deal, so a placement is drawn beside the matched subjects")
                        .containsExactly("OpenAlex", "Artificial Intelligence",
                                "Natural Language Processing Techniques"),
                () -> assertThat(reading.answers()).extracting(DrawnReading.DrawnAnswer::source)
                        .as("the answer is still the vocabulary; the placement is context beside it")
                        .containsExactly("OLiA"));
    }

    @Test
    void drawsNoLevelASchemeCouldNotSeparateFromChance() {
        final ReadingRow within = new ReadingRow("mine",
                List.of(taxonomy("OLiA", "BaseForm", 2.0)), List.of(), List.of(),
                List.of(new ExportedPlacement("OpenAlex", level("Artificial Intelligence", true),
                                level("Natural Language Processing Techniques", false)),
                        new ExportedPlacement("arXiv", level("Computer Science", false),
                                level("Computation and Language", false))),
                0.98, REFUSED, Optional.empty());
        assertThat(drawn.of(List.of(within), StatedAreas.none()).readings().getFirst().placedIn())
                .as("a subject printed with a caveat beside it is still a subject a reader takes at "
                        + "face value, so a level within chance is not drawn and a scheme with no such "
                        + "level is left out")
                .singleElement()
                .extracting(DrawnReading.Placement::scheme, DrawnReading.Placement::category)
                .containsExactly("OpenAlex", "");
    }

    @Test
    void marksAReadingReachingTheAreaItsManifestStates(@TempDir final Path directory)
            throws IOException {
        final Path manifest = directory.resolve("evaluation-set.tsv");
        Files.writeString(manifest, "# a manifest\ntika\torigin\tsha\tApache-2.0\tComputer Science\t"
                + "its own GitHub description\tout-of-domain\n");
        final StatedAreas stated = StatedAreas.at(manifest);
        final DrawnReading tika = drawn.of(List.of(row("tika",
                List.of(taxonomy("CSO", "the topics computer science is indexed by", 1.4)), List.of(),
                stated.of("tika"))), stated).readings().getFirst();
        assertAll(
                () -> assertThat(tika.statedArea()).isEqualTo("Computer Science"),
                () -> assertThat(tika.reachedItsArea())
                        .as("Natural Language Processing Techniques descends from Computer Science in "
                                + "OpenAlex's own hierarchy, so comparing the two labels would call a "
                                + "right answer wrong")
                        .isTrue());
    }

    @Test
    void putsAReadingThatAnsweredFromNothingOnNeitherScale() {
        final DrawnReading.DrawnAnswer none =
                drawn.of(List.of(row("mine", ExportedAnswer.NONE)), StatedAreas.none())
                        .readings().getFirst().answers().getFirst();
        assertAll(
                () -> assertThat(none.unit())
                        .as("a distance of zero bits is the origin of a log scale, which is nowhere")
                        .isEqualTo(DrawnReading.DrawnAnswer.NO_EVIDENCE),
                () -> assertThat(none.strength()).isZero(),
                () -> assertThat(none.concept()).isEmpty());
    }

    @Test
    void statesNoAreaAtAllWhereNoManifestNamesTheRepository() {
        final DrawnReading mine = drawn.of(List.of(row("mine", ExportedAnswer.NONE)), StatedAreas.none())
                .readings().getFirst();
        assertAll(
                () -> assertThat(mine.statedArea()).isNull(),
                () -> assertThat(mine.reachedItsArea()).isNull(),
                () -> assertThat(mine.sourceType()).isEqualTo("nothing"));
    }

    @Test
    void namesEveryVocabularyTheReadingSetAsideWithTheBarItFailed() {
        final DrawnReading tika = drawn.of(List.of(row("tika", taxonomy("CSO", "key agreement", 1.4))),
                StatedAreas.none()).readings().getFirst();
        assertAll(
                () -> assertThat(tika.belowTheirChanceBar())
                        .extracting(SetAside.RefusedVocabulary::vocabulary)
                        .as("a count cannot be argued with and a row can")
                        .containsExactly("CSO", "FIX"),
                () -> assertThat(tika.belowTheirChanceBar().getFirst().bar().phrases()).isEqualTo(17),
                () -> assertThat(tika.belowTheirChanceBar().getFirst().bar().chanceExpectedBest())
                        .isEqualTo(16));
    }
}
