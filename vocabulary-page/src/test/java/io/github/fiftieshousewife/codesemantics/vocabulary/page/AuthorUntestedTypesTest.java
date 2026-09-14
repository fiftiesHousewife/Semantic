package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.unnameable;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.untested;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.written;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AuthorUntestedTypesTest {

    private final AuthorUntestedTypes types = new AuthorUntestedTypes();

    @Test
    void namesEachTypeBesideTheTestItArrivesWithout() {
        final String markup = types.markup(author(untested("Engine"), untested("Loader"))).render();

        assertAll(
                () -> assertThat(markup).contains("Test it arrives without"),
                () -> assertThat(markup).contains("<code>Engine</code>"),
                () -> assertThat(markup).contains("<code>TestEngine</code>"),
                () -> assertThat(markup).contains("<code>Loader</code>"),
                () -> assertThat(markup).contains("<code>TestLoader</code>"));
    }

    @Test
    void writesADashWhereThePatternWouldNotReadTheTypesOwnNameBack() {
        final String markup = types.markup(author(unnameable("engine"))).render();

        assertAll(
                () -> assertThat(markup).contains("<code>engine</code>"),
                () -> assertThat(markup).contains(Figure.ABSENT));
    }

    @Test
    void statesThatEveryTypeArrivedWithATestWhereNoneIsNamed() {
        final String markup = types.markup(author()).render();

        assertAll(
                () -> assertThat(markup).contains("arrives with a test named for it"),
                () -> assertThat(markup).doesNotContain("Test it arrives without"));
    }

    private static AuthorPullRequests author(final ChangedCode.TypeWithoutATest... untested) {
        return new AuthorPullRequests("tika", "tballison", List.of(
                pullRequest(3153, "tballison", List.of("parser"))
                        .withWork(new ExportedWork(ExportedWork.Stated.noStatement(), List.of(),
                                written(2, 5, 3, List.of("Engine"), List.of(untested))))));
    }
}
