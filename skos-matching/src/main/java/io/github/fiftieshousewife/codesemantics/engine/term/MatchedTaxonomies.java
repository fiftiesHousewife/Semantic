package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.lexicon.TermVocabularies;

/**
 * The term taxonomies every reading matches, enumerated so the run and its documentation state one list.
 *
 * <p>Each is bundled, extracted from a pinned source, and matched against declared names the same way; a
 * consumer wanting one more injects it by path and passes the index alongside these. {@link FinanceTerms}
 * is deliberately absent: it is the out-of-domain control the vocabulary reading is judged against, and a
 * control that joined the reading it controls would be measuring itself.
 */
public enum MatchedTaxonomies {

    /** The Ontologies of Linguistic Annotation, the in-domain case for this repository. */
    OLIA {
        @Override
        public TermIndex index() {
            return LinguisticTerms.fromClasspath();
        }

        @Override
        public String description() {
            return "The Ontologies of Linguistic Annotation: the terms linguistic annotation schemes"
                    + " state parts of speech, morphology and syntax in.";
        }

        @Override
        public String subject() {
            return "linguistic annotation";
        }

        @Override
        public String publishedAt() {
            return "https://github.com/acoli-repo/olia";
        }

        @Override
        public List<SkosConcept> publishedConcepts() {
            return TermVocabularies.OLIA.concepts();
        }
    },

    /** The Computer Science Ontology, the field the read repositories are software in. */
    CSO {
        @Override
        public TermIndex index() {
            return ComputingTerms.fromClasspath();
        }

        @Override
        public String description() {
            return "The Computer Science Ontology: the topics computer science research is indexed by.";
        }

        @Override
        public String subject() {
            return "computer science";
        }

        @Override
        public String publishedAt() {
            return "https://cso.kmi.open.ac.uk/";
        }

        @Override
        public List<SkosConcept> publishedConcepts() {
            return index().publishedConcepts();
        }
    };

    public abstract TermIndex index();

    /** The publisher and what its terms state, in one sentence, for a page naming the vocabulary. */
    public abstract String description();

    /**
     * The subject the standard itself is about, in as few words as the publisher's own name and scope
     * statement allow.
     *
     * <p><b>It is a curated statement of a published standard and not of a corpus</b>, which is the
     * distinction that decides what this library may write down: FpML's own scope is derivatives, OLiA's
     * own name is the Ontologies of Linguistic Annotation, and FIX's own expansion is Financial
     * Information eXchange. Nothing here is observed from the repositories that were read.
     *
     * <p>It answers the question a reader opens the page with. A repository writing {@code MsgSeqNum} and
     * {@code BeginString} is doing financial information exchange, and the identifiers say so to nobody.
     * <b>It is drawn beside the concepts and never instead of them</b> — answering at the vocabulary is
     * the blocking this cascade already refuses, because the evidence supports descending.
     */
    public abstract String subject();

    /** Where the publisher publishes it, so a page naming a vocabulary can link to the thing it names. */
    public abstract String publishedAt();

    /**
     * What the branch rule is told the publisher states, which is what decides which concepts sit beside
     * which.
     *
     * <p><b>The two answer it from different places and that is preserved rather than settled here.</b> OLiA
     * states its own concept list and it is read whole; CSO's is derived from the terms its index carries, so
     * a concept the index reaches no term for is absent from the branch it would otherwise sit in. Making
     * them agree moves CSO's reading, which is a measurement rather than a tidy-up.
     */
    public abstract List<SkosConcept> publishedConcepts();


    /** The indexes matched beside the named one, for a reading that already holds it. */
    public static List<TermIndex> besides(final MatchedTaxonomies held) {
        return Stream.of(values()).filter(taxonomy -> taxonomy != held)
                .map(MatchedTaxonomies::index).toList();
    }
}
