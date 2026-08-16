package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.util.Map;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.name.WordRanks;

/**
 * What ordinary English is written in, taken from the bundled frequency list.
 *
 * <p>The list states an ordering and nothing else, so the ordering is what the distribution is derived from:
 * a word contributes {@code 1/rank}, which is the frequency Zipf's law reads off a rank, normalised by the
 * sum over the whole list so that it is a distribution rather than a score. No curve is fitted here and no
 * word is given a weight this project chose.
 *
 * <p>It is the reference that answers the commonest objection to a word count taken over prose. {@code the},
 * {@code of} and {@code that} are the top of any English text ever written, so a repository whose reading is
 * 70% prose reads as being about them; against this they are ordinary and say nothing.
 */
public final class EnglishVocabulary implements ReferenceVocabulary {

    private static final String NAME = "ordinary English";

    private final Map<String, Double> shareByWord;

    public EnglishVocabulary(final WordRanks ranks) {
        final double total = ranks.words().stream().mapToDouble(word -> 1.0 / ranks.rank(word)).sum();
        this.shareByWord = ranks.words().stream()
                .collect(Collectors.toUnmodifiableMap(word -> word, word -> 1.0 / ranks.rank(word) / total));
    }

    public static EnglishVocabulary fromClasspath() {
        return new EnglishVocabulary(WordRanks.fromClasspath());
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public Map<String, Double> shareByWord() {
        return shareByWord;
    }
}
