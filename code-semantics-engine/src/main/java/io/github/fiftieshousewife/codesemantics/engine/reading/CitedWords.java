package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

/**
 * Which resources can be cited for a word, over a set of {@link WordCitation}s. An empty answer is an
 * abstention and a correct outcome: the word was read by nothing, which is a finding about the repository
 * rather than a failure of the reading. The answer is a set and carries no ordering, because several
 * resources speaking about one word are corroborating each other rather than queuing.
 *
 * <p>Answers are memoised because a codebase repeats its words — the same few thousand distinct words carry
 * hundreds of thousands of occurrences — and a dictionary lookup is far dearer than a map hit.
 */
public final class CitedWords {

    private final List<WordCitation> citations;
    private final Map<String, Set<EvidenceSource>> sourcesByWord = new ConcurrentHashMap<>();

    public CitedWords(final List<WordCitation> citations) {
        this.citations = List.copyOf(citations);
    }

    public static CitedWords fromClasspath() {
        return new CitedWords(BundledCitations.fromClasspath());
    }

    /** Every resource that can be cited for the word; empty when none can. */
    public Set<EvidenceSource> citing(final String word) {
        return sourcesByWord.computeIfAbsent(word, this::consultEveryResource);
    }

    private Set<EvidenceSource> consultEveryResource(final String word) {
        return citations.stream()
                .filter(citation -> citation.cites(word))
                .map(WordCitation::source)
                .collect(Collectors.toUnmodifiableSet());
    }
}
