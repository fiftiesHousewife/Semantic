package io.github.fiftieshousewife.codesemantics.corpus;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.fiftieshousewife.codesemantics.clones.HeadCommit;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * What a draw costs in requests, which is the whole of its wall clock — every one is paced against a rate
 * limit. Measured against a frame the shape of the real one rather than argued.
 */
class DrawCostTest {

    private static final String FRAME = "language:Java";
    private static final String UNTIL = "2026-08-20T23:59:59Z";
    private static final long SEED = 20260821L;
    private static final long HELD = 112183L;
    private static final int WANTED = 100;
    private static final HeadCommit PINS = origin -> "abc123";

    private static final Pattern RANGE = Pattern.compile("created:(\\S+)\\.\\.(\\S+)");
    private static final DateTimeFormatter STAMP =
            DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneOffset.UTC);
    private static final Instant FIRST = Instant.parse("2007-01-01T00:00:00Z");
    private static final Instant LAST = Instant.parse("2026-08-20T23:59:59Z");

    /**
     * A frame whose repositories accumulate exponentially with time, which is the shape GitHub's actually
     * has: a doubling every {@code DOUBLING_YEARS}, so the last few years hold most of the population and
     * the first few hold almost none. Halving a range by time does not halve it by count.
     */
    private static final class Skewed implements RepositorySearch {

        private static final double DOUBLING_YEARS = 3.0;
        private static final double SECONDS_A_YEAR = 365.25 * 24 * 60 * 60;

        private final List<String> asked = new ArrayList<>();

        /** The share of the whole created before this instant, integrating the doubling rate. */
        private static double before(final Instant at) {
            final double years = Duration.between(FIRST, at).toSeconds() / SECONDS_A_YEAR;
            final double whole = Duration.between(FIRST, LAST).toSeconds() / SECONDS_A_YEAR;
            return (Math.pow(2.0, years / DOUBLING_YEARS) - 1.0)
                    / (Math.pow(2.0, whole / DOUBLING_YEARS) - 1.0);
        }

        @Override
        public long count(final String query) {
            asked.add(query);
            final Matcher range = RANGE.matcher(query);
            if (!range.find()) {
                return HELD;
            }
            final Instant from = Instant.from(STAMP.parse(range.group(1)));
            final Instant to = Instant.from(STAMP.parse(range.group(2)));
            return Math.max(0L, Math.round(HELD * (before(to) - before(from))));
        }

        /** A full page, so that any offset within it resolves — a short page would reject the rank. */
        @Override
        public List<JsonNode> oldestFirst(final String query, final int perPage, final int page) {
            asked.add(query);
            final int taken = asked.size();
            return IntStream.range(0, perPage)
                    .mapToObj(at -> (JsonNode) new ObjectMapper().createObjectNode()
                            .put("full_name", "owner/at" + taken + "x" + at)
                            .put("html_url", "https://github.com/owner/at" + taken + "x" + at))
                    .toList();
        }

        int requests() {
            return asked.size();
        }
    }

    @Test
    void asksForFarFewerRequestsWhereACountIsRememberedThanWhereItIsNot() {
        final int plain = requestsFor(Remembering.NO);
        final int cached = requestsFor(Remembering.YES);

        System.out.printf(Locale.ROOT,
                "draw of %d over a skewed frame: %d requests plain (%.1f a rank), %d remembered "
                        + "(%.1f a rank), %.2fx fewer. At nine seconds a request that is %.1f hours "
                        + "plain and %.1f remembered.%n",
                WANTED, plain, plain / (double) WANTED, cached, cached / (double) WANTED,
                plain / (double) cached, plain * 9 / 3600.0, cached * 9 / 3600.0);
        assertThat(cached).isLessThan(plain);
    }

    private enum Remembering { YES, NO }

    private int requestsFor(final Remembering remembering) {
        final Skewed spread = new Skewed();
        final RepositorySearch search =
                remembering == Remembering.YES ? new RememberedCounts(spread) : spread;
        final SampledFrame frame = new SampledFrame(search, FRAME, UNTIL);
        final long total = frame.index();
        new CorpusDraw(frame, new MersenneTwister(SEED), Set.of(), Optional.empty(), PINS)
                .of(WANTED, total);
        return spread.requests();
    }
}
