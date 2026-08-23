package io.github.fiftieshousewife.codesemantics.reference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * What a drawn sample of working Java repositories is written in, as shares over the words they declare.
 *
 * <p>The bundled table is pooled as the mean of each repository's own shares, so every repository weighs the
 * same whatever its size. That is the population the sample was drawn from — the frame draws repositories,
 * not bytes — and it is the weighting no single repository can dominate. The table's own header states which
 * draw produced it, under what frame, and at what seed.
 *
 * <p>The shares are written rounded, so they are normalised on the way in: a divergence is taken between
 * distributions, and a column summing to 0.9998 is not one.
 */
public final class PooledWordShares {

    private static final String RESOURCE = "/reference-corpus-shares.tsv";

    private static final String COMMENT = "#";
    private static final String COLUMN = "\t";
    private static final int WORD = 0;
    private static final int SHARE = 2;
    private static final int COLUMNS = 3;

    private final Map<String, Double> shareByWord;

    public PooledWordShares(final Stream<String> rows) {
        final Map<String, Double> stated = rows.filter(PooledWordShares::isRow)
                .map(PooledWordShares::fields)
                .collect(Collectors.toUnmodifiableMap(field -> field[WORD],
                        field -> Double.parseDouble(field[SHARE])));
        final double total = stated.values().stream().mapToDouble(Double::doubleValue).sum();
        if (total <= 0.0) {
            throw new IllegalStateException("A corpus table stating no share is an empty denominator, which "
                    + "demotes nothing and reads exactly like a reference that found nothing to demote.");
        }
        this.shareByWord = stated.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, word -> word.getValue() / total));
    }

    /** The table this module bundles. */
    public static PooledWordShares fromClasspath() {
        final InputStream stream = Objects.requireNonNull(
                PooledWordShares.class.getResourceAsStream(RESOURCE), RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            return new PooledWordShares(reader.lines());
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + RESOURCE, e);
        }
    }

    /** A table at a path, so a candidate corpus can be read before anything decides to bundle it. */
    public static PooledWordShares at(final Path table) {
        try (Stream<String> rows = Files.lines(table, StandardCharsets.UTF_8)) {
            return new PooledWordShares(rows);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read the corpus table " + table, e);
        }
    }

    /** What the corpus is written in, as shares over words summing to one. */
    public Map<String, Double> shareByWord() {
        return shareByWord;
    }

    /** How densely the corpus writes the word, and zero for a word it never wrote. */
    public double shareOf(final String word) {
        return shareByWord.getOrDefault(word, 0.0);
    }

    private static boolean isRow(final String line) {
        return !line.isBlank() && !line.startsWith(COMMENT);
    }

    private static String[] fields(final String row) {
        final String[] fields = row.split(COLUMN, -1);
        if (fields.length < COLUMNS) {
            throw new IllegalStateException("A row of a corpus table states " + fields.length
                    + " columns where a reading needs " + COLUMNS + " — word, occurrences, share: " + row);
        }
        return fields;
    }
}
