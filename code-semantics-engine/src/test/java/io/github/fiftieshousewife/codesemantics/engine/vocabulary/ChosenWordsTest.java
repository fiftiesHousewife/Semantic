package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;
import io.github.fiftieshousewife.codesemantics.engine.reading.CitedExpansions;
import io.github.fiftieshousewife.codesemantics.engine.reading.Dialect;
import io.github.fiftieshousewife.codesemantics.engine.reading.WordPipeline;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertAll;

class ChosenWordsTest {

    private static final String SITE = "Reading.java:7";

    private static ReferenceVocabulary reference(final String name, final Map<String, Double> shares) {
        return new ReferenceVocabulary() {
            @Override
            public String name() {
                return name;
            }

            @Override
            public Map<String, Double> shareByWord() {
                return shares;
            }
        };
    }

    private static WrittenWords wrote(final Map<String, Integer> occurrences) {
        final WrittenWords written = new WrittenWords();
        occurrences.forEach((word, times) -> {
            for (int each = 0; each < times; each++) {
                written.saw(word, SITE, true);
            }
        });
        return written;
    }

    private final ChosenWords chosen = new ChosenWords(
            List.of(reference("English", Map.of("the", 0.9, "word", 0.05, "list", 0.05)),
                    reference("the platform", Map.of("list", 0.9, "word", 0.05, "the", 0.05))),
            new ShareDivergence(),
            new WordPipeline(word -> word.length() < 3, CitedExpansions.NONE,
                    FunctionWords.fromClasspath()::includes, word -> word, Dialect.none()));

    @Test
    void ranksAWordNeitherReferenceWritesAboveOneBothDo() {
        final List<ChosenWord> ranked = chosen.in(wrote(Map.of("synset", 40, "the", 40, "list", 40)));

        assertThat(ranked).extracting(ChosenWord::word).first()
                .as("a word only this repository writes is the one it chose")
                .isEqualTo("synset");
    }

    @Test
    void refusesAWordOneReferenceWritesMoreDenselyHoweverLoudlyTheOtherAgrees() {
        final List<ChosenWord> ranked = chosen.in(wrote(Map.of("list", 90, "synset", 10)));

        assertThat(ranked).filteredOn(word -> word.word().equals("list")).singleElement()
                .satisfies(list -> assertAll(
                        () -> assertThat(list.claim())
                                .as("a word one reference calls ordinary is ordinary, so its claim is a "
                                        + "negative and it sorts below what survived")
                                .isNegative(),
                        () -> assertThat(ranked.indexOf(list)).isEqualTo(ranked.size() - 1)));
    }

    @Test
    void keepsEveryWordItWasGivenRatherThanRemovingTheOnesTheReferencesRefuse() {
        final List<ChosenWord> ranked = chosen.in(wrote(Map.of("the", 50, "list", 30, "synset", 20)));

        assertThat(ranked).extracting(ChosenWord::word).containsExactlyInAnyOrder("the", "list", "synset");
    }

    @Test
    void saysOfEachWordWhetherEnglishSuppliedItWithoutMovingItsPlace() {
        final List<ChosenWord> ranked = chosen.in(wrote(Map.of("by", 90, "synset", 10)));

        assertThat(ranked).extracting(ChosenWord::word, ChosenWord::theLanguages)
                .as("a preposition is still ranked, and still first, and is marked as the language's")
                .containsExactly(tuple("by", true), tuple("synset", false));
    }

    @Test
    void drawsOneChanceBarPerReferenceReproduciblyFromTheSeed() {
        final WrittenWords written = wrote(Map.of("synset", 40, "the", 40, "list", 40));

        final List<VocabularyNull.Bar> bars = chosen.chanceFor(written, 11L);

        assertAll(
                () -> assertThat(bars).extracting(VocabularyNull.Bar::reference)
                        .containsExactly("English", "the platform"),
                () -> assertThat(bars).isEqualTo(chosen.chanceFor(written, 11L)));
    }

    @Test
    void carriesTheCountsAndTheSiteAReaderNeedsToArgueWithARow() {
        final WrittenWords written = wrote(Map.of("synset", 3));
        written.saw("synset", "Prose.java:2", false);

        assertThat(chosen.in(written)).singleElement().satisfies(word -> assertAll(
                () -> assertThat(word.occurrences()).isEqualTo(4),
                () -> assertThat(word.inNames()).isEqualTo(3),
                () -> assertThat(word.nameShare()).isEqualTo(0.75),
                () -> assertThat(word.site()).isEqualTo(SITE),
                () -> assertThat(word.against()).extracting(ChosenWord.ReferenceClaim::reference)
                        .containsExactly("English", "the platform")));
    }
}
