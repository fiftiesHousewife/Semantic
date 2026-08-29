package io.github.fiftieshousewife.bi.lexicon;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

/**
 * What Wikipedia says a Computer Science Ontology topic is, for the topics CSO itself links to an article.
 *
 * <p>CSO states no definition for any of its 11,438 topics and states {@code owl:sameAs} for 5,294 of them,
 * naming a DBpedia resource — which is the English Wikipedia article of that title, by DBpedia's own
 * construction. The link is the publisher's, so reading the article it names is following a citation rather
 * than pairing two vocabularies here.
 *
 * <p>Every row names the Wikipedia revision the summary was read at. A page moves and a revision does not,
 * so the row is citable to a fixed version of a moving article in the way a commit pins a repository.
 *
 * <p>A topic CSO links no article for, or one whose article states no summary, is <em>absent</em> rather
 * than empty: {@link #of} returns nothing, and a caller that pools prose adds nothing for it instead of
 * adding a blank.
 */
public final class CsoAbstracts {

    private static final String RESOURCE = "cso-abstracts.tsv";

    private static final String COLUMN = "\t";

    private static final int CONCEPT = 0;

    private static final int SUMMARY = 3;

    private static final int COLUMNS = 4;

    private final Map<String, String> byConcept;

    CsoAbstracts(final Map<String, String> byConcept) {
        this.byConcept = Map.copyOf(byConcept);
    }

    public static CsoAbstracts fromClasspath() {
        return CLASSPATH_DEFAULTS;
    }

    /** What Wikipedia says the topic is, and nothing where CSO links no article that states it. */
    public Optional<String> of(final String concept) {
        return Optional.ofNullable(byConcept.get(concept)).filter(summary -> !summary.isBlank());
    }

    /** How many topics the file states prose for, which is what a coverage figure is taken over. */
    public int described() {
        return byConcept.size();
    }

    private static CsoAbstracts load() {
        final Map<String, String> byConcept = new LinkedHashMap<>();
        BundledLines.of(RESOURCE).forEach(line -> read(line, byConcept));
        return new CsoAbstracts(byConcept);
    }

    private static void read(final String line, final Map<String, String> byConcept) {
        final List<String> columns = List.of(line.split(COLUMN, -1));
        if (columns.size() != COLUMNS) {
            throw new IllegalStateException(String.format(Locale.ROOT,
                    "%s states %d columns where a row has %d: %s",
                    RESOURCE, columns.size(), COLUMNS, line));
        }
        byConcept.put(columns.get(CONCEPT), columns.get(SUMMARY));
    }

    private static final CsoAbstracts CLASSPATH_DEFAULTS = load();
}
