package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.written;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AuthorFoldTest {

    private final AuthorFold fold = new AuthorFold();

    @Test
    void writesEverySubjectAVocabularyStatesInItalicsAsTheWordsAboveItAre() {
        final String markup = fold.markup(author()).render();

        assertAll(
                () -> assertThat(markup).contains("<em>parser</em>"),
                () -> assertThat(markup).contains("<em>Natural Language Processing</em>"),
                () -> assertThat(markup).contains("<em>Document Engineering</em>"),
                () -> assertThat(markup).contains("<a href=\"#concepts\">1 term</a>"),
                () -> assertThat(markup).contains("of what these files write, filed under "));
    }

    @Test
    void writesNoSuchClauseWhereNoVocabularyStatesASubjectForTheTerms() {
        assertThat(fold.markup(new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(3153, "tballison", List.of("parser"))))).render())
                .doesNotContain("of what these files write, filed under");
    }

    @Test
    void opensWithALineForEverySectionOfTheReport() {
        final String markup = fold.markup(withADiff()).render();

        assertAll(
                () -> assertThat(markup).contains("href=\"#commits\">How many"),
                () -> assertThat(markup).contains("href=\"#subjects\">About"),
                () -> assertThat(markup).contains("href=\"#work\">What kind"),
                () -> assertThat(markup).contains("href=\"#scale\">What it changes"),
                () -> assertThat(markup).contains("href=\"#untested\">What arrives tested"),
                () -> assertThat(markup).contains("href=\"#review\">What the code looks like"),
                () -> assertThat(markup)
                        .contains("href=\"#subjects\">How well the description fits"));
    }

    @Test
    void writesTheCodeLinesTheProseLinesAndTheTestMethodsItAdds() {
        final String markup = fold.markup(withADiff()).render();

        assertAll(
                () -> assertThat(markup).contains("It writes 60 statements of code and 10 lines of "
                        + "prose."),
                () -> assertThat(markup).contains("It adds 2 test methods."));
    }

    @Test
    void leavesOutEveryLineNeedingABaseTreeWhereNoneWasFetched() {
        final String markup = fold.markup(new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(3153, "tballison", List.of("parser"))))).render();

        assertAll(
                () -> assertThat(markup).contains("How many"),
                () -> assertThat(markup).doesNotContain("What it changes"),
                () -> assertThat(markup).doesNotContain("What the code looks like"));
    }

    private static AuthorPullRequests withADiff() {
        return new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(3153, "tballison", List.of("parser"))
                        .withWork(new ExportedWork(ExportedWork.Stated.noStatement(), List.of(),
                                written(2, 5, 3, List.of("Engine"))))));
    }

    private static AuthorPullRequests author() {
        return new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(3153, "tballison", List.of("parser"))
                        .withConcepts(List.of(under("Natural Language Processing"),
                                under("Document Engineering")))));
    }

    private static ExportedPullRequest.MatchedConcept under(final String subject) {
        return new ExportedPullRequest.MatchedConcept("CSO", "parser", "parsing",
                "the analysis of a string of symbols", List.of(subject, "parsing"), 12);
    }
}
