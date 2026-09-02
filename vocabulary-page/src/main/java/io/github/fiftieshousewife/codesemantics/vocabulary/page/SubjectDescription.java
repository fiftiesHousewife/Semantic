package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

/**
 * Whether a publisher states prose for any concept it places under a subject.
 *
 * <p>It states nothing about the evidence. Whether a publisher describes a concept is a fact that
 * publisher supplies, alongside the label, and the two are separate facts: BIAN describes all five of
 * the concepts it matched at a mean of 90 words, and CSO describes 133 of 651.
 *
 * <p><b>A subject nobody describes hands a reader its labels back.</b> {@code public keys} is what the
 * repository wrote and CSO says nothing about it; {@code Card Capture} is what the repository wrote and
 * BIAN says in 59 words what it is.
 */
enum SubjectDescription {

    /** Some concept placed under the subject carries prose its publisher states at or above it. */
    DESCRIBED,

    /** No concept placed under the subject carries any. */
    UNDESCRIBED;

    /** Which of the two these concepts are, taking prose stated for a level above as prose. */
    static SubjectDescription of(final List<WrittenConcept> concepts) {
        return concepts.stream().anyMatch(concept -> !concept.description().isBlank())
                ? DESCRIBED : UNDESCRIBED;
    }
}
