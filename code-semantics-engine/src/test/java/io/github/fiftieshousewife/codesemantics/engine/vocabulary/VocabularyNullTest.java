package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class VocabularyNullTest {

    private static final int DRAWS = 99;

    private static final long SEED = 20260816L;

    private final VocabularyNull chance = new VocabularyNull(new ShareDivergence(), DRAWS, SEED);

    @Test
    void setsABarEachReferenceAnsweredForItself() {
        final List<VocabularyNull.Bar> bars = chance.over(wrote(400), List.of(evenOver(200), evenOver(20)));

        assertAll(
                () -> assertThat(bars).map(VocabularyNull.Bar::reference)
                        .containsExactly("even over 200", "even over 20"),
                () -> assertThat(bars).allSatisfy(bar -> assertThat(bar.bits()).isBetween(0.0, 1.0)),
                () -> assertThat(bars.getLast().bits())
                        .as("a word's term of the divergence scales with the share it holds, so a reference "
                                + "concentrated on few words sets a higher bar than one spread thin")
                        .isGreaterThan(bars.getFirst().bits()));
    }

    @Test
    void statesWhatEachBarWasDrawnFrom() {
        final VocabularyNull.Bar bar = chance.over(wrote(400), List.of(evenOver(200))).getFirst();

        assertAll(
                () -> assertThat(bar.resamples()).isEqualTo(DRAWS),
                () -> assertThat(bar.field()).as("one test per word this repository wrote").isEqualTo(400),
                () -> assertThat(bar.drawn()).isGreaterThan(bar.field()));
    }

    @Test
    void drawsTheSameBarTwiceFromOneSeed() {
        final ReferenceVocabulary reference = evenOver(200);

        assertThat(chance.over(wrote(400), List.of(reference)).getFirst().bits())
                .isEqualTo(chance.over(wrote(400), List.of(reference)).getFirst().bits());
    }

    @Test
    void setsALowerBarForARepositoryThatWroteMore() {
        final ReferenceVocabulary reference = evenOver(200);

        assertThat(chance.over(wrote(4_000), List.of(reference)).getFirst().bits())
                .as("more occurrences is a better estimate of the reference, so chance reaches less far")
                .isLessThan(chance.over(wrote(400), List.of(reference)).getFirst().bits());
    }

    private static WrittenWords wrote(final int words) {
        final WrittenWords written = new WrittenWords();
        IntStream.range(0, words).forEach(word -> written.saw("word" + word, "Names.java:1", true));
        return written;
    }

    /** A reference that writes this many words at one rate — the flattest null a bar can be read from. */
    private static ReferenceVocabulary evenOver(final int words) {
        final Map<String, Double> shares = IntStream.range(0, words).boxed()
                .collect(java.util.stream.Collectors.toUnmodifiableMap(
                        word -> "word" + word, word -> 1.0 / words));
        return new ReferenceVocabulary() {
            @Override
            public String name() {
                return "even over " + words;
            }

            @Override
            public Map<String, Double> shareByWord() {
                return shares;
            }
        };
    }
}
