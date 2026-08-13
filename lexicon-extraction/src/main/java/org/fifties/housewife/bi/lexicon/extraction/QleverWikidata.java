package org.fifties.housewife.bi.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The QLever SPARQL endpoint over the Wikidata graph. QLever rather than the Wikidata Query Service
 * because the class of query the extraction runs — a regular expression over every alias in the
 * graph — exceeds the query service's timeout, where QLever answers it in seconds. One quirk is
 * load-bearing: QLever's FILTER does not match IRI equality, so entity classes are matched with a
 * VALUES clause, never a FILTER.
 */
final class QleverWikidata implements SparqlEndpoint {

    private static final URI ENDPOINT = URI.create("https://qlever.dev/api/wikidata");
    private static final int ATTEMPTS = 3;

    private final HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(30))
            .build();

    @Override
    public List<String[]> rows(final String query) throws IOException, InterruptedException {
        final HttpRequest request = HttpRequest.newBuilder(ENDPOINT)
                .timeout(Duration.ofMinutes(3))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .header("Accept", "text/tab-separated-values")
                .POST(HttpRequest.BodyPublishers.ofString(
                        "query=" + URLEncoder.encode(query, StandardCharsets.UTF_8)))
                .build();
        IOException failure = new IOException("QLever request never attempted");
        for (int attempt = 0; attempt < ATTEMPTS; attempt++) {
            final HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            final List<String> lines = response.body().lines().toList();
            if (response.statusCode() == 200 && !lines.isEmpty() && lines.getFirst().startsWith("?")) {
                return lines.stream().skip(1).map(line -> line.split("\t", -1)).toList();
            }
            failure = new IOException("QLever refused the query (HTTP " + response.statusCode() + "): "
                    + response.body().substring(0, Math.min(200, response.body().length())));
        }
        throw failure;
    }

    static String entityIdOf(final String iri) {
        return iri.substring(iri.lastIndexOf('/') + 1).replace(">", "");
    }

    static String literalOf(final String field) {
        return field.startsWith("\"") ? field.substring(1, field.lastIndexOf('"')) : field;
    }

    static String valuesClause(final List<String> entityIds) {
        return entityIds.stream().map(id -> "wd:" + id).collect(Collectors.joining(" "));
    }

    private static final List<String> PREFIXES = List.of(
            "PREFIX wd: <http://www.wikidata.org/entity/>",
            "PREFIX wdt: <http://www.wikidata.org/prop/direct/>",
            "PREFIX skos: <http://www.w3.org/2004/02/skos/core#>",
            "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>",
            "PREFIX wikibase: <http://wikiba.se/ontology#>");

    static String prefixed(final String... bodyLines) {
        return String.join("\n", PREFIXES) + "\n"
                + Arrays.stream(bodyLines).reduce("", (all, line) -> all + line + "\n");
    }
}
