package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.Thresholds;
import io.github.fiftieshousewife.codesemantics.engine.pipeline.OpenSpaceAccumulator;
import io.github.fiftieshousewife.codesemantics.engine.pipeline.ValueShare;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedSourceSets;

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
    private final CollocatedWords collocated;
    private final OfferedWords offered;
    private final PhraseTopics phrases;
    private final OpenSpaceAccumulator<String> accumulator;
    private final JensenShannon divergence;
    private final PermutationNull chance;

    public ThemeReading(final TopicCitations citations, final IdentifierWords words,
                        final CollocatedWords collocated, final OfferedWords offered,
                        final PhraseTopics phrases, final OpenSpaceAccumulator<String> accumulator,
                        final JensenShannon divergence, final PermutationNull chance) {
        this.citations = citations;
        this.words = words;
        this.collocated = collocated;
        this.offered = offered;
        this.phrases = phrases;
        this.accumulator = accumulator;
        this.divergence = divergence;
        this.chance = chance;
    }

    /** The reading over the bundled resources, with a seeded null so two runs of one tree agree. */
    public static ThemeReading fromClasspath(final long seed) {
        return new ThemeReading(TopicCitations.fromClasspath(), IdentifierWords.fromClasspath(),
                CollocatedWords.fromClasspath(), OfferedWords.fromClasspath(),
                new PhraseTopics(TopicCitations.fromClasspath(), new TopicCommitment(),
                        SenseCoverage.fromClasspath()),
                new OpenSpaceAccumulator<>(Thresholds.defaults()), new JensenShannon(),
                PermutationNull.seeded(seed));
    }

    public RepositoryThemes of(final ParsedRepository parsed) {
        final long startedAt = System.nanoTime();
        final Workings workings = Workings.newInstance();
        final Map<String, List<FileTopics>> byScope = new LinkedHashMap<>();
        final List<FileTopics> everyFile = new ArrayList<>();
        parsed.files().forEach(file -> {
            final FileTopics read = read(file, workings);
            byScope.computeIfAbsent(file.scope(), scope -> new ArrayList<>()).add(read);
            everyFile.add(read);
        });
        final ScopeThemes repository = themesOf("repository", everyFile);
        final Map<String, ValueShare<String>> dominant = dominantByFile(everyFile);
        final List<TopicDistribution> pool = placedReadings(everyFile);
        return new RepositoryThemes(
                byScope.entrySet().stream()
                        .map(scope -> themesOf(scope.getKey(), scope.getValue())).toList(),
                repository,
                byScope.entrySet().stream()
                        .map(scope -> divergenceOf(scope.getKey(), scope.getValue(), byScope.size(), pool,
                                repository.comparison()))
                        .toList(),
                new TopicRankings(everyFile, dominant, workings.witnesses()).of(repository.intensity()),
                everyFile, dominant, workings,
                new ForeignWords(citations, divergence, LEAST_SIGHTINGS)
                        .in(workings.sightings(), repository.comparison(), FOREIGN_WORDS_HELD),
                Duration.ofNanos(System.nanoTime() - startedAt));
    }

    /**
     * A file is read twice. The first pass answers what the file is about from its phrases alone; the second
     * reads the same phrases again with that answer as a prior, which is the only context a one-word phrase
     * has. Only the second pass records witnesses and sightings, so the evidence a reader is shown is the
     * evidence the reading actually used.
     */
    private FileTopics read(final ParsedFile file, final Workings workings) {
        final String layout = PublishedSourceSets.sourceSetOf(file.scope());
        final FileTopics alone = tallied(file,
                phrases.under(TopicDistribution.NOTHING, java.util.Set.of(), layout),
                Workings.newInstance());
        return tallied(file, phrases.under(alone.distribution(), declaredIn(file), layout), workings);
    }

    /**
     * The words this file declared <em>as nouns</em>, in the form the resources are asked about them.
     *
     * <p>The leading word of a method name is left out. A method name is a clause and its first word is
     * what the method does, so a file declaring {@code readRepository} has declared no noun called
     * {@code read} — and a rule that read it as one would turn every sentence's {@code read} into the
     * noun WordNet Domains labels {@code publishing}.
     */
    private java.util.Set<String> declaredIn(final ParsedFile file) {
        return file.occurrences().stream()
                .filter(occurrence -> occurrence.form().isChosenName())
                .flatMap(occurrence -> occurrence.form().vocabulary()
                        .phrasesOf(occurrence.text(), words).stream()
                        .flatMap(phrase -> nounsOf(collocated.of(phrase.words()),
                                occurrence.form()).stream()))
                .map(word -> offered.of(NameForm.TYPE, word))
                .flatMap(java.util.Optional::stream)
                .collect(java.util.stream.Collectors.toUnmodifiableSet());
    }

    /** Every word of a declared name but the one the grammar says is a verb. */
    private static List<String> nounsOf(final List<String> phrase, final NameForm form) {
        return form == NameForm.METHOD && !phrase.isEmpty()
                ? phrase.subList(1, phrase.size())
                : phrase;
    }

    private FileTopics tallied(final ParsedFile file, final PhraseTopics reading,
                               final Workings workings) {
        final TopicTally tally = new TopicTally(words, collocated, offered, reading, workings);
        file.occurrences().forEach(occurrence -> tally.add(file.path(), occurrence));
        return tally.reading(file.path(), file.lines());
    }

    private ScopeThemes themesOf(final String name, final List<FileTopics> files) {
        final List<TopicDistribution> reading = readings(files);
        return new ScopeThemes(name, files.size(), reading.size(),
                files.stream().mapToInt(FileTopics::lines).sum(), TopicDistribution.meanOf(reading),
                TopicDistribution.meanOfWhatEachPlaced(reading));
    }

    /**
     * The pool a resample is drawn from, composed the way a scope is: each file among what it placed.
     * Renormalised here rather than inside the null, which draws from it 999 times per scope.
     */
    private static List<TopicDistribution> placedReadings(final List<FileTopics> files) {
        return readings(files).stream()
                .map(TopicDistribution::amongWhatWasPlaced)
                .toList();
    }

    private ScopeDivergence divergenceOf(final String name, final List<FileTopics> scope, final int scopes,
                                         final List<TopicDistribution> pool,
                                         final TopicDistribution reference) {
        final List<TopicDistribution> placed = placedReadings(scope);
        final TopicDistribution reading = TopicDistribution.meanOf(placed);
        final double bits = divergence.divergence(reading, reference);
        return new ScopeDivergence(name, bits, divergence.contributions(reading, reference),
                chance.of(bits, placed.size(), scopes, pool, reference));
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
