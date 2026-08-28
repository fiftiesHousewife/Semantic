package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

import lombok.extern.slf4j.Slf4j;

/**
 * Writes the one page comparing every published reading under {@code output/}.
 *
 * <p>Properties: {@code cs.reading.manifest} names a file stating an area per repository, and where the
 * run names none the stated-area column is empty on every row. It is named rather than found because the
 * manifest this project keeps is a test fixture whose own header states that it never votes.
 */
@Slf4j
public final class ReadingsCommand {

    static final String PAGE = "readings.html";

    private static final String OUTPUT = "output";
    private static final String STYLESHEET = "readings.css";
    private static final String MANIFEST_PROPERTY = "cs.reading.manifest";

    private ReadingsCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final Path reports = Path.of(VocabularyPageCommand.REPORTS);
        final StatedAreas stated = statedAreas();
        final Path page = wrote(reports, rows(EvaluationPagesCommand.readings(Path.of(OUTPUT)), stated),
                stated);
        log.info("The readings: file://{}", page.toAbsolutePath());
    }

    /** One row per reading, in the order the folders are read. */
    static List<ReadingRow> rows(final List<Path> readings, final StatedAreas stated) {
        return readings.stream()
                .map(folder -> ReadingFolder.at(folder).export())
                .map(export -> ReadingRow.of(export,
                        stated.of(export.summary().repository())))
                .toList();
    }

    static Path wrote(final Path reports, final List<ReadingRow> readings, final StatedAreas stated)
            throws IOException {
        Files.createDirectories(reports);
        final Path page = reports.resolve(PAGE);
        Files.writeString(page, new ReadingsPage(stylesheet()).markup(readings, stated));
        return page;
    }

    /** The manifest the run names, or none, which is what a consumer reading its own repository has. */
    private static StatedAreas statedAreas() {
        final String named = System.getProperty(MANIFEST_PROPERTY, "");
        return named.isBlank() ? StatedAreas.none() : StatedAreas.at(Path.of(named));
    }

    private static String stylesheet() throws IOException {
        try (InputStream source = ReadingsCommand.class.getClassLoader()
                .getResourceAsStream("vocabulary/" + STYLESHEET)) {
            if (source == null) {
                throw new IllegalStateException(String.format(Locale.ROOT,
                        "The readings page's %s is not on the classpath",
                        STYLESHEET));
            }
            return new String(source.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
