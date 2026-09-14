package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.stated;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.statement;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.written;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AuthorPageTest {

    private final AuthorPage page = new AuthorPage("", "");

    @Test
    void writesOneReportNamingTheAuthorTheRepositoryAndEveryPullRequest() {
        final String markup = page.markup(author());

        assertAll(
                () -> assertThat(markup).contains("<title>tballison on tika</title>"),
                () -> assertThat(markup).contains("2 pull requests, 3 files changed"),
                () -> assertThat(markup).contains("3153"),
                () -> assertThat(markup).contains("3154"),
                () -> assertThat(markup).contains(PullRequestFixture.HEAD));
    }

    @Test
    void statesBothSidesOfTheWorkAndTheTypesItIntroduces() {
        final String markup = page.markup(author());

        assertAll(
                () -> assertThat(markup).contains("calls all 2 a Task"),
                () -> assertThat(markup).contains("2 types, 5 methods and 3 fields"),
                () -> assertThat(markup).contains("href=\"https://github.com/tballison\""),
                () -> assertThat(markup).contains("Engine"),
                () -> assertThat(markup).contains("Conventional Commits"));
    }

    @Test
    void linksBackToTheRepositorysOwnFindingsPage() {
        assertThat(page.markup(author())).contains("href=\"reading.html\"");
    }

    private static AuthorPullRequests author() {
        return new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(3153, "tballison", List.of("parser", "loader"))
                        .withStatement(statement(0.382, 0.962))
                        .withWork(work("Engine")),
                pullRequest(3154, "tballison", List.of("parser"))
                        .withWork(stated("", "Task"))));
    }

    private static ExportedWork work(final String type) {
        return new ExportedWork(ExportedWork.Stated.noStatement(),
                stated("", "Task").issues(), written(2, 5, 3, List.of(type)));
    }
}
