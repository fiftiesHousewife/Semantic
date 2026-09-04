package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * The complex types of a set of FpML schema files, one concept each: the type's own name is the term a
 * trading system writes, its {@code xsd:extension} base is {@code broader}, its {@code xsd:documentation}
 * is the definition, and the product area in the schema file's own name is the module.
 *
 * <p>A base the schema writes with a namespace prefix belongs to XML Schema rather than to FpML and is
 * not read: {@code xsd:normalizedString} is another specification's primitive, not a subject FpML states.
 *
 * <p><b>A base FpML declares as a simple type is a format constraint and is not a broader subject.</b> 235
 * of the 1,405 types extend one — 195 extend {@code Scheme}, 32 {@code NonEmptyScheme} — and the schema
 * set says which those are, so nothing here decides it. Writing them as {@code broader} said FpML places
 * {@code AccountType} beneath {@code Scheme}, and {@code StatedAncestry} then climbed there and a page
 * grouped 510 sightings of <em>account type</em> under a name for a string. Writing them as unplaced said
 * FpML states no base at all, which is equally false. They are stated in {@code note}, which is the
 * publisher's statement kept out of the subject walk.
 *
 * <p><b>A base this set holds no declaration of at all is still carried as {@code broader}</b>, because
 * nothing here can say it is not a subject. FIBO does the same with the 228 rows it places under the OMG
 * Commons Ontology Library's {@code PartyRole} and {@code Classifier}, and a rule that dropped an
 * undeclared base would take those with it.
 *
 * <p>Simple types and global elements are not read as concepts of their own — a simple type is a format
 * constraint rather than a subject, and every global element restates a complex type under a lowercased
 * name.
 */
public final class FpmlConcepts {

    private static final String XSD = "http://www.w3.org/2001/XMLSchema";
    private static final String COMPLEX_TYPE = "complexType";
    private static final String SIMPLE_TYPE = "simpleType";
    private static final Pattern PRODUCT_AREA = Pattern.compile("fpml-(.+)-\\d+-\\d+\\.xsd");
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");

    public List<SkosConcept> in(final List<ContentDigest.Member> schemas) {
        final java.util.Set<String> formats = formatsIn(schemas);
        return schemas.stream().flatMap(schema -> conceptsIn(schema, formats)).toList();
    }

    /** Every name the set declares as a simple type, which is what the publisher calls a format. */
    static java.util.Set<String> formatsIn(final List<ContentDigest.Member> schemas) {
        return schemas.stream()
                .map(schema -> RdfXml.parsed(schema.bytes()))
                .flatMap(parsed -> RdfXml.elements(parsed.getDocumentElement().getChildNodes()))
                .filter(element -> XSD.equals(element.getNamespaceURI()))
                .filter(element -> SIMPLE_TYPE.equals(element.getLocalName()))
                .map(element -> element.getAttribute("name"))
                .filter(name -> !name.isBlank())
                .collect(Collectors.toUnmodifiableSet());
    }

    private static Stream<SkosConcept> conceptsIn(final ContentDigest.Member schema,
                                                  final java.util.Set<String> formats) {
        final Document parsed = RdfXml.parsed(schema.bytes());
        final String namespace = parsed.getDocumentElement().getAttribute("targetNamespace");
        final String module = productAreaOf(schema.name());
        return RdfXml.elements(parsed.getDocumentElement().getChildNodes())
                .filter(element -> XSD.equals(element.getNamespaceURI()))
                .filter(element -> COMPLEX_TYPE.equals(element.getLocalName()))
                .filter(element -> !element.getAttribute("name").isBlank())
                .map(element -> conceptOf(element, namespace, module, formats));
    }

    private static SkosConcept conceptOf(final Element type, final String namespace,
                                         final String module, final java.util.Set<String> formats) {
        final String name = type.getAttribute("name");
        final String base = baseOf(type);
        final boolean isFormat = formats.contains(base);
        return new SkosConcept(namespace + "#" + name, name, "", isFormat ? "" : base, COMPLEX_TYPE,
                module, definitionOf(type), isFormat ? base : "");
    }

    /** The {@code xsd:extension} base, or empty where there is none or it names another namespace's type. */
    private static String baseOf(final Element type) {
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
