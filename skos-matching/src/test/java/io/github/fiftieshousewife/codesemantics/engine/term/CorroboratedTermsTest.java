package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorroboratedTermsTest {

    private static String asWords(final String label) {
        return String.join(" ", IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("x#" + label, label, "", broader, "class", "x.owl", "", "");
    }

    private static final List<SkosConcept> TAXONOMY = List.of(
            concept("MorphosyntacticCategory", ""),
            concept("Noun", "MorphosyntacticCategory"),
            concept("Verb", "MorphosyntacticCategory"),
            concept("CommonNoun", "Noun"),
            concept("UsageAndFrequencyFeature", ""),
            concept("Preferred", "UsageAndFrequencyFeature"));

    private static final Map<String, Integer> WRITTEN =
            Map.of("Noun", 29, "Verb", 33, "CommonNoun", 3, "Preferred", 1);

    private static final TermIndex PUBLISHED = PublishedTerms
            .publishing("OLiA", "Noun", "Verb", "Preferred", "CommonNoun")
            .stating("Noun", "MorphosyntacticCategory")
            .stating("Verb", "MorphosyntacticCategory")
            .stating("Preferred", "UsageAndFrequencyFeature")
            .stating("CommonNoun", "Noun");

    private static TermIndex corroborated() {
        return CorroboratedTerms.of(PUBLISHED,
                StatedSiblings.of(TaxonomyTree.of(TAXONOMY, WRITTEN, CorroboratedTermsTest::asWords)));
    }

    @Test
    void answersForAOneWordTermTheRepositoryWritesSiblingsOf() {
        assertThat(corroborated().conceptsOf(List.of("Verb"))).extracting(SkosConcept::prefLabel)
                .containsExactly("Verb");
    }

    @Test
    void abstainsOnAOneWordTermAloneInTheBranchItsPublisherPlacedItIn() {
        assertThat(corroborated().conceptsOf(List.of("Preferred")))
                .as("one leaf of a subject a repository otherwise never touches is an English word "
                        + "the taxonomy happens to have claimed")
                .isEmpty();
    }

    @Test
    void admitsATermWrittenInMoreThanOneWordWithoutAskingForCorroboration() {
        final TermIndex alone = CorroboratedTerms.of(
                PublishedTerms.publishing("OLiA", "Common Noun").stating("Common Noun", "Noun"),
                StatedSiblings.of(TaxonomyTree.of(TAXONOMY, Map.of(), CorroboratedTermsTest::asWords)));

        assertThat(alone.conceptsOf(List.of("Common", "Noun")))
                .as("no everyday sentence contains it, which is why term length was worth measuring")
                .hasSize(1);
    }

    @Test
    void leavesEveryStatementAboutThePublicationToThePublication() {
        final TermIndex terms = corroborated();

        assertAll(
                () -> assertThat(terms.source()).isEqualTo("OLiA"),
                () -> assertThat(terms.rung()).isEqualTo(TermRung.WORDS),
                () -> assertThat(terms.longestTerm()).isEqualTo(1),
                () -> assertThat(terms.terms()).contains(List.of("Preferred")),
                () -> assertThat(terms.broaderOf("Preferred")).contains("UsageAndFrequencyFeature"));
    }
}
