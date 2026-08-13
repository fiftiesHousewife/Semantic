package org.fifties.housewife.bi.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Cited abbreviation readings from the bundled Wiktionary extraction: for a token, every expansion a
 * dictionary entry names, each with the topic labels its sense carries. A citation says a reader has
 * seen the token stand for the words — whether it does so *here* is the caller's question, answered by
 * votes this class does not cast. An uncited token has no citations, never a guess.
 */
public final class WiktionaryCitations {

    /**
     * One cited reading: the expansion's words in spaced lowercase, the sense's topic labels, and —
     * for a unit symbol — the quantity the standard says the unit measures, blank for every other
     * kind of citation.
     */
    public record Citation(String expansion, Set<String> topics, String quantity) {

        public Citation {
            topics = Set.copyOf(topics);
        }
    }

    private static final String RESOURCE = "wiktionary-abbreviations.tsv";
    private static final String COMMENT = "#";

    private final Map<String, List<Citation>> citationsByToken;

    private WiktionaryCitations(final Map<String, List<Citation>> citationsByToken) {
        this.citationsByToken = citationsByToken;
    }

    public static WiktionaryCitations fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public List<Citation> citationsOf(final String token) {
        return citationsByToken.getOrDefault(token.toLowerCase(Locale.ROOT), List.of());
    }

    private static WiktionaryCitations load() {
        final InputStream stream = Objects.requireNonNull(
                WiktionaryCitations.class.getResourceAsStream("/" + RESOURCE), RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            final Map<String, List<Citation>> citations = new HashMap<>();
            final Map<String, String> canonicalTopics = new HashMap<>();
            reader.lines()
                    .filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .forEach(line -> index(line, citations, canonicalTopics));
            return new WiktionaryCitations(freeze(citations));
        } catch (final IOException e) {
            throw new IllegalStateException("Failed to read the bundled Wiktionary citations resource", e);
        }
    }

    private static void index(final String line, final Map<String, List<Citation>> citations,
                              final Map<String, String> canonicalTopics) {
        final String[] fields = line.split("\t", -1);
        final Set<String> topics = Arrays.stream(fields[3].split(",", -1))
                .filter(topic -> !topic.isBlank())
                .map(topic -> canonicalTopics.computeIfAbsent(topic, same -> same))
                .collect(Collectors.toUnmodifiableSet());
        citations.computeIfAbsent(fields[0], token -> new ArrayList<>())
                .add(new Citation(fields[1], topics, fields.length > 4 ? fields[4] : ""));
    }

    private static Map<String, List<Citation>> freeze(final Map<String, List<Citation>> citations) {
        return citations.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        entry -> List.copyOf(entry.getValue())));
    }

    private static final WiktionaryCitations CLASSPATH_DEFAULTS = load();
}
