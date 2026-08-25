package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CountedSenseDomainsTest {

    private final Lexicon lexicon = WordNetLexicon.fromClasspath();

    @Test
    void statesOneEntryPerDictionarySenseAcrossEveryPartOfSpeech() {
        assertThat(lexicon.countedSenseDomainsOf("bank"))
                .hasSize(lexicon.senseCount("bank"));
    }

    @Test
    void carriesTheTaggedCorpusCountBesideEachSensesDomains() {
        final List<CountedSenseDomains> senses = lexicon.countedSenseDomainsOf("bank");

        assertAll(
                () -> assertThat(senses.stream().mapToInt(CountedSenseDomains::uses).max().orElse(0))
                        .as("the corpus counted bank's common senses")
                        .isPositive(),
                () -> assertThat(senses.stream().map(CountedSenseDomains::domains).flatMap(Set::stream))
                        .as("the resource labels the depository sense with its subject")
                        .contains("economy"));
    }

    @Test
    void keepsTheSensesTheResourceLabelsNothingWith() {
        assertThat(lexicon.countedSenseDomainsOf("bank"))
                .as("a sense with no topical label is a share of the word on no domain, not an absence")
                .anyMatch(sense -> sense.domains().isEmpty());
    }

    @Test
    void statesNothingForAFormTheDictionaryDoesNotHold() {
        assertThat(lexicon.countedSenseDomainsOf("qzx")).isEmpty();
    }
}
