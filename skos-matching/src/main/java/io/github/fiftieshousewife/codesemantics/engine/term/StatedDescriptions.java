package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * What a publisher says a concept is, taken from the nearest node at or above it that it says anything about.
 *
 * <p>A label is not a description, and a publisher that describes a branch has described what sits in it.
 * CSO states no prose for {@code public keys} and states {@code public key cryptography} above it, which the
 * article CSO's own {@code owl:sameAs} names is summarised for. Climbing to it follows the publisher's own
 * placement rather than pairing two vocabularies here.
 *
 * <p>The walk is {@link StatedAncestry#pathAbove}, so a level an outright majority of the vocabulary sits
 * beneath is stepped over rather than answered with: CSO puts 80% of its topics under {@code computer
 * science} and FIX 68% of its rows under {@code Common}, and describing a match by one of those says only
 * which vocabulary matched.
 */
public final class StatedDescriptions {

    private final Map<String, String> proseByLabel;

    private final StatedAncestry ancestry;

    public StatedDescriptions(final Map<String, String> proseByLabel, final StatedAncestry ancestry) {
        this.proseByLabel = Map.copyOf(proseByLabel);
        this.ancestry = ancestry;
    }

    /** The prose an index's own rows state, keyed by the label the ancestry walk follows. */
    public static StatedDescriptions over(final TermIndex index, final StatedAncestry ancestry) {
        return over(index.publishedConcepts(), ancestry);
    }

    public static StatedDescriptions over(final List<SkosConcept> published, final StatedAncestry ancestry) {
        return new StatedDescriptions(published.stream()
                .filter(concept -> !concept.definition().isBlank())
                .collect(Collectors.toMap(SkosConcept::prefLabel, SkosConcept::definition,
                        (first, later) -> first)), ancestry);
    }

    /** The nearest description at or above the concept, and nothing where no level of it carries one. */
    public Optional<StatedDescription> of(final String prefLabel) {
        return nearestFirst(prefLabel)
                .filter(proseByLabel::containsKey)
                .findFirst()
                .map(stated -> new StatedDescription(proseByLabel.get(stated), stated));
    }

    /** The concept, then everything the publisher states above it that names more than its own field. */
    private Stream<String> nearestFirst(final String prefLabel) {
        return Stream.concat(Stream.of(prefLabel), ancestry.pathAbove(prefLabel).reversed().stream());
    }
}
