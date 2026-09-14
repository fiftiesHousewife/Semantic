package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.stated;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AuthorSummaryTest {

    private final AuthorSummary summary = new AuthorSummary();

    @Test
    void opensWithHowMuchTheyChange() {
        assertThat(summary.volume(author(adding(2, 5, 3), adding(1, 1, 0))))
                .isEqualTo("2 pull requests, 2 files changed.");
    }

    @Test
    void namesTheStandardsWordForTheShapeAndTheShapeItCovers() {
        assertThat(summary.kind(author(adding(2, 5, 3), adding(1, 1, 0))))
                .isEqualTo("Each adds declarations and removes none — feat under Conventional "
                        + "Commits.");
    }

    @Test
    void namesWhatTheRepositorysOwnTrackerCallsTheWork() {
        assertThat(summary.tracker(author(adding(2, 5, 3), adding(1, 1, 0))))
                .isEqualTo("The tika issue tracker calls all 2 a Task.");
    }

    @Test
    void namesNoKindWhereNoDefinitionCoversTheShape() {
        final AuthorPullRequests author = new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(1, "tballison", List.of("parser"))
                        .withWork(new ExportedWork(ExportedWork.Stated.noStatement(), List.of(),
                                adding(0, 0, 0), null))));

        assertThat(summary.kind(author))
                .isEqualTo("No published definition covers the shape of these changes.");
    }

    @Test
    void namesTheWordsMoreThanOnePullRequestWrites() {
        final AuthorPullRequests author = new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(1, "tballison", List.of("parser", "loader")),
                pullRequest(2, "tballison", List.of("parser", "engine"))));

        assertThat(summary.subjectWords(author)).containsExactly("parser");
    }

    @Test
    void namesNoWordWhereThePullRequestsShareNone() {
        final AuthorPullRequests author = new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(1, "tballison", List.of("parser")),
                pullRequest(2, "tballison", List.of("cipher"))));

        assertThat(summary.subjectWords(author)).isEmpty();
    }

    @Test
    void namesTheStandardsWordWhereOneCoversEveryChange() {
        assertThat(summary.word(author(adding(2, 5, 3), adding(1, 1, 0)))).isEqualTo("feat");
    }

    @Test
    void saysNothingOfTheCodeWhereNoBaseWasFetched() {
        final AuthorPullRequests author = new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(1, "tballison", List.of("parser")).withWork(stated("", "Task"))));

        assertAll(
                () -> assertThat(summary.volume(author))
                        .isEqualTo("1 pull request, 1 file changed."),
                () -> assertThat(summary.kind(author)).doesNotContain("feat"),
                () -> assertThat(summary.tracker(author))
                        .isEqualTo("The tika issue tracker calls all 1 a Task."));
    }

    private static ChangedCode adding(final int types, final int methods, final int fields) {
        return new ChangedCode(4, 2, new ChangedCode.Declarations(types, methods, fields),
                new ChangedCode.Declarations(0, 0, 0), 31, List.of(), List.of(),
                List.of(new ChangedCode.KindFiles("production", 4)),
                PullRequestFixture.side(40, 300), PullRequestFixture.side(30, 240), List.of());
    }

    private static AuthorPullRequests author(final ChangedCode... written) {
        return new AuthorPullRequests("tika", "tballison",
                IntStream.range(0, written.length)
                        .mapToObj(index -> pullRequest(index + 1, "tballison", List.of("parser"))
                                .withWork(new ExportedWork(ExportedWork.Stated.noStatement(),
                                        stated("", "Task").issues(), written[index],
                                        PullRequestFixture.feat())))
                        .toList());
    }
}
