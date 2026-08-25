package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.OliaTerms;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

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
        public List<SkosConcept> publishedConcepts() {
            return OliaTerms.fromClasspath().concepts();
        }
    },

    /** The Computer Science Ontology, the field the read repositories are software in. */
    CSO {
        @Override
        public TermIndex index() {
            return ComputingTerms.fromClasspath();
        }

        @Override
        public List<SkosConcept> publishedConcepts() {
            return index().publishedConcepts();
        }
    };

    public abstract TermIndex index();

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
