package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

import io.github.fiftieshousewife.codesemantics.engine.reading.SourceKind;
import io.github.fiftieshousewife.codesemantics.lexicon.ChangeShape;
import io.github.fiftieshousewife.codesemantics.lexicon.ChangeShapes;

/**
 * The Conventional Commits type a change's measured shape falls under, read from the bundled mapping.
 *
 * <p>This class holds the measurements and nothing else. Which shape falls under which of the standard's
 * words, and which shapes fall under none, is stated by {@code change-shape-types.tsv} in the order its
 * rules apply — so widening the mapping is a change to a resource a reader can check against the quoted
 * definitions, never a change to a predicate buried here.
 *
 * <p>A shape the mapping states no type for yields nothing, and the row says why.
 */
final class InferredChangeKind {

    private static final List<String> DOCUMENTATION = List.of(SourceKind.DOCUMENTATION.published());

    private static final List<String> CHECKING =
            List.of(SourceKind.TESTS.published(), SourceKind.FIXTURES.published());

    private static final List<String> BUILD = List.of(SourceKind.BUILD.published());

    /** One measurement per shape the mapping names, keyed on the token the mapping names it by. */
    private static final Map<String, Predicate<ChangedCode>> MEASUREMENTS = Map.of(
            "documentation-only", written -> written.everyFileAmong(DOCUMENTATION),
            "checks-only", written -> written.everyFileAmong(CHECKING),
            "build-only", written -> written.everyFileAmong(BUILD),
            "adds-declarations", written -> added(written) > 0 && removed(written) == 0,
            "removes-declarations", written -> removed(written) > 0 && added(written) == 0,
            "adds-and-removes-declarations", written -> added(written) > 0 && removed(written) > 0,
            "changes-bodies", written -> added(written) == 0 && removed(written) == 0);

    private final ChangeShapes shapes = ChangeShapes.fromClasspath();

    /** The first shape the change has, where the mapping states a type for it. */
    Optional<ExportedWork.Inferred> of(final ChangedCode written) {
        return shapes.shapes().stream()
                .filter(shape -> measures(shape).test(written))
                .findFirst()
                .filter(ChangeShape::isNamed)
                .map(shape -> new ExportedWork.Inferred(shape.type(), shape.definition(),
                        shape.measurement()));
    }

    private static Predicate<ChangedCode> measures(final ChangeShape shape) {
        final Predicate<ChangedCode> measurement = MEASUREMENTS.get(shape.shape());
        if (measurement == null) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "change-shape-types.tsv states the shape %s, which nothing here measures",
                    shape.shape()));
        }
        return measurement;
    }

    private static int added(final ChangedCode written) {
        return written.added().total();
    }

    private static int removed(final ChangedCode written) {
        return written.removed().total();
    }
}
