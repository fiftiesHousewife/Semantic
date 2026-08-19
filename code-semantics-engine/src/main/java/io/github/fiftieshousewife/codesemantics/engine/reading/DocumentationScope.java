package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * A repository's own documentation, as one scope: the markdown and AsciiDoc at its root and everything
 * under its documentation directory. These are where a codebase states outright what it is for, and a reading that
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
 * the resources. Which files those are is the repository's own statement and not this reading's, so it is
 * read from {@link StatedExclusions} rather than carried here as a list of names. Generated reports are
 * outside the scope already, by being neither at the root nor under the documentation directory.
 */
public final class DocumentationScope {

    private static final String NAME = "documentation";
    private static final List<String> PROSE_SUFFIXES = List.of(".md", ".adoc");
    private static final String DOCUMENTATION_DIRECTORY = "docs";

    public List<SourceScope> under(final Path root) {
        final StatedExclusions excluded = StatedExclusions.statedUnder(root);
        final List<Path> files = Stream.concat(proseIn(root), proseUnder(root.resolve(DOCUMENTATION_DIRECTORY)))
                .filter(file -> !excluded.excludes(root.relativize(file)))
                .sorted()
                .toList();
        return files.isEmpty() ? List.of() : List.of(new SourceScope(NAME, files));
    }

    private static Stream<Path> proseIn(final Path directory) {
        try (Stream<Path> entries = Files.list(directory)) {
            return entries.filter(Files::isRegularFile).filter(DocumentationScope::isProse).toList().stream();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to list " + directory, e);
        }
    }

    private static Stream<Path> proseUnder(final Path directory) {
        if (!Files.isDirectory(directory)) {
            return Stream.empty();
        }
        try (Stream<Path> tree = Files.walk(directory)) {
            return tree.filter(Files::isRegularFile).filter(DocumentationScope::isProse).toList().stream();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + directory, e);
        }
    }

    private static boolean isProse(final Path file) {
        final String name = file.getFileName().toString();
        return PROSE_SUFFIXES.stream().anyMatch(name::endsWith);
    }
}
