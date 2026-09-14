package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
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
                () -> assertThat(markup).contains("file the terms these files write under "));
    }

    @Test
    void writesNoSuchClauseWhereNoVocabularyStatesASubjectForTheTerms() {
        assertThat(fold.markup(new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(3153, "tballison", List.of("parser"))))).render())
                .doesNotContain("file the terms these files write under");
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
