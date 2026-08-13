package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.Map;

/**
 * What the bundled resources actually say about one word: every topical vote, what each is worth, and what
 * share of the word each subject ends up holding.
 *
 * <p>A ranking says a topic was carried by a word. This says why, which is the only way to argue with it.
 */
public final class TopicVoteProbe {

    private TopicVoteProbe() {
    }

    public static void main(final String[] args) {
        final TopicCitations citations = TopicCitations.fromClasspath();
        final SenseCoverage coverage = SenseCoverage.fromClasspath();
        final TopicCommitment commitment = new TopicCommitment();
        for (final String word : args) {
            final Map<String, Double> shares = commitment.of(citations.of(word));
            System.out.printf("%n%s — %d votes, coverage %.3f, concentration %.4f%n", word,
                    citations.of(word).size(), coverage.of(word),
                    shares.values().stream().mapToDouble(share -> share * share).sum());
            citations.of(word).stream()
                    .sorted(Comparator.comparingDouble(TopicVote::mass).reversed())
                    .forEach(vote -> System.out.printf("    %-22s mass %.4f  %s%n",
                            vote.topic(), vote.mass(), vote.source()));
            shares.entrySet().stream()
                    .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                    .forEach(share -> System.out.printf("  share %-22s p %.4f   p2 %.4f%n",
                            share.getKey(), share.getValue(), share.getValue() * share.getValue()));
        }
    }
}
