package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ReadableNameTest {

    private final ReadableName readable = ReadableName.fromClasspath();

    @Test
    void leavesAPublishersOwnEnglishAlone() {
        assertThat(readable.of("public key cryptography"))
                .isEqualTo("public key cryptography");
    }

    @Test
    void splitsAnIdentifierWhoseEveryWordEnglishRanks() {
        assertAll(
                () -> assertThat(readable.of("SingleGeneralOrderHandling"))
                        .isEqualTo("single general order handling"),
                () -> assertThat(readable.of("ExecutionReport"))
                        .isEqualTo("execution report"),
                () -> assertThat(readable.of("QuoteRequest")).isEqualTo("quote request"),
                () -> assertThat(readable.of("QuantitativeValue"))
                        .isEqualTo("quantitative value"));
    }




    @Test
    void leavesAOneWordLabelAloneRatherThanRunningItIntoPieces() {
        assertAll(
                () -> assertThat(readable.of("multicasts"))
                        .as("the segmenter runs on frequency and will divide any run it can; multi casts "
                                + "reads worse than the label it came from")
                        .isEqualTo("multicasts"),
                () -> assertThat(readable.of("Session")).isEqualTo("session"),
                () -> assertThat(readable.of("encryption")).isEqualTo("encryption"));
    }

    @Test
    void refusesAPublishersParagraphWhereANameGoes() {
        assertThat(readable.of("InflectionTypeFeature"))
                .as("a publisher's paragraph is the concept's meaning and is stated where meanings are, "
                        + "never where a name goes")
                .isEqualTo("inflection type feature");
    }

    @Test
    void tellsAnIdentifierThatAnglicisesFromOneThatDoesNot() {
        assertAll(
                () -> assertThat(readable.anglicises("ExecutionReport")).isTrue(),
                () -> assertThat(readable.anglicises("SettlementInstruction")).isTrue(),
                () -> assertThat(readable.anglicises("MsgSeqNum")).isFalse(),
                () -> assertThat(readable.anglicises("ClOrdID")).isFalse());
    }
}
