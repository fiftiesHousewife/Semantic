package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws one repository's vocabulary as the funnel of the export's rules and the cloud of meanings that
 * survive them, into one page. It is a diagnostic and writes nowhere near {@code output/}, which holds
 * JSON and nothing else.
 */
@Slf4j
public final class VocabularyPageCommand {

    private static final String PAGE = "vocabulary.html";
    private static final String STYLESHEET = "vocabulary.css";
    private static final String BEHAVIOUR = "vocabulary.js";
    private static final String RESOURCES = "vocabulary/";
    private static final String REPORTS = "vocabulary-page/build/reports/vocabulary";

    private VocabularyPageCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final RepositoryReading reading = RepositoryReading.of(new CloneUnderReading().root());
        final VocabularyFunnel funnel = VocabularyFunnel.of(reading);
        wrote(Path.of(REPORTS).resolve(funnel.repository()), funnel, leadingDomains(reading));
    }

    /** The venn's own three domains, so a coloured mark here names the same thing a circle does there. */
    static List<String> leadingDomains(final RepositoryReading reading) {
        final SignificantWords.Significant significant = SignificantWords.of(reading);
        return DomainOverlap.of(reading.root().getFileName().toString(), significant.words(),
                        WordNetLexicon.fromClasspath()::countedSenseDomainsOf)
                .domains().stream()
                .map(DomainOverlap.Drawn::domain)
                .toList();
    }

    static Path wrote(final Path folder, final VocabularyFunnel funnel,
                      final List<String> leadingDomains) throws IOException {
        Files.createDirectories(folder);
        final String data = new ObjectMapper().writeValueAsString(Map.of("funnel", funnel,
                "leadingDomains", leadingDomains));
        final Path page = folder.resolve(PAGE);
        Files.writeString(page, new VocabularyPage(data, read(STYLESHEET), read(BEHAVIOUR)).markup());
        log.info("{}: {} names to {} meanings: file://{}", funnel.repository(), funnel.field(),
                funnel.tiles().size(), page.toAbsolutePath());
        return page;
    }

    /** The stylesheet and the script, read whole from the files they are authored in. */
    private static String read(final String asset) throws IOException {
        try (InputStream source = VocabularyPageCommand.class.getClassLoader()
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
