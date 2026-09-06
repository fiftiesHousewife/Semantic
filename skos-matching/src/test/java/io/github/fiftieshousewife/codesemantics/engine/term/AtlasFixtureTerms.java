package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/** A one-term vocabulary registered through {@code META-INF/services}, so discovery has something to find. */
public final class AtlasFixtureTerms implements TermIndex {

    private static final List<String> MAP_PROJECTION = List.of("map", "projection");

    private static final SkosConcept PROJECTION =
            new SkosConcept("map projection", "MapProjection", "", "", "terms", "", "", "");

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return words.equals(MAP_PROJECTION) ? List.of(PROJECTION) : List.of();
    }

    @Override
    public Set<List<String>> terms() {
        return Set.of(MAP_PROJECTION);
    }

    @Override
    public int longestTerm() {
        return MAP_PROJECTION.size();
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return Optional.empty();
    }

    @Override
    public String source() {
        return "Atlas fixture";
    }

    @Override
    public MatchNormalisation normalisation() {
        return MatchNormalisation.WORDS;
    }
}
