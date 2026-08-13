package org.fifties.housewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

import org.fifties.housewife.codesemantics.engine.theme.PermutationNull.Chance;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PermutationNullTest {

    private static final int DRAWS = 99;

    private final JensenShannon divergence = new JensenShannon();

    private static TopicDistribution of(final String topic) {
        return TopicDistribution.of(Map.of(topic, 1.0));
    }

    /** A pool of files two thirds about one subject and one third about another. */
    private static List<TopicDistribution> mixedPool() {
        return IntStream.range(0, 30)
                .mapToObj(file -> of(file % 3 == 0 ? "music" : "linguistics"))
                .toList();
    }

    private PermutationNull seeded(final long seed) {
        return new PermutationNull(divergence, DRAWS, new Random(seed));
    }

    @Test
    void findsNoExcessForAScopeThatIsJustASampleOfItsReference() {
        final List<TopicDistribution> pool = mixedPool();
        final TopicDistribution reference = TopicDistribution.meanOf(pool);
        final TopicDistribution sample = TopicDistribution.meanOf(pool.subList(0, 6));
        final double observed = divergence.divergence(sample, reference);

        final Chance chance = seeded(1L).of(observed, 6, pool, reference);

        assertThat(chance.atLeastAsExtreme())
                .as("a scope drawn from the reference must not look like a finding")
                .isPositive();
    }

    @Test
    void findsAnExcessForAScopeThatIsAboutSomethingElse() {
        final List<TopicDistribution> pool = mixedPool();
        final TopicDistribution reference = TopicDistribution.meanOf(pool);
        final TopicDistribution scope = TopicDistribution.meanOf(List.of(of("law"), of("law"), of("law")));

        final Chance chance = seeded(1L).of(divergence.divergence(scope, reference), 3, pool, reference);

        assertAll(
                () -> assertThat(chance.exceedsChance()).isTrue(),
                () -> assertThat(chance.excess()).isPositive(),
                () -> assertThat(chance.atLeastAsExtreme()).isZero(),
                () -> assertThat(chance.chanceRate()).isLessThan(0.02));
    }

    @Test
    void drawsTheSameFieldTwiceFromTheSameSeed() {
        final List<TopicDistribution> pool = mixedPool();
        final TopicDistribution reference = TopicDistribution.meanOf(pool);

        assertThat(seeded(7L).of(0.1, 5, pool, reference))
                .as("a null that moved between runs would make every excess unfalsifiable")
                .isEqualTo(seeded(7L).of(0.1, 5, pool, reference));
    }

    @Test
    void reportsHowManyDrawsItTookAndHowManyMatchedTheObservation() {
        final List<TopicDistribution> pool = mixedPool();
        final Chance chance = seeded(3L).of(0.0, 5, pool, TopicDistribution.meanOf(pool));

        assertAll(
                () -> assertThat(chance.resamples()).isEqualTo(DRAWS),
                () -> assertThat(chance.atLeastAsExtreme()).isEqualTo(DRAWS),
                () -> assertThat(chance.exceedsChance())
                        .as("an observation of nothing exceeds nothing")
                        .isFalse());
    }

    @Test
    void seedsItselfWithTheStatedNumberOfResamplesByDefault() {
        assertThat(PermutationNull.RESAMPLES).isEqualTo(999);
    }
}
