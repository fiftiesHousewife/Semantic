package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Writes a {@link ReadingExport} as JSON, and reads one back.
 *
 * <p>Every document is checked against {@link ExportSchema} before it reaches a file, so a run either
 * produces a document matching the published schema or produces none. Pretty-printed, because the file is
 * committed beside the reports and a diff of one long line tells a reviewer nothing.
 */
public final class ExportFile {

    /** What every run writes. */
    public static final String NAME = "reading.json";

    private final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    private final ExportSchema schema = ExportSchema.fromClasspath();

    public void wrote(final Path file, final ReadingExport export) throws IOException {
        final String document = of(export);
        Files.createDirectories(file.toAbsolutePath().getParent());
        Files.writeString(file, document);
    }

    /** The document as a string, checked against the schema first. */
    public String of(final ReadingExport export) throws IOException {
        final JsonNode document = mapper.valueToTree(export);
        final Set<String> refusals = schema.refusals(document);
        if (!refusals.isEmpty()) {
            throw new IllegalStateException(ExportSchema.RESOURCE + " refuses this document: " + refusals);
        }
        return mapper.writeValueAsString(document);
    }

    /** The same object back, which is what says the shape survives a round trip. */
    public ReadingExport in(final Path file) throws IOException {
        return mapper.readValue(Files.readString(file), ReadingExport.class);
    }
}
