package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The complex types of a set of FpML schema files, one concept each: the type's own name is the term a
 * trading system writes, its {@code xsd:extension} base is {@code broader}, its {@code xsd:documentation}
 * is the definition, and the product area in the schema file's own name is the module.
 *
 * <p>A base the schema writes with a namespace prefix belongs to XML Schema rather than to FpML, and a
 * base naming a type this set carries no complex type for — {@code Scheme} and {@code NonEmptyScheme} are
 * simple types — is dropped with it, for the reason the FIBO extraction states: a roll-up must not climb
 * to a concept nothing here can answer for. Simple types and global elements are not read — a simple type
 * is a format constraint, not a subject, and every global element restates a complex type under a
 * lowercased name.
 */
public final class FpmlConcepts {

    private static final String XSD = "http://www.w3.org/2001/XMLSchema";
    private static final String COMPLEX_TYPE = "complexType";
    private static final Pattern PRODUCT_AREA = Pattern.compile("fpml-(.+)-\\d+-\\d+\\.xsd");
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");

    public List<SkosConcept> in(final List<ContentDigest.Member> schemas) {
        final List<SkosConcept> read = schemas.stream().flatMap(FpmlConcepts::conceptsIn).toList();
        final Set<String> carried = read.stream().map(SkosConcept::prefLabel)
                .collect(Collectors.toSet());
        return read.stream().map(concept -> withACarriedBroader(concept, carried)).toList();
    }

    /** The concept as stated, or with {@code broader} dropped where the set carries no such complex type. */
    private static SkosConcept withACarriedBroader(final SkosConcept concept, final Set<String> carried) {
        if (carried.contains(concept.broader())) {
            return concept;
        }
        return new SkosConcept(concept.concept(), concept.prefLabel(), concept.altLabel(), "",
                concept.kind(), concept.module(), concept.definition(), concept.note());
    }

    private static Stream<SkosConcept> conceptsIn(final ContentDigest.Member schema) {
        final Document parsed = RdfXml.parsed(schema.bytes());
        final String namespace = parsed.getDocumentElement().getAttribute("targetNamespace");
        final String module = productAreaOf(schema.name());
        return RdfXml.elements(parsed.getDocumentElement().getChildNodes())
                .filter(element -> XSD.equals(element.getNamespaceURI()))
                .filter(element -> COMPLEX_TYPE.equals(element.getLocalName()))
                .filter(element -> !element.getAttribute("name").isBlank())
                .map(element -> conceptOf(element, namespace, module));
    }

    private static SkosConcept conceptOf(final Element type, final String namespace,
                                         final String module) {
        final String name = type.getAttribute("name");
        return new SkosConcept(namespace + "#" + name, name, "", broaderOf(type), COMPLEX_TYPE, module,
                definitionOf(type), "");
    }

    /** The {@code xsd:extension} base, or empty where there is none or it names another namespace's type. */
    private static String broaderOf(final Element type) {
        return childOf(type, "complexContent")
                .or(() -> childOf(type, "simpleContent"))
                .flatMap(content -> childOf(content, "extension"))
                .map(extension -> extension.getAttribute("base"))
                .filter(base -> !base.contains(":"))
                .orElse("");
    }

    /** The type-level documentation with its own line breaks collapsed, statements joined in order. */
    private static String definitionOf(final Element type) {
        return childOf(type, "annotation").stream()
                .flatMap(annotation -> RdfXml.elements(annotation.getChildNodes()))
                .filter(element -> "documentation".equals(element.getLocalName()))
                .map(Element::getTextContent)
                .map(text -> WHITESPACE.matcher(text.strip()).replaceAll(" "))
                .filter(text -> !text.isBlank())
                .collect(Collectors.joining(SkosConcept.STATEMENTS));
    }

    private static Optional<Element> childOf(final Element parent, final String localName) {
        return RdfXml.elements(parent.getChildNodes())
                .filter(element -> XSD.equals(element.getNamespaceURI()))
                .filter(element -> localName.equals(element.getLocalName()))
                .findFirst();
    }

    private static String productAreaOf(final String file) {
        final Matcher name = PRODUCT_AREA.matcher(file);
        if (!name.matches()) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "%s is not named the way an FpML schema file is",
                    file));
        }
        return name.group(1);
    }
}
