package io.github.fiftieshousewife.bi.lexicon.extraction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/**
 * Reads the fetched Wikipedia summaries of CSO's linked topics into the bundled TSV.
 *
 * <p>It reads a file rather than the network, like every extraction here: the fetch is one request per
 * article and the tasks that run these have no route out. {@code -Pcso-abstracts=<path to the JSONL>}, one
 * object per line with {@code concept}, {@code dbpedia}, {@code revision} and {@code extract}.
 *
 * <p>Rows are written in the order of CSO's own topic identifiers, so two runs over the same fetch produce
 * the same bytes.
 */
public final class CsoAbstractsExtraction {

    private static final String CONCEPT = "\"concept\"";

    private static final ObjectMapper JSON = new ObjectMapper();

    private final CsoAbstractsTsv tsv = new CsoAbstractsTsv();

    public static void main(final String[] args) throws IOException {
        if (args.length < 3) {
            throw new IllegalArgumentException(
                    "Usage: CsoAbstractsExtraction <summaries.jsonl> <tsv> <retrieved>");
        }
        new CsoAbstractsExtraction().extract(Path.of(args[0]), Path.of(args[1]), args[2]);
    }

    public void extract(final Path summaries, final Path output, final String retrieved)
            throws IOException {
        final List<CsoAbstractsTsv.Summary> read = Files.readAllLines(summaries, StandardCharsets.UTF_8)
                .stream()
                .filter(line -> line.contains(CONCEPT))
                .map(CsoAbstractsExtraction::summary)
                .sorted(Comparator.comparing(CsoAbstractsTsv.Summary::concept))
                .toList();
        if (read.isEmpty()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "%s states no summary, so there is nothing to bundle",
                    summaries));
        }
        Files.createDirectories(output.toAbsolutePath().getParent());
        Files.writeString(output, tsv.render(read, retrieved));
    }

    /**
     * One fetched object. The four fields are read by name from a flat object of string values, which is
     * what the fetch writes; a line stating none of them fails rather than being guessed at.
     */
    static CsoAbstractsTsv.Summary summary(final String line) {
        try {
            final JsonNode read = JSON.readTree(line);
            return new CsoAbstractsTsv.Summary(stated(read, "concept"), stated(read, "dbpedia"),
                    stated(read, "revision"), stated(read, "extract"));
        } catch (final JsonProcessingException e) {
            throw new IllegalArgumentException("Not one fetched summary per line: " + line, e);
        }
    }

    private static String stated(final JsonNode read, final String field) {
        final JsonNode value = read.get(field);
        if (value == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "The fetched line states no %s: %s",
                    field, read));
        }
        return value.asText();
    }
}
