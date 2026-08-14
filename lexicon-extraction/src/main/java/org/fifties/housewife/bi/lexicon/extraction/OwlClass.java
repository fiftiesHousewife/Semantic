package org.fifties.housewife.bi.lexicon.extraction;

import java.util.List;

/**
 * One named class of an OWL ontology, read to what a taxonomy row needs of it: the identifier it is
 * published under, the name it is published as, the words a reader would say it in, the class it is stated
 * beneath, what the ontology says it <em>means</em>, and where the ontology says it came from.
 *
 * <p>{@code id} is the fragment after the {@code #}, which for an ontology of this kind is already an
 * identifier a program would write — {@code AdjectivePhrase}, {@code Determiner}, {@code Acronym}. That is
 * what makes such an ontology matchable against code at all, and it is why the fragment rather than the
 * label is the term.
 *
 * <p>{@code comments} and {@code versionInfo} are lists because the ontology states them more than once for
 * the same class and every one of those statements is the publisher's. They are the two properties an
 * earlier reading of this document threw away — 1,272 definitions and 949 provenance notes — and a list is
 * the shape that makes throwing one away take an edit rather than an oversight.
 */
public record OwlClass(String concept, String id, String label, String broader, List<String> comments,
        List<String> versionInfo) implements Nested {

    public OwlClass {
        comments = List.copyOf(comments);
        versionInfo = List.copyOf(versionInfo);
    }
}
