package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * One BIAN service-domain specification file, read as the key–value rows it is written in: tab-separated
 * cells, double-quoted where a cell holds a tab, a line break or a quote, with a byte-order mark in front.
 * A key stated twice keeps its last value, and a key never stated reads as empty.
 *
 * <p>A cell is quoted only where its first character is a quote, {@code ""} inside one is a literal quote,
 * and everything after the quoted part closes — one file writes a stray quote mid-sentence — is carried
 * literally to the end of the cell. That is the reading the artefacts themselves were written against, and
 * a stricter parser would turn the stray quote into a swallowed row.
 */
final class BianSpecification {

    private enum Reading { STARTING, RAW, QUOTED, TAIL }

    private static final char BOM = '﻿';
    private static final char QUOTE = '"';
    private static final char CELL = '\t';

    private final Map<String, String> stated;

    private BianSpecification(final Map<String, String> stated) {
        this.stated = Map.copyOf(stated);
    }

    static BianSpecification of(final byte[] bytes) {
        final String text = withoutByteOrderMark(new String(bytes, StandardCharsets.UTF_8));
        final Map<String, String> stated = new HashMap<>();
        final List<String> cells = new ArrayList<>();
        final StringBuilder cell = new StringBuilder();
        Reading reading = Reading.STARTING;
        int at = 0;
        while (at < text.length()) {
            final char letter = text.charAt(at);
            if (reading == Reading.QUOTED) {
                if (letter == QUOTE && at + 1 < text.length() && text.charAt(at + 1) == QUOTE) {
                    cell.append(QUOTE);
                    at++;
                } else if (letter == QUOTE) {
                    reading = Reading.TAIL;
                } else {
                    cell.append(letter);
                }
            } else if (letter == CELL) {
                cells.add(cell.toString());
                cell.setLength(0);
                reading = Reading.STARTING;
            } else if (letter == '\n' || letter == '\r') {
                endRow(cells, cell, reading, stated);
                reading = Reading.STARTING;
            } else if (reading == Reading.STARTING && letter == QUOTE) {
                reading = Reading.QUOTED;
            } else {
                cell.append(letter);
                reading = reading == Reading.STARTING ? Reading.RAW : reading;
            }
            at++;
        }
        endRow(cells, cell, reading, stated);
        return new BianSpecification(stated);
    }

    private static void endRow(final List<String> cells, final StringBuilder cell, final Reading reading,
                               final Map<String, String> stated) {
        if (reading != Reading.STARTING || cell.length() > 0) {
            cells.add(cell.toString());
            cell.setLength(0);
        }
        if (cells.size() >= 2) {
            stated.put(cells.get(0), cells.get(1));
        }
        cells.clear();
    }

    private static String withoutByteOrderMark(final String text) {
        return !text.isEmpty() && text.charAt(0) == BOM ? text.substring(1) : text;
    }

    /** What the specification states under this key, trimmed, or empty where it states nothing. */
    String stated(final String key) {
        return stated.getOrDefault(key, "").strip();
    }
}
