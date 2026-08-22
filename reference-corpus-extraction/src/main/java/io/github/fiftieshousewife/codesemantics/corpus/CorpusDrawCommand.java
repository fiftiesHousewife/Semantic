package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws a seeded sample of repositories from a stated GitHub frame, recording every rank and every rejection.
 *
 * <p>Properties: {@code cs.draw.frame}, {@code cs.draw.until}, {@code cs.draw.seed}, {@code cs.draw.count}
 * and {@code cs.draw.out} are required; {@code cs.draw.publishes} and {@code cs.draw.exclude} are not.
 */
@Slf4j
public final class CorpusDrawCommand {

    private CorpusDrawCommand() {
    }

    public static void main(final String[] arguments) {
        drew(DrawRequest.fromProperties(), new GitHubSearch());
    }

    /** The draw itself, against whatever answers a repository query. */
    static void drew(final DrawRequest asked, final RepositorySearch search) {
        final SampledFrame frame = new SampledFrame(search, asked.frame(), asked.until());
        final long total = frame.index();
        log.info("frame = {} (exact), seed = {}", total, asked.seed());

        final CorpusDraw.Drawn drawn = new CorpusDraw(frame, new MersenneTwister(asked.seed()),
                asked.excluded(), asked.publication()).of(asked.count(), total);
        record(asked.out(), asked.frame(), asked.until(), asked.seed(), total, frame, drawn);
        log.info("{} drawn, {} rejected, recorded at {}",
                drawn.taken().size(), drawn.rejected().size(), asked.out());
    }

    static void record(final Path out, final String frame, final String until, final long seed,
                       final long total, final SampledFrame sampled, final CorpusDraw.Drawn drawn) {
        final Map<String, Object> written = new LinkedHashMap<>();
        written.put("frame", frame);
        written.put("until", until);
        written.put("seed", seed);
        written.put("total", total);
        written.put("windows", sampled.windows());
        written.put("drawn", drawn.taken());
        written.put("rejected", drawn.rejected());
        try {
            new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(out.toFile(), written);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to write the draw record to " + out, e);
        }
    }
}
