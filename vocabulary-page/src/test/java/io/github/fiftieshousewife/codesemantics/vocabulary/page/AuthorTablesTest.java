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

class AuthorTablesTest {

    private final AuthorWork work = new AuthorWork();

    private final AuthorScale scale = new AuthorScale();

    private final AuthorReview review = new AuthorReview();

    private final AuthorSubjects subjects = new AuthorSubjects();

    @Test
    void namesWhatEachSideCallsTheChange() {
        final String markup = work.markup(author()).render();

        assertAll(
                () -> assertThat(markup).contains("feat"),
                () -> assertThat(markup).contains("adds declarations and removes none"),
                () -> assertThat(markup).contains("Task (TIKA-4889)"));
    }

    @Test
    void countsTheFilesOfEachKindAndTheDeclarationsInThem() {
        final String markup = scale.markup(author()).render();

        assertAll(
                () -> assertThat(markup).contains("Production"),
                () -> assertThat(markup).contains("Fixtures"),
                () -> assertThat(markup).contains("Untouched"),
                () -> assertThat(markup)
                        .as("the two tables are counted in two units and are kept apart")
                        .contains("Files it touches")
                        .contains("Declarations it changes"));
    }

    @Test
    void statesWhatAReviewerIsTakingOn() {
        final String markup = review.markup(author()).render();

        assertAll(
                () -> assertThat(markup).contains("Types with no test"),
                () -> assertThat(markup).contains("Test methods added"),
                () -> assertThat(markup)
                        .as("the count of test methods is the figure the fixture states")
                        .contains(">2<"),
                () -> assertThat(markup).contains("Complexity per method, median"),
                () -> assertThat(markup).contains("Complexity per method, worst"),
                () -> assertThat(markup)
                        .as("the repository's own column is what the others are read against")
                        .contains("class=\"number reference\""),
                () -> assertThat(markup)
                        .as("the band is a shape in the cell, not a colour behind it")
                        .contains(MetricBand.TYPICAL.mark())
                        .contains("class=\"mark\""),
                () -> assertThat(markup).doesNotContain("\u25cf"));
    }

    @Test
    void writesADashWhereNoBaseTreeWasFetched() {
        final AuthorPullRequests without = new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(1, "tballison", List.of("parser"))));

        assertAll(
                () -> assertThat(scale.markup(without).render()).contains(Figure.ABSENT),
                () -> assertThat(review.markup(without).render()).contains(Figure.ABSENT));
    }

    @Test
    void quotesTheStrongestWordsAndHowWellEachDescriptionFits() {
        final String markup = subjects.markup(author()).render();

        assertAll(
                () -> assertThat(markup).contains("parser"),
                () -> assertThat(markup).contains("high"),
                () -> assertThat(markup).contains("href=\"#words-3153\""),
                () -> assertThat(markup).contains("Description fits"));
    }

    private static AuthorPullRequests author() {
        return new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(3153, "tballison", List.of("parser", "loader"))
                        .withStatement(statement(0.382, 0.962))
                        .withWork(new ExportedWork(ExportedWork.Stated.noStatement(),
                                stated("", "Task").issues(), written(2, 5, 3, List.of("Engine")),
                                PullRequestFixture.feat()))),
                List.of("parser"));
    }
}
