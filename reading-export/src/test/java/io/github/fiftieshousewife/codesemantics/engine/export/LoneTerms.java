package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import io.github.fiftieshousewife.codesemantics.engine.term.MatchNormalisation;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * A term index of two one-word terms in two different branches, so a repository writing both without any
 * sibling has both discarded by the branch rule.
 */
final class LoneTerms implements TermIndex {

    private static final SkosConcept HYPOTAXIS = concept("Hypotaxis", "Subordination");

    private static final SkosConcept ZEUGMA = concept("Zeugma", "Figure");

    private static final Map<List<String>, List<SkosConcept>> BY_WORDS = Map.of(
            List.of("hypotaxis"), List.of(HYPOTAXIS),
            List.of("zeugma"), List.of(ZEUGMA));

    private LoneTerms() {
    }

    static LoneTerms newInstance() {
        return new LoneTerms();
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("urn:" + label, label, "", broader, "class", "fixture", "", "");
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return BY_WORDS.getOrDefault(words, List.of());
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return BY_WORDS.values().stream().flatMap(List::stream)
                .filter(one -> one.prefLabel().equalsIgnoreCase(prefLabel))
                .map(SkosConcept::broader)
                .findFirst();
    }

    @Override
    public Set<List<String>> terms() {
        return BY_WORDS.keySet();
    }

    @Override
    public int longestTerm() {
        return 1;
    }

    @Override
    public String source() {
        return "lone-terms";
    }

    @Override
    public MatchNormalisation normalisation() {
        return MatchNormalisation.WORDS;
    }
}
