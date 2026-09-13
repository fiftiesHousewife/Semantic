package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.FileTopics;
import io.github.fiftieshousewife.codesemantics.engine.theme.JensenShannon;
import io.github.fiftieshousewife.codesemantics.engine.theme.PermutationNull;
import io.github.fiftieshousewife.codesemantics.engine.theme.ProseReading;
import io.github.fiftieshousewife.codesemantics.engine.theme.StatementNull;
import io.github.fiftieshousewife.codesemantics.engine.theme.TopicDistribution;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.repository.PullRequestFacts;

/**
 * Composes one pull request's block of the export from a reading of the directory its fetch step wrote —
 * the same pipeline the working tree's signals take, over a different root, with every signal stating
 * {@link ReadingSource#PULL_REQUEST}.
 *
 * <p>Where the fetch also pinned what the pull request says, the statement is read as its own scope and
 * only the divergence between the two readings is published. The reading of the changed files is composed
 * before the statement is looked at, so it is identical with the statement and without it — which is what
 * keeps an author's description of a domain from being handed back as a finding about the code.
 */
public final class ExportedPullRequests {

    private static final String STATEMENT = "statement";

    private static final int LEADING_TOPICS = 8;

    /** The facts the caller states and a reading of the pull request's own directory at its own seed. */
    public ExportedPullRequest of(final PullRequestFacts facts, final RepositoryReading reading) {
        final RepositoryLegibility legibility = reading.legibility();
        final Vocabulary vocabulary = Vocabulary.of(legibility,
                ChosenWords.againstEnglishAndTheCorpus()
                        .chanceFor(new PublishedNames().published(legibility), reading.seed()),
                ReadingSource.PULL_REQUEST);
        return new ExportedPullRequest(facts.number(), facts.author(), facts.headSha(), facts.baseSha(),
                facts.files(), vocabulary.bars(), vocabulary.signals());
    }

    /**
     * The same block with the statement's divergence and the stated work class beside it, the divergence
     * judged in a field of this many statements. An unreadable statement, or one whose chance field offers
     * no readable draw, leaves everything but {@code work} exactly as
     * {@link #of(PullRequestFacts, RepositoryReading)} composed it.
     */
    public ExportedPullRequest of(final PullRequestFacts facts, final RepositoryReading reading,
                                  final String statement, final int judgedTogether) {
        final ExportedPullRequest written = of(facts, reading)
                .withWork(new StatedWork().of(statement));
        return statedBesideWritten(statement, judgedTogether, reading)
                .map(written::withStatement)
                .orElse(written);
    }

    private Optional<ExportedStatement> statedBesideWritten(final String statement,
                                                            final int judgedTogether,
                                                            final RepositoryReading reading) {
        final ProseReading prose = ProseReading.fromClasspath();
        final FileTopics readable = prose.of(STATEMENT, statement);
        final TopicDistribution stated = readable.distribution();
        final TopicDistribution written = reading.themes().repository().comparison();
        if (stated.isEmpty() || written.isEmpty()) {
            return Optional.empty();
        }
        final JensenShannon divergence = new JensenShannon();
        final double bits = divergence.divergence(stated, written);
        final List<Integer> sentences = prose.sentenceLengths(statement);
        return StatementNull.seeded(reading.seed())
                .of(bits, sentences, judgedTogether, reading.legibility().repository().written(), written)
                .map(chance -> exported(sentences, chance,
                        topicsOf(divergence, stated, written, chance)));
    }

    private static ExportedStatement exported(final List<Integer> sentences,
                                              final PermutationNull.Chance chance,
                                              final List<ExportedStatement.StatedTopic> topics) {
        final int words = sentences.stream().mapToInt(Integer::intValue).sum();
        return new ExportedStatement(sentences.size(), words, chance.observed(),
                chance.chanceExpectedBest(), chance.chanceRate(), chance.resamples(), topics);
    }

    /** Ranked only where the divergence exceeds its chance: a ranking of noise reads as a finding. */
    private static List<ExportedStatement.StatedTopic> topicsOf(final JensenShannon divergence,
                                                                final TopicDistribution stated,
                                                                final TopicDistribution written,
                                                                final PermutationNull.Chance chance) {
        if (!chance.exceedsChance()) {
            return List.of();
        }
        return divergence.contributions(stated, written).stream()
                .limit(LEADING_TOPICS)
                .map(topic -> new ExportedStatement.StatedTopic(topic.topic(), topic.bits(),
                        topic.scopeShare(), topic.referenceShare()))
                .toList();
    }
}
