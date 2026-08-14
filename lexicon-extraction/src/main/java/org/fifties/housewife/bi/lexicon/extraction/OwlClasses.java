package org.fifties.housewife.bi.lexicon.extraction;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * The named classes of an OWL ontology published as RDF/XML, read with an XML parser rather than by pattern.
 *
 * <p>RDF/XML nests: a class states its superclasses beside anonymous restriction blocks that are themselves
 * classes, and the same class is written out again wherever the document has more to say about it. A grammar
 * over the text would have to know which of those it was looking at. The parse knows — which is the same
 * argument this library makes for reading Java with a parser instead of a regular expression, and it is why
 * no RDF library is needed to answer a question this narrow.
 *
 * <p>A class element with no {@code rdf:about} is anonymous — a restriction states a condition, not a
 * concept — and is passed over. Where a class is written more than once, the first statement of each
 * single-valued property stands and every statement of a repeated one is kept.
 *
 * <p>Which properties are read is the whole question, because what is not read is not lost loudly. Two were
 * missed for as long as this class existed: {@code rdfs:comment}, where the ontology states what a concept
 * <em>means</em>, and {@code owl:versionInfo}, where it states which scheme it took the concept from. Both
 * are now read, and {@code OliaTermsExtractionTest} counts them against the document rather than trusting
 * that they arrived.
 */
public class OwlClasses {

    private static final String RDF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
    private static final String RDFS = "http://www.w3.org/2000/01/rdf-schema#";
    private static final String OWL = "http://www.w3.org/2002/07/owl#";

    private static final String ABOUT = "about";
    private static final String ID = "ID";
    private static final String RESOURCE = "resource";
    private static final String CLASS = "Class";
    private static final String SUBCLASS_OF = "subClassOf";

    private static final String BASE = "base";

    private static final String FRAGMENT = "#";

    private static final char PATH = '/';

    private static final String SCHEME = "://";

    private static final String NOTHING = "";

    public List<OwlClass> in(final byte[] document) {
        final Document parsed = parse(document);
        final String base = parsed.getDocumentElement().getAttributeNS(XMLConstants.XML_NS_URI, BASE);
        final Map<String, OwlClass> byConcept = new LinkedHashMap<>();
        named(parsed).forEach(element -> read(element, base, byConcept));
        if (byConcept.isEmpty()) {
            throw new IllegalArgumentException("The document states no named OWL class");
        }
        return List.copyOf(byConcept.values());
    }

    private static void read(final Element element, final String base,
                             final Map<String, OwlClass> byConcept) {
        final String concept = resolved(nameOf(element), base);
        final OwlClass known = byConcept.getOrDefault(concept,
                new OwlClass(concept, fragmentOf(concept), NOTHING, Map.of()));
        byConcept.put(concept, new OwlClass(concept, known.id(),
                known.broader().isEmpty() ? namedSuperclass(element) : known.broader(),
                and(known.annotations(), annotationsOn(element))));
    }

    /**
     * Where a class is written out more than once, the first statement of its place stands and every
     * annotation accumulates. A definition the ontology states in the second of three class elements is one
     * the ontology states.
     */
    private static Map<String, List<String>> and(final Map<String, List<String>> known,
                                                 final Map<String, List<String>> stated) {
        final Map<String, List<String>> pooled = new LinkedHashMap<>(known);
        stated.forEach((property, values) -> pooled.merge(property, values,
                (before, after) -> Stream.concat(before.stream(), after.stream()).toList()));
        return pooled;
    }

    /**
     * Every annotation written directly on the class. A child carrying element children of its own is a
     * structural axiom rather than an annotation — a nested restriction or a class expression — and states
     * nothing this shape has a column for.
     */
    private static Map<String, List<String>> annotationsOn(final Element element) {
        final Map<String, List<String>> stated = new LinkedHashMap<>();
        elements(element.getChildNodes())
                .filter(child -> elements(child.getChildNodes()).findAny().isEmpty())
                .forEach(child -> stated.computeIfAbsent(qualified(child), property -> new ArrayList<>())
                        .add(child.getTextContent()));
        return stated;
    }

    /** A property named the way a caller writes it: its namespace and its local name. */
    static String qualified(final Element child) {
        return child.getNamespaceURI() + child.getLocalName();
    }

    /**
     * A reference written as a bare fragment is relative to the document's own {@code xml:base}, and
     * resolving it is what makes {@code #Noun} the same concept as the one written out in full. Left
     * unresolved it is a second concept with the same name — and a first column beginning with {@code #}
     * that every reader of a bundled file would take for a comment.
     *
     * <p>An absolute reference is already resolved and is left exactly as the ontology wrote it. Appending
     * it to the base instead produced concepts named {@code <base>#<whole URI>} for every FIBO class, whose
     * URIs separate with {@code /} and carry no fragment at all — so every identifier read out of that
     * ontology was the URI rather than the term.
     */
    private static String resolved(final String reference, final String base) {
        if (reference.startsWith(FRAGMENT)) {
            return base + reference;
        }
        return absolute(reference) ? reference : base + FRAGMENT + reference;
    }

    private static boolean absolute(final String reference) {
        return reference.contains(SCHEME) || reference.contains(FRAGMENT);
    }

    /**
     * The first superclass stated by name, however the ontology chose to write it; an anonymous restriction
     * states a condition, not a parent.
     *
     * <p>RDF/XML offers two spellings of the same statement and OLiA uses both: an {@code rdf:resource}
     * attribute on the {@code rdfs:subClassOf}, and a nested {@code owl:Class} naming the parent. Reading
     * only the attribute lost <b>627 of the ontology's 1,422 superclass statements</b> — more than half its
     * hierarchy — and left the concepts a program actually writes, {@code Verb} and {@code Noun} and
     * {@code Phrase} among them, looking like roots of their own. A taxonomy read that way is a list of
     * words, and this library then described the wreckage as the publisher's own structure.
     */
    private static String namedSuperclass(final Element element) {
        return children(element, RDFS, SUBCLASS_OF)
                .map(OwlClasses::parentNamedBy)
                .filter(named -> !named.isEmpty())
                .findFirst().map(OwlClasses::fragmentOf).orElse(NOTHING);
    }

    /** Either spelling: the reference on the statement, or the class nested inside it. */
    private static String parentNamedBy(final Element subClassOf) {
        final String reference = subClassOf.getAttributeNS(RDF, RESOURCE);
        return reference.isEmpty()
                ? children(subClassOf, OWL, CLASS).map(OwlClasses::nameOf)
                        .filter(named -> !named.isEmpty()).findFirst().orElse(NOTHING)
                : reference;
    }

    /** What a class element calls itself, by either of the two names RDF/XML allows it. */
    private static String nameOf(final Element element) {
        final String about = element.getAttributeNS(RDF, ABOUT);
        return about.isEmpty() ? element.getAttributeNS(RDF, ID) : about;
    }

    /**
     * The local name a concept URI ends in, which is the term. RDF spells that two ways and both are in use
     * here: OLiA writes {@code olia.owl#CommonNoun} and FIBO writes {@code .../IRSwaps/InterestRateSwap}, so
     * the name is what follows the last {@code #} where there is one and the last {@code /} where there is
     * not.
     */
    private static String fragmentOf(final String uri) {
        final int fragment = uri.lastIndexOf(FRAGMENT);
        return fragment < 0 ? uri.substring(uri.lastIndexOf(PATH) + 1) : uri.substring(fragment + 1);
    }

    private static Stream<Element> named(final Document document) {
        return elements(document.getElementsByTagNameNS(OWL, CLASS))
                .filter(element -> !nameOf(element).isEmpty());
    }

    private static Stream<Element> children(final Element element, final String namespace,
                                            final String name) {
        return elements(element.getChildNodes())
                .filter(child -> namespace.equals(child.getNamespaceURI()))
                .filter(child -> name.equals(child.getLocalName()));
    }

    private static Stream<Element> elements(final NodeList nodes) {
        return IntStream.range(0, nodes.getLength()).mapToObj(nodes::item)
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(Element.class::cast);
    }

    private static Document parse(final byte[] document) {
        try {
            return builder().parse(new ByteArrayInputStream(document));
        } catch (final SAXException e) {
            throw new IllegalArgumentException("Malformed RDF/XML", e);
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static DocumentBuilder builder() {
        try {
            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, NOTHING);
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, NOTHING);
            factory.setNamespaceAware(true);
            return factory.newDocumentBuilder();
        } catch (final ParserConfigurationException e) {
            throw new IllegalStateException("The platform states no namespace-aware XML parser", e);
        }
    }
}
