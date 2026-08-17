package io.github.fiftieshousewife.bi.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Initialism readings from the bundled Wikidata registry extraction: for a capitals-written token,
 * every entity the registry records the token as a short name or alias of, each with its sitelink
 * count as prominence. A row says the registry knows readers write the token for the entity —
 * whether the schema at hand means that entity is the caller's question, answered by votes this
 * class does not cast. A token the registry does not carry has no readings, never a guess.
 */
public final class WikidataInitialisms {

    /** One registry reading: the entity's English label, and its sitelink count as prominence. */
    public record Reading(String label, int sitelinks) {
    }

    private static final String RESOURCE = "wikidata-initialisms.tsv";

    private final Map<String, List<Reading>> readingsByToken;

    private WikidataInitialisms(final Map<String, List<Reading>> readingsByToken) {
        this.readingsByToken = readingsByToken;
    }

    public static WikidataInitialisms fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The registry's readings of a token written exactly as the schema wrote it, capitals and all. */
    public List<Reading> readingsOf(final String capitalsToken) {
        return readingsByToken.getOrDefault(capitalsToken, List.of());
    }

    /**
     * Every token the registry carries, so what this catalogue would say yes to can be measured rather
     * than assumed.
     */
    public Set<String> tokens() {
        return readingsByToken.keySet();
    }

    private static WikidataInitialisms load() {
        final Map<String, List<Reading>> readings = new HashMap<>();
        BundledLines.of(RESOURCE).forEach(line -> index(line, readings));
        return new WikidataInitialisms(freeze(readings));
    }

    private static void index(final String line, final Map<String, List<Reading>> readings) {
        final String[] fields = line.split("\t", -1);
        readings.computeIfAbsent(fields[0], token -> new ArrayList<>())
                .add(new Reading(fields[1], Integer.parseInt(fields[2])));
    }

    private static Map<String, List<Reading>> freeze(final Map<String, List<Reading>> readings) {
        return readings.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        entry -> List.copyOf(entry.getValue())));
    }

    private static final WikidataInitialisms CLASSPATH_DEFAULTS = load();
}
