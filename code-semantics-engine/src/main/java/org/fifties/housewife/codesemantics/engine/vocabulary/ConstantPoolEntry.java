package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * One entry of a class file's constant pool: the tag that says which it is, how much of the pool it occupies,
 * and the text it carries where it carries any.
 *
 * <p>The pool has to be walked exactly, entry by entry, even though only its text is wanted: a method's name
 * sits past the pool and every kind of entry is a different width, so one miscounted entry loses the file.
 * The widths are stated by the class file format itself — JVMS §4.4, table 4.4-A — and are read from a
 * stream that is never loaded, linked, verified or initialised.
 *
 * <p>An entry carrying no text reads as empty, which no name ever is: a name index points at a
 * {@link #UTF8} entry by the format's own constraint.
 */
enum ConstantPoolEntry {

    /** The one entry that carries text, and the only one whose width the stream itself states. */
    UTF8(1, 1, 0) {
        @Override
        String read(final DataInputStream bytes) throws IOException {
            return bytes.readUTF();
        }
    },
    INTEGER(3, 1, 4),
    FLOAT(4, 1, 4),
    /** A long fills two pool places, which is the format's own oddity and the reason for {@link #places}. */
    LONG(5, 2, 8),
    DOUBLE(6, 2, 8),
    CLASS(7, 1, 2),
    STRING(8, 1, 2),
    FIELD_REFERENCE(9, 1, 4),
    METHOD_REFERENCE(10, 1, 4),
    INTERFACE_METHOD_REFERENCE(11, 1, 4),
    NAME_AND_TYPE(12, 1, 4),
    METHOD_HANDLE(15, 1, 3),
    METHOD_TYPE(16, 1, 2),
    DYNAMIC(17, 1, 4),
    INVOKE_DYNAMIC(18, 1, 4),
    MODULE(19, 1, 2),
    PACKAGE(20, 1, 2);

    private static final String NO_TEXT = "";

    private static final Map<Integer, ConstantPoolEntry> BY_TAG = Arrays.stream(values())
            .collect(Collectors.toUnmodifiableMap(entry -> entry.tag, entry -> entry));

    private final int tag;
    private final int places;
    private final int width;

    ConstantPoolEntry(final int tag, final int places, final int width) {
        this.tag = tag;
        this.places = places;
        this.width = width;
    }

    static ConstantPoolEntry withTag(final int tag) {
        return Optional.ofNullable(BY_TAG.get(tag))
                .orElseThrow(() -> new IllegalArgumentException("No constant pool entry carries the tag " + tag));
    }

    /** How many places of the pool the entry fills, which is two for the two eight-byte constants. */
    int places() {
        return places;
    }

    /** The text the entry carries, having stepped over it either way. */
    String read(final DataInputStream bytes) throws IOException {
        bytes.skipNBytes(width);
        return NO_TEXT;
    }
}
