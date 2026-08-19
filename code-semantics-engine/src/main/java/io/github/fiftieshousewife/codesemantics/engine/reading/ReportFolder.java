package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Where a reading writes what it found: {@code output/} at the root of the reader's own tree, kept out of
 * {@code build/} so a published file survives {@code clean} and sits where a person looks.
 *
 * <p>The folder is <b>this project's</b> and not the read repository's, so a reading pointed at another
 * clone never writes into somebody else's working tree. What the files are <b>named</b> is settled by what
 * was read: this repository's reading of itself writes into {@code output/} directly, and a reading of any
 * other clone writes into a folder of that clone's own name beneath it, so a {@code -Dcs.clone.dir} run
 * cannot silently replace the published figures.
 *
 * <p>{@code -Dcs.output.dir} overrides the base. Without one the folder is resolved from the module
 * directory the tests run in.
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
     * is running and from {@code -Dcs.output.dir}. A caller who knows both names them, which is the
     * three-argument form, and nothing about a published reading depends on a property being set.
     */
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

    /**
     * The named artefact, with its folder made — a reading that cannot write has nothing to say. The folder
     * is the one its own format states.
     */
    public Path file(final String name) throws IOException {
        final Path kind = folder.resolve(PublishedFormat.of(name).folder());
        Files.createDirectories(kind);
        return kind.resolve(name);
    }
}
