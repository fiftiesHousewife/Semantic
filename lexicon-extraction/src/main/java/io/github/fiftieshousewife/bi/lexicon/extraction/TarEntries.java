package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

/**
 * A reader over the ustar entries of a tar stream: each header names a file and states its size in octal,
 * and the content follows padded to 512-byte blocks. It reads the three fields this project's extractions
 * need — name, size, bytes — and nothing else of the format.
 */
final class TarEntries {

    private static final int BLOCK = 512;
    private static final int NAME_LENGTH = 100;
    private static final int SIZE_OFFSET = 124;
    private static final int SIZE_LENGTH = 12;

    private final InputStream source;

    TarEntries(final InputStream source) {
        this.source = source;
    }

    /** One entry of a tar stream. A directory entry has no content and zero size. */
    static final class Entry {

        private final String name;
        private final byte[] content;

        Entry(final String name, final byte[] content) {
            this.name = name;
            this.content = content;
        }

        String name() {
            return name;
        }

        byte[] content() {
            return content;
        }
    }

    /** The next file entry, skipping directories, or empty at the terminating zero blocks. */
    Optional<Entry> next() throws IOException {
        while (true) {
            final byte[] header = block();
            if (header == null || header[0] == 0) {
                return Optional.empty();
            }
            final String name = string(header, 0, NAME_LENGTH);
            final int size = Integer.parseInt(string(header, SIZE_OFFSET, SIZE_LENGTH).trim(), 8);
            final byte[] content = source.readNBytes(size);
            final int padding = size % BLOCK == 0 ? 0 : BLOCK - size % BLOCK;
            source.skipNBytes(padding);
            if (!name.endsWith("/") && size > 0) {
                return Optional.of(new Entry(name, content));
            }
        }
    }

    private byte[] block() throws IOException {
        final byte[] header = source.readNBytes(BLOCK);
        return header.length == BLOCK ? header : null;
    }

    private static String string(final byte[] header, final int offset, final int length) {
        int end = offset;
        while (end < offset + length && header[end] != 0) {
            end++;
        }
        return new String(header, offset, end - offset, StandardCharsets.US_ASCII);
    }
}
