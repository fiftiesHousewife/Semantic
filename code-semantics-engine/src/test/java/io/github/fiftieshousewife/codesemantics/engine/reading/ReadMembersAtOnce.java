package io.github.fiftieshousewife.codesemantics.engine.reading;

/**
 * How many evaluation-set members one JVM reads at a time.
 *
 * <p>The binding constraint is heap and not cores: a member's read holds its whole parse and every file's
 * distribution while the null resamples, and the build already states what one of them costs — the per-member
 * fork is given three gigabytes. So the count is this JVM's own maximum heap divided by that, which is a
 * figure the build states rather than one chosen here, and never fewer than one.
 */
public final class ReadMembersAtOnce {

    /** What the build gives a single member's read, which is the unit this divides by. */
    private static final long ONE_READS_HEAP = 3L * 1024 * 1024 * 1024;

    private final long heap;

    ReadMembersAtOnce(final long heap) {
        this.heap = heap;
    }

    public static ReadMembersAtOnce inThisJvm() {
        return new ReadMembersAtOnce(Runtime.getRuntime().maxMemory());
    }

    public int count() {
        return (int) Math.max(1L, heap / ONE_READS_HEAP);
    }
}
