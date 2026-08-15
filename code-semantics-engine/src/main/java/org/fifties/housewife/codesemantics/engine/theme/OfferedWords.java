package org.fifties.housewife.codesemantics.engine.theme;

import java.util.Optional;

import org.fifties.housewife.codesemantics.engine.Weights;
import org.fifties.housewife.codesemantics.engine.parse.NameForm;

/**
 * Which words a reading offers to the resources at all, in what dictionary form, and what one occurrence of
 * each is worth before any resource has spoken. Three rules, none of them a list, and each asked of a
 * published resource:
 *
 * <ul>
 *   <li>A word nothing chose is kept only where the dictionary knows it as a noun or a verb. {@code and},
 *       {@code of} and {@code that} are how English holds a sentence together, not what a sentence is
 *       about, and an open-class dictionary is what says so.</li>
 *   <li>A word of symbol length is refused whichever it is, because a dictionary entry for a one- or
 *       two-letter form is about a symbol and a name can be a sentence with an article in it.</li>
 *   <li><b>A dependency's own name is not offered at all.</b> A coordinate denotes an artefact somebody else
 *       published, so asking a dictionary what it means is a category error and not an inaccuracy — and the
 *       dictionary answers. {@code org.junit.jupiter} yields {@code jupiter}, which this tree writes 230
 *       times and which votes <em>astronomy</em>, <em>mythology</em> and <em>chemistry</em> as the Roman god;
 *       it was the largest single carrier of two of the worst labels in the report. {@code owl} is an
 *       ontology language read as a bird. What a dependency states about a repository is real and it is
 *       stated by the artefact rather than by its spelling, so it belongs to a reading of coordinates and
 *       not to a reading of English.</li>
 *   <li>What survives is worth what its {@link NameForm form} is worth, and — where nothing chose it — how
 *       much it narrows a subject at all.</li>
 * </ul>
 */
public final class OfferedWords {

    private final ContentWords content;
    private final WordSpecificity specificity;
    private final PublishedPhrases phrases;
    private final Weights weights;

    public OfferedWords(final ContentWords content, final WordSpecificity specificity,
                        final PublishedPhrases phrases, final Weights weights) {
        this.content = content;
        this.specificity = specificity;
        this.phrases = phrases;
        this.weights = weights;
    }

    public static OfferedWords fromClasspath() {
        return new OfferedWords(ContentWords.fromClasspath(), WordSpecificity.fromClasspath(),
                PublishedPhrases.fromClasspath(), Weights.defaults());
    }

    /**
     * The dictionary form this word is offered as, or nothing where it is a word the author did not choose
     * and the dictionary does not carry — a part of speech that holds a sentence together rather than saying
     * what it is about. A name the repository chose is otherwise always offered, whether or not any
     * dictionary knows it: an unread name is a finding, where an unread preposition is grammar.
     *
     * <p>A run of words a resource publishes as one entry is offered exactly as that resource writes it. It
     * arrives already in the dictionary's own form, because being in that form is what
     * {@link CollocatedWords} read it as a run for, and a lemmatiser asked about a collocation answers about
     * its head word — which would offer {@code base} for {@code base form} and lose the entry that was found.
     */
    public Optional<String> of(final NameForm form, final String word) {
        if (form == NameForm.IMPORT || content.tooShortToMean(word)) {
            return Optional.empty();
        }
        if (phrases.states(word)) {
            return Optional.of(word);
        }
        return form.isChosenName() ? Optional.of(content.lemmaOrSurface(word)) : content.lemmaOf(word);
    }

    /** What one phrase in this position is worth, whatever it turns out to be about. */
    public double formWorth(final NameForm form) {
        return form.isProse() ? weights.prose() : weights.declaredName();
    }

    /**
     * How much this word narrows a subject within its phrase. A word the author chose narrows fully — they
     * picked it — where a word the language or a registry imposed narrows by how rare it is, which is the
     * surprisal the frequency list states.
     */
    public double narrowing(final NameForm form, final String lemma) {
        return form.isChosenName() ? 1.0 : specificity.of(lemma);
    }
}
