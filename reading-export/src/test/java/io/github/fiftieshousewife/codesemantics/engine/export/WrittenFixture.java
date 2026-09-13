package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;

/** A declaration diff of the shape the export publishes, so one test states only what it is about. */
final class WrittenFixture {

    private WrittenFixture() {
    }

    static MeasuredCode side(final int commentLines, final int statements) {
        return new MeasuredCode(commentLines,
                new MeasuredCode.Metrics(3, 9, statements, 24, 20, 14, 4, 2, 3));
    }

    /** A change adding these declarations to what the build publishes, and removing nothing. */
    static ExportedWork.Written adding(final int types, final int methods, final int fields,
                                       final List<ExportedWork.NamedDeclaration> typesAdded) {
        return new ExportedWork.Written(3, 1, new ExportedWork.Declarations(types, methods, fields),
                new ExportedWork.Declarations(0, 0, 0), 41, typesAdded, List.of(),
                List.of(new ExportedWork.KindFiles("production", 3)), side(40, 300), side(30, 240),
                List.of());
    }
}
