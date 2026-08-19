package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Every word the ranking read and the reading does not report, with the rule that removed each.
 *
 * <p><b>Two rules, two lists.</b> A word below a reference's bar and a word English supplies are removed for
 * different reasons and the second cleared every bar. The export pools them into one count, so the figure it
 * calls <em>words below every threshold</em> includes words below none.
 *
 * <p>{@link ChosenWord#clears} answers whether a word stands, and answering it costs the reason: a count of
 * words below every threshold says how many were cut and never which, nor by how much, nor by which of the
 * references. All three are already computed per word and thrown away at the comparison.
 *
 * <p>Ordered by the share of the repository each word holds, so the largest thing the reading does not report
 * reads first.
 */
public final class RefusedWords {

    /** The ranked words that cleared no bar, each naming only the references that refused it. */
    public List<RefusedWord> in(final List<ChosenWord> ranked, final Map<String, Double> barByReference) {
        return ranked.stream()
                .filter(word -> !word.clears(barByReference))
                .map(word -> refused(word, barByReference))
                .sorted(Comparator.comparingDouble(RefusedWord::share).reversed()
                        .thenComparing(RefusedWord::word))
                .toList();
    }

    /**
     * The ranked words every reference admitted and the reading still leaves out, because two published
     * resources place them inside the language. Ordered like the refusals, by the share each holds.
     */
    public List<SuppliedWord> suppliedByTheLanguage(final List<ChosenWord> ranked,
                                                    final Map<String, Double> barByReference) {
        return ranked.stream()
                .filter(ChosenWord::theLanguages)
                .filter(word -> word.clears(barByReference))
                .map(word -> new SuppliedWord(word.word(), word.occurrences(), word.share(), word.site()))
                .sorted(Comparator.comparingDouble(SuppliedWord::share).reversed()
                        .thenComparing(SuppliedWord::word))
                .toList();
    }

    private static RefusedWord refused(final ChosenWord word, final Map<String, Double> barByReference) {
        return new RefusedWord(word.word(), word.occurrences(), word.share(), word.site(),
                word.against().stream()
                        .filter(claim -> claim.claim() <= barByReference.get(claim.reference()))
                        .map(claim -> new RefusedWord.Refusal(claim.reference(), claim.claim(),
                                barByReference.get(claim.reference())))
                        .toList());
    }
}
