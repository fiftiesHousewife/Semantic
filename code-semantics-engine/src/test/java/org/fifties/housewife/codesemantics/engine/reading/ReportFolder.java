package org.fifties.housewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Where a reading writes what it found.
 *
 * <p>It is {@code output/} at the root of this project rather than somewhere under {@code build/}, because
 * these are reports a person is meant to open and keep open. A path under {@code build/} says "an artefact
 * of compiling" to everyone who reads it, is deleted by {@code clean} without warning, and is buried four
 * directories deep in a module nobody was looking in.
 *
 * <p>The folder is <b>this project's</b> and not the read repository's. A reading pointed at another clone
 * must not write its findings into somebody else's working tree, so where the reports go is settled by where
 * the reader lives and never by what it is reading.
 *
 * <p>What they are <b>named</b> is settled by what was read. This repository's reading of itself is the one
 * it publishes, so it writes into {@code output/} directly; a reading of any other clone writes into a folder
 * of that clone's own name beneath it. Without that a single {@code -Dcs.clone.dir} run silently replaces
 * every figure the README quotes with somebody else's, and a panel of thirty could keep only the last.
 *
 * <p>{@code -Dcs.output.dir} overrides the base, and is the second of the two properties the test convention
 * forwards to a forked JVM. Without one the folder is resolved from the module directory the tests run in.
 */
public final class ReportFolder {

    private static final String PROPERTY = "cs.output.dir";

    /** The test JVM's working directory is the module's, and the project root is one above it. */
    private static final String BESIDE_THE_MODULE = "../output";

    private final Path folder;

    private ReportFolder(final Path folder) {
        this.folder = folder;
    }

    /** Where a reading of this clone writes, against the tree the reader itself lives in. */
    public static ReportFolder forReadingOf(final Path clone) {
        return forReadingOf(clone, new HostTree().root(), Path.of(System.getProperty(PROPERTY, BESIDE_THE_MODULE)));
    }

    static ReportFolder forReadingOf(final Path clone, final Path host, final Path base) {
        final Path read = clone.toAbsolutePath().normalize();
        return read.equals(host.toAbsolutePath().normalize()) ? new ReportFolder(base)
                : new ReportFolder(base.resolve(read.getFileName().toString()));
    }

    public Path root() {
        return folder;
    }

    /** The named report, with its folder made — a reading that cannot write has nothing to say. */
    public Path file(final String name) throws IOException {
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
