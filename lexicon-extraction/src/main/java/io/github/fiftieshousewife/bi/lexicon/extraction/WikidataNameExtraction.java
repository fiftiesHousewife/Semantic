package io.github.fiftieshousewife.bi.lexicon.extraction;

import io.github.fiftieshousewife.bi.lexicon.Scripts;

import java.io.IOException;
import java.lang.Character.UnicodeScript;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Extracts the Wikidata name-token TSV: every given-name and family-name item borne by enough
 * subjects, written as each of the registry's labels for it, with the token's dominant Unicode
 * script and the item's bearer count as prominence. The registry's labels carry a name in its
 * native script and its transliterations alike — one given-name item writes Alexander, Александр
 * and 亚历山大 — which is what makes the file usable where capitalisation and whitespace cannot
 * speak. The whole dataset is CC0, so the derived file carries no share-alike obligation.
 */
public final class WikidataNameExtraction {

    private static final int BEARER_FLOOR = 5;
    private static final int BATCH = 10_000;

    private final SparqlEndpoint endpoint;

    WikidataNameExtraction(final SparqlEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    public static void main(final String[] args) throws IOException, InterruptedException {
        new WikidataNameExtraction(new QleverWikidata()).extractTo(Path.of(args[0]));
    }

    void extractTo(final Path tsv) throws IOException, InterruptedException {
        final Map<String, Long> givenBearers = bearersByItem("P735");
        final Map<String, Long> familyBearers = bearersByItem("P734");
        final Map<String, List<String>> labels = labelsOf(itemsOf(givenBearers, familyBearers));
        final Map<String, Long> bearersByRow = new TreeMap<>();
        index(givenBearers, "given", labels, bearersByRow);
        index(familyBearers, "family", labels, bearersByRow);
        Files.writeString(tsv, header() + render(bearersByRow) + "\n", StandardCharsets.UTF_8);
        System.out.println("Wrote " + bearersByRow.size() + " name tokens to " + tsv);
        System.out.println(perScriptSummary(bearersByRow));
    }

    private Map<String, Long> bearersByItem(final String nameProperty)
            throws IOException, InterruptedException {
        final String query = QleverWikidata.prefixed(
                "SELECT ?name (COUNT(?person) AS ?bearers) WHERE {",
                "?person wdt:" + nameProperty + " ?name .",
                "} GROUP BY ?name");
        final Map<String, Long> bearers = new HashMap<>();
        endpoint.rows(query).stream()
                .filter(row -> bearersOf(row) >= BEARER_FLOOR)
                .forEach(row -> bearers.put(QleverWikidata.entityIdOf(row[0]), bearersOf(row)));
        return bearers;
    }

    private Map<String, List<String>> labelsOf(final List<String> items)
            throws IOException, InterruptedException {
        final Map<String, List<String>> labels = new HashMap<>();
        for (final List<String> batch : batches(items)) {
            final String query = QleverWikidata.prefixed(
                    "SELECT ?item ?label WHERE {",
                    "VALUES ?item { " + QleverWikidata.valuesClause(batch) + " }",
                    "?item rdfs:label ?label .",
                    "}");
            endpoint.rows(query).forEach(row -> labels
                    .computeIfAbsent(QleverWikidata.entityIdOf(row[0]), item -> new ArrayList<>())
                    .add(QleverWikidata.literalOf(row[1])));
        }
        return labels;
    }

    private static void index(final Map<String, Long> bearersByItem, final String kind,
                              final Map<String, List<String>> labels,
                              final Map<String, Long> bearersByRow) {
        bearersByItem.forEach((item, bearers) ->
                labels.getOrDefault(item, List.of()).stream()
                        .map(String::trim)
                        .filter(WikidataNameExtraction::isToken)
                        .forEach(token -> bearersByRow.merge(
                                token + "\t" + Scripts.dominantOf(token) + "\t" + kind,
                                bearers, Long::max)));
    }

    private static boolean isToken(final String label) {
        return !label.contains("(") && !label.contains("\t")
                && Scripts.dominantOf(label) != UnicodeScript.COMMON;
    }

    private static String render(final Map<String, Long> bearersByRow) {
        return bearersByRow.entrySet().stream()
                .map(entry -> entry.getKey() + "\t" + entry.getValue())
                .collect(Collectors.joining("\n"));
    }

    private static String perScriptSummary(final Map<String, Long> bearersByRow) {
        final Map<String, Long> tokensByScript = bearersByRow.keySet().stream()
                .collect(Collectors.groupingBy(row -> row.split("\t", -1)[1],
                        TreeMap::new, Collectors.counting()));
        return "Tokens per script: " + tokensByScript;
    }

    private static List<String> itemsOf(final Map<String, Long> givenBearers,
                                        final Map<String, Long> familyBearers) {
        final TreeSet<String> items = new TreeSet<>(givenBearers.keySet());
        items.addAll(familyBearers.keySet());
        return List.copyOf(items);
    }

    private static List<List<String>> batches(final List<String> items) {
        final List<List<String>> batches = new ArrayList<>();
        for (int start = 0; start < items.size(); start += BATCH) {
            batches.add(items.subList(start, Math.min(start + BATCH, items.size())));
        }
        return batches;
    }

    private static long bearersOf(final String[] row) {
        return Long.parseLong(QleverWikidata.literalOf(row[1]));
    }

    private static String header() {
        return """
                # Name tokens from the Wikidata entity registry: every given-name and family-name item
                # borne by at least five subjects, written as each of the registry's labels for it, with
                # the token's dominant Unicode script and the item's bearer count as prominence. A row
                # says the registry records people bearing the token as a name part — 王 is a family name
                # written in Han script; Alexander, Александр and 亚历山大 are one given name written
                # three ways. Whether a sampled value is made of such tokens is the caller's question,
                # answered by votes this file does not cast.
                #
                # Source: Wikidata, items referenced as a person's given name (P735) or family name
                #   (P734) by at least five subjects, under every rdfs:label in every language; the
                #   script is the majority Unicode script of the token's letters. Queried via the
                #   QLever SPARQL endpoint (https://qlever.dev/api/wikidata).
                # Licence: CC0 1.0 (https://creativecommons.org/publicdomain/zero/1.0/).
                # Regenerate: ./gradlew :lexicon-extraction:extractWikidataNames
                #
                # token\tscript\tkind\tbearers
                """;
    }
}
