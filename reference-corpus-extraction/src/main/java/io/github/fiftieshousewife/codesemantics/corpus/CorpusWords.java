package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

/**
 * A corpus as its repositories wrote it: the summed counts, and each repository's own shares summed beside
 * them, so a pooling can weigh a repository by its size or by its being one repository.
 *
 * <p>Both are accumulated in one pass because the parse is the cost and reading a gigabyte twice to answer
 * two weightings would double it. A repository's tally is added and discarded; nothing here holds a tree.
 */
public final class CorpusWords {

    private final Map<String, Integer> occurrences = new HashMap<>();
    private final Map<String, Double> shares = new HashMap<>();

    private int repositories;
    private int total;

    /** One repository: its counts into the total, its own shares into the running sum. */
    public void add(final WrittenWords repository) {
        repositories++;
        total += repository.totalOccurrences();
        repository.words().forEach(word ->
                occurrences.merge(word, repository.occurrencesOf(word), Integer::sum));
        repository.shareByWord().forEach((word, share) -> shares.merge(word, share, Double::sum));
    }

    public int repositories() {
        return repositories;
    }

    public Set<String> words() {
        return Set.copyOf(occurrences.keySet());
    }

    public int occurrencesOf(final String word) {
        return occurrences.getOrDefault(word, 0);
    }

    public int totalOccurrences() {
        return total;
    }

    /** The word's share in each repository, summed. A pooling divides it by the repository count. */
    public double summedShareOf(final String word) {
        return shares.getOrDefault(word, 0.0);
    }
}
