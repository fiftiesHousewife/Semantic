package org.fifties.housewife.bi.lexicon.extraction;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.UncheckedIOException;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/** The shared reading of one wiktextract JSONL line, for every extractor that walks the dump. */
final class WiktionaryJson {

    private static final String ENGLISH = "en";
    private static final String TRANSLINGUAL = "mul";

    private final ObjectMapper objectMapper = new ObjectMapper();

    JsonNode entryOf(final String line) {
        try {
            return objectMapper.readTree(line);
        } catch (final JsonProcessingException e) {
            throw new UncheckedIOException("Malformed dump line: " + line, e);
        }
    }

    static boolean english(final JsonNode entry) {
        return ENGLISH.equals(entry.path("lang_code").asText());
    }

    static boolean translingual(final JsonNode entry) {
        return TRANSLINGUAL.equals(entry.path("lang_code").asText());
    }

    static Stream<JsonNode> nodes(final JsonNode array) {
        return StreamSupport.stream(array.spliterator(), false);
    }
}
