package org.fifties.housewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

import org.fifties.housewife.codesemantics.engine.reading.ReportFolder;
import org.fifties.housewife.codesemantics.engine.reading.TreeReading;

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

    public static void main(final String[] arguments) throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final ReportFolder folder = ReportFolder.forReadingOf(reading.root());
        final Path file = folder.file(ExportFile.NAME);
        final ExportFile exports = new ExportFile();
        final Optional<ReadingExport> previous = Files.exists(file)
                ? Optional.of(exports.in(file)) : Optional.empty();
        final ReadingExport current = new ExportedReading().of(reading.reading(), commitIn(arguments));
        exports.wrote(file, current);
        wroteChanges(folder, previous, current);
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
