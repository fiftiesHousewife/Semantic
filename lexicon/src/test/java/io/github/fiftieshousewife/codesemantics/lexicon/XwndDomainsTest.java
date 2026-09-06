package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class XwndDomainsTest {

    private final Lexicon lexicon = WordNetLexicon.fromClasspath();
    private final XwndSenseDomains xwnd = XwndSenseDomains.fromClasspath();

    @Test
    void statesOneEntryPerDictionarySense() {
        assertThat(xwnd.countedSenseDomainsOf("bank"))
                .hasSize(lexicon.senseCount("bank"));
    }

    @Test
    void joinsTheBundledDictionaryByOffsetForMostSenses() {
        final List<String> words = List.of("bank", "word", "language", "price", "curve", "protocol",
                "queue", "node", "file", "server", "buffer", "index", "table", "column", "thread",
                "packet", "cache", "socket", "parser", "token", "grammar", "verb", "noun", "sentence",
                "money", "trade", "market", "risk", "signal", "domain");
        final List<CountedSenseDomains> senses = words.stream()
                .flatMap(word -> xwnd.countedSenseDomainsOf(word).stream())
                .toList();
        final long labelled = senses.stream().filter(sense -> !sense.domains().isEmpty()).count();
        final double rate = (double) labelled / senses.size();
        assertAll(
                () -> assertThat(senses.size()).isGreaterThan(100),
                () -> assertThat(rate)
                        .as("the WordNet 3.0 offsets must reach most of the bundled 3.1 senses, or the "
                                + "join is not usable: %d of %d senses labelled", labelled, senses.size())
                        .isGreaterThan(0.8));
    }

    @Test
    void weighsEachLabelByItsPropagationWeightAgainstTheUniformWeight() {
        final List<CountedSenseDomains> weighed =
                xwnd.weighedCountedSenseDomainsOf("bank");

        assertAll(
                () -> assertThat(weighed)
                        .extracting(CountedSenseDomains::domains)
                        .as("the labels are the same as the unweighed reading's")
                        .containsExactlyElementsOf(xwnd
                                .countedSenseDomainsOf("bank").stream()
                                .map(CountedSenseDomains::domains)
                                .toList()),
                () -> assertThat(weighed)
                        .filteredOn(sense -> !sense.domains().isEmpty())
                        .as("a stated weight is finite, so its strength sits strictly inside (0, 1)")
                        .allMatch(sense -> sense.labelStrength() > 0.0 && sense.labelStrength() < 1.0),
                () -> assertThat(weighed)
                        .filteredOn(sense -> sense.domains().isEmpty())
                        .as("a sense the table does not label keeps full strength on its empty label set")
                        .allMatch(sense -> sense.labelStrength() == 1.0));
    }
}
