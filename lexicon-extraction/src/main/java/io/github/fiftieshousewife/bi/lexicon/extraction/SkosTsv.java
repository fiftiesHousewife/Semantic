package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * Renders taxonomy concepts as the tab-separated rows every bundled vocabulary here is a file of, sorted by
 * concept so a re-extraction shows what the source changed and nothing else. One renderer serves every
 * source because the shape is the same for all of them; what differs between sources is the provenance
 * header, which is the source's own to write.
 *
 * <p>A field carrying a tab or a line break is refused rather than escaped. The column that would silently
 * swallow it is the one a later reading cites, and a file that cannot be read back the way it was written
 * is not evidence of anything.
 */
public class SkosTsv {

    static final String COLUMNS = "concept, prefLabel, altLabel, broader, kind, module, definition, note";

    private static final Pattern SEPARATOR = Pattern.compile("[\t\n\r]");

    private static final String COLUMN = "\t";

    private static final String ROW = "\n";

    private static final String COMMENT = "#";

    public String render(final List<SkosConcept> concepts) {
        return concepts.stream().sorted(Comparator.comparing(SkosConcept::concept))
                .map(SkosTsv::row).collect(Collectors.joining());
    }

    private static String row(final SkosConcept concept) {
        if (concept.concept().startsWith(COMMENT)) {
            throw new IllegalArgumentException("A concept beginning with " + COMMENT + " would be read back "
                    + "as the header rather than as a row, and would vanish without anything failing: "
                    + concept.concept());
        }
        return fields(concept).stream().map(SkosTsv::unbroken).collect(Collectors.joining(COLUMN, "", ROW));
    }

    private static List<String> fields(final SkosConcept concept) {
        return List.of(concept.concept(), concept.prefLabel(), concept.altLabel(), concept.broader(),
                concept.kind(), concept.module(), concept.definition(), concept.note());
    }

    private static String unbroken(final String field) {
        if (SEPARATOR.matcher(field).find()) {
            throw new IllegalArgumentException("A field carrying a tab or a line break would be read back as "
                    + "a column or a row that was never written: " + field);
        }
        return field;
    }
}
