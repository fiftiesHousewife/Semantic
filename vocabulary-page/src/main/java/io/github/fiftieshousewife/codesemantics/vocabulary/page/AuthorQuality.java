package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Locale;
import java.util.Optional;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import io.github.fiftieshousewife.codesemantics.engine.export.MeasuredCode;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceKind;

/**
 * What an author's pull requests do to the code, in two sentences drawn from the figures already
 * measured: how much they add and remove, how much of it the build publishes and how much tests it, and
 * how many of them leave a method above what three quarters of the repository's own methods reach.
 *
 * <p>Whether that is an improvement is the reader's judgement. A reading that stated one would be
 * asserting something it has not measured.
 */
final class AuthorQuality {

    /** What the pull requests change, and what a reviewer of them is taking on. */
    String of(final AuthorPullRequests author) {
        if (author.readAgainstABase() == 0) {
            return "";
        }
        return String.format(Locale.ROOT, "%s %s %s", changed(author), tested(author), spread(author));
    }

    private static String changed(final AuthorPullRequests author) {
        return String.format(Locale.ROOT, "They add %s and remove %s, across %d files the build "
                        + "publishes and %d that test them.",
                DeclarationPhrase.of(author.added()), DeclarationPhrase.of(author.removed()),
                filesOf(author, SourceKind.PRODUCTION), filesOf(author, SourceKind.TESTS));
    }

    private static String tested(final AuthorPullRequests author) {
        final int untested = author.typesAddedWithoutATest().size();
        if (untested == 0) {
            return "Every type they add to the published code arrives with a test named for it.";
        }
        return String.format(Locale.ROOT,
                "%d of the types they add to the published code arrive with no test named for them.",
                untested);
    }

    private static String spread(final AuthorPullRequests author) {
        final MeasuredCode.Metrics repository = author.repositoryCode().metrics();
        final long complex = above(author, metrics -> metrics.complexity().highest(),
                repository.complexity());
        final long longest = above(author, metrics -> metrics.methodStatements().highest(),
                repository.methodStatements());
        return String.format(Locale.ROOT,
                "In %d of them the most complex method is above what three quarters of the repository's "
                        + "own methods reach, and in %d the longest method is.",
                complex, longest);
    }

    /** How many of the author's pull requests leave a figure above the repository's upper quartile. */
    private static long above(final AuthorPullRequests author,
                              final ToIntFunction<MeasuredCode.Metrics> figure,
                              final MeasuredCode.Spread repository) {
        return written(author)
                .filter(diff -> MetricBand.of(figure.applyAsInt(diff.atHead().metrics()), repository)
                        == MetricBand.UNUSUAL)
                .count();
    }

    private static int filesOf(final AuthorPullRequests author, final SourceKind kind) {
        return written(author)
                .flatMap(diff -> diff.filesByKind().stream())
                .filter(files -> kind.published().equals(files.kind()))
                .mapToInt(ExportedWork.KindFiles::files)
                .sum();
    }

    private static Stream<ExportedWork.Written> written(
            final AuthorPullRequests author) {
        return author.pullRequests().stream()
                .map(PullRequestWork::written)
                .flatMap(Optional::stream);
    }
}
