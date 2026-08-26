package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.reading.CloneUnderReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;

import lombok.extern.slf4j.Slf4j;

/**
 * Writes all three pages for every clone under {@code -Dcs.evaluation.dir} — or for the one tree
 * {@code -Dcs.clone.dir} names — one folder per repository, with an index naming them all. One JVM reads
 * every member, so the bundled resources load once.
 */
@Slf4j
public final class EvaluationPagesCommand {

    private static final String REPORTS = "vocabulary-page/build/reports/vocabulary";
    private static final String INDEX = "index.html";

    private EvaluationPagesCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final Path reports = Path.of(REPORTS);
        final List<String> written = pages(roots(), reports);
        log.info("{} repositories: file://{}", written.size(),
                reports.resolve(INDEX).toAbsolutePath());
    }

    static List<String> pages(final List<Path> roots, final Path reports) throws IOException {
        for (final Path root : roots) {
            pagesOf(root, reports.resolve(root.getFileName().toString()));
        }
        final List<String> repositories = written(reports);
        Files.writeString(reports.resolve(INDEX),
                new PagesIndex(read("domain-venn.css")).markup(repositories));
        return repositories;
    }

    /** Every repository with pages on disk, so runs over different trees grow one index. */
    private static List<String> written(final Path reports) throws IOException {
        try (Stream<Path> folders = Files.list(reports)) {
            return folders.filter(Files::isDirectory)
                    .filter(folder -> Files.exists(folder.resolve("vocabulary.html")))
                    .map(folder -> folder.getFileName().toString())
                    .sorted()
                    .toList();
        }
    }

    private static void pagesOf(final Path root, final Path folder) throws IOException {
        Files.createDirectories(folder.getParent());
        final RepositoryReading reading = RepositoryReading.of(root);
        final SignificantWords.Significant significant = SignificantWords.of(reading);
        final String name = root.getFileName().toString();
        VocabularyPageCommand.wrote(folder, VocabularyPageCommand.staged(reading));
        DomainVennCommand.wrote(folder,
                DomainOverlap.of(name, significant.words(),
                        WordNetLexicon.fromClasspath()::countedSenseDomainsOf),
                significant.signals());
        SynsetCloudCommand.wrote(folder, SynsetCloudCommand.cloudOf(reading, significant),
                significant.signals(), SynsetCloudCommand.leadingDomains(reading, significant));
    }

    private static List<Path> roots() throws IOException {
        final String evaluation = System.getProperty("cs.evaluation.dir", "");
        if (evaluation.isBlank()) {
            return List.of(new CloneUnderReading().root());
        }
        try (Stream<Path> members = Files.list(Path.of(evaluation))) {
            return members.filter(Files::isDirectory).sorted().toList();
        }
    }

    private static String read(final String asset) throws IOException {
        try (InputStream source = EvaluationPagesCommand.class.getClassLoader()
                .getResourceAsStream("vocabulary/" + asset)) {
            if (source == null) {
                throw new IllegalStateException(String.format(Locale.ROOT,
                        "The index's %s is not on the classpath",
                        asset));
            }
            return new String(source.readAllBytes(), StandardCharsets.UTF_8);
        }
    }
}
