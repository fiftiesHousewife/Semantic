package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * What working Java is written in, taken from a corpus of repositories drawn from a stated frame and pooled
 * into one distribution over the names they declare.
 *
 * <p>It is the reference neither ordinary English nor the platform's own API can be. English calls
 * {@code get}, {@code id} and {@code buf} rare, and the platform declares none of them in its API index, so
 * against those two a repository writing them looks like it chose them. A corpus of working repositories
 * writes them densely, which is the only evidence that says otherwise.
 *
 * <p>The table states a share per word and this normalises them, because the shares are written rounded and
 * a distribution has to sum to one before a divergence is taken over it.
 */
public final class CorpusVocabulary implements ReferenceVocabulary {

    private static final String NAME = "the reference corpus";

    private static final String COMMENT = "#";
    private static final String COLUMN = "\t";
    private static final int WORD = 0;
    private static final int SHARE = 2;
    private static final int COLUMNS = 3;

    private final Map<String, Double> shareByWord;

    public CorpusVocabulary(final Stream<String> rows) {
        final Map<String, Double> stated = rows.filter(CorpusVocabulary::isRow)
                .map(CorpusVocabulary::fields)
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

    /** The table at that path, as a distribution. */
    public static CorpusVocabulary at(final Path table) {
        try (Stream<String> rows = Files.lines(table, StandardCharsets.UTF_8)) {
            return new CorpusVocabulary(rows);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read the corpus table " + table, e);
        }
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public Map<String, Double> shareByWord() {
        return shareByWord;
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
