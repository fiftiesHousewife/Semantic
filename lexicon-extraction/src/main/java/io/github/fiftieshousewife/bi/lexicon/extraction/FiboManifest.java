package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.IntStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Which ontologies make up FIBO's production vocabulary, according to FIBO.
 *
 * <p>FIBO is published as a hundred separate documents and there is no merged one. Something has to decide
 * which of them the vocabulary is, and choosing a directory to walk would make that decision here — the
 * reading would then be of a corpus this project assembled, which is the thing the doctrine refuses. The
 * publisher already answers it: {@code AboutFIBOProd-TBoxOnly.rdf} exists, in its own words, to load "the
 * latest FIBO production ontologies, excluding reference data and examples", and it does so by stating an
 * {@code owl:imports} for each one. Reading that list is a citation; walking the tree would be a guess.
 *
 * <p>An import names an ontology by its published URI. The repository lays those out as directories under
 * the same path, so the URI's tail plus {@code .rdf} is the file — and an import naming something outside
 * FIBO's own namespace is somebody else's ontology, which this file set does not carry and does not claim to.
 */
public final class FiboManifest {

    private static final String OWL = "http://www.w3.org/2002/07/owl#";
    private static final String RDF = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

    private static final String IMPORTS = "imports";
    private static final String RESOURCE = "resource";

    private static final String PUBLISHED_UNDER = "https://spec.edmcouncil.org/fibo/ontology/";

    private static final String SUFFIX = ".rdf";

    /** The repository-relative path of every FIBO ontology the manifest imports, in the order stated. */
    public List<String> ontologiesIn(final byte[] manifest) {
        final Document parsed = parse(manifest);
        final List<String> paths = elements(parsed.getElementsByTagNameNS(OWL, IMPORTS))
                .map(element -> element.getAttributeNS(RDF, RESOURCE))
                .filter(uri -> uri.startsWith(PUBLISHED_UNDER))
                .map(FiboManifest::fileFor)
                .distinct()
                .toList();
        if (paths.isEmpty()) {
            throw new IllegalArgumentException("The manifest imports no ontology published under "
                    + PUBLISHED_UNDER + ", so it is not FIBO's production manifest");
        }
        return paths;
    }

    private static String fileFor(final String uri) {
        return trimmed(uri.substring(PUBLISHED_UNDER.length())) + SUFFIX;
    }

    private static String trimmed(final String path) {
        return path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
    }

    private static java.util.stream.Stream<Element> elements(final NodeList nodes) {
        return IntStream.range(0, nodes.getLength()).mapToObj(nodes::item)
                .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                .map(Element.class::cast);
    }

    private static Document parse(final byte[] document) {
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
}
