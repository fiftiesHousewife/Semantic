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

    /** The share of the pull requests the middle one covers, at the rank the tree's own spreads use. */
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
        return String.format(Locale.ROOT, "These pull requests add %s and remove %s, across %d "
                        + "files the build publishes and %d that test them.",
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
     * is the comparison a reviewer opens with.
     *
     * <p>Both figures are upper quartiles, not medians. A median complexity is one almost everywhere —
     * tika's is, and so is nearly every pull request's — so a median would report the two as equal
     * whatever the change did. Three quarters of the way up the methods is where the measure moves, and
     * it is the same bound the marks in the table below are drawn at.
     *
     * <p>The pull requests' own figure is the middle one's, so a single unusual change does not carry the
     * sentence, and a change declaring no method at all is read past rather than counted as nought.
     */
    private static String complexity(final AuthorPullRequests author) {
        final int repository = author.repositoryCode().metrics().complexity().upperQuartile();
        final List<Integer> declared = written(author)
                .map(diff -> diff.atHead().metrics())
                .filter(metrics -> metrics.methods() > 0)
                .map(metrics -> metrics.complexity().upperQuartile())
                .toList();
        if (declared.isEmpty()) {
            return "None of them declares a method, so there is nothing to compare with the "
                    + "repository\u2019s own.";
        }
        return said(middleOf(declared), repository);
    }

    private static String said(final int theirs, final int repository) {
        if (theirs == repository) {
            return String.format(Locale.ROOT, "Their methods are as complex as the repository\u2019s "
                    + "own: three quarters of each sit at or below %d.", repository);
        }
        return String.format(Locale.ROOT, "Their methods are %s complex than the repository\u2019s own: "
                + "three quarters sit at or below %d, against its %d.",
                theirs > repository ? "more" : "less", theirs, repository);
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
