package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.SenseDomains;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Draws the WordNet-domain overlaps of one repository's significant words, into one page.
 *
 * <p>The words are the export's own signals — the published names' ranking, cut at each reference's chance
 * bar — so the picture and {@code reading.json} cannot disagree about which words are significant. Two
 * spellings the dictionary reads as one word are merged under the lemma with their claims summed, which is
 * the pipeline's own last stage. It is a diagnostic and writes nowhere near {@code output/}.
 */
@Slf4j
public final class DomainVennCommand {

    private static final String PAGE = "domain-venn.html";
    private static final String STYLESHEET = "domain-venn.css";
    private static final String BEHAVIOUR = "domain-venn.js";
    private static final String RESOURCES = "vocabulary/";
    private static final String REPORTS = "vocabulary-page/build/reports/vocabulary";

    private DomainVennCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        wrote(Path.of(REPORTS), overlap(RepositoryReading.of(new CloneUnderReading().root())));
    }

    /** The significant words placed by the domains their senses state. */
    static DomainOverlap overlap(final RepositoryReading reading) {
        return DomainOverlap.of(reading.root().getFileName().toString(), significant(reading),
                SenseDomains.pooledFromClasspath());
    }

    /**
     * The export's signals: every published name's word that clears each reference's own chance bar and
     * that English did not supply, merged under its lemma.
     */
    private static List<DomainOverlap.ScoredWord> significant(final RepositoryReading reading) {
        final WrittenWords written = new PublishedNames().published(reading.legibility());
        final ChosenWords ranking = ChosenWords.againstEnglishAndTheCorpus();
        final Map<String, Double> bars =
                VocabularyNull.byReference(ranking.chanceFor(written, reading.seed()));
        final ContentWords content = ContentWords.fromClasspath();
        final Map<String, Double> claimByLemma = ranking.in(written).stream()
                .filter(word -> !word.theLanguages())
                .filter(word -> word.clears(bars))
                .collect(Collectors.groupingBy(word -> content.lemmaOrSurface(word.word()),
                        Collectors.summingDouble(ChosenWord::claim)));
        return claimByLemma.entrySet().stream()
                .map(entry -> new DomainOverlap.ScoredWord(entry.getKey(), entry.getValue()))
                .sorted(Comparator.comparingDouble(DomainOverlap.ScoredWord::claim).reversed()
                        .thenComparing(DomainOverlap.ScoredWord::word))
                .toList();
    }

    static Path wrote(final Path reports, final DomainOverlap overlap) throws IOException {
        Files.createDirectories(reports);
        final String data = new ObjectMapper().writeValueAsString(Map.of("overlap", overlap));
        final Path page = reports.resolve(PAGE);
        Files.writeString(page, new DomainVennPage(data, read(STYLESHEET), read(BEHAVIOUR)).markup());
        log.info("{} over domains {}: file://{}", overlap.repository(), overlap.domains(),
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
