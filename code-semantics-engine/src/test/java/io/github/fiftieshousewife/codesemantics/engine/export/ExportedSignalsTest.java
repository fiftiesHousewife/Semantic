package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord.ReferenceClaim;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ExportedSignalsTest {

    private static final String ENGLISH = "ordinary English";
    private static final String PLATFORM = "the platform's own API";

    private static final Map<String, Double> THRESHOLDS = Map.of(ENGLISH, 0.010, PLATFORM, 0.015);

    private final ExportedSignals signals = new ExportedSignals(THRESHOLDS, ReadingSource.CLONE);

    private static ChosenWord word(final String surface, final double english, final double platform) {
        return new ChosenWord(surface, 40, 30, Math.min(english, platform), 0.004,
                List.of(new ReferenceClaim(ENGLISH, 0.001, Math.abs(english), english > 0),
                        new ReferenceClaim(PLATFORM, 0.002, Math.abs(platform), platform > 0)),
                "engine/src/main/java/Reading.java:12", false);
    }

    @Test
    void keepsAWordScoringAboveEveryReferencesOwnThreshold() {
        final List<ExportedSignal> exported = signals.in(List.of(word("lemma", 0.050, 0.020)));

        assertAll(
                () -> assertThat(exported).singleElement()
                        .extracting(ExportedSignal::word).isEqualTo("lemma"),
                () -> assertThat(exported.getFirst().occurrences()).isEqualTo(40),
                () -> assertThat(exported.getFirst().occurrencesInNames()).isEqualTo(30),
                () -> assertThat(exported.getFirst().divergenceBits()).isEqualTo(0.020),
                () -> assertThat(exported.getFirst().readFrom()).isEqualTo(ReadingSource.CLONE),
                () -> assertThat(exported.getFirst().firstWrittenAt())
                        .isEqualTo(new SightingSite("engine/src/main/java/Reading.java", 12)));
    }

    @Test
    void namesTheReferenceScoringTheWordLowest() {
        assertThat(signals.in(List.of(word("lemma", 0.050, 0.020))).getFirst().closestReference())
                .as("0.040 above the English threshold and 0.005 above the platform's, so the platform decided it")
                .isEqualTo(PLATFORM);
    }

    @Test
    void omitsAWordOneReferenceWritesMoreDenselyThanTheRepositoryDoes() {
        assertThat(signals.in(List.of(word("get", 0.900, -0.300)))).isEmpty();
    }

    @Test
    void omitsAWordScoringBelowOneReferencesThreshold() {
        assertThat(signals.in(List.of(word("entry", 0.050, 0.014))))
                .as("0.014 bits against the platform's threshold of 0.015")
                .isEmpty();
    }

    @Test
    void keepsTheRankingsOwnOrder() {
        assertThat(signals.in(List.of(word("lemma", 0.050, 0.040), word("synset", 0.030, 0.020))))
                .map(ExportedSignal::word)
                .containsExactly("lemma", "synset");
    }
}
