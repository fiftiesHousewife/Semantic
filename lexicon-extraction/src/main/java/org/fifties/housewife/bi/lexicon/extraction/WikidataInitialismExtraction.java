package org.fifties.housewife.bi.lexicon.extraction;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Extracts the Wikidata initialism TSV: every all-capitals alias or short name of two to four
 * letters, with the English label of the entity carrying it and the entity's sitelink count as
 * prominence. Scholarly articles and clinical trials are excluded — their registered acronyms are
 * study shorthand, not readings a schema means. The whole dataset is CC0, so the derived file
 * carries no share-alike obligation.
 */
public final class WikidataInitialismExtraction {

    private static final String CAPITALS = "^[A-Z]{2,4}$";
    private static final List<String> EXCLUDED_CLASSES = List.of("Q13442814", "Q30612");
    private static final int BATCH = 10_000;

    private final SparqlEndpoint endpoint;

    WikidataInitialismExtraction(final SparqlEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    public static void main(final String[] args) throws IOException, InterruptedException {
        new WikidataInitialismExtraction(new QleverWikidata()).extractTo(Path.of(args[0]));
    }

    void extractTo(final Path tsv) throws IOException, InterruptedException {
        final Map<String, Set<String>> tokensByItem = tokensByItem();
        final List<String> items = List.copyOf(tokensByItem.keySet());
        final Set<String> excluded = excludedItems(items);
        final Map<String, String[]> labelAndLinks = labels(items);
        final Map<String, String> rows = new TreeMap<>();
        tokensByItem.forEach((item, tokens) -> {
            final String[] meta = labelAndLinks.get(item);
            if (meta == null || excluded.contains(item)) {
                return;
            }
            tokens.forEach(token -> rows.merge(token + "\t" + meta[0].toLowerCase(Locale.ROOT),
                    token + "\t" + meta[0] + "\t" + meta[1],
                    (kept, offered) -> linksOf(offered) > linksOf(kept) ? offered : kept));
        });
        Files.writeString(tsv, header() + String.join("\n", rows.values()) + "\n", StandardCharsets.UTF_8);
        System.out.println("Wrote " + rows.size() + " readings to " + tsv);
    }

    private Map<String, Set<String>> tokensByItem() throws IOException, InterruptedException {
        final Map<String, Set<String>> tokens = new HashMap<>();
        for (final String pattern : List.of(
                "?item skos:altLabel ?name . FILTER(LANG(?name) = \"en\")",
                "?item skos:altLabel ?name . FILTER(LANG(?name) = \"mul\")",
                "?item wdt:P1813 ?name . FILTER(LANG(?name) = \"en\" || LANG(?name) = \"mul\")")) {
            final String query = QleverWikidata.prefixed(
                    "SELECT ?item ?name WHERE {",
                    pattern,
                    "FILTER(REGEX(STR(?name), \"" + CAPITALS + "\"))",
                    "}");
            endpoint.rows(query).forEach(row -> tokens
                    .computeIfAbsent(QleverWikidata.entityIdOf(row[0]), item -> new HashSet<>())
                    .add(QleverWikidata.literalOf(row[1])));
        }
        return tokens;
    }

    private Set<String> excludedItems(final List<String> items) throws IOException, InterruptedException {
        final Set<String> excluded = new HashSet<>();
        for (final List<String> batch : batches(items)) {
            final String query = QleverWikidata.prefixed(
                    "SELECT DISTINCT ?item WHERE {",
                    "VALUES ?item { " + QleverWikidata.valuesClause(batch) + " }",
                    "VALUES ?class { " + QleverWikidata.valuesClause(EXCLUDED_CLASSES) + " }",
                    "?item wdt:P31 ?class .",
                    "}");
            endpoint.rows(query).forEach(row -> excluded.add(QleverWikidata.entityIdOf(row[0])));
        }
        return excluded;
    }

    private Map<String, String[]> labels(final List<String> items) throws IOException, InterruptedException {
        final Map<String, String[]> labels = new HashMap<>();
        for (final List<String> batch : batches(items)) {
            final String query = QleverWikidata.prefixed(
                    "SELECT ?item ?label ?links WHERE {",
                    "VALUES ?item { " + QleverWikidata.valuesClause(batch) + " }",
                    "?item rdfs:label ?label . FILTER(LANG(?label) = \"en\")",
                    "OPTIONAL { ?item wikibase:sitelinks ?links }",
                    "}");
            endpoint.rows(query).forEach(row -> labels.put(QleverWikidata.entityIdOf(row[0]),
                    new String[] {QleverWikidata.literalOf(row[1]), sitelinksOf(row[2])}));
        }
        return labels;
    }

    private static List<List<String>> batches(final List<String> items) {
        final List<List<String>> batches = new ArrayList<>();
        for (int start = 0; start < items.size(); start += BATCH) {
            batches.add(items.subList(start, Math.min(start + BATCH, items.size())));
        }
        return batches;
    }

    private static String sitelinksOf(final String field) {
        return field.isBlank() ? "0" : field;
    }

    private static int linksOf(final String row) {
        return Integer.parseInt(row.substring(row.lastIndexOf('\t') + 1));
    }

    private static String header() {
        return """
                # Initialism readings from the Wikidata entity registry: a capitals-written token, the English
                # label of an item that records the token as its short name or alias, and the item's sitelink
                # count as its prominence. A row says the registry knows readers write the token for the entity —
                # whether the schema at hand means that entity is the caller's question, answered by votes this
                # file does not cast.
                #
                # Source: Wikidata (CC0 1.0, https://creativecommons.org/publicdomain/zero/1.0/), English and
                #   multilingual aliases (skos:altLabel) and short names (P1813) written entirely in capitals,
                #   two to four letters, on items with an English label; items that are scholarly articles
                #   (Q13442814) or clinical trials (Q30612) are excluded as registry noise. Queried via the
                #   QLever SPARQL endpoint (https://qlever.dev/api/wikidata).
                # Regenerate: ./gradlew :lexicon-extraction:extractWikidataInitialisms
                #
                # token\tlabel\tsitelinks
                """;
    }
}
