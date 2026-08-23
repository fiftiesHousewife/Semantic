package io.github.fiftieshousewife.codesemantics.corpus;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
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
 * limit.
 *
 * <p>The frame is the real one: the per-year counts GitHub reported for the published frame, so the
 * year-to-year skew that decides how deep a rank must bisect is measured rather than modelled. Within a
 * year repositories are spread evenly, which is a simplification; the year counts dominate the depth.
 */
class DrawCostTest {

    private static final String FRAME = "language:Java";
    private static final String UNTIL = "2026-08-20T23:59:59Z";
    private static final long SEED = 20260821L;
    private static final HeadCommit PINS = origin -> "abc123";
    private static final int COLD = 16;
    private static final int WHOLE = 175;

    /** What the published frame reported, year by year, on 2026-08-23. */
    private static final Map<Integer, Long> HELD_IN_YEAR = Map.ofEntries(
            Map.entry(2007, 0L), Map.entry(2008, 4L), Map.entry(2009, 61L), Map.entry(2010, 108L),
            Map.entry(2011, 221L), Map.entry(2012, 360L), Map.entry(2013, 640L), Map.entry(2014, 997L),
            Map.entry(2015, 1385L), Map.entry(2016, 1551L), Map.entry(2017, 1874L), Map.entry(2018, 2233L),
            Map.entry(2019, 2687L), Map.entry(2020, 3320L), Map.entry(2021, 3237L), Map.entry(2022, 3843L),
            Map.entry(2023, 5258L), Map.entry(2024, 9129L), Map.entry(2025, 36877L), Map.entry(2026, 33439L));

    private static final Pattern RANGE = Pattern.compile("created:(\\S+)\\.\\.(\\S+)");
    private static final DateTimeFormatter STAMP =
            DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneOffset.UTC);

    private static final class RealFrame implements RepositorySearch {

        private final List<String> asked = new ArrayList<>();

        private static double before(final Instant at) {
            return HELD_IN_YEAR.entrySet().stream()
                    .mapToDouble(year -> heldBefore(year.getKey(), year.getValue(), at))
                    .sum();
        }

        private static double heldBefore(final int year, final long held, final Instant at) {
            final Instant opens = Instant.parse(year + "-01-01T00:00:00Z");
            final Instant closes = Instant.parse((year + 1) + "-01-01T00:00:00Z");
            if (!at.isAfter(opens)) {
                return 0.0;
            }
            if (at.isAfter(closes)) {
                return held;
            }
            final double through = (double) Duration.between(opens, at).toSeconds();
            final double whole = (double) Duration.between(opens, closes).toSeconds();
            return held * through / whole;
        }

        @Override
        public long count(final String query) {
            asked.add(query);
            final Matcher range = RANGE.matcher(query);
            if (!range.find()) {
                return HELD_IN_YEAR.values().stream().mapToLong(Long::longValue).sum();
            }
            return Math.max(0L, Math.round(before(Instant.from(STAMP.parse(range.group(2))))
                    - before(Instant.from(STAMP.parse(range.group(1))))));
        }

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
    void costsFarLessARankOnceTheCountsAreWarmThanOverTheFirstFewRanks() {
        final RealFrame frame = new RealFrame();
        final SampledFrame indexed = indexing(frame);
        final int index = frame.requests();

        final int cold = drawn(indexed, COLD, frame) - index;
        final int whole = drawn(indexed, WHOLE, frame) - index;
        final double marginal = (whole - cold) / (double) (WHOLE - COLD);

        System.out.printf(Locale.ROOT,
                "index %d requests%n"
                        + "first %d ranks: %d requests, %.1f a rank%n"
                        + "%d ranks: %d requests, %.1f a rank; marginal over the last %d is %.1f a rank%n"
                        + "whole draw at 9s a request: %.1f hours. With a token at 3s: %.1f hours.%n",
                index, COLD, cold, cold / (double) COLD,
                WHOLE, whole, whole / (double) WHOLE, WHOLE - COLD, marginal,
                (index + whole) * 9 / 3600.0, (index + whole) * 3 / 3600.0);

        assertThat(marginal).isLessThan(cold / (double) COLD);
    }

    private SampledFrame indexing(final RealFrame frame) {
        final SampledFrame indexed = new SampledFrame(new RememberedCounts(frame), FRAME, UNTIL);
        indexed.index();
        return indexed;
    }

    private int drawn(final SampledFrame indexed, final int wanted, final RealFrame frame) {
        new CorpusDraw(indexed, new MersenneTwister(SEED), Set.of(), Optional.empty(), PINS)
                .of(wanted, indexed.total());
        return frame.requests();
    }
}
