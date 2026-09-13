package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * One pull request read beside the working tree: what the host states about it, and the signals its changed
 * files carry against the pull request's own chance thresholds.
 *
 * <p>The thresholds are the pull request's and never the working tree's, because the chance-expected maximum
 * of a few files is not the chance-expected maximum of the tree. A consumer comparing a pull request's
 * signal with the repository's compares two readings, each cleared against its own null.
 *
 * @param number     the pull request number its repository states
 * @param author     the author it was selected by, as the host states the login
 * @param headSha    the commit the changed files were read at
 * @param baseSha    the commit of the branch the pull request asks to change, recorded when it was fetched
 * @param files      how many changed files were read
 * @param thresholds the threshold each reference's own permutation null sets for these files, in bits
 * @param signals    the words and published phrases clearing every one of those thresholds
 * @param statement  what the pull request says beside what it writes, and absent where no statement was
 *                   fetched or none of it could be read
 * @param work       the work the pull request states it does, classified against the published change
 *                   standards, and absent where no statement was fetched
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ExportedPullRequest(int number, String author, String headSha, String baseSha, int files,
                                  Map<String, Double> thresholds, List<ExportedSignal> signals,
                                  ExportedStatement statement, ExportedWork work) {

    public ExportedPullRequest {
        Objects.requireNonNull(author, "author");
        Objects.requireNonNull(headSha, "headSha");
        Objects.requireNonNull(baseSha, "baseSha");
        thresholds = Collections.unmodifiableSortedMap(new TreeMap<>(thresholds));
        signals = List.copyOf(signals);
    }

    public ExportedPullRequest(final int number, final String author, final String headSha,
                               final String baseSha, final int files, final Map<String, Double> thresholds,
                               final List<ExportedSignal> signals) {
        this(number, author, headSha, baseSha, files, thresholds, signals, null, null);
    }

    /** The same reading with this statement beside it. Nothing already read moves. */
    public ExportedPullRequest withStatement(final ExportedStatement stated) {
        return new ExportedPullRequest(number, author, headSha, baseSha, files, thresholds, signals,
                stated, work);
    }

    /** The same reading with this classification beside it. Nothing already read moves. */
    public ExportedPullRequest withWork(final ExportedWork classified) {
        return new ExportedPullRequest(number, author, headSha, baseSha, files, thresholds, signals,
                statement, classified);
    }
}
