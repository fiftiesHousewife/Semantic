package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

/**
 * The issues a fetch step pinned beside a statement, read back as the tracker stated them. The file is
 * {@code fetch/fetch-pull-requests.sh}'s: one row per issue the statement references, of the project the
 * repository's own pom names, with the type the tracker states verbatim. The export republishes the key,
 * the type and the tracker's page; the summary and the retrieval date stay in the pinned file.
 */
final class PinnedIssues {

    private static final String COMMENT = "#";

    private static final String COLUMN = "\t";

    private static final int COLUMNS = 5;

    private PinnedIssues() {
    }

    static List<ExportedWork.Issue> in(final Path file) {
        try {
            return Files.readAllLines(file).stream()
                    .filter(line -> !line.isBlank() && !line.startsWith(COMMENT))
                    .map(line -> issue(file, line))
                    .toList();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }

    private static ExportedWork.Issue issue(final Path file, final String line) {
        final String[] columns = line.split(COLUMN, -1);
        if (columns.length != COLUMNS) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "%d columns where %s states %d: %s",
                    columns.length, file.getFileName(), COLUMNS, line));
        }
        return new ExportedWork.Issue(columns[0], columns[1], columns[2]);
    }
}
