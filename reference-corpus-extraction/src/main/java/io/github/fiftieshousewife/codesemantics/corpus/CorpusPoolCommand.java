package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

/**
 * Pools the declared names of every repository a manifest pins into the tables the reference is read from —
 * one per {@link CorpusPooling}, from a single read of the corpus.
 *
 * <p>Properties: {@code cs.corpus.dir} names the directory holding the clones, {@code cs.corpus.manifest}
 * the draw that chose them, and {@code cs.corpus.out} the directory the tables go in.
 */
@Slf4j
public final class CorpusPoolCommand {

    private static final String OUT_PROPERTY = "cs.corpus.out";

    private CorpusPoolCommand() {
    }

    public static void main(final String[] arguments) {
        final Path corpus = ReferenceCorpus.directory();
        final DrawnManifest draw = ReferenceCorpus.drawnManifest();
        final Path out = out();
        final CorpusWords pooled = PooledWords.fromClasspath().over(draw.manifest(), corpus);
        log.info("{} repositories, {} words, {} occurrences from {}", pooled.repositories(),
                pooled.words().size(), pooled.totalOccurrences(), draw.name());
        Stream.of(CorpusPooling.values()).forEach(pooling -> write(out, pooled, draw, pooling));
    }

    private static void write(final Path out, final CorpusWords pooled, final DrawnManifest draw,
                              final CorpusPooling pooling) {
        final Path table = out.resolve(pooling.fileName());
        writeString(table, new PooledVocabularyTsv().render(pooled, draw, pooling));
        log.info("{} written to {}", pooling, table);
    }

    private static Path out() {
        final String stated = System.getProperty(OUT_PROPERTY, "");
        if (stated.isBlank()) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "No %s. A pooling run writes one table per weighting; name the directory they go in.",
                    OUT_PROPERTY));
        }
        final Path out = Path.of(stated).toAbsolutePath().normalize();
        makeDirectory(out);
        return out;
    }

    private static void makeDirectory(final Path out) {
        try {
            Files.createDirectories(out);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to make the directory %s",
                    out), e);
        }
    }

    private static void writeString(final Path table, final String rendered) {
        try {
            Files.writeString(table, rendered, StandardCharsets.UTF_8);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to write the pooled corpus to %s",
                    table), e);
        }
    }
}
