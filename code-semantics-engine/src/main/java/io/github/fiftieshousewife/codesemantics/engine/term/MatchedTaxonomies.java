package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.Stream;

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
    },

    /** The Computer Science Ontology, the field the read repositories are software in. */
    CSO {
        @Override
        public TermIndex index() {
            return ComputingTerms.fromClasspath();
        }
    };

    public abstract TermIndex index();

    /** The indexes matched beside the named one, for a reading that already holds it. */
    public static List<TermIndex> besides(final MatchedTaxonomies held) {
        return Stream.of(values()).filter(taxonomy -> taxonomy != held)
                .map(MatchedTaxonomies::index).toList();
    }
}
