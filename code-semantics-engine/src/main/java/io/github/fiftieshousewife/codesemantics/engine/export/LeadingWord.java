package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Objects;

/**
 * One word the summary names, with the score that put it there.
 *
 * <p>A name alone states an order and no magnitude, so a reader cannot tell a word carrying ten times another
 * word's evidence from the one below it.
 *
 * @param word           the word as the splitter produced it
 * @param divergenceBits its term of the Jensen-Shannon divergence against the reference scoring it lowest
 * @param occurrences    how many times the repository writes it
 */
public record LeadingWord(String word, double divergenceBits, int occurrences) {

    public LeadingWord {
        Objects.requireNonNull(word, "word");
    }

    static LeadingWord of(final ExportedSignal signal) {
        return new LeadingWord(signal.word(), signal.divergenceBits(), signal.occurrences());
    }
}
