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
 * <p>{@code note} is what a source states about a concept that is neither its meaning nor its place — where
 * the publisher took it from, which tagset it was adopted to cover, which other scheme it answers to. OLiA
 * writes 949 such statements in {@code owl:versionInfo} and they are the only thing in this shape that makes
 * a match citable to a scheme outside the taxonomy. They were being dropped on the floor, which is why the
 * column exists: a conversion that reaches this shape must be able to put everything its source stated
 * somewhere, or the shape is the reason for the loss.
 *
 * <p>A property the source does not state is empty, never inferred. An absent {@code altLabel} means the
 * publisher states no other label for the concept, which is a fact about the taxonomy rather than an
 * invitation to borrow a synonym from somewhere that knows nothing about it.
 *
 * <p>Where a source states one property more than once for one concept — two definitions, four notes — the
 * statements are joined with {@value #STATEMENTS} in the order the source wrote them, and a statement
 * carrying that separator is refused rather than joined. Keeping the first and dropping the rest would be
 * the same loss in a smaller place.
 */
public record SkosConcept(String concept, String prefLabel, String altLabel, String broader, String kind,
        String module, String definition, String note) {

    /** What separates two statements of one property, chosen because no statement in any bundled source has one. */
    public static final String STATEMENTS = " | ";
}
