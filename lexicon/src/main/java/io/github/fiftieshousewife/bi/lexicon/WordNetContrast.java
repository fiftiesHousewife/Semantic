package io.github.fiftieshousewife.bi.lexicon;

import net.sf.extjwnl.JWNLException;
import net.sf.extjwnl.data.IndexWord;
import net.sf.extjwnl.data.POS;
import net.sf.extjwnl.data.Pointer;
import net.sf.extjwnl.data.PointerTarget;
import net.sf.extjwnl.data.PointerType;
import net.sf.extjwnl.data.Synset;
import net.sf.extjwnl.data.Word;
import net.sf.extjwnl.dictionary.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Reads the contrast relations the WordNet taxonomy states between two words. A shared direct hypernym
 * makes two nouns coordinate sisters — named alternatives within one kind, which the shared synset's own
 * lemmas name — and an antonym pointer in any part of speech makes them declared opposites. A word is
 * never its own sister or opposite, and an unknown word states no relation at all.
 */
final class WordNetContrast {

    /** Above this the taxonomy speaks only in abstractions no category label could carry. */
    private static final int CHAIN_CEILING = 6;

    private final Dictionary dictionary;

    WordNetContrast(final Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    Set<String> sharedHypernyms(final String first, final String second) {
        final String one = written(first);
        final String other = written(second);
        if (one.equals(other)) {
            return Set.of();
        }
        final Map<Long, Synset> parents = new HashMap<>();
        directHypernyms(one).forEach(synset -> parents.putIfAbsent(synset.getOffset(), synset));
        return directHypernyms(other).stream()
                .filter(synset -> parents.containsKey(synset.getOffset()))
                .flatMap(synset -> synset.getWords().stream())
                .map(word -> word.getLemma().replace(' ', '_'))
                .collect(Collectors.toUnmodifiableSet());
    }

    boolean antonymous(final String first, final String second) {
        final String one = written(first);
        final String other = written(second);
        if (one.equals(other)) {
            return false;
        }
        return Stream.of(POS.values()).anyMatch(partOfSpeech -> opposes(partOfSpeech, one, other));
    }

    /** The pair's shared parents and every ancestor above them, one lemma set per level, nearest first. */
    List<Set<String>> sharedHypernymChain(final String first, final String second) {
        final String one = written(first);
        final String other = written(second);
        if (one.equals(other)) {
            return List.of();
        }
        final Map<Long, Synset> parents = new HashMap<>();
        directHypernyms(one).forEach(synset -> parents.putIfAbsent(synset.getOffset(), synset));
        List<Synset> level = directHypernyms(other).stream()
                .filter(synset -> parents.containsKey(synset.getOffset()))
                .collect(Collectors.toMap(Synset::getOffset, synset -> synset, (kept, same) -> kept))
                .values().stream().toList();
        final List<Set<String>> chain = new ArrayList<>();
        while (!level.isEmpty() && chain.size() < CHAIN_CEILING) {
            chain.add(level.stream()
                    .flatMap(synset -> synset.getWords().stream())
                    .map(word -> word.getLemma().replace(' ', '_'))
                    .collect(Collectors.toUnmodifiableSet()));
            level = level.stream()
                    .flatMap(synset -> synset.getPointers(PointerType.HYPERNYM).stream())
                    .map(this::targetSynset)
                    .collect(Collectors.toMap(Synset::getOffset, synset -> synset, (kept, same) -> kept))
                    .values().stream().toList();
        }
        return List.copyOf(chain);
    }

    private List<Synset> directHypernyms(final String word) {
        final IndexWord entry = entry(POS.NOUN, word);
        if (entry == null) {
            return List.of();
        }
        return entry.getSenses().stream()
                .flatMap(sense -> sense.getPointers(PointerType.HYPERNYM).stream())
                .map(this::targetSynset)
                .toList();
    }

    private boolean opposes(final POS partOfSpeech, final String word, final String other) {
        final IndexWord entry = entry(partOfSpeech, word);
        if (entry == null) {
            return false;
        }
        // Synset.getPointers carries the lexical antonym links of every word in the synset alongside the
        // semantic ones, so one traversal reads both kinds of declared opposition.
        return entry.getSenses().stream()
                .flatMap(sense -> sense.getPointers(PointerType.ANTONYM).stream())
                .anyMatch(pointer -> pointsAt(pointer, other));
    }

    private boolean pointsAt(final Pointer pointer, final String lemma) {
        final PointerTarget target = target(pointer);
        final List<Word> words = target instanceof Word word ? List.of(word) : ((Synset) target).getWords();
        return words.stream().anyMatch(word -> word.getLemma().equalsIgnoreCase(lemma));
    }

    private IndexWord entry(final POS partOfSpeech, final String word) {
        try {
            return dictionary.getIndexWord(partOfSpeech, word);
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet lookup failed for \"" + word + "\"", e);
        }
    }

    private Synset targetSynset(final Pointer pointer) {
        try {
            return pointer.getTargetSynset();
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet hypernym traversal failed", e);
        }
    }

    private PointerTarget target(final Pointer pointer) {
        try {
            return pointer.getTarget();
        } catch (final JWNLException e) {
            throw new IllegalStateException("WordNet antonym traversal failed", e);
        }
    }

    /** WordNet writes collocations with spaces where a schema writes underscores. */
    private static String written(final String word) {
        return word.toLowerCase(Locale.ROOT).replace('_', ' ');
    }
}
