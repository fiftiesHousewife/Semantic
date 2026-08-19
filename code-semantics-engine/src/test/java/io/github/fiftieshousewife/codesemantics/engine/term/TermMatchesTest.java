package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermMatchesTest {

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("http://purl.org/olia/olia.owl#" + label, label, "", broader, "class", "olia",
                "what the publisher says it means", "");
    }

    private static TermSighting sighting(final List<String> words, final TermRung rung,
                                         final double specificity, final int occurrences,
                                         final SkosConcept... concepts) {
        return new TermSighting(words, List.of(concepts), rung, specificity, occurrences,
                List.of("lexicon/src/main/java/Reading.java:9"));
    }

    private static MatchedTerms terms(final TermSighting... sightings) {
        return new MatchedTerms(List.of(sightings), 900, 40, 12, Map.of(TermRung.WORDS, 12), Map.of());
    }

    private static CorroboratedReading reading(final MatchedTerms every, final MatchedTerms matched) {
        return new CorroboratedReading(every, matched, TaxonomyTree.of(List.of(), Map.of(), label -> label),
                TaxonomyTree.of(List.of(), Map.of(), label -> label),
                StatedSiblings.of(TaxonomyTree.of(List.of(), Map.of(), label -> label)));
    }

    private final TermMatches matches = new TermMatches();

    @Test
    void carriesEveryAdmittedTermWithTheRungItWasFoundAt() {
        final TermSighting verb = sighting(List.of("verb"), TermRung.WORDS, 0.8, 20,
                concept("Verb", "WordClass"));

        final List<TermMatch> read = matches.of("OLiA", reading(terms(verb), terms(verb)));

        assertAll(
                () -> assertThat(read).hasSize(1),
                () -> assertThat(read.getFirst().term()).isEqualTo("verb"),
                () -> assertThat(read.getFirst().vocabulary()).isEqualTo("OLiA"),
                () -> assertThat(read.getFirst().rung()).isEqualTo(TermRung.WORDS),
                () -> assertThat(read.getFirst().wordsInTerm()).isEqualTo(1),
                () -> assertThat(read.getFirst().occurrences()).isEqualTo(20),
                () -> assertThat(read.getFirst().concepts()).containsExactly("Verb"),
                () -> assertThat(read.getFirst().sites())
                        .containsExactly("lexicon/src/main/java/Reading.java:9"),
                () -> assertThat(read.getFirst().outcome()).isEqualTo(TermOutcome.REPORTED));
    }

    @Test
    void carriesATermTheBranchRuleRemovedAndSaysWhichRuleRemovedIt() {
        final TermSighting verb = sighting(List.of("verb"), TermRung.WORDS, 0.8, 20,
                concept("Verb", "WordClass"));
        final TermSighting source = sighting(List.of("source"), TermRung.WORDS, 0.4, 188,
                concept("Source", "TextStructuralUnit"));

        final List<TermMatch> read = matches.of("OLiA", reading(terms(verb, source), terms(verb)));

        assertAll(
                () -> assertThat(read).hasSize(2),
                () -> assertThat(read).filteredOn(match -> match.term().equals("source"))
                        .singleElement()
                        .extracting(TermMatch::outcome).isEqualTo(TermOutcome.REFUSED_BY_BRANCH_RULE),
                () -> assertThat(read).filteredOn(match -> match.term().equals("verb"))
                        .singleElement()
                        .extracting(TermMatch::outcome).isEqualTo(TermOutcome.REPORTED));
    }

    @Test
    void keepsOneTermFoundAtTwoRungsAsTwoMatches() {
        final TermSighting written = sighting(List.of("phrase"), TermRung.WORDS, 0.7, 10,
                concept("Phrase", "SyntacticUnit"));
        final TermSighting lemmatised = sighting(List.of("phrases"), TermRung.LEMMAS, 0.7, 4,
                concept("Phrase", "SyntacticUnit"));

        final List<TermMatch> read = matches.of("OLiA",
                reading(terms(written, lemmatised), terms(written, lemmatised)));

        assertAll(
                () -> assertThat(read).hasSize(2),
                () -> assertThat(read).extracting(TermMatch::rung)
                        .containsExactlyInAnyOrder(TermRung.WORDS, TermRung.LEMMAS));
    }

    @Test
    void reportsATermRefusedAtOneRungAndAdmittedAtAnotherAsBoth() {
        final TermSighting written = sighting(List.of("result"), TermRung.WORDS, 0.6, 8,
                concept("Cause", "SemanticRelation"));
        final TermSighting sensed = sighting(List.of("result"), TermRung.SENSES, 0.6, 8,
                concept("Cause", "SemanticRelation"));

        final List<TermMatch> read = matches.of("OLiA", reading(terms(written), terms(sensed)));

        assertAll(
                () -> assertThat(read).hasSize(2),
                () -> assertThat(read).filteredOn(match -> match.rung() == TermRung.WORDS)
                        .singleElement()
                        .extracting(TermMatch::outcome).isEqualTo(TermOutcome.REFUSED_BY_BRANCH_RULE),
                () -> assertThat(read).filteredOn(match -> match.rung() == TermRung.SENSES)
                        .singleElement()
                        .extracting(TermMatch::outcome).isEqualTo(TermOutcome.REPORTED));
    }

    @Test
    void ordersByWhatEachMatchIsWorthSoTheFileReadsInTheOrderThatDecidesTheAnswer() {
        final TermSighting rare = sighting(List.of("hypotaxis"), TermRung.WORDS, 0.9, 3,
                concept("Hypotaxis", "DiscourseRelation"));
        final TermSighting common = sighting(List.of("name"), TermRung.WORDS, 0.2, 400,
                concept("Name", "TextUnit"));

        final List<TermMatch> read = matches.of("OLiA",
                reading(terms(rare, common), terms(rare, common)));

        assertThat(read).extracting(TermMatch::term).containsExactly("name", "hypotaxis");
    }
}
