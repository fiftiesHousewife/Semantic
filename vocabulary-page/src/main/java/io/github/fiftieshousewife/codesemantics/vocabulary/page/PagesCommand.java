package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.lexicon.XwndSenseDomains;
import lombok.extern.slf4j.Slf4j;

/**
 * Writes one findings page per published reading under {@code output/}, each into a folder of its
 * repository's name. It consumes the readings already taken and takes none itself.
 */
@Slf4j
public final class PagesCommand {

    static final String PAGE = "reading.html";

    static final String LANDING = "readings.html";

    static final String REPORTS = "vocabulary-page/build/reports/vocabulary";

    private static final String STYLESHEET = "reading.css";

    private static final String BEHAVIOUR = "reading.js";

    private static final String LANDING_STYLESHEET = "landing.css";

    private static final String AUTHOR_STYLESHEET = "author.css";

    private static final String AUTHOR_BEHAVIOUR = "author.js";

    private static final String SHARED = "page.css";

    private static final String RESOURCES = "vocabulary/";

    private static final String OUTPUT = "output";

    private static final String READING_PROPERTY = "cs.reading.dir";

    private PagesCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final Path reports = Path.of(REPORTS);
        final String named = System.getProperty(READING_PROPERTY, "");
        final List<Path> found = named.isBlank() ? readings(Path.of(OUTPUT)) : List.of(Path.of(named));
        final List<Path> written = wrote(reports, found);
        log.info("{} findings pages under file://{}", written.size(), reports.toAbsolutePath());
    }

    /** Every folder under {@code output/} holding a reading — {@code json/} first, then the members. */
    static List<Path> readings(final Path output) throws IOException {
        final List<Path> found = new ArrayList<>();
        try (Stream<Path> folders = Files.list(output)) {
            folders.sorted().forEach(folder -> {
                final Path json = folder.getFileName().toString().equals("json")
                        ? folder : folder.resolve("json");
                if (Files.exists(json.resolve("reading.json"))) {
                    found.add(json);
                }
            });
        }
        return List.copyOf(found);
    }

    /** One page per reading and the landing card over them, each page beside its repository's folder. */
    static List<Path> wrote(final Path reports, final List<Path> readings) throws IOException {
        final ReadingPage page = new ReadingPage(
                read(SHARED) + read(STYLESHEET),
                read(BEHAVIOUR));
        final AuthorPage authors = new AuthorPage(read(SHARED) + read(AUTHOR_STYLESHEET),
                read(AUTHOR_BEHAVIOUR));
        final WordNetLexicon lexicon = WordNetLexicon.fromClasspath();
        final List<Path> written = new ArrayList<>();
        final List<ReadingExport> exports = new ArrayList<>();
        final List<Path> unreadable = new ArrayList<>();
        for (final Path folder : readings) {
            final ReadingFolder reading = ReadingFolder.at(folder);
            final Optional<ReadingExport> readable = reading.readable();
            if (readable.isEmpty()) {
                unreadable.add(folder);
                continue;
            }
            final ReadingExport export = readable.get();
            exports.add(export);
            final Path repository = reports.resolve(export.summary().repository());
            Files.createDirectories(repository);
            final Path file = repository.resolve(PAGE);
            final SignificantWords.Significant significant = SignificantWords.of(export);
            final List<AuthorPullRequests> byAuthor = reading.pullRequests()
                    .map(fetched -> AuthorPullRequests.in(fetched, export))
                    .orElse(List.of());
            Files.writeString(file, page.markup(export,
                    DomainSources.of(overlaps(reading, export, significant.words(), lexicon)),
                    figures(reading, export, significant, lexicon), byAuthor));
            written.add(file);
            written.addAll(wroteAuthors(authors, repository, byAuthor));
        }
        Files.writeString(reports.resolve(ChangeShapeTable.FILE),
                new ChangeShapeTable().markup(read(SHARED) + read(AUTHOR_STYLESHEET)));
        written.add(reports.resolve(ChangeShapeTable.FILE));
        final Path landing = reports.resolve(LANDING);
        Files.writeString(landing, new LandingPage(
                read(SHARED) + read(LANDING_STYLESHEET))
                .markup(exports));
        written.add(landing);
        if (!unreadable.isEmpty()) {
            log.info("{} readings were taken at another schema version and are not drawn: {}",
                    unreadable.size(), unreadable);
        }
        return List.copyOf(written);
    }

    /** One report per author whose pull requests were fetched, beside the repository's own page. */
    private static List<Path> wroteAuthors(final AuthorPage authors, final Path repository,
                                           final List<AuthorPullRequests> byAuthor) throws IOException {
        final List<Path> written = new ArrayList<>();
        for (final AuthorPullRequests author : byAuthor) {
            final Path file = repository.resolve(author.file());
            Files.writeString(file, authors.markup(author));
            written.add(file);
        }
        return List.copyOf(written);
    }

    /** What the page's two figures draw: the meaning tiles, and the leading domains' overlap. */
    private static String figures(final ReadingFolder reading, final ReadingExport export,
                                  final SignificantWords.Significant significant,
                                  final WordNetLexicon lexicon) throws IOException {
        final DomainOverlap overlap = DomainOverlap.of(export.summary().repository(),
                significant.words(), lexicon::countedSenseDomainsOf);
        return new ObjectMapper().writeValueAsString(Map.of(
                "funnel", VocabularyFunnel.of(reading),
                "leadingDomains", overlap.domains().stream().map(DomainOverlap.Drawn::domain).toList(),
                "overlap", overlap,
                "signals", export.signals().size()));
    }

    /**
     * The same significant words under every bundled domain source: WordNet Domains and the eXtended
     * reduction read their own counted senses, and each subject scheme's all-uncounted senses take the
     * corroborated weight the committed evidence states.
     */
    private static Map<String, DomainOverlap> overlaps(final ReadingFolder reading,
                                                       final ReadingExport export,
                                                       final List<ScoredWord> words,
                                                       final WordNetLexicon lexicon) {
        final String repository = export.summary().repository();
        final Map<String, DomainOverlap> bySource = new LinkedHashMap<>();
        bySource.put("WordNet Domains",
                DomainOverlap.of(repository, words, lexicon::countedSenseDomainsOf));
        bySource.put("eXtended WordNet Domains",
                DomainOverlap.of(repository, words,
                        XwndSenseDomains.fromClasspath()::countedSenseDomainsOf));
        SubjectSenseSources.bySource(CorroboratedSenses.fromCommittedEvidence(reading))
                .forEach((source, senses) ->
                        bySource.put(source, DomainOverlap.of(repository, words, senses)));
        return bySource;
    }

    /** The stylesheets and the script, read whole from the files they are authored in. */
    private static String read(final String asset) throws IOException {
        try (InputStream source = PagesCommand.class.getClassLoader()
                .getResourceAsStream(RESOURCES + asset)) {
            if (source == null) {
                throw new IllegalStateException(String.format(Locale.ROOT,
                        "The findings page's %s is not on the classpath", asset));
            }
            return new String(source.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
