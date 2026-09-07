package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedSourceSets;

/** One file after the parse and before its imports have been sorted. */
record ReadFile(String scope, String path, int lines, ParsedSource parsed) {

    static ReadFile of(final Path root, final String scope, final Path file,
                       final List<SourceReader> readers) {
        final Optional<SourceReader> reader = readers.stream()
                .filter(candidate -> candidate.reads(file))
                .findFirst();
        final String source = reader.filter(SourceReader::opensTheFile)
                .map(found -> contentOf(file))
                .orElse("");
        return new ReadFile(scope, root.relativize(file).toString(), (int) source.lines().count(),
                reader.map(found -> found.read(file, source))
                        .orElseGet(ParsedSource::unreadable));
    }

    private static String contentOf(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException(String.format(Locale.ROOT,
                    "Failed to read %s",
                    file), e);
        }
    }

    ParsedFile retaining(final ImportOrigins origins, final ImportTally tally,
                         final List<NameOccurrence> alsoDeclared, final PublishedSourceSets published,
                         final CopiedComments copied) {
        final List<NameOccurrence> kept = new ArrayList<>(alsoDeclared);
        parsed.occurrences().forEach(occurrence -> {
            if (occurrence.form() != NameForm.IMPORT) {
                kept.add(copied.weighing(occurrence));
                return;
            }
            final ImportOrigin origin = origins.of(occurrence.text());
            tally.counted(origin);
            if (origin != ImportOrigin.EXTERNAL) {
                return;
            }
            if (published.publishes(scope)) {
                kept.add(occurrence);
            } else {
                tally.setAsideAsToolchain();
            }
        });
        return new ParsedFile(scope, path, lines, kept, parsed.outcome());
    }
}
