package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSummary;
import io.github.fiftieshousewife.codesemantics.engine.export.PullRequestExport;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.export.SetAside;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.stated;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.written;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AuthorPullRequestsTest {

    @Test
    void groupsAReadingsPullRequestsByTheAuthorTheFetchSelectedThemOn() {
        final List<AuthorPullRequests> authors = AuthorPullRequests.in(fetched(
                pullRequest(3153, "tballison", List.of("parser")),
                pullRequest(3154, "tballison", List.of("loader")),
                pullRequest(9, "someone", List.of("cipher"))), reading());

        assertAll(
                () -> assertThat(authors).extracting(AuthorPullRequests::author)
                        .containsExactly("tballison", "someone"),
                () -> assertThat(authors.getFirst().pullRequests())
                        .extracting(ExportedPullRequest::number)
                        .containsExactly(3153, 3154),
                () -> assertThat(authors.getFirst().file()).isEqualTo("tballison.html"));
    }

    @Test
    void sumsTheDeclarationsOfEveryPullRequestReadAgainstABase() {
        final AuthorPullRequests author = AuthorPullRequests.in(fetched(
                pullRequest(1, "tballison", List.of("parser"))
                        .withWork(withWritten(written(2, 5, 3, List.of("Engine")))),
                pullRequest(2, "tballison", List.of("loader"))
                        .withWork(withWritten(written(1, 4, 0, List.of("Loader"))))), reading()).getFirst();

        assertAll(
                () -> assertThat(author.added().types()).isEqualTo(3),
                () -> assertThat(author.added().methods()).isEqualTo(9),
                () -> assertThat(author.added().fields()).isEqualTo(3),
                () -> assertThat(author.removed().methods()).isEqualTo(2),
                () -> assertThat(author.kept()).isEqualTo(62),
                () -> assertThat(author.filesRead()).isEqualTo(8),
                () -> assertThat(author.typesAdded()).hasSize(2));
    }

    @Test
    void countsNoDeclarationWhereNoPullRequestWasReadAgainstABase() {
        final AuthorPullRequests author = AuthorPullRequests.in(fetched(
                pullRequest(1, "tballison", List.of("parser"))), reading()).getFirst();

        assertAll(
                () -> assertThat(author.readAgainstABase()).isZero(),
                () -> assertThat(author.added().types()).isZero(),
                () -> assertThat(author.filesRead()).isZero());
    }

    @Test
    void countsTheTrackersTypesAcrossThePullRequestsThatReferenceThem() {
        final AuthorPullRequests author = AuthorPullRequests.in(fetched(
                pullRequest(1, "tballison", List.of("parser")).withWork(stated("", "Task")),
                pullRequest(2, "tballison", List.of("loader")).withWork(stated("fix", "Bug")),
                pullRequest(3, "tballison", List.of("engine")).withWork(stated("fix", "Task"))), reading())
                .getFirst();

        assertAll(
                () -> assertThat(author.trackerTypes()).containsOnly(
                        Map.entry("Task", 2), Map.entry("Bug", 1)),
                () -> assertThat(author.statedClasses()).containsOnly(Map.entry("fix", 2)));
    }

    private static ExportedWork withWritten(final ExportedWork.Written diff) {
        return new ExportedWork(ExportedWork.Stated.noStatement(), List.of(), diff);
    }

    private static PullRequestExport fetched(final ExportedPullRequest... pullRequests) {
        return PullRequestExport.of("apache/tika", List.of(pullRequests));
    }

    private static ReadingExport reading() {
        return ReadingExport.of(
                new ExportedSummary("tika", "c0ffee", List.of(ExportedAnswer.NONE), List.of(), List.of(),
                        List.of(), List.of(), List.of(), List.of(), 0.9, 0.5,
                        new ExportedSummary.Counts(0, 0, 0)),
                List.of(), Map.of("ordinary English", 0.001), List.of(), List.of(),
                new SetAside(0, 0, 0, 0, 0, 0, List.of(), 0, 0, 0));
    }
}
