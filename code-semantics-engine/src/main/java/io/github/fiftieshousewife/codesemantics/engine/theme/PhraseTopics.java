package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;

/**
 * What a <em>phrase</em> is about, read from its words together rather than one at a time.
 *
 * <p>A word alone is ambiguous and nothing can be done about that; a word among its siblings is much less so,
 * and the siblings are free. {@code cite} alone is law, linguistics, publishing and half a dozen more.
 * {@code citationSource} is cite beside source, and the only subject both of them name is the one the phrase
 * is actually about. This is the plan's own disambiguation — the sibling tokens of an identifier corroborate
 * a reading — applied to every phrase the parse produces: a declared name, a sentence of prose, a dependency
 * path.
 *
 * <p>Two factors decide a subject's score, and neither is a constant anyone chose:
 *
 * <ul>
 *   <li>the <b>geometric mean</b> of the commitment each agreeing word made to it, which is the log-linear
 *       pooling this library uses everywhere else — a subject two words are sure of outscores one they are
 *       both vague about;</li>
 *   <li>the <b>share of the phrase that agrees</b>, {@code k/n}. A subject one word in twenty names is one
 *       word's opinion in a sentence about something else, and scores a twentieth of what it would have
 *       scored alone.</li>
 * </ul>
 *
 * <p>The reading also carries its {@link PhraseReading#credence()}: how much of its carrying words the
 * resources spoke for at all. A phrase resting on words whose everyday senses were never labelled is a
 * confident reading of very little, and the amount it commits says so where its shares cannot.
 *
 * <p>The shares are normalised, so <b>a phrase commits one unit however long it is</b>. A twenty-word javadoc
 * sentence and a two-word field name are one observation each, which is the same choice the plan makes at
 * blob level and for the same reason: without it, the reading measures how much was written rather than what
 * was said.
 */
public final class PhraseTopics {

    private final TopicCitations citations;
    private final TopicCommitment commitment;
    private final SenseCoverage coverage;
    private final TopicDistribution prior;
    private final PhraseGrammar grammar;

    public PhraseTopics(final TopicCitations citations, final TopicCommitment commitment,
                        final SenseCoverage coverage) {
        this(citations, commitment, coverage, TopicDistribution.NOTHING, Set.of(), "");
    }

    private PhraseTopics(final TopicCitations citations, final TopicCommitment commitment,
                         final SenseCoverage coverage, final TopicDistribution prior,
                         final Set<String> declaredHere, final String layoutWord) {
        this.citations = citations;
        this.commitment = commitment;
        this.coverage = coverage;
        this.prior = prior;
        this.grammar = new PhraseGrammar(citations, declaredHere, layoutWord);
    }

    /**
     * The same reading conditioned on what the file it sits in is already about.
     *
     * <p>A phrase of one word has no siblings to be read against, and that is where the reading is weakest:
     * a field called {@code page} is the publishing trade to a dictionary and an HTML element to everyone
     * who has seen the file. The file is the context a single word does not carry, and it costs nothing —
     * the first pass over the file has already computed it.
     *
     * <p>It is a vote and not a gate. The factor is {@code 1 + the file's share of the topic}, so it lies in
     * {@code [1, 2]} by the definition of a share and nothing here chooses a bound: a topic the file is a
     * third about is worth a third more, a topic it barely holds is worth barely more, and a topic the first
     * pass never reached is worth exactly what the phrase read it as. An empty prior leaves the reading as
     * it was, which is what makes the first pass safe.
     *
     * <p>The file's own declared names come with it, and they settle a part of speech no tagger is needed
     * for. A sentence is not a noun phrase, so a word in prose is read by the corpus's own counts — but a
     * word this file <em>declared</em> is one the file has already committed to a meaning for, and the
     * prose around a declaration is prose about that declaration. Without it {@code file} in a sentence
     * reads as the verb, which is a legal act, and a library documenting parsed files documents litigation.
     *
     * <p>The word the file's source set is named by comes with it too. A name's word spelling the source
     * set restates the layout — Maven's, not the author's — so it votes nothing while staying in the
     * phrase it was written in.
     */
    public PhraseTopics under(final TopicDistribution fileReading, final Set<String> declaredHere,
                              final String layoutWord) {
        return new PhraseTopics(citations, commitment, coverage, fileReading, declaredHere, layoutWord);
    }

    /**
     * What the phrase is about, as a distribution summing to one over the subjects its words agree on.
     *
     * @param words        the phrase's words, already offered in their dictionary form
     * @param weightByWord what each word is worth on its own — how much it narrows a subject at all
     */
    public PhraseReading of(final List<String> words, final Map<String, Double> weightByWord) {
        return of(words, weightByWord, citations::of);
    }

    /**
     * What the phrase is about, with the words the grammar says are verbs read as verbs.
     *
     * @param form where the phrase was written, which is what says how each of its words is being used
     */
    public PhraseReading of(final List<String> words, final Map<String, Double> weightByWord,
                            final NameForm form) {
        return of(words, weightByWord, grammar.citing(form, words));
    }

    private PhraseReading of(final List<String> words, final Map<String, Double> weightByWord,
                             final Function<String, List<TopicVote>> cite) {
        if (words.isEmpty()) {
            return PhraseReading.NOTHING;
        }
        final WordCommitments commitments = new WordCommitments(words, cite, commitment);
        final Map<String, Double> scores = new TreeMap<>();
        final Map<String, Set<String>> agreement = new TreeMap<>();
        final List<RefusedTopic> refused = new ArrayList<>();
        commitments.topics().forEach(topic -> {
            final Set<String> agreeing = commitments.agreeing(topic);
            final TopicScore score = new TopicScore(commitments.agreed(agreeing, topic, weightByWord),
                    agreeing.size(), commitments.words(), expectedIn(topic));
            if (score.stands()) {
                scores.put(topic, score.value());
                agreement.put(topic, agreeing);
                return;
            }
            score.refusals().forEach(rule -> refused.add(new RefusedTopic(topic, rule)));
        });
        if (scores.isEmpty()) {
            return new PhraseReading(Map.of(), Map.of(), 0.0, refused);
        }
        final Set<String> carrying = agreement.values().stream()
                .flatMap(Set::stream)
                .collect(Collectors.toCollection(TreeSet::new));
        return PhraseReading.normalised(scores, agreement, coverage.of(carrying), refused);
    }

    /** The prior's promotion factor, in {@code [1, 2]} by what a share is — {@link #under} states the rule. */
    private double expectedIn(final String topic) {
        return prior.isEmpty() ? 1.0 : 1.0 + prior.shareOf(topic);
    }

}
