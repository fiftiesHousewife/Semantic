package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The kinds of evidence a reading can answer from, strongest first. The first kind that qualifies answers,
 * and every source of that kind which cleared its bar answers with it.
 *
 * <p><b>Nothing is dropped for coming second.</b> Taking the single best source hides the rest, and the
 * rest are often the ones a reader wants: on jPOS five vocabularies clear the phrase bar and only BIAN
 * places its matched concept under {@code Cards}, which is what the library is. The kinds still back off —
 * a reading answered by a subject scheme is one whose vocabularies said nothing — but the backoff is
 * between kinds and never inside one.
 *
 * <p>It is an ordered list of evidence kinds and not the levels of one hierarchy: a term vocabulary and a
 * subject scheme sit in different published trees. Each kind states its own bar, and none of them is
 * chosen here — the permutation bar, the branch corroboration and the subject null all belong to the
 * readings this reads off.
 *
 * <p><b>The answer descends as far as the evidence supports, and its text is the publisher's.</b> Matching
 * a taxonomy rather than a word list buys exactly one thing — the node reached carries meaning — so a
 * reading that reaches a node and reports only its name has matched a name. The answer is therefore the
 * publisher's own definition of the concept this repository wrote most, which {@link AnswerFromATaxonomy}
 * chooses for a vocabulary and {@link AnswerFromAScheme} for a subject scheme's placement.
 *
 * <p>Two things were tried above it and both are too general to say anything about a repository. The
 * <em>branch</em> is noise and not descriptive: on jPOS, a card-payment library, FIBO's most-carried branch
 * is {@code Occurrence}, FpML's is {@code Message} and FIX's is {@code Common}, and where a publisher does
 * define one it defines its own plumbing — FIBO's {@code Occurrence} is "happening of an OccurrenceKind".
 * BIAN states no row for {@code Cards} at all. The <em>vocabulary</em> is more general still, and its
 * description is one sentence repeated for every repository it fires on.
 *
 * <p>Stopping there is the failure mode the literature names. Hierarchical classification distinguishes
 * mandatory from non-mandatory leaf-node prediction, and calls it <em>blocking</em> when "the
 * classification stops at an internal node while an oracle would keep propagating the current input
 * downwards" (Cesa and Armano 2016). Answering at the vocabulary is blocking at the root.
 *
 * <p>Where the concept the repository wrote most carries no definition, the next-most-written concept that
 * does answers instead. That is Katz backoff at the answer, which is the arithmetic this plan already runs
 * on: the higher-order unit answers where it has a count, and the lower order receives what it discounts.
 * CSO was the case that needed it on every reading, and needs it less now that its matched topics carry
 * the summary of the article CSO itself names.
 */
public enum EvidenceKinds {

    /**
     * A published vocabulary's terms of more than one word.
     *
     * <p><b>Only where a bar was actually formed.</b> Where a vocabulary's counts are small the deals reach
     * nothing at the quantile the field sets, and a bar of zero admits any single match: quickfixj once
     * answered with a linguistic-annotation vocabulary matched once. A bar of zero is the test failing to
     * be made rather than the vocabulary passing it, so the kind declines and the next one answers.
     */
    MATCHED_PHRASES {
        @Override
        List<ExportedAnswer> of(final ReadingExport reading) {
            return reading.taxonomies().stream()
                    .filter(one -> one.bar().chanceExpectedBest() > 0)
                    .sorted(Comparator.comparingDouble((ExportedTaxonomy one) -> one.bar().bindingMultiple())
                            .reversed())
                    .map(one -> TAXONOMY.of(one, TermLength.PHRASE, String.format(Locale.ROOT,
                            "%d phrases against the %d a deal of its own words reaches, and %d "
                                    + "occurrences against the deals\u2019 %d",
                            one.bar().phrases(), one.bar().chanceExpectedBest(),
                            one.bar().occurrences(), one.bar().occurrencesChanceExpectedBest())))
                    .toList();
        }
    },

    /**
     * The same vocabularies' terms of one word.
     *
     * <p>They carry no permutation bar and do not need a second one: a one-word term is admitted only where
     * the repository writes another concept from the branch its publisher placed it under, which is the
     * corroboration the reading already applies. What corroboration cannot do is separate a vocabulary from
     * chance, so this kind answers only where no vocabulary's phrases could.
     */
    CORROBORATED_TERMS {
        @Override
        List<ExportedAnswer> of(final ReadingExport reading) {
            return reading.taxonomies().stream()
                    .filter(one -> singleWordTerms(one) > 0)
                    .sorted(Comparator.comparingInt(EvidenceKinds::singleWordTerms).reversed())
                    .map(one -> TAXONOMY.of(one, TermLength.SINGLE_WORD, String.format(Locale.ROOT,
                            "%d one-word terms, each written beside another concept of its branch",
                            singleWordTerms(one))))
                    .toList();
        }
    },

    /**
     * A subject scheme's placement, coarsest level first.
     *
     * <p>Nothing is matched here. A scheme states its subjects' subject matter, so the answer is which
     * subject's own statement this repository's vocabulary sits nearest to, and it qualifies where the
     * repository sits nearer to it than to every subject of a scheme of chance.
     */
    PLACED_SUBJECT {
        @Override
        List<ExportedAnswer> of(final ReadingExport reading) {
            return reading.summary().placedIn().stream()
                    .map(SCHEME::of)
                    .flatMap(Optional::stream)
                    .toList();
        }
    };

    private static final AnswerFromATaxonomy TAXONOMY = new AnswerFromATaxonomy();
    private static final AnswerFromAScheme SCHEME = new AnswerFromAScheme();

    /** What the reading is about: every source that cleared the bar of the first kind to qualify. */
    public static List<ExportedAnswer> answering(final ReadingExport reading) {
        return Stream.of(values())
                .map(kind -> kind.of(reading))
                .filter(answers -> !answers.isEmpty())
                .findFirst()
                .orElseGet(() -> List.of(ExportedAnswer.NONE));
    }

    abstract List<ExportedAnswer> of(ReadingExport reading);

    private static int singleWordTerms(final ExportedTaxonomy vocabulary) {
        return (int) vocabulary.concepts().stream()
                .filter(concept -> TermLength.SINGLE_WORD.admits(concept.wordsInTerm()))
                .count();
    }
}
