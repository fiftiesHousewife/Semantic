package org.fifties.housewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.reading.IdentifierOccurrence;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.engine.reading.JavaLanguageKeywords;
import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * Accumulates one file's identifier occurrences into a {@link FileTopics}, recording as it goes which words
 * carried which topic into the shared {@link TopicWitnesses}.
 *
 * <p>A word occurrence commits its mass once per resource and counts as one reference per topic, however
 * many senses of it named that topic. The two are kept apart deliberately: a word whose four senses all name
 * mathematics has said mathematics once and committed its whole unit to it, and counting four references
 * there would let a word's ambiguity inflate the very figure a reader uses to judge ambiguity.
 */
public final class TopicTally {

    private final TopicCitations citations;
    private final IdentifierWords words;
    private final JavaLanguageKeywords keywords;
    private final TopicWitnesses witnesses;

    private final Map<String, Double> massByTopic = new HashMap<>();
    private final Map<String, Integer> referencesByTopic = new HashMap<>();

    private int unreadableOccurrences;
    private int wordOccurrences;

    public TopicTally(final TopicCitations citations, final IdentifierWords words,
                      final JavaLanguageKeywords keywords, final TopicWitnesses witnesses) {
        this.citations = citations;
        this.words = words;
        this.keywords = keywords;
        this.witnesses = witnesses;
    }

    public void add(final String site, final IdentifierOccurrence occurrence) {
        if (keywords.names(occurrence.identifier())) {
            return;
        }
        words.of(occurrence.identifier()).words()
                .forEach(word -> read(word, site + ":" + occurrence.line()));
    }

    public FileTopics reading(final String path, final int lines) {
        return new FileTopics(path, lines, massByTopic, referencesByTopic, unreadableOccurrences,
                wordOccurrences);
    }

    private void read(final String word, final String site) {
        wordOccurrences++;
        final Map<String, Set<EvidenceSource>> sourcesByTopic = new HashMap<>();
        citations.of(word).forEach(vote -> {
            massByTopic.merge(vote.topic(), vote.mass(), Double::sum);
            sourcesByTopic.computeIfAbsent(vote.topic(), key -> new LinkedHashSet<>()).add(vote.source());
        });
        if (sourcesByTopic.isEmpty()) {
            unreadableOccurrences++;
            return;
        }
        sourcesByTopic.forEach((topic, sources) -> {
            referencesByTopic.merge(topic, 1, Integer::sum);
            sources.forEach(source -> witnesses.record(topic, word, site, source));
        });
    }
}
