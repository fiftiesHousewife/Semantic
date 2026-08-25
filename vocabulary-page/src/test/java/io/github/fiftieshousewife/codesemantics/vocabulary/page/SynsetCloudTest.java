package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

import io.github.fiftieshousewife.bi.lexicon.WordSense;
import io.github.fiftieshousewife.codesemantics.engine.theme.SenseDomains;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SynsetCloudTest {

    private static final Function<String, Optional<WordSense>> SENSES = SynsetCloudTest::senseOf;

    private static Optional<WordSense> senseOf(final String word) {
        return Optional.ofNullable(Map.of(
                "word", new WordSense("noun", 6294109L, "word", "n", 1),
                "vocable", new WordSense("noun", 6294109L, "word", "n", 1),
                "parser", new WordSense("noun", 6127211L, "parser", "n", 1)).get(word));
    }

    private static final SenseDomains DOMAINS =
            word -> "parser".equals(word) ? List.of(Set.of("computing")) : List.of(Set.of("linguistics"));

    private static final List<ScoredWord> WORDS = List.of(
            new ScoredWord("word", 0.010), new ScoredWord("vocable", 0.004),
            new ScoredWord("parser", 0.006), new ScoredWord("qux", 0.002));

    private final SynsetCloud cloud = SynsetCloud.of("a-repository", WORDS, SENSES, DOMAINS);

    @Test
    void gathersTwoWordsOfOneSynsetIntoOneTileWithTheirClaimsSummed() {
        assertAll(
                () -> assertThat(cloud.senses()).hasSize(2),
                () -> assertThat(cloud.senses().getFirst().claim())
                        .as("word 0.010 and vocable 0.004 are one meaning at 0.014, above parser's 0.006")
                        .isEqualTo(0.014),
                () -> assertThat(cloud.senses().getFirst().members())
                        .extracting(SynsetCloud.Member::word)
                        .as("strongest spelling first, so a merged tile leads with the word a reader knows")
                        .containsExactly("word", "vocable"));
    }

    @Test
    void carriesTheSenseAndItsDomainsForTheReadout() {
        assertAll(
                () -> assertThat(cloud.senses().getFirst().partOfSpeech()).isEqualTo("noun"),
                () -> assertThat(cloud.senses().getFirst().offset()).isEqualTo(6294109L),
                () -> assertThat(cloud.senses().getLast().domains()).containsExactly("computing"));
    }

    @Test
    void countsAWordTheDictionaryStatesNoSenseForRatherThanDroppingIt() {
        assertAll(
                () -> assertThat(cloud.significantWords()).isEqualTo(4),
                () -> assertThat(cloud.wordsWithoutASense())
                        .as("qux resolves to no sense")
                        .isOne());
    }
}
