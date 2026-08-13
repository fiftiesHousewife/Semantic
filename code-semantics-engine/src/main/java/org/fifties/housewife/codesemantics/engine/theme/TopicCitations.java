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
 * <ul>
 *   <li><b>WordNet Domains</b> labels each of a word's <em>senses</em>, so the sense structure is what
 *       spreads the mass: each sense casts an equal share of the word's unit, split again across the labels
 *       that sense carries. A word meaning food in both its senses and chemistry in one commits three
 *       quarters of its mass to food, which is what the resource is actually saying. The whole of it is then
 *       scaled by the {@link SenseCoverage share of the word it covers}, because the resource omits
 *       domain-less senses and a label on one sense of six is speaking for a sixth of the word.</li>
 *   <li><b>Wiktionary topics</b> publishes a flat set per headword with no sense structure to read, so its
 *       unit divides evenly among the labels it names — the labels it {@link StatedTopics states}, that is,
 *       since the set it publishes is a closure over its own hierarchy and a subject the resource derived
 *       is not a second reading of the word.</li>
 * </ul>
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
    private final SenseCoverage coverage;
    private final Weights weights;

    public TopicCitations(final SenseDomains senseDomains, final HeadwordTopics headwordTopics,
                          final SenseCoverage coverage, final Weights weights) {
        this.senseDomains = senseDomains;
        this.headwordTopics = headwordTopics;
        this.coverage = coverage;
        this.weights = weights;
    }

    public static TopicCitations fromClasspath() {
        return new TopicCitations(SenseDomains.fromClasspath(), StatedTopics.fromClasspath(),
                SenseCoverage.fromClasspath(), Weights.defaults());
    }

    /** Every topical reading of the word, or an empty list when neither resource claims it. */
    public List<TopicVote> of(final String word) {
        final List<TopicVote> votes = new ArrayList<>(senseLabelled(word));
        votes.addAll(headwordLabelled(word));
        return List.copyOf(votes);
    }

    private List<TopicVote> senseLabelled(final String word) {
        final List<Set<String>> senses = senseDomains.of(word).stream()
                .filter(labels -> !labels.isEmpty())
                .toList();
        final double covered = coverage.of(word);
        final List<TopicVote> votes = new ArrayList<>();
        senses.forEach(labels -> labels.forEach(label -> votes.add(new TopicVote(label,
                covered * weights.wordNetDomain() / (senses.size() * (double) labels.size()),
                EvidenceSource.WORDNET_DOMAIN))));
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
