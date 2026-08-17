package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.pipeline.ShareDivergence;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;

/**
 * The words this repository chose, ranked by how much more of it they are than of anything it is read
 * against.
 *
 * <p>A count alone cannot answer the question. The words a Java program contains most of are the words every
 * Java program contains most of, and the words a body of prose contains most of are the words English
 * requires, so the top of a raw ranking is the language and the platform rather than the repository. Each
 * word is therefore scored by its term of the Jensen–Shannon divergence between what this repository is
 * written in and what a reference is written in — non-negative, summing to the total, and bounded at one bit
 * by the statistic's own definition.
 *
 * <p><b>A word is ranked by the weakest claim any reference makes for it.</b> Pooling the references would
 * need a weight per reference that nothing states; the weakest claim needs none and errs the only safe way,
 * since a word one reference calls ordinary is ordinary whatever the other says.
 * A word a reference writes more densely than this repository does carries that reference's claim as
 * a negative, so it sorts below every word that survived rather than being removed: nothing here is a gate.
 *
 * <p>Each word also carries whether {@link FunctionWords} places it in the language rather than in this
 * repository's choices. It changes no claim and no place — a reader who wants to know where {@code by} stood
 * is told — and the report shows the two populations apart rather than pooling them.
 */
public final class ChosenWords {

    private final List<ReferenceVocabulary> references;
    private final ShareDivergence divergence;
    private final FunctionWords language;

    public ChosenWords(final List<ReferenceVocabulary> references, final ShareDivergence divergence,
                       final FunctionWords language) {
        this.references = List.copyOf(references);
        this.divergence = divergence;
        this.language = language;
    }

    public static ChosenWords againstEnglishAndThePlatform() {
        return new ChosenWords(List.of(EnglishVocabulary.fromClasspath(), PlatformVocabulary.ofSystem()),
                new ShareDivergence(), FunctionWords.fromClasspath());
    }

    /** What the ranking is read against, which is what a null has to be drawn from to bound it. */
    public List<ReferenceVocabulary> references() {
        return references;
    }

    /** The bar each reference sets against a repository that wrote this much, at this seed. */
    public List<VocabularyNull.Bar> chanceFor(final WrittenWords written, final long seed) {
        return VocabularyNull.seeded(seed).over(written, references);
    }

    /** The strongest claims first, and every word the repository wrote is somewhere in the ranking. */
    public List<ChosenWord> in(final WrittenWords written) {
        final Map<String, Double> here = written.shareByWord();
        return written.words().stream()
                .map(word -> chosen(word, here, written))
                .sorted(Comparator.comparingDouble(ChosenWord::claim).reversed()
                        .thenComparing(Comparator.comparingInt(ChosenWord::occurrences).reversed())
                        .thenComparing(ChosenWord::word))
                .toList();
    }

    private ChosenWord chosen(final String word, final Map<String, Double> here, final WrittenWords written) {
        final List<ChosenWord.ReferenceClaim> claims = references.stream()
                .map(reference -> claim(word, here, reference))
                .toList();
        return new ChosenWord(word, written.occurrencesOf(word), written.namedOccurrencesOf(word),
                claims.stream().mapToDouble(ChosenWord.ReferenceClaim::claim).min().orElse(0.0),
                here.getOrDefault(word, 0.0), claims, written.siteOf(word), language.includes(word));
    }

    private ChosenWord.ReferenceClaim claim(final String word, final Map<String, Double> here,
                                            final ReferenceVocabulary reference) {
        final double there = reference.shareOf(word);
        return new ChosenWord.ReferenceClaim(reference.name(), there,
                divergence.at(word, here, reference.shareByWord()), here.getOrDefault(word, 0.0) > there);
    }
}
