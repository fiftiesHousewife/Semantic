package io.github.fiftieshousewife.codesemantics.engine.reading;

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
 * every figure the README quotes with somebody else's, and an evaluation set of thirty could keep only the last.
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

    /**
     * Where a reading of this clone writes, against the tree the reader itself lives in.
     *
     * <p>This is the convenience: it resolves the host tree and the output directory from where the reader
     * is running and from {@code -Dcs.reports.dir}. A caller who knows both names them, which is the
     * three-argument form, and nothing about a published reading depends on a property being set.
     */
    public static ReportFolder forReadingOf(final Path clone) {
        return forReadingOf(clone, new HostTree().root(), Path.of(System.getProperty(PROPERTY, BESIDE_THE_MODULE)));
    }

    /**
     * What renders the page beside each report.
     *
     * <p>The default writes the mechanical HTML twin every report in this repository has. A consumer wanting
     * markdown alone supplies a renderer returning nothing, which costs it no dependency and no file.
     */
    private PageRendering rendering =
            (title, markdown) -> java.util.Optional.of(new MarkdownRendering().of(title, markdown));

    /** Every report this folder writes gets a page from this renderer as well as its markdown. */
    public ReportFolder rendering(final PageRendering renderer) {
        this.rendering = renderer;
        return this;
    }

    static ReportFolder forReadingOf(final Path clone, final Path host, final Path base) {
        final Path read = clone.toAbsolutePath().normalize();
        return read.equals(host.toAbsolutePath().normalize()) ? new ReportFolder(base)
                : new ReportFolder(base.resolve(read.getFileName().toString()));
    }

    public Path root() {
        return folder;
    }

    /**
     * The named artefact, with its folder made — a reading that cannot write has nothing to say. The folder
     * is the one its own format states, so what a consumer parses, what a person reads and what a browser
     * opens are not one heap of forty files.
     */
    public Path file(final String name) throws IOException {
        final Path kind = folder.resolve(PublishedFormat.of(name).folder());
        Files.createDirectories(kind);
        return kind.resolve(name);
    }

    /**
     * Writes a report and the page a browser renders it as, from one source. The markdown is the report and
     * the page is a rendering of it, so the two cannot state different figures.
     */
    public void wrote(final String name, final String markdown, final String title) throws IOException {
        wrote(name, markdown, title, rendering);
    }

    /**
     * The markdown, and the page a caller's own renderer makes of it.
     *
     * <p>The renderer is handed in rather than reached for, because the one this repository uses is built on
     * a markup library the published jar deliberately does not carry. A consumer writing reports supplies
     * its own or writes markdown alone; neither costs the jar a dependency it exists without.
     */
    public void wrote(final String name, final String markdown, final String title,
                      final PageRendering renderer) throws IOException {
        Files.writeString(file(name + ".md"), markdown);
        final java.util.Optional<String> page = renderer.of(title, markdown);
        if (page.isPresent()) {
            Files.writeString(file(name + ".html"), page.get());
        }
    }

    /** How a report's markdown becomes the page beside it, or nothing where a caller wants markdown alone. */
    @FunctionalInterface
    public interface PageRendering {
        java.util.Optional<String> of(String title, String markdown);
    }


}
