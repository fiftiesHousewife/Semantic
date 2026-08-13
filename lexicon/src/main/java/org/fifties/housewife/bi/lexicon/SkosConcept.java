package org.fifties.housewife.bi.lexicon;

/**
 * One concept in the shape every bundled taxonomy is normalised to, whatever its source published — OWL,
 * SKOS, CSV, XSD or genericode. The properties are SKOS's own, so a source already publishing SKOS is
 * copied rather than interpreted, and one that is not is restated in the vocabulary SKOS gives for saying
 * it. A conversion inherits the source's licence, so the shape is where a taxonomy is normalised and never
 * where its terms become freer than the publisher made them.
 *
 * <p>{@code definition} is carried beside the labels because a functional taxonomy cannot be read by
 * matching its terms: nobody writes {@code ManageEnterpriseRisk} in code, and a row labelled
 * {@code GV.OC-01} states nothing at all without the sentence its publisher defines it by. That sentence is
 * what a body of code is compared against, so dropping it would leave the file unreadable for the one
 * purpose it exists to serve.
 *
 * <p>A property the source does not state is empty, never inferred. An absent {@code altLabel} means the
 * publisher states no other label for the concept, which is a fact about the taxonomy rather than an
 * invitation to borrow a synonym from somewhere that knows nothing about it.
 */
public record SkosConcept(String concept, String prefLabel, String altLabel, String broader, String kind,
        String module, String definition) {
}
