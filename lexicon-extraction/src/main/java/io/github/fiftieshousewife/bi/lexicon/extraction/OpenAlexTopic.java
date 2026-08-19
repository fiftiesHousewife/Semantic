package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * One topic record of an OpenAlex snapshot: what the publisher calls it, what it says the topic is about,
 * where it places it and which Wikipedia article it links it to.
 *
 * <p>The concept is the path of the publisher's own identifier — {@code T11347}, {@code subfields/1705} —
 * so a row can be taken back to the URL it came from without anything here inventing a key.
 *
 * <p>{@link #subjectMatter} joins the description and the keywords because both are OpenAlex's account of
 * what the topic covers, and a placement reads that account as prose. The Wikipedia link is not part of it:
 * it identifies the topic in another scheme rather than describing it.
 */
public record OpenAlexTopic(String concept, String label, String description, List<String> keywords,
        String wikipedia, List<OpenAlexLevel> above) {

    /** The levels OpenAlex states above a topic, widest first, which is the order the rows nest in. */
    private static final List<String> LEVELS = List.of("domain", "field", "subfield");

    private static final String IDENTIFIER = "https://openalex.org/";

    /** One reader for every record: a snapshot is thousands of lines and a mapper is costly to build. */
    private static final ObjectMapper JSON = new ObjectMapper();

    private static final String KEYWORDS = ", ";

    private static final String ID = "id";
    private static final String DISPLAY_NAME = "display_name";
    private static final String DESCRIPTION = "description";
    private static final String KEYWORD_LIST = "keywords";
    private static final String IDS = "ids";
    private static final String WIKIPEDIA = "wikipedia";

    public OpenAlexTopic {
        keywords = List.copyOf(keywords);
        above = List.copyOf(above);
    }

    public static OpenAlexTopic of(final String record) {
        final JsonNode stated = read(record);
        final String concept = pathOf(stated.path(ID).asText());
        return new OpenAlexTopic(concept, stated.path(DISPLAY_NAME).asText(),
                stated.path(DESCRIPTION).asText(),
                nodes(stated.path(KEYWORD_LIST)).map(JsonNode::asText).toList(),
                stated.path(IDS).path(WIKIPEDIA).asText(), levelsAbove(stated, concept));
    }

    /** The description and the keywords, which is everything the publisher states the topic covers. */
    public String subjectMatter() {
        return keywords.isEmpty() ? description : description + " " + String.join(KEYWORDS, keywords);
    }

    private static List<OpenAlexLevel> levelsAbove(final JsonNode stated, final String concept) {
        return LEVELS.stream().map(level -> levelOf(stated, level, concept)).toList();
    }

    private static OpenAlexLevel levelOf(final JsonNode stated, final String level, final String concept) {
        final String id = stated.path(level).path(ID).asText();
        if (id.isEmpty()) {
            throw new IllegalArgumentException("The record for " + concept + " states no " + level + ", and "
                    + "a topic with nothing stated above it is a row no walk can reach");
        }
        return new OpenAlexLevel(pathOf(id), stated.path(level).path(DISPLAY_NAME).asText(), level);
    }

    private static String pathOf(final String id) {
        return id.replace(IDENTIFIER, "");
    }

    private static JsonNode read(final String record) {
        try {
            return JSON.readTree(record);
        } catch (final IOException e) {
            throw new UncheckedIOException("Malformed OpenAlex topic record", e);
        }
    }

    private static Stream<JsonNode> nodes(final JsonNode array) {
        return StreamSupport.stream(array.spliterator(), false);
    }
}
