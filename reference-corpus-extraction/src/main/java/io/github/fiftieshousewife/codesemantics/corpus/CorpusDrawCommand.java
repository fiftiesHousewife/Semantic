package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.clones.GitRemoteHead;
import io.github.fiftieshousewife.codesemantics.clones.HeadCommit;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws a seeded sample of repositories from a stated GitHub frame, recording every rank and every rejection.
 *
 * <p>Properties: {@code cs.draw.frame}, {@code cs.draw.until}, {@code cs.draw.seed}, {@code cs.draw.count}
 * and {@code cs.draw.out} are required; {@code cs.draw.publishes}, {@code cs.draw.exclude} and
 * {@code cs.draw.manifest} are not. Where {@code cs.draw.manifest} names a manifest, that file is rewritten
 * with its own header kept and the drawn rows beneath it.
 */
@Slf4j
public final class CorpusDrawCommand {

    private CorpusDrawCommand() {
    }

    public static void main(final String[] arguments) {
        drew(DrawRequest.fromProperties(), new GitHubSearch(), new GitRemoteHead());
    }

    /** The draw itself, against whatever answers a repository query and whatever names a remote's head. */
    static void drew(final DrawRequest asked, final RepositorySearch search, final HeadCommit head) {
        final SampledFrame frame = new SampledFrame(search, asked.frame(), asked.until());
        final long total = frame.index();
        log.info("frame = {} (exact), seed = {}", total, asked.seed());
        refuseADriftedFrame(asked, total);

        final CorpusDraw.Drawn drawn = new CorpusDraw(frame, new MersenneTwister(asked.seed()),
                asked.excluded(), asked.publication(), head).of(asked.count(), total);
        record(asked.out(), asked.frame(), asked.until(), asked.seed(), total, frame, drawn);
        asked.manifest().ifPresent(manifest -> grow(manifest, drawn));
        log.info("{} drawn, {} rejected, recorded at {}",
                drawn.taken().size(), drawn.rejected().size(), asked.out());
    }

    /**
     * Stops before anything is written where the frame no longer holds what the recorded draw was taken
     * against. Checked here rather than by a reader afterwards, because the draw rewrites the manifest it
     * grows, and a manifest already overwritten cannot be un-drifted.
     */
    static void refuseADriftedFrame(final DrawRequest asked, final long total) {
        asked.total().ifPresent(recorded -> {
            if (recorded != total) {
                throw new IllegalStateException("The frame holds " + total + " where this run stated "
                        + recorded + ". A rank resolves through counts taken live, so the same seeded ranks "
                        + "now name different repositories: this would be a fresh sample rather than the "
                        + "recorded one grown. Nothing has been written.");
            }
        });
    }

    /** The named manifest rewritten: its own header, then the rows this draw took. */
    static void grow(final Path manifest, final CorpusDraw.Drawn drawn) {
        final List<String> header = DrawnManifest.at(manifest).stated();
        try {
            Files.writeString(manifest, new DrawnManifestTsv().render(header, drawn.taken()),
                    StandardCharsets.UTF_8);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to write the manifest " + manifest, e);
        }
        log.info("{} rows written to {}, under the {} header lines it already stated",
                drawn.taken().size(), manifest, header.size());
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
