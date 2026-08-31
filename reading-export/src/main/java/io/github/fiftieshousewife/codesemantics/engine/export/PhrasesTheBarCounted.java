package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.term.TermRung;

/**
 * The terms of one published taxonomy that its chance bar counted: those of more than one word found at the
 * level the observed count and the deals behind it were both drawn at.
 *
 * <p>A reading publishes matches from four normalisation levels and {@link ExportedTaxonomy.Bar#phrases()}
 * counts one, so the published list is longer than the count. This is the part of the list the count covers,
 * and its size is what {@code bar.phrases} states.
 */
public final class PhrasesTheBarCounted {

    /** The level both the observed count and the deals are drawn at, stated by the matcher rather than here. */
    private static final String DRAWN_AT = TermRung.WORDS.level();

    public Set<String> in(final ExportedTaxonomy taxonomy) {
        return taxonomy.concepts().stream()
                .filter(concept -> concept.wordsInTerm() > 1)
                .filter(concept -> DRAWN_AT.equals(concept.normalisation()))
                .map(ExportedTaxonomy.Concept::term)
                .collect(Collectors.toUnmodifiableSet());
    }
}
