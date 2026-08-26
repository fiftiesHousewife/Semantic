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

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws the domain overlaps of one published reading's significant words, under each bundled domain
 * source, into one page whose reader chooses the source. It consumes {@code reading.json} and reads no
 * tree. It is a diagnostic and writes nowhere near {@code output/}.
 */
@Slf4j
public final class DomainVennCommand {

    private static final String PAGE = "domain-venn.html";
    private static final String STYLESHEET = "domain-venn.css";
    private static final String BEHAVIOUR = "domain-venn.js";
    private static final String RESOURCES = "vocabulary/";

    private DomainVennCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final ReadingFolder reading = ReadingFolder.at(Path.of(System.getProperty(
                VocabularyPageCommand.READING_PROPERTY, VocabularyPageCommand.DEFAULT_READING)));
        final SignificantWords.Significant significant = SignificantWords.of(reading.export());
        wrote(Path.of(VocabularyPageCommand.REPORTS)
                        .resolve(reading.export().summary().repository()),
                overlaps(reading.export().summary().repository(), significant.words()),
                significant.signals());
    }

    /** The overlaps under every bundled domain source, in the order the page offers them. */
    static Map<String, DomainOverlap> overlaps(final String repository, final List<ScoredWord> words) {
        final WordNetLexicon lexicon = WordNetLexicon.fromClasspath();
        final Map<String, DomainOverlap> bySource = new LinkedHashMap<>();
        bySource.put("WordNet Domains",
                DomainOverlap.of(repository, words, lexicon::countedSenseDomainsOf));
        bySource.put("eXtended WordNet Domains",
                DomainOverlap.of(repository, words, lexicon::extendedCountedSenseDomainsOf));
        return bySource;
    }

    static Path wrote(final Path folder, final Map<String, DomainOverlap> overlaps, final int signals)
            throws IOException {
        Files.createDirectories(folder);
        final String data = new ObjectMapper().writeValueAsString(Map.of(
                "overlaps", overlaps,
                "sources", List.copyOf(overlaps.keySet()),
                "signals", signals));
        final Path page = folder.resolve(PAGE);
        Files.writeString(page.resolveSibling("domain-venn.json"), data);
        Files.writeString(page, new DomainVennPage(data, read(STYLESHEET), read(BEHAVIOUR)).markup());
        log.info("{} under {} domain sources: file://{}",
                overlaps.values().iterator().next().repository(), overlaps.size(),
                page.toAbsolutePath());
        return page;
    }

    /** The stylesheet and the script, read whole from the files they are authored in. */
    private static String read(final String asset) throws IOException {
        try (InputStream source = DomainVennCommand.class.getClassLoader()
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
