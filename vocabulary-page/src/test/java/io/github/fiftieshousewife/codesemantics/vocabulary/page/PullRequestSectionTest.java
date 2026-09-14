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
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.written;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PullRequestSectionTest {

    private final PullRequestSection section = new PullRequestSection();

    @Test
    void namesOneLinePerAuthorLinkingToThatAuthorsReport() {
        final String markup = section.markup(byAuthor(
                pullRequest(3153, "tballison", List.of("parser")).withWork(
                        new ExportedWork(ExportedWork.Stated.noStatement(), List.of(),
                                written(2, 5, 3, List.of("Engine")))))).render();

        assertAll(
                () -> assertThat(markup).contains("href=\"tballison.html\""),
                () -> assertThat(markup).contains("1 pull request, changing 1 file"),
                () -> assertThat(markup).contains("It adds 2 types, 5 methods and 3 fields"));
    }

    @Test
    void statesTheAbsenceWhereNoPullRequestWasFetched() {
        assertThat(section.markup(byAuthor()).render())
                .contains("No pull request was fetched for this repository");
    }

    private static List<AuthorPullRequests> byAuthor(final ExportedPullRequest... pullRequests) {
        return AuthorPullRequests.in(PullRequestExport.of("apache/tika", PullRequestFixture.side(400, 3000),
                List.of(pullRequests)),
                ReadingExport.of(
                        new ExportedSummary("tika", "c0ffee", List.of(ExportedAnswer.NONE), List.of(),
                                List.of(), List.of(), List.of(), List.of(), List.of(), 0.9, 0.5,
                                new ExportedSummary.Counts(0, 0, 0)),
                        List.of(), Map.of("ordinary English", 0.001), List.of(), List.of(),
                        new SetAside(0, 0, 0, 0, 0, 0, List.of(), 0, 0, 0)));
    }
}
