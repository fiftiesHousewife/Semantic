package org.fifties.housewife.bi.lexicon.extraction;

/**
 * One named class of an OWL ontology, read to what a taxonomy row needs of it: the identifier it is
 * published under, the name it is published as, the words a reader would say it in, and the class it is
 * stated beneath.
 *
 * <p>{@code id} is the fragment after the {@code #}, which for an ontology of this kind is already an
 * identifier a program would write — {@code AdjectivePhrase}, {@code Determiner}, {@code Acronym}. That is
 * what makes such an ontology matchable against code at all, and it is why the fragment rather than the
 * label is the term.
 */
public record OwlClass(String concept, String id, String label, String broader) implements Nested {
}
