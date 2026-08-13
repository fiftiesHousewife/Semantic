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
 *   <li>What survives is worth what its {@link NameForm form} is worth, and — where nothing chose it — how
 *       much it narrows a subject at all.</li>
 * </ul>
 */
public final class OfferedWords {

    private final ContentWords content;
    private final WordSpecificity specificity;
    private final Weights weights;

    public OfferedWords(final ContentWords content, final WordSpecificity specificity,
                        final Weights weights) {
        this.content = content;
        this.specificity = specificity;
        this.weights = weights;
    }

    public static OfferedWords fromClasspath() {
        return new OfferedWords(ContentWords.fromClasspath(), WordSpecificity.fromClasspath(),
                Weights.defaults());
    }

    /**
     * The dictionary form this word is offered as, or nothing where it is a word the author did not choose
     * and the dictionary does not carry — a part of speech that holds a sentence together rather than saying
     * what it is about. A name the repository chose is otherwise always offered, whether or not any
     * dictionary knows it: an unread name is a finding, where an unread preposition is grammar.
     */
    public Optional<String> of(final NameForm form, final String word) {
        if (content.tooShortToMean(word)) {
            return Optional.empty();
        }
        return form.isChosenName() ? Optional.of(content.lemmaOrSurface(word)) : content.lemmaOf(word);
    }

    /** What one phrase in this position is worth, whatever it turns out to be about. */
    public double formWorth(final NameForm form) {
        if (form.isProse()) {
            return weights.prose();
        }
        return form == NameForm.IMPORT ? weights.dependency() : weights.declaredName();
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
