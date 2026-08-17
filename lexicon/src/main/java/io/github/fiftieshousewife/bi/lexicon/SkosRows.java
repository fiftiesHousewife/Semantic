package io.github.fiftieshousewife.bi.lexicon;

import java.nio.file.Path;
import java.util.List;

/**
 * A taxonomy read back from the classpath or from a path. Every taxonomy this library bundles is the same eight
 * columns whatever its source published, so one reader serves all of them and a new source costs a
 * provenance header rather than a parser.
 *
 * <p>{@link #at} is what lets a taxonomy be injected rather than bundled. A source is a candidate long
 * before anything decides to publish it, and a candidate has to be readable by the same reader as a bundled
 * one or the measurement taken on it is not the measurement the bundled reading would take.
 *
 * <p>A row of the wrong width is refused rather than padded. The file is generated, so a short row means
 * the writer and the reader disagree about the shape — which is the one failure a taxonomy file can have
 * that would otherwise be silent, every column after the missing one being read as its neighbour.
 */
public final class SkosRows {

    private static final String COLUMN = "\t";

    private static final int COLUMNS = 8;

    private SkosRows() {
    }

    public static List<SkosConcept> in(final String resource) {
        return BundledLines.of(resource).stream().map(line -> concept(line, resource)).toList();
    }

    /** The same eight columns, read from a file the caller names rather than from the published jar. */
    public static List<SkosConcept> at(final Path taxonomy) {
        return BundledLines.at(taxonomy).stream()
                .map(line -> concept(line, taxonomy.getFileName().toString())).toList();
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
