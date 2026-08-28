package io.github.fiftieshousewife.codesemantics.reference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * One pooled corpus table as read: the share it states for each unit, normalised, and the standard error
 * beside it.
 *
 * <p>The shares are written rounded, so they are normalised on the way in: a divergence is taken between
 * distributions, and a column summing to 0.9998 is not one. The unit the rows are keyed by is the table's
 * own business — a word in one table and a run of words in another — and the arithmetic is the same either
 * way.
 */
final class PooledTable {

    private static final String COMMENT = "#";
    private static final String COLUMN = "\t";
    private static final int UNIT = 0;
    private static final int OCCURRENCES = 1;
    private static final int SHARE = 2;
    private static final int ERROR = 3;
    private static final int COLUMNS = 3;

    private final Map<String, Double> shareByUnit;
    private final Map<String, Double> errorByUnit;
    private final Map<String, Integer> occurrencesByUnit;

    PooledTable(final Stream<String> rows, final String columns) {
        final Map<String, String[]> stated = rows.filter(PooledTable::isRow)
                .map(row -> fields(row, columns))
                .collect(Collectors.toUnmodifiableMap(field -> field[UNIT], field -> field));
        final double total = stated.values().stream()
                .mapToDouble(field -> Double.parseDouble(field[SHARE]))
                .sum();
        if (total <= 0.0) {
            throw new IllegalStateException("A corpus table stating no share is an empty denominator, which "
                    + "demotes nothing and reads exactly like a reference that found nothing to demote.");
        }
        this.shareByUnit = stated.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        field -> Double.parseDouble(field.getValue()[SHARE]) / total));
        this.errorByUnit = stated.entrySet().stream()
                .filter(field -> field.getValue().length > ERROR)
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        field -> Double.parseDouble(field.getValue()[ERROR]) / total));
        this.occurrencesByUnit = stated.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        field -> Integer.parseInt(field.getValue()[OCCURRENCES])));
    }

    /** The table bundled beside this class, by resource name. */
    static PooledTable onTheClasspath(final String resource, final String columns) {
        final InputStream stream = Objects.requireNonNull(
                PooledTable.class.getResourceAsStream(resource), resource);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            return new PooledTable(reader.lines(), columns);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to read %s",
                    resource), e);
        }
    }

    /** A table at a path, so a candidate corpus can be read before anything decides to bundle it. */
    static PooledTable at(final Path table, final String columns) {
        try (Stream<String> rows = Files.lines(table, StandardCharsets.UTF_8)) {
            return new PooledTable(rows, columns);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to read the corpus table %s",
                    table), e);
        }
    }

    Map<String, Double> shareByUnit() {
        return shareByUnit;
    }

    double shareOf(final String unit) {
        return shareByUnit.getOrDefault(unit, 0.0);
    }

    double errorOf(final String unit) {
        return errorByUnit.getOrDefault(unit, 0.0);
    }

    int occurrencesOf(final String unit) {
        return occurrencesByUnit.getOrDefault(unit, 0);
    }

    private static boolean isRow(final String line) {
        return !line.isBlank() && !line.startsWith(COMMENT);
    }

    private static String[] fields(final String row, final String columns) {
        final String[] fields = row.split(COLUMN, -1);
        if (fields.length < COLUMNS) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "A row of a corpus table states %s columns where a reading needs %s — %s: %s",
                    fields.length, COLUMNS, columns, row));
        }
        return fields;
    }
}
