package org.fifties.housewife.codesemantics.engine.export;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The file and line a reading first saw something at, as two fields rather than one string a consumer has to
 * take apart.
 *
 * <p>A site arrives from a tally as {@code path:line} and is never anything else, so a site that does not
 * read as one is a defect in whatever produced it and fails here rather than exporting a line of zero.
 */
public record SightingSite(String file, int line) {

    private static final Pattern SITE = Pattern.compile("^(?<path>.+):(?<line>\\d+)$");

    public static SightingSite of(final String site) {
        final Matcher matched = SITE.matcher(site);
        if (!matched.matches()) {
            throw new IllegalArgumentException("not a path:line site: " + site);
        }
        return new SightingSite(matched.group("path"), Integer.parseInt(matched.group("line")));
    }
}
