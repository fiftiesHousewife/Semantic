package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Set;

import io.github.fiftieshousewife.bi.lexicon.WiktionaryTopicHierarchy;

/**
 * What a topic already says by being that topic — every broader subject it generalises to, transitively. A
 * resource that publishes a hierarchy is stating which of its own labels are implied by which, and that is
 * the only thing that can tell a label a word was given from a label derived from it.
 */
@FunctionalInterface
public interface BroaderTopics {

    /** Everything the topic implies, or empty where the hierarchy says nothing about it. */
    Set<String> of(String topic);

    /** The bundled Wiktionary topic hierarchy. */
    static BroaderTopics fromClasspath() {
        final WiktionaryTopicHierarchy hierarchy = WiktionaryTopicHierarchy.fromClasspath();
        return hierarchy::ancestorsOf;
    }
}
