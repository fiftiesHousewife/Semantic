package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedRuns;
import io.github.fiftieshousewife.codesemantics.engine.theme.PublishedPhrases;
import io.github.fiftieshousewife.codesemantics.engine.theme.StatedRuns;
import io.github.fiftieshousewife.codesemantics.reference.PooledRunShares;

/**
 * Which runs of words working Java has been shown to write, read off the reference corpus's run table, and
 * which runs the table was never in a position to answer about.
 *
 * <p>It answers the question a published term vocabulary cannot answer about itself. FpML states
 * {@code MimeType}, {@code TimeZone}, {@code ResourceType} and {@code CountryCode} beside {@code CapFloor}
 * and {@code FixedLeg}, and a matcher counting all six reads FpML into a content parser as readily as into a
 * derivatives library. Only a corpus of working Java says which of the six is FpML's own vocabulary.
 *
 * <p><b>Shown to write, not merely counted once.</b> The table states a standard error beside every share,
 * and a share that does not exceed its own error has not been shown to stand above zero — the rule the word
 * ranking already applies to a verdict's margin, asked here of a count. That is what keeps the bound derived
 * from the table rather than chosen.
 *
 * <p><b>An absence is only a measurement where the question could be put.</b> The table holds a run only
 * where the reading that pooled it merged two adjacent words into one, and that reading merges a run only
 * where some publisher states it. A run no publisher states was never counted in the corpus and its absence
 * there says nothing. {@link #canBeAsked} is that reading put to the run directly, so the rule here follows
 * the pooling's rule rather than restating it.
 *
 * <p><b>Runs only.</b> The same error rule over the word table refuses {@code trade} at 23 occurrences,
 * which is the domain evidence a reading exists to find, so it is not asked of a single word.
 */
public final class WorkingJavaRuns {

    private final PooledRunShares corpus;
    private final PublishedRuns pooling;

    public WorkingJavaRuns(final PooledRunShares corpus, final PublishedRuns pooling) {
        this.corpus = corpus;
        this.pooling = pooling;
    }

    /** The run table this library bundles, read once. */
    public static WorkingJavaRuns fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** A run table at a path, so a candidate can be measured before anything decides to bundle it. */
    public static WorkingJavaRuns at(final Path table) {
        return new WorkingJavaRuns(PooledRunShares.at(table), pooling());
    }

    /**
     * A run table stated as its own rows, under a stated reading, so a module that cannot see the table's
     * reader can still state the corpus it judges against.
     */
    public static WorkingJavaRuns stating(final Stream<String> rows, final PublishedRuns pooling) {
        return new WorkingJavaRuns(new PooledRunShares(rows), pooling);
    }

    /**
     * Whether the reading that pooled the table would have read this run as one unit. Where it would not,
     * the table's silence is the question going unasked and not an answer to it.
     */
    public boolean canBeAsked(final List<String> words) {
        return pooling.of(words).size() == 1;
    }

    /**
     * Whether the corpus has been shown to write this run of words. A run it never wrote has a share of zero
     * and no sampling error, so it answers no — which is an answer only where {@link #canBeAsked} agrees the
     * question was put.
     */
    public boolean writes(final List<String> words) {
        final String run = PublishedPhrases.runOf(words);
        return corpus.shareOf(run) > corpus.errorOf(run);
    }

    private static PublishedRuns pooling() {
        return StatedRuns.fromClasspath();
    }

    private static final WorkingJavaRuns CLASSPATH_DEFAULTS =
            new WorkingJavaRuns(PooledRunShares.fromClasspath(), pooling());
}
