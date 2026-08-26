package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.engine.term.ControlTaxonomies;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws the out-of-domain controls' phrase matches of one published reading as trees, one per control, into
 * one page. It consumes {@code evidence.json} and reads no tree. It is a diagnostic and writes nowhere near
 * {@code output/}.
 */
@Slf4j
public final class ControlMatchesCommand {

    private static final String PAGE = "control-matches.html";
    private static final String DATA = "control-matches.json";
    private static final String STYLESHEET = "control-matches.css";
    private static final String RESOURCES = "vocabulary/";

    private ControlMatchesCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final ReadingFolder reading = ReadingFolder.at(Path.of(System.getProperty(
                VocabularyPageCommand.READING_PROPERTY, VocabularyPageCommand.DEFAULT_READING)));
        final String repository = reading.export().summary().repository();
        wrote(Path.of(VocabularyPageCommand.REPORTS).resolve(repository), repository, trees(reading));
    }

    /** One tree per control, from the matches the evidence already records. */
    static List<ControlTree> trees(final ReadingFolder reading) {
        final List<ReadingFolder.TermMatchRow> matches = reading.termMatches();
        return Stream.of(ControlTaxonomies.values())
                .map(control -> ControlTree.of(control.index().source(), matches,
                        control.publishedConcepts()))
                .toList();
    }

    static Path wrote(final Path folder, final String repository, final List<ControlTree> trees)
            throws IOException {
        Files.createDirectories(folder);
        final Path page = folder.resolve(PAGE);
        Files.writeString(page.resolveSibling(DATA),
                new ObjectMapper().writeValueAsString(Map.of("repository", repository, "trees", trees)));
        Files.writeString(page, new ControlMatchesPage(repository, trees, read(STYLESHEET)).markup());
        log.info("{} under {} controls: file://{}", repository, trees.size(), page.toAbsolutePath());
        return page;
    }

    /** The stylesheet, read whole from the file it is authored in. */
    private static String read(final String asset) throws IOException {
        try (InputStream source = ControlMatchesCommand.class.getClassLoader()
                .getResourceAsStream(RESOURCES + asset)) {
            if (source == null) {
                throw new IllegalStateException(String.format(Locale.ROOT,
                        "The page's %s is not on the classpath",
                        asset));
            }
            return new String(source.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
