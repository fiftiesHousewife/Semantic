package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Reads a test fixture by its chosen name alone. A corpus of sample documents states its domain in the
 * names its curator gave the files — {@code testEXCEL_embedded.xls} — without a byte of a document being
 * opened, and the contents are somebody else's words, so the name is all this reader takes.
 *
 * <p>{@code META-INF} is refused: the JAR File Specification reserves that directory for the format's own
 * metadata, so a file under it is named by a platform contract rather than by this repository.
 */
public final class FixtureNameSource implements SourceReader {

    private static final List<String> TEST_RESOURCES = List.of("src", "test", "resources");
    private static final String RESERVED_BY_THE_JAR_SPECIFICATION = "META-INF";

    @Override
    public boolean reads(final Path file) {
        final int resources = endOfTestResources(file);
        return resources >= 0 && IntStream.range(resources, file.getNameCount() - 1)
                .noneMatch(index -> RESERVED_BY_THE_JAR_SPECIFICATION.equals(file.getName(index).toString()));
    }

    @Override
    public boolean opensTheFile() {
        return false;
    }

    @Override
    public ParsedSource read(final Path file, final String source) {
        return new ParsedSource("",
                List.of(new NameOccurrence(file.getFileName().toString(), NameForm.FIXTURE, 1)),
                ParseOutcome.CLEAN);
    }

    /** The index after the {@code src/test/resources} run, or -1 where the path has none. */
    private static int endOfTestResources(final Path file) {
        return IntStream.rangeClosed(0, file.getNameCount() - TEST_RESOURCES.size() - 1)
                .filter(start -> IntStream.range(0, TEST_RESOURCES.size())
                        .allMatch(rung -> TEST_RESOURCES.get(rung)
                                .equals(file.getName(start + rung).toString())))
                .map(start -> start + TEST_RESOURCES.size())
                .findFirst()
                .orElse(-1);
    }
}
