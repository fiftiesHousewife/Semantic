package org.fifties.housewife.bi.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

/**
 * A bundled taxonomy read back off the classpath. Every taxonomy this library bundles is the same eight
 * columns whatever its source published, so one reader serves all of them and a new source costs a
 * provenance header rather than a parser.
 *
 * <p>A row of the wrong width is refused rather than padded. The file is generated, so a short row means
 * the writer and the reader disagree about the shape — which is the one failure a taxonomy file can have
 * that would otherwise be silent, every column after the missing one being read as its neighbour.
 */
public final class SkosRows {

    private static final String COMMENT = "#";

    private static final String COLUMN = "\t";

    private static final int COLUMNS = 8;

    private SkosRows() {
    }

    public static List<SkosConcept> in(final String resource) {
        final InputStream stream = Objects.requireNonNull(
                SkosRows.class.getResourceAsStream("/" + resource), resource);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            return reader.lines().filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .map(line -> concept(line, resource)).toList();
        } catch (final IOException e) {
            throw new IllegalStateException("Failed to read the bundled taxonomy " + resource, e);
        }
    }

    private static SkosConcept concept(final String line, final String resource) {
        final String[] fields = line.split(COLUMN, -1);
        if (fields.length != COLUMNS) {
            throw new IllegalStateException("A row of " + resource + " states " + fields.length
                    + " columns where the shape has " + COLUMNS + ": " + line);
        }
        return new SkosConcept(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6],
                fields[7]);
    }
}
