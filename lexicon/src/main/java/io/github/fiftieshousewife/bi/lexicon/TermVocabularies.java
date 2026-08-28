package io.github.fiftieshousewife.bi.lexicon;

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
    OLIA("OLiA") {
        @Override
        public List<SkosConcept> concepts() {
            return OliaTerms.fromClasspath().concepts();
        }
    },

    /** The Computer Science Ontology. */
    CSO("CSO") {
        @Override
        public List<SkosConcept> concepts() {
            return CsoTopics.fromClasspath().concepts();
        }
    },

    /** The Financial Industry Business Ontology. */
    FIBO("FIBO") {
        @Override
        public List<SkosConcept> concepts() {
            return FiboTerms.fromClasspath().concepts();
        }
    },

    /** The Financial products Markup Language. */
    FPML("FpML") {
        @Override
        public List<SkosConcept> concepts() {
            return FpmlTerms.fromClasspath().concepts();
        }
    },

    /** The FIX protocol, as FIX Orchestra states it. */
    FIX("FIX") {
        @Override
        public List<SkosConcept> concepts() {
            return FixTerms.fromClasspath().concepts();
        }
    },

    /** The Common Weakness Enumeration. */
    CWE("CWE") {
        @Override
        public List<SkosConcept> concepts() {
            return CweTerms.fromClasspath().concepts();
        }
    },

    /** The BIAN Service Landscape. */
    BIAN("BIAN") {
        @Override
        public List<SkosConcept> concepts() {
            return BianServiceDomains.fromClasspath().concepts();
        }
    };

    private final String publisher;

    TermVocabularies(final String publisher) {
        this.publisher = publisher;
    }

    /** The publisher's own short name, which is what a match cites. */
    public String publisher() {
        return publisher;
    }

    /** Every concept the bundled extraction states, in the order the file states them. */
    public abstract List<SkosConcept> concepts();
}
