package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The reported topics grouped under the broad subject the topic resource states each one below, in the order
 * the reading produced them.
 *
 * <p>It is what the bar colours by, so two topics the resource places under one branch are drawn in one
 * colour. Wiktionary states {@code sciences} above both {@code linguistics} and {@code grammar}, and
 * {@code natural-sciences} above {@code computing}, so the first two share a colour and the third does not.
 */
final class TopicBranches {

    private TopicBranches() {
    }

    static Map<String, List<ThemeGraph.Node>> of(final List<ThemeGraph.Node> nodes) {
        final Map<String, List<ThemeGraph.Node>> grouped = new LinkedHashMap<>();
        nodes.forEach(node -> grouped.computeIfAbsent(node.broader(), branch -> new ArrayList<>()).add(node));
        return grouped;
    }
}
