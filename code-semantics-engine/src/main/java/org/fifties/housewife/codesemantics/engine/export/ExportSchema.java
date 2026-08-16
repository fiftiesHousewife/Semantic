package org.fifties.housewife.codesemantics.engine.export;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.JsonNode;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

/**
 * The published shape of {@link ReadingExport}, and the check against it.
 *
 * <p>The schema ships in the jar so a consumer can read it or generate against it, and it is what a document
 * is checked against before it is written. A contract a writer can break without noticing is a comment.
 */
public final class ExportSchema {

    /** Where the schema sits in the jar, for a consumer that wants to read or generate from it. */
    public static final String RESOURCE = "/reading-export.schema.json";

    private final JsonSchema schema;

    private ExportSchema(final JsonSchema schema) {
        this.schema = schema;
    }

    public static ExportSchema fromClasspath() {
        try (InputStream stated = ExportSchema.class.getResourceAsStream(RESOURCE)) {
            return new ExportSchema(JsonSchemaFactory
                    .getInstance(SpecVersion.VersionFlag.V202012).getSchema(stated));
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + RESOURCE, e);
        }
    }

    /** What the schema refuses about this document, in path order. Empty where it admits it. */
    public Set<String> refusals(final JsonNode document) {
        return schema.validate(document).stream()
                .map(ValidationMessage::getMessage)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
