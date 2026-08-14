package org.fifties.housewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A report as a page a browser will render, over the markdown this library writes and no more of it.
 *
 * <p>The subset is closed because the input is not arbitrary: every report here is produced by a renderer in
 * this repository, so the grammar to support is headings, paragraphs, tables, list items, bold, and code
 * spans. That is the whole of it, and a general markdown library would be a dependency taken to parse text
 * this project already controls the shape of.
 *
 * <p>Escaping runs before any markup is added, so a report that happens to contain a angle bracket is text
 * rather than a tag. It is the one thing a hand-written converter usually gets wrong and the one thing that
 * matters when the input is a corpus of somebody's identifiers.
 */
final class MarkdownRendering {

    private static final Pattern CODE = Pattern.compile("`([^`]+)`");
    private static final Pattern BOLD = Pattern.compile("\\*\\*([^*]+)\\*\\*");
    private static final Pattern HEADING = Pattern.compile("^(#{1,4})\\s+(.*)$");

    String of(final String title, final String markdown) {
        return "<title>%s</title>\n<style>%s</style>\n<div class=\"wrap\">\n%s</div>\n"
                .formatted(escaped(title), Stylesheet.REPORT, body(markdown));
    }

    private String body(final String markdown) {
        final List<String> html = new ArrayList<>();
        final List<String> table = new ArrayList<>();
        for (final String line : markdown.split("\n", -1)) {
            if (line.startsWith("|")) {
                table.add(line);
                continue;
            }
            flush(table, html);
            html.add(block(line));
        }
        flush(table, html);
        return String.join("\n", html.stream().filter(part -> !part.isEmpty()).toList()) + "\n";
    }

    private String block(final String line) {
        final Matcher heading = HEADING.matcher(line);
        if (heading.matches()) {
            final int level = heading.group(1).length();
            return "<h%d>%s</h%d>".formatted(level, inline(heading.group(2)), level);
        }
        if (line.startsWith("- ")) {
            return "<p class=\"item\">%s</p>".formatted(inline(line.substring(2)));
        }
        return line.isBlank() ? "" : "<p>%s</p>".formatted(inline(line));
    }

    /** A run of pipe-delimited lines is one table; the row of dashes under the head is a rule, not a row. */
    private void flush(final List<String> rows, final List<String> html) {
        if (rows.isEmpty()) {
            return;
        }
        final List<String> body = rows.stream().filter(row -> !row.replace("|", "").matches("[-:\\s]*"))
                .toList();
        final List<String> cells = new ArrayList<>();
        cells.add("<table>");
        cells.add(row(body.getFirst(), "th"));
        body.subList(1, body.size()).forEach(row -> cells.add(row(row, "td")));
        cells.add("</table>");
        html.add(String.join("\n", cells));
        rows.clear();
    }

    private String row(final String line, final String cell) {
        final String[] columns = line.strip().replaceAll("^\\||\\|$", "").split("\\|", -1);
        final StringBuilder built = new StringBuilder("<tr>");
        for (final String column : columns) {
            built.append("<%s>%s</%s>".formatted(cell, inline(column.strip()), cell));
        }
        return built.append("</tr>").toString();
    }

    private String inline(final String text) {
        final String escaped = escaped(text);
        final String bold = BOLD.matcher(escaped).replaceAll(match -> "<strong>"
                + Matcher.quoteReplacement(match.group(1)) + "</strong>");
        return CODE.matcher(bold).replaceAll(match -> "<code>"
                + Matcher.quoteReplacement(match.group(1)) + "</code>");
    }

    private static String escaped(final String text) {
        return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }
}
