package org.fifties.housewife.codesemantics.engine.theme;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.fifties.housewife.codesemantics.engine.pipeline.ValueShare;

/**
 * A whole working tree's topical reading: what each scope is about, how each differs from the repository as
 * a whole, what the topics rank as, which file leads on what, and the witnesses behind all of it.
 *
 * <p>{@code dominantByFile} omits a file rather than mapping it to nothing: a file whose words carried too
 * little topical mass has no dominant topic, and an absent key says exactly that where a sentinel value
 * would have to be interpreted.
 */
public record RepositoryThemes(List<ScopeThemes> scopes, ScopeThemes repository,
                               List<ScopeDivergence> divergences, List<TopicRanking> rankings,
                               List<FileTopics> files, Map<String, ValueShare<String>> dominantByFile,
                               TopicWitnesses witnesses, Duration elapsed) {

    public RepositoryThemes {
        scopes = List.copyOf(scopes);
        divergences = List.copyOf(divergences);
        rankings = List.copyOf(rankings);
        files = List.copyOf(files);
        dominantByFile = Map.copyOf(dominantByFile);
        Objects.requireNonNull(repository, "repository");
        Objects.requireNonNull(witnesses, "witnesses");
        Objects.requireNonNull(elapsed, "elapsed");
    }

    public int lines() {
        return files.stream().mapToInt(FileTopics::lines).sum();
    }

    /** Files the reading could not resolve a topic for — reported, never quietly dropped. */
    public int filesWithoutATopic() {
        return files.size() - dominantByFile.size();
    }
}
