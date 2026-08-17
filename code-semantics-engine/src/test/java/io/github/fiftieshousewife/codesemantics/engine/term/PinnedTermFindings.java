package io.github.fiftieshousewife.codesemantics.engine.term;

import java.nio.file.Path;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.HostTree;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.reading.JavaSourceScopes;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * What the term matcher found when it was pointed at this repository, held in place.
 *
 * <p>OLiA is the taxonomy, and this repository is <em>in its domain</em> — a library of lemmas, senses,
 * phrases and word frequencies is working in linguistic annotation whether or not it says so. That makes
 * these the cheap half of the measurement the matcher exists for: a domain vocabulary must fire on a
 * repository in its domain and not on one outside it, and the first half can be run here with nothing cloned.
 *
 * <p>It is a smoke test and not the measurement. The taxonomy that fits this tree was chosen after reading
 * the tree, which is exactly what the doctrine means by marking your own homework, and the out-of-domain arm
 * — the one that decides — needs repositories this reading was not written for. So these read
 * {@link HostTree} and not the clone {@code -Dcs.clone.dir} names: the terms `phrase` and `common noun` are
 * findings about this codebase, and the whole point of the evaluation set is that they will not hold on the next one.
 */
@Tag("pinned")
class PinnedTermFindings {

    private static final int TERMS_HELD = 100;

    @Test
    void writesTheOntologysOwnTermsAndIsCarriedByTheShortestOfThem() {
        final Path root = new HostTree().root();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final LinguisticTerms terms = LinguisticTerms.fromClasspath();

        final MatchedTerms matched = TermReading.over(terms).of(parsed);
        final StatedSiblings siblings = StatedSiblings.of(treeOf(matched));
        final MatchedTerms corroborated = TermReading.corroboratedBy(terms, siblings).of(parsed);

        final MatchedTerms onWords = matched.at(TermRung.WORDS);
        final MatchedTerms onLemmas = matched.at(TermRung.LEMMAS);
        final MatchedTerms onSenses = matched.at(TermRung.SENSES);
        final List<String> carrying = onWords.byMass(TERMS_HELD).stream().map(TermSighting::term).toList();
        final List<String> longer = onWords.longerThanOneWord().stream().map(TermSighting::term).toList();
        assertAll(
                () -> assertThat(onWords.spansFound())
                        .as("a taxonomy of grammar must fire on a library that reads grammar")
                        .isPositive(),
                () -> assertThat(carrying)
                        .as("this repository declares the ontology's own terms")
                        .contains("phrase", "verb", "noun", "sentence"),
                () -> assertThat(longer)
                        .as("and it declares terms no everyday sentence would contain")
                        .contains("common noun", "base form"),
                () -> assertThat(oneWordShare(onWords))
                        .as("A FINDING, PINNED. In domain, on the repository this reading was developed "
                                + "against, the taxonomy is fired almost entirely by one-word terms — the "
                                + "same shape a finance ontology showed on a repository with no finance in "
                                + "it. The frequency weight narrows the gap and does not close it: `first` "
                                + "carries more than `sentence` does. So the one-word rate is not yet known "
                                + "to discriminate, and only the out-of-domain arm can settle it.")
                        .isGreaterThan(0.9),
                () -> assertThat(longer)
                        .as("A DEFECT, PINNED AND NOW CLOSED. `Collocation` read as col / location because "
                                + "the frequency list does not carry the compound, and it matched only "
                                + "because the ontology's own term broke the same way on the same grammar "
                                + "— a span manufactured by the splitter on both sides of the comparison. "
                                + "The dictionary carries `collocation` whole and the segmenter no longer "
                                + "divides it, so a published term is now met by the word its author wrote "
                                + "or not at all.")
                        .doesNotContain("col location"),
                () -> assertThat(onLemmas.longerThanOneWord()).map(TermSighting::term)
                        .as("A FINDING, PINNED. The dictionary form is the free half of the "
                                + "generalisation: the ontology publishes singulars and a program declares "
                                + "whatever its sentence needed, and `base forms` meeting `BaseForm` is one "
                                + "word inflected rather than a claim about meaning. It is separated from "
                                + "the sense rung so that the sense rung cannot take credit for a plural.")
                        .contains("base forms"),
                () -> assertThat(oneWordShare(onSenses))
                        .as("A FINDING, PINNED, AND IT REFUSES THE RUNG AS SPECIFIED. Normalising both "
                                + "sides to WordNet's most frequent sense was queued because it is where "
                                + "`lemma` could meet `BaseForm` and `article` could meet `Determiner`. It "
                                + "buys neither: WordNet holds no entry for `base form` at all, and it "
                                + "makes `article` a piece of prose and `determiner` a conclusive argument, "
                                + "so both examples fail before any code runs. What it does buy on this "
                                + "tree is every span but one a single word long — `subject` and `theme` reading as "
                                + "`Topic`, `cite` as `Referring`, `place` and `put` as `Set`, `sum` as "
                                + "`Amount`, `auto` as `Automobile` — against a design whose whole premise "
                                + "is that the multi-word term is the signal. The rung stays, reported "
                                + "apart and voting on nothing, because the figure is the argument for "
                                + "refusing it.")
                        .isGreaterThan(0.99),
                () -> assertThat(onSenses.byMass(TERMS_HELD)).map(TermSighting::term)
                        .as("A FINDING, PINNED. The sense rung's largest gain is this repository's own "
                                + "measured artefact arriving by a second route: `topic`, `theme` and "
                                + "`subject` are one WordNet entry, which is what already puts `music` "
                                + "under everything the theme reading says. A term matcher exists so that "
                                + "a match needs no English in between, and this rung puts the English "
                                + "back.")
                        .contains("subject", "theme"),
                () -> assertThat(oneWordShare(corroborated.at(TermRung.WORDS)))
                        .as("WHAT THE CORROBORATION HAD TO DO. Requiring the branch to hold more than the "
                                + "one concept must move the share the whole design turns on, or it is a "
                                + "rule the data does not need.")
                        .isLessThan(oneWordShare(onWords)),
                () -> assertThat(largestTerm(corroborated))
                        .as("WHAT SETTLES IT. `topic` is OLiA's information structure and this "
                                + "repository's subject label in a distribution. A reading whose headline "
                                + "number is one ambiguous word repeated is not reading a taxonomy.")
                        .isNotEqualTo("topic"));
    }

    @Test
    void placesTheOrdinaryEnglishItMatchedDeeperThanTheFieldsOwnVocabulary() {
        final Path root = new HostTree().root();
        final ParsedRepository parsed = ParsedRepository.of(root, new JavaSourceScopes().under(root));
        final LinguisticTerms terms = LinguisticTerms.fromClasspath();

        final MatchedTerms every = TermReading.over(terms).of(parsed);
        final TaxonomyTree everyTree = treeOf(every);
        final TaxonomyTree corroborated =
                treeOf(TermReading.corroboratedBy(terms, StatedSiblings.of(everyTree)).of(parsed));
        final StatedDepth depth = StatedDepth.of(everyTree);
        final WrittenByDepth admitted = WrittenByDepth.of(corroborated.writtenHere(), depth);
        final WrittenByDepth refused = WrittenByDepth.of(everyTree.writtenHere().stream()
                .filter(node -> corroborated.writtenHere().stream()
                        .noneMatch(kept -> kept.label().equals(node.label())))
                .toList(), depth);

        assertAll(
                () -> assertThat(refused.meanRungPerConcept())
                        .as("A PREDICTION, REFUTED, AND THE ARM IT WAS THE WHOLE OF. The depth arm expected "
                                + "a term that means something to a field to sit deep in that field's "
                                + "hierarchy and an ordinary English word the field happens to have claimed "
                                + "to sit near a root, so depth would separate the two with no word listed. "
                                + "It separates them the other way round: what the branch rule refused sits "
                                + "deeper than what it admitted, on this tree and on the one out-of-domain "
                                + "member read so far. OLiA's deep chains are its discourse relations and "
                                + "its named entities, both made of ordinary English, and the morphosyntax "
                                + "a program writing about grammar declares stands one rung down because "
                                + "OLiA states no named parent for it.")
                        .isGreaterThan(admitted.meanRungPerConcept()),
                () -> assertThat(depth.below("Result"))
                        .as("THE FOUR MATCHES THE ARM WAS WRITTEN ABOUT. `Result`, `Object`, `Exception` "
                                + "and `String` were said to share the property of sitting near the roots. "
                                + "Three of the four sit below the median rung and `Result` is as deep as "
                                + "this taxonomy goes, so the shared property was never depth.")
                        .isGreaterThan(depth.below("Verb")),
                () -> assertThat(admitted.at(1).spans())
                        .as("Where the field's own vocabulary sits. `Verb`, `Noun`, `Token`, `Clause`, "
                                + "`Phrase` and `Diacritic` are all one rung down, which is the rung a "
                                + "depth weight would have discounted hardest.")
                        .isPositive());
    }

    private static TaxonomyTree treeOf(final MatchedTerms matched) {
        return TaxonomyTree.of(OliaTerms.fromClasspath().concepts(), writtenByConcept(matched),
                label -> String.join(" ", IdentifierWords.fromClasspath().of(label).words()));
    }

    /** How often the repository wrote each concept, by the label the taxonomy states it under. */
    private static Map<String, Integer> writtenByConcept(final MatchedTerms matched) {
        final Map<String, Integer> written = new HashMap<>();
        matched.sightings().forEach(sighting -> sighting.concepts().forEach(concept ->
                written.merge(concept.prefLabel(), sighting.occurrences(), Integer::sum)));
        return written;
    }

    private static double oneWordShare(final MatchedTerms matched) {
        return matched.spansByLength().getOrDefault(1, 0) / (double) matched.spansFound();
    }

    private static String largestTerm(final MatchedTerms matched) {
        return matched.sightings().stream()
                .max(Comparator.comparingInt(TermSighting::occurrences))
                .map(TermSighting::term).orElse("");
    }
}
