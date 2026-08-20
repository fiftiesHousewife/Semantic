package io.github.fiftieshousewife.bi.lexicon;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * How much of the literature OpenAlex places under each of its topics.
 *
 * <p>{@link #share} is what a reading weighs a topic by, and its denominator is the sum of every topic's own
 * count. That sum exceeds the number of works OpenAlex holds, because the publisher places a work under more
 * than one topic — so the share is of topic assignments rather than of works, and it is bounded at 1 by the
 * sum it is taken over rather than by anything chosen here.
 *
 * <p>A topic the file does not count fails by name rather than reading as zero. A count of zero is a topic
 * with no literature under it, which is a different statement from a topic the resource never mentions.
 */
public final class OpenAlexTopicSizes {

    /** One topic's two counts, as the publisher states them. */
    public record Size(long worksCount, long citedByCount) {
    }

    private static final String RESOURCE = "openalex-topic-sizes.tsv";

    private static final String COLUMN = "\t";

    private static final int COLUMNS = 3;

    private final Map<String, Size> byConcept;

    private final double counted;

    private final Map<String, Integer> rankByConcept;

    private OpenAlexTopicSizes(final Map<String, Size> byConcept) {
        this.byConcept = Map.copyOf(byConcept);
        this.counted = byConcept.values().stream().mapToLong(Size::worksCount).sum();
        this.rankByConcept = ranked(byConcept);
    }

    /** Largest first, ties broken by concept, so the order does not move between runs. */
    private static Map<String, Integer> ranked(final Map<String, Size> byConcept) {
        final java.util.List<String> descending = byConcept.keySet().stream()
                .sorted(java.util.Comparator
                        .comparingLong((String concept) -> byConcept.get(concept).worksCount()).reversed()
                        .thenComparing(java.util.function.Function.identity()))
                .toList();
        return java.util.stream.IntStream.range(0, descending.size()).boxed()
                .collect(java.util.stream.Collectors.toUnmodifiableMap(descending::get, at -> at + 1));
    }

    public static OpenAlexTopicSizes fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    public Size of(final String concept) {
        return Objects.requireNonNull(byConcept.get(concept),
                () -> "The sizes state no count for " + concept);
    }

    /** The share of every topic assignment this topic holds, in {@code [0, 1]}. */
    public double share(final String concept) {
        return of(concept).worksCount() / counted;
    }

    /** The topics counted, which is what a check against the taxonomy beside this one compares. */
    public Set<String> concepts() {
        return byConcept.keySet();
    }

    /**
     * Where a topic stands when the topics are ordered by the works counted under them, the largest first.
     *
     * <p>A rank rather than a count, because a reading weighing how much a topic narrows is taken over a
     * rank in the same way {@code WordSpecificity} takes one over a frequency list. Ties are broken by
     * concept so the order is the same on every run.
     */
    public int rankOf(final String concept) {
        return Objects.requireNonNull(rankByConcept.get(concept),
                () -> "The sizes state no count for " + concept);
    }

    /** How many topics are counted, which is what bounds a reading taken over the rank. */
    public int size() {
        return byConcept.size();
    }

    private static OpenAlexTopicSizes load() {
        final Map<String, Size> sizes = new LinkedHashMap<>();
        BundledLines.of(RESOURCE).forEach(line -> {
            final String[] fields = line.split(COLUMN, -1);
            if (fields.length != COLUMNS) {
                throw new IllegalStateException("A row of " + RESOURCE + " states " + fields.length
                        + " columns where the shape has " + COLUMNS + ": " + line);
            }
            sizes.put(fields[0], new Size(Long.parseLong(fields[1]), Long.parseLong(fields[2])));
        });
        return new OpenAlexTopicSizes(sizes);
    }

    private static final OpenAlexTopicSizes CLASSPATH_DEFAULTS = load();
}
