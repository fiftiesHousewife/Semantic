package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * The terms of the NIST CSRC glossary, read from the JSON export the glossary itself publishes. A term's
 * concept is the glossary's own permalink for it; its other labels are the abbreviations and synonyms the
 * glossary states beside it; its definitions are the glossary's own, each cited there to the NIST
 * publication that wrote it. The glossary states no hierarchy, so {@code broader} is blank on every row —
 * a blank that is the publisher's statement, not a gap.
 *
 * <p>The export writes some of its text as HTML — emphasis tags, non-breaking spaces — and what is carried
 * is the text that HTML renders as. A statement carrying this file shape's statement separator cannot be
 * written into the shape and is set aside rather than rewritten; the read reports each one set aside, and
 * the TSV header counts them.
 */
public final class CsrcConcepts {

    /** One reading of the export: the concepts, and the statements the file shape cannot carry. */
    public record Read(List<SkosConcept> concepts, List<String> statementsSetAside) {
    }

    private static final String TERM = "term";

    private static final Pattern TAG = Pattern.compile("<[^>]+>");

    private static final Pattern WHITESPACE = Pattern.compile("\\s+");

    private final ObjectMapper mapper = new ObjectMapper();

    private final JoinedStatements statements = new JoinedStatements();

    public Read in(final byte[] export) {
        final List<String> setAside = new ArrayList<>();
        final List<SkosConcept> concepts = nodes(parsed(export).path("parentTerms"))
                .map(entry -> conceptOf(entry, setAside))
                .toList();
        return new Read(concepts, List.copyOf(setAside));
    }

    private SkosConcept conceptOf(final JsonNode entry, final List<String> setAside) {
        return new SkosConcept(entry.path("link").asText(),
                written(entry.path("term").asText()),
                carried(textsOf(entry.path("abbrSyn")), setAside),
                "", TERM, "",
                carried(definitionsOf(entry), setAside),
                carried(notesOf(entry), setAside));
    }

    /** The statements the row can carry; one holding the separator itself is set aside, not rewritten. */
    private String carried(final List<String> stated, final List<String> setAside) {
        setAside.addAll(stated.stream()
                .filter(statement -> statement.contains(SkosConcept.STATEMENTS))
                .toList());
        return statements.of(stated.stream()
                .filter(statement -> !statement.contains(SkosConcept.STATEMENTS))
                .toList());
    }

    private static List<String> definitionsOf(final JsonNode entry) {
        return nodes(entry.path("definitions"))
                .map(definition -> written(definition.path("text").asText()))
                .toList();
    }

    /** The glossary's own note on the term, then the terms its see-also statements point at. */
    private static List<String> notesOf(final JsonNode entry) {
        return Stream.concat(
                        Stream.of(written(entry.path("note").asText())),
                        textsOf(entry.path("seeAlso")).stream())
                .filter(note -> !note.isEmpty())
                .toList();
    }

    private static List<String> textsOf(final JsonNode listed) {
        return nodes(listed)
                .map(node -> written(node.path("text").asText()))
                .toList();
    }

    /** The text the export's HTML renders as: tags removed, its two entities decoded, spacing collapsed. */
    private static String written(final String html) {
        final String untagged = TAG.matcher(html).replaceAll(" ");
        final String decoded = untagged.replace("&nbsp;", " ").replace("&amp;", "&");
        return WHITESPACE.matcher(decoded).replaceAll(" ").strip();
    }

    private JsonNode parsed(final byte[] export) {
        try {
            return mapper.readTree(export);
        } catch (final IOException e) {
            throw new UncheckedIOException("Not the glossary export's JSON", e);
        }
    }

    private static Stream<JsonNode> nodes(final JsonNode array) {
        return StreamSupport.stream(array.spliterator(), false);
    }
}
