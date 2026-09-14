package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceKind;

/**
 * What an author's pull requests do to the code, in two sentences drawn from the figures already
 * measured: how much they add and remove, how much of it the build publishes and how much tests it, and
 * whether the methods they leave are more complex than the ones already there.
 *
 * <p>Whether that is an improvement is the reader's judgement. A reading that stated one would be
 * asserting something it has not measured.
 */
final class AuthorQuality {

    /** The share of the pull requests the middle one covers, as the tree's own spreads are taken. */
    private static final double MIDDLE = 0.5;

    /** What the pull requests change, and what a reviewer of them is taking on. */
    String of(final AuthorPullRequests author) {
        if (author.readAgainstABase() == 0) {
            return "";
        }
        return String.format(Locale.ROOT, "%s %s %s", changed(author), tested(author),
                complexity(author));
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

    /**
     * Whether the methods these pull requests leave are more complex than the ones already there, which
     * is the comparison a reviewer opens with. Both figures are medians, so neither is moved by one
     * outlying method, and the table below carries each pull request's own spread beside the
     * repository's.
     */
    private static String complexity(final AuthorPullRequests author) {
        final int repository = author.repositoryCode().metrics().complexity().median();
        final int theirs = middleOf(written(author)
                .map(diff -> diff.atHead().metrics().complexity().median())
                .toList());
        if (theirs == repository) {
            return String.format(Locale.ROOT, "Their methods are as complex as the repository\u2019s "
                    + "own, at a median of %d each.", repository);
        }
        return String.format(Locale.ROOT, "Their methods are %s complex than the repository\u2019s own, "
                + "at a median of %d against %d.", theirs > repository ? "more" : "less", theirs,
                repository);
    }

    /**
     * The value at the smallest rank covering half of them, which is the rule the tree's own spreads are
     * taken at, so an even count takes the lower of the two middles rather than a figure between them.
     */
    private static int middleOf(final List<Integer> figures) {
        final List<Integer> sorted = figures.stream()
                .sorted()
                .toList();
        return sorted.get((int) Math.ceil(MIDDLE * sorted.size()) - 1);
    }

    private static int filesOf(final AuthorPullRequests author, final SourceKind kind) {
        return written(author)
                .flatMap(diff -> diff.filesByKind().stream())
                .filter(files -> kind.published().equals(files.kind()))
                .mapToInt(ChangedCode.KindFiles::files)
                .sum();
    }

    private static Stream<ChangedCode> written(
            final AuthorPullRequests author) {
        return author.pullRequests().stream()
                .map(PullRequestWork::written)
                .flatMap(Optional::stream);
    }
}
