package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AuthorWordsTest {

    private final AuthorWords words = new AuthorWords();

    @Test
    void countsHowManyPullRequestsWriteEachWordAboveTheirOwnThresholds() {
        final List<AuthorWords.Shared> shared = words.acrossPullRequests(author(
                List.of("parser", "loader"), List.of("parser", "engine")));

        assertAll(
                () -> assertThat(shared.getFirst().word()).isEqualTo("parser"),
                () -> assertThat(shared.getFirst().pullRequests()).isEqualTo(2),
                () -> assertThat(shared.getFirst().occurrences()).isEqualTo(24),
                () -> assertThat(shared).extracting(AuthorWords.Shared::word)
                        .containsExactlyInAnyOrder("parser", "loader", "engine"));
    }

    @Test
    void refusesAWordNoDictionaryReads() {
        assertThat(words.acrossPullRequests(author(List.of("qzxv", "parser"), List.of("qzxv", "parser"))))
                .extracting(AuthorWords.Shared::word)
                .containsExactly("parser");
    }

    @SafeVarargs
    private static AuthorPullRequests author(final List<String>... pullRequests) {
        return new AuthorPullRequests("tika", "tballison",
                IntStream.range(0, pullRequests.length)
                        .mapToObj(index -> pullRequest(index + 1, "tballison", pullRequests[index]))
                        .toList());
    }
}
