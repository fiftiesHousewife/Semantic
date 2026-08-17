package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

import io.github.fiftieshousewife.codesemantics.engine.theme.PermutationNull.Chance;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class PermutationNullTest {

    private static final int DRAWS = 99;

    private static final int SCOPES = 9;

    private final JensenShannon divergence = new JensenShannon();

    private static TopicDistribution of(final String topic) {
        return TopicDistribution.ofCitedMass(Map.of(topic, 1.0));
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

        final Chance chance = seeded(1L).of(observed, 6, SCOPES, pool, reference);

        assertThat(chance.atLeastAsExtreme())
                .as("a scope drawn from the reference must not look like a finding")
                .isPositive();
    }

    @Test
    void findsAnExcessForAScopeThatIsAboutSomethingElse() {
        final List<TopicDistribution> pool = mixedPool();
        final TopicDistribution reference = TopicDistribution.meanOf(pool);
        final TopicDistribution scope = TopicDistribution.meanOf(List.of(of("law"), of("law"), of("law")));

        final Chance chance = seeded(1L).of(divergence.divergence(scope, reference), 3, SCOPES, pool, reference);

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

        assertThat(seeded(7L).of(0.1, 5, SCOPES, pool, reference))
                .as("a null that moved between runs would make every excess unfalsifiable")
                .isEqualTo(seeded(7L).of(0.1, 5, SCOPES, pool, reference));
    }

    @Test
    void reportsHowManyDrawsItTookAndHowManyMatchedTheObservation() {
        final List<TopicDistribution> pool = mixedPool();
        final Chance chance = seeded(3L).of(0.0, 5, SCOPES, pool, TopicDistribution.meanOf(pool));

        assertAll(
                () -> assertThat(chance.resamples()).isEqualTo(DRAWS),
                () -> assertThat(chance.atLeastAsExtreme()).isEqualTo(DRAWS),
                () -> assertThat(chance.exceedsChance())
                        .as("an observation of nothing exceeds nothing")
                        .isFalse());
    }

    @Test
    void refusesAScopeThatClearsOnlyTheMiddleOfItsOwnDraws() {
        final List<TopicDistribution> pool = mixedPool();
        final TopicDistribution reference = TopicDistribution.meanOf(pool);
        final Chance median = seeded(1L).of(0.0, 6, SCOPES, pool, reference);

        final Chance chance = seeded(1L).of(median.median() + 1e-9, 6, SCOPES, pool, reference);

        assertAll(
                () -> assertThat(chance.excess())
                        .as("it beat the coin flip this class used to ask for")
                        .isPositive(),
                () -> assertThat(chance.exceedsChance())
                        .as("and every scope was tested, so one of them was always going to")
                        .isFalse());
    }

    @Test
    void asksMoreOfAScopeTheMoreScopesWereTestedBesideIt() {
        final List<TopicDistribution> pool = mixedPool();
        final TopicDistribution reference = TopicDistribution.meanOf(pool);

        assertThat(seeded(1L).of(0.0, 6, 20, pool, reference).chanceExpectedBest())
                .as("twenty scopes get twenty attempts at looking furthest")
                .isGreaterThan(seeded(1L).of(0.0, 6, 2, pool, reference).chanceExpectedBest());
    }

    @Test
    void seedsItselfWithTheStatedNumberOfResamplesByDefault() {
        assertThat(PermutationNull.RESAMPLES).isEqualTo(999);
    }
}
