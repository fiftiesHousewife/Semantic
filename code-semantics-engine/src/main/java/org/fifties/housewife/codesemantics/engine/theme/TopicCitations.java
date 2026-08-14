package org.fifties.housewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.Weights;
import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * What the bundled topical resources say a word is about, as votes carrying mass. Two resources answer, and
 * they answer differently:
 *
 * <p><b>The unit is the observation, not the resource.</b> That distinction is the whole of how mass is
 * allotted here, and getting it wrong the other way was measurable: while each resource was normalised to
 * one unit, a resource stating a <em>single</em> label handed that label the entire unit, so the fewer
 * things a resource said about a word the louder each one became. `first` is written 116 times in this
 * tree; Wiktionary states exactly one topic for it, `baseball`; WordNet labels five senses. Under
 * resource-parity `baseball` took <b>81%</b> of the word and led a whole scope. Precision in a resource had
 * become volume in the reading, which is the opposite of what evidence does.
 *
 * <ul>
 *   <li><b>WordNet Domains</b> labels each of a word's <em>senses</em>, so each labelled sense is one
 *       observation, split across the labels that sense carries. A word meaning food in both its senses and
 *       chemistry in one observes food twice and chemistry once — three observations, not a unit divided
 *       three ways. A word the resource read five senses of has said five times as much as a word it read
 *       one sense of, and that is the fact a reading needs.</li>
 *   <li><b>Wiktionary topics</b> publishes a flat set per headword with no sense structure to read, so it
 *       makes exactly one observation, divided evenly among the labels it names — the labels it
 *       {@link StatedTopics states}, that is, since the set it publishes is a closure over its own hierarchy
 *       and a subject the resource derived is not a second reading of the word.</li>
 * </ul>
 *
 * <p>{@link SenseCoverage} no longer scales the vote here. It still discounts what a phrase commits, in
 * {@code PhraseTopics}, and applying it in both places was counting one fact twice.
 *
 * <p>The two label spaces are <em>not</em> reconciled. WordNet Domains writes {@code computer_science} where
 * Wiktionary writes {@code computing}, and no bundled resource states that those are the same subject — so
 * nothing here says it either. Aliasing them would take a hand-written synonym map, which is the one thing
 * this library may not have. They appear as the separate readings they are, and every report names which
 * resource carried which.
 */
public final class TopicCitations {

    private final SenseDomains senseDomains;
    private final HeadwordTopics headwordTopics;
    private final Weights weights;

    public TopicCitations(final SenseDomains senseDomains, final HeadwordTopics headwordTopics,
                          final Weights weights) {
        this.senseDomains = senseDomains;
        this.headwordTopics = headwordTopics;
        this.weights = weights;
    }

    public static TopicCitations fromClasspath() {
        return new TopicCitations(SenseDomains.fromClasspath(), StatedTopics.fromClasspath(),
                Weights.defaults());
    }

    /** Every topical reading of the word, or an empty list when neither resource claims it. */
    public List<TopicVote> of(final String word) {
        final List<TopicVote> votes = new ArrayList<>(senseLabelled(word));
        votes.addAll(headwordLabelled(word));
        return List.copyOf(votes);
    }

    private List<TopicVote> senseLabelled(final String word) {
        final List<TopicVote> votes = new ArrayList<>();
        senseDomains.of(word).stream()
                .filter(labels -> !labels.isEmpty())
                .forEach(labels -> labels.forEach(label -> votes.add(new TopicVote(label,
                        weights.wordNetDomain() / labels.size(), EvidenceSource.WORDNET_DOMAIN))));
        return votes;
    }

    private List<TopicVote> headwordLabelled(final String word) {
        final Set<String> labels = headwordTopics.of(word);
        return labels.stream()
                .map(label -> new TopicVote(label, weights.wiktionaryTopic() / labels.size(),
                        EvidenceSource.WIKTIONARY_TOPIC))
                .toList();
    }
}
