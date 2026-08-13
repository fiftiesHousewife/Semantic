package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;

import org.fifties.housewife.codesemantics.engine.theme.ContentWords;

/**
 * A run of words as the dictionary forms behind it: {@code base forms} as <em>base form</em>, {@code phrases}
 * as <em>phrase</em>.
 *
 * <p>It is the narrowest generalisation there is, and it is the one that has to be measured on its own.
 * A taxonomy publishes singulars and a program declares whatever its sentence needed, so most of what a
 * broader reading appears to buy is really this: one word and its inflections, which is not a claim about
 * meaning at all. Reporting it apart is what keeps a rung that compares senses from taking the credit for a
 * plural.
 *
 * <p>It abstains where any word of the run has no dictionary form — including a word too short for the
 * dictionary's entry to be about anything but a symbol, which is {@link ContentWords}' rule and its reason.
 */
public final class LemmaRuns implements TermNormalisation<List<String>> {

    private final ContentWords words;

    public LemmaRuns(final ContentWords words) {
        this.words = words;
    }

    public static LemmaRuns fromClasspath() {
        return new LemmaRuns(ContentWords.fromClasspath());
    }

    @Override
    public Optional<List<String>> of(final List<String> run) {
        final List<String> lemmas = run.stream()
                .map(words::lemmaOf)
                .flatMap(Optional::stream)
                .toList();
        return Optional.of(lemmas).filter(read -> !read.isEmpty() && read.size() == run.size());
    }

    @Override
    public TermRung rung() {
        return TermRung.LEMMAS;
    }
}
