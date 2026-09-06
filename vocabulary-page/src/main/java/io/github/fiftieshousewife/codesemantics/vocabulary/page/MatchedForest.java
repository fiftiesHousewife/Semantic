package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A growing node of the matched paths, converted to {@link TermTree.Node} — with its unmatched siblings
 * greyed in — once every path is in.
 */
final class MatchedForest {

    private final String label;
    private int occurrences;
    private final Map<String, MatchedForest> children = new LinkedHashMap<>();

    MatchedForest(final String label) {
        this.label = label;
    }

    void grew(final List<String> path, final int matched) {
        MatchedForest branch = this;
        for (final String level : path) {
            branch = branch.children.computeIfAbsent(level, MatchedForest::new);
        }
        branch.occurrences += matched;
    }

    Set<String> childLabels() {
        return Set.copyOf(children.keySet());
    }

    /** Every label drawn as a match anywhere in the forest, lowered, so none of them is also greyed. */
    Set<String> matchedLabels() {
        return children.values().stream()
                .flatMap(child -> Stream.concat(Stream.of(child.label.toLowerCase(Locale.ROOT)),
                        child.matchedLabels().stream()))
                .collect(Collectors.toUnmodifiableSet());
    }

    TermTree.Node built(final UnmatchedConcepts unmatchedConcepts) {
        final List<TermTree.Node> matched = children.values().stream()
                .map(child -> child.built(unmatchedConcepts))
                .sorted(Comparator.comparingInt(TermTree.Node::atOrBelow).reversed()
                        .thenComparing(TermTree.Node::label))
                .toList();
        final List<String> unmatched = unmatchedConcepts.childrenOf(label);
        final List<TermTree.Node> drawn = new ArrayList<>(matched);
        unmatched.stream()
                .limit(TermTree.UNMATCHED_LISTED)
                .map(child -> unmatchedConcepts.node(child, TermTree.UNMATCHED_DEPTH))
                .forEach(drawn::add);
        return new TermTree.Node(label, occurrences, TermTree.Standing.MATCHED,
                unmatchedConcepts.below(label), drawn,
                Math.max(0, unmatched.size() - TermTree.UNMATCHED_LISTED));
    }
}
