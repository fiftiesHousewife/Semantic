package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * The generalisation map wiktextract publishes in its own topic module, read back as the broader topics
 * each topic generalises to.
 *
 * <p>This is not Wiktionary's category tree. It is the map that <em>produced</em> the broader labels
 * already sitting in the bundled topic vocabulary: wiktextract applies it transitively when it extracts a
 * sense's topics, so a sense labelled {@code computing} arrives carrying {@code engineering},
 * {@code mathematics}, {@code natural-sciences}, {@code physical-sciences} and {@code sciences} besides.
 * Reading the same map back is what tells a stated label from a derived one, and only the map that did the
 * deriving can answer that.
 *
 * <p>A key is hyphenated exactly as the module hyphenates it before use, and a value names one or more
 * broader topics separated by spaces.
 */
public class TopicGeneralisations {

    private static final String MAP = "topic_generalize_map = {";

    private static final String CLOSE = "\n}";

    /** A quoted key, whatever quoting the module wrapped it in, then a quoted value on the same line. */
    private static final Pattern ENTRY = Pattern.compile("\"([^\"]+)\"[^:]*:\\s*\"([^\"]+)\"");

    private static final Pattern SPACES = Pattern.compile("\\s+");

    public Map<String, Set<String>> in(final String module) {
        final Map<String, Set<String>> broader = new LinkedHashMap<>();
        entries(module).forEach(entry -> broader
                .computeIfAbsent(hyphenated(entry.group(1)), topic -> new LinkedHashSet<>())
                .addAll(named(entry.group(2))));
        return broader;
    }

    private static Stream<Matcher> entries(final String module) {
        return block(module).lines().map(ENTRY::matcher).filter(Matcher::find);
    }

    /** The map's own literal, from its opening brace to the first closing brace at column zero. */
    private static String block(final String module) {
        final int opened = module.indexOf(MAP);
        if (opened < 0) {
            throw new IllegalArgumentException("The module states no " + MAP);
        }
        final int closed = module.indexOf(CLOSE, opened);
        if (closed < 0) {
            throw new IllegalArgumentException("The " + MAP + " literal is never closed");
        }
        return module.substring(opened + MAP.length(), closed);
    }

    /** The module hyphenates a key's spaces before adding it to the valid topics, and so must this. */
    private static String hyphenated(final String topic) {
        return SPACES.matcher(topic.strip()).replaceAll("-");
    }

    private static Set<String> named(final String value) {
        return new LinkedHashSet<>(Arrays.asList(SPACES.split(value.strip())));
    }
}
