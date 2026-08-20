package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * What the resources state about every word a reading offered them, most-written first.
 *
 * <p>A ranking says a topic was carried by a word. This says what the word was read as, which is the only
 * way to argue with the ranking — and it states the words the resources said nothing about beside the ones
 * they did, because a word carrying no subject and a word carrying a wrong one are different complaints.
 *
 * <p>Ordered by what each word carried rather than by how often it was written, because those disagree and
 * the second is the misleading one: a licence header is the commonest prose in most repositories and is
 * worth a hundredth of a sighting per file.
 */
public final class ReadWords {

    private final TopicCitations citations;
    private final TopicCommitment commitment;
    private final SenseCoverage coverage;
    private final WordSpecificity specificity;

    public ReadWords(final TopicCitations citations, final TopicCommitment commitment,
                     final SenseCoverage coverage, final WordSpecificity specificity) {
        this.citations = citations;
        this.commitment = commitment;
        this.coverage = coverage;
        this.specificity = specificity;
    }

    public static ReadWords fromClasspath() {
        return new ReadWords(TopicCitations.fromClasspath(), new TopicCommitment(),
                SenseCoverage.fromClasspath(), WordSpecificity.fromClasspath());
    }

    /** One row per word the reading offered, the word that carried most first. */
    public List<WordEvidence> in(final Workings workings) {
        final Map<String, Double> carried = workings.witnesses().carriedByWord();
        final Set<String> names = workings.sightings().namedWith();
        return workings.sightings().words().stream()
                .map(word -> evidenceOf(word, workings.sightings(), carried, names))
                .sorted(Comparator.comparingDouble(WordEvidence::carried).reversed()
                        .thenComparing(WordEvidence::word))
                .toList();
    }

    private WordEvidence evidenceOf(final String word, final WordSightings sightings,
                                    final Map<String, Double> carried, final Set<String> names) {
        return new WordEvidence(word, sightings.occurrencesOf(word), carried.getOrDefault(word, 0.0),
                names.contains(word), sightings.siteOf(word), coverage.of(word), specificity.of(word),
                citations.of(word), citations.inProse(word), citations.ofVerb(word),
                commitment.of(citations.of(word)));
    }
}
