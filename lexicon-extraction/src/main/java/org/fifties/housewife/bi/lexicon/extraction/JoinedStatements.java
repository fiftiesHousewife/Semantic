package org.fifties.housewife.bi.lexicon.extraction;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * Every statement a source makes of one property about one concept, as the single field a taxonomy row has
 * for it.
 *
 * <p>A row has one definition column and OLiA writes two definitions for fifty-six of its concepts. Keeping
 * the first is what a reader does when the shape is in the way, and it is how 627 superclass statements were
 * lost from this same ontology once already. So the statements are joined, in the order the source wrote
 * them, and the extraction reports how many it carried rather than how many concepts it touched.
 *
 * <p>Two things are refused rather than smoothed over. A statement carrying the separator itself would be
 * read back as two statements that nobody wrote. And a statement carrying a tab or a line break would be
 * read back as a column or a row that nobody wrote — which {@code SkosTsv} refuses at the last moment, so
 * the whitespace a source lays its prose out with is collapsed here, where the reason for it is visible.
 *
 * <p>An exact repeat is one statement, not two. A source that writes a class out twice and states the same
 * definition each time has stated it once; joining the copies would put it in the file twice and inflate
 * every count taken over the file afterwards.
 */
public class JoinedStatements {

    private static final Pattern WHITESPACE = Pattern.compile("\\s+");

    private static final String SPACE = " ";

    public String of(final List<String> statements) {
        return new LinkedHashSet<>(statements.stream().map(JoinedStatements::collapsed)
                .filter(statement -> !statement.isEmpty()).toList()).stream()
                .map(JoinedStatements::unjoinable)
                .collect(Collectors.joining(SkosConcept.STATEMENTS));
    }

    private static String collapsed(final String statement) {
        return WHITESPACE.matcher(statement).replaceAll(SPACE).strip();
    }

    private static String unjoinable(final String statement) {
        if (statement.contains(SkosConcept.STATEMENTS)) {
            throw new IllegalArgumentException("A statement carrying " + SkosConcept.STATEMENTS
                    + " would be read back as two statements the source never made: " + statement);
        }
        return statement;
    }
}
