package io.github.fiftieshousewife.codesemantics.concept;

import java.util.Collection;
import java.util.List;

/**
 * What one stage found about one symbol: the concept votes it cast and the citations that warrant them.
 * {@link #NONE} is how a stage abstains, and abstention carries zero weight rather than a zero-valued vote —
 * a stage with nothing to say must contribute no evidence mass at all, not evidence for nothing.
 */
public record ConceptEvidence(List<ConceptVote> concepts, List<Citation> citations) {

    public static final ConceptEvidence NONE = new ConceptEvidence(List.of(), List.of());

    public ConceptEvidence {
        concepts = List.copyOf(concepts);
        citations = List.copyOf(citations);
    }

    public static ConceptEvidence merge(final Collection<ConceptEvidence> parts) {
        return new ConceptEvidence(
                parts.stream().flatMap(part -> part.concepts().stream()).toList(),
                parts.stream().flatMap(part -> part.citations().stream()).toList());
    }
}
