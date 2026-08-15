package org.fifties.housewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * How many senses the dictionary carries for a word — the denominator a consumer needs before treating a
 * sense-labelled resource's one label as the word's subject.
 */
class WordNetSenseCountTest {

    private final Lexicon lexicon = WordNetLexicon.fromClasspath();

    @Test
    void countsEverySenseAcrossEveryPartOfSpeech() {
        assertAll(
                () -> assertThat(lexicon.senseCount("cite"))
                        .as("a court cites a defendant and a paper cites a source, among others")
                        .isGreaterThan(1),
                () -> assertThat(lexicon.senseCount("word")).isGreaterThan(lexicon.senseCount("hypernym")));
    }

    @Test
    void countsNothingForAWordItDoesNotKnow() {
        assertAll(
                () -> assertThat(lexicon.senseCount("qzxfgh")).isZero(),
                () -> assertThat(lexicon.senseCount("extjwnl")).isZero());
    }

    @Test
    void countsNothingForACompoundTheDictionaryDoesNotPublishRatherThanCountingItsHead() {
        assertThat(lexicon.senseCount("title_basics"))
                .as("phrase lookup would resolve a compound to its head, which would be a lie about it")
                .isZero();
    }

    @Test
    void countsTheCollocationsItDoesPublishFromTheirOwnEntry() {
        assertAll(
                () -> assertThat(lexicon.senseCount("double_fault"))
                        .as("a run the dictionary publishes has senses of its own to speak against")
                        .isPositive(),
                () -> assertThat(lexicon.senseCount("double_fault"))
                        .as("and they are the run's senses, never the head word's")
                        .isLessThan(lexicon.senseCount("fault")));
    }

    @Test
    void countsAtLeastAsManySensesAsTheDomainResourceLabels() {
        assertThat(lexicon.senseCount("cite"))
                .as("a label sits on a sense, so labels can never outnumber the senses they sit on")
                .isGreaterThanOrEqualTo(lexicon.senseDomainsOf("cite").size());
    }
}
