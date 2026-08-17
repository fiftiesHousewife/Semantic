package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * The words no bundled resource could be cited for, with how often each was written and where one of them can
 * be seen. This is the finding the doctrine insists is not thrown away: what a repository wrote that nothing
 * could read is the question a design which silently drops unreadable tokens can never answer.
 */
public record UnreadWords(Map<String, Integer> occurrences, Map<String, String> firstSite) {

    public UnreadWords {
        occurrences = Map.copyOf(occurrences);
        firstSite = Map.copyOf(firstSite);
    }

    /** One unread word: its surface, how often it was written, and a place to go and look at it. */
    public record Sighting(String word, int occurrences, String site) {
    }

    /** The most-written unread words first, then alphabetically so equal counts read in a stable order. */
    public List<Sighting> mostWritten(final int limit) {
        return occurrences.entrySet().stream()
                .map(entry -> new Sighting(entry.getKey(), entry.getValue(),
                        firstSite.getOrDefault(entry.getKey(), "")))
                .sorted(Comparator.comparingInt(Sighting::occurrences).reversed()
                        .thenComparing(Sighting::word))
                .limit(limit)
                .toList();
    }

    /** How many word occurrences the whole tail accounts for. */
    public int totalOccurrences() {
        return occurrences.values().stream().mapToInt(Integer::intValue).sum();
    }
}
