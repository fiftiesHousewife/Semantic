package io.github.fiftieshousewife.codesemantics.repository;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class RepositoryFactsTest {

    private static final String BASE = "1111111111111111111111111111111111111111";
    private static final String HEAD = "2222222222222222222222222222222222222222";

    private static PullRequestFacts pullRequest(final int number, final Instant mergedAt,
                                               final List<String> labels) {
        return new PullRequestFacts(number, "Add Kotlin tabs", "", "closed", mergedAt, HEAD, BASE, HEAD,
                "danil-pavlov", false, labels);
    }

    @Test
    void carriesTheHostSoAnEnterpriseInstallationIsNotAConstant() {
        final RepositoryFacts facts = new RepositoryFacts("git.example.com", "platform", "engine", "main",
                List.of());

        assertAll(
                () -> assertThat(facts.host()).isEqualTo("git.example.com"),
                () -> assertThat(facts.pullRequests()).isEmpty());
    }

    @Test
    void copiesItsPullRequestsSoALaterMutationCannotRewriteThem() {
        final List<PullRequestFacts> requests = new ArrayList<>(List.of(pullRequest(5970, null, List.of())));
        final RepositoryFacts facts = new RepositoryFacts("github.com", "junit-team", "junit-framework",
                "main", requests);
        requests.add(pullRequest(5974, null, List.of()));

        assertThat(facts.pullRequests()).hasSize(1);
    }

    @Test
    void requiresTheCoordinatesAPermalinkIsRenderedFrom() {
        assertAll(
                () -> assertThatThrownBy(() ->
                        new RepositoryFacts(null, "junit-team", "junit-framework", "main", List.of()))
                        .isInstanceOf(NullPointerException.class).hasMessage("host"),
                () -> assertThatThrownBy(() ->
                        new RepositoryFacts("github.com", null, "junit-framework", "main", List.of()))
                        .isInstanceOf(NullPointerException.class).hasMessage("owner"),
                () -> assertThatThrownBy(() ->
                        new RepositoryFacts("github.com", "junit-team", null, "main", List.of()))
                        .isInstanceOf(NullPointerException.class).hasMessage("name"));
    }

    @Test
    void aPullRequestScopeIsItsMergeDiffAndNotItsCommits() {
        final PullRequestFacts request = pullRequest(5970, null, List.of("theme: documentation"));

        assertAll(
                () -> assertThat(request.baseSha()).isEqualTo(BASE),
                () -> assertThat(request.headSha()).isEqualTo(HEAD),
                () -> assertThat(request.labels()).containsExactly("theme: documentation"));
    }

    @Test
    void anUnmergedPullRequestReportsNoMergeInstantRatherThanNull() {
        assertAll(
                () -> assertThat(pullRequest(5974, null, List.of()).merged()).isEmpty(),
                () -> assertThat(pullRequest(5970, Instant.EPOCH, List.of()).merged()).contains(Instant.EPOCH));
    }

    @Test
    void aPullRequestPinsTheCommitsItsDiffIsTakenBetween() {
        assertAll(
                () -> assertThatThrownBy(() -> new PullRequestFacts(1, "t", "", "open", null, null, null, HEAD,
                        "renovate[bot]", true, List.of()))
                        .isInstanceOf(NullPointerException.class).hasMessage("baseSha"),
                () -> assertThatThrownBy(() -> new PullRequestFacts(1, "t", "", "open", null, null, BASE, null,
                        "renovate[bot]", true, List.of()))
                        .isInstanceOf(NullPointerException.class).hasMessage("headSha"));
    }
}
