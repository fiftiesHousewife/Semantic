package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import io.github.fiftieshousewife.codesemantics.engine.export.MeasuredCode;
import org.junit.jupiter.api.Test;

import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.pullRequest;
import static io.github.fiftieshousewife.codesemantics.vocabulary.page.PullRequestFixture.spread;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class AuthorQualityTest {

    /** A repository whose methods carry a complexity of three in the middle of them. */
    private static final MeasuredCode.Spread REPOSITORY = spread(3, 8, 116);

    private final AuthorQuality quality = new AuthorQuality();

    @Test
    void saysTheMethodsAreMoreComplexWhereTheirMiddleSitsAboveTheRepositorys() {
        assertThat(quality.of(author(6, 8, 9)))
                .contains("more complex than the repository’s own, at a median of 8 against 3");
    }

    @Test
    void saysTheMethodsAreLessComplexWhereTheirMiddleSitsBelowIt() {
        assertThat(quality.of(author(1, 1, 2)))
                .contains("less complex than the repository’s own, at a median of 1 against 3");
    }

    @Test
    void saysTheMethodsAreAsComplexWhereTheTwoMiddlesAgree() {
        assertThat(quality.of(author(3, 3, 3)))
                .contains("as complex as the repository’s own, at a median of 3 each");
    }

    @Test
    void takesTheMiddleAtTheSmallestRankCoveringHalfOfThem() {
        assertThat(quality.of(author(6, 8)))
                .as("the same rank rule the tree's own spreads use, so an even count takes the lower")
                .contains("at a median of 6 against 3");
    }

    @Test
    void namesNeitherTheQuartileCountsNorTheLengthTheTableCarriesBelow() {
        final String said = quality.of(author(6, 8, 9));

        assertAll(
                () -> assertThat(said).doesNotContain("three quarters"),
                () -> assertThat(said).doesNotContain("longest"));
    }

    @Test
    void saysNothingAboutCodeItWasGivenNoBaseTreeToRead() {
        assertThat(quality.of(new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(1, "tballison", List.of("parser")))))).isEmpty();
    }

    private static AuthorPullRequests author(final int... medians) {
        return new AuthorPullRequests("tika", "tballison",
                IntStream.range(0, medians.length)
                        .mapToObj(index -> pullRequest(index + 1, "tballison", List.of("parser"))
                                .withWork(new ExportedWork(ExportedWork.Stated.noStatement(),
                                        List.of(), atComplexity(medians[index]))))
                        .toList(),
                List.of(), repository());
    }

    private static ChangedCode atComplexity(final int median) {
        return new ChangedCode(4, 2, new ChangedCode.Declarations(1, 2, 3),
                new ChangedCode.Declarations(0, 0, 0), 31, List.of(), List.of(),
                List.of(new ChangedCode.KindFiles("production", 4)),
                measured(spread(median, median, median)), measured(spread(1, 1, 1)), List.of(), 0);
    }

    private static MeasuredCode measured(final MeasuredCode.Spread complexity) {
        return new MeasuredCode(40, new MeasuredCode.Metrics(3, 9, 300, 24, spread(2, 5, 20),
                complexity, spread(1, 2, 4), spread(1, 2, 3)));
    }

    private static MeasuredCode repository() {
        return new MeasuredCode(400, new MeasuredCode.Metrics(30, 90, 3000, 240, spread(4, 12, 780),
                REPOSITORY, spread(1, 2, 6), spread(1, 2, 5)));
    }
}
