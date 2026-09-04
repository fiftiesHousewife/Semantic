package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.term.BundledTaxonomies;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Every term vocabulary the matching enumerates, under the name its publisher states, with the one-line
 * description its entry states and the concepts it publishes — the matched taxonomies first, then the
 * controls, since which is which depends on the repository under reading rather than on the vocabulary.
 */
record BundledVocabularies(String name, String description, List<SkosConcept> published) {

    BundledVocabularies {
        published = List.copyOf(published);
    }

    static List<BundledVocabularies> all() {
        return Stream.of(BundledTaxonomies.values())
                .map(taxonomy -> new BundledVocabularies(taxonomy.source(), taxonomy.description(),
                        taxonomy.publishedConcepts()))
                .toList();
    }
}
