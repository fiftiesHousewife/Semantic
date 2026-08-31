package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/** Writes the one page listing every term match of every reading under {@code output/}. */
@Slf4j
public final class MatchesCommand {

    static final String PAGE = "matches.html";

    private static final String OUTPUT = "output";
    private static final String RESOURCES = "vocabulary/";
    private static final String SHARED = "page.css";
    private static final String STYLESHEET = "matches.css";

    private MatchesCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final Path page = wrote(Path.of(VocabularyPageCommand.REPORTS),
                EvaluationPagesCommand.readings(Path.of(OUTPUT)));
        log.info("Every term match: file://{}", page.toAbsolutePath());
    }

    static Path wrote(final Path reports, final List<Path> readings) throws IOException {
        Files.createDirectories(reports);
        final DrawnMatches matches = new DrawnMatches();
        final Map<String, List<DrawnMatch>> byRepository = new LinkedHashMap<>();
        for (final Path folder : readings) {
            final ReadingFolder reading = ReadingFolder.at(folder);
            final String repository = reading.export().summary().repository();
            byRepository.put(repository,
                    matches.of(repository, reading.termMatches(), reading.export().taxonomies()));
        }
        final Path page = reports.resolve(PAGE);
        Files.writeString(page,
                new MatchesPage(byRepository, read(SHARED) + read(STYLESHEET)).markup());
        return page;
    }

    private static String read(final String asset) throws IOException {
        try (InputStream source = MatchesCommand.class.getClassLoader()
                .getResourceAsStream(RESOURCES + asset)) {
            if (source == null) {
                throw new IllegalStateException(String.format(Locale.ROOT,
                        "The matches page's %s is not on the classpath", asset));
            }
            return new String(source.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
