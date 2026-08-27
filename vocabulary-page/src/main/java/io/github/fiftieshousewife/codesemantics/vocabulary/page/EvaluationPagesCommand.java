package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

import lombok.extern.slf4j.Slf4j;

/**
 * Writes the pages for every published reading under {@code output/} — the tree's own and one per
 * evaluation member — one folder per repository, with an index naming them all. It consumes the readings
 * already taken and takes none itself.
 */
@Slf4j
public final class EvaluationPagesCommand {

    private static final String OUTPUT = "output";
    private static final String INDEX = "index.html";

    private EvaluationPagesCommand() {
    }

    public static void main(final String[] arguments) throws IOException {
        final Path reports = Path.of(VocabularyPageCommand.REPORTS);
        final List<String> written = pages(readings(Path.of(OUTPUT)), reports);
        log.info("{} repositories: file://{}", written.size(),
                reports.resolve(INDEX).toAbsolutePath());
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

    static List<String> pages(final List<Path> readings, final Path reports) throws IOException {
        for (final Path folder : readings) {
            pagesOf(ReadingFolder.at(folder), reports);
        }
        TaxonomyMatchesCommand.wrote(reports, TaxonomyMatchesCommand.rows(readings));
        final List<String> repositories = written(reports);
        Files.createDirectories(reports);
        Files.writeString(reports.resolve(INDEX),
                new PagesIndex(read("domain-venn.css")).markup(repositories));
        return repositories;
    }

    private static void pagesOf(final ReadingFolder reading, final Path reports) throws IOException {
        final String repository = reading.export().summary().repository();
        final Path folder = reports.resolve(repository);
        VocabularyPageCommand.wrote(folder, VocabularyFunnel.of(reading),
                VocabularyPageCommand.leadingDomains(reading));
        DomainVennCommand.pageOf(reading, folder);
        TermTreesCommand.wrote(folder, repository, TermTreesCommand.trees(reading));
    }

    /** Every repository with pages on disk, so runs over different readings grow one index. */
    private static List<String> written(final Path reports) throws IOException {
        try (Stream<Path> folders = Files.list(reports)) {
            return folders.filter(Files::isDirectory)
                    .filter(folder -> Files.exists(folder.resolve("vocabulary.html")))
                    .map(folder -> folder.getFileName().toString())
                    .sorted()
                    .toList();
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
