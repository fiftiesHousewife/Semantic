package org.fifties.housewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.fifties.housewife.codesemantics.engine.Weights;
import org.fifties.housewife.codesemantics.engine.parse.NameForm;
import org.fifties.housewife.codesemantics.engine.parse.NameOccurrence;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * Accumulates one file's identifier occurrences into a {@link FileTopics}, recording as it goes which words
 * carried which topic into the shared {@link TopicWitnesses}.
 *
 * <p>A word occurrence commits its mass once per resource and counts as one reference per topic, however
 * many senses of it named that topic. The two are kept apart deliberately: a word whose four senses all name
 * mathematics has said mathematics once and committed its whole unit to it, and counting four references
 * there would let a word's ambiguity inflate the very figure a reader uses to judge ambiguity.
 *
 * <p>What arrives is only what this repository declared and wrote — the parse has already left out every use
 * of a name someone else declared, which is what keeps a file's hundredth mention of {@code String} from
 * being read as a hundred statements about music.
 *
 * <p>Two rules separate what an author chose from what the language and the registries imposed, and both are
 * asked of a published resource rather than of a list:
 *
 * <ul>
 *   <li>A word this repository did not choose as a name is kept only where the dictionary knows it as a noun
 *       or a verb. {@code and}, {@code of} and {@code that} are how English holds a sentence together, not
 *       what the sentence is about, and an open-class dictionary is what says so.</li>
 *   <li>What survives is scaled by its {@link WordSpecificity specificity}, so a common content word narrows
 *       a subject less than a rare one. Nothing is silenced: it votes at the weight the frequency list says
 *       it is worth.</li>
 *   <li>Every word, chosen or not, votes its {@link TopicCommitment commitment} to a subject weighted by
 *       that same commitment, so a word the resources place in eight subjects says a sixty-fourth as much
 *       about each of them and an eighth as much in total.</li>
 *   <li>And by what its {@link NameForm form} is worth: a declared name is the code, a dependency is a
 *       choice about what the code is made of, and prose is commentary on it.</li>
 * </ul>
 *
 * <p>Every word, chosen or not, is read as its dictionary form, so {@code words} and {@code word} are one
 * subject rather than two and a verb's inflections do not split their own evidence.
 */
public final class TopicTally {

    private final TopicCitations citations;
    private final IdentifierWords words;
    private final OfferedWords offered;
    private final TopicCommitment commitment;
    private final TopicWitnesses witnesses;
    private final WordSightings sightings;

    private final Map<String, Double> massByTopic = new HashMap<>();
    private final Map<String, Double> nameMassByTopic = new HashMap<>();
    private final Map<String, Integer> referencesByTopic = new HashMap<>();

    private int unreadableOccurrences;
    private int wordOccurrences;

    public TopicTally(final TopicCitations citations, final IdentifierWords words, final OfferedWords offered,
                      final TopicCommitment commitment, final TopicWitnesses witnesses,
                      final WordSightings sightings) {
        this.citations = citations;
        this.words = words;
        this.offered = offered;
        this.commitment = commitment;
        this.witnesses = witnesses;
        this.sightings = sightings;
    }

    public void add(final String site, final NameOccurrence occurrence) {
        final NameForm form = occurrence.form();
        form.vocabulary().read(occurrence.text(), words).words()
                .forEach(word -> offered.of(form, word)
                        .ifPresent(lemma -> read(lemma, form, site + ":" + occurrence.line(),
                                offered.worthOf(form, lemma))));
    }

    public FileTopics reading(final String path, final int lines) {
        return new FileTopics(path, lines, massByTopic, nameMassByTopic, referencesByTopic,
                unreadableOccurrences, wordOccurrences);
    }

    private void read(final String word, final NameForm form, final String site, final double scale) {
        wordOccurrences++;
        sightings.saw(word, site, form.isChosenName());
        final Map<String, Set<EvidenceSource>> sourcesByTopic = new HashMap<>();
        final Map<String, Double> massByThisWord = new HashMap<>();
        final List<TopicVote> votes = citations.of(word);
        final Map<String, Double> committed = commitment.of(votes);
        committed.forEach((topic, share) -> {
            final double said = scale * share * share;
            massByTopic.merge(topic, said, Double::sum);
            massByThisWord.merge(topic, said, Double::sum);
            if (form.isChosenName()) {
                nameMassByTopic.merge(topic, said, Double::sum);
            }
        });
        votes.forEach(vote ->
                sourcesByTopic.computeIfAbsent(vote.topic(), key -> new LinkedHashSet<>()).add(vote.source()));
        if (sourcesByTopic.isEmpty()) {
            unreadableOccurrences++;
            return;
        }
        sourcesByTopic.forEach((topic, sources) -> {
            referencesByTopic.merge(topic, 1, Integer::sum);
            sources.forEach(source ->
                    witnesses.record(topic, word, site, source, massByThisWord.get(topic)));
        });
    }
}
