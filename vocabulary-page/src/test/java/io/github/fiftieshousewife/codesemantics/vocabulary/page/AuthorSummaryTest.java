package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.stream.IntStream;

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
                .isEqualTo("2 pull requests, changing 2 files. The reading covers 8 of those files, 4 of "
                        + "them new, and counts 12 declarations added and none removed.");
    }

    @Test
    void namesTheStandardsWordForTheShapeAndTheShapeItCovers() {
        assertThat(summary.kind(author(adding(2, 5, 3), adding(1, 1, 0))))
                .isEqualTo("Conventional Commits calls all 2 a feat: each adds declarations and "
                        + "removes none.");
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
                .isEqualTo("No standard's definition covers the shape of these changes, so nothing "
                        + "names the kind of work they are.");
    }

    @Test
    void namesTheWordsMoreThanOnePullRequestWrites() {
        final AuthorPullRequests author = new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(1, "tballison", List.of("parser", "loader")),
                pullRequest(2, "tballison", List.of("parser", "engine"))));

        assertThat(summary.subject(author))
                .isEqualTo("Their code is about parser — each written more densely than both ordinary "
                        + "English and a reference corpus of ten Java repositories.");
    }

    @Test
    void saysSoWhereThePullRequestsShareNoWord() {
        final AuthorPullRequests author = new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(1, "tballison", List.of("parser")),
                pullRequest(2, "tballison", List.of("cipher"))));

        assertThat(summary.subject(author))
                .isEqualTo("No word is written more densely than both references in more than one of "
                        + "the 2, so they have no subject matter in common.");
    }

    @Test
    void saysNothingOfTheCodeWhereNoBaseWasFetched() {
        final AuthorPullRequests author = new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(1, "tballison", List.of("parser")).withWork(stated("", "Task"))));

        assertAll(
                () -> assertThat(summary.volume(author))
                        .isEqualTo("1 pull request, changing 1 file."),
                () -> assertThat(summary.kind(author)).doesNotContain("feat"),
                () -> assertThat(summary.tracker(author))
                        .isEqualTo("The tika issue tracker calls all 1 a Task."));
    }

    private static ExportedWork.Written adding(final int types, final int methods, final int fields) {
        return new ExportedWork.Written(4, 2, new ExportedWork.Declarations(types, methods, fields),
                new ExportedWork.Declarations(0, 0, 0), 31, List.of(), List.of(),
                List.of(new ExportedWork.KindFiles("production", 4)),
                PullRequestFixture.side(40, 300), PullRequestFixture.side(30, 240), List.of());
    }

    private static AuthorPullRequests author(final ExportedWork.Written... written) {
        return new AuthorPullRequests("tika", "tballison",
                IntStream.range(0, written.length)
                        .mapToObj(index -> pullRequest(index + 1, "tballison", List.of("parser"))
                                .withWork(new ExportedWork(ExportedWork.Stated.noStatement(),
                                        stated("", "Task").issues(), written[index],
                                        PullRequestFixture.feat())))
                        .toList());
    }
}
