package io.github.fiftieshousewife.codesemantics.corpus;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

import lombok.extern.slf4j.Slf4j;

/**
 * Pools the declared names of every repository a manifest pins into the table the reference is read from.
 *
 * <p>Properties: {@code cs.corpus.dir} names the directory holding the clones, {@code cs.corpus.manifest}
 * the draw that chose them, and {@code cs.corpus.out} the table to write.
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
        final WrittenWords pooled = PooledWords.fromClasspath().over(draw.manifest(), corpus);
        write(out, new PooledVocabularyTsv().render(pooled, draw));
        log.info("{} words over {} occurrences from {}, written to {}",
                pooled.words().size(), pooled.totalOccurrences(), draw.name(), out);
    }

    private static Path out() {
        final String stated = System.getProperty(OUT_PROPERTY, "");
        if (stated.isBlank()) {
            throw new IllegalStateException("No " + OUT_PROPERTY + ". A pooling run writes a table; "
                    + "name the file it goes to.");
        }
        return Path.of(stated).toAbsolutePath().normalize();
    }

    private static void write(final Path out, final String table) {
        try {
            Files.writeString(out, table, StandardCharsets.UTF_8);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to write the pooled corpus to " + out, e);
        }
    }
}
