package io.github.fiftieshousewife.codesemantics.concept;

import java.util.Objects;

/**
 * A concept is a WordNet synset — an offset and a part of speech. It is the unit concepts are counted in
 * because it is the unit the hypernym relation is defined over, and because a shared-hypernym reading
 * intersects offsets rather than lemma names. Counting in lemmas would silently merge {@code bank} the
 * institution with {@code bank} the riverside.
 */
public record ConceptId(long synsetOffset, String partOfSpeech) {

    public ConceptId {
        Objects.requireNonNull(partOfSpeech, "partOfSpeech");
    }

    @Override
    public String toString() {
        return synsetOffset + "-" + partOfSpeech;
    }
}
