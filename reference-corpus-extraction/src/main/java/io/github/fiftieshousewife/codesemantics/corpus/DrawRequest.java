package io.github.fiftieshousewife.codesemantics.corpus;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * What one draw was asked for: the frame, the ceiling on creation date, the seed, how many repositories, and
 * where the record goes.
 *
 * @param excluded   repositories a rank may land on and be refused, lower-cased
 * @param publishes  whether a repository must state a publication to be taken
 */
public record DrawRequest(String frame, String until, long seed, int count, Path out, boolean publishes,
                          Set<String> excluded) {

    private static final String PREFIX = "cs.draw.";

    public DrawRequest {
        excluded = Set.copyOf(excluded);
    }

    /** What the run stated, with anything missing named rather than defaulted. */
    public static DrawRequest fromProperties() {
        return new DrawRequest(
                required("frame"),
                required("until"),
                Long.parseLong(required("seed")),
                Integer.parseInt(required("count")),
                Path.of(required("out")),
                System.getProperty(PREFIX + "publishes") != null,
                named());
    }

    private static Set<String> named() {
        return Arrays.stream(System.getProperty(PREFIX + "exclude", "").split(",", -1))
                .map(String::strip)
                .filter(name -> !name.isEmpty())
                .map(name -> name.toLowerCase(Locale.ROOT))
                .collect(Collectors.toUnmodifiableSet());
    }

    /** The publication test where one was asked for. */
    public Optional<PublishedArtefact> publication() {
        return publishes ? Optional.of(new PublishedArtefact()) : Optional.empty();
    }

    private static String required(final String name) {
        final String stated = System.getProperty(PREFIX + name, "");
        if (stated.isBlank()) {
            throw new IllegalStateException("A draw needs -D" + PREFIX + name);
        }
        return stated;
    }
}
