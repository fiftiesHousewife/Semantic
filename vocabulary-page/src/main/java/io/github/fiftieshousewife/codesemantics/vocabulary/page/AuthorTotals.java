package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceKind;

/**
 * The figures the summary adds up across one author's pull requests, each one a sum of what a section
 * further down the report states per pull request.
 *
 * <p>Nothing is recomputed. Every figure here is a total of figures the reading already published, so a
 * summary line and the table it summarises cannot disagree.
 */
final class AuthorTotals {

    /** How many files of this kind the author's pull requests changed. */
    static int filesOf(final AuthorPullRequests author, final SourceKind kind) {
        return written(author)
                .flatMap(diff -> diff.filesByKind().stream())
                .filter(files -> kind.published().equals(files.kind()))
                .mapToInt(ChangedCode.KindFiles::files)
                .sum();
    }

    /** Statements at the head less statements at the base, which is what one change adds in code. */
    static int statementsAdded(final ChangedCode written) {
        return written.atHead().metrics().statements() - written.atBase().metrics().statements();
    }

    /** Prose lines at the head less prose lines at the base, each weighed as the parse weighs a copy. */
    static int proseLinesAdded(final ChangedCode written) {
        return written.atHead().commentLines() - written.atBase().commentLines();
    }

    static int statementsAdded(final AuthorPullRequests author) {
        return written(author)
                .mapToInt(AuthorTotals::statementsAdded)
                .sum();
    }

    static int proseLinesAdded(final AuthorPullRequests author) {
        return written(author)
                .mapToInt(AuthorTotals::proseLinesAdded)
                .sum();
    }

    /** How many statements stand in a method body another method of the same change writes too. */
    static int statementsRepeated(final AuthorPullRequests author) {
        return written(author)
                .mapToInt(diff -> diff.repeated().statements())
                .sum();
    }

    /** The biggest body any one change repeats, which is what a total of trivial repeats cannot say. */
    static int biggestRepeat(final AuthorPullRequests author) {
        return written(author)
                .mapToInt(diff -> diff.repeated().largest())
                .max()
                .orElse(0);
    }

    static int testMethodsAdded(final AuthorPullRequests author) {
        return written(author)
                .mapToInt(ChangedCode::testMethodsAdded)
                .sum();
    }

    /** How many terms the bundled vocabularies name across the changed files, counting a term once. */
    static long termsNamed(final AuthorPullRequests author) {
        return author.pullRequests().stream()
                .flatMap(pullRequest -> pullRequest.concepts().stream())
                .map(ExportedPullRequest.MatchedConcept::term)
                .distinct()
                .count();
    }

    /**
     * How many pull requests fall in each band of description fit, strongest band first. The order is
     * the enum's own, so a list is returned where a map would lose it.
     */
    static List<Map.Entry<StatementFit, Long>> fits(final AuthorPullRequests author) {
        return Stream.of(StatementFit.values())
                .map(band -> Map.entry(band, many(author, band)))
                .filter(counted -> counted.getValue() > 0)
                .toList();
    }

    private static long many(final AuthorPullRequests author, final StatementFit band) {
        return author.pullRequests().stream()
                .map(pullRequest -> StatementFit.of(pullRequest.statement()))
                .flatMap(Optional::stream)
                .filter(band::equals)
                .count();
    }

    private AuthorTotals() {
    }

    private static Stream<ChangedCode> written(final AuthorPullRequests author) {
        return author.pullRequests().stream()
                .map(PullRequestWork::written)
                .flatMap(Optional::stream);
    }
}
