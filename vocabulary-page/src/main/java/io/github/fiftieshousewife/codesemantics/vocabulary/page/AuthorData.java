package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;

/** What the report's clouds are drawn from: each pull request's words, merged to their dictionary form. */
final class AuthorData {

    private final PullRequestWords words = new PullRequestWords();

    private final ObjectMapper mapper = new ObjectMapper();

    /** One entry per pull request, strongest word first. */
    record Drawn(int number, List<PullRequestWords.Merged> words) {
    }

    record Clouds(List<Drawn> pullRequests) {
    }

    String of(final AuthorPullRequests author) {
        try {
            return mapper.writeValueAsString(new Clouds(author.pullRequests().stream()
                    .map(this::drawn)
                    .toList()));
        } catch (final JsonProcessingException e) {
            throw new IllegalStateException("The report's own figures could not be written", e);
        }
    }

    private Drawn drawn(final ExportedPullRequest pullRequest) {
        return new Drawn(pullRequest.number(), words.of(pullRequest));
    }
}
