package org.fifties.housewife.codesemantics.engine.parse;

import java.util.Set;

/**
 * Sorts an import into whose vocabulary it names, by asking two resources that state their own contents: the
 * platform, through the packages it exports, and this repository, through the packages it declares.
 *
 * <p>Prefixes are tested longest-first against both, so nothing here needs to know that a package is
 * lowercase and a type is capitalised. That is a naming convention, and a convention is exactly the kind of
 * unwritten rule this library refuses to encode — where a fact is available, the fact is used.
 *
 * <p>What survives is the interesting part. A file importing {@code net.sf.extjwnl.data.POS} and
 * {@code org.duckdb.DuckDBConnection} is telling you what it is for in a way its own identifiers may not;
 * a file importing {@code java.util.List} is telling you it is written in Java.
 */
public final class ImportOrigins {

    private static final char PACKAGE_SEPARATOR = '.';

    private final PlatformPackages platform;
    private final Set<String> ownPackages;

    public ImportOrigins(final PlatformPackages platform, final Set<String> ownPackages) {
        this.platform = platform;
        this.ownPackages = Set.copyOf(ownPackages);
    }

    public ImportOrigin of(final String importedName) {
        for (String prefix = importedName; !prefix.isEmpty(); prefix = enclosing(prefix)) {
            if (ownPackages.contains(prefix)) {
                return ImportOrigin.INTERNAL;
            }
            if (platform.exports(prefix)) {
                return ImportOrigin.PLATFORM;
            }
        }
        return ImportOrigin.EXTERNAL;
    }

    private static String enclosing(final String name) {
        final int lastSeparator = name.lastIndexOf(PACKAGE_SEPARATOR);
        return lastSeparator < 0 ? "" : name.substring(0, lastSeparator);
    }
}
