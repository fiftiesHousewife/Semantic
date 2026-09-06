package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * A one-term vocabulary registered through {@code META-INF/services} ahead of the one it sorts behind, so
 * the discovered order is shown to be the sources' names and not the registration file's.
 */
public final class ZebraFixtureTerms implements TermIndex {

    private static final List<String> STRIPE_PATTERN = List.of("stripe", "pattern");

    private static final SkosConcept STRIPES =
            new SkosConcept("stripe pattern", "StripePattern", "", "", "terms", "", "", "");

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return words.equals(STRIPE_PATTERN) ? List.of(STRIPES) : List.of();
    }

    @Override
    public Set<List<String>> terms() {
        return Set.of(STRIPE_PATTERN);
    }

    @Override
    public int longestTerm() {
        return STRIPE_PATTERN.size();
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return Optional.empty();
    }

    @Override
    public String source() {
        return "Zebra fixture";
    }

    @Override
    public MatchNormalisation normalisation() {
        return MatchNormalisation.WORDS;
    }
}
