package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * The service registrations a working tree publishes: each file under a source set's resources at
 * {@code META-INF/services} is named for a service interface, and its lines name the providers. The path and
 * the file's meaning are the platform's own deployment contract, stated by {@link java.util.ServiceLoader},
 * so reading one cites a specification. Imports say what a repository calls; these files say what it
 * provides, and the two are reported beside each other rather than summed.
 *
 * <p>The anchor is the source set, as it is for {@link JavaSourceScopes}: a registry under {@code build/} is
 * the build's copy of one of these, not a second registration.
 */
public final class ProvidedServices {

    /** The resource directory {@code ServiceLoader}'s deployment contract names. */
    private static final Path SERVICES_DIRECTORY = Path.of("META-INF", "services");
    private static final String RESOURCES_DIRECTORY = "resources";
    private static final String SOURCE_SET_ROOT = "src";
    private static final String COMMENT = "#";

    /** One registry file: the interface it is named for, and how many providers its lines name. */
    public record Registration(String serviceInterface, int providers) {
    }

    private final List<Registration> registrations;

    private ProvidedServices(final List<Registration> registrations) {
        this.registrations = List.copyOf(registrations);
    }

    public static ProvidedServices statedUnder(final Path root) {
        final StatedExclusions excluded = StatedExclusions.statedUnder(root);
        return new ProvidedServices(registryDirectories(root).stream()
                .flatMap(ProvidedServices::filesIn)
                .filter(file -> !excluded.excludes(root.relativize(file)))
                .map(ProvidedServices::registration)
                .sorted(Comparator.comparing(Registration::serviceInterface))
                .toList());
    }

    public List<Registration> registrations() {
        return registrations;
    }

    private static List<Path> registryDirectories(final Path root) {
        try (Stream<Path> tree = Files.walk(root)) {
            return tree.filter(Files::isDirectory)
                    .filter(ProvidedServices::isASourceSetsServicesDirectory)
                    .sorted()
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to walk " + root, e);
        }
    }

    private static boolean isASourceSetsServicesDirectory(final Path directory) {
        final int depth = directory.getNameCount();
        return depth > 4
                && directory.getFileName().equals(SERVICES_DIRECTORY.getFileName())
                && directory.getName(depth - 2).equals(SERVICES_DIRECTORY.getName(0))
                && RESOURCES_DIRECTORY.equals(directory.getName(depth - 3).toString())
                && SOURCE_SET_ROOT.equals(directory.getName(depth - 5).toString());
    }

    private static Stream<Path> filesIn(final Path directory) {
        try (Stream<Path> entries = Files.list(directory)) {
            return entries.filter(Files::isRegularFile).toList().stream();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to list " + directory, e);
        }
    }

    private static Registration registration(final Path file) {
        try {
            return new Registration(file.getFileName().toString(), (int) Files.readAllLines(file).stream()
                    .map(String::strip)
                    .filter(line -> !line.isEmpty() && !line.startsWith(COMMENT))
                    .count());
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }
}
