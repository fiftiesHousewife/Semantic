package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * An RDF/XML document read with the platform's namespace-aware XML parser, external DTD and schema access
 * closed. Malformed XML is refused as an argument rather than parsed generously — the documents this reads
 * are published artefacts, and a file that does not parse is not the artefact.
 */
final class RdfXml {

    private RdfXml() {
    }

    static Document parsed(final byte[] document) {
        try {
            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            factory.setNamespaceAware(true);
            return factory.newDocumentBuilder().parse(new ByteArrayInputStream(document));
        } catch (final SAXException e) {
            throw new IllegalArgumentException("Malformed RDF/XML", e);
        } catch (final ParserConfigurationException e) {
            throw new IllegalStateException("The platform states no namespace-aware XML parser", e);
        } catch (final IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /** The element nodes of a node list, which is what every reading of a parsed document walks. */
    static Stream<Element> elements(final NodeList nodes) {
        return IntStream.range(0, nodes.getLength()).mapToObj(nodes::item)
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(Element.class::cast);
    }
}
