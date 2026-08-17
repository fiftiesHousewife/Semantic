package io.github.fiftieshousewife.bi.lexicon;

import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * A dictionary of word meanings and forms, answering questions a name vocabulary cannot: whether a noun
 * denotes a person is a fact about the word's senses, and what a word's base form is turns on irregular
 * morphology no suffix rule can carry ({@code data} → {@code datum}, {@code sent} → {@code send}).
 * Implementations are backed by a bundled lexical database, so consumers stay free of any hand-curated
 * word list.
 */
public interface Lexicon {

    /**
     * Whether the noun's dominant sense denotes a person — an agentive role, profession or kind of human.
     * Judged on how the word is actually used, so that object nouns with rare agentive readings (a
     * "trailer" is almost never someone who trails) do not read as people. Unknown words are not people.
     */
    boolean denotesPerson(String noun);

    /**
     * The noun's dictionary lemma — the singular for a plural in any declension, the word itself when it
     * is already a lemma — or empty when the lexicon does not know the word as a noun at all. Empty means
     * unknown, never unchanged: a caller with its own fallback morphology can tell the two apart.
     */
    Optional<String> nounBase(String word);

    /**
     * The verb's dictionary lemma — the base form for an inflection in any tense, the word itself when it
     * is already a lemma — or empty when the lexicon does not know the word as a verb at all.
     */
    Optional<String> verbBase(String word);

    /**
     * The adjective's dictionary lemma — the positive form for a comparative or superlative in any
     * declension, the word itself when it is already a lemma — or empty when the lexicon does not know the
     * word as an adjective at all.
     *
     * <p>It is the third of the three classes a thing can be named for, beside {@link #nounBase} and
     * {@link #verbBase}. A reading that asks only the first two cannot see {@code broader}, {@code nearest}
     * or {@code canonical} at all.
     */
    Optional<String> adjectiveBase(String word);

    /**
     * The verb the dictionary's own exception list <em>states</em> this surface is an irregular form of, or
     * empty where it states none.
     *
     * <p>It is separate from {@link #verbBase} because the two answer with different authority. A base form
     * is whatever the lexicon's morphology arrived at, and morphology guesses: strip the {@code s} from
     * {@code was} and a caller asking for a noun is handed {@code wa}, which the dictionary does carry.
     * The exception list is a statement — {@code was be}, {@code does do}, {@code has have} — and a caller
     * choosing between parts of speech needs to know which of the two it is looking at.
     */
    Optional<String> statedVerbInflection(String word);

    /**
     * The noun an initialism stands in for, read from the dictionary's own entry for its written-out form:
     * a short token the dictionary does not know as a word, whose letter-dotted spelling it does carry
     * ({@code aka} → {@code a.k.a.}), resolves to the synonym in that entry's sense that is a noun in its
     * own right ({@code alias}). Empty when the token is already a dictionary word — a word is not an
     * abbreviation — or when no dotted entry exists, so a caller never receives a guessed expansion.
     */
    Optional<String> abbreviationNoun(String token);

    /**
     * How many senses the dictionary carries for the word, across every part of speech, or zero when it does
     * not know the word at all. It is the denominator a consumer needs to judge what a sense-labelled
     * resource is actually speaking for: a word with six senses of which one carries a subject label has had
     * one sixth of its meaning classified and five sixths passed over, and a reading that treats that label
     * as the word's subject is quoting the rarest thing the word can mean.
     */
    int senseCount(String word);

    /**
     * The sense the word is most often written in, as the dictionary identifies it, or empty when the
     * dictionary does not know the word at all. It is the normal form two spellings can be compared at —
     * {@code topic} and {@code theme} are one sense and differ as strings — and the choice of which sense is
     * the dictionary's own tagged corpus counts rather than anything decided here. Empty is an abstention:
     * a word nothing was published about is normalised to nothing, never to itself.
     */
    Optional<WordSense> commonestSense(String word);

    /**
     * The topical domains WordNet Domains assigns across the word's senses — {@code music},
     * {@code commerce}, {@code tennis} — or empty when the resource does not cover the word. A domain
     * label describes the subject a sense belongs to, so an ambiguous word carries every subject it can
     * mean and a caller conditions on outside evidence to choose between them. Collocations are looked
     * up in WordNet's own written form ({@code double_fault}). Empty means unknown, never neutral: a
     * word without an entry contributes no domain evidence at all.
     */
    Set<String> domainsOf(String word);

    /**
     * The subjects assigned to the one sense the word is most often written in, or empty where that sense
     * carries none.
     *
     * <p>It is the plan's own stated baseline for disambiguation and it is a different claim from
     * {@link #senseDomainsOf}, which pools every labelled sense equally. Pooling reads a word as its rarest
     * meaning: {@code cite} has eight senses, exactly one of which — being summoned before a court — carries
     * a subject, so a pooled reading says {@code cite} is entirely about law with no evidence that the
     * courtroom sense was ever meant. Asking for the commonest sense instead lets a word whose dominant
     * meaning nothing labelled say <em>nothing</em>, which is the correct outcome and the one a pooled
     * reading cannot reach.
     */
    Set<String> commonestSenseDomains(String word);

    /**
     * The same reading taken of the word's commonest <b>verb</b> sense, for a word the grammar says is being
     * used as one. A method name is a clause and its first word is what the method does, so {@code read} in
     * {@code readRepository} is the verb — whose senses WordNet Domains labels {@code linguistics} and
     * {@code school}, never {@code publishing}, which is what its noun carries. Reading every word as a noun
     * made this repository's most-written verb evidence for the publishing trade.
     */
    Set<String> commonestVerbSenseDomains(String word);

    /**
     * The same reading taken of the word's commonest sense whichever part of speech carries it, by the
     * tagged corpus's own counts. It is the reading for prose: an identifier is a noun phrase and its words
     * are nouns, but a sentence is not, and forcing {@code read} into its noun made a library that reads
     * repositories evidence for the publishing trade.
     */
    Set<String> commonestAnySenseDomains(String word);

    /**
     * The topical domains of each of the word's senses, kept apart. A tally weighting what a word most
     * often means needs the sense structure the union discards: {@code food} carries the food domain in
     * both its senses and chemistry in only one, so food is the more central reading — a fact only the
     * per-sense view can state. Empty when the resource does not cover the word.
     */
    List<Set<String>> senseDomainsOf(String word);

    /**
     * Every word the topical domain claims as its vocabulary — the lemmas whose senses the domain
     * resource tags with the given label, in WordNet's own written form ({@code double_fault}). The
     * reverse of {@link #domainsOf}: where that asks what a word can mean, this asks what words a
     * subject uses, which is what a consumer generating domain-conditioned candidates needs. Empty
     * when the resource does not name the domain.
     */
    Set<String> lemmasOf(String domain);

    /**
     * Every collocation the topical resource labels, in WordNet's own written form
     * ({@code double_fault}). A reading that splits a name into words needs to know which runs of adjacent
     * words this dictionary has an opinion about as runs — {@code break point} is a term the resource
     * labels, where {@code break} and {@code point} beside each other are two words a reading would
     * otherwise have to guess were related.
     */
    Set<String> labelledCollocations();

    /**
     * The names of every kind the dictionary says both nouns directly are — the lemmas of each synset
     * that is a direct hypernym of a sense of each word. A non-empty answer certifies the pair as
     * coordinate sisters, alternatives within one category rather than merely similar words, and the
     * returned lemmas name that category ({@code forehand} and {@code backhand} are each a kind of
     * {@code return}). Collocations are accepted and returned in WordNet's written form
     * ({@code double_fault}). A word is not its own sister, and an unknown word shares nothing.
     */
    Set<String> sharedHypernyms(String first, String second);

    /**
     * Whether the dictionary declares the two words opposites in any part of speech — an antonym link
     * between their senses, the strongest contrast a lexicon can state ({@code forehand} and
     * {@code backhand} carry one in their adjective senses). Symmetric, and a word never opposes
     * itself. Unknown words oppose nothing.
     */
    boolean antonymous(String first, String second);

    /**
     * The taxonomy above a coordinate pair: the lemma sets of the pair's shared direct hypernyms and
     * of every ancestor above them, nearest first, in WordNet's written form. The nearest name is not
     * always the readable one — {@code forehand} and {@code backhand} share {@code return}, a word a
     * reader meets as everything but a stroke, while {@code tennis_stroke} and {@code stroke} stand
     * one and two levels above — so a caller choosing a category name walks the chain and applies its
     * own vote. Empty when the pair shares no hypernym.
     */
    List<Set<String>> sharedHypernymChain(String first, String second);
}
