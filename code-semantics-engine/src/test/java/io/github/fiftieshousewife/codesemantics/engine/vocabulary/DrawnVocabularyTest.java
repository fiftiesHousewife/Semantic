package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DrawnVocabularyTest {

    private static final long SEED = 41L;

    private static final List<String> WORDS = List.of("mass", "topic", "sense", "share", "scope");

    private static Map<String, Double> sharesInOrder(final List<String> order) {
        final Map<String, Double> shares = new LinkedHashMap<>();
        order.forEach(word -> shares.put(word, 1.0 / order.size()));
        return shares;
    }

    @Test
    void drawsTheSameWordsFromTheSameSeedWhateverOrderTheReferenceIteratesIn() {
        final Map<String, Double> drawn = new DrawnVocabulary(sharesInOrder(WORDS))
                .of(200, new Random(SEED));
        final Map<String, Double> drawnFromReversed = new DrawnVocabulary(sharesInOrder(WORDS.reversed()))
                .of(200, new Random(SEED));

        assertThat(drawn).isEqualTo(drawnFromReversed);
    }

    @Test
    void drawsSharesOfTheStatedSizeSummingToOne() {
        final Map<String, Double> drawn = new DrawnVocabulary(sharesInOrder(WORDS))
                .of(200, new Random(SEED));

        assertThat(drawn.values().stream().mapToDouble(Double::doubleValue).sum()).isEqualTo(1.0);
    }
}
