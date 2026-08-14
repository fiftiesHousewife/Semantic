package org.fifties.housewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import org.fifties.housewife.bi.lexicon.SkosConcept;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fifties.housewife.codesemantics.engine.term.PublishedTerms.publishing;
import static org.junit.jupiter.api.Assertions.assertAll;

class TermReportTest {

    private static final SkosConcept VERB =
            new SkosConcept("olia#Verb", "Verb", "", "", "class", "olia.owl", "");
    private static final SkosConcept TOPIC =
            new SkosConcept("olia#Topic", "Topic", "", "", "class", "olia.owl", "");

    /** The taxonomy places `Topic` under a branch of its own and states no parent at all for `Verb`. */
    private final StatedAncestry ancestry = new StatedAncestry(
            publishing("OLiA", "verb", "topic")
                    .stating("Topic", "InformationStructure")
                    .stating("InformationStructure", "LinguisticConcept"));

    private final String rendered = new TermReport().render("OLiA", new MatchedTerms(List.of(
            new TermSighting(List.of("verb"), List.of(VERB), TermRung.WORDS, 0.91, 32, "Behaviour.java:20"),
            new TermSighting(List.of("topic"), List.of(TOPIC), TermRung.WORDS, 0.79, 153, "Evidence.java:43")),
            5_000, 300, 200, Map.of(TermRung.WORDS, 200)), 20, ancestry);

    @Test
    void leadsWithTheSplitThePublisherStatesRatherThanWithARate() {
        assertAll(
                () -> assertThat(rendered).contains("The split that decides is where the taxonomy itself "
                        + "puts them"),
                () -> assertThat(rendered).contains("| It states **no parent** — the field's own vocabulary "
                        + "| 1 | 32 | 17.3% |"),
                () -> assertThat(rendered).contains("| It **places** under a branch — English that collides "
                        + "| 1 | 153 | 82.7% |"));
    }

    @Test
    void putsATermTheTaxonomyStatesNoParentForUnderTheFieldsOwnVocabulary() {
        final String own = rendered.substring(rendered.indexOf("## The field's own vocabulary"),
                rendered.indexOf("## Where it collides"));

        assertThat(own).contains("`verb`").doesNotContain("`topic`");
    }

    @Test
    void namesTheBranchAPlacedTermArrivesUnderSoACollisionCanBeSeen() {
        final String collides = rendered.substring(rendered.indexOf("## Where it collides"),
                rendered.indexOf("## How the two sides"));

        assertAll(
                () -> assertThat(collides).contains("`topic`").doesNotContain("`verb`"),
                () -> assertThat(collides)
                        .as("the broadest concept the publisher states above it")
                        .contains("`LinguisticConcept`"));
    }

    @Test
    void leavesTheRungsToOneTableAtTheEnd() {
        final String rungs = rendered.substring(rendered.indexOf("## How the two sides"));

        assertAll(
                () -> assertThat(rungs).contains("| the words themselves | 185 | 2 | 100.0% |"),
                () -> assertThat(rungs).contains("| the dictionary form of each word | 0 | 0 | 0.0% |"),
                () -> assertThat(rungs)
                        .as("a rate per rung and none across them")
                        .contains("the sense the dictionary carries each word in"));
    }

    @Test
    void namesTheConceptTheSourceStatesAndSomewhereToGoAndCheckIt() {
        assertThat(rendered).contains("`Verb`", "`Behaviour.java:20`", "`Evidence.java:43`");
    }
}
