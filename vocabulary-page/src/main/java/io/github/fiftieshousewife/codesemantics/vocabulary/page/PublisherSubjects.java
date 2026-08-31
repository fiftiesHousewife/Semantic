package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.term.ControlTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;

/**
 * What each bundled standard is itself about, by the name a reading calls it.
 *
 * <p>A reading names its sources as strings, so a page turning one into a subject has to get back from
 * the name to the publisher. Every vocabulary states its own, so a vocabulary added to either enumeration
 * is named without touching a page, and one neither enumeration states is left unnamed rather than
 * guessed at.
 */
final class PublisherSubjects {

    private final Map<String, String> byName;

    private PublisherSubjects(final Map<String, String> byName) {
        this.byName = Map.copyOf(byName);
    }

    static PublisherSubjects all() {
        final Map<String, String> byName = new LinkedHashMap<>();
        Stream.of(MatchedTaxonomies.values())
                .forEach(one -> byName.put(one.index().source(), one.subject()));
        Stream.of(ControlTaxonomies.values())
                .forEach(one -> byName.put(one.index().source(), one.subject()));
        return new PublisherSubjects(byName);
    }

    /** What that standard is about, and nothing for a name neither enumeration states. */
    Optional<String> of(final String source) {
        return Optional.ofNullable(byName.get(source));
    }
}
