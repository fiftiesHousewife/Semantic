package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The registered media types of one IANA registry, read from the CSV the registry itself publishes:
 * {@code Name, Template, Reference}. The template is the registered identifier — {@code application/pdf} —
 * and is carried byte for byte, because the whole point of bundling this registry is that a string equal to
 * a template is the publisher's own identifier and not an English word. The name restates the subtype and,
 * where the registry has deprecated or obsoleted a type, says so; that statement and the reference go to
 * the note. The registry publishes no definitions.
 */
public final class MediaTypeConcepts {

    private static final String MEDIA_TYPE = "media-type";

    /** Name and template never hold a comma or a quote; the reference is quoted where it holds commas. */
    private static final Pattern ROW = Pattern.compile("([^,]*),([^,]*),(?:\"(.*)\"|(.*))");

    public List<SkosConcept> in(final String registry, final String csv) {
        return csv.lines()
                .skip(1)
                .map(MediaTypeConcepts::fields)
                .map(row -> concept(registry, row))
                .toList();
    }

    private static SkosConcept concept(final String registry, final List<String> row) {
        final String name = row.get(0);
        final String template = row.get(1);
        final String reference = row.get(2);
        final String subtype = template.substring(template.indexOf('/') + 1);
        final String note = name.equals(subtype) ? reference
                : name + SkosConcept.STATEMENTS + reference;
        return new SkosConcept(template, template, "", registry, MEDIA_TYPE, registry, "", note);
    }

    /** The three fields of one row; only the reference is ever quoted, for the commas inside it. */
    private static List<String> fields(final String row) {
        final Matcher fields = ROW.matcher(row);
        if (!fields.matches()) {
            throw new IllegalArgumentException("Not a three-field registry row: " + row);
        }
        return List.of(fields.group(1), fields.group(2),
                Optional.ofNullable(fields.group(3)).orElseGet(() -> fields.group(4)));
    }
}
