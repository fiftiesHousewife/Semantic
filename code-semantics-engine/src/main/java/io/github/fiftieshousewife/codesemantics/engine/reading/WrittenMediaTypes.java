package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.MediaTypes;

/**
 * The registered media types a tree writes as string literals. The parse discards every literal, because a
 * literal is somebody's vocabulary quoted — but a literal byte-identical to an IANA-registered identifier
 * is the one kind with a citation, since the publisher defined the string. Those are counted here, held
 * beside the reading and summed into no vote, and every other literal contributes nothing. No English is
 * read out of a literal.
 */
public final class WrittenMediaTypes {

    private static final Pattern STRING_LITERAL = Pattern.compile("\"([^\"\\\\\n]+)\"");

    /** One registered identifier and how often the tree writes it. */
    public record Sighting(String identifier, int occurrences) {
    }

    private final List<Sighting> sightings;

    private WrittenMediaTypes(final List<Sighting> sightings) {
        this.sightings = List.copyOf(sightings);
    }

    public static WrittenMediaTypes writtenUnder(final Path root, final MediaTypes registry) {
        final Map<String, Long> counts = new JavaSourceScopes().under(root).stream()
                .flatMap(scope -> scope.files().stream())
                .flatMap(file -> registeredIn(contentOf(file), registry))
                .collect(Collectors.groupingBy(identifier -> identifier, TreeMap::new, Collectors.counting()));
        return new WrittenMediaTypes(counts.entrySet().stream()
                .map(entry -> new Sighting(entry.getKey(), Math.toIntExact(entry.getValue())))
                .sorted(Comparator.comparingInt(Sighting::occurrences).reversed()
                        .thenComparing(Sighting::identifier))
                .toList());
    }

    public List<Sighting> sightings() {
        return sightings;
    }

    public int occurrences() {
        return sightings.stream().mapToInt(Sighting::occurrences).sum();
    }

    private static Stream<String> registeredIn(final String source, final MediaTypes registry) {
        return STRING_LITERAL.matcher(source).results()
                .map(literal -> literal.group(1))
                .filter(registry::registers);
    }

    private static String contentOf(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }
}
