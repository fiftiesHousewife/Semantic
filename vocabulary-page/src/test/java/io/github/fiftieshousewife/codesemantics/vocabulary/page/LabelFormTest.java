package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class LabelFormTest {

    @Test
    void readsAPublishersOwnEnglishAsAPhrase() {
        assertAll(
                () -> assertThat(LabelForm.of("public key cryptography")).isEqualTo(LabelForm.PHRASE),
                () -> assertThat(LabelForm.of("hash functions")).isEqualTo(LabelForm.PHRASE),
                () -> assertThat(LabelForm.of("Loans and Deposits")).isEqualTo(LabelForm.PHRASE),
                () -> assertThat(LabelForm.of("Improper Control of a Resource Through its Lifetime"))
                        .isEqualTo(LabelForm.PHRASE));
    }

    @Test
    void readsANameAProgramDeclaresAsAnIdentifier() {
        assertAll(
                () -> assertThat(LabelForm.of("MsgSeqNum")).isEqualTo(LabelForm.IDENTIFIER),
                () -> assertThat(LabelForm.of("RawData")).isEqualTo(LabelForm.IDENTIFIER),
                () -> assertThat(LabelForm.of("QuantitativeValue")).isEqualTo(LabelForm.IDENTIFIER),
                () -> assertThat(LabelForm.of("BaseForm")).isEqualTo(LabelForm.IDENTIFIER),
                () -> assertThat(LabelForm.of("encryption"))
                        .as("one English word is still one run, and a subject of one word says little "
                                + "more than the vocabulary that matched")
                        .isEqualTo(LabelForm.IDENTIFIER));
    }

    @Test
    void readsACapitalInsideAWordAsAnIdentifierHoweverManyWordsItCarries() {
        assertThat(LabelForm.of("SecuritiesReferenceData MarketData")).isEqualTo(LabelForm.IDENTIFIER);
    }

    @Test
    void readsALabelStatingNothingAsAnIdentifierBecauseThereIsNoPhraseInIt() {
        assertThat(LabelForm.of("")).isEqualTo(LabelForm.IDENTIFIER);
    }
}
