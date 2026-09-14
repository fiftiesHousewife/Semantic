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

    /** A repository three quarters of whose methods carry a complexity of two or less. */
    private static final MeasuredCode.Spread REPOSITORY = spread(1, 2, 116);

    private final AuthorQuality quality = new AuthorQuality();

    @Test
    void saysTheMethodsAreMoreComplexWhereTheirQuartileSitsAboveTheRepositorys() {
        assertThat(quality.of(author(3, 5, 5)))
                .contains("more complex than the repository’s own: three quarters sit at or below 5, "
                        + "against its 2");
    }

    @Test
    void saysTheMethodsAreLessComplexWhereTheirQuartileSitsBelowIt() {
        assertThat(quality.of(author(1, 1, 2)))
                .contains("less complex than the repository’s own: three quarters sit at or below 1, "
                        + "against its 2");
    }

    @Test
    void saysTheMethodsAreAsComplexWhereTheTwoQuartilesAgree() {
        assertThat(quality.of(author(2, 2, 3)))
                .contains("as complex as the repository’s own: three quarters of each sit at or below 2");
    }

    @Test
    void readsTheQuartileRatherThanTheMedianBecauseAMedianComplexityIsOneAlmostEverywhere() {
        assertThat(quality.of(author(5, 5, 5)))
                .as("every method has a complexity of one at the median, so a median compares nothing")
                .doesNotContain("median");
    }

    @Test
    void takesTheMiddlePullRequestAtTheSmallestRankCoveringHalfOfThem() {
        assertThat(quality.of(author(3, 5)))
                .as("the same rank rule the tree's own spreads use, so an even count takes the lower")
                .contains("three quarters sit at or below 3");
    }

    @Test
    void readsPastAChangeDeclaringNoMethodAtAll() {
        assertThat(quality.of(author(0, 5, 5)))
                .as("a change touching only poms declares no method and says nothing about complexity")
                .contains("three quarters sit at or below 5");
    }

    @Test
    void saysThereIsNothingToCompareWhereNoneOfThemDeclaresAMethod() {
        assertThat(quality.of(author(0, 0)))
                .contains("None of them declares a method, so there is nothing to compare");
    }

    @Test
    void namesNeitherTheQuartileCountsNorTheLengthTheTableCarriesBelow() {
        final String said = quality.of(author(3, 5, 5));

        assertAll(
                () -> assertThat(said).doesNotContain("In 2 of them"),
                () -> assertThat(said).doesNotContain("longest"));
    }

    @Test
    void saysNothingAboutCodeItWasGivenNoBaseTreeToRead() {
        assertThat(quality.of(new AuthorPullRequests("tika", "tballison",
                List.of(pullRequest(1, "tballison", List.of("parser")))))).isEmpty();
    }

    private static AuthorPullRequests author(final int... upperQuartiles) {
        return new AuthorPullRequests("tika", "tballison",
                IntStream.range(0, upperQuartiles.length)
                        .mapToObj(index -> pullRequest(index + 1, "tballison", List.of("parser"))
                                .withWork(new ExportedWork(ExportedWork.Stated.noStatement(),
                                        List.of(), atComplexity(upperQuartiles[index]))))
                        .toList(),
                List.of(), repository());
    }

    /** A change whose methods reach this complexity three quarters of the way up them, or none at all. */
    private static ChangedCode atComplexity(final int upperQuartile) {
        return new ChangedCode(4, 2, new ChangedCode.Declarations(1, 2, 3),
                new ChangedCode.Declarations(0, 0, 0), 31, List.of(), List.of(),
                List.of(new ChangedCode.KindFiles("production", 4)),
                measured(upperQuartile), measured(1), List.of(), 0);
    }

    private static MeasuredCode measured(final int upperQuartile) {
        final int methods = upperQuartile == 0 ? 0 : 9;
        return new MeasuredCode(40, new MeasuredCode.Metrics(3, methods, 300, 24, spread(2, 5, 20),
                spread(1, upperQuartile, upperQuartile), spread(1, 2, 4), spread(1, 2, 3)));
    }

    private static MeasuredCode repository() {
        return new MeasuredCode(400, new MeasuredCode.Metrics(30, 90, 3000, 240, spread(4, 12, 780),
                REPOSITORY, spread(1, 2, 6), spread(1, 2, 5)));
    }
}
