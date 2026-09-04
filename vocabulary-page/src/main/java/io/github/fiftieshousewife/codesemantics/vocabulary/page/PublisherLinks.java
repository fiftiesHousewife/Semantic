package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.term.BundledTaxonomies;
import io.github.fiftieshousewife.codesemantics.lexicon.ArxivSubjects;
import io.github.fiftieshousewife.codesemantics.lexicon.CsoSubjects;
import io.github.fiftieshousewife.codesemantics.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.codesemantics.lexicon.PublishedSubjects;

/**
 * Where each bundled publisher publishes, by the name a reading calls it.
 *
 * <p>A reading names its sources as strings — {@code FIBO}, {@code CSO}, {@code arXiv} — because that is
 * what the export carries, so a page turning one into a link has to get back from the name to the
 * publisher. Every vocabulary and every scheme states its own address; this only collects them, so a source
 * added to either enumeration is linked without touching a page.
 *
 * <p>A name neither enumeration states is left unlinked rather than guessed at. A consumer injects its own
 * vocabulary by path and this knows nothing about where that came from.
 */
final class PublisherLinks {

    private final Map<String, String> byName;

    private PublisherLinks(final Map<String, String> byName) {
        this.byName = Map.copyOf(byName);
    }

    static PublisherLinks all() {
        final Map<String, String> byName = new LinkedHashMap<>();
        Stream.of(BundledTaxonomies.values())
                .forEach(one -> byName.put(one.source(), one.publishedAt()));
        Stream.<PublishedSubjects>of(ArxivSubjects.fromClasspath(), OpenAlexTopics.fromClasspath(),
                        CsoSubjects.fromClasspath())
                .forEach(scheme -> byName.put(scheme.scheme(), scheme.publishedAt()));
        return new PublisherLinks(byName);
    }

    /** Where that publisher publishes, and nothing for a name neither enumeration states. */
    Optional<String> of(final String source) {
        return Optional.ofNullable(byName.get(source));
    }
}
