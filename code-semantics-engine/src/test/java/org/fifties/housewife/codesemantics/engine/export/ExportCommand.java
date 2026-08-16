package org.fifties.housewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Path;

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

    public static void main(final String[] arguments) throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Path file = ReportFolder.forReadingOf(reading.root()).file(ExportFile.NAME);
        new ExportFile().wrote(file, new ExportedReading().of(reading, commitIn(arguments)));
    }

    /** The commit the caller states, or nothing where it states none — an empty field, never a guess. */
    private static String commitIn(final String[] arguments) {
        return arguments.length == 0 ? "" : arguments[0];
    }
}
