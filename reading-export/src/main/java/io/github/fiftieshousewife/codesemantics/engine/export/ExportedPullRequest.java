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
 * @param repository the repository it is of, as the host names it — {@code owner/name} — and absent where
 *                   the fetch step recorded none
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
 * @param concepts   what the bundled vocabularies state about the words these files write. They are
 *                   matches and not a placement: the bar a repository's placement clears is drawn over a
 *                   whole tree, and a few changed files are too small a field for it
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ExportedPullRequest(@JsonInclude(JsonInclude.Include.NON_EMPTY) String repository,
                                  int number, String author, String headSha, String baseSha, int files,
                                  Map<String, Double> thresholds, List<ExportedSignal> signals,
                                  ExportedStatement statement, ExportedWork work,
                                  List<MatchedConcept> concepts) {

    /**
     * One concept a published vocabulary states for a term these files write.
     *
     * @param vocabulary  which bundled vocabulary states it
     * @param term        the words matched, as the files write them
     * @param concept     the concept the vocabulary states for them
     * @param definition  the publisher's own prose for that concept, and empty where it states none
     * @param occurrences how often these files write the term
     */
    public record MatchedConcept(String vocabulary, String term, String concept, String definition,
                                 int occurrences) {
    }

    public ExportedPullRequest {
        Objects.requireNonNull(author, "author");
        concepts = List.copyOf(concepts);
        Objects.requireNonNull(headSha, "headSha");
        Objects.requireNonNull(baseSha, "baseSha");
        thresholds = Collections.unmodifiableSortedMap(new TreeMap<>(thresholds));
        signals = List.copyOf(signals);
    }

    public ExportedPullRequest(final String repository, final int number, final String author,
                               final String headSha, final String baseSha, final int files,
                               final Map<String, Double> thresholds,
                               final List<ExportedSignal> signals) {
        this(repository, number, author, headSha, baseSha, files, thresholds, signals, null, null,
                List.of());
    }

    /** A pull request whose fetch step recorded no repository, which only a test does. */
    public ExportedPullRequest(final int number, final String author, final String headSha,
                               final String baseSha, final int files, final Map<String, Double> thresholds,
                               final List<ExportedSignal> signals) {
        this("", number, author, headSha, baseSha, files, thresholds, signals, null, null, List.of());
    }

    /** The same reading with this statement beside it. Nothing already read moves. */
    public ExportedPullRequest withStatement(final ExportedStatement stated) {
        return new ExportedPullRequest(repository, number, author, headSha, baseSha, files, thresholds,
                signals, stated, work, concepts);
    }

    /** The same reading with what the vocabularies state about its words. Nothing already read moves. */
    public ExportedPullRequest withConcepts(final List<MatchedConcept> matched) {
        return new ExportedPullRequest(repository, number, author, headSha, baseSha, files, thresholds,
                signals, statement, work, matched);
    }

    /** The same reading with this classification beside it. Nothing already read moves. */
    public ExportedPullRequest withWork(final ExportedWork classified) {
        return new ExportedPullRequest(repository, number, author, headSha, baseSha, files, thresholds,
                signals, statement, classified, concepts);
    }
}
