package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.term.PhraseSpecificity;

/**
 * What a subject scheme's published keywords narrow, read through the same grammar a declared name is.
 *
 * <p>{@link PhraseSpecificity} weighs a run the repository wrote. This weighs a run the <em>publisher</em>
 * wrote, matched or not, which is what a share of a topic's keywords has to be taken over. Both sides go
 * through {@link IdentifierWords}, so a keyword the repository never writes is weighed exactly as it would
 * have been had it written it.
 */
public final class KeywordSpecificity {

    private final PhraseSpecificity specificity;

    private final IdentifierWords words;

    public KeywordSpecificity(final PhraseSpecificity specificity, final IdentifierWords words) {
        this.specificity = specificity;
        this.words = words;
    }

    public static KeywordSpecificity fromClasspath() {
        return new KeywordSpecificity(PhraseSpecificity.fromClasspath(), IdentifierWords.fromClasspath());
    }

    /** What one published keyword narrows, in {@code [0, 1]}. */
    public double of(final SkosConcept keyword) {
        return specificity.of(words.of(keyword.prefLabel()).words());
    }

    /** What each topic's whole published set narrows, which is the denominator its stated share is taken over. */
    public Map<String, Double> byTopic(final List<SkosConcept> keywords) {
        return keywords.stream()
                .collect(Collectors.groupingBy(SkosConcept::broader, Collectors.summingDouble(this::of)));
    }
}
