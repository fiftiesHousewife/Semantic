package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * A repository's own documentation, as one scope: the markdown at its root and everything under its
 * documentation directory. These are where a codebase states outright what it is for, and a reading that
 * only ever saw source would be reading around the clearest evidence in the tree.
 *
 * <p>It is one scope rather than one per file, because what makes it worth reading is what it says as a
 * whole — and because a scope compared against the repository answers a question worth asking: does the
 * documentation talk about what the code is written in, or about something else?
 *
 * <p><b>A repository's working notes are not its documentation.</b> A backlog and a set of session
 * conventions are written <em>about</em> the reading rather than about what the code is for, and reading
 * them is the instrument reading its own notes: the vocabulary of evidence, votes and witnesses is the
 * reader's own, and every occurrence of it in a plan or a to-do list is mass the reading awards itself.
 * That is the doctrine's own rule — do not mark your own homework — applied to the corpus rather than to
 * the resources. Generated reports are outside the scope already, by being neither at the root nor under
 * the documentation directory.
 */
public final class DocumentationScope {

    private static final String NAME = "documentation";
    private static final String MARKDOWN_SUFFIX = ".md";
    private static final String DOCUMENTATION_DIRECTORY = "docs";

    /** Notes on how the work is done, as against documentation of what the work is. */
    private static final Set<String> WORKING_NOTES = Set.of("BACKLOG.md", "CLAUDE.md", "AGENTS.md",
            "CONTRIBUTING.md", "CHANGELOG.md");

    public List<SourceScope> under(final Path root) {
        final List<Path> files = Stream.concat(markdownIn(root), markdownUnder(root.resolve(DOCUMENTATION_DIRECTORY)))
                .filter(file -> !isWorkingNote(file))
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

    private static boolean isWorkingNote(final Path file) {
        return WORKING_NOTES.contains(file.getFileName().toString());
    }

    private static boolean isMarkdown(final Path file) {
        return file.getFileName().toString().endsWith(MARKDOWN_SUFFIX);
    }
}
