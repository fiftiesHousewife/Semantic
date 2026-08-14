package org.fifties.housewife.codesemantics.engine.reading;

import java.nio.file.Path;

/**
 * The clone a diagnostic is pointed at: the one {@code -Dcs.clone.dir} names, or else the tree the test is
 * running inside.
 *
 * <p>It is one class rather than a method on each diagnostic because every diagnostic needs the same answer,
 * and because the property it reads is the only one that matters to any of them — until a reading has been run
 * against a repository it was not developed against, every figure it reports is an instrument reading itself.
 */
public final class CloneUnderReading {

    private static final String CLONE_DIRECTORY_PROPERTY = "cs.clone.dir";

    public Path root() {
        final String supplied = System.getProperty(CLONE_DIRECTORY_PROPERTY, "");
        return supplied.isBlank() ? new HostTree().root() : Path.of(supplied).toAbsolutePath().normalize();
    }
}
