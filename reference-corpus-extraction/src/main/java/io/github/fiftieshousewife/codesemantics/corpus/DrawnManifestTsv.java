package io.github.fiftieshousewife.codesemantics.corpus;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Renders a draw record as the manifest TSV the clones are fetched from: the header of the manifest being
 * grown, copied whole, then one row per repository taken.
 *
 * <p>The header is carried rather than restated, for the reason the header itself gives — a restatement goes
 * stale against the file it describes and a copy cannot.
 *
 * <p>The clone directory name is derived from the repository's full name rather than recorded beside it. A
 * stored copy can disagree with what it was copied from; a derivation cannot.
 */
public final class DrawnManifestTsv {

    public static final String COLUMNS = "name\torigin\tsha\tlicence\trank\tcreated\tsizeKb";

    private static final String COLUMN = "\t";
    private static final String ROW = "\n";
    private static final String OWNER_SEPARATOR = "/";

    public String render(final List<String> header, final List<Map<String, Object>> taken) {
        if (taken.isEmpty()) {
            throw new IllegalStateException("The draw took no repository at all, and a manifest of none "
                    + "names nothing to clone. Check the frame the run stated.");
        }
        return Stream.concat(header.stream(), taken.stream().map(DrawnManifestTsv::row))
                .collect(Collectors.joining(ROW, "", ROW));
    }

    /** The directory a repository is cloned into: its own name, lower-cased, without its owner. */
    public static String nameOf(final String repository) {
        return repository.substring(repository.lastIndexOf(OWNER_SEPARATOR) + 1).toLowerCase(Locale.ROOT);
    }

    private static String row(final Map<String, Object> taken) {
        return String.join(COLUMN,
                nameOf(String.valueOf(taken.get("repository"))),
                String.valueOf(taken.get("origin")),
                String.valueOf(taken.get("sha")),
                String.valueOf(taken.get("licenceAtPin")),
                String.valueOf(taken.get("rank")),
                String.valueOf(taken.get("created")),
                String.valueOf(taken.get("sizeKb")));
    }
}
