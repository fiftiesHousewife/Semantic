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

    /** A frame spread evenly over its years, so a range holds a share of the whole proportional to its span. */
    private static final class EvenlySpread implements RepositorySearch {

        private final List<String> asked = new ArrayList<>();

        @Override
        public long count(final String query) {
            asked.add(query);
            final Matcher range = RANGE.matcher(query);
            if (!range.find()) {
                return HELD;
            }
            final double whole = (double) Duration.between(FIRST, LAST).toSeconds();
            final Instant from = Instant.from(STAMP.parse(range.group(1)));
            final Instant to = Instant.from(STAMP.parse(range.group(2)));
            final double span = Math.max(0.0, (double) Duration.between(from, to).toSeconds());
            return Math.round(HELD * span / whole);
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

        System.out.printf(Locale.ROOT, "draw of %d: %d requests plain, %d remembered, %.1fx fewer%n",
                WANTED, plain, cached, plain / (double) cached);
        assertThat(cached).isLessThan(plain);
    }

    private enum Remembering { YES, NO }

    private int requestsFor(final Remembering remembering) {
        final EvenlySpread spread = new EvenlySpread();
        final RepositorySearch search =
                remembering == Remembering.YES ? new RememberedCounts(spread) : spread;
        final SampledFrame frame = new SampledFrame(search, FRAME, UNTIL);
        final long total = frame.index();
        new CorpusDraw(frame, new MersenneTwister(SEED), Set.of(), Optional.empty(), PINS)
                .of(WANTED, total);
        return spread.requests();
    }
}
