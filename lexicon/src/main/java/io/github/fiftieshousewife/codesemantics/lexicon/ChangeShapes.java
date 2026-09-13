package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

/**
 * Which Conventional Commits type a measured change shape falls under, read from the bundled mapping.
 *
 * <p>The rules are the file's own order and the first whose shape a change has answers. A shape the file
 * states no type for is an abstention with a reason beside it, which is a row like any other: the reading
 * names nothing rather than guessing, and can say why.
 */
public final class ChangeShapes {

    private static final String RESOURCE = "change-shape-types.tsv";

    private static final ChangeShapes CLASSPATH_DEFAULTS = load();

    private final List<ChangeShape> shapes;

    private ChangeShapes(final List<ChangeShape> shapes) {
        this.shapes = List.copyOf(shapes);
    }

    public static ChangeShapes fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** Every shape the mapping states, in the order the rules are applied. */
    public List<ChangeShape> shapes() {
        return shapes;
    }

    /** The shape this token names, and nothing where the mapping states none. */
    public Optional<ChangeShape> named(final String shape) {
        return shapes.stream()
                .filter(stated -> stated.shape().equals(shape))
                .findFirst();
    }

    private static final String COLUMN = "\t";

    private static final int COLUMNS = 5;

    private static ChangeShapes load() {
        return new ChangeShapes(BundledLines.of(RESOURCE).stream()
                .map(ChangeShapes::shape)
                .toList());
    }

    /** A row of the wrong width is refused rather than padded: every column after a missing one would
     * otherwise be read as its neighbour. */
    private static ChangeShape shape(final String line) {
        final String[] fields = line.split(COLUMN, -1);
        if (fields.length != COLUMNS) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "A row of %s states %s columns where the shape has %s: %s",
                    RESOURCE, fields.length, COLUMNS, line));
        }
        return new ChangeShape(fields[0], fields[1], fields[2], fields[3], fields[4]);
    }
}
