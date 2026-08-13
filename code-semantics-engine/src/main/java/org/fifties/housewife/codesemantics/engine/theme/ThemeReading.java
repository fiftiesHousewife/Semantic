package org.fifties.housewife.codesemantics.engine.theme;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.Thresholds;
import org.fifties.housewife.codesemantics.engine.pipeline.OpenSpaceAccumulator;
import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.engine.reading.JavaLanguageKeywords;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceIdentifiers;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;

/**
 * Reads what a working tree's scopes are about, and — the part that matters — what each is about
 * <em>compared with the rest of it</em>.
 *
 * <p>A single scope's topic ranking is a weak reading, and this class produces it anyway: a consumer asks
 * for it, and seeing it beside the strong reading is how the weakness becomes obvious. The strong reading is
 * the divergence — the topics whose share in a scope departs from their share across the repository, judged
 * against what a scope of that size would have shown by chance. The ambiguous common words that dominate a
 * raw ranking hold near-constant share everywhere, so they contribute almost nothing to a divergence. A
 * comparison discards them for free; a count never can.
 */
public final class ThemeReading {

    private final JavaSourceIdentifiers identifiers;
    private final TopicCitations citations;
    private final IdentifierWords words;
    private final JavaLanguageKeywords keywords;
    private final OpenSpaceAccumulator<String> accumulator;
    private final JensenShannon divergence;
    private final PermutationNull chance;

    public ThemeReading(final JavaSourceIdentifiers identifiers, final TopicCitations citations,
                        final IdentifierWords words, final JavaLanguageKeywords keywords,
                        final OpenSpaceAccumulator<String> accumulator, final JensenShannon divergence,
                        final PermutationNull chance) {
        this.identifiers = identifiers;
        this.citations = citations;
        this.words = words;
        this.keywords = keywords;
        this.accumulator = accumulator;
        this.divergence = divergence;
        this.chance = chance;
    }

    /** The reading over the bundled resources, with a seeded null so two runs of one tree agree. */
    public static ThemeReading fromClasspath(final long seed) {
        return new ThemeReading(new JavaSourceIdentifiers(), TopicCitations.fromClasspath(),
                IdentifierWords.fromClasspath(), new JavaLanguageKeywords(),
                new OpenSpaceAccumulator<>(Thresholds.defaults()), new JensenShannon(),
                PermutationNull.seeded(seed));
    }

    public RepositoryThemes of(final Path root, final List<SourceScope> scopes) {
        final long startedAt = System.nanoTime();
        final TopicWitnesses witnesses = new TopicWitnesses();
        final Map<String, List<FileTopics>> byScope = new HashMap<>();
        final List<FileTopics> everyFile = new ArrayList<>();
        scopes.forEach(scope -> {
            final List<FileTopics> read = scope.files().stream()
                    .map(file -> read(root, file, witnesses))
                    .toList();
            byScope.put(scope.name(), read);
            everyFile.addAll(read);
        });
        final ScopeThemes repository = themesOf("repository", everyFile);
        final Map<String, ValueShare<String>> dominant = dominantByFile(everyFile);
        return new RepositoryThemes(
                scopes.stream().map(scope -> themesOf(scope.name(), byScope.get(scope.name()))).toList(),
                repository,
                scopes.stream()
                        .map(scope -> divergenceOf(scope.name(), byScope.get(scope.name()), everyFile,
                                repository.intensity()))
                        .toList(),
                new TopicRankings(everyFile, dominant, witnesses).of(repository.intensity()),
                everyFile, dominant, witnesses, Duration.ofNanos(System.nanoTime() - startedAt));
    }

    private FileTopics read(final Path root, final Path file, final TopicWitnesses witnesses) {
        final String source = contentOf(file);
        final TopicTally tally = new TopicTally(citations, words, keywords, witnesses);
        final String site = root.relativize(file).toString();
        identifiers.in(source).forEach(occurrence -> tally.add(site, occurrence));
        return tally.reading(site, (int) source.lines().count());
    }

    private ScopeThemes themesOf(final String name, final List<FileTopics> files) {
        final List<TopicDistribution> reading = readings(files);
        return new ScopeThemes(name, files.size(), reading.size(),
                files.stream().mapToInt(FileTopics::lines).sum(), TopicDistribution.meanOf(reading));
    }

    private ScopeDivergence divergenceOf(final String name, final List<FileTopics> scope,
                                         final List<FileTopics> everyFile,
                                         final TopicDistribution reference) {
        final List<TopicDistribution> reading = readings(scope);
        final double bits = divergence.divergence(TopicDistribution.meanOf(reading), reference);
        return new ScopeDivergence(name, bits,
                divergence.contributions(TopicDistribution.meanOf(reading), reference),
                chance.of(bits, reading.size(), readings(everyFile), reference));
    }

    /** The distributions of the files that carried any topical reading at all; the rest are removed. */
    private static List<TopicDistribution> readings(final List<FileTopics> files) {
        return files.stream()
                .map(FileTopics::distribution)
                .filter(distribution -> !distribution.isEmpty())
                .toList();
    }

    private Map<String, ValueShare<String>> dominantByFile(final List<FileTopics> files) {
        final Map<String, ValueShare<String>> dominant = new HashMap<>();
        files.forEach(file -> file.dominant(accumulator)
                .ifPresent(leader -> dominant.put(file.path(), leader)));
        return dominant;
    }

    private static String contentOf(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }
}
