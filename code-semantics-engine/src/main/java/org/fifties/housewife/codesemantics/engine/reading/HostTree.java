package org.fifties.housewife.codesemantics.engine.reading;

import java.nio.file.Files;
import java.nio.file.Path;

/**
 * The tree the reader itself lives in, found by walking up from the working directory for the settings file
 * that marks a Gradle project's root.
 *
 * <p>It answers two questions that look alike and are not. It is the clone a diagnostic reads when nothing
 * else is named — the self reading — and it is what tells a report folder that a reading is of this
 * repository rather than of somebody else's, which is the difference between publishing a figure and
 * overwriting one.
 */
public final class HostTree {

    private static final String SETTINGS_FILE = "settings.gradle.kts";

    public Path root() {
        Path candidate = Path.of("").toAbsolutePath();
        while (!Files.isRegularFile(candidate.resolve(SETTINGS_FILE))) {
            candidate = candidate.getParent();
            if (candidate == null) {
                throw new IllegalStateException("No " + SETTINGS_FILE + " above " + Path.of("").toAbsolutePath());
            }
        }
        return candidate;
    }
}
