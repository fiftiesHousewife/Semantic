package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlateauReportTest {

    private static final List<CountedRepository> DRAWN = List.of(
            new CountedRepository("kettle", writing("kettle", 100)),
            new CountedRepository("lantern", writing("lantern", 100)));

    @Test
    void writesADashForTheFirstRepositoryBecauseNothingPrecedesIt() {
        assertThat(rowFor("    1  kettle")).contains("-");
    }

    @Test
    void statesTheStepAndTheDistanceToTheWholeDrawInBits() {
        final String last = rowFor("    2  lantern");
        assertAll(
                () -> assertThat(last).contains("0.311278"),
                () -> assertThat(last).contains("0.000000"));
    }

    @Test
    void namesBothSectionsWithTheWeightingTheyWereMeasuredUnder() {
        assertAll(
                () -> assertThat(measured())
                        .contains("MEAN_OF_SHARES: how far the reference moves as each repository joins"),
                () -> assertThat(measured())
                        .contains("MEAN_OF_SHARES: how far the reference moves if one repository leaves"));
    }

    @Test
    void reportsEveryRepositoryInBothSections() {
        assertAll(
                () -> assertThat(measured().lines().filter(line -> line.contains("kettle")).count())
                        .isEqualTo(2),
                () -> assertThat(measured().lines().filter(line -> line.contains("lantern")).count())
                        .isEqualTo(2));
    }

    private static String rowFor(final String prefix) {
        return measured().lines()
                .filter(line -> line.startsWith(prefix))
                .findFirst()
                .orElseThrow();
    }

    private static String measured() {
        return CorpusPlateauCommand.measured(DRAWN, CorpusPooling.MEAN_OF_SHARES);
    }

    private static WrittenWords writing(final String word, final int times) {
        final WrittenWords written = new WrittenWords();
        IntStream.range(0, times).forEach(at -> written.saw(word, word + ".java:" + at, true));
        return written;
    }
}
