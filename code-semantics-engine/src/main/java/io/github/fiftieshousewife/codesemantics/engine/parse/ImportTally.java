package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.EnumMap;
import java.util.Map;

/**
 * What the parse did with every import it met: how many named each origin, and how many of the ones this
 * repository chose were set aside because the file naming them is in a source set nothing is published from.
 *
 * <p>The second figure exists so that the narrowing is stated. An import a reading declines to read is a
 * decision about the corpus, and a corpus quietly made cleaner reports a better result than it earned.
 */
public final class ImportTally {

    private final Map<ImportOrigin, Integer> byOrigin = new EnumMap<>(ImportOrigin.class);

    private int toolchain;

    public void counted(final ImportOrigin origin) {
        byOrigin.merge(origin, 1, Integer::sum);
    }

    /** An artefact a test source set names — the toolchain the repository is checked with. */
    public void setAsideAsToolchain() {
        toolchain++;
    }

    public int from(final ImportOrigin origin) {
        return byOrigin.getOrDefault(origin, 0);
    }

    public int toolchain() {
        return toolchain;
    }

    /** What was read as this repository's own choice: its external imports, less the toolchain's. */
    public int read() {
        return from(ImportOrigin.EXTERNAL) - toolchain;
    }
}
