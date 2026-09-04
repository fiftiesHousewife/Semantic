package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StatedSourcesTest {

    @Test
    void readsTheSourceTheCallerStatedAtThatPosition() {
        assertThat(new StatedSources("fibo", List.of("one", "two")).orDownloaded(1)).isEqualTo("two");
    }

    @Test
    void readsBlankForAPositionTheCallerStatedNothingAt() {
        assertThat(new StatedSources("cwe", List.of("one")).orDownloaded(1)).isEmpty();
    }

    @Test
    void readsAStatedSourceAsThePathItNames() {
        assertThat(new StatedSources("fibo", List.of("/checkouts/fibo")).path(0, "a fibo checkout"))
                .isEqualTo(Path.of("/checkouts/fibo"));
    }

    @Test
    void refusesAPathTheCallerDidNotStateAndSaysWhatTheExtractionReads() {
        final StatedSources sources = new StatedSources("fibo", List.of(""));

        assertThatThrownBy(() -> sources.path(0, "a fibo checkout"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("fibo")
                .hasMessageContaining("a fibo checkout");
    }

    @Test
    void refusesAStatedValueTheCallerLeftBlank() {
        final StatedSources sources = new StatedSources("cso-abstracts", List.of("summaries.jsonl"));

        assertThatThrownBy(() -> sources.stated(1, "the date the summaries were fetched"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("cso-abstracts")
                .hasMessageContaining("the date the summaries were fetched");
    }

    @Test
    void readsAStatedValueThatIsNotAPath() {
        assertThat(new StatedSources("cso-abstracts", List.of("summaries.jsonl", "2026-08-29"))
                .stated(1, "the date the summaries were fetched")).isEqualTo("2026-08-29");
    }
}
