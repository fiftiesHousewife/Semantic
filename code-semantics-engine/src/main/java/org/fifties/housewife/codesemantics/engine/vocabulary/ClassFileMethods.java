package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * The names of the methods a class file declares in its API, read from the bytes.
 *
 * <p>Nothing is loaded, linked, verified or initialised: the names are in the constant pool and the
 * {@code method_info} table points at them, so a stream of bytes answers the question that reflecting over
 * every exported class was too slow to answer. The whole platform reads in a fraction of a second this way.
 *
 * <p>Only what a caller of the class could write is kept — a public or protected method. A private method's
 * name is not vocabulary a programmer ever meets, which is the same rule {@link PlatformNames} applies one
 * level up when it keeps only the packages a module exports.
 */
final class ClassFileMethods {

    /** {@code ACC_PUBLIC} and {@code ACC_PROTECTED}, JVMS §4.6 table 4.6-A. */
    private static final int CALLABLE_BY_ANYBODY = 0x0001 | 0x0004;

    private static final int MEMBER_HEADER_BYTES = 6;

    private static final int FIRST_POOL_PLACE = 1;

    List<String> declaredBy(final InputStream source) throws IOException {
        final DataInputStream bytes = new DataInputStream(source);
        bytes.skipNBytes(Integer.BYTES + Short.BYTES + Short.BYTES);
        final String[] pool = pool(bytes);
        bytes.skipNBytes(Short.BYTES + Short.BYTES + Short.BYTES);
        bytes.skipNBytes((long) bytes.readUnsignedShort() * Short.BYTES);
        skipMembers(bytes);
        return methods(bytes, pool);
    }

    /**
     * The pool's text by the place it sits in, which is what a name index means. Places past the first are
     * left empty where the entry carries no text, and the two eight-byte constants leave the place after them
     * empty as the format requires.
     */
    private String[] pool(final DataInputStream bytes) throws IOException {
        final int places = bytes.readUnsignedShort();
        final String[] pool = new String[places];
        int place = FIRST_POOL_PLACE;
        while (place < places) {
            final ConstantPoolEntry entry = ConstantPoolEntry.withTag(bytes.readUnsignedByte());
            pool[place] = entry.read(bytes);
            place += entry.places();
        }
        return pool;
    }

    private List<String> methods(final DataInputStream bytes, final String[] pool) throws IOException {
        final int declared = bytes.readUnsignedShort();
        final List<String> names = new ArrayList<>(declared);
        for (int method = 0; method < declared; method++) {
            final int access = bytes.readUnsignedShort();
            final String name = pool[bytes.readUnsignedShort()];
            bytes.skipNBytes(Short.BYTES);
            skipAttributes(bytes);
            if ((access & CALLABLE_BY_ANYBODY) != 0) {
                names.add(name);
            }
        }
        return names;
    }

    /** The fields, which sit between the interfaces and the methods and are stepped over to reach them. */
    private void skipMembers(final DataInputStream bytes) throws IOException {
        final int declared = bytes.readUnsignedShort();
        for (int member = 0; member < declared; member++) {
            bytes.skipNBytes(MEMBER_HEADER_BYTES);
            skipAttributes(bytes);
        }
    }

    private void skipAttributes(final DataInputStream bytes) throws IOException {
        final int attributes = bytes.readUnsignedShort();
        for (int attribute = 0; attribute < attributes; attribute++) {
            bytes.skipNBytes(Short.BYTES);
            bytes.skipNBytes(Integer.toUnsignedLong(bytes.readInt()));
        }
    }
}
