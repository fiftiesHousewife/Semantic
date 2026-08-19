package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Reads AsciiDoc documentation as the prose it is, the way {@link MarkdownSource} reads markdown. The
 * syntax differs; the reasons do not. Code quoted in a listing, literal or passthrough block is stepped
 * over, and so is inline code, because a document showing {@code AutoDetectParser} in an example is quoting
 * somebody else's vocabulary rather than choosing a word.
 *
 * <p>A link or cross-reference keeps its text and loses its target: the text is the author's words, the
 * target is an address. Attribute entries, block attribute lines, comments and include macros are the
 * format's own machinery and carry no words the author chose for a reader.
 */
public final class AsciiDocSource implements SourceReader {

    private static final String ASCIIDOC_SUFFIX = ".adoc";

    /** Listing, literal, passthrough and comment blocks, opened and closed by the same delimiter line. */
    private static final Pattern DELIMITED_BLOCK =
            Pattern.compile("(?ms)^(-{4,}|\\.{4,}|\\+{4,}|/{4,})[ \\t]*$.*?^\\1[ \\t]*$");
    private static final Pattern LINE_COMMENT = Pattern.compile("^//.*");
    private static final Pattern ATTRIBUTE_ENTRY = Pattern.compile("^:[^:\\s]+:.*");
    private static final Pattern BLOCK_ATTRIBUTE_LINE = Pattern.compile("^\\[[^]]*][ \\t]*$");
    private static final Pattern INLINE_CODE = Pattern.compile("`[^`]*`");
    private static final Pattern MACRO_WITH_TEXT = Pattern.compile("\\w+::?[^\\s\\[\\]]*\\[([^]]*)]");
    /** A macro whose bracketed text wraps onto the next line leaves its target dangling on this one. */
    private static final Pattern DANGLING_MACRO = Pattern.compile("\\w+::?[^\\s\\[\\]]*\\[");
    private static final Pattern BARE_URL = Pattern.compile("https?://\\S+");
    private static final Pattern CROSS_REFERENCE = Pattern.compile("<<[^,>]*,?([^>]*)>>");
    private static final Pattern ASCIIDOC_FURNITURE = Pattern.compile("[=>|*_\\[\\]#-]+");

    @Override
    public boolean reads(final Path file) {
        return file.getFileName().toString().endsWith(ASCIIDOC_SUFFIX);
    }

    @Override
    public ParsedSource read(final Path file, final String source) {
        final String[] lines = withoutBlocks(source).split("\n", -1);
        final List<NameOccurrence> prose = IntStream.range(0, lines.length)
                .mapToObj(line -> new NameOccurrence(readable(lines[line]), NameForm.DOCUMENTATION, line + 1))
                .filter(occurrence -> !occurrence.text().isBlank())
                .toList();
        return new ParsedSource("", prose, ParseOutcome.CLEAN);
    }

    /**
     * Delimited blocks are blanked line for line rather than removed, so every line number after one still
     * points at the line a reader would find.
     */
    private static String withoutBlocks(final String source) {
        return DELIMITED_BLOCK.matcher(source)
                .replaceAll(block -> block.group()
                        .replaceAll("[^\n]", ""));
    }

    private static String readable(final String line) {
        final String withoutComment = LINE_COMMENT.matcher(line).replaceAll("");
        final String withoutAttributes = ATTRIBUTE_ENTRY.matcher(withoutComment).replaceAll("");
        final String withoutBlockAttributes = BLOCK_ATTRIBUTE_LINE.matcher(withoutAttributes).replaceAll("");
        final String withoutInlineCode = INLINE_CODE.matcher(withoutBlockAttributes).replaceAll(" ");
        final String withLinkTexts = MACRO_WITH_TEXT.matcher(withoutInlineCode).replaceAll("$1");
        final String withoutDanglingTargets = DANGLING_MACRO.matcher(withLinkTexts).replaceAll(" ");
        final String withoutBareUrls = BARE_URL.matcher(withoutDanglingTargets).replaceAll(" ");
        final String withReferenceTexts = CROSS_REFERENCE.matcher(withoutBareUrls).replaceAll("$1");
        return ASCIIDOC_FURNITURE.matcher(withReferenceTexts).replaceAll(" ").strip();
    }
}
