package io.github.fiftieshousewife.codesemantics.corpus;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusPoolingErrorTest {

    private static WrittenWords wrote(final String word, final int times, final String other,
                                      final int otherTimes) {
        final WrittenWords written = new WrittenWords();
        for (int each = 0; each < times; each++) {
            written.saw(word, "a.java", true);
        }
        for (int each = 0; each < otherTimes; each++) {
            written.saw(other, "a.java", true);
        }
        return written;
    }

    @Test
    void statesTheBetweenRepositoryStandardErrorOfTheMeanShare() {
        final CorpusWords corpus = new CorpusWords();
        corpus.add(wrote("kettle", 3, "depth", 1));
        corpus.add(wrote("kettle", 1, "depth", 3));

        final double mean = CorpusPooling.MEAN_OF_SHARES.shareOf("kettle", corpus);
        final double error = CorpusPooling.MEAN_OF_SHARES.errorOf("kettle", corpus);

        assertAll(
                () -> assertThat(mean)
                        .as("shares 0.75 and 0.25 average to 0.5")
                        .isCloseTo(0.5, within(1e-12)),
                () -> assertThat(error)
                        .as("the sample standard deviation of 0.75 and 0.25 is 0.3536, over sqrt(2)")
                        .isCloseTo(0.25, within(1e-12)));
    }

    @Test
    void statesNoErrorForASingleRepositoryWhoseVarianceHasNoDenominator() {
        final CorpusWords corpus = new CorpusWords();
        corpus.add(wrote("kettle", 3, "depth", 1));

        assertThat(CorpusPooling.MEAN_OF_SHARES.errorOf("kettle", corpus)).isZero();
    }

    @Test
    void statesTheBinomialErrorUnderPooledOccurrences() {
        final CorpusWords corpus = new CorpusWords();
        corpus.add(wrote("kettle", 3, "depth", 2));

        assertThat(CorpusPooling.POOLED_OCCURRENCES.errorOf("kettle", corpus))
                .as("p of 0.6 over 5 occurrences")
                .isCloseTo(Math.sqrt(0.6 * 0.4 / 5), within(1e-12));
    }
}
