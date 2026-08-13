package org.fifties.housewife.bi.lexicon.extraction;

import java.io.IOException;
import java.util.List;

/** A SPARQL endpoint answering a query with its result rows, tab-split, header dropped. */
@FunctionalInterface
interface SparqlEndpoint {

    List<String[]> rows(String query) throws IOException, InterruptedException;
}
