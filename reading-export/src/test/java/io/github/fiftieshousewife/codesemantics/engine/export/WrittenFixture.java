package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

/** A declaration diff of the shape the export publishes, so one test states only what it is about. */
final class WrittenFixture {

    private WrittenFixture() {
    }

    static MeasuredCode.Spread spread(final int median, final int upperQuartile, final int highest) {
        return new MeasuredCode.Spread(median, upperQuartile, highest);
    }

    static MeasuredCode side(final int commentLines, final int statements) {
        return new MeasuredCode(commentLines,
                new MeasuredCode.Metrics(3, 9, statements, 24, spread(2, 5, 20), spread(1, 3, 14),
                        spread(1, 2, 4), spread(1, 2, 3)));
    }

    /** A change adding these declarations to what the build publishes, and removing nothing. */
    static ChangedCode adding(final int types, final int methods, final int fields,
                                       final List<ChangedCode.NamedDeclaration> typesAdded) {
        return new ChangedCode(3, 1, new ChangedCode.Declarations(types, methods, fields),
                new ChangedCode.Declarations(0, 0, 0), 41, typesAdded, List.of(),
                List.of(new ChangedCode.KindFiles("production", 3)), side(40, 300), side(30, 240),
                List.of());
    }
}
