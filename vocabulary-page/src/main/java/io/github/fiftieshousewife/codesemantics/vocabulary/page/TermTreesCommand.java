package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.term.ControlTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws every matched vocabulary's phrases of one published reading as trees, one per vocabulary — the
 * taxonomies every run matches and the out-of-domain controls alike, since which is which depends on the
 * repository under reading, not on the vocabulary. It consumes {@code evidence.json} and reads no tree. It
 * is a diagnostic and writes nowhere near {@code output/}.
 */
@Slf4j
public final class TermTreesCommand {

    private static final String PAGE = "term-trees.html";
    private static final String DATA = "term-trees.json";
    private static final String STYLESHEET = "term-trees.css";
    private static final String RESOURCES = "vocabulary/";

    private TermTreesCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final ReadingFolder reading = ReadingFolder.at(Path.of(System.getProperty(
                VocabularyPageCommand.READING_PROPERTY, VocabularyPageCommand.DEFAULT_READING)));
        final String repository = reading.export().summary().repository();
        wrote(Path.of(VocabularyPageCommand.REPORTS).resolve(repository), repository, trees(reading));
    }

    /** One tree per vocabulary the evidence records, the matched taxonomies first. */
    static List<TermTree> trees(final ReadingFolder reading) {
        final List<ReadingFolder.TermMatchRow> matches = reading.termMatches();
        return published().entrySet().stream()
                .map(vocabulary -> TermTree.of(vocabulary.getKey(), matches, vocabulary.getValue()))
                .toList();
    }

    /** Every vocabulary a reading matches, under the name its publisher states, in the order drawn. */
    private static Map<String, List<SkosConcept>> published() {
        final Map<String, List<SkosConcept>> published = new LinkedHashMap<>();
        Stream.of(MatchedTaxonomies.values())
                .forEach(taxonomy -> published.put(taxonomy.index().source(),
                        taxonomy.publishedConcepts()));
        Stream.of(ControlTaxonomies.values())
                .forEach(control -> published.put(control.index().source(),
                        control.publishedConcepts()));
        return published;
    }

    static Path wrote(final Path folder, final String repository, final List<TermTree> trees)
            throws IOException {
        Files.createDirectories(folder);
        final Path page = folder.resolve(PAGE);
        Files.writeString(page.resolveSibling(DATA),
                new ObjectMapper().writeValueAsString(Map.of("repository", repository, "trees", trees)));
        Files.writeString(page, new TermTreesPage(repository, trees, read(STYLESHEET)).markup());
        log.info("{} under {} controls: file://{}", repository, trees.size(), page.toAbsolutePath());
        return page;
    }

    /** The stylesheet, read whole from the file it is authored in. */
    private static String read(final String asset) throws IOException {
        try (InputStream source = TermTreesCommand.class.getClassLoader()
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
