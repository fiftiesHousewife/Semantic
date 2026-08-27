package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * Every bundled vocabulary's extraction, enumerated so one command runs any of them: the entry knows its
 * source shape and the resource files it writes, and the build script no longer states either.
 *
 * <p>Each entry delegates to its extraction's own {@code main}, so an extraction still runs standalone and
 * its own class still documents its pin, its acceptance and its refusals. What lives here is only the
 * routing: the name a caller extracts by, how many sources the extraction takes, and which files under
 * {@code lexicon/src/main/resources} it writes. A source left blank is passed as blank — the extractions
 * that can fetch their own permalink accept that, and the ones that cannot refuse it themselves.
 */
public enum BundledExtractions {

    /** The Wiktionary dumps: the English and the Translingual kaikki JSONL, blank to download each. */
    WIKTIONARY("wiktionary") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            WiktionaryExtraction.main(new String[] {source(sources, 0), source(sources, 1),
                    output(resources, "wiktionary-abbreviations.tsv"),
                    output(resources, "wiktionary-topics.tsv")});
        }
    },

    /** wiktextract's own topic-generalise map, at the pinned revision; blank downloads it. */
    TOPIC_HIERARCHY("topic-hierarchy") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            TopicHierarchyExtraction.main(new String[] {source(sources, 0),
                    output(resources, "wiktionary-topic-hierarchy.tsv")});
        }
    },

    /** NIST's OSCAL edition of the Cybersecurity Framework; blank downloads the pinned catalog. */
    NIST_CSF("nist-csf") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            NistCsfExtraction.main(new String[] {source(sources, 0),
                    output(resources, "nist-csf-functions.tsv")});
        }
    },

    /** arXiv's taxonomy module, at the pinned revision; blank downloads it. */
    ARXIV("arxiv") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            ArxivTaxonomyExtraction.main(new String[] {source(sources, 0),
                    output(resources, "arxiv-taxonomy.tsv")});
        }
    },

    /** The OLiA core ontology, at the pinned revision; blank downloads it. */
    OLIA("olia") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            OliaTermsExtraction.main(new String[] {source(sources, 0),
                    output(resources, "olia-terms.tsv")});
        }
    },

    /** Wikidata's short names and aliases, via the QLever SPARQL endpoint. */
    WIKIDATA_INITIALISMS("wikidata-initialisms") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            WikidataInitialismExtraction.main(new String[] {
                    output(resources, "wikidata-initialisms.tsv")});
        }
    },

    /** Wikidata's given and family names, via the QLever SPARQL endpoint. */
    WIKIDATA_NAMES("wikidata-names") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            WikidataNameExtraction.main(new String[] {output(resources, "wikidata-names.tsv")});
        }
    },

    /** DuckDB's own function catalogue, read from the embedded engine — no source at all. */
    SQL_FUNCTIONS("sql-functions") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            SqlFunctionExtraction.main(new String[] {output(resources, "sql-functions.tsv")});
        }
    },

    /** The CSO CSV, handed over unzipped because the publisher serves it inside an archive. */
    CSO("cso") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            CsoTopicsExtraction.main(new String[] {source(sources, 0),
                    output(resources, "cso-topics.tsv")});
        }
    },

    /** A checkout of BIAN's artefacts repository at the pinned commit. */
    BIAN("bian") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            BianServiceDomainsExtraction.main(new String[] {source(sources, 0),
                    output(resources, "bian-service-domains.tsv")});
        }
    },

    /** The CWE catalog XML at the pinned commit; blank downloads the permalink. */
    CWE("cwe") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            CweTermsExtraction.main(new String[] {source(sources, 0),
                    output(resources, "cwe-terms.tsv")});
        }
    },

    /** The FIX Orchestra file at the pinned commit; blank downloads the permalink. */
    FIX("fix") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            FixTermsExtraction.main(new String[] {source(sources, 0),
                    output(resources, "fix-terms.tsv")});
        }
    },

    /** A checkout of the HandCoded toolkit repository, which vendors the FpML 5.11 schemas. */
    FPML("fpml") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            FpmlTermsExtraction.main(new String[] {source(sources, 0),
                    output(resources, "fpml-terms.tsv")});
        }
    },

    /** A FIBO checkout at the pinned commit — far too large to fetch file by file. */
    FIBO("fibo") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            FiboTermsExtraction.main(new String[] {source(sources, 0),
                    output(resources, "fibo-terms.tsv")});
        }
    },

    /** The directory holding IANA's ten per-registry CSVs. */
    MEDIA_TYPES("media-types") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            MediaTypeExtraction.main(new String[] {source(sources, 0),
                    output(resources, "media-types.tsv")});
        }
    },

    /** The directory holding OpenAlex's topics snapshot: the manifest and the parts it names. */
    OPENALEX("openalex") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            OpenAlexTopicsExtraction.main(new String[] {source(sources, 0),
                    output(resources, "openalex-topics.tsv"),
                    output(resources, "openalex-topic-sizes.tsv")});
        }
    },

    /** The eXtended WordNet Domains archive and WordNet 3.0's own index, in that order. */
    XWND("xwnd") {
        @Override
        void extract(final List<String> sources, final Path resources) throws Exception {
            XwndDomainsExtraction.main(new String[] {source(sources, 0), source(sources, 1)});
        }
    };

    private final String taxonomy;

    BundledExtractions(final String taxonomy) {
        this.taxonomy = taxonomy;
    }

    /** The name a caller extracts by: {@code ./gradlew extract -Ptaxonomy=<this> -Psource=<path[,path]>}. */
    public String taxonomy() {
        return taxonomy;
    }

    /** Runs the entry's own extraction, which throws what its main declares. */
    abstract void extract(List<String> sources, Path resources) throws Exception;

    /** The entry the caller named, or a refusal that lists what can be named. */
    public static BundledExtractions named(final String taxonomy) {
        return Stream.of(values())
                .filter(extraction -> extraction.taxonomy.equals(taxonomy))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format(Locale.ROOT,
                        "No bundled extraction is named %s. The names: %s",
                        taxonomy,
                        Stream.of(values()).map(BundledExtractions::taxonomy).toList())));
    }

    /** The named source, or blank where the caller stated fewer — the extraction's own rules then apply. */
    static String source(final List<String> sources, final int at) {
        return at < sources.size() ? sources.get(at) : "";
    }

    static String output(final Path resources, final String file) {
        return resources.resolve(file).toString();
    }
}
