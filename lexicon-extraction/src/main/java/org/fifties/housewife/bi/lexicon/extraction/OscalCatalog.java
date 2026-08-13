package org.fifties.housewife.bi.lexicon.extraction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * An OSCAL catalog document, read to the version it states and the flat list of nodes it carries.
 *
 * <p>NIST publishes its frameworks and its control catalogues in this one format, so a reader of it reads
 * all of them: the same walk serves the Cybersecurity Framework's functions and SP 800-53's control
 * families. Nesting is the document's own statement of what is broader than what, which is why the walk
 * carries the parent down instead of recovering it afterwards from the punctuation in an identifier.
 */
public final class OscalCatalog {

    private static final String CATALOG = "catalog";
    private static final String METADATA = "metadata";
    private static final String VERSION = "version";
    private static final String GROUPS = "groups";
    private static final String CONTROLS = "controls";
    private static final String PROPS = "props";
    private static final String PARTS = "parts";
    private static final String ID = "id";
    private static final String CLASS = "class";
    private static final String TITLE = "title";
    private static final String NAME = "name";
    private static final String VALUE = "value";
    private static final String PROSE = "prose";
    private static final String LABEL = "label";
    private static final String STATUS = "status";

    /** What a node defines itself by: a control states a statement, a framework function an overview. */
    private static final List<String> DEFINING = List.of("statement", "overview");

    private static final String NO_PARENT = "";

    private final JsonNode catalog;

    public OscalCatalog(final String document) {
        this.catalog = read(document).path(CATALOG);
        if (catalog.isMissingNode()) {
            throw new IllegalArgumentException("The document states no " + CATALOG);
        }
    }

    /** The version the publisher stamps the document with, which is what a bundled file must cite. */
    public String version() {
        return catalog.path(METADATA).path(VERSION).asText();
    }

    /** Every group and control the catalog states, depth first, each carrying the node it nests under. */
    public List<OscalControl> controls() {
        return nodes(catalog.path(GROUPS)).flatMap(group -> from(group, NO_PARENT)).toList();
    }

    private static Stream<OscalControl> from(final JsonNode node, final String broader) {
        final OscalControl control = new OscalControl(node.path(ID).asText(), node.path(CLASS).asText(),
                node.path(TITLE).asText(), namedValue(node.path(PROPS), LABEL, VALUE),
                namedValue(node.path(PROPS), STATUS, VALUE), definition(node), broader);
        return Stream.concat(Stream.of(control),
                nodes(node.path(CONTROLS)).flatMap(child -> from(child, control.id())));
    }

    private static String definition(final JsonNode node) {
        return DEFINING.stream().map(part -> namedValue(node.path(PARTS), part, PROSE))
                .filter(prose -> !prose.isBlank()).findFirst().orElse("");
    }

    private static String namedValue(final JsonNode array, final String name, final String field) {
        return nodes(array).filter(entry -> name.equals(entry.path(NAME).asText()))
                .map(entry -> entry.path(field).asText()).findFirst().orElse("");
    }

    private static JsonNode read(final String document) {
        try {
            return new ObjectMapper().readTree(document);
        } catch (final JsonProcessingException e) {
            throw new UncheckedIOException("Malformed OSCAL document", e);
        }
    }

    private static Stream<JsonNode> nodes(final JsonNode array) {
        return StreamSupport.stream(array.spliterator(), false);
    }
}
