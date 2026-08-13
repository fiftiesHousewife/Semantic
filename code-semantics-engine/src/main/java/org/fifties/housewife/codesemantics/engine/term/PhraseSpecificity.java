package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;

import org.fifties.housewife.codesemantics.engine.theme.WordSpecificity;

/**
 * How much a <em>run</em> of words narrows a subject, and the reason a matched term is weighed at all.
 *
 * <p>Matching a published taxonomy against code was measured before any of it was written, and the measurement
 * settled the design: 3,837 finance-ontology labels matched a repository with no finance in it 1,789 times on
 * one-word terms and three times on terms of two words or more. {@code name}, {@code share} and {@code value}
 * are class labels in that ontology and everyday words everywhere else. So the single-word match is the noise
 * and the multi-word match is the signal — and neither fact may be written down as a rule, because a list of
 * terms to ignore is exactly what the doctrine forbids. The weight comes from a resource instead.
 *
 * <p>The resource is the bundled frequency list, read through {@link WordSpecificity} one word at a time.
 * What that gives per word is a commonness, {@code 1 - s}: the share of the list's own range the word sits
 * below. Commonness multiplies across a run, because a frequency list states one word at a time and says
 * nothing about which words follow which — so a run is ordinary exactly to the extent that <em>every</em>
 * word in it is ordinary, and its specificity is the complement of that product.
 *
 * <p>Three properties follow from the definition rather than from a constant anyone chose. It is bounded in
 * {@code [0, 1]} because each factor is. It equals {@link WordSpecificity} exactly for a one-word term, which
 * is what makes this its n-gram sibling rather than a second opinion. And it rises with every word added, so
 * {@code interest rate swap} weighs near the ceiling where {@code name} weighs about half of it, without any
 * term having been excluded.
 *
 * <p>Summing the words' surprisals instead — the other reading of "the surprisal of an n-gram" — was rejected:
 * it needs truncating at a ceiling to stay bounded, and it reaches that ceiling on any two content words at
 * all, so every term of two words or more would weigh the same.
 */
public final class PhraseSpecificity {

    private final WordSpecificity words;

    public PhraseSpecificity(final WordSpecificity words) {
        this.words = words;
    }

    public static PhraseSpecificity fromClasspath() {
        return new PhraseSpecificity(WordSpecificity.fromClasspath());
    }

    /** What this run of words is worth, in {@code [0, 1]}. A run of no words is worth nothing. */
    public double of(final List<String> phrase) {
        return 1.0 - phrase.stream()
                .mapToDouble(word -> 1.0 - words.of(word))
                .reduce(1.0, (ordinary, next) -> ordinary * next);
    }
}
