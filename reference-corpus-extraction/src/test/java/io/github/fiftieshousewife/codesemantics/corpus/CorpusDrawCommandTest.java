package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.clones.HeadCommit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorpusDrawCommandTest {

    private static final String FRAME = "language:Java";
    private static final String UNTIL = "2008-12-31T23:59:59Z";

    @AfterEach
    void forgetWhatTheRunNamed() {
        List.of("frame", "until", "seed", "count", "out", "publishes", "exclude", "manifest")
                .forEach(name -> System.clearProperty("cs.draw." + name));
    }

    private static final HeadCommit PINS = origin -> "abc123";

    private record Stated(long held) implements RepositorySearch {

        @Override
        public long count(final String query) {
            return query.contains("2008-01-01") ? held : 0L;
        }

        @Override
        public List<JsonNode> oldestFirst(final String query, final int perPage, final int page) {
            return List.of(new ObjectMapper().createObjectNode()
                    .put("full_name", "one/a")
                    .put("html_url", "https://github.com/one/a"));
        }
    }

    @Test
    void refusesADrawThatNamesNoFrame() {
        System.setProperty("cs.draw.until", UNTIL);

        assertThatThrownBy(DrawRequest::fromProperties)
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("cs.draw.frame");
    }

    @Test
    void readsEveryPropertyTheRunStated(@TempDir final Path directory) {
        System.setProperty("cs.draw.frame", FRAME);
        System.setProperty("cs.draw.until", UNTIL);
        System.setProperty("cs.draw.seed", "20260821");
        System.setProperty("cs.draw.count", "1");
        System.setProperty("cs.draw.out", directory.resolve("record.json").toString());
        System.setProperty("cs.draw.exclude", "Owner/One, owner/two");

        final DrawRequest asked = DrawRequest.fromProperties();

        assertAll(
                () -> assertThat(asked.frame()).isEqualTo(FRAME),
                () -> assertThat(asked.seed()).isEqualTo(20260821L),
                () -> assertThat(asked.count()).isEqualTo(1),
                () -> assertThat(asked.publishes()).isFalse(),
                () -> assertThat(asked.publication()).isEmpty(),
                () -> assertThat(asked.excluded())
                        .as("an exclusion is matched however its owner capitalised it")
                        .containsExactlyInAnyOrder("owner/one", "owner/two"));
    }

    @Test
    void drawsAgainstWhateverAnswersTheQueryAndWritesTheRecord(@TempDir final Path directory)
            throws IOException {
        final Path out = directory.resolve("record.json");
        final DrawRequest asked =
                new DrawRequest(FRAME, UNTIL, 20260821L, 1, out, false, java.util.Set.of(),
                        java.util.Optional.empty());

        CorpusDrawCommand.drew(asked, new Stated(1), PINS);

        final JsonNode written = new ObjectMapper().readTree(Files.readString(out));
        assertAll(
                () -> assertThat(written.withArray("drawn").size()).isEqualTo(1),
                () -> assertThat(written.get("total").asLong()).isEqualTo(1L));
    }

    @Test
    void writesTheFrameTheSeedAndEveryWindowItCountedIntoTheRecord(@TempDir final Path directory)
            throws IOException {
        final SampledFrame frame = new SampledFrame(new Stated(1), FRAME, UNTIL);
        final long total = frame.index();
        final CorpusDraw.Drawn drawn = new CorpusDraw(frame, new MersenneTwister(20260821L),
                java.util.Set.of(), java.util.Optional.empty(), PINS).of(1, total);
        final Path out = directory.resolve("record.json");

        CorpusDrawCommand.record(out, FRAME, UNTIL, 20260821L, total, frame, drawn);

        final JsonNode written = new ObjectMapper().readTree(Files.readString(out));
        assertAll(
                () -> assertThat(written.get("frame").asText()).isEqualTo(FRAME),
                () -> assertThat(written.get("seed").asLong()).isEqualTo(20260821L),
                () -> assertThat(written.get("total").asLong()).isEqualTo(total),
                () -> assertThat(written.withArray("windows").size())
                        .as("the windows are what make the index checkable without running the draw again")
                        .isPositive(),
                () -> assertThat(written.withArray("drawn").size()).isEqualTo(1));
    }

    @Test
    void growsTheNamedManifestKeepingItsOwnHeaderAndRewritingItsRows(@TempDir final Path directory)
            throws IOException {
        final Path manifest = directory.resolve("draw.tsv");
        Files.writeString(manifest, """
                # The frame, stated before a rank was drawn.
                gone\thttps://github.com/old/gone.git\tdef456\tMIT\t7\t2019-01-01T00:00:00Z\t1
                """);
        final DrawRequest asked = new DrawRequest(FRAME, UNTIL, 20260821L, 1,
                directory.resolve("record.json"), false, java.util.Set.of(), java.util.Optional.of(manifest));

        CorpusDrawCommand.drew(asked, new Stated(1), PINS);

        final List<String> written = Files.readAllLines(manifest);
        assertAll(
                () -> assertThat(written).first().isEqualTo("# The frame, stated before a rank was drawn."),
                () -> assertThat(written).hasSize(2),
                () -> assertThat(written).doesNotContain("gone"),
                () -> assertThat(written.getLast()).startsWith("a\thttps://github.com/one/a.git\tabc123"));
    }

    @Test
    void leavesEveryManifestAloneWhereTheRunNamedNone(@TempDir final Path directory) {
        final DrawRequest asked = new DrawRequest(FRAME, UNTIL, 20260821L, 1,
                directory.resolve("record.json"), false, java.util.Set.of(), java.util.Optional.empty());

        CorpusDrawCommand.drew(asked, new Stated(1), PINS);

        assertThat(directory.toFile().list()).containsExactly("record.json");
    }

    @Test
    void refusesToWriteARecordWhereTheFileCannotBeOpened(@TempDir final Path directory) {
        final SampledFrame frame = new SampledFrame(new Stated(1), FRAME, UNTIL);
        final long total = frame.index();
        final CorpusDraw.Drawn drawn = new CorpusDraw(frame, new MersenneTwister(1L),
                java.util.Set.of(), java.util.Optional.empty(), PINS).of(1, total);

        assertThatThrownBy(() -> CorpusDrawCommand.record(
                directory.resolve("no/such/place/record.json"), FRAME, UNTIL, 1L, total, frame, drawn))
                .isInstanceOf(java.io.UncheckedIOException.class)
                .hasMessageContaining("Failed to write the draw record");
    }

    @Test
    void carriesTheMapItWritesUnchanged(@TempDir final Path directory) throws IOException {
        final SampledFrame frame = new SampledFrame(new Stated(1), FRAME, UNTIL);
        final long total = frame.index();
        final CorpusDraw.Drawn drawn = new CorpusDraw(frame, new MersenneTwister(1L),
                java.util.Set.of(), java.util.Optional.empty(), PINS).of(1, total);
        final Path out = directory.resolve("record.json");

        CorpusDrawCommand.record(out, FRAME, UNTIL, 1L, total, frame, drawn);

        final Map<String, Object> taken = new ObjectMapper()
                .readValue(Files.readString(out), new TypeReference<Map<String, Object>>() { });
        assertThat(taken).containsKeys("frame", "until", "seed", "total", "windows", "drawn", "rejected");
    }
}
