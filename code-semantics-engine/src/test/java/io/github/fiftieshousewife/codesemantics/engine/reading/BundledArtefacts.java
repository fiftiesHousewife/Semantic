package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.jar.JarFile;
import java.util.stream.Stream;

/**
 * The entries this module publishes, read from the classpath the build hands over as
 * {@code cs.published.artefacts} — a jar or a directory of classes, read the same way.
 *
 * <p>Neither the source tree (a file can be excluded from the jar) nor the test JVM's own classpath (it
 * carries the test classes and their fixtures, including the name a test mentions to prove it can say no)
 * answers what ships.
 */
public final class BundledArtefacts {

    private static final String PUBLISHED = "cs.published.artefacts";
    private static final String CLASS = ".class";
    private static final String METADATA = "META-INF/";

    private final Path project;

    private final String published;

    public BundledArtefacts() {
        this(new HostTree().root(), System.getProperty(PUBLISHED, ""));
    }

    BundledArtefacts(final Path project, final String published) {
        this.project = project.toAbsolutePath().normalize();
        if (published.isBlank()) {
            throw new IllegalStateException("Nothing states what this module publishes. The test convention "
                    + "sets " + PUBLISHED + "; a JVM started without it cannot tell a published artefact "
                    + "from a test fixture, and would answer this question by scanning itself.");
        }
        this.published = published;
    }

    /** Every entry this project's own artefacts carry, as the path a class would ask the loader for. */
    public List<String> entries() {
        return ours().flatMap(BundledArtefacts::within).toList();
    }

    /** The bytes of every class this project ships, which is where a resource name has to appear. */
    public List<byte[]> classes() {
        return ours().flatMap(BundledArtefacts::classesIn).toList();
    }

    private Stream<Path> ours() {
        return Arrays.stream(published.split(java.io.File.pathSeparator))
                .map(entry -> Path.of(entry).toAbsolutePath().normalize())
                .filter(entry -> entry.startsWith(project))
                .filter(Files::exists);
    }

    private static Stream<String> within(final Path artefact) {
        return names(artefact).filter(name -> !name.endsWith(CLASS)).filter(name -> !name.startsWith(METADATA));
    }

    private static Stream<byte[]> classesIn(final Path artefact) {
        return names(artefact).filter(name -> name.endsWith(CLASS)).map(name -> bytes(artefact, name));
    }

    private static Stream<String> names(final Path artefact) {
        return Files.isDirectory(artefact) ? namesUnder(artefact) : namesIn(artefact);
    }

    private static Stream<String> namesUnder(final Path directory) {
        try (Stream<Path> walk = Files.walk(directory)) {
            return walk.filter(Files::isRegularFile)
                    .map(file -> directory.relativize(file).toString().replace('\\', '/')).toList().stream();
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static Stream<String> namesIn(final Path jar) {
        try (JarFile opened = new JarFile(jar.toFile())) {
            return opened.stream().filter(entry -> !entry.isDirectory())
                    .map(java.util.zip.ZipEntry::getName).toList().stream();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read the bundled artefact " + jar, e);
        }
    }

    private static byte[] bytes(final Path artefact, final String name) {
        try {
            if (Files.isDirectory(artefact)) {
                return Files.readAllBytes(artefact.resolve(name));
            }
            try (JarFile opened = new JarFile(artefact.toFile())) {
                return opened.getInputStream(opened.getEntry(name)).readAllBytes();
            }
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + name + " from " + artefact, e);
        }
    }
}
