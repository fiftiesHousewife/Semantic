package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class BundledExtractionsTest {

    @Test
    void namesEveryExtractionOnce() {
        assertThat(BundledExtractions.all().stream().map(BundledExtraction::taxonomy).distinct())
                .hasSize(BundledExtractions.all().size());
    }

    @Test
    void statesWhatEveryExtractionReads() {
        assertThat(BundledExtractions.all()).allSatisfy(bundled ->
                assertThat(bundled.reads()).isNotBlank());
    }

    @Test
    void resolvesAnExtractionByItsName() {
        assertThat(BundledExtractions.named("cwe").taxonomy()).isEqualTo("cwe");
    }

    @Test
    void refusesAnUnknownNameAndSaysWhatEveryBundledExtractionReads() {
        assertThatThrownBy(() -> BundledExtractions.named("acm-ccs"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("acm-ccs")
                .hasMessageContaining("fibo reads a FIBO checkout");
    }

    @Test
    void refusesASourceTheExtractionReadsOffDiskAndTheCallerDidNotName() {
        assertThatThrownBy(() -> BundledExtractions.named("fibo").extract(List.of(""), Path.of("resources")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("fibo")
                .hasMessageContaining("a fibo checkout");
    }

    @Test
    void passesBlankForASourceAnExtractionDownloadsForItself() {
        final StatedSources sources = new StatedSources("cwe", List.of());

        assertAll(
                () -> assertThat(sources.orDownloaded(0)).isEmpty(),
                () -> assertThat(BundledExtractions.named("cwe").reads()).contains("blank to download"));
    }
}
