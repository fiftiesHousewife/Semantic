package io.github.fiftieshousewife.codesemantics.corpus;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import com.fasterxml.jackson.databind.JsonNode;

import lombok.extern.slf4j.Slf4j;

/**
 * A stated GitHub query, with an exact index over it, resolving a rank to the repository holding it.
 *
 * <p>Ranks run oldest first. The frame is counted a year at a time, because a yearly count stays under the
 * million above which GitHub estimates; the years sum to a total no single query reports correctly. A rank
 * then picks its year and the year halves by creation time until what remains is under GitHub's page cap.
 */
@Slf4j
public final class SampledFrame {

    /** GitHub returns at most this many results for any one query, however many it counts. */
    private static final int PAGE_CAP = 1000;
    private static final int PER_PAGE = 100;
    private static final int FIRST_YEAR = 2007;
    private static final long ESTIMATED_ABOVE = 1_000_000L;

    private static final DateTimeFormatter STAMP =
            DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneOffset.UTC);

    /** One year of the frame, counted exactly. */
    public record Window(int year, String from, String to, long count) {
    }

    private final RepositorySearch search;
    private final String frame;
    private final String until;
    private final List<Window> windows = new ArrayList<>();

    public SampledFrame(final RepositorySearch search, final String frame, final String until) {
        this.search = search;
        this.frame = frame;
        this.until = until;
    }

    /** Counts every year of the frame and returns the total, which is what a rank is drawn below. */
    public long index() {
        final int last = Integer.parseInt(until.substring(0, 4));
        IntStream.rangeClosed(FIRST_YEAR, last)
                .mapToObj(year -> counted(year, last))
                .forEach(windows::add);
        return total();
    }

    public long total() {
        return windows.stream().mapToLong(Window::count).sum();
    }

    public List<Window> windows() {
        return List.copyOf(windows);
    }

    /** The repository at that rank of the frame, or nothing where GitHub will not page to it. */
    public Optional<JsonNode> at(final long rank) {
        long seen = 0;
        for (final Window window : windows) {
            if (rank < seen + window.count()) {
                return within(window.from(), window.to(), window.count(), rank - seen);
            }
            seen += window.count();
        }
        throw new IllegalArgumentException("Rank " + rank + " falls outside a frame of " + total());
    }

    private Optional<JsonNode> within(final String from, final String to, final long held, final long offset) {
        String low = from;
        String high = to;
        long remaining = held;
        long index = offset;
        while (remaining > PAGE_CAP && Duration.between(instant(low), instant(high)).toSeconds() > 1) {
            final String middle = midpoint(low, high);
            final String beforeMiddle = stamp(instant(middle).minusSeconds(1));
            final long left = counted(low, beforeMiddle);
            if (index < left) {
                high = beforeMiddle;
                remaining = left;
            } else {
                index -= left;
                low = middle;
                remaining -= left;
            }
        }
        final List<JsonNode> page = search.oldestFirst(
                query(low, high), PER_PAGE, (int) (index / PER_PAGE) + 1);
        final int within = (int) (index % PER_PAGE);
        return within < page.size() ? Optional.of(page.get(within)) : Optional.empty();
    }

    /** One year of the frame, refused where GitHub would estimate its size rather than count it. */
    private Window counted(final int year, final int last) {
        final String from = year + "-01-01T00:00:00Z";
        final String to = year == last ? until : year + "-12-31T23:59:59Z";
        final long count = counted(from, to);
        if (count >= ESTIMATED_ABOVE) {
            throw new IllegalStateException(year + " holds " + count
                    + ", which GitHub estimates rather than counts. Divide it further before trusting it.");
        }
        log.info("{}  {}", year, count);
        return new Window(year, from, to, count);
    }

    private long counted(final String from, final String to) {
        return search.count(query(from, to));
    }

    private String query(final String from, final String to) {
        return frame + " created:" + from + ".." + to;
    }

    private static String midpoint(final String low, final String high) {
        return stamp(Instant.ofEpochSecond(
                (instant(low).getEpochSecond() + instant(high).getEpochSecond()) / 2));
    }

    private static Instant instant(final String stamp) {
        return Instant.from(STAMP.parse(stamp));
    }

    private static String stamp(final Instant at) {
        return STAMP.format(at);
    }
}
