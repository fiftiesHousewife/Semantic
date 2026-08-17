package io.github.fiftieshousewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CommonestSenseDomainsTest {

    private final Lexicon lexicon = WordNetLexicon.fromClasspath();

    @Test
    void saysNothingAboutAWordWhoseCommonestSenseCarriesNoSubject() {
        assertAll(
                () -> assertThat(lexicon.commonestSenseDomains("cite"))
                        .as("eight senses, one labelled, and the labelled one is being summoned to court — "
                                + "which a library citing dictionaries never means")
                        .isEmpty(),
                () -> assertThat(lexicon.domainsOf("cite"))
                        .as("where pooling every sense says law with nothing behind it")
                        .contains("law"));
    }

    @Test
    void keepsTheSubjectOfAWordWhoseCommonestSenseCarriesOne() {
        assertThat(lexicon.commonestSenseDomains("publish")).contains("publishing");
    }

    @Test
    void readsAnInflectionThroughTheDictionarysOwnLemma() {
        assertThat(lexicon.commonestSenseDomains("publishes"))
                .as("the resource is keyed by the lemma, and morphology is what reaches it")
                .isEqualTo(lexicon.commonestSenseDomains("publish"));
    }

    @Test
    void readsAWordUsedAsANameThroughItsNounSense() {
        assertThat(lexicon.commonestSenseDomains("file"))
                .as("to file is a legal act and a file is a thing a program reads; an identifier is a noun "
                        + "phrase, and reading the verb made a repository of parsed files read as law")
                .doesNotContain("law");
    }

    @Test
    void abstainsOnAWordTheDictionaryDoesNotKnow() {
        assertThat(lexicon.commonestSenseDomains("jwnlexception")).isEmpty();
    }
}
