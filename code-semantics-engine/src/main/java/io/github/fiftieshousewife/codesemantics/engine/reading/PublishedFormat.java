package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.stream.Stream;

/**
 * What a written artefact is, and the folder a reading writes it into.
 *
 * <p>A reading writes JSON and nothing else: the export a consumer acts on, and the workings behind it. A
 * name whose suffix is not one this states is refused rather than written somewhere arbitrary.
 */
public enum PublishedFormat {

    /** The export a consumer acts on, and the evidence beneath it. */
    JSON("json", "json");

    private final String suffix;
    private final String folder;

    PublishedFormat(final String suffix, final String folder) {
        this.suffix = suffix;
        this.folder = folder;
    }

    /** The folder this format is written into, relative to the reading's own output folder. */
    public String folder() {
        return folder;
    }

    public static PublishedFormat of(final String name) {
        return Stream.of(values())
                .filter(format -> name.endsWith("." + format.suffix))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("no published format writes " + name));
    }
}
