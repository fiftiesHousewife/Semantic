package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * A subject label and every OpenAlex concept above it, walked through the {@code broader} column the
 * scheme states — a topic rolls up to its subfield, field and domain, so an expected area at any level
 * can be found in the walk. A label the scheme does not state rolls up to nothing.
 */
final class SubjectAncestry {

    private final Map<String, String> labelByConcept;
    private final Map<String, String> broaderByConcept;
    private final Map<String, String> conceptByLabel;

    private SubjectAncestry(final List<SkosConcept> concepts) {
        this.labelByConcept = concepts.stream()
                .collect(Collectors.toMap(SkosConcept::concept, SkosConcept::prefLabel));
        this.broaderByConcept = concepts.stream()
                .collect(Collectors.toMap(SkosConcept::concept, SkosConcept::broader));
        this.conceptByLabel = concepts.stream()
                .collect(Collectors.toMap(SkosConcept::prefLabel, SkosConcept::concept,
                        (earlier, later) -> later));
    }

    static SubjectAncestry fromClasspath() {
        return new SubjectAncestry(OpenAlexTopics.fromClasspath().concepts());
    }

    /** The subject and every label above it, nearest first; empty where the scheme states no such label. */
    List<String> rollUp(final String subject) {
        final List<String> walked = new ArrayList<>();
        String concept = conceptByLabel.getOrDefault(subject, "");
        while (!concept.isEmpty()) {
            walked.add(Objects.requireNonNull(labelByConcept.get(concept),
                    "a broader column names a concept the scheme does not state: " + concept));
            concept = broaderByConcept.getOrDefault(concept, "");
        }
        return walked;
    }
}
