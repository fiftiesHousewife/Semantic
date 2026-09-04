package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Renders the Wikipedia summaries of CSO's linked topics as the TSV the lexicon bundles: a provenance
 * header naming what was read and how each row is pinned, then one row per topic.
 */
public class CsoAbstractsTsv {

    private static final String COLUMN = "\t";

    private static final String ROW = "\n";

    /** One topic's article, as read. */
    public record Summary(String concept, String article, String revision, String prose) {
    }

    public String render(final List<Summary> summaries, final String retrieved) {
        return header(summaries, retrieved)
                + summaries.stream().map(CsoAbstractsTsv::row).collect(Collectors.joining(ROW)) + ROW;
    }

    private static String row(final Summary summary) {
        return String.join(COLUMN, summary.concept(), summary.article(), summary.revision(),
                summary.prose().replace(COLUMN, " ").replace(ROW, " ").strip());
    }

    private static String header(final List<Summary> summaries, final String retrieved) {
        final long described = summaries.stream().filter(one -> !one.prose().isBlank()).count();
        final long words = summaries.stream().filter(one -> !one.prose().isBlank())
                .mapToLong(one -> one.prose().split("\\s+").length).sum();
        return """
                # What Wikipedia says each Computer Science Ontology topic is, for the topics CSO itself
                # links to an article.
                #
                # CSO states no definition for any of its 11,438 topics, so a placement comparing prose has
                # nothing of CSO's own to compare against. CSO does state owl:sameAs for 5,294 of them,
                # naming a DBpedia resource — which is the English Wikipedia article of that title, by
                # DBpedia's own construction. Reading the article CSO names is following the publisher's
                # own link. Nothing here pairs two vocabularies; CSO paired them.
                #
                # Columns: concept, article, revision, summary. concept is CSO's own topic identifier and
                # joins this file to cso-topics.tsv. article is the title CSO's sameAs named. revision is
                # the Wikipedia revision the summary was read at, and it is the citation: a page moves and
                # a revision does not, so every row here names a fixed version of a moving article the way
                # a commit pins a repository. A topic whose article states no summary keeps its row with an
                # empty one, because a link that led nowhere is a fact about the link.
                #
                """
                + String.format(Locale.ROOT,
                        "# %d rows, %d of them stating prose, %d words in all.%n",
                        summaries.size(), described, words)
                + "#\n"
                + "# Name: Wikipedia summaries of the Computer Science Ontology's topics\n"
                + "# Publisher: the Wikimedia Foundation (https://en.wikipedia.org/)\n"
                + "# Kind: subjects\n"
                + "# Source: the Wikimedia REST summary API, https://en.wikipedia.org/api/rest_v1/, one\n"
                + "#   request per article CSO names, following redirects. The links themselves come from\n"
                + "#   CSO 3.5's own owl:sameAs statements, in the archive cso-topics.tsv is pinned to.\n"
                + "# Retrieved: " + retrieved + ". Each row's revision column is what a later run compares\n"
                + "#   against, so a summary that has since been rewritten is visible rather than silent.\n"
                + "# Licence: this data file is derived from Wikipedia content and is distributed under\n"
                + "#   CC BY-SA (https://creativecommons.org/licenses/by-sa/4.0/). The licence attaches to\n"
                + "#   this file, not to the code that reads or produced it.\n"
                + "#\n";
    }
}
