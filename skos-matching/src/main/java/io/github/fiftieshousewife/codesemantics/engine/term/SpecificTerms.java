package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.WorkingJavaRuns;

/**
 * A published source with the runs working Java writes anyway left out, so what is counted against it is the
 * publisher's own vocabulary.
 *
 * <p>It is the second of the two bars a matched term has to clear, and the one nothing here has ever asked.
 * The first is unithood — whether these words are one unit — which a publisher answers by stating the term.
 * The second is termhood — whether that unit belongs to a subject — and a vocabulary cannot answer it about
 * itself, because {@code MimeType} and {@code CapFloor} are both FpML's terms and only one of them is
 * FpML's subject. {@link WorkingJavaRuns} answers it from the corpus.
 *
 * <p><b>It wraps the index, and the index is wrapped before it is dealt.</b> {@link TermOrderNull} takes the
 * observed count and every chance count through a {@link TermIndex}, so a filter anywhere else would apply
 * to one side and not the other. {@code ScrambledTerms.of(SpecificTerms.of(index), draws)} deals the kept
 * vocabulary's own words across the kept vocabulary's own term shapes, which is what the null's
 * exchangeability rests on. Filtering after the deal would shrink the observed count and leave the null
 * where it was, because a dealt run is almost never one the corpus writes.
 *
 * <p><b>A term of one word passes through.</b> The same rule over the word table refuses {@code trade}, so
 * it is not asked there; {@link CorroboratedTerms} is what tests a single word, by requiring the repository
 * to write another concept from the same branch.
 *
 * <p><b>A term the corpus could not be asked about is taken too.</b> The table holds a run only where the
 * reading that pooled it would merge one, and that reading merges only what some publisher states. A term
 * no publisher states was never counted in the corpus, so the table having no row for it says nothing —
 * and a term with no citation about its termhood does not clear a termhood bar. That is abstention rather
 * than a vote of zero: the term is dropped from the observed count and from the deal alike, so neither
 * side of the comparison sees it.
 */
public final class SpecificTerms implements TermIndex {

    private final TermIndex published;
    private final Set<List<String>> kept;

    private SpecificTerms(final TermIndex published, final Set<List<String>> kept) {
        this.published = published;
        this.kept = Collections.unmodifiableSet(kept);
    }

    /**
     * The kept terms, held in their own words' order. Callers walk this set to build an index of their own,
     * so a set whose iteration order the JVM chooses gives a different index on every run.
     */
    public static SpecificTerms of(final TermIndex published, final WorkingJavaRuns corpus) {
        return new SpecificTerms(published, published.terms().stream()
                .filter(term -> isThePublishersOwn(term, corpus))
                .collect(Collectors.toCollection(() -> new TreeSet<>(
                        Comparator.comparing(term -> String.join(" ", term))))));
    }

    /** The source this library bundles the corpus for. */
    public static SpecificTerms of(final TermIndex published) {
        return of(published, WorkingJavaRuns.fromClasspath());
    }

    /** How many of the publisher's terms this index refuses, which a probe reports beside the counts. */
    public int refused() {
        return published.terms().size() - kept.size();
    }

    @Override
    public List<SkosConcept> conceptsOf(final List<String> words) {
        return kept.contains(words) ? published.conceptsOf(words) : List.of();
    }

    @Override
    public Set<List<String>> terms() {
        return kept;
    }

    @Override
    public int longestTerm() {
        return kept.stream().mapToInt(List::size).max().orElse(0);
    }

    @Override
    public boolean reads(final List<String> words) {
        return published.reads(words);
    }

    @Override
    public Optional<String> broaderOf(final String prefLabel) {
        return published.broaderOf(prefLabel);
    }

    @Override
    public String source() {
        return published.source();
    }

    @Override
    public TermRung rung() {
        return published.rung();
    }

    private static boolean isThePublishersOwn(final List<String> term, final WorkingJavaRuns corpus) {
        return isOneWord(term) || wasAskedAndNotFound(term, corpus);
    }

    private static boolean isOneWord(final List<String> term) {
        return term.size() == 1;
    }

    private static boolean wasAskedAndNotFound(final List<String> term, final WorkingJavaRuns corpus) {
        return corpus.canBeAsked(term) && !corpus.writes(term);
    }
}
