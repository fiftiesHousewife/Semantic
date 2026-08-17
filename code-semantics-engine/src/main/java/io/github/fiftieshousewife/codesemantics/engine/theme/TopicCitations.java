package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.Weights;
import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

/**
 * What the bundled topical resources say a word is about, as votes carrying mass. Two resources answer, and
 * they answer differently:
 *
 * <p><b>The unit is the observation, not the resource.</b> Normalising each resource to one unit hands a
 * resource stating a <em>single</em> label the entire unit, so the fewer things a resource says about a
 * word the louder each one becomes — precision in a resource becomes volume in the reading, which is the
 * opposite of what evidence does.
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

    /** How many senses the dictionary states for a word — the denominator a headword claim speaks against. */
    @FunctionalInterface
    public interface SenseCount {
        int of(String word);
    }

    /** Whether a bundled domain taxonomy publishes this word as one of its own terms. */
    @FunctionalInterface
    public interface PublishedTerm {
        boolean states(String word);
    }

    private final SenseDomains senseDomains;
    private final SenseDomains verbSenses;
    private final SenseDomains anyPartSenses;
    private final HeadwordTopics headwordTopics;
    private final SenseCount senseCount;
    private final PublishedTerm published;
    private final Weights weights;

    public TopicCitations(final SenseDomains senseDomains, final HeadwordTopics headwordTopics,
                          final SenseCount senseCount, final Weights weights) {
        this(senseDomains, senseDomains, headwordTopics, senseCount, weights);
    }

    public TopicCitations(final SenseDomains senseDomains, final SenseDomains verbSenses,
                          final HeadwordTopics headwordTopics, final SenseCount senseCount,
                          final Weights weights) {
        this(senseDomains, verbSenses, senseDomains, headwordTopics, senseCount, word -> false, weights);
    }

    public TopicCitations(final SenseDomains senseDomains, final SenseDomains verbSenses,
                          final SenseDomains anyPartSenses, final HeadwordTopics headwordTopics,
                          final SenseCount senseCount, final PublishedTerm published,
                          final Weights weights) {
        this.published = published;
        this.verbSenses = verbSenses;
        this.anyPartSenses = anyPartSenses;
        this.senseDomains = senseDomains;
        this.headwordTopics = headwordTopics;
        this.senseCount = senseCount;
        this.weights = weights;
    }

    public static TopicCitations fromClasspath() {
        return new TopicCitations(SenseDomains.fromClasspath(), SenseDomains.verbsFromClasspath(),
                SenseDomains.anyPartFromClasspath(), StatedTopics.fromClasspath(),
                io.github.fiftieshousewife.bi.lexicon.WordNetLexicon.fromClasspath()::senseCount,
                publishedTerms(), Weights.defaults());
    }

    /**
     * The terms a bundled domain taxonomy publishes, asked of one word at a time. OLiA states the vocabulary
     * of linguistic annotation and its concepts are already identifiers, so a word it names is a word a
     * field has claimed.
     */
    private static PublishedTerm publishedTerms() {
        final io.github.fiftieshousewife.codesemantics.engine.term.LinguisticTerms terms =
                io.github.fiftieshousewife.codesemantics.engine.term.LinguisticTerms.fromClasspath();
        return word -> !terms.conceptsOf(java.util.List.of(word)).isEmpty();
    }

    /** Every topical reading of the word as a noun, or an empty list when neither resource claims it. */
    public List<TopicVote> of(final String word) {
        return readAs(senseDomains, word);
    }

    /**
     * The same, of a word the grammar says is being used as a verb — the first word of a method name, which
     * this library already reads as a clause. Its noun and its verb are different subjects and the parse is
     * what says which was written.
     */
    public List<TopicVote> ofVerb(final String word) {
        return readAs(verbSenses, word);
    }

    /**
     * The reading for a word in <b>prose</b>, where nothing in the grammar says it is being used as a name.
     * An identifier is a noun phrase and its words are nouns; a sentence is not, and forcing {@code read}
     * into its noun sense made a library that reads repositories evidence for the publishing trade.
     */
    public List<TopicVote> inProse(final String word) {
        return readAs(anyPartSenses, word);
    }

    /**
     * Where a <b>domain taxonomy publishes the word as one of its own terms</b> and no sense-labelled
     * resource speaks about it, a general vocabulary's spread of unrelated subjects is not admitted.
     *
     * <p>A citation outranks an assertion, and that is the whole of the rule. {@code topic} is a term OLiA
     * publishes — it is information structure, what a sentence is about — and it is the commonest content
     * word this repository writes. WordNet Domains labels neither of its senses, and the one general
     * vocabulary that answers splits it evenly across {@code medicine}, {@code computing} and {@code music}:
     * three equal guesses about a word a field has already claimed. A published taxonomy saying "this is my
     * term" outranks a general dictionary saying "it might be any of these".
     *
     * <p>The rule is deliberately narrow, and every clause of it is load-bearing. It needs a taxonomy to
     * have claimed the word, and it needs the sense-labelled resource to be silent — so {@code phrase},
     * which OLiA also publishes and whose commonest sense WordNet labels {@code grammar}, is untouched.
     * Without the taxonomy clause the refusal also strips the arXiv descriptions that form the field
     * reference, which are too short to spare it, and costs {@code computing} and {@code grammar}.
     */
    private List<TopicVote> readAs(final SenseDomains reading, final String word) {
        final List<TopicVote> sensed = senseLabelled(reading, word);
        final List<TopicVote> headword = headwordLabelled(word);
        if (sensed.isEmpty() && headword.size() > 1 && published.states(word)) {
            return List.of();
        }
        final List<TopicVote> votes = new ArrayList<>(sensed);
        votes.addAll(headword);
        return List.copyOf(votes);
    }

    private List<TopicVote> senseLabelled(final SenseDomains reading, final String word) {
        final List<TopicVote> votes = new ArrayList<>();
        reading.of(word).stream()
                .filter(labels -> !labels.isEmpty())
                .forEach(labels -> labels.forEach(label -> votes.add(new TopicVote(label,
                        weights.wordNetDomain() / labels.size(), EvidenceSource.WORDNET_DOMAIN))));
        return votes;
    }

    /**
     * A headword claim names no sense, so it speaks for one of however many the dictionary states — and it
     * is admitted at that share.
     *
     * <p>The two resources are answering different questions and were being counted as if they answered the
     * same one. WordNet's reading is disambiguated: it is the subject of the sense the word is
     * <em>most often written in</em>. A headword claim is about the word as a whole, so for a word with
     * eight senses it is evidence about at most an eighth of it. Counting them at parity let the vaguer
     * claim outvote the sharper one exactly where the two disagreed: {@code phrase} is
     * {@code grammar} to a disambiguated reading and {@code music} to a headword one, and
     * {@code cite} is nothing at all to the first and {@code law} to the second.
     *
     * <p>The share is the dictionary's own sense count and not a number chosen here, and a word the
     * dictionary does not know at all has no denominator to speak against, so the claim stands whole — it is
     * the only evidence there is.
     */
    private List<TopicVote> headwordLabelled(final String word) {
        final Set<String> labels = headwordTopics.of(word);
        final int senses = Math.max(1, senseCount.of(word));
        return labels.stream()
                .map(label -> new TopicVote(label, weights.wiktionaryTopic() / (labels.size() * senses),
                        EvidenceSource.WIKTIONARY_TOPIC))
                .toList();
    }
}
