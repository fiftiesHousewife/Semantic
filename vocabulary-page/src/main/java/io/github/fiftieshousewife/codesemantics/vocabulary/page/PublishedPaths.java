package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The path a publisher states above each of its concepts, root first: the first {@code broader} at each
 * level, and over the chain's top the levels a publisher states as names rather than rows — BIAN's
 * business domain and its {@code module} the business area.
 *
 * <p>A path of one is the common case and is not a failure: a concept the publisher states no parent for
 * stands at its own root, and inventing one would be this library stating a taxonomy the publisher did
 * not.
 */
final class PublishedPaths {

    private final Map<String, SkosConcept> byLabel;
    private final List<SkosConcept> published;
    private Set<String> fieldLevels;

    PublishedPaths(final List<SkosConcept> published) {
        final Map<String, SkosConcept> index = new HashMap<>();
        published.forEach(concept -> index.putIfAbsent(lowered(concept.prefLabel()), concept));
        this.byLabel = Map.copyOf(index);
        this.published = List.copyOf(published);
    }

    /**
     * The levels holding an outright majority of the published concepts beneath them — the scheme's own
     * name for its field, which nearly every member shares and which therefore distinguishes nothing. The
     * bound is a majority because that is where one level outweighs everything outside it.
     */
    Set<String> fieldLevels() {
        if (fieldLevels == null) {
            final Map<String, Integer> beneath = new HashMap<>();
            published.forEach(concept -> pathOf(concept.prefLabel()).stream()
                    .filter(level -> !level.equals(concept.prefLabel()))
                    .forEach(level -> beneath.merge(level, 1, Integer::sum)));
            fieldLevels = beneath.entrySet().stream()
                    .filter(level -> 2 * level.getValue() > published.size())
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toUnmodifiableSet());
        }
        return fieldLevels;
    }

    /** Root first: the resolvable {@code broader} chain, then the name-only levels above its top. */
    List<String> pathOf(final String label) {
        final List<String> leafFirst = new ArrayList<>();
        final Set<String> seen = new HashSet<>();
        Optional<String> next = Optional.of(label);
        while (next.isPresent() && seen.add(lowered(next.get()))) {
            leafFirst.add(next.get());
            next = parentOf(next.get());
        }
        final List<String> path = new ArrayList<>(namedLevelsAbove(leafFirst.getLast()).reversed());
        path.addAll(leafFirst.reversed());
        return List.copyOf(path);
    }

    /** The broadest level the publisher states above the concept — the concept itself where it states none. */
    String rootOf(final String label) {
        return pathOf(label).getFirst();
    }

    /** The first stated parent that is itself a published row, or nothing where the chain ends. */
    Optional<String> parentOf(final String label) {
        return concept(label)
                .flatMap(stated -> stated.broaderConcepts().stream().findFirst())
                .filter(parent -> byLabel.containsKey(lowered(parent)));
    }

    /**
     * The levels the publisher states as names over the chain's top, nearest level first: the first
     * unresolvable {@code broader} where one is stated, then the {@code module} — BIAN's business area,
     * FIBO's domain, FpML's schema file group — which also stands alone over a top with no stated
     * parent, so a flat schema's types group under the one level their publisher does state.
     */
    private List<String> namedLevelsAbove(final String top) {
        return concept(top)
                .map(stated -> {
                    final List<String> levels = new ArrayList<>();
                    stated.broaderConcepts().stream().findFirst()
                            .filter(parent -> !byLabel.containsKey(lowered(parent)))
                            .ifPresent(levels::add);
                    final boolean topsOut = !levels.isEmpty() || stated.broaderConcepts().isEmpty();
                    if (topsOut && !stated.module().isBlank()) {
                        levels.add(stated.module());
                    }
                    return levels;
                })
                .orElse(List.of());
    }

    private Optional<SkosConcept> concept(final String label) {
        return Optional.of(lowered(label)).filter(byLabel::containsKey).map(byLabel::get);
    }

    private static String lowered(final String label) {
        return label.toLowerCase(Locale.ROOT);
    }
}
