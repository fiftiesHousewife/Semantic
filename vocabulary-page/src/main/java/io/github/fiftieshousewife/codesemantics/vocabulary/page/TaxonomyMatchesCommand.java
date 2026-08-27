package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.engine.term.ControlTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws every published reading's reported term matches per vocabulary on one page, phrases counted
 * apart from single words, so the vocabularies can be compared on the evidence that separates fields
 * from the evidence any repository hits. It consumes the committed readings under {@code output/} and
 * reads no tree. It is a diagnostic and writes nowhere near {@code output/}.
 */
@Slf4j
public final class TaxonomyMatchesCommand {

    static final String PAGE = "taxonomy-matches.html";
    private static final String DATA = "taxonomy-matches.json";
    private static final String STYLESHEET = "taxonomy-matches.css";
    private static final String BEHAVIOUR = "taxonomy-matches.js";
    private static final String RESOURCES = "vocabulary/";

    /** One reading's counts, under the repository they were read from. */
    record RepositoryMatches(String repository, List<VocabularyMatchCounts> counts) {

        RepositoryMatches {
            counts = List.copyOf(counts);
        }
    }

    private TaxonomyMatchesCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final Path reports = Path.of(VocabularyPageCommand.REPORTS);
        wrote(reports, rows(EvaluationPagesCommand.readings(Path.of("output"))));
    }

    /** Every reading's counts, over the one vocabulary list the matching enumerates. */
    static List<RepositoryMatches> rows(final List<Path> readings) {
        final List<String> vocabularies = vocabularies();
        return readings.stream()
                .map(ReadingFolder::at)
                .map(reading -> new RepositoryMatches(reading.export().summary().repository(),
                        VocabularyMatchCounts.of(vocabularies, reading.termMatches())))
                .toList();
    }

    /** The vocabularies the matching enumerates, under the names their publishers state. */
    static List<String> vocabularies() {
        return Stream.concat(
                        Stream.of(MatchedTaxonomies.values()).map(taxonomy -> taxonomy.index().source()),
                        Stream.of(ControlTaxonomies.values()).map(control -> control.index().source()))
                .toList();
    }

    static Path wrote(final Path reports, final List<RepositoryMatches> rows) throws IOException {
        Files.createDirectories(reports);
        final Path page = reports.resolve(PAGE);
        Files.writeString(page.resolveSibling(DATA),
                new ObjectMapper().writeValueAsString(Map.of("repositories", rows)));
        Files.writeString(page,
                new TaxonomyMatchesPage(rows, vocabularies(), read(STYLESHEET), read(BEHAVIOUR)).markup());
        log.info("{} readings compared: file://{}", rows.size(), page.toAbsolutePath());
        return page;
    }

    /** The stylesheet and the script, read whole from the files they are authored in. */
    private static String read(final String asset) throws IOException {
        try (InputStream source = TaxonomyMatchesCommand.class.getClassLoader()
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
