package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The manifest OpenAlex publishes beside a snapshot: what entity it holds, the day it was taken, how many
 * records it states and the parts it is served in.
 *
 * <p>The manifest is what names the parts, so the extraction reads it rather than the download directory:
 * a browser names a file {@code part_0000 (3).gz} and the publisher names it by its {@code updated_date}.
 * A part's own name is therefore the URL stated here, and the local file is found by the length stated
 * beside it.
 *
 * <p>Its order is the publisher's, ascending by {@code updated_date}. The partitions are cumulative rather
 * than a replacement per folder, so a record in a later part supersedes the same record in an earlier one
 * and reading them in this order is what applies that rule.
 */
public final class OpenAlexManifest {

    private static final String TOPICS = "topics";

    private static final String ENTITY = "entity";
    private static final String DATE = "date";
    private static final String RECORD_COUNT = "record_count";
    private static final String FILES = "files";
    private static final String URL = "url";
    private static final String META = "meta";
    private static final String CONTENT_LENGTH = "content_length";

    private final String date;

    private final int recordCount;

    private final List<Part> parts;

    private OpenAlexManifest(final String date, final int recordCount, final List<Part> parts) {
        this.date = date;
        this.recordCount = recordCount;
        this.parts = List.copyOf(parts);
    }

    public static OpenAlexManifest of(final byte[] manifest) {
        final JsonNode stated = read(manifest);
        final String entity = stated.path(ENTITY).asText();
        if (!TOPICS.equals(entity)) {
            throw new IllegalArgumentException("The manifest states the " + entity + " entity, where this "
                    + "extraction reads " + TOPICS);
        }
        final List<Part> parts = nodes(stated.path(FILES)).map(OpenAlexManifest::part).toList();
        if (parts.isEmpty()) {
            throw new IllegalArgumentException("The manifest names no part of the " + entity + " snapshot");
        }
        return new OpenAlexManifest(stated.path(DATE).asText(), stated.path(RECORD_COUNT).asInt(), parts);
    }

    /** The day the publisher stamps the snapshot with, which is what a bundled file cites. */
    public String date() {
        return date;
    }

    public int recordCount() {
        return recordCount;
    }

    public List<Part> parts() {
        return parts;
    }

    private static Part part(final JsonNode file) {
        final JsonNode meta = file.path(META);
        return new Part(file.path(URL).asText(), meta.path(CONTENT_LENGTH).asInt(),
                meta.path(RECORD_COUNT).asInt());
    }

    private static JsonNode read(final byte[] manifest) {
        try {
            return new ObjectMapper().readTree(manifest);
        } catch (final IOException e) {
            throw new UncheckedIOException("Malformed OpenAlex manifest", e);
        }
    }

    private static Stream<JsonNode> nodes(final JsonNode array) {
        return StreamSupport.stream(array.spliterator(), false);
    }

    /** One part of the snapshot: where the publisher serves it, how long it is and what it holds. */
    public record Part(String url, int contentLength, int recordCount) {
    }
}
