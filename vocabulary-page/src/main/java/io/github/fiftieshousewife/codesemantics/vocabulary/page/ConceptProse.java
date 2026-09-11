package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedConcept;

/**
 * What a page may quote for one matched concept: the publisher's own definition where it states one, and
 * an attributed borrowing where the nearest prose sits at a level above the concept. A summary of
 * {@code public key cryptography} is not a definition of {@code public keys}, and the stated-descriptions
 * measurement found prose from two or more levels up wrong four times in five, so the attribution is part
 * of the quotation and never dropped.
 */
final class ConceptProse {

    private ConceptProse() {
    }

    static String of(final String vocabulary, final ExportedConcept concept) {
        if (!concept.definition().isBlank()) {
            return quoted(concept.definition());
        }
        if (!concept.description().isBlank()) {
            return vocabulary + " states no prose for " + concept.concept()
                    + "; the nearest described level is " + concept.descriptionStatedFor()
                    + ": " + quoted(concept.description());
        }
        return vocabulary + " states no prose for " + concept.concept() + ".";
    }

    private static String quoted(final String prose) {
        return "“" + prose + "”";
    }
}
