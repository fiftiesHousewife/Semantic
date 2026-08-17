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
 * What this project actually ships, read off the classpath the tests run on rather than off the source tree.
 *
 * <p>The two questions asked of a bundled resource — does it say where it came from, and does anything read
 * it — are questions about the published artefact. A source directory answers neither: a file can sit in
 * {@code src/main/resources} and be excluded from the jar, and a class can name a resource that the module
 * bundling it never sees.
 *
 * <p>So the entries come from what the build says this module publishes, which the test convention hands
 * over as {@code cs.published.artefacts}. The test JVM's own classpath will not do: it carries the test
 * classes and their fixtures too, and a test that scans itself finds every name it mentions — including the
 * one it mentions to prove it can say no. Narrowing that to the artefacts under this project is then what
 * separates this library's own vocabulary from a dependency's.
 *
 * <p>Both a jar and a directory of classes appear on that path depending on how the build assembled a
 * module, and both are read the same way here.
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
