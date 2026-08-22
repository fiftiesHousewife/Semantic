package io.github.fiftieshousewife.codesemantics.corpus;

/**
 * MT19937, seeded and consumed exactly as CPython's {@code random} module does.
 *
 * <p><b>Why not {@link java.util.Random}.</b> The manifests in this module record the rank each drawn
 * repository came from and claim the seed reproduces them. That claim is against a particular generator:
 * the draws were made by CPython, whose {@code random.Random} is MT19937 seeded through
 * {@code init_by_array} and whose {@code randrange} rejects rather than takes a remainder. Java's own
 * generator is a different algorithm entirely, so a port using it would produce a different sample and
 * quietly falsify every rank already recorded. {@code reproducesTheRanksTheManifestsRecord} pins it.
 *
 * <p>Two details carry the compatibility and neither is optional. Seeding is {@code init_by_array} over the
 * seed's 32-bit words rather than {@code init_genrand} on the seed itself. And a bound that is not a power
 * of two is drawn by taking as many bits as the bound needs and discarding anything too large, because a
 * remainder would bias the low values and would not be CPython's stream.
 */
public final class MersenneTwister {

    private static final int SIZE = 624;
    private static final int MIDDLE = 397;
    private static final int SEEDING = 19650218;
    private static final long WORD = 0xFFFFFFFFL;
    private static final int UPPER = 0x80000000;
    private static final int LOWER = 0x7FFFFFFF;
    private static final int MATRIX = 0x9908B0DF;

    private final int[] state = new int[SIZE];
    private int at = SIZE + 1;

    public MersenneTwister(final long seed) {
        initialise(SEEDING);
        mix(words(seed));
    }

    /** The seed as the 32-bit words CPython hands to {@code init_by_array}. */
    private static int[] words(final long seed) {
        final long absolute = Math.abs(seed);
        if (absolute <= WORD) {
            return new int[] {(int) absolute};
        }
        return new int[] {(int) (absolute & WORD), (int) ((absolute >>> 32) & WORD)};
    }

    private void initialise(final int seed) {
        state[0] = seed;
        for (int i = 1; i < SIZE; i++) {
            state[i] = (int) ((1812433253L * (state[i - 1] ^ (state[i - 1] >>> 30)) + i) & WORD);
        }
        at = SIZE;
    }

    private void mix(final int[] key) {
        int i = 1;
        int j = 0;
        for (int k = Math.max(SIZE, key.length); k > 0; k--) {
            state[i] = (int) (((state[i] ^ ((state[i - 1] ^ (state[i - 1] >>> 30)) * 1664525L))
                    + key[j] + j) & WORD);
            i++;
            j++;
            if (i >= SIZE) {
                state[0] = state[SIZE - 1];
                i = 1;
            }
            if (j >= key.length) {
                j = 0;
            }
        }
        for (int k = SIZE - 1; k > 0; k--) {
            state[i] = (int) (((state[i] ^ ((state[i - 1] ^ (state[i - 1] >>> 30)) * 1566083941L)) - i) & WORD);
            i++;
            if (i >= SIZE) {
                state[0] = state[SIZE - 1];
                i = 1;
            }
        }
        state[0] = UPPER;
    }

    private void twist() {
        for (int i = 0; i < SIZE; i++) {
            final int joined = (state[i] & UPPER) | (state[(i + 1) % SIZE] & LOWER);
            int next = joined >>> 1;
            if ((joined & 1) != 0) {
                next ^= MATRIX;
            }
            state[i] = state[(i + MIDDLE) % SIZE] ^ next;
        }
        at = 0;
    }

    /** One tempered 32-bit word, as an unsigned value. */
    private long word() {
        if (at >= SIZE) {
            twist();
        }
        int drawn = state[at++];
        drawn ^= drawn >>> 11;
        drawn ^= (drawn << 7) & 0x9D2C5680;
        drawn ^= (drawn << 15) & 0xEFC60000;
        drawn ^= drawn >>> 18;
        return drawn & WORD;
    }

    /** The top {@code bits} of one word, which is CPython's {@code getrandbits} for anything up to 32. */
    long bits(final int bits) {
        if (bits == 0) {
            return 0;
        }
        return word() >>> (32 - bits);
    }

    /**
     * A uniform value below the bound, drawn as CPython's {@code randrange} draws it: enough bits for the
     * bound, and anything at or above it discarded rather than folded back by a remainder.
     */
    public long below(final long bound) {
        if (bound <= 0) {
            throw new IllegalArgumentException("A bound of " + bound + " leaves nothing to draw");
        }
        final int needed = Long.SIZE - Long.numberOfLeadingZeros(bound - 1);
        long drawn = bits(needed);
        while (drawn >= bound) {
            drawn = bits(needed);
        }
        return drawn;
    }
}
