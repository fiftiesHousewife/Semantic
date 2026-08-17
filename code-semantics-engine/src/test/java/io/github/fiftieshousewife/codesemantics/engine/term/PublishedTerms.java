package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

final class PublishedTerms implements TermIndex {

    private final String source;
    private final Map<List<String>, List<SkosConcept>> byWords;
    private final Map<String, String> broaderByLabel = new HashMap<>();

    private PublishedTerms(final String source, final Map<List<String>, List<SkosConcept>> byWords) {
        this.source = source;
        this.byWords = Map.copyOf(byWords);
    }

    PublishedTerms stating(final String term, final String beneath) {
        broaderByLabel.put(term, beneath);
        return this;
    }

    static PublishedTerms publishing(final String source, final String... terms) {
        final Map<List<String>, List<SkosConcept>> byWords = new HashMap<>();
        IntStream.range(0, terms.length).forEach(module ->
                byWords.computeIfAbsent(List.of(terms[module].split(" ")), key -> new ArrayList<>())
                        .add(new SkosConcept(source + module + "#" + terms[module], terms[module],
                                "", "", "class", source + module, "", "")));
        return new PublishedTerms(source, byWords);
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return byWords.getOrDefault(words, List.of());
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return Optional.ofNullable(broaderByLabel.get(prefLabel));
    }

    @Override
    public Set<List<String>> terms() {
        return byWords.keySet();
    }

    @Override
    public int longestTerm() {
        return byWords.keySet().stream().mapToInt(List::size).max().orElse(0);
    }

    @Override
    public String source() {
        return source;
    }

    @Override
    public TermRung rung() {
        return TermRung.WORDS;
    }
}
