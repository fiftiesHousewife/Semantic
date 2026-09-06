package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

import io.github.fiftieshousewife.codesemantics.engine.term.BundledTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.InjectedTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;
import io.github.fiftieshousewife.codesemantics.engine.theme.InjectedTaxonomy;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class JudgedFieldTest {

    @Test
    void theDefaultFieldIsTheBundledSetWhereTheClasspathProvidesNothing() {
        assertThat(ExportedReading.vocabulariesBesidesOlia())
                .extracting(TermIndex::source)
                .containsExactlyElementsOf(Stream.of(BundledTaxonomies.values())
                        .filter(taxonomy -> taxonomy != BundledTaxonomies.OLIA)
                        .map(BundledTaxonomies::source)
                        .toList());
    }

    @Test
    void refusesAFieldWhereTwoVocabulariesStateOneSourceName() {
        assertThatThrownBy(() -> JudgedTaxonomies.refusingASharedSource(
                List.of(named("Atlas fixture"), named("Atlas fixture"))))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Atlas fixture");
    }

    @Test
    void passesAFieldWhereEverySourceNameIsItsOwn() {
        final List<TermIndex> field = List.of(named("Atlas fixture"), named("Zebra fixture"));

        assertThat(JudgedTaxonomies.refusingASharedSource(field)).isEqualTo(field);
    }

    private static TermIndex named(final String source) {
        final SkosConcept concept = new SkosConcept("map projection", "MapProjection", "", "", "terms",
                "", "", "");
        return InjectedTerms.of(InjectedTaxonomy.of(List.of(concept), source), source);
    }
}
