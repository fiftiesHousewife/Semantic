package org.fifties.housewife.codesemantics.engine.term;

import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

/**
 * What a concept's writing is worth: how often the repository wrote it, weighed by how much the label
 * narrows a subject.
 *
 * <p>Apache Tika writes {@code id} 778 times and {@code extensible markup language} not at all, reaching that
 * concept through {@code xml}. Counted as spans the first is the larger part of the repository, and it is one
 * of the commonest words a program writes. The weight is {@link PhraseSpecificity}'s, read from the bundled
 * frequency list, so which words are ordinary is a resource's answer and not one given here.
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
