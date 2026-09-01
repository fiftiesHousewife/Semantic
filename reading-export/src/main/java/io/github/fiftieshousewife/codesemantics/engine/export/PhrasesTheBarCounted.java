package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;

/**
 * The terms of one published taxonomy that its chance bar counted: those of more than one word found at the
 * level the observed count and the deals behind it were both drawn at.
 *
 * <p>A reading publishes matches from four normalisation levels and {@link ExportedTaxonomy.Bar#phrases()}
 * counts one, so the published list is longer than the count. This is the part of the list the count covers.
 *
 * <p><b>It is bounded above by {@code bar.phrases} and can fall short of it.</b> The bar walks one level and
 * the reading walks four, longest-first, so a long run a dictionary answered consumes words a shorter
 * published phrase began in and the reading never reaches it. On the twelve committed readings that costs
 * one phrase, CSO's {@code message delivery} on fineract, hidden by {@code sms message} answering one word
 * earlier at the lemmas level. {@code CountedPhraseProbe} names the difference for a clone.
 */
public final class PhrasesTheBarCounted {

    /** The level both the observed count and the deals are drawn at, stated by the matcher rather than here. */
    private static final String DRAWN_AT = TermRung.WORDS.level();

    public Set<String> in(final ExportedTaxonomy taxonomy) {
        return taxonomy.concepts().stream()
                .filter(concept -> concept.wordsInTerm() > 1)
                .filter(concept -> DRAWN_AT.equals(concept.normalisation()))
                .map(ExportedConcept::term)
                .collect(Collectors.toUnmodifiableSet());
    }
}
