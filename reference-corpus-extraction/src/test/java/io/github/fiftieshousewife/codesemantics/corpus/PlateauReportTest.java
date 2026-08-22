package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PlateauReportTest {

    private static final List<CountedRepository> DRAWN = IntStream.range(0, 4)
            .mapToObj(at -> new CountedRepository("drawn" + at, mixing(100 + 50 * at, 400 - 50 * at)))
            .toList();

    @Test
    void writesADashForTheFirstRepositoryBecauseNothingPrecedesIt() {
        assertThat(rowFor("    1  drawn0")).contains("-");
    }

    @Test
    void namesEverySectionWithTheWeightingItWasMeasuredUnder() {
        assertAll(
                () -> assertThat(measured())
                        .contains("MEAN_OF_SHARES: how far two independent corpora of a size disagree"),
                () -> assertThat(measured())
                        .contains("MEAN_OF_SHARES: how far the reference moves as each repository joins"),
                () -> assertThat(measured())
                        .contains("MEAN_OF_SHARES: how far the reference moves if one repository leaves"));
    }

    @Test
    void statesTheRateTheErrorFallsAtAndWhatHalvingItCosts() {
        assertThat(measured()).contains("the error falls as size to the power");
    }

    @Test
    void measuresDisagreementUpToHalfTheDraw() {
        assertThat(measured().lines().filter(line -> line.matches("\\s+\\d+\\s+\\d+(\\s+[0-9.]+){3}")).count())
                .isEqualTo(2);
    }

    @Test
    void reportsEveryRepositoryInBothCurves() {
        assertThat(DRAWN).allSatisfy(repository ->
                assertThat(measured().lines().filter(line -> line.contains(repository.name())).count())
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

    private static WrittenWords mixing(final int kettle, final int lantern) {
        final WrittenWords written = new WrittenWords();
        IntStream.range(0, kettle).forEach(at -> written.saw("kettle", "Kettle.java:" + at, true));
        IntStream.range(0, lantern).forEach(at -> written.saw("lantern", "Lantern.java:" + at, true));
        return written;
    }
}
