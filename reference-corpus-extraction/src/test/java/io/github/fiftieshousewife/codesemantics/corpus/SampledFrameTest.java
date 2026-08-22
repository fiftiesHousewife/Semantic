package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class SampledFrameTest {

    private static final String FRAME = "language:Java";
    private static final String UNTIL = "2009-12-31T23:59:59Z";
    private static final ObjectMapper JSON = new ObjectMapper();

    /** A frame whose every yearly count is stated, so a rank resolves without a network. */
    private record Stated(Map<String, Long> counts, List<String> paged) implements RepositorySearch {

        @Override
        public long count(final String query) {
            return counts.entrySet().stream()
                    .filter(stated -> query.contains(stated.getKey()))
                    .mapToLong(Map.Entry::getValue)
                    .findFirst()
                    .orElse(0L);
        }

        @Override
        public List<JsonNode> oldestFirst(final String query, final int perPage, final int page) {
            return paged.stream().map(name -> (JsonNode) JSON.createObjectNode().put("full_name", name))
                    .toList();
        }
    }

    @Test
    void countsEveryYearAndSumsThemIntoTheFrame() {
        final SampledFrame frame = new SampledFrame(new Stated(
                Map.of("2007-01-01", 0L, "2008-01-01", 221L, "2009-01-01", 1414L), List.of()), FRAME, UNTIL);

        assertAll(
                () -> assertThat(frame.index()).isEqualTo(1635L),
                () -> assertThat(frame.windows()).extracting(SampledFrame.Window::year)
                        .containsExactly(2007, 2008, 2009));
    }

    @Test
    void refusesAYearGitHubWouldEstimateRatherThanCount() {
        final SampledFrame frame = new SampledFrame(
                new Stated(Map.of("2008-01-01", 2_000_000L), List.of()), FRAME, UNTIL);

        assertThatThrownBy(frame::index)
                .as("above about a million GitHub estimates, and a rank cannot be resolved against a "
                        + "number that moves")
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("estimates rather than counts");
    }

    @Test
    void resolvesARankToTheRepositoryHoldingIt() {
        final SampledFrame frame = new SampledFrame(new Stated(
                Map.of("2007-01-01", 0L, "2008-01-01", 2L, "2009-01-01", 3L),
                List.of("one/first", "two/second")), FRAME, UNTIL);
        frame.index();

        assertAll(
                () -> assertThat(frame.at(0).orElseThrow().get("full_name").asText()).isEqualTo("one/first"),
                () -> assertThat(frame.at(1).orElseThrow().get("full_name").asText()).isEqualTo("two/second"));
    }

    @Test
    void refusesARankOutsideTheFrameItIndexed() {
        final SampledFrame frame =
                new SampledFrame(new Stated(Map.of("2008-01-01", 1L), List.of("one/first")), FRAME, UNTIL);
        frame.index();

        assertThatThrownBy(() -> frame.at(99L))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("falls outside a frame");
    }
}
