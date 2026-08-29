package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.w3c.dom.Element;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * Where Orchestra states each of its fields sits.
 *
 * <p>A {@code field} element carries no category attribute, so an extraction reading only that attribute
 * leaves every field the publisher states at the top of the tree. Orchestra states the placement through the
 * containers instead: a message, component or group carries a category and names the fields it holds as
 * {@code fieldRef}s, so a container naming a field is the publisher placing it.
 *
 * <p><b>A field several containers name is placed under every category they name.</b> {@code SkosConcept}
 * carries a repeated parent the way SKOS does, joined with the separator it states, so stating all of them
 * needs no choice made here — {@code Text} sits under 27 categories because Orchestra puts it in 27, and
 * {@code RawData} under three because Orchestra puts it in three, in EventCommunication, Session and
 * UserManagement.
 *
 * <p>The rule this replaces reported the deepest concept every container shared, which was the section
 * where the categories agreed on one and <em>nothing</em> where they did not. 290 of the 6,203 fields were
 * written as placed nowhere on that rule, including {@code Text}, {@code TransactTime}, {@code Currency}
 * and {@code Side}. A field the publisher puts in 27 places is not a field the publisher places nowhere,
 * and the count of fields Orchestra genuinely names in no container carrying a category is 535.
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

    /** Every category the publisher's containers name this field in, or nothing where none does. */
    String under(final String field) {
        return String.join(SkosConcept.STATEMENTS, categoriesByField.getOrDefault(field, Set.of()));
    }

    /**
     * The section those categories sit in, which is the module a field carries. A field whose categories
     * span several sections carries none: the module is one column and the publisher states more than one
     * answer, so reporting one of them would be this library choosing.
     */
    String sectionOf(final String field) {
        final Set<String> sections = categoriesByField.getOrDefault(field, Set.of()).stream()
                .map(category -> sectionByCategory.getOrDefault(category, ""))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        return sections.size() == 1 ? sections.iterator().next() : "";
    }

    /** The ids a container names, at whatever depth — a message holds its own inside a structure. */
    private static List<String> fieldsNamedIn(final Element container) {
        return RdfXml.elements(container.getElementsByTagNameNS(ORCHESTRA, FIELD_REF))
                .map(reference -> reference.getAttribute("id"))
                .toList();
    }



}
