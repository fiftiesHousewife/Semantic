package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * arXiv's subject taxonomy, read back out of the module arXiv's own software defines it in.
 *
 * <p>This is the precedent {@code sql-functions.tsv} states, applied a second time: a classification read
 * from the software that implements it is the publisher stating its own scheme, where the same list taken
 * off a rendered page would be an observation of a web site. The module is what arXiv classifies by, so the
 * identifiers, the names and the subject descriptions all come from the thing that uses them.
 *
 * <p>An entry runs from its constructor to wherever the next one begins, and only the fields named here are
 * read out of it, so the punctuation between entries is stepped over rather than parsed. A value is taken
 * in whatever quoting the module wrapped it in, because one description is single-quoted and the rest are
 * not.
 */
public class ArxivTaxonomy {

    private static final Pattern ENTRY = Pattern.compile("\\b(Group|Archive|Category)\\(");

    private static final Pattern FIELD = Pattern.compile("(\\w+)=(?:\"([^\"]*)\"|'([^']*)')");

    private static final String ID = "id";
    private static final String NAME = "full_name";
    private static final String ALIAS = "alt_name";
    private static final String IN_ARCHIVE = "in_archive";
    private static final String IN_GROUP = "in_group";
    private static final String DESCRIPTION = "description";

    private static final String INACTIVE = "is_active=False";
    private static final String TEST = "is_test=True";

    private static final String NOTHING = "";

    public List<ArxivEntry> in(final String module) {
        final List<MatchResult> entries = ENTRY.matcher(module).results().toList();
        if (entries.isEmpty()) {
            throw new IllegalArgumentException("The module states no Group, Archive or Category");
        }
        return IntStream.range(0, entries.size())
                .mapToObj(index -> entry(module, entries, index)).toList();
    }

    private static ArxivEntry entry(final String module, final List<MatchResult> entries, final int index) {
        final MatchResult start = entries.get(index);
        final String body = module.substring(start.start(),
                index + 1 < entries.size() ? entries.get(index + 1).start() : module.length());
        final Map<String, String> fields = fieldsIn(body);
        return new ArxivEntry(fields.getOrDefault(ID, NOTHING),
                start.group(1).toLowerCase(Locale.ROOT), fields.getOrDefault(NAME, NOTHING),
                fields.getOrDefault(ALIAS, NOTHING), broaderIn(fields),
                fields.getOrDefault(DESCRIPTION, NOTHING), !body.contains(INACTIVE), body.contains(TEST));
    }

    /** A category is stated inside an archive, an archive inside a group, and a group inside nothing. */
    private static String broaderIn(final Map<String, String> fields) {
        return fields.getOrDefault(IN_ARCHIVE, fields.getOrDefault(IN_GROUP, NOTHING));
    }

    private static Map<String, String> fieldsIn(final String body) {
        return FIELD.matcher(body).results().collect(Collectors.toMap(result -> result.group(1),
                result -> result.group(2) == null ? result.group(3) : result.group(2),
                (first, later) -> first));
    }
}
