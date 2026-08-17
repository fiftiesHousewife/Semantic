package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.util.List;

import org.w3c.dom.Document;

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
        final Document parsed = RdfXml.parsed(manifest);
        final List<String> paths = RdfXml.elements(parsed.getElementsByTagNameNS(OWL, IMPORTS))
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
}
