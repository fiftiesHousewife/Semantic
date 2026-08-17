package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.ArrayList;
import java.util.List;

/**
 * Fixed-size runs of a value list, in order, for a query endpoint that bounds how many values one request
 * may carry. The last run holds whatever remains.
 */
final class ValueBatches {

    private final int size;

    ValueBatches(final int size) {
        this.size = size;
    }

    List<List<String>> of(final List<String> items) {
        final List<List<String>> batches = new ArrayList<>();
        for (int start = 0; start < items.size(); start += size) {
            batches.add(items.subList(start, Math.min(start + size, items.size())));
        }
        return batches;
    }
}
