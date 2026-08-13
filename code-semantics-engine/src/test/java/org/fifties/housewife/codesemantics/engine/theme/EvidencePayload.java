package org.fifties.housewife.codesemantics.engine.theme;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The evidence the page's own script reads when a theme is selected: the words that carried each theme,
 * what each is worth, where each was written, and the words two themes share.
 *
 * <p>It is the reading's export narrowed to what the panel draws, and narrowed in one further way that
 * matters: a site the page cannot resolve travels without its url. An editor link is a path on the machine
 * that read the tree, and a page that carries one publishes that machine's layout to everyone it reaches.
 */
final class EvidencePayload {

    private static final int WORDS_NAMED = 5;

    private final ObjectMapper json = new ObjectMapper();

    String of(final List<ThemeGraph.Node> nodes, final List<ThemeGraph.Edge> edges) {
        try {
            return json.writeValueAsString(Map.of("nodes", byTopic(nodes), "edges", shared(edges)));
        } catch (final JsonProcessingException e) {
            throw new IllegalStateException("The theme graph could not be written for its own viewer", e);
        }
    }

    private static Map<String, Object> byTopic(final List<ThemeGraph.Node> nodes) {
        final Map<String, Object> published = new LinkedHashMap<>();
        nodes.forEach(node -> published.put(node.topic(), node(node)));
        return published;
    }

    /**
     * A theme with the three figures the view places it by, beside the ones the panel reads. None is
     * computed here: each is what the reading reported, and the table under the picture prints the same.
     */
    private static Map<String, Object> node(final ThemeGraph.Node node) {
        return Map.of("intensity", node.intensity(), "lineShare", node.lineShare(),
                "nameShare", node.nameShare(), "wordsBehind", node.wordsBehind(), "files", node.files(),
                "leads", node.leads(), "linesLed", node.linesLed(),
                "carriedBy", node.carriedBy().stream().map(EvidencePayload::witness).toList());
    }

    private static Map<String, Object> witness(final ThemeGraph.Witness witness) {
        return Map.of("word", witness.word(), "occurrences", witness.occurrences(),
                "mass", witness.mass(), "sources", witness.sources(),
                "quotations", witness.quotations().stream().map(EvidencePayload::quoted).toList());
    }

    private static Map<String, Object> quoted(final ThemeGraph.Quotation quotation) {
        return Map.of("phrase", quotation.phrase(), "site", EvidenceSite.published(quotation.site()));
    }

    private static List<Map<String, Object>> shared(final List<ThemeGraph.Edge> edges) {
        return edges.stream()
                .map(edge -> Map.<String, Object>of("from", edge.from(), "to", edge.to(),
                        "occurrences", edge.occurrences(),
                        "words", edge.words().stream().limit(WORDS_NAMED).toList()))
                .toList();
    }
}
