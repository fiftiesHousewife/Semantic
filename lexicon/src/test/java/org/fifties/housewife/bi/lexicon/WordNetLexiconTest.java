package org.fifties.housewife.bi.lexicon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordNetLexiconTest {

    private final Lexicon lexicon = WordNetLexicon.fromClasspath();

    @Test
    void professionsDenotePeopleAcrossDomains() {
        assertAll(
                () -> assertThat(lexicon.denotesPerson("actor")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("actress")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("writer")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("composer")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("cinematographer")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("comedian")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("director")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("designer")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("judge")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("nurse")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("attorney")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("librarian")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("engineer")).isTrue());
    }

    @Test
    void resolvesAPluralThroughWordNetMorphology() {
        assertAll(
                () -> assertThat(lexicon.denotesPerson("actors")).isTrue(),
                () -> assertThat(lexicon.denotesPerson("writers")).isTrue());
    }

    @Test
    void objectNounsWithRareAgentiveSensesAreNotPeople() {
        assertAll(
                () -> assertThat(lexicon.denotesPerson("trailer")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("container")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("process")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("thriller")).isFalse());
    }

    @Test
    void nonPersonAndUnknownWordsAreNotPeople() {
        assertAll(
                () -> assertThat(lexicon.denotesPerson("footage")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("sound")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("self")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("other")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("number")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("order")).isFalse(),
                () -> assertThat(lexicon.denotesPerson("qzxv")).isFalse());
    }

    @Test
    void abbreviationNounResolvesThroughTheDottedFormsSynset() {
        assertThat(lexicon.abbreviationNoun("aka")).hasValue("alias");
    }

    @Test
    void abbreviationNounRefusesWordsTheDictionaryAlreadyKnows() {
        assertAll(
                () -> assertThat(lexicon.abbreviationNoun("self")).isEmpty(),
                () -> assertThat(lexicon.abbreviationNoun("title")).isEmpty(),
                () -> assertThat(lexicon.abbreviationNoun("id")).isEmpty(),
                () -> assertThat(lexicon.abbreviationNoun("tv")).isEmpty());
    }

    @Test
    void abbreviationNounRefusesTokensWithNoDottedEntry() {
        assertAll(
                () -> assertThat(lexicon.abbreviationNoun("qzx")).isEmpty(),
                () -> assertThat(lexicon.abbreviationNoun("repo")).isEmpty(),
                () -> assertThat(lexicon.abbreviationNoun("stargazer")).isEmpty());
    }

    @Test
    void domainsOfCarriesEverySenseOfAnAmbiguousWord() {
        assertAll(
                () -> assertThat(lexicon.domainsOf("track")).contains("music", "transport", "sport"),
                () -> assertThat(lexicon.domainsOf("score")).contains("sport", "music", "money"),
                () -> assertThat(lexicon.domainsOf("set")).contains("sport", "music", "mathematics"));
    }

    @Test
    void domainsOfSeparatesTheWordsATruncationCouldMean() {
        assertAll(
                () -> assertThat(lexicon.domainsOf("trade")).contains("commerce").doesNotContain("music"),
                () -> assertThat(lexicon.domainsOf("train")).contains("transport").doesNotContain("music"),
                () -> assertThat(lexicon.domainsOf("travel")).contains("tourism").doesNotContain("music"));
    }

    @Test
    void domainsOfReadsSportVocabularyIncludingCollocations() {
        assertAll(
                () -> assertThat(lexicon.domainsOf("tennis")).contains("tennis"),
                () -> assertThat(lexicon.domainsOf("forehand")).contains("tennis"),
                () -> assertThat(lexicon.domainsOf("backhand")).contains("tennis"),
                () -> assertThat(lexicon.domainsOf("double_fault")).contains("tennis"),
                () -> assertThat(lexicon.domainsOf("football")).contains("sport"),
                () -> assertThat(lexicon.domainsOf("league")).contains("sport"));
    }

    @Test
    void domainsOfIgnoresCase() {
        assertThat(lexicon.domainsOf("Track")).isEqualTo(lexicon.domainsOf("track"));
    }

    @Test
    void senseDomainsKeepAWordsMeaningsApart() {
        assertAll(
                () -> assertThat(lexicon.senseDomainsOf("food"))
                        .hasSize(2)
                        .allMatch(sense -> sense.contains("food")),
                () -> assertThat(lexicon.senseDomainsOf("food"))
                        .filteredOn(sense -> sense.contains("chemistry"))
                        .hasSize(1),
                () -> assertThat(lexicon.senseDomainsOf("qzxv")).isEmpty());
    }

    @Test
    void domainsOfIsEmptyForWordsTheResourceDoesNotCover() {
        assertAll(
                () -> assertThat(lexicon.domainsOf("fm")).isEmpty(),
                () -> assertThat(lexicon.domainsOf("listening")).isEmpty(),
                () -> assertThat(lexicon.domainsOf("charting")).isEmpty(),
                () -> assertThat(lexicon.domainsOf("qzxv")).isEmpty());
    }

    @Test
    void lemmasOfADomainCarryItsVocabularyInWrittenForm() {
        assertAll(
                () -> assertThat(lexicon.lemmasOf("tennis"))
                        .contains("forehand", "backhand", "double_fault", "service_break"),
                () -> assertThat(lexicon.lemmasOf("music")).contains("track", "album"),
                () -> assertThat(lexicon.lemmasOf("Tennis")).isEqualTo(lexicon.lemmasOf("tennis")));
    }

    @Test
    void lemmasOfIsEmptyForDomainsTheResourceDoesNotName() {
        assertThat(lexicon.lemmasOf("qzxv")).isEmpty();
    }

    @Test
    void coordinateSistersShareTheHypernymThatNamesTheirKind() {
        assertAll(
                () -> assertThat(lexicon.sharedHypernyms("forehand", "backhand")).contains("return"),
                () -> assertThat(lexicon.sharedHypernyms("forehand_drive", "backhand_drive")).contains("drive"),
                () -> assertThat(lexicon.sharedHypernyms("import", "export")).contains("commodity"),
                () -> assertThat(lexicon.sharedHypernyms("day", "month")).contains("time_unit"));
    }

    @Test
    void wordsOfUnrelatedKindsShareNoHypernym() {
        assertAll(
                () -> assertThat(lexicon.sharedHypernyms("football_hero", "backhand")).isEmpty(),
                () -> assertThat(lexicon.sharedHypernyms("field_hockey", "backhand")).isEmpty(),
                () -> assertThat(lexicon.sharedHypernyms("qzxv", "backhand")).isEmpty());
    }

    @Test
    void aWordIsNotItsOwnSister() {
        assertThat(lexicon.sharedHypernyms("forehand", "forehand")).isEmpty();
    }

    @Test
    void theChainAboveACoordinatePairRunsNearestFirst() {
        final var chain = lexicon.sharedHypernymChain("forehand", "backhand");
        assertAll(
                () -> assertThat(chain.getFirst()).contains("return"),
                () -> assertThat(chain.get(1)).contains("tennis_stroke"),
                () -> assertThat(chain.get(2)).contains("stroke"));
    }

    @Test
    void anUnrelatedPairHasNoChain() {
        assertAll(
                () -> assertThat(lexicon.sharedHypernymChain("football_hero", "backhand")).isEmpty(),
                () -> assertThat(lexicon.sharedHypernymChain("forehand", "forehand")).isEmpty());
    }

    @Test
    void antonymousReadsTheDeclaredOppositionInAnyPartOfSpeech() {
        assertAll(
                () -> assertThat(lexicon.antonymous("forehand", "backhand")).isTrue(),
                () -> assertThat(lexicon.antonymous("backhand", "forehand")).isTrue(),
                () -> assertThat(lexicon.antonymous("first", "second")).isTrue(),
                () -> assertThat(lexicon.antonymous("win", "lose")).isTrue());
    }

    @Test
    void wordsWithoutDeclaredOppositionAreNotAntonymous() {
        assertAll(
                () -> assertThat(lexicon.antonymous("football_hero", "backhand")).isFalse(),
                () -> assertThat(lexicon.antonymous("forehand", "forehand")).isFalse(),
                () -> assertThat(lexicon.antonymous("qzxv", "backhand")).isFalse());
    }

    @Test
    void nounBaseResolvesRegularPlurals() {
        assertAll(
                () -> assertThat(lexicon.nounBase("categories")).contains("category"),
                () -> assertThat(lexicon.nounBase("buses")).contains("bus"),
                () -> assertThat(lexicon.nounBase("boxes")).contains("box"),
                () -> assertThat(lexicon.nounBase("quizzes")).contains("quiz"),
                () -> assertThat(lexicon.nounBase("houses")).contains("house"));
    }

    @Test
    void nounBaseResolvesIrregularPlurals() {
        assertAll(
                () -> assertThat(lexicon.nounBase("children")).contains("child"),
                () -> assertThat(lexicon.nounBase("data")).contains("datum"),
                () -> assertThat(lexicon.nounBase("indices")).contains("index"),
                () -> assertThat(lexicon.nounBase("analyses")).contains("analysis"),
                () -> assertThat(lexicon.nounBase("glasses")).contains("glass"));
    }

    @Test
    void nounBaseKeepsWordsThatAreTheirOwnLemma() {
        assertAll(
                () -> assertThat(lexicon.nounBase("status")).contains("status"),
                () -> assertThat(lexicon.nounBase("gas")).contains("gas"),
                () -> assertThat(lexicon.nounBase("series")).contains("series"),
                () -> assertThat(lexicon.nounBase("address")).contains("address"));
    }

    @Test
    void nounBaseIsEmptyForWordsOutsideTheLexicon() {
        assertAll(
                () -> assertThat(lexicon.nounBase("datasources")).isEmpty(),
                () -> assertThat(lexicon.nounBase("webhooks")).isEmpty(),
                () -> assertThat(lexicon.nounBase("qzxv")).isEmpty());
    }

    @Test
    void baseFormsAnswerForSingleWordsOnlyNeverCompounds() {
        assertAll(
                () -> assertThat(lexicon.nounBase("title_basics")).isEmpty(),
                () -> assertThat(lexicon.nounBase("name basics")).isEmpty(),
                () -> assertThat(lexicon.nounBase("fat_100g")).isEmpty(),
                () -> assertThat(lexicon.verbBase("last_updated")).isEmpty());
    }

    @Test
    void verbBaseResolvesRegularInflections() {
        assertAll(
                () -> assertThat(lexicon.verbBase("created")).contains("create"),
                () -> assertThat(lexicon.verbBase("modified")).contains("modify"),
                () -> assertThat(lexicon.verbBase("logged")).contains("log"),
                () -> assertThat(lexicon.verbBase("running")).contains("run"),
                () -> assertThat(lexicon.verbBase("creates")).contains("create"));
    }

    @Test
    void verbBaseResolvesIrregularInflections() {
        assertAll(
                () -> assertThat(lexicon.verbBase("sent")).contains("send"),
                () -> assertThat(lexicon.verbBase("built")).contains("build"),
                () -> assertThat(lexicon.verbBase("seen")).contains("see"),
                () -> assertThat(lexicon.verbBase("made")).contains("make"),
                () -> assertThat(lexicon.verbBase("written")).contains("write"));
    }

    @Test
    void verbBaseKeepsWordsThatAreTheirOwnLemma() {
        assertAll(
                () -> assertThat(lexicon.verbBase("create")).contains("create"),
                () -> assertThat(lexicon.verbBase("seed")).contains("seed"),
                () -> assertThat(lexicon.verbBase("feed")).contains("feed"),
                () -> assertThat(lexicon.verbBase("name")).contains("name"));
    }

    @Test
    void verbBaseIsEmptyForWordsOutsideTheLexicon() {
        assertAll(
                () -> assertThat(lexicon.verbBase("unsalted")).isEmpty(),
                () -> assertThat(lexicon.verbBase("hundred")).isEmpty(),
                () -> assertThat(lexicon.verbBase("country")).isEmpty(),
                () -> assertThat(lexicon.verbBase("qzxv")).isEmpty());
    }
}
