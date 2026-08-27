package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

import org.w3c.dom.Element;

/**
 * Where Orchestra states each of its fields sits.
 *
 * <p>A {@code field} element carries no category attribute, so an extraction reading only that attribute
 * leaves every field the publisher states at the top of the tree. Orchestra states the placement through the
 * containers instead: a message, component or group carries a category and names the fields it holds as
 * {@code fieldRef}s, so a container naming a field is the publisher placing it.
 *
 * <p>A field several containers name is placed at the deepest concept all of them sit under — the category
 * where every container states that one, the section where they state several categories of one section, and
 * nothing where they agree nowhere. Picking one of several stated categories would be this library deciding
 * something its source did not.
 *
 * <p>A container stating no category places nothing, and does not remove what another container states.
 */
final class FixFieldPlacements {

    private static final String CATEGORY = "category";

    private static final String FIELD_REF = "fieldRef";

    private static final String ORCHESTRA = "http://fixprotocol.io/2020/orchestra/repository";

    private final Map<String, Set<String>> categoriesByField;

    private final Map<String, String> sectionByCategory;

    private FixFieldPlacements(final Map<String, Set<String>> categoriesByField,
                               final Map<String, String> sectionByCategory) {
        this.categoriesByField = Map.copyOf(categoriesByField);
        this.sectionByCategory = Map.copyOf(sectionByCategory);
    }

    /**
     * The placements the containers state.
     *
     * @param containers        every message, component and group, each carrying a category and naming the
     *                          fields it holds
     * @param sectionByCategory the section each category sits in, as the publisher states it
     */
    static FixFieldPlacements in(final List<Element> containers,
                                 final Map<String, String> sectionByCategory) {
        final Map<String, Set<String>> categoriesByField = new HashMap<>();
        containers.stream()
                .filter(container -> !container.getAttribute(CATEGORY).isEmpty())
                .forEach(container -> fieldsNamedIn(container).forEach(field ->
                        categoriesByField.computeIfAbsent(field, named -> new LinkedHashSet<>())
                                .add(container.getAttribute(CATEGORY))));
        return new FixFieldPlacements(categoriesByField, sectionByCategory);
    }

    /** The concept the publisher places this field under, or nothing where it places it nowhere. */
    String under(final String field) {
        return deepestShared(categoriesByField.getOrDefault(field, Set.of()).stream()
                .map(this::chainOf)
                .toList());
    }

    /** The section that placement sits in, which is the module a field carries. */
    String sectionOf(final String field) {
        return sectionByCategory.getOrDefault(under(field), "");
    }

    /** The ids a container names, at whatever depth — a message holds its own inside a structure. */
    private static List<String> fieldsNamedIn(final Element container) {
        return RdfXml.elements(container.getElementsByTagNameNS(ORCHESTRA, FIELD_REF))
                .map(reference -> reference.getAttribute("id"))
                .toList();
    }

    /** What the publisher states above a category, deepest last: its section where it names one. */
    private List<String> chainOf(final String category) {
        final String section = sectionByCategory.getOrDefault(category, "");
        return section.isEmpty() ? List.of(category) : List.of(section, category);
    }

    /** The last step every chain states in common, which is where they part ways. */
    private static String deepestShared(final List<List<String>> chains) {
        return chains.stream().findFirst()
                .map(first -> IntStream.range(0, first.size())
                        .takeWhile(step -> chains.stream().allMatch(chain -> agree(chain, step, first)))
                        .mapToObj(first::get)
                        .reduce((higher, deeper) -> deeper)
                        .orElse(""))
                .orElse("");
    }

    private static boolean agree(final List<String> chain, final int step, final List<String> first) {
        return chain.size() > step && chain.get(step).equals(first.get(step));
    }
}
