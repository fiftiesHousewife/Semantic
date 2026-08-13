package org.fifties.housewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Every identifier-shaped run in a Java source text, with the line it sits on, skipping the comments and the
 * literals. One ordered alternation does the work a lexer's states would: a comment, a text block, a string
 * and a character literal each match before the identifier alternative can, so a word inside a string or a
 * sentence inside a comment is stepped over rather than read as a name.
 *
 * <p>This is a <em>lexical scan and not a parse</em>, and the difference is load-bearing. It cannot say which
 * declaration an identifier belongs to, cannot tell a declaration from a use, and reads a type name at its
 * every mention. What it can do is read any Java file, including one that does not compile — and it needs no
 * grammar binary to do it, which is what makes it the right instrument for a legibility reading and the wrong
 * one for the symbol graph, where the parse of the plan's stage 5 is required.
 *
 * <p>Prose is deliberately dropped rather than read. Comments and commit messages carry words the pipeline
 * will read as prose evidence in its own right; counting them here would flatter a legibility figure that is
 * about what the <em>code</em> is written in.
 *
 * <p>The {@code package} and {@code import} declarations are stepped over for a different reason, and it is a
 * rule about where a name sits rather than a claim about what one means. Those lines are a file's coordinates:
 * they name the module system's directories and every dependency's package path, none of which this code
 * chose as a word for anything. Reading them puts a repository's own package coordinates in every one of its
 * files — which a divergence against a reference discards for free and a count never can — so a count is
 * taken over the declarations that are the author's own vocabulary and the arithmetic is told which.
 * Anchoring the rule at the line start is what keeps it grammatical: the word {@code import} inside an
 * expression, a comment or a string is untouched.
 */
public final class JavaSourceIdentifiers {

    private static final Pattern LEXEME = Pattern.compile(
            "//[^\\n]*"
                    + "|/\\*(?s:.*?)\\*/"
                    + "|\"\"\"(?s:.*?)\"\"\""
                    + "|\"(?:\\\\.|[^\"\\\\\\n])*\""
                    + "|'(?:\\\\.|[^'\\\\\\n])*'"
                    + "|^[ \\t]*(?:package|import)\\b[^;]*;"
                    + "|(?<identifier>[A-Za-z_$][A-Za-z0-9_$]*)",
            Pattern.MULTILINE);

    private static final String IDENTIFIER = "identifier";

    public List<IdentifierOccurrence> in(final String source) {
        final List<IdentifierOccurrence> occurrences = new ArrayList<>();
        final Matcher lexemes = LEXEME.matcher(source);
        int lineStart = 0;
        int line = 1;
        while (lexemes.find()) {
            final String identifier = lexemes.group(IDENTIFIER);
            line += newlinesBetween(source, lineStart, lexemes.start());
            lineStart = lexemes.start();
            if (identifier != null) {
                occurrences.add(new IdentifierOccurrence(identifier, line));
            }
        }
        return List.copyOf(occurrences);
    }

    private static int newlinesBetween(final String source, final int from, final int to) {
        return (int) source.substring(from, to).chars().filter(character -> character == '\n').count();
    }
}
