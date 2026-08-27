package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * A repository's own words dealt across its own declared names again, each name keeping the number of words
 * it was written with.
 *
 * <p>This is the reference a phrase match is judged against, and it needs no published resource: the words a
 * repository writes and how many it puts in each name are both held fixed, and only which word landed beside
 * which is destroyed. A term found in a deal is a term the repository's own vocabulary produced with no
 * publisher's phrase behind it, which is the quantity a phrase match has to beat.
 *
 * <p>The pool is permuted in place and carried between deals. A permutation of a permutation is still one, so
 * each deal stays uniform.
 */
public final class ShuffledRuns {

    private final List<WrittenRun> names;

    private final String[] pool;

    private final int[] starts;

    private ShuffledRuns(final List<WrittenRun> names, final String[] pool, final int[] starts) {
        this.names = List.copyOf(names);
        this.pool = pool;
        this.starts = starts;
    }

    public static ShuffledRuns of(final List<WrittenRun> names) {
        final String[] pool = names.stream()
                .flatMap(name -> name.words().stream())
                .toArray(String[]::new);
        final int[] starts = new int[names.size()];
        IntStream.range(1, names.size())
                .forEach(name -> starts[name] = starts[name - 1] + names.get(name - 1).words().size());
        return new ShuffledRuns(names, pool, starts);
    }

    /** How many words the repository wrote into declared names, which is what each deal redistributes. */
    public int words() {
        return pool.length;
    }

    /** The same names at the same sites, holding the same words dealt out in a fresh order. */
    public List<WrittenRun> drawnWith(final Random draws) {
        permuted(draws);
        return IntStream.range(0, names.size())
                .mapToObj(this::dealt)
                .toList();
    }

    private WrittenRun dealt(final int name) {
        final WrittenRun written = names.get(name);
        return written.holding(
                List.of(Arrays.copyOfRange(pool, starts[name], starts[name] + written.words().size())));
    }

    /** A Fisher–Yates shuffle of the whole pool, which is what makes every deal an equally likely one. */
    private void permuted(final Random draws) {
        IntStream.range(0, Math.max(0, pool.length - 1))
                .forEach(at -> swap(at, at + draws.nextInt(pool.length - at)));
    }

    private void swap(final int one, final int other) {
        final String held = pool[one];
        pool[one] = pool[other];
        pool[other] = held;
    }
}
