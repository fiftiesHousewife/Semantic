package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StatementNullTest {

    private static final int DRAWS = 40;

    private static final long SEED = 20260813L;

    private static final List<Integer> SHAPE = List.of(4, 3);

    private static final TopicDistribution REFERENCE =
            new TopicDistribution(Map.of("linguistics", 0.7, "computing", 0.3), 0.0);

    private static WrittenWords written() {
        final WrittenWords words = new WrittenWords();
        List.of("language", "grammar", "parser", "speech", "algebra", "category", "word", "sentence")
                .forEach(word -> words.saw(word, "Reading.java:1", true));
        return words;
    }

    private static StatementNull seeded() {
        return new StatementNull(ProseReading.fromClasspath(), new JensenShannon(), DRAWS,
                new Random(SEED));
    }

    @Test
    void pricesAStatementOfThisShapeAgainstTheWrittenWords() {
        final PermutationNull.Chance chance = seeded().of(0.4, SHAPE, 1, written(), REFERENCE)
                .orElseThrow();
        assertAll(
                () -> assertThat(chance.observed()).isEqualTo(0.4),
                () -> assertThat(chance.resamples()).isLessThanOrEqualTo(DRAWS),
                () -> assertThat(chance.chanceExpectedBest()).isBetween(0.0, 1.0),
                () -> assertThat(chance.median()).isBetween(0.0, 1.0));
    }

    @Test
    void drawsTheSameFieldTwiceFromTheSameSeedSoAReportCanBeCompared() {
        assertThat(seeded().of(0.4, SHAPE, 1, written(), REFERENCE))
                .isEqualTo(seeded().of(0.4, SHAPE, 1, written(), REFERENCE));
    }

    @Test
    void raisesTheBarWithTheFieldOfStatementsJudgedTogether() {
        final PermutationNull.Chance alone = seeded().of(0.4, SHAPE, 1, written(), REFERENCE)
                .orElseThrow();
        final PermutationNull.Chance ofThree = seeded().of(0.4, SHAPE, 3, written(), REFERENCE)
                .orElseThrow();
        assertThat(ofThree.chanceExpectedBest()).isGreaterThanOrEqualTo(alone.chanceExpectedBest());
    }

    @Test
    void answersNothingWhereNoDrawCouldBeRead() {
        final WrittenWords unreadable = new WrittenWords();
        unreadable.saw("qzxv", "Reading.java:1", true);

        assertThat(seeded().of(0.4, SHAPE, 1, unreadable, REFERENCE)).isEqualTo(Optional.empty());
    }

    @Test
    void answersNothingWhereTheTreeWroteNoWords() {
        assertThat(seeded().of(0.4, SHAPE, 1, new WrittenWords(), REFERENCE))
                .isEqualTo(Optional.empty());
    }
}
