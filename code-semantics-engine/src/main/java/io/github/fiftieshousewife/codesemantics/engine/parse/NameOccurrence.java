package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

/**
 * One piece of text this repository wrote, what it is in the syntax, the line it sits on, what one occurrence
 * of it is worth, and the words of the type written beside it.
 *
 * <p>The line is carried because a reading that cannot say where it read something can be neither checked nor
 * cited. The weight is carried because a piece of text standing in several files was written once. The type's
 * words are carried because a word of a name repeating the type declared beside it is that type spelled
 * again, and only the parse can say so. The enclosing declarations are carried because a published run of
 * words is often split across a declaration and written into no single name.
 *
 * @param weight    a share of one occurrence, in {@code (0, 1]} — one for anything written where it stands
 * @param typeWords the words of every type the declaration names, in lower case, empty where it names none
 * @param enclosing the names of the types and methods this one was written inside, outermost first
 */
public record NameOccurrence(String text, NameForm form, int line, double weight, List<String> typeWords,
                             List<String> enclosing) {

    /** Text written where it stands, with no type beside it — the ordinary case. */
    public NameOccurrence(final String text, final NameForm form, final int line) {
        this(text, form, line, 1.0, List.of());
    }

    /** Text written outside any declaration this reading names — a comment, an import, a file's own name. */
    public NameOccurrence(final String text, final NameForm form, final int line, final double weight,
                          final List<String> typeWords) {
        this(text, form, line, weight, typeWords, List.of());
    }

    public NameOccurrence {
        Objects.requireNonNull(text, "text");
        Objects.requireNonNull(form, "form");
        if (line < 1) {
            throw new IllegalArgumentException("line numbers are 1-based: " + line);
        }
        if (weight <= 0.0 || weight > 1.0) {
            throw new IllegalArgumentException("a weight is a share of one occurrence: " + weight);
        }
        typeWords = typeWords.stream().map(word -> word.toLowerCase(Locale.ROOT)).distinct().toList();
        enclosing = List.copyOf(enclosing);
    }

    /** The same occurrence at a share of its worth — what prose standing in several files is worth in one. */
    public NameOccurrence weighing(final double share) {
        return new NameOccurrence(text, form, line, share, typeWords, enclosing);
    }

    /**
     * Whether this run of the name's own words is the type beside it, spelled again — {@code list} in
     * {@code List<Foo> getFooList()}, {@code set} in {@code Set<String> mimeSet}, {@code result} in
     * {@code ParseResult result}.
     *
     * <p>It marks rather than removes. Dropping a word out of the middle of a name closes the gap between two
     * words the author never wrote next to each other, so a term matched across that gap would be one this
     * library manufactured; the word stays where it was written and what it is is recorded beside it.
     */
    public boolean restatesItsType(final List<String> run) {
        return !typeWords.isEmpty() && typeWords.containsAll(run);
    }
}
