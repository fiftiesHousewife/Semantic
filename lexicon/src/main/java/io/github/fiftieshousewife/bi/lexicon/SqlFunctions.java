package io.github.fiftieshousewife.bi.lexicon;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The query language's own function catalogue, read as the words each function's published description
 * is written in. A name the engine answers to is a fact about the standard this tool executes rather
 * than an observation of a corpus, and the description is the standard saying what the name is short
 * for: {@code abs} is published as "Absolute value", so absolute is a word the catalogue itself states
 * against that token while absence and abstract are not. A caller asks whether a candidate reading is
 * described by the entry for its own token — the words are kept per function, never pooled, because a
 * pooled vocabulary corroborates any phrase sharing one rare word with any entry at all.
 */
public final class SqlFunctions {

    private static final String RESOURCE = "sql-functions.tsv";
    private static final int SHORTEST_CONTENT_WORD = 2;

    private final Map<String, Set<String>> wordsByFunction;

    private SqlFunctions(final Map<String, Set<String>> wordsByFunction) {
        this.wordsByFunction = wordsByFunction;
    }

    public static SqlFunctions fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public static SqlFunctions fromFile(final Path tsv) {
        return new SqlFunctions(index(BundledLines.at(tsv)));
    }

    /** Whether the catalogue names the token as a function of the language. */
    public boolean names(final String token) {
        return wordsByFunction.containsKey(token.toLowerCase(Locale.ROOT));
    }

    /**
     * Whether the catalogue's entry for this very token describes the phrase — every content word of the
     * phrase written in the description the standard publishes for that name. Subset rather than overlap:
     * "absolute" is what abs is described as, where "absolute temperature" brings a word the entry never
     * states and is a reading the catalogue does not vouch for.
     */
    public boolean describes(final String token, final String phrase) {
        final Set<String> described = wordsByFunction.getOrDefault(token.toLowerCase(Locale.ROOT), Set.of());
        final Set<String> words = contentWords(phrase);
        return !described.isEmpty() && !words.isEmpty() && described.containsAll(words);
    }

    private static Set<String> contentWords(final String text) {
        return Arrays.stream(text.toLowerCase(Locale.ROOT).split("[^a-z]+", -1))
                .filter(word -> word.length() >= SHORTEST_CONTENT_WORD)
                .collect(Collectors.toUnmodifiableSet());
    }

    private static SqlFunctions load() {
        return new SqlFunctions(index(BundledLines.of(RESOURCE)));
    }

    private static Map<String, Set<String>> index(final List<String> lines) {
        final Map<String, Set<String>> words = new HashMap<>();
        lines.forEach(line -> {
            final String[] fields = line.split("\t", -1);
            words.put(fields[0].toLowerCase(Locale.ROOT), contentWords(fields[0] + " " + fields[1]));
        });
        return Map.copyOf(words);
    }

    private static final SqlFunctions CLASSPATH_DEFAULTS = load();
}
