package org.fifties.housewife.codesemantics.name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordRanksTest {

    private static final String WORD_LIST_RESOURCE = "common-english-words.txt";

    private final WordRanks words = WordRanks.fromClasspath();

    @Test
    void ranksTheMostFrequentWordFirst() {
        assertThat(words.rank("the")).isEqualTo(1);
    }

    @Test
    void doesNotCountTheProvenanceHeaderAsAWord() {
        assertAll(
                () -> assertThat(words.knows("#")).isFalse(),
                () -> assertThat(words.knows("source")).isTrue(),
                () -> assertThat(words.rank("the"))
                        .as("a list that states where it came from must not shift every rank by saying so")
                        .isEqualTo(1));
    }

    @Test
    void readsAWordInWhateverCaseAnIdentifierWroteIt() {
        assertThat(words.rank("Event")).isEqualTo(words.rank("event"));
    }

    @Test
    void reportsAWordItDoesNotCarryAsUnranked() {
        assertAll(
                () -> assertThat(words.rank("qzxfgh")).isEqualTo(WordRanks.UNKNOWN_RANK),
                () -> assertThat(words.knows("qzxfgh")).isFalse());
    }

    @Test
    void ordersACommonWordAheadOfARarerOne() {
        assertThat(words.rank("event")).isLessThan(words.rank("archive"));
    }

    @Test
    void carriesOneRankPerListedLineSoRankIsPosition() throws IOException {
        assertThat(words.size())
                .as("a repeated word would leave every later rank one short of its line position")
                .isEqualTo(listedWords());
    }

    private static int listedWords() throws IOException {
        final InputStream stream = Objects.requireNonNull(
                WordRanksTest.class.getClassLoader().getResourceAsStream(WORD_LIST_RESOURCE),
                WORD_LIST_RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            return (int) reader.lines()
                    .map(String::strip)
                    .filter(line -> !line.isEmpty() && !line.startsWith("#"))
                    .distinct()
                    .count();
        }
    }
}
