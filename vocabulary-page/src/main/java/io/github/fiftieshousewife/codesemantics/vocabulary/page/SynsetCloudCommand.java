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
import io.github.fiftieshousewife.codesemantics.engine.theme.SenseDomains;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws one repository's significant words as a cloud of WordNet senses, into one page.
 *
 * <p>The words are the same population every page here draws — the export's signals, merged under their
 * lemmas — and each is gathered under the sense it is most often written in, the reading
 * {@code SenseDomains} already takes. It is a diagnostic and writes nowhere near {@code output/}.
 */
@Slf4j
public final class SynsetCloudCommand {

    private static final String PAGE = "synset-cloud.html";
    private static final String STYLESHEET = "synset-cloud.css";
    private static final String BEHAVIOUR = "synset-cloud.js";
    private static final String RESOURCES = "vocabulary/";
    private static final String REPORTS = "vocabulary-page/build/reports/vocabulary";

    private SynsetCloudCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final RepositoryReading reading = RepositoryReading.of(new CloneUnderReading().root());
        final SignificantWords.Significant significant = SignificantWords.of(reading);
        wrote(Path.of(REPORTS).resolve(reading.root().getFileName().toString()),
                cloudOf(reading, significant), significant.signals(),
                leadingDomains(reading, significant));
    }

    /** The significant words gathered under their commonest senses. */
    static SynsetCloud cloud(final RepositoryReading reading) {
        return cloudOf(reading, SignificantWords.of(reading));
    }

    static SynsetCloud cloudOf(final RepositoryReading reading,
                                       final SignificantWords.Significant significant) {
        return SynsetCloud.of(reading.root().getFileName().toString(), significant.words(),
                WordNetLexicon.fromClasspath()::commonestSense, SenseDomains.fromClasspath());
    }

    /** The venn's own three domains, so a coloured mark here names the same thing a circle does there. */
    static List<String> leadingDomains(final RepositoryReading reading,
                                               final SignificantWords.Significant significant) {
        return DomainOverlap.of(reading.root().getFileName().toString(), significant.words(),
                        WordNetLexicon.fromClasspath()::countedSenseDomainsOf)
                .domains().stream()
                .map(DomainOverlap.Drawn::domain)
                .toList();
    }

    static Path wrote(final Path reports, final SynsetCloud cloud, final int signals,
                      final List<String> leadingDomains) throws IOException {
        Files.createDirectories(reports);
        final String data = new ObjectMapper().writeValueAsString(Map.of("cloud", cloud,
                "signals", signals, "leadingDomains", leadingDomains));
        final Path page = reports.resolve(PAGE);
        Files.writeString(page, new SynsetCloudPage(data, read(STYLESHEET), read(BEHAVIOUR)).markup());
        log.info("{} at {} senses: file://{}", cloud.repository(), cloud.senses().size(),
                page.toAbsolutePath());
        return page;
    }

    /** The stylesheet and the script, read whole from the files they are authored in. */
    private static String read(final String asset) throws IOException {
        try (InputStream source = SynsetCloudCommand.class.getClassLoader()
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
