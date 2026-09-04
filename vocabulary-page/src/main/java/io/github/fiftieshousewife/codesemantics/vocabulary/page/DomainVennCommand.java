package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.engine.term.SubjectDomains;
import io.github.fiftieshousewife.codesemantics.engine.term.TopicLabelDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.codesemantics.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.codesemantics.lexicon.CsoTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;

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

    /**
     * The kinds each scheme's senses are labelled at: the finest level with human-written labels, because
     * anything broader lumps all of software into one circle named computer science.
     */
    private static final String CATEGORY = "category";

    private static final String SUBFIELD = "subfield";

    /** Each scheme's word index is built once per JVM: a bundled taxonomy cannot change under a running program. */
    private static final SubjectDomains ARXIV_CATEGORIES =
            new SubjectDomains(ArxivSubjects.fromClasspath(), WordNetLexicon.fromClasspath(), CATEGORY);

    private static final SubjectDomains OPENALEX_SUBFIELDS =
            new SubjectDomains(OpenAlexTopics.fromClasspath(), WordNetLexicon.fromClasspath(), SUBFIELD);

    /** CSO states labels and no prose, so its word index reads the labels — see {@link TopicLabelDomains}. */
    private static final TopicLabelDomains CSO_TOPICS =
            new TopicLabelDomains(CsoTopics.fromClasspath().concepts(), WordNetLexicon.fromClasspath());

    private DomainVennCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final ReadingFolder reading = ReadingFolder.at(Path.of(System.getProperty(
                VocabularyPageCommand.READING_PROPERTY, VocabularyPageCommand.DEFAULT_READING)));
        pageOf(reading, Path.of(VocabularyPageCommand.REPORTS)
                .resolve(reading.export().summary().repository()));
    }

    /**
     * One reading's page: the word sources, the phrase summary naming every vocabulary, and one overlap
     * inside each vocabulary with phrase evidence, drawn at the level where its matches part ways.
     */
    static Path pageOf(final ReadingFolder reading, final Path folder) throws IOException {
        final String repository = reading.export().summary().repository();
        final SignificantWords.Significant significant = SignificantWords.of(reading.export());
        final Map<String, DomainOverlap> bySource = new LinkedHashMap<>(overlaps(repository,
                significant.words(), CorroboratedSenses.fromCommittedEvidence(reading)));
        final List<MatchedTermDomains.SummaryRow> summary =
                MatchedTermDomains.summary(reading.termMatches());
        final List<String> phraseSources = summary.stream()
                .filter(row -> row.phraseTerms() > 0)
                .map(row -> {
                    MatchedTermDomains.of(repository, row.vocabulary(), reading.termMatches())
                            .ifPresent(overlap -> bySource.put(row.source(), overlap));
                    return row.source();
                })
                .toList();
        return wrote(folder, bySource, summary, phraseSources, significant.signals());
    }

    /**
     * The overlaps under every bundled domain source, in the order the page offers them. The subject
     * schemes' arms are all uncounted, so each takes the corroborated weight of the labels the
     * repository wrote; WordNet's arms keep their tagged-corpus counts.
     */
    static Map<String, DomainOverlap> overlaps(final String repository, final List<ScoredWord> words,
                                               final CorroboratedSenses corroborated) {
        final WordNetLexicon lexicon = WordNetLexicon.fromClasspath();
        final Map<String, DomainOverlap> bySource = new LinkedHashMap<>();
        bySource.put("WordNet Domains",
                DomainOverlap.of(repository, words, lexicon::countedSenseDomainsOf));
        bySource.put("eXtended WordNet Domains",
                DomainOverlap.of(repository, words, lexicon::extendedCountedSenseDomainsOf));
        subjectArms(corroborated).forEach((arm, senses) ->
                bySource.put(arm, DomainOverlap.of(repository, words, senses)));
        return bySource;
    }

    /** The subject schemes' arms — the all-uncounted ones the corroborated weight applies to — by name. */
    static Map<String, Function<String, List<CountedSenseDomains>>> subjectArms(
            final CorroboratedSenses corroborated) {
        final Map<String, Function<String, List<CountedSenseDomains>>> arms = new LinkedHashMap<>();
        arms.put("arXiv categories",
                word -> corroborated.of(ARXIV_CATEGORIES.countedSenseDomainsOf(word)));
        arms.put("OpenAlex subfields",
                word -> corroborated.of(OPENALEX_SUBFIELDS.countedSenseDomainsOf(word)));
        arms.put("CSO topics", word -> corroborated.of(CSO_TOPICS.countedSenseDomainsOf(word)));
        return arms;
    }

    /** The summary the page opens on, which is every domain source at once rather than a chosen one. */
    static final String DOMAIN_SUMMARY = "Domains";

    static Path wrote(final Path folder, final Map<String, DomainOverlap> overlaps,
                      final List<MatchedTermDomains.SummaryRow> summary,
                      final List<String> phraseSources, final int signals) throws IOException {
        Files.createDirectories(folder);
        final Map<String, DomainOverlap> domainSources = overlaps.entrySet().stream()
                .filter(source -> !phraseSources.contains(source.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (first, later) -> first, LinkedHashMap::new));
        final List<String> pickable = new ArrayList<>(List.of(DOMAIN_SUMMARY,
                MatchedTermDomains.SOURCE));
        final String data = new ObjectMapper().writeValueAsString(Map.of(
                "overlaps", overlaps,
                "sources", pickable,
                "domainSummarySource", DOMAIN_SUMMARY,
                "domainSummary", DomainSources.of(domainSources),
                "domainSources", List.copyOf(domainSources.keySet()),
                "phraseSummarySource", MatchedTermDomains.SOURCE,
                "phraseSummary", summary,
                "phraseSources", phraseSources,
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
