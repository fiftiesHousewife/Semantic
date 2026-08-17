package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class CorroborationReportTest {

    private static String asWords(final String label) {
        return String.join(" ", IdentifierWords.fromClasspath().of(label).words());
    }

    private static SkosConcept concept(final String label, final String broader) {
        return new SkosConcept("olia#" + label, label, "", broader, "class", "olia.owl", "", "");
    }

    private static final List<SkosConcept> TAXONOMY = List.of(
            concept("Constituent", ""),
            concept("Phrase", "Constituent"),
            concept("Clause", "Constituent"),
            concept("PragmaticUnit", ""),
            concept("Topic", "PragmaticUnit"),
            concept("Focus", "PragmaticUnit"));

    private static TermSighting sighting(final String term, final String label, final String broader,
                                         final int occurrences) {
        return new TermSighting(List.of(term.split(" ")), List.of(concept(label, broader)), TermRung.WORDS,
                0.8, occurrences, List.of("Reading.java:1"));
    }

    private static MatchedTerms matching(final TermSighting... sightings) {
        return new MatchedTerms(List.of(sightings), 5_000, 300, 200, Map.of(TermRung.WORDS, 200), Map.of());
    }

    private static final TermSighting TOPIC = sighting("topic", "Topic", "PragmaticUnit", 388);
    private static final TermSighting PHRASE = sighting("phrase", "Phrase", "Constituent", 48);
    private static final TermSighting CLAUSE = sighting("clause", "Clause", "Constituent", 6);

    private static final Map<String, Integer> WRITTEN = Map.of("Topic", 388, "Phrase", 48, "Clause", 6);

    private final TaxonomyTree everyTree = TaxonomyTree.of(TAXONOMY, WRITTEN,
            CorroborationReportTest::asWords);
    private final TaxonomyTree corroboratedTree = TaxonomyTree.of(TAXONOMY, Map.of("Phrase", 48, "Clause", 6),
            CorroborationReportTest::asWords);

    private final String rendered = new CorroborationReport(StatedSiblings.of(everyTree))
            .render(matching(TOPIC, PHRASE, CLAUSE), everyTree, matching(PHRASE, CLAUSE), corroboratedTree);

    @Test
    void putsTheTwoReadingsSideBySideBecauseNeitherCanBeJudgedAlone() {
        assertAll(
                () -> assertThat(rendered).contains("| every match | 442 | 3 | 100.0% | 2 of 2 | "
                        + "`topic`\u00A0388 |"),
                () -> assertThat(rendered).contains("| only where the branch holds more than this one "
                        + "concept | 54 | 2 | 100.0% | 1 of 2 | `phrase`\u00A048 |"));
    }

    @Test
    void namesEveryTermTheBranchRefusedAndTheBranchItStoodAloneIn() {
        assertAll(
                () -> assertThat(rendered).contains("**1 terms**, most-written first"),
                () -> assertThat(rendered)
                        .as("a reader must be able to disagree with a refusal concept by concept")
                        .contains("| `topic` | 388 | `PragmaticUnit` |"),
                () -> assertThat(rendered).doesNotContain("| `phrase` | 48 |"));
    }
}
