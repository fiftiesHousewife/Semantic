package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A downloaded OpenAlex snapshot, read as the parts its manifest names.
 *
 * <p>The publisher serves every part under the same file name inside a different {@code updated_date}
 * folder, so a download that flattens them numbers the collisions and nothing on disk says which part is
 * which. The manifest states a length per part, and a part is therefore the file of that length: one such
 * file is the part, none or several is a directory this manifest does not describe and the read fails.
 */
public final class OpenAlexSnapshot {

    private static final String COMPRESSED = ".gz";

    /** The manifest's parts, each carrying the publisher's own URL as its name. */
    public List<ContentDigest.Member> in(final Path directory, final OpenAlexManifest manifest)
            throws IOException {
        final Map<Long, List<Path>> byLength = compressedIn(directory);
        return manifest.parts().stream().map(part -> member(part, byLength)).toList();
    }

    private static ContentDigest.Member member(final OpenAlexManifest.Part part,
            final Map<Long, List<Path>> byLength) {
        final List<Path> found = byLength.getOrDefault((long) part.contentLength(), List.of());
        if (found.size() != 1) {
            throw new IllegalArgumentException("The snapshot directory holds " + found.size() + " files of "
                    + part.contentLength() + " bytes " + named(found) + ", where the manifest states one "
                    + "part of that length: " + part.url());
        }
        return new ContentDigest.Member(part.url(), bytesOf(found.get(0)));
    }

    private static String named(final List<Path> found) {
        return found.stream().map(path -> path.getFileName().toString())
                .collect(Collectors.joining(", ", "(", ")"));
    }

    private static Map<Long, List<Path>> compressedIn(final Path directory) throws IOException {
        try (Stream<Path> entries = Files.list(directory)) {
            return entries.filter(Files::isRegularFile)
                    .filter(path -> path.getFileName().toString().endsWith(COMPRESSED))
                    .collect(Collectors.groupingBy(OpenAlexSnapshot::lengthOf));
        }
    }

    private static long lengthOf(final Path path) {
        try {
            return Files.size(path);
        } catch (final IOException e) {
            throw new IllegalArgumentException("The snapshot directory holds an unreadable file: " + path, e);
        }
    }

    private static byte[] bytesOf(final Path path) {
        try {
            return Files.readAllBytes(path);
        } catch (final IOException e) {
            throw new IllegalArgumentException("The snapshot directory holds an unreadable part: " + path, e);
        }
    }
}
