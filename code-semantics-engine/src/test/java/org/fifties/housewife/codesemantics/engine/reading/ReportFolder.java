package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Where the self reading writes what it found.
 *
 * <p>It is {@code output/} at the root of this project rather than somewhere under {@code build/}, because
 * these are reports a person is meant to open and keep open. A path under {@code build/} says "an artefact
 * of compiling" to everyone who reads it, is deleted by {@code clean} without warning, and is buried four
 * directories deep in a module nobody was looking in.
 *
 * <p>The folder is <b>this project's</b> and not the read repository's. A reading pointed at another clone
 * through {@code -Dcs.clone.dir} must not write its findings into somebody else's working tree, so the
 * output location is settled by where the reader lives and never by what it is reading.
 *
 * <p>{@code -Dcs.output.dir} overrides it, and is the second of the two properties the test convention
 * forwards to a forked JVM. Without one the folder is resolved from the module directory the tests run in.
 */
public final class ReportFolder {

    private static final String PROPERTY = "cs.output.dir";

    /** The test JVM's working directory is the module's, and the project root is one above it. */
    private static final String BESIDE_THE_MODULE = "../output";

    public Path root() {
        return Path.of(System.getProperty(PROPERTY, BESIDE_THE_MODULE));
    }

    /** The named report, with its folder made — a reading that cannot write has nothing to say. */
    public Path file(final String name) throws IOException {
        final Path folder = root();
        Files.createDirectories(folder);
        return folder.resolve(name);
    }

    /**
     * Writes a report and the page a browser renders it as, side by side under one name. Markdown is what
     * a renderer is easy to write and to assert against; HTML is what a reader opens.
     */
    public void wrote(final String name, final String markdown, final String title) throws IOException {
        Files.writeString(file(name + ".md"), markdown);
        Files.writeString(file(name + ".html"), new MarkdownRendering().of(title, markdown));
    }
}
