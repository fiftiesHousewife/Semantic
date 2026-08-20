package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ValueShare;

/**
 * A whole working tree's topical reading: what each scope is about, how each differs from the repository as
 * a whole, what the topics rank as, which file leads on what, and the witnesses behind all of it.
 *
 * <p>{@link Workings} carries the account of how it got there — the witnesses, the words offered, the topics
 * a rule removed and the runs nothing placed.
 *
 * <p>{@code dominantByFile} omits a file rather than mapping it to nothing: a file whose words carried too
 * little topical mass has no dominant topic, and an absent key says exactly that where a sentinel value
 * would have to be interpreted.
 */
public record RepositoryThemes(List<ScopeThemes> scopes, ScopeThemes repository,
                               List<ScopeDivergence> divergences, List<TopicRanking> rankings,
                               List<FileTopics> files, Map<String, ValueShare<String>> dominantByFile,
                               Workings workings, List<ForeignWords.ForeignWord> foreignWords,
                               Duration elapsed) {

    public RepositoryThemes {
        scopes = List.copyOf(scopes);
        divergences = List.copyOf(divergences);
        rankings = List.copyOf(rankings);
        files = List.copyOf(files);
        dominantByFile = Map.copyOf(dominantByFile);
        foreignWords = List.copyOf(foreignWords);
        Objects.requireNonNull(repository, "repository");
        Objects.requireNonNull(workings, "workings");
        Objects.requireNonNull(elapsed, "elapsed");
    }

    /** The words that carried each topic, with the phrases they were read in. */
    public TopicWitnesses witnesses() {
        return workings.witnesses();
    }

    /** Every word the reading offered to the resources, with how often each was written. */
    public WordSightings sightings() {
        return workings.sightings();
    }

    public int lines() {
        return files.stream().mapToInt(FileTopics::lines).sum();
    }

    /** Files the reading could not resolve a topic for — reported, never quietly dropped. */
    public int filesWithoutATopic() {
        return files.size() - dominantByFile.size();
    }
}
