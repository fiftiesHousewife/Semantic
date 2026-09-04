package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * The named things of a FIX Orchestra repository file, one concept each: sections, the categories each
 * section holds, the messages, components and repeating groups each category holds, and the fields, placed
 * by {@link FixFieldPlacements} from the containers that name them. {@code altLabel} is the publisher's own
 * abbreviated name where one is stated, and {@code module} is the section a concept's category sits in.
 *
 * <p>Datatypes and code sets are not read, and said outright: a datatype is a value format and a code set
 * an enumeration of values, and neither is a subject a declared name can be about.
 */
public final class FixConcepts {

    private static final String ORCHESTRA = "http://fixprotocol.io/2020/orchestra/repository";
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");

    /** The kinds read, each from its plural container, in the publisher's own order. */
    private enum Kind {
        SECTION("sections", "section"),
        CATEGORY("categories", "category"),
        MESSAGE("messages", "message"),
        COMPONENT("components", "component"),
        GROUP("groups", "group"),
        FIELD("fields", "field");

        private final String container;
        private final String element;

        Kind(final String container, final String element) {
            this.container = container;
            this.element = element;
        }
    }

    public List<SkosConcept> in(final byte[] orchestra) {
        final Document parsed = RdfXml.parsed(orchestra);
        final Map<String, String> sectionByCategory = sectionByCategory(parsed);
        final FixFieldPlacements fields = FixFieldPlacements.in(containers(parsed), sectionByCategory);
        return Stream.of(Kind.values())
                .flatMap(kind -> stated(parsed, kind)
                        .map(element -> conceptOf(element, kind, sectionByCategory, fields)))
                .toList();
    }

    /** The kinds that carry a category and name the fields they hold, which is what places a field. */
    private static List<Element> containers(final Document parsed) {
        return Stream.of(Kind.MESSAGE, Kind.COMPONENT, Kind.GROUP)
                .flatMap(kind -> stated(parsed, kind))
                .toList();
    }

    private static Stream<Element> stated(final Document parsed, final Kind kind) {
        return RdfXml.elements(parsed.getDocumentElement().getChildNodes())
                .filter(element -> kind.container.equals(element.getLocalName()))
                .flatMap(container -> RdfXml.elements(container.getChildNodes()))
                .filter(element -> kind.element.equals(element.getLocalName()));
    }

    private static Map<String, String> sectionByCategory(final Document parsed) {
        final Map<String, String> sections = new HashMap<>();
        stated(parsed, Kind.CATEGORY).forEach(category ->
                sections.put(category.getAttribute("name"), category.getAttribute("section")));
        return sections;
    }

    private static SkosConcept conceptOf(final Element element, final Kind kind,
                                         final Map<String, String> sectionByCategory,
                                         final FixFieldPlacements fields) {
        final String name = element.getAttribute("name");
        return new SkosConcept(ORCHESTRA + "#" + kind.element + "/" + name, name,
                abbreviatedName(element), broaderOf(element, kind, fields), kind.element,
                moduleOf(element, kind, sectionByCategory, fields), definitionOf(element), "");
    }

    /** The publisher's abbreviated name, where it states one that says something the name does not. */
    private static String abbreviatedName(final Element element) {
        return Optional.of(element.getAttribute("abbrName"))
                .filter(abbreviated -> !abbreviated.equals(element.getAttribute("name")))
                .orElse("");
    }

    /**
     * A category sits in its section, a field where the containers naming it place it, and a message,
     * component or group in the category it states.
     */
    private static String broaderOf(final Element element, final Kind kind,
                                    final FixFieldPlacements fields) {
        if (kind == Kind.CATEGORY) {
            return element.getAttribute("section");
        }
        if (kind == Kind.FIELD) {
            return fields.under(element.getAttribute("id"));
        }
        return element.getAttribute("category");
    }

    /** The section the concept's category sits in, a field's being the category that placed it. */
    private static String moduleOf(final Element element, final Kind kind,
                                   final Map<String, String> sectionByCategory,
                                   final FixFieldPlacements fields) {
        if (kind == Kind.FIELD) {
            return fields.sectionOf(element.getAttribute("id"));
        }
        return sectionByCategory.getOrDefault(element.getAttribute("category"), "");
    }

    /** The annotation's documentations with their line breaks collapsed, joined in the publisher's order. */
    private static String definitionOf(final Element element) {
        return RdfXml.elements(element.getChildNodes())
                .filter(child -> "annotation".equals(child.getLocalName()))
                .flatMap(annotation -> RdfXml.elements(annotation.getChildNodes()))
                .filter(child -> "documentation".equals(child.getLocalName()))
                .map(Element::getTextContent)
                .map(text -> WHITESPACE.matcher(text.strip()).replaceAll(" "))
                .filter(text -> !text.isBlank())
                .collect(Collectors.joining(SkosConcept.STATEMENTS));
    }
}
