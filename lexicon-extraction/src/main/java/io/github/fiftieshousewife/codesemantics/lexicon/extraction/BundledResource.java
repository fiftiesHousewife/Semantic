package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * One file of the bundled resource directory, written where an extraction names it.
 *
 * <p>Every extraction states the same two things about the file it produces and they are stated here
 * instead: the directory above it is created, so an extraction pointed at a resource directory that does
 * not exist yet writes the file rather than failing on the directory, and an earlier extraction's file is
 * replaced rather than added to.
 */
final class BundledResource {

    private final Path path;

    BundledResource(final Path path) {
        this.path = path;
    }

    /** The rendered text at that path, the directory above it made where it was not there. */
    Path written(final String rendered) throws IOException {
        Files.createDirectories(path.toAbsolutePath().getParent());
        return Files.writeString(path, rendered);
    }
}
