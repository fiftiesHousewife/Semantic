package org.fifties.housewife.codesemantics.engine.term;

/**
 * The words the term page is written in, kept out of the markup so the page is structure and the prose is
 * prose. Every claim here is one the reading behind the page can be asked to produce.
 */
final class TermProse {

    static final String HEADING = "What a published taxonomy matched";

    static final String LEDE = """
            The Ontologies of Linguistic Annotation publish 1,197 concepts whose names are already \
            identifiers. This is every one of them a name in this repository was read as, placed where the \
            ontology itself says it belongs.""";

    static final String LIMITS = """
            Nothing here votes. The theme reading is untouched by all of this, because a vocabulary that has \
            only been run on a repository in its own domain has not yet been shown to discriminate anything.""";

    static final String LENGTH_HEADING = "Read the length before the rate";

    static final String LENGTH = """
            The measurement that shaped this design matched a finance ontology against a repository with no \
            finance in it: 1,789 hits on one-word terms, three on terms of two words or more. The one-word \
            match is what a taxonomy does to a repository it knows nothing about — so a rate is only \
            interesting once it has survived being split this way. This repository is squarely inside OLiA's \
            domain, and the split looks much the same.""";

    static final String BRANCH_HEADING = "Where the ontology puts what it matched";

    static final String BRANCH = """
            The tree is the ontology's own. A concept's place is the chain of superclasses OLiA states above \
            it, so nothing here was arranged: no layout is computed, no force is simulated, and two runs of \
            one repository draw the same picture. A pale rung is a concept on the path that nothing in this \
            repository was read as — it is drawn because the branch cannot be shown without it, and it \
            carries no bar because there is no evidence to give it.""";

    static final String BRANCH_FINDING = """
            This is the part worth staring at, and it inverts the ranking. The three branches the ontology \
            places hold most of the mass in the reading — and almost nothing in them is this repository \
            writing linguistics. LinguisticConcept is reached through discourse and text structure, and \
            arrives carrying topic, source, text, title, author, document, set, other, means, support, \
            evidence, given and new. Relation is coherence relations, and arrives carrying comparison, \
            result, condition, list, summary and definition. SemanticFeature arrives carrying person, \
            function, object, space and URL. Sentence and identifier are the only two that belong.

            None of that could be seen from a rate, or from a term length, or from how rare the words are. \
            The branch tells them apart, and the branch is the publisher's own statement rather than \
            anybody's opinion about which matches look convincing.""";

    static final String UNPLACED_HEADING = "The terms it states no parent for";

    static final String UNPLACED = """
            OLiA names no superclass for these, because the parent is an anonymous restriction or belongs to \
            an ontology it imports rather than carries. Inventing one would be this library stating a \
            taxonomy its source did not — so they stand at their own root.

            And this is where the real vocabulary is. Verb, phrase, noun, clause, token, prefix, suffix, \
            affix, stem, derivation, acronym, initialism, abbreviation, punctuation, plural, common noun, \
            base form and collocation are all here, and every one of them is this repository working in \
            OLiA's field rather than writing English that happens to collide with it. The terms that place \
            this repository are precisely the ones the taxonomy cannot place in itself.""";

    static final String FOOT = "Drawn from the same reading the report is written from, so the picture "
            + "and the figures cannot disagree. Regenerate both with ./gradlew selfRead.";

    private TermProse() {
    }
}
