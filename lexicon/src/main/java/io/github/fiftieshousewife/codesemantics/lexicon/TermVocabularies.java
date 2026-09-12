package io.github.fiftieshousewife.codesemantics.lexicon;

import java.util.List;

/**
 * The vocabularies this library bundles to be matched term for term against declared names, each named once
 * so a reading that needs all of them does not restate the list.
 *
 * <p>A functional taxonomy compared against prose is not here. These are the sources whose concepts are
 * written as identifiers — {@code InterestRateSwap}, {@code natural language processing},
 * {@code ACH Fulfillment} — which is what makes a label something a repository can be found to have
 * written.
 */
public enum TermVocabularies {

    /** The Ontologies of Linguistic Annotation. */
    OLIA("olia-terms.tsv") {
        @Override
        public List<SkosConcept> concepts() {
            return OliaTerms.fromClasspath().concepts();
        }
    },

    /** The Computer Science Ontology. */
    CSO("cso-topics.tsv") {
        @Override
        public List<SkosConcept> concepts() {
            return CsoTopics.fromClasspath().concepts();
        }
    },

    /** The Financial Industry Business Ontology. */
    FIBO("fibo-terms.tsv") {
        @Override
        public List<SkosConcept> concepts() {
            return FiboTerms.fromClasspath().concepts();
        }
    },

    /** The Financial products Markup Language. */
    FPML("fpml-terms.tsv") {
        @Override
        public List<SkosConcept> concepts() {
            return FpmlTerms.fromClasspath().concepts();
        }
    },

    /** The FIX protocol, as FIX Orchestra states it. */
    FIX("fix-terms.tsv") {
        @Override
        public List<SkosConcept> concepts() {
            return FixTerms.fromClasspath().concepts();
        }
    },

    /** The Common Weakness Enumeration. */
    CWE("cwe-terms.tsv") {
        @Override
        public List<SkosConcept> concepts() {
            return CweTerms.fromClasspath().concepts();
        }
    },

    /** The BIAN Service Landscape. */
    BIAN("bian-service-domains.tsv") {
        @Override
        public List<SkosConcept> concepts() {
            return BianServiceDomains.fromClasspath().concepts();
        }
    },

    /** PRONOM, the National Archives' registry of document formats. */
    PRONOM("pronom-formats.tsv") {
        @Override
        public List<SkosConcept> concepts() {
            return PronomFormats.fromClasspath().concepts();
        }
    };

    private final String resource;

    TermVocabularies(final String resource) {
        this.resource = resource;
    }

    /** The publisher's own short name, which is what a match cites, off the resource's own header. */
    public String publisher() {
        return StatedProvenance.of(resource).shortName();
    }

    /** What the resource states about itself: its name, its publisher, its link and what it is about. */
    public StatedProvenance stated() {
        return StatedProvenance.of(resource);
    }

    /** Every concept the bundled extraction states, in the order the file states them. */
    public abstract List<SkosConcept> concepts();
}
