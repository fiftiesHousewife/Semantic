package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Writes a {@link PullRequestExport} as JSON, and reads one back.
 *
 * <p>Every document is checked against {@code pull-requests.schema.json} before it reaches a file, so a
 * run either produces a document matching the published schema or produces none — the same contract
 * {@link ExportFile} holds over the reading.
 */
public final class PullRequestFile {

    /** What a run writes where pull requests were fetched beside the tree. */
    public static final String NAME = "pull-requests.json";

    /** Where the schema sits in the jar, for a consumer that wants to read or generate from it. */
    public static final String SCHEMA = "/pull-requests.schema.json";

    private final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    private final ExportSchema schema = ExportSchema.fromClasspath(SCHEMA);

    public void wrote(final Path file, final PullRequestExport export) throws IOException {
        final String document = of(export);
        Files.createDirectories(file.toAbsolutePath().getParent());
        Files.writeString(file, document);
    }

    /** Any document already there is removed, so a run reading no pull requests leaves none behind. */
    public void removed(final Path file) throws IOException {
        Files.deleteIfExists(file);
    }

    /** The document as a string, checked against the schema first. */
    public String of(final PullRequestExport export) throws IOException {
        final JsonNode document = mapper.valueToTree(export);
        final Set<String> refusals = schema.refusals(document);
        if (!refusals.isEmpty()) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "%s refuses this document: %s",
                    SCHEMA, refusals));
        }
        return mapper.writeValueAsString(document);
    }

    /** The same object back, which is what says the shape survives a round trip. */
    public PullRequestExport in(final Path file) throws IOException {
        return mapper.readValue(Files.readString(file), PullRequestExport.class);
    }
}
