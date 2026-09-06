package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The names a Python specification module declares, read by the module's own layout: a {@code class} or
 * {@code def} at the left margin, an annotated field or an upper-case member inside a class body, an
 * upper-case assignment at module level. The docstring standing directly under a declaration is its
 * definition, cut at its first blank line.
 *
 * <p>This is a line grammar rather than a Python parser, and the source it is written for is why that is
 * enough: ethereum/execution-specs lints every module's layout and docstrings. A name beginning with an
 * underscore is the language's own convention for a private name and is not read. A {@code def} inside a
 * class body is not read either: the specification's classes are data declarations, and their methods are
 * machinery rather than stated vocabulary.
 */
public final class PythonDeclarations {

    /** One declared name: what it is called, what the file states it as, the class holding it, its prose. */
    public record Declaration(String name, String kind, String owner, String docstring) {
    }

    private static final Pattern CLASS = Pattern.compile("^class (\\w+)[(:].*");
    private static final Pattern FUNCTION = Pattern.compile("^def (\\w+)\\(.*");
    private static final Pattern CONSTANT = Pattern.compile("^([A-Z][A-Z0-9_]*)(?:: [^=]+)? = .*");
    private static final Pattern FIELD = Pattern.compile("^ {4}(\\w+): .*");
    private static final Pattern MEMBER = Pattern.compile("^ {4}([A-Z][A-Z0-9_]*) = .*");
    private static final String DOCSTRING = "\"\"\"";

    public List<Declaration> in(final List<String> lines) {
        final List<Declaration> found = new ArrayList<>();
        String owner = "";
        for (int at = 0; at < lines.size(); at++) {
            final String line = lines.get(at);
            final Matcher type = CLASS.matcher(line);
            final Matcher function = FUNCTION.matcher(line);
            final Matcher constant = CONSTANT.matcher(line);
            if (type.matches()) {
                owner = type.group(1);
                found.add(new Declaration(owner, "class", "", statementDocstring(lines, at)));
            } else if (function.matches()) {
                owner = "";
                if (!function.group(1).startsWith("_")) {
                    found.add(new Declaration(function.group(1), "function", "",
                            statementDocstring(lines, at)));
                }
            } else if (constant.matches()) {
                owner = "";
                found.add(new Declaration(constant.group(1), "constant", "", docstringAt(lines, at + 1)));
            } else if (leavesTheClassBody(line)) {
                owner = "";
            } else if (!owner.isEmpty()) {
                inTheBody(found, owner, lines, at);
            }
        }
        return List.copyOf(found);
    }

    private static void inTheBody(final List<Declaration> found, final String owner,
                                  final List<String> lines, final int at) {
        final Matcher member = MEMBER.matcher(lines.get(at));
        final Matcher field = FIELD.matcher(lines.get(at));
        if (member.matches()) {
            found.add(new Declaration(member.group(1), "constant", owner, docstringAt(lines, at + 1)));
        } else if (field.matches() && !field.group(1).startsWith("_")) {
            found.add(new Declaration(field.group(1), "field", owner, docstringAt(lines, at + 1)));
        }
    }

    /** Content at the left margin ends a class body; a comment, a decorator or a docstring does not. */
    private static boolean leavesTheClassBody(final String line) {
        return !line.isBlank() && !line.startsWith(" ") && !line.startsWith("#")
                && !line.startsWith("@") && !line.startsWith(DOCSTRING);
    }

    /** A class or def signature may span lines, so its docstring follows the line ending the statement. */
    private static String statementDocstring(final List<String> lines, final int at) {
        int end = at;
        while (end < lines.size() - 1 && !lines.get(end).strip().endsWith(":")) {
            end++;
        }
        return docstringAt(lines, end + 1);
    }

    private static String docstringAt(final List<String> lines, final int at) {
        if (at >= lines.size() || !lines.get(at).strip().startsWith(DOCSTRING)) {
            return "";
        }
        final String first = lines.get(at).strip();
        if (first.length() > 2 * DOCSTRING.length() && first.endsWith(DOCSTRING)) {
            return first.substring(DOCSTRING.length(), first.length() - DOCSTRING.length()).strip();
        }
        return firstParagraphAfter(lines, at + 1);
    }

    private static String firstParagraphAfter(final List<String> lines, final int at) {
        final List<String> paragraph = new ArrayList<>();
        for (int line = at; line < lines.size(); line++) {
            final String text = lines.get(line).strip();
            if (text.isBlank() || text.startsWith(DOCSTRING) || text.endsWith(DOCSTRING)) {
                break;
            }
            paragraph.add(text);
        }
        return String.join(" ", paragraph);
    }
}
