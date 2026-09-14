package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.export.ChangedCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPullRequest;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedSignal;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedStatement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedWork;
import io.github.fiftieshousewife.codesemantics.engine.export.MeasuredCode;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingSource;
import io.github.fiftieshousewife.codesemantics.engine.export.SightingSite;

/** Pull request blocks of the shape the export publishes, for the author-report tests to read. */
final class PullRequestFixture {

    static final String HEAD = "7c80965e8f14c0465c7fdf3858009ed6cb691c30";

    static final String BASE = "68e57621168adf9e8e3004e3ff4ea6fd5e4c3cd7";

    private PullRequestFixture() {
    }

    static ExportedPullRequest pullRequest(final int number, final String author,
                                           final List<String> words) {
        return new ExportedPullRequest(number, author, HEAD, BASE, words.size(),
                Map.of("ordinary English", 0.001), words.stream().map(PullRequestFixture::signal).toList());
    }

    static ChangedCode written(final int types, final int methods, final int fields,
                                        final List<String> typesAdded) {
        return written(types, methods, fields, typesAdded, List.of());
    }

    static ChangedCode written(final int types, final int methods, final int fields,
                                        final List<String> typesAdded,
                                        final List<ChangedCode.TypeWithoutATest> untested) {
        return new ChangedCode(4, 2, new ChangedCode.Declarations(types, methods, fields),
                new ChangedCode.Declarations(0, 1, 0), 31,
                typesAdded.stream()
                        .map(name -> new ChangedCode.NamedDeclaration(name + ".java", name))
                        .toList(),
                List.of(), List.of(new ChangedCode.KindFiles("production", 4)),
                side(40, 300), side(30, 240), untested);
    }

    /** One type arriving with no test, named as the first of Surefire's default patterns would run it. */
    static ChangedCode.TypeWithoutATest untested(final String name) {
        return new ChangedCode.TypeWithoutATest(name + ".java", name, "Test" + name);
    }

    /** One type arriving with no test whose name that pattern would not read back. */
    static ChangedCode.TypeWithoutATest unnameable(final String name) {
        return new ChangedCode.TypeWithoutATest(name + ".java", name, "");
    }

    static MeasuredCode.Spread spread(final int median, final int upperQuartile, final int highest) {
        return new MeasuredCode.Spread(median, upperQuartile, highest);
    }

    static MeasuredCode side(final int commentLines, final int statements) {
        return new MeasuredCode(commentLines,
                new MeasuredCode.Metrics(3, 9, statements, 24, spread(2, 5, 20), spread(1, 3, 14),
                        spread(1, 2, 4), spread(1, 2, 3)));
    }

    /** The word Conventional Commits' own definition covers a change that only adds declarations with. */
    static ExportedWork.Inferred feat() {
        return new ExportedWork.Inferred("feat",
                "a commit of the type feat introduces a new feature to the codebase",
                "adds declarations and removes none");
    }

    static ExportedWork stated(final String type, final String trackerType) {
        return new ExportedWork(
                type.isEmpty() ? ExportedWork.Stated.noStatement()
                        : new ExportedWork.Stated(3, 1,
                                List.of(new ExportedWork.StatedClass(type, "specification", 1))),
                trackerType.isEmpty() ? List.of()
                        : List.of(new ExportedWork.Issue("TIKA-4889", trackerType,
                                "https://issues.apache.org/jira/browse/TIKA-4889")),
                null);
    }

    static ExportedStatement statement(final double divergence, final double chanceRate) {
        return new ExportedStatement(3, 33, divergence, 0.58, chanceRate, 999, List.of());
    }

    private static ExportedSignal signal(final String word) {
        return new ExportedSignal(ReadingSource.PULL_REQUEST, word, 12, 12, 0.01, 0.009,
                "the reference corpus", new SightingSite("A.java", 1));
    }
}
