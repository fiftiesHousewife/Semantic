package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusDrawTest {

    private static final String FRAME = "language:Java";
    private static final String UNTIL = "2008-12-31T23:59:59Z";
    private static final long SEED = 20260821L;
    private static final ObjectMapper JSON = new ObjectMapper();

    private record Stated(long held, List<String> names) implements RepositorySearch {

        @Override
        public long count(final String query) {
            return query.contains("2008-01-01") ? held : 0L;
        }

        @Override
        public List<JsonNode> oldestFirst(final String query, final int perPage, final int page) {
            return names.stream()
                    .map(name -> (JsonNode) JSON.createObjectNode()
                            .put("full_name", name)
                            .put("default_branch", "main"))
                    .toList();
        }
    }

    private SampledFrame indexed(final long held, final List<String> names) {
        final SampledFrame frame = new SampledFrame(new Stated(held, names), FRAME, UNTIL);
        frame.index();
        return frame;
    }

    private CorpusDraw drawing(final SampledFrame frame, final Set<String> excluded) {
        return new CorpusDraw(frame, new MersenneTwister(SEED), excluded, Optional.empty());
    }

    @Test
    void takesAsManyRepositoriesAsWereAskedFor() {
        final CorpusDraw.Drawn drawn =
                drawing(indexed(3, List.of("one/a", "two/b", "three/c")), Set.of()).of(2, 3);

        assertAll(
                () -> assertThat(drawn.taken()).hasSize(2),
                () -> assertThat(drawn.taken()).extracting(row -> row.get("rank")).doesNotContainNull());
    }

    @Test
    void recordsEveryRankItRejectedWithTheReason() {
        final List<String> names = List.of("one/a", "two/b");
        final String reachedFirst = names.get((int) new MersenneTwister(SEED).below(2));
        final String theOther = names.stream().filter(name -> !name.equals(reachedFirst)).findFirst()
                .orElseThrow();

        final CorpusDraw.Drawn drawn = drawing(indexed(2, names), Set.of(reachedFirst)).of(1, 2);

        assertAll(
                () -> assertThat(drawn.taken()).extracting(row -> row.get("repository"))
                        .containsExactly(theOther),
                () -> assertThat(drawn.rejected()).extracting(row -> row.get("why"))
                        .as("a rejection carries the rank that produced it, so a reader can tell how many "
                                + "ranks a sample consumed")
                        .contains("named as an exclusion"),
                () -> assertThat(drawn.rejected().getFirst()).containsKey("rank"));
    }

    @Test
    void takesNoRepositoryTwiceHoweverOftenItsRankComesUp() {
        final CorpusDraw.Drawn drawn = drawing(indexed(1, List.of("one/a")), Set.of()).of(1, 1);

        assertThat(drawn.taken()).extracting(row -> row.get("repository")).containsExactly("one/a");
    }

    @Test
    void carriesWhatTheSearchStatedAboutEachRepositoryItTook() {
        final Map<String, Object> row =
                drawing(indexed(1, List.of("one/a")), Set.of()).of(1, 1).taken().getFirst();

        assertAll(
                () -> assertThat(row).containsKey("licenceAtHead"),
                () -> assertThat(row).containsKey("sizeKb"),
                () -> assertThat(row.get("origin")).isEqualTo(".git"));
    }
}
