package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Which fork package the specification schedules last, read from each package's own
 * {@code FORK_CRITERIA} line. A fork stated as {@code Unscheduled} is in active development and is not a
 * statement of the deployed protocol, so it is passed over. Block-number forks precede timestamp forks,
 * which is the ordering the specification's own {@code fork_criteria} module implements.
 */
final class ExecutionSpecForks {

    private static final Pattern CRITERIA =
            Pattern.compile("FORK_CRITERIA: ForkCriteria = (ByBlockNumber|ByTimestamp)\\((\\d+)\\).*");

    private record Scheduled(String fork, int era, long moment) {
    }

    String latestScheduled(final Path forks) throws IOException {
        try (Stream<Path> packages = Files.list(forks)) {
            return packages.filter(Files::isDirectory)
                    .map(this::scheduledIn)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .max(Comparator.comparingInt(Scheduled::era).thenComparingLong(Scheduled::moment))
                    .map(Scheduled::fork)
                    .orElseThrow(() -> new IllegalArgumentException(
                            forks + " holds no fork package stating scheduled criteria"));
        }
    }

    private Optional<Scheduled> scheduledIn(final Path fork) {
        try {
            return Files.readAllLines(fork.resolve("__init__.py")).stream()
                    .map(CRITERIA::matcher)
                    .filter(Matcher::matches)
                    .findFirst()
                    .map(stated -> new Scheduled(fork.getFileName().toString(),
                            "ByBlockNumber".equals(stated.group(1)) ? 0 : 1,
                            Long.parseLong(stated.group(2))));
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
