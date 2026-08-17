package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.HostTree;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.InjectedTaxonomy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * That a taxonomy written in English is keyed by its words, which is what lets a declared name reach it.
 *
 * <p>The Computer Science Ontology is the case that decides it: it states most of its topics as several
 * English words with spaces between them, and a key holding a space is a token no declared name can equal.
 */
class TaxonomyIsKeyedByWordsTest {

    private static final InjectedTaxonomy CSO =
            InjectedTaxonomy.named(new HostTree().root().resolve("taxonomies/cso-topics.tsv"));

    private static final TermIndex INDEX = InjectedTerms.of(CSO, CSO.source());

    private static final IdentifierWords WORDS = IdentifierWords.fromClasspath();

    @Test
    void keysNoTermUnderATokenHoldingASpace() {
        assertThat(INDEX.terms())
                .allSatisfy(key -> assertThat(key).noneMatch(word -> word.contains(" ")));
    }

    @Test
    void readsALabelOfSeveralEnglishWordsAsThoseWords() {
        assertAll(
                () -> assertThat(WORDS.of("natural language processing").words())
                        .containsExactly("natural", "language", "processing"),
                () -> assertThat(WORDS.of("target language").words())
                        .containsExactly("target", "language"));
    }

    @Test
    void reachesAConceptTheSourceWroteAsTwoWordsFromANameDeclaredAsOne() {
        assertThat(INDEX.conceptsOf(WORDS.of("targetLanguage").words()))
                .extracting(concept -> concept.prefLabel())
                .contains("target language");
    }

    @Test
    void keysMoreTermsAsSeveralWordsThanAsOne() {
        final List<List<String>> keys = List.copyOf(INDEX.terms());

        assertThat(keys.stream().filter(key -> key.size() > 1).count())
                .isGreaterThan(keys.stream().filter(key -> key.size() == 1).count());
    }
}
