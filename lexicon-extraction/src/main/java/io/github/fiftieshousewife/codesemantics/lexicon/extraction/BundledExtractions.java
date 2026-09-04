package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Every bundled vocabulary's extraction, listed so one command runs any of them: the entry knows its source
 * shape and the resource files it writes, and the build script no longer states either.
 *
 * <p>What lives here is only the routing — the name a caller extracts by, the sources the extraction takes
 * in the order it takes them, and which files under {@code lexicon/src/main/resources} it writes. The
 * extraction's own class holds the pin, the acceptance and the parse. A source an extraction downloads for
 * itself is read through {@link StatedSources#orDownloaded}, which passes blank; one it reads off disk goes
 * through {@link StatedSources#path}, which refuses blank and names what was missing.
 */
public final class BundledExtractions {

    private static final List<BundledExtraction> BUNDLED = List.of(
            new BundledExtraction("wiktionary",
                    "the English and the Translingual kaikki JSONL dumps, blank to download each",
                    BundledExtractions::wiktionary),
            new BundledExtraction("topic-hierarchy",
                    "wiktextract's own topic-generalise map at the pinned revision, blank to download it",
                    (sources, resources) -> new TopicHierarchyExtraction().extract(sources.orDownloaded(0),
                            resources.resolve("wiktionary-topic-hierarchy.tsv"))),
            new BundledExtraction("nist-csf",
                    "NIST's OSCAL edition of the Cybersecurity Framework, blank to download the catalog",
                    (sources, resources) -> new NistCsfExtraction().extract(sources.orDownloaded(0),
                            resources.resolve("nist-csf-functions.tsv"))),
            new BundledExtraction("arxiv",
                    "arXiv's taxonomy module at the pinned revision, blank to download it",
                    (sources, resources) -> new ArxivTaxonomyExtraction().extract(sources.orDownloaded(0),
                            resources.resolve("arxiv-taxonomy.tsv"))),
            new BundledExtraction("olia",
                    "the OLiA core ontology at the pinned revision, blank to download it",
                    (sources, resources) -> new OliaTermsExtraction().extract(sources.orDownloaded(0),
                            resources.resolve("olia-terms.tsv"))),
            new BundledExtraction("wikidata-initialisms",
                    "nothing — Wikidata's short names and aliases come over the QLever SPARQL endpoint",
                    (sources, resources) -> new WikidataInitialismExtraction(new QleverWikidata())
                            .extractTo(resources.resolve("wikidata-initialisms.tsv"))),
            new BundledExtraction("wikidata-names",
                    "nothing — Wikidata's given and family names come over the QLever SPARQL endpoint",
                    (sources, resources) -> new WikidataNameExtraction(new QleverWikidata())
                            .extractTo(resources.resolve("wikidata-names.tsv"))),
            new BundledExtraction("sql-functions",
                    "nothing — the function catalogue is read out of the embedded query engine",
                    (sources, resources) -> new SqlFunctionExtraction()
                            .extract(resources.resolve("sql-functions.tsv"))),
            new BundledExtraction("cso",
                    "the CSO CSV, unzipped, because the publisher serves it inside an archive",
                    (sources, resources) -> new CsoTopicsExtraction()
                            .extract(sources.path(0, "the CSO CSV, unzipped"),
                                    resources.resolve("cso-topics.tsv"))),
            new BundledExtraction("cso-abstracts",
                    "the fetched Wikipedia summaries, one per line, and the date they were read",
                    (sources, resources) -> new CsoAbstractsExtraction()
                            .extract(sources.path(0, "the fetched summaries, one per line"),
                                    resources.resolve("cso-abstracts.tsv"),
                                    sources.stated(1, "the date the summaries were fetched"))),
            new BundledExtraction("bian",
                    "a checkout of BIAN's artefacts repository at the pinned commit",
                    (sources, resources) -> new BianServiceDomainsExtraction()
                            .extract(sources.path(0, "an artefacts checkout"),
                                    resources.resolve("bian-service-domains.tsv"))),
            new BundledExtraction("cwe",
                    "the CWE catalog XML at the pinned commit, blank to download the permalink",
                    (sources, resources) -> new CweTermsExtraction().extract(sources.orDownloaded(0),
                            resources.resolve("cwe-terms.tsv"))),
            new BundledExtraction("fix",
                    "the FIX Orchestra file at the pinned commit, blank to download the permalink",
                    (sources, resources) -> new FixTermsExtraction().extract(sources.orDownloaded(0),
                            resources.resolve("fix-terms.tsv"))),
            new BundledExtraction("fpml",
                    "a checkout of the HandCoded toolkit, which vendors the FpML 5.11 schemas",
                    (sources, resources) -> new FpmlTermsExtraction()
                            .extract(sources.path(0, "a fpml-toolkit-java checkout"),
                                    resources.resolve("fpml-terms.tsv"))),
            new BundledExtraction("fibo",
                    "a FIBO checkout at the pinned commit — far too large to fetch file by file",
                    (sources, resources) -> new FiboTermsExtraction()
                            .extract(sources.path(0, "a fibo checkout"),
                                    resources.resolve("fibo-terms.tsv"))),
            new BundledExtraction("media-types",
                    "the directory holding IANA's ten per-registry CSVs",
                    (sources, resources) -> new MediaTypeExtraction()
                            .extract(sources.path(0, "the directory of registry CSVs"),
                                    resources.resolve("media-types.tsv"))),
            new BundledExtraction("openalex",
                    "the directory holding OpenAlex's topics snapshot: the manifest and the parts it names",
                    (sources, resources) -> new OpenAlexTopicsExtraction()
                            .extract(sources.path(0, "the snapshot directory"),
                                    resources.resolve("openalex-topics.tsv"),
                                    resources.resolve("openalex-topic-sizes.tsv"))),
            new BundledExtraction("xwnd",
                    "the eXtended WordNet Domains archive and WordNet 3.0's own index, in that order",
                    (sources, resources) -> new XwndDomainsExtraction()
                            .extract(sources.path(0, "the XWND distribution archive"),
                                    sources.path(1, "the WordNet 3.0 data artefact"),
                                    resources.resolve("xwnd-domains.tsv"))));

    private BundledExtractions() {
    }

    /** The entry the caller named, or a refusal stating every name and what each of them reads. */
    public static BundledExtraction named(final String taxonomy) {
        return BUNDLED.stream()
                .filter(bundled -> bundled.taxonomy().equals(taxonomy))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format(Locale.ROOT,
                        "No bundled extraction is named %s. What is bundled, and what each reads:%s",
                        taxonomy, BUNDLED.stream().map(BundledExtractions::line).collect(Collectors.joining()))));
    }

    /** Every bundled extraction, in the order this file lists them. */
    public static List<BundledExtraction> all() {
        return BUNDLED;
    }

    private static String line(final BundledExtraction bundled) {
        return System.lineSeparator() + "  " + bundled.taxonomy() + " reads " + bundled.reads();
    }

    /** Two dumps into two files, and the only entry whose sources are resolved before the reading runs. */
    private static void wiktionary(final StatedSources sources, final Path resources) throws Exception {
        final WiktionaryExtraction extraction = new WiktionaryExtraction();
        extraction.extract(extraction.dumps(sources.orDownloaded(0), sources.orDownloaded(1)),
                resources.resolve("wiktionary-abbreviations.tsv"),
                resources.resolve("wiktionary-topics.tsv"));
    }
}
