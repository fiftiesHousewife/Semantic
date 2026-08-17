package io.github.fiftieshousewife.codesemantics.engine.term;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * What a concept's writing is worth: how often the repository wrote it, weighed by how much the label
 * narrows a subject.
 *
 * <p>Counted as bare spans, the commonest words a program writes are the larger part of any repository.
 * The weight is {@link PhraseSpecificity}'s, read from the bundled frequency list, so which words are
 * ordinary is a resource's answer and not one given here.
 */
public final class WrittenMass {

    private final PhraseSpecificity specificity;

    private final IdentifierWords words;

    public WrittenMass(final PhraseSpecificity specificity, final IdentifierWords words) {
        this.specificity = specificity;
        this.words = words;
    }

    public static WrittenMass fromClasspath() {
        return new WrittenMass(PhraseSpecificity.fromClasspath(), IdentifierWords.fromClasspath());
    }

    /** What the repository's writing of one concept is worth, in spans weighed by the label's specificity. */
    public double of(final String label, final int occurrences) {
        return occurrences * specificity.of(words.of(label).words());
    }
}
