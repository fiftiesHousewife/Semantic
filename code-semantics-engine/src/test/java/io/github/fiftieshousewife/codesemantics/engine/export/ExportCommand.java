package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;

import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * Reads a working tree and writes the export, with no report produced and no test framework involved. That is
 * what says the documents are a rendering of this file rather than the other way round.
 *
 * <p>The commit is an argument because the library reads no {@code .git}: what a working tree is checked out
 * at is a fact its caller states, the same way {@code RepositoryFacts} carries every other hosted fact.
 */
public final class ExportCommand {

    private ExportCommand() {
    }

    /** What the reading writes beside the export to say what moved since the last one. */
    private static final String CHANGES = "changes";

    /** The taxonomies matched beside the bundled vocabulary the shared reading already holds. */
    static List<TermIndex> alsoMatched() {
        return MatchedTaxonomies.besides(MatchedTaxonomies.OLIA);
    }

    public static void main(final String[] arguments) throws IOException {
        wrote(commitIn(arguments));
    }

    /** Reads the clone under reading — shared with any reading already taken in this JVM — and writes the export. */
    static Path wrote(final String commit) throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final ReportFolder folder = ReportFolder.forReadingOf(reading.root());
        final Path file = folder.file(ExportFile.NAME);
        final ExportFile exports = new ExportFile();
        final Optional<ReadingExport> previous = previousReading(exports, file);
        final ReadingExport current = new ExportedReading().of(reading.reading(), commit, alsoMatched(),
                reading.terms(), reading.arxivField(), reading.namesChance());
        exports.wrote(file, current);
        wroteChanges(folder, previous, current);
        return file;
    }

    /**
     * The reading already on disk, where there is one this shape can read.
     *
     * <p>An export states its own schema version so a consumer can branch on a change rather than discover
     * it by failing, and this consumer is the first one: a run after the shape moves would otherwise read
     * the previous document into the new records and throw. A version it cannot read is a run with nothing
     * to compare against, which is the same case as the first run ever.
     */
    private static Optional<ReadingExport> previousReading(final ExportFile exports, final Path file) {
        if (!Files.exists(file)) {
            return Optional.empty();
        }
        try {
            final ReadingExport read = exports.in(file);
            return ReadingExport.SCHEMA_VERSION.equals(read.schemaVersion())
                    ? Optional.of(read) : Optional.empty();
        } catch (final IOException | RuntimeException cannotRead) {
            return Optional.empty();
        }
    }

    /**
     * The comparison is written only where there is something to compare against. A first run has no previous
     * reading, and a report saying every figure moved from nothing would be a report about that rather than
     * about the repository.
     */
    private static void wroteChanges(final ReportFolder folder, final Optional<ReadingExport> previous,
                                     final ReadingExport current) throws IOException {
        if (previous.isEmpty()) {
            return;
        }
        folder.wrote(CHANGES, new ChangeReport().render(ReadingChanges.between(previous.get(), current)),
                "What moved since the last reading");
    }

    /** The commit the caller states, or nothing where it states none — an empty field, never a guess. */
    private static String commitIn(final String[] arguments) {
        return arguments.length == 0 ? "" : arguments[0];
    }
}
