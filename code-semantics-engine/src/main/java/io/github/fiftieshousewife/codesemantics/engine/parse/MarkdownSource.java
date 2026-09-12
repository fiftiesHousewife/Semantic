package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Reads a repository's own documentation as the prose it is: a README, a plan, a backlog. These are where a
 * codebase says outright what it is for, in sentences chosen for a reader rather than for a compiler, and a
 * reading that ignored them would be ignoring the clearest evidence in the tree.
 *
 * <p>Code quoted inside documentation is stepped over — fenced blocks and inline spans alike — for the same
 * reason a use is stepped over inside a source file. A README showing {@code assertThat} in an example is
 * quoting somebody else's vocabulary, not choosing a word, and a paragraph about the frequency list should
 * not read as being about whatever the code sample beneath it calls.
 *
 * <p>Link targets go too. A URL is an address, and the words inside one belong to whoever owns the domain.
 *
 * <p>An HTML comment goes because no renderer shows it: what a document says is what its reader sees, and a
 * licence header hidden in a comment is boilerplate the author was never stating. Fenced blocks are blanked
 * first, so a comment opener quoted inside an example cannot swallow the prose after it.
 */
public final class MarkdownSource implements SourceReader {

    private static final String MARKDOWN_SUFFIX = ".md";

    private static final Pattern FENCED_BLOCK = Pattern.compile("(?ms)^```.*?^```\\s*$");
    private static final Pattern HTML_COMMENT = Pattern.compile("(?s)<!--.*?-->");
    private static final Pattern INLINE_CODE = Pattern.compile("`[^`]*`");
    private static final Pattern LINK_TARGET = Pattern.compile("]\\([^)]*\\)|https?://\\S+");
    private static final Pattern MARKDOWN_FURNITURE = Pattern.compile("[#>|*_\\[\\]-]+");

    @Override
    public boolean reads(final Path file) {
        return file.getFileName().toString().endsWith(MARKDOWN_SUFFIX);
    }

    @Override
    public ParsedSource read(final Path file, final String source) {
        final String[] lines = withoutCode(source).split("\n", -1);
        final List<NameOccurrence> prose = IntStream.range(0, lines.length)
                .mapToObj(line -> new NameOccurrence(readable(lines[line]), NameForm.DOCUMENTATION, line + 1))
                .filter(occurrence -> !occurrence.text().isBlank())
                .toList();
        return new ParsedSource("", prose, ParseOutcome.CLEAN);
    }

    /**
     * Fenced blocks and HTML comments are blanked line for line rather than removed, so every line number
     * after one still points at the line a reader would find.
     */
    private static String withoutCode(final String source) {
        final String withoutFences = blanked(FENCED_BLOCK, source);
        return blanked(HTML_COMMENT, withoutFences);
    }

    private static String blanked(final Pattern hidden, final String source) {
        return hidden.matcher(source)
                .replaceAll(block -> block.group()
                        .replaceAll("[^\n]", ""));
    }

    private static String readable(final String line) {
        final String withoutInlineCode = INLINE_CODE.matcher(line).replaceAll(" ");
        final String withoutLinkTargets = LINK_TARGET.matcher(withoutInlineCode).replaceAll(" ");
        return MARKDOWN_FURNITURE.matcher(withoutLinkTargets).replaceAll(" ");
    }
}
