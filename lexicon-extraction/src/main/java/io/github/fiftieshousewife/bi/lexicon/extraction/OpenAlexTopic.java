package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * One topic record of an OpenAlex snapshot: what the publisher calls it, what it says the topic is about,
 * where it places it and which Wikipedia article it links it to.
 *
 * <p>The concept is the path of the publisher's own identifier — {@code T11347}, {@code subfields/1705} —
 * so a row can be taken back to the URL it came from without anything here inventing a key.
 *
 * <p>{@link #subjectMatter} carries the description and the keywords because both are OpenAlex's account of
 * what the topic covers. They are joined as two statements of one property rather than run together, so a
 * placement can read the whole account as prose while a reading that matches runs of words can take the two
 * apart. The Wikipedia link is not part of it: it identifies the topic in another scheme rather than
 * describing it.
 *
 * <p>The two counts say how much of the literature OpenAlex places under the topic. They are what the
 * publisher sizes a topic by — the largest holds five per cent of every work counted and the smallest a
 * quarter of a ten-thousandth of one per cent — and they are carried out of the SKOS shape entirely,
 * because SKOS states no property for how much of a corpus sits under a concept and eight text columns are
 * no place for a number.
 */
public record OpenAlexTopic(String concept, String label, String description, List<String> keywords,
        String wikipedia, long worksCount, long citedByCount, List<OpenAlexLevel> above) {

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
    private static final String WORKS_COUNT = "works_count";
    private static final String CITED_BY_COUNT = "cited_by_count";

    private static final String NO_ARTICLE = "";

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
                articleIn(stated), stated.path(WORKS_COUNT).asLong(),
                stated.path(CITED_BY_COUNT).asLong(), levelsAbove(stated, concept));
    }

    /**
     * The description and the keywords, which is everything the publisher states the topic covers.
     *
     * <p>They are two statements of one property rather than one statement, so they are joined the way
     * every repeated property here is joined and {@link SkosConcept#definitions()} takes them apart again.
     * Fifty words of prose and ten high-specificity noun phrases are not the same evidence, and a reading
     * that matches runs of words has to be able to say which of the two it matched.
     */
    public String subjectMatter() {
        return keywords.isEmpty() ? description
                : description + SkosConcept.STATEMENTS + String.join(KEYWORDS, keywords);
    }

    /**
     * The article the publisher links the topic to, or nothing where it states a value that is not a link.
     *
     * <p>OpenAlex writes the text {@code NaN} for the two topics it has no article for, and an absent
     * property here is empty like every other absent property. What separates the two is RFC 3986's own
     * grammar, asked of the platform's parser: a value carrying no scheme is not an absolute URL and so is
     * not an article. No value is named here, so a third spelling of absence needs no change.
     */
    private static String articleIn(final JsonNode stated) {
        final String linked = stated.path(IDS).path(WIKIPEDIA).asText();
        return absolute(linked) ? linked : NO_ARTICLE;
    }

    private static boolean absolute(final String linked) {
        try {
            return new java.net.URI(linked).isAbsolute();
        } catch (final java.net.URISyntaxException notALink) {
            return false;
        }
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
