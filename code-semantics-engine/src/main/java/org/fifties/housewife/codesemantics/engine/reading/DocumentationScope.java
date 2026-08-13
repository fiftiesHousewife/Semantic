package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * A repository's own documentation, as one scope: the markdown at its root and everything under its
 * documentation directory. These are where a codebase states outright what it is for, and a reading that
 * only ever saw source would be reading around the clearest evidence in the tree.
 *
 * <p>It is one scope rather than one per file, because what makes it worth reading is what it says as a
 * whole — and because a scope compared against the repository answers a question worth asking: does the
 * documentation talk about what the code is written in, or about something else?
 */
public final class DocumentationScope {

    private static final String NAME = "documentation";
    private static final String MARKDOWN_SUFFIX = ".md";
    private static final String DOCUMENTATION_DIRECTORY = "docs";

    public List<SourceScope> under(final Path root) {
        final List<Path> files = Stream.concat(markdownIn(root), markdownUnder(root.resolve(DOCUMENTATION_DIRECTORY)))
                .sorted()
                .toList();
        return files.isEmpty() ? List.of() : List.of(new SourceScope(NAME, files));
    }

    private static Stream<Path> markdownIn(final Path directory) {
        try (Stream<Path> entries = Files.list(directory)) {
            return entries.filter(Files::isRegularFile).filter(DocumentationScope::isMarkdown).toList().stream();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to list " + directory, e);
        }
    }

    private static Stream<Path> markdownUnder(final Path directory) {
        if (!Files.isDirectory(directory)) {
            return Stream.empty();
        }
        try (Stream<Path> tree = Files.walk(directory)) {
            return tree.filter(Files::isRegularFile).filter(DocumentationScope::isMarkdown).toList().stream();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + directory, e);
        }
    }

    private static boolean isMarkdown(final Path file) {
        return file.getFileName().toString().endsWith(MARKDOWN_SUFFIX);
    }
}
