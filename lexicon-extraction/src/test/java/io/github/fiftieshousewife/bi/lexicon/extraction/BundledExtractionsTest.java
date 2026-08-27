package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BundledExtractionsTest {

    @Test
    void namesEveryExtractionOnce() {
        assertThat(Stream.of(BundledExtractions.values()).map(BundledExtractions::taxonomy).distinct())
                .hasSize(BundledExtractions.values().length);
    }

    @Test
    void resolvesAnExtractionByItsName() {
        assertThat(BundledExtractions.named("cwe")).isEqualTo(BundledExtractions.CWE);
    }

    @Test
    void refusesAnUnknownNameAndListsWhatCanBeNamed() {
        assertThatThrownBy(() -> BundledExtractions.named("acm-ccs"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("acm-ccs")
                .hasMessageContaining("fibo");
    }

    @Test
    void passesBlankForASourceTheCallerDidNotState() {
        assertThat(BundledExtractions.source(List.of("one"), 1)).isEmpty();
    }
}
