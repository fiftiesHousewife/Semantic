package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.theme.WordSpecificity;

/**
 * How much a <em>run</em> of words narrows a subject, and the reason a matched term is weighed at all.
 *
 * <p>Out of domain, a taxonomy matches a repository almost entirely on one-word terms — {@code name},
 * {@code share} and {@code value} are class labels in a finance ontology and everyday words everywhere
 * else. The single-word match is the noise and the multi-word match the signal, and neither fact may be
 * written down as a rule: a list of terms to ignore is what the doctrine forbids, so the weight comes from
 * a resource.
 *
 * <p>The resource is the bundled frequency list, read through {@link WordSpecificity} one word at a time.
 * Each word yields a commonness, {@code 1 - s}: the share of the list's own range the word sits below.
 * Commonness multiplies across a run, because a frequency list states one word at a time and says nothing
 * about which words follow which — a run is ordinary exactly to the extent that <em>every</em> word in it
 * is, and its specificity is the complement of that product.
 *
 * <p>Three properties follow from the definition rather than from a chosen constant. It is bounded in
 * {@code [0, 1]} because each factor is. It equals {@link WordSpecificity} exactly for a one-word term.
 * And it rises with every word added. Summing the words' surprisals instead needs truncating at a ceiling
 * to stay bounded, and reaches that ceiling on any two content words, so every longer term would weigh the
 * same.
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
