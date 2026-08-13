package org.fifties.housewife.bi.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The bundled Wiktionary topic hierarchy: which broader topics a topic generalises to. It is the map the
 * dump's own extractor applied, so it is the only thing that can say whether a label a headword carries was
 * stated of that headword or derived from another label it carries.
 *
 * <p>An unknown topic has no parents and no ancestors, never a guess. A topic that generalises to itself,
 * directly or around a cycle, is not in its own ancestry — a label cannot be the reason it was itself
 * implied.
 */
public final class WiktionaryTopicHierarchy {

    private static final String RESOURCE = "wiktionary-topic-hierarchy.tsv";
    private static final String COMMENT = "#";

    private final Map<String, Set<String>> broaderByTopic;
    private final Map<String, Set<String>> ancestorsByTopic;

    private WiktionaryTopicHierarchy(final Map<String, Set<String>> broaderByTopic) {
        this.broaderByTopic = broaderByTopic;
        this.ancestorsByTopic = broaderByTopic.keySet().stream()
                .collect(Collectors.toUnmodifiableMap(topic -> topic,
                        topic -> reachedFrom(topic, broaderByTopic)));
    }

    public static WiktionaryTopicHierarchy fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** The topics this one generalises to in one step, or empty when the map does not carry it. */
    public Set<String> broaderThan(final String topic) {
        return broaderByTopic.getOrDefault(topic.toLowerCase(Locale.ROOT), Set.of());
    }

    /** Every topic reachable by generalising, transitively — what carrying this label already implies. */
    public Set<String> ancestorsOf(final String topic) {
        return ancestorsByTopic.getOrDefault(topic.toLowerCase(Locale.ROOT), Set.of());
    }

    private static Set<String> reachedFrom(final String topic, final Map<String, Set<String>> broader) {
        final Set<String> reached = new HashSet<>();
        final Deque<String> pending = new ArrayDeque<>(broader.getOrDefault(topic, Set.of()));
        while (!pending.isEmpty()) {
            final String next = pending.pop();
            if (reached.add(next)) {
                pending.addAll(broader.getOrDefault(next, Set.of()));
            }
        }
        reached.remove(topic);
        return Set.copyOf(reached);
    }

    private static WiktionaryTopicHierarchy load() {
        final InputStream stream = Objects.requireNonNull(
                WiktionaryTopicHierarchy.class.getResourceAsStream("/" + RESOURCE), RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            final Map<String, Set<String>> broaderByTopic = new HashMap<>();
            reader.lines()
                    .filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .forEach(line -> index(line, broaderByTopic));
            return new WiktionaryTopicHierarchy(freeze(broaderByTopic));
        } catch (final IOException e) {
            throw new IllegalStateException("Failed to read the bundled Wiktionary topic hierarchy", e);
        }
    }

    private static void index(final String line, final Map<String, Set<String>> broaderByTopic) {
        final String[] fields = line.split("\t", -1);
        final Set<String> broader = Arrays.stream(fields[1].split(",", -1))
                .filter(topic -> !topic.isBlank())
                .map(topic -> topic.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());
        broaderByTopic.computeIfAbsent(fields[0].toLowerCase(Locale.ROOT), topic -> new HashSet<>())
                .addAll(broader);
    }

    private static Map<String, Set<String>> freeze(final Map<String, Set<String>> index) {
        return index.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> Set.copyOf(entry.getValue())));
    }

    private static final WiktionaryTopicHierarchy CLASSPATH_DEFAULTS = load();
}
