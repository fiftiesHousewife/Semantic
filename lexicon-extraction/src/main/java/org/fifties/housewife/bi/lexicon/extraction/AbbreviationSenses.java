package org.fifties.housewife.bi.lexicon.extraction;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Reads the abbreviation senses out of one wiktextract JSONL entry. A sense qualifies when its tags
 * declare a shortening and it names its target through {@code alt_of} or {@code form_of}; the entry's
 * word becomes the token, canonicalised to the lowercase dotless form a column name would carry.
 * Translingual entries are read beside the English ones — unit symbols live in that section, tagged
 * {@code symbol} — and a symbol's citation is kept only when its target is written in words: a symbol
 * pointing at another symbol (kWh at kW·h) is a chain this extraction does not follow.
 */
public class AbbreviationSenses {

    private static final List<String> KINDS =
            List.of("abbreviation", "initialism", "acronym", "clipping", "symbol");
    private static final String SYMBOL = "symbol";
    private static final Pattern UNIT_QUANTITY = Pattern.compile("unit of ([a-z ,-]+?)(?: equal to| in |,|$)");

    private final WiktionaryJson json = new WiktionaryJson();

    public List<AbbreviationSense> fromEntryJson(final String line) {
        final JsonNode entry = json.entryOf(line);
        if (!WiktionaryJson.english(entry) && !WiktionaryJson.translingual(entry)) {
            return List.of();
        }
        final String token = tokenOf(entry.path("word").asText());
        if (token.isEmpty()) {
            return List.of();
        }
        return WiktionaryJson.nodes(entry.path("senses"))
                .flatMap(sense -> sensesOf(token, sense))
                .distinct()
                .toList();
    }

    private Stream<AbbreviationSense> sensesOf(final String token, final JsonNode sense) {
        return kindOf(sense).stream().flatMap(kind -> targetsOf(sense)
                .flatMap(target -> senseOf(token, kind, target, sense).stream()));
    }

    private Optional<AbbreviationSense> senseOf(final String token, final String kind, final JsonNode target,
                                                final JsonNode sense) {
        final String expansion = canonical(target.path("word").asText());
        if (expansion.isEmpty() || expansion.equals(token)) {
            return Optional.empty();
        }
        if (SYMBOL.equals(kind) && !writtenInWords(expansion)) {
            return Optional.empty();
        }
        final String quantity = SYMBOL.equals(kind) ? quantityOf(target.path("extra").asText()) : "";
        return Optional.of(new AbbreviationSense(token, expansion, kind, topicsOf(sense), quantity));
    }

    /** The quantity the standard says a unit measures, read from the citation's own description. */
    private static String quantityOf(final String extra) {
        final Matcher matcher = UNIT_QUANTITY.matcher(extra.toLowerCase(Locale.ROOT));
        return matcher.find() ? matcher.group(1).trim() : "";
    }

    private static boolean writtenInWords(final String expansion) {
        return expansion.matches("[a-z]+(?:[ -][a-z]+)*");
    }

    private Optional<String> kindOf(final JsonNode sense) {
        final Set<String> tags = WiktionaryJson.nodes(sense.path("tags"))
                .map(JsonNode::asText).collect(Collectors.toSet());
        return KINDS.stream().filter(tags::contains).findFirst();
    }

    private static Stream<JsonNode> targetsOf(final JsonNode sense) {
        return Stream.concat(WiktionaryJson.nodes(sense.path("alt_of")), WiktionaryJson.nodes(sense.path("form_of")));
    }

    private List<String> topicsOf(final JsonNode sense) {
        return WiktionaryJson.nodes(sense.path("topics")).map(JsonNode::asText).toList();
    }

    private static String tokenOf(final String word) {
        final String canonical = canonical(word);
        final String token = canonical.endsWith(".")
                ? canonical.substring(0, canonical.length() - 1)
                : canonical;
        return token.contains(" ") ? "" : token;
    }

    private static String canonical(final String text) {
        return text.trim().toLowerCase(Locale.ROOT).replaceAll("\\s+", " ");
    }
}
