package org.fifties.housewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.Map;

import org.fifties.housewife.codesemantics.name.WordRanks;

/**
 * What the topical resources say <em>ordinary English</em> is about: every word of the bundled frequency
 * list read through the same pipeline a repository's words go through, each weighted by how common the list
 * says it is.
 *
 * <p>It is the reference the reading was missing. A scope is judged against the repository and the
 * repository against nothing at all, so a subject that a general dictionary attaches to common English words
 * arrives looking like a finding. {@code law}, {@code publishing}, {@code biology} and {@code music} are
 * among the commonest subjects in a general scheme — {@code file}, {@code page}, {@code catalog},
 * {@code taxonomy} and {@code witness} are ordinary words with ordinary specialist senses — so a repository
 * of any kind will read as partly about all four. A topic held at the rate ordinary English holds it is
 * saying nothing about the repository that reads it.
 *
 * <p>Nothing here is a list of subjects to suppress. The reference is a published frequency list read by the
 * same resources under the same rules, and what it produces is whatever those resources say about ordinary
 * words. A subject this repository writes <em>more</em> densely than English does survives it; one it writes
 * at the same rate does not, whichever subject that turns out to be.
 *
 * <p>The list's rank is its own weight: a word at rank 1 is far commoner than one at rank 20,000, and
 * Zipf's law says the first is written about as many times as its rank is small. So a word contributes
 * {@code 1/rank}, which is the frequency the list's own ordering states rather than a curve fitted here.
 */
public final class OrdinaryEnglish {

    private final TopicCitations citations;
    private final WordRanks ranks;

    public OrdinaryEnglish(final TopicCitations citations, final WordRanks ranks) {
        this.citations = citations;
        this.ranks = ranks;
    }

    public static OrdinaryEnglish fromClasspath() {
        return new OrdinaryEnglish(TopicCitations.fromClasspath(), WordRanks.fromClasspath());
    }

    /** The subjects ordinary English is about, as a distribution over the same topic space a scope reads in. */
    public TopicDistribution reading() {
        final Map<String, Double> massByTopic = new HashMap<>();
        ranks.words().forEach(word -> citations.of(word)
                .forEach(vote -> massByTopic.merge(vote.topic(), vote.mass() / ranks.rank(word),
                        Double::sum)));
        return TopicDistribution.of(massByTopic);
    }
}
