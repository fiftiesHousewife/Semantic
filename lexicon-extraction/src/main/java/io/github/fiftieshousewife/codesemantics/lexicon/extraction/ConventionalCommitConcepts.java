package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Parses the Conventional Commits specification's own statement of its tokens: the two types and the
 * breaking-change footer its structural-elements list defines, and the further types the same list names
 * as recommended by {@code @commitlint/config-conventional}, whose definitions are the Angular
 * convention's own at the revision the specification links.
 *
 * <p>A named type the convention's Type section does not define keeps an empty definition — {@code chore}
 * is the live case — because a definition neither source states would be this project's own words shipped
 * as the standard's.
 */
public final class ConventionalCommitConcepts {

    private static final String TYPE = "type";

    private static final String FOOTER = "footer";

    private static final String SPECIFICATION = "specification";

    private static final String ANGULAR_CONVENTION = "angular-convention";

    private static final String BREAKING_CHANGE = "BREAKING CHANGE";

    /** One structural-elements item: {@code 1. } then the statement, continued on indented lines. */
    private static final Pattern ITEM = Pattern.compile("^1\\. (.*)$");

    private static final Pattern DEFINED_TYPE = Pattern.compile("^\\*\\*(fix|feat):\\*\\* (.*)$");

    private static final Pattern DEFINED_FOOTER =
            Pattern.compile("^\\*\\*" + BREAKING_CHANGE + ":\\*\\* (.*)$");

    private static final Pattern NAMED_TYPE = Pattern.compile("`([a-z]+):`");

    private static final Pattern LINK = Pattern.compile("\\[([^]]*)]\\([^)]*\\)");

    private static final Pattern EMPHASIS = Pattern.compile("[*_`]");

    /** The Angular convention's Type section: one bullet per type it defines. */
    private static final Pattern CONVENTION_TYPE = Pattern.compile("^\\* \\*\\*([a-z]+)\\*\\*: (.*)$");

    private static final String TYPE_SECTION = "### Type";

    private static final String SECTION = "### ";

    /** The tokens the two pinned statements define, in the shape every bundled vocabulary is normalised to. */
    public List<SkosConcept> in(final String specification, final String convention) {
        final List<SkosConcept> stated = new ArrayList<>();
        final Map<String, String> defined = definedTypes(convention);
        items(specification).forEach(item -> conceptsOf(item, defined, stated));
        if (stated.isEmpty()) {
            throw new IllegalArgumentException(
                    "The specification's structural-elements list defines no token this parser reads");
        }
        return List.copyOf(stated);
    }

    private static void conceptsOf(final String item, final Map<String, String> defined,
                                   final List<SkosConcept> stated) {
        final Matcher type = DEFINED_TYPE.matcher(item);
        if (type.matches()) {
            stated.add(concept(type.group(1), TYPE, SPECIFICATION, prose(type.group(2))));
            return;
        }
        final Matcher footer = DEFINED_FOOTER.matcher(item);
        if (footer.matches()) {
            stated.add(concept(BREAKING_CHANGE, FOOTER, SPECIFICATION, prose(footer.group(1))));
            return;
        }
        if (item.startsWith("_types_ other than")) {
            namedTypes(item).forEach(name ->
                    stated.add(concept(name, TYPE, ANGULAR_CONVENTION, defined.getOrDefault(name, ""))));
        }
    }

    /** The further types the item names, in its own order, less the two the specification defines itself. */
    private static List<String> namedTypes(final String item) {
        return NAMED_TYPE.matcher(item).results()
                .map(found -> found.group(1))
                .filter(name -> !"fix".equals(name) && !"feat".equals(name))
                .distinct()
                .toList();
    }

    /** The structural-elements items, each with its continuation lines joined by a space. */
    private static List<String> items(final String specification) {
        final List<String> items = new ArrayList<>();
        for (final String line : specification.split("\n", -1)) {
            final Matcher item = ITEM.matcher(line);
            if (item.matches()) {
                items.add(item.group(1));
            } else if (!items.isEmpty() && continuation(line)) {
                items.add(items.removeLast() + " " + line.strip());
            } else if (!items.isEmpty() && line.isBlank()) {
                break;
            }
        }
        return items;
    }

    /** A continuation belongs to the item above it; a blank line or a new block ends the list. */
    private static boolean continuation(final String line) {
        return !line.isBlank() && !line.startsWith("<") && !line.startsWith("#");
    }

    private static Map<String, String> definedTypes(final String convention) {
        final int start = convention.indexOf(TYPE_SECTION);
        if (start < 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "The convention states no %s section", TYPE_SECTION));
        }
        final String after = convention.substring(start + TYPE_SECTION.length());
        final int end = after.indexOf(SECTION);
        return after.substring(0, end < 0 ? after.length() : end).lines()
                .map(CONVENTION_TYPE::matcher)
                .filter(Matcher::matches)
                .collect(Collectors.toMap(found -> found.group(1), found -> found.group(2),
                        (first, second) -> first, LinkedHashMap::new));
    }

    /** The statement's own words with the markdown taken off: links keep their text, emphasis goes. */
    private static String prose(final String statement) {
        return EMPHASIS.matcher(LINK.matcher(statement).replaceAll("$1")).replaceAll("");
    }

    private static SkosConcept concept(final String name, final String kind, final String module,
                                       final String definition) {
        return new SkosConcept(name, name, "", "", kind, module, definition, "");
    }
}
