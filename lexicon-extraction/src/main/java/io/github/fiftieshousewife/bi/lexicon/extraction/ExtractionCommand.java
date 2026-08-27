package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * Runs one bundled extraction by name: {@code <taxonomy> <sources> <resources directory>}, where sources
 * is empty or comma-joined in the order the entry states. {@link BundledExtractions} holds the routing;
 * the named extraction's own class holds the pin and the acceptance.
 */
public final class ExtractionCommand {

    private ExtractionCommand() {
    }

    public static void main(final String[] args) throws Exception {
        if (args.length < 3) {
            throw new IllegalArgumentException(
                    "Usage: ExtractionCommand <taxonomy> <sources, comma-joined or empty> <resources dir>");
        }
        BundledExtractions.named(args[0]).extract(sourcesIn(args[1]), Path.of(args[2]));
    }

    private static List<String> sourcesIn(final String joined) {
        return Stream.of(joined.split(",", -1))
                .map(String::strip)
                .toList();
    }
}
