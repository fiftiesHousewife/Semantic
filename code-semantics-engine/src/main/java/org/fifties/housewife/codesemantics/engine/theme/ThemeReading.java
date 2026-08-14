package org.fifties.housewife.codesemantics.engine.theme;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.fifties.housewife.codesemantics.engine.Thresholds;
import org.fifties.housewife.codesemantics.engine.behaviour.Behaviours;
import org.fifties.housewife.codesemantics.engine.pipeline.OpenSpaceAccumulator;
import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;
import org.fifties.housewife.codesemantics.engine.behaviour.Behaviour;
import org.fifties.housewife.codesemantics.engine.parse.NameForm;
import org.fifties.housewife.codesemantics.engine.parse.ParsedFile;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;

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

    /** A word written once cannot be told from a typo, and the foreign-word list is meant to be acted on. */
    private static final int LEAST_SIGHTINGS = 3;

    private static final int FOREIGN_WORDS_HELD = 40;

    private final TopicCitations citations;
    private final IdentifierWords words;
    private final OfferedWords offered;
    private final PhraseTopics phrases;
    private final OpenSpaceAccumulator<String> accumulator;
    private final JensenShannon divergence;
    private final PermutationNull chance;
    private final Behaviours behaviours = Behaviours.fromClasspath();

    public ThemeReading(final TopicCitations citations, final IdentifierWords words,
                        final OfferedWords offered, final PhraseTopics phrases,
                        final OpenSpaceAccumulator<String> accumulator, final JensenShannon divergence,
                        final PermutationNull chance) {
        this.citations = citations;
        this.words = words;
        this.offered = offered;
        this.phrases = phrases;
        this.accumulator = accumulator;
        this.divergence = divergence;
        this.chance = chance;
    }

    /** The reading over the bundled resources, with a seeded null so two runs of one tree agree. */
    public static ThemeReading fromClasspath(final long seed) {
        return new ThemeReading(TopicCitations.fromClasspath(), IdentifierWords.fromClasspath(),
                OfferedWords.fromClasspath(),
                new PhraseTopics(TopicCitations.fromClasspath(), new TopicCommitment(),
                        SenseCoverage.fromClasspath()),
                new OpenSpaceAccumulator<>(Thresholds.defaults()), new JensenShannon(),
                PermutationNull.seeded(seed));
    }

    public RepositoryThemes of(final ParsedRepository parsed) {
        final List<Behaviour> stated = behaviours.in(parsed.files());
        final long startedAt = System.nanoTime();
        final TopicWitnesses witnesses = new TopicWitnesses();
        final WordSightings sightings = new WordSightings();
        final Map<String, List<FileTopics>> byScope = new LinkedHashMap<>();
        final List<FileTopics> everyFile = new ArrayList<>();
        parsed.files().forEach(file -> {
            final FileTopics read = read(file, witnesses, sightings);
            byScope.computeIfAbsent(file.scope(), scope -> new ArrayList<>()).add(read);
            everyFile.add(read);
        });
        final ScopeThemes repository = themesOf("repository", everyFile);
        final Map<String, ValueShare<String>> dominant = dominantByFile(everyFile);
        return new RepositoryThemes(
                byScope.entrySet().stream()
                        .map(scope -> themesOf(scope.getKey(), scope.getValue())).toList(),
                repository,
                byScope.entrySet().stream()
                        .map(scope -> divergenceOf(scope.getKey(), scope.getValue(), byScope.size(), everyFile,
                                repository.intensity()))
                        .toList(),
                new TopicRankings(everyFile, dominant, witnesses).of(repository.intensity()),
                everyFile, dominant, witnesses, sightings,
                new ForeignWords(citations, divergence, LEAST_SIGHTINGS)
                        .in(sightings, repository.intensity(), FOREIGN_WORDS_HELD),
                stated, Duration.ofNanos(System.nanoTime() - startedAt));
    }

    /**
     * A file is read twice. The first pass answers what the file is about from its phrases alone; the second
     * reads the same phrases again with that answer as a prior, which is the only context a one-word phrase
     * has. Only the second pass records witnesses and sightings, so the evidence a reader is shown is the
     * evidence the reading actually used.
     */
    private FileTopics read(final ParsedFile file, final TopicWitnesses witnesses,
                            final WordSightings sightings) {
        final FileTopics alone = tallied(file, phrases, new TopicWitnesses(), new WordSightings());
        return tallied(file, phrases.under(alone.distribution(), declaredIn(file)), witnesses, sightings);
    }

    /** The words this file declared, in the form the resources are asked about them. */
    private java.util.Set<String> declaredIn(final ParsedFile file) {
        return file.occurrences().stream()
                .filter(occurrence -> occurrence.form().isChosenName())
                .flatMap(occurrence -> occurrence.form().vocabulary()
                        .phrasesOf(occurrence.text(), words).stream())
                .flatMap(phrase -> phrase.words().stream())
                .map(word -> offered.of(NameForm.TYPE, word))
                .flatMap(java.util.Optional::stream)
                .collect(java.util.stream.Collectors.toUnmodifiableSet());
    }

    private FileTopics tallied(final ParsedFile file, final PhraseTopics reading,
                               final TopicWitnesses witnesses, final WordSightings sightings) {
        final TopicTally tally = new TopicTally(words, offered, reading, witnesses, sightings);
        file.occurrences().forEach(occurrence -> tally.add(file.path(), occurrence));
        return tally.reading(file.path(), file.lines());
    }

    private ScopeThemes themesOf(final String name, final List<FileTopics> files) {
        final List<TopicDistribution> reading = readings(files);
        return new ScopeThemes(name, files.size(), reading.size(),
                files.stream().mapToInt(FileTopics::lines).sum(), TopicDistribution.meanOf(reading));
    }

    private ScopeDivergence divergenceOf(final String name, final List<FileTopics> scope, final int scopes,
                                         final List<FileTopics> everyFile,
                                         final TopicDistribution reference) {
        final List<TopicDistribution> reading = readings(scope);
        final double bits = divergence.divergence(TopicDistribution.meanOf(reading), reference);
        return new ScopeDivergence(name, bits,
                divergence.contributions(TopicDistribution.meanOf(reading), reference),
                chance.of(bits, reading.size(), scopes, readings(everyFile), reference));
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
}
