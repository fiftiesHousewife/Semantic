package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 * Reads a Maven pom for the two things in it an author chose for a reader: the {@code <module>} entries,
 * which are the one place each module's name is stated by its parent, and the {@code <description>}, which
 * is publisher prose about the module. A module name is one naming decision however many files sit under
 * it, so reading it where its parent states it counts it once, the way a package is counted at its first
 * file.
 *
 * <p>Everything else a pom holds — coordinates, dependencies, plugin configuration — is somebody else's
 * vocabulary quoted, or the organisation's own coordinate, and is not read.
 */
public final class PomSource implements SourceReader {

    private static final String POM_FILE = "pom.xml";
    private static final Pattern MODULE_ENTRY = Pattern.compile("<module>\\s*([^<]+?)\\s*</module>");
    private static final Pattern DESCRIPTION = Pattern.compile("(?s)<description>(.*?)</description>");
    /** A module stated as a path names one directory per segment; dots are the rungs the splitter divides at. */
    private static final char PATH_SEPARATOR = '/';
    private static final char QUALIFIER = '.';

    @Override
    public boolean reads(final Path file) {
        return POM_FILE.equals(file.getFileName().toString());
    }

    @Override
    public ParsedSource read(final String source) {
        final List<NameOccurrence> read = new ArrayList<>();
        final Matcher modules = MODULE_ENTRY.matcher(source);
        while (modules.find()) {
            read.add(new NameOccurrence(modules.group(1).replace(PATH_SEPARATOR, QUALIFIER), NameForm.MODULE,
                    lineOf(source, modules.start(1))));
        }
        final Matcher descriptions = DESCRIPTION.matcher(source);
        while (descriptions.find()) {
            read.addAll(proseLines(descriptions.group(1), lineOf(source, descriptions.start(1))));
        }
        read.sort(Comparator.comparingInt(NameOccurrence::line));
        return new ParsedSource("", read, ParseOutcome.CLEAN);
    }

    private static List<NameOccurrence> proseLines(final String description, final int firstLine) {
        final String[] lines = description.split("\n", -1);
        return IntStream.range(0, lines.length)
                .mapToObj(line -> new NameOccurrence(lines[line].strip(), NameForm.DOCUMENTATION,
                        firstLine + line))
                .filter(occurrence -> !occurrence.text().isBlank())
                .toList();
    }

    private static int lineOf(final String source, final int index) {
        return (int) source.chars().limit(index).filter(character -> character == '\n').count() + 1;
    }
}
