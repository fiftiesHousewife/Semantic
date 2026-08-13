package org.fifties.housewife.bi.lexicon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The bundled WordNet Domains resource, read as a lemma-to-domains index and its reverse. Each entry in
 * the file labels
 * one synset's sense key with the topical domains the synset belongs to, so a lemma's senses are kept
 * apart: a consumer weighting a word's meanings needs to know that {@code food} means food in both its
 * senses and chemistry in only one, which the union alone cannot say. The join is on the lemma —
 * version-stable across WordNet releases — so the resource's WordNet 3.0 offsets need no alignment to
 * the bundled WordNet 3.1 database and are not read.
 */
final class WordNetDomains {

    private static final String RESOURCE = "wordnet-domains.txt";
    private static final String COMMENT = "#";

    private final Map<String, List<Set<String>>> sensesByLemma;
    private final Map<String, Set<String>> lemmasByDomain;

    private WordNetDomains(final Map<String, List<Set<String>>> sensesByLemma,
                           final Map<String, Set<String>> lemmasByDomain) {
        this.sensesByLemma = sensesByLemma;
        this.lemmasByDomain = lemmasByDomain;
    }

    static WordNetDomains fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    Set<String> domainsOf(final String word) {
        return senseDomainsOf(word).stream()
                .flatMap(Set::stream)
                .collect(Collectors.toUnmodifiableSet());
    }

    List<Set<String>> senseDomainsOf(final String word) {
        return sensesByLemma.getOrDefault(word.toLowerCase(Locale.ROOT), List.of());
    }

    Set<String> lemmasOf(final String domain) {
        return lemmasByDomain.getOrDefault(domain.toLowerCase(Locale.ROOT), Set.of());
    }

    private static WordNetDomains load() {
        final InputStream stream = Objects.requireNonNull(
                WordNetDomains.class.getResourceAsStream("/" + RESOURCE), RESOURCE);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            final Map<String, String> canonicalDomains = new HashMap<>();
            final Map<String, List<Set<String>>> sensesByLemma = new HashMap<>();
            final Map<String, Set<String>> lemmasByDomain = new HashMap<>();
            reader.lines()
                    .filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .forEach(line -> index(line, sensesByLemma, lemmasByDomain, canonicalDomains));
            return new WordNetDomains(freezeSenses(sensesByLemma), freezeLemmas(lemmasByDomain));
        } catch (final IOException e) {
            throw new IllegalStateException("Failed to read the bundled WordNet Domains resource", e);
        }
    }

    private static void index(final String line, final Map<String, List<Set<String>>> sensesByLemma,
                              final Map<String, Set<String>> lemmasByDomain,
                              final Map<String, String> canonicalDomains) {
        final String[] fields = line.split(" ", -1);
        final String senseKey = fields[1];
        final String lemma = senseKey.substring(0, senseKey.indexOf('#')).toLowerCase(Locale.ROOT);
        final Set<String> senseDomains = new HashSet<>();
        for (int field = 2; field < fields.length; field++) {
            senseDomains.add(canonicalDomains.computeIfAbsent(fields[field], domain -> domain));
        }
        sensesByLemma.computeIfAbsent(lemma, unused -> new ArrayList<>()).add(Set.copyOf(senseDomains));
        senseDomains.forEach(domain ->
                lemmasByDomain.computeIfAbsent(domain, unused -> new HashSet<>()).add(lemma));
    }

    private static Map<String, List<Set<String>>> freezeSenses(final Map<String, List<Set<String>>> senses) {
        return senses.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> List.copyOf(entry.getValue())));
    }

    private static Map<String, Set<String>> freezeLemmas(final Map<String, Set<String>> lemmas) {
        return lemmas.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> Set.copyOf(entry.getValue())));
    }

    private static final WordNetDomains CLASSPATH_DEFAULTS = load();
}
