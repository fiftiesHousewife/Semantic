package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Every word this repository wrote, how often, how much of that was as the name of something, and one place
 * to go and see it.
 *
 * <p>Nothing is filtered. A word no resource could be cited for is here beside the ones every resource
 * carries, because what a repository wrote and what could be read of it are different questions and only the
 * first is asked here. The surfaces are the ones the splitter produced, not dictionary forms: a lemma is a
 * reading, and a reading is available only for the words something could be cited for.
 */
public final class WrittenWords {

    private final Map<String, Integer> occurrences = new HashMap<>();
    private final Map<String, Integer> asNames = new HashMap<>();
    private final Map<String, String> firstSite = new HashMap<>();
    private final Map<String, String> firstNameSite = new HashMap<>();

    public void saw(final String word, final String site, final boolean chosenAsName) {
        occurrences.merge(word, 1, Integer::sum);
        firstSite.putIfAbsent(word, site);
        if (chosenAsName) {
            asNames.merge(word, 1, Integer::sum);
            firstNameSite.putIfAbsent(word, site);
        }
    }

    /**
     * The same tally over the names alone — what this repository <em>called</em> things, with the sentences
     * it wrote about them left out.
     *
     * <p>It is the population the vocabulary question is really asked of. A name is a word its author chose
     * for a thing; a sentence is English, and English requires articles, copulas and conjunctions whatever it
     * is about. Both are read, and which is being read is stated rather than pooled.
     */
    public WrittenWords asNamesOnly() {
        final WrittenWords names = new WrittenWords();
        asNames.forEach((word, times) -> {
            final String site = firstNameSite.get(word);
            names.occurrences.put(word, times);
            names.asNames.put(word, times);
            names.firstSite.put(word, site);
            names.firstNameSite.put(word, site);
        });
        return names;
    }

    /** The same tally over the words a rule keeps, with every count and site carried across. */
    public WrittenWords retaining(final java.util.function.Predicate<String> kept) {
        final WrittenWords keeping = new WrittenWords();
        occurrences.keySet().stream().filter(kept).forEach(word -> {
            keeping.occurrences.put(word, occurrences.get(word));
            keeping.asNames.put(word, asNames.getOrDefault(word, 0));
            keeping.firstSite.put(word, firstSite.get(word));
            firstNameSite.computeIfPresent(word, (same, site) -> {
                keeping.firstNameSite.put(word, site);
                return site;
            });
        });
        return keeping;
    }

    /**
     * The same tally with every word rewritten to the form a rule spells it, counts summed where two
     * spellings become one. It is a merge and not a filter: nothing is lost, and two words becoming one is
     * what the morphology was asked for.
     */
    public WrittenWords mergedBy(final java.util.function.UnaryOperator<String> form) {
        final WrittenWords merged = new WrittenWords();
        occurrences.forEach((word, times) -> {
            final String to = form.apply(word);
            merged.occurrences.merge(to, times, Integer::sum);
            merged.asNames.merge(to, asNames.getOrDefault(word, 0), Integer::sum);
            merged.firstSite.putIfAbsent(to, firstSite.get(word));
            firstNameSite.computeIfPresent(word, (same, site) -> {
                merged.firstNameSite.putIfAbsent(to, site);
                return site;
            });
        });
        return merged;
    }

    /** An independent copy, so a finished reading cannot be moved by whatever tallied it. */
    public WrittenWords copied() {
        return pooling(List.of(this));
    }

    /**
     * Several scopes' tallies as one, so a reading can be taken over the source sets it names rather than
     * over whatever the walk happened to find.
     */
    public static WrittenWords pooling(final Collection<WrittenWords> readings) {
        final WrittenWords pooled = new WrittenWords();
        readings.forEach(reading -> {
            reading.occurrences.forEach((word, times) -> pooled.occurrences.merge(word, times, Integer::sum));
            reading.asNames.forEach((word, times) -> pooled.asNames.merge(word, times, Integer::sum));
            reading.firstSite.forEach(pooled.firstSite::putIfAbsent);
            reading.firstNameSite.forEach(pooled.firstNameSite::putIfAbsent);
        });
        return pooled;
    }

    public Set<String> words() {
        return Set.copyOf(occurrences.keySet());
    }

    public int occurrencesOf(final String word) {
        return occurrences.getOrDefault(word, 0);
    }

    /** How often the word was the name of something rather than a word in a sentence about it. */
    public int namedOccurrencesOf(final String word) {
        return asNames.getOrDefault(word, 0);
    }

    public String siteOf(final String word) {
        return firstSite.getOrDefault(word, "");
    }

    public int totalOccurrences() {
        return occurrences.values().stream().mapToInt(Integer::intValue).sum();
    }

    /** What was written, as a distribution over words — the side of a comparison this repository holds. */
    public Map<String, Double> shareByWord() {
        final double written = totalOccurrences();
        return written == 0.0 ? Map.of() : occurrences.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, word -> word.getValue() / written));
    }
}
