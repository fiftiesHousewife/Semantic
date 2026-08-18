package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.term.InjectedIndexes;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;
import io.github.fiftieshousewife.codesemantics.engine.theme.InjectedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.theme.TaxonomyShape;

import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;

/**
 * Reads a working tree and writes the export, with no report produced and no test framework involved. That is
 * what says the documents are a rendering of this file rather than the other way round.
 *
 * <p>The commit is an argument because the library reads no {@code .git}: what a working tree is checked out
 * at is a fact its caller states, the same way {@code RepositoryFacts} carries every other hosted fact.
 */
public final class ExportCommand {

    private ExportCommand() {
    }

    /** What the reading writes beside the export to say what moved since the last one. */
    private static final String CHANGES = "changes";

    /**
     * Every taxonomy under this directory is read by path, because the published jar carries none of them.
     *
     * <p>Resolved against the host tree rather than the working directory. The forked test JVM runs inside
     * the module, so a relative path finds nothing, and these are this repository's taxonomies whichever
     * clone is being read.
     */
    private static final String UNBUNDLED = "taxonomies";

    /**
     * The vocabularies this repository keeps beside the bundled one and matches as well.
     *
     * <p>They are read from files rather than the classpath because nothing bundles them. Only the ones
     * {@link TaxonomyShape} says can be matched are taken: a taxonomy stating prose has a placement reading
     * of its own and is not a vocabulary of terms anybody declares, so BIAN's service domains are left to
     * that arm and CSO's topics are matched here. A directory holding neither contributes nothing.
     */
    static List<TermIndex> alsoMatched() throws IOException {
        final Path directory = TreeReading.ofTheHostTree().root().resolve(UNBUNDLED);
        if (!Files.isDirectory(directory)) {
            return List.of();
        }
        try (var files = Files.list(directory)) {
            return files.filter(file -> file.getFileName().toString().endsWith(".tsv")).sorted()
                    .map(InjectedTaxonomy::named)
                    .filter(taxonomy -> taxonomy.shape().isMatchedAgainstNames())
                    .map(InjectedIndexes::of)
                    .toList();
        }
    }

    public static void main(final String[] arguments) throws IOException {
        wrote(commitIn(arguments));
    }

    /** Reads the clone under reading — shared with any reading already taken in this JVM — and writes the export. */
    static Path wrote(final String commit) throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final ReportFolder folder = ReportFolder.forReadingOf(reading.root());
        final Path file = folder.file(ExportFile.NAME);
        final ExportFile exports = new ExportFile();
        final Optional<ReadingExport> previous = previousReading(exports, file);
        final ReadingExport current = new ExportedReading().of(reading.reading(), commit, alsoMatched(),
                reading.terms(), reading.arxivField(), reading.namesChance());
        exports.wrote(file, current);
        wroteChanges(folder, previous, current);
        return file;
    }

    /**
     * The reading already on disk, where there is one this shape can read.
     *
     * <p>An export states its own schema version so a consumer can branch on a change rather than discover
     * it by failing, and this consumer is the first one: a run after the shape moves would otherwise read
     * the previous document into the new records and throw. A version it cannot read is a run with nothing
     * to compare against, which is the same case as the first run ever.
     */
    private static Optional<ReadingExport> previousReading(final ExportFile exports, final Path file) {
        if (!Files.exists(file)) {
            return Optional.empty();
        }
        try {
            final ReadingExport read = exports.in(file);
            return ReadingExport.SCHEMA_VERSION.equals(read.schemaVersion())
                    ? Optional.of(read) : Optional.empty();
        } catch (final IOException | RuntimeException cannotRead) {
            return Optional.empty();
        }
    }

    /**
     * The comparison is written only where there is something to compare against. A first run has no previous
     * reading, and a report saying every figure moved from nothing would be a report about that rather than
     * about the repository.
     */
    private static void wroteChanges(final ReportFolder folder, final Optional<ReadingExport> previous,
                                     final ReadingExport current) throws IOException {
        if (previous.isEmpty()) {
            return;
        }
        folder.wrote(CHANGES, new ChangeReport().render(ReadingChanges.between(previous.get(), current)),
                "What moved since the last reading");
    }

    /** The commit the caller states, or nothing where it states none — an empty field, never a guess. */
    private static String commitIn(final String[] arguments) {
        return arguments.length == 0 ? "" : arguments[0];
    }
}
