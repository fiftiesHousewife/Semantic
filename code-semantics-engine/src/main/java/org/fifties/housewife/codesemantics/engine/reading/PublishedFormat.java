package org.fifties.housewife.codesemantics.engine.reading;

import java.util.stream.Stream;

/**
 * What a written artefact is, and the folder a reading writes it into. One folder per format, because the
 * four are read by four different things: a consumer parses the JSON, a person reads the markdown, a browser
 * opens the pages, and a markdown renderer shows the pictures.
 *
 * <p>A name whose suffix is none of these is refused rather than written somewhere arbitrary.
 */
public enum PublishedFormat {

    /** The export a consumer acts on. */
    JSON("json", "json"),

    /** The reports, which are what every page is rendered from. */
    MARKDOWN("md", "markdown"),

    /** The pages a browser opens. */
    HTML("html", "html"),

    /** The pictures, each carrying its own stylesheet so it renders wherever it is shown. */
    SVG("svg", "svg");

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
