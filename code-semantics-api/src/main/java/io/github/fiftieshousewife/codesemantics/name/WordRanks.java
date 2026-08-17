package io.github.fiftieshousewife.codesemantics.name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/**
 * The bundled frequency-ordered vocabulary of common words: rank 1 is the most frequent word,
 * {@link #UNKNOWN_RANK} marks a token the list does not carry. One shared load backs every
 * consumer that asks whether a token reads as a word or how common it is.
 *
 * <p>Rank is line position, so the file's provenance header is skipped along with blank lines rather than
 * counted: a list that states where it came from must not shift every rank by saying so.
 */
public final class WordRanks {

    public static final int UNKNOWN_RANK = 0;

    private static final String WORD_LIST_RESOURCE = "common-english-words.txt";

    private static final String COMMENT = "#";

    private final Map<String, Integer> ranksByWord;

    private WordRanks(final Map<String, Integer> ranksByWord) {
        this.ranksByWord = Map.copyOf(ranksByWord);
    }

    public static WordRanks fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public boolean knows(final String word) {
        return rank(word) != UNKNOWN_RANK;
    }

    public int rank(final String word) {
        return ranksByWord.getOrDefault(word.toLowerCase(Locale.ROOT), UNKNOWN_RANK);
    }

    /** Every word the list carries, so a consumer can read the vocabulary of ordinary English as a whole. */
    public java.util.Set<String> words() {
        return ranksByWord.keySet();
    }

    public int size() {
        return ranksByWord.size();
    }

    private static WordRanks loadFromClasspath() {
        final InputStream stream = Objects.requireNonNull(
                WordRanks.class.getClassLoader().getResourceAsStream(WORD_LIST_RESOURCE), WORD_LIST_RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            final Map<String, Integer> ranks = new HashMap<>();
            reader.lines()
                    .map(String::strip)
                    .filter(line -> !line.isEmpty() && !line.startsWith(COMMENT))
                    .forEach(word -> ranks.putIfAbsent(word.toLowerCase(Locale.ROOT), ranks.size() + 1));
            return new WordRanks(ranks);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + WORD_LIST_RESOURCE, e);
        }
    }

    private static final WordRanks CLASSPATH_DEFAULTS = loadFromClasspath();
}
