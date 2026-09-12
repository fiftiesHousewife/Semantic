package io.github.fiftieshousewife.codesemantics.engine.export;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.repository.PullRequestFacts;

/**
 * Composes one pull request's block of the export from a reading of the directory its fetch step wrote —
 * the same pipeline the working tree's signals take, over a different root, with every signal stating
 * {@link ReadingSource#PULL_REQUEST}.
 */
public final class ExportedPullRequests {

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
}
