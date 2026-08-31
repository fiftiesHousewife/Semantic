package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.term.ControlTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;

/**
 * The kinds of evidence a reading can answer from, strongest first. The first kind that qualifies answers,
 * and every source of that kind which cleared its bar answers with it.
 *
 * <p><b>Nothing is dropped for coming second.</b> Taking the single best source hides the rest, and the
 * rest are often the ones a reader wants: on jPOS five vocabularies clear the phrase bar and only BIAN
 * places its matched concept under {@code Cards}, which is what the library is. The rungs still back off —
 * a reading answered by a subject scheme is one whose vocabularies said nothing — but the backoff is
 * between rungs and never inside one.
 *
 * <p>It is an ordered list of evidence kinds and not the levels of one hierarchy: a term vocabulary and a
 * subject scheme sit in different published trees. Each rung states its own bar, and none of them is
 * chosen here — the permutation bar, the branch corroboration and the subject null all belong to the
 * readings this reads off.
 *
 * <p><b>The answer descends as far as the evidence supports, and its text is the publisher's.</b> Matching
 * a taxonomy rather than a word list buys exactly one thing — the node reached carries meaning — so a
 * reading that reaches a node and reports only its name has matched a name. The answer is therefore the
 * publisher's own definition of the concept this repository wrote most.
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
public enum AnswerRungs {

    /**
     * A published vocabulary's terms of more than one word.
     *
     * <p><b>Only where a bar was actually formed.</b> Where a vocabulary's counts are small the deals reach
     * nothing at the quantile the field sets, and a bar of zero admits any single match: quickfixj once
     * answered with a linguistic-annotation vocabulary matched once. A bar of zero is the test failing to
     * be made rather than the vocabulary passing it, so the rung declines and the next one answers.
     */
    MATCHED_PHRASES {
        @Override
        List<ExportedAnswer> of(final ReadingExport reading) {
            return reading.taxonomies().stream()
                    .filter(one -> one.bar().chanceExpectedBest() > 0)
                    .sorted(Comparator.comparingDouble((ExportedTaxonomy one) -> one.bar().timesTheBar())
                            .reversed())
                    .map(one -> answer(one, PHRASE, String.format(Locale.ROOT,
                            "%d phrases against the %d a deal of its own words reaches",
                            one.bar().phrases(), one.bar().chanceExpectedBest())))
                    .toList();
        }
    },

    /**
     * The same vocabularies' terms of one word.
     *
     * <p>They carry no permutation bar and do not need a second one: a one-word term is admitted only where
     * the repository writes another concept from the branch its publisher placed it under, which is the
     * corroboration the reading already applies. What corroboration cannot do is separate a vocabulary from
     * chance, so this rung answers only where no vocabulary's phrases could.
     */
    CORROBORATED_TERMS {
        @Override
        List<ExportedAnswer> of(final ReadingExport reading) {
            return reading.taxonomies().stream()
                    .filter(one -> singleWordTerms(one) > 0)
                    .sorted(Comparator.comparingInt(AnswerRungs::singleWordTerms).reversed())
                    .map(one -> answer(one, SINGLE_WORD, String.format(Locale.ROOT,
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
                    .map(AnswerRungs::placed)
                    .flatMap(Optional::stream)
                    .toList();
        }
    };

    private static final String AFTER_THE_PUBLISHER = ":";
    private static final int SINGLE_WORD = 1;
    private static final int PHRASE = 2;

    /** What the reading is about: every source that cleared the bar of the first rung to qualify. */
    public static List<ExportedAnswer> answering(final ReadingExport reading) {
        return Stream.of(values())
                .map(rung -> rung.of(reading))
                .filter(answers -> !answers.isEmpty())
                .findFirst()
                .orElseGet(() -> List.of(ExportedAnswer.NONE));
    }

    abstract List<ExportedAnswer> of(ReadingExport reading);

    private static ExportedAnswer answer(final ExportedTaxonomy vocabulary, final int shortest,
                                         final String qualifiedBy) {
        final Optional<ExportedConcept> answering = answering(vocabulary, shortest);
        return ExportedAnswer.fromATaxonomy(vocabulary.vocabulary(),
                answering.map(ExportedConcept::statedPath).orElseGet(List::of),
                answering.map(AnswerRungs::stated).orElseGet(() -> covers(vocabulary.vocabulary())),
                qualifiedBy, vocabulary.bar().timesTheBar());
    }

    /**
     * One scheme's placement as one answer, and none where neither of its levels stands apart from chance.
     *
     * <p><b>The two levels are one path and not two answers.</b> The archive is the category's stated
     * parent — arXiv puts {@code Audio and Speech Processing} in {@code Electrical Engineering and Systems
     * Science} — so naming both as sibling answers repeats the scheme's name with nothing saying which
     * level each is, which is the answering-by-omission this cascade exists to stop. The category is the
     * answer where it stands apart, with the archive as its path; the archive answers alone where only it
     * does, standing at a path of nothing.
     */
    private static Optional<ExportedAnswer> placed(final ExportedPlacement scheme) {
        if (scheme.category().standsApartFromChance()) {
            return Optional.of(answerOf(scheme, scheme.category(),
                    List.of(scheme.archive().subject())));
        }
        return scheme.archive().standsApartFromChance()
                ? Optional.of(answerOf(scheme, scheme.archive(), List.of()))
                : Optional.empty();
    }

    private static ExportedAnswer answerOf(final ExportedPlacement scheme,
                                           final ExportedPlacement.Level level,
                                           final List<String> statedPath) {
        final double past = level.nearestByChanceBits() - level.divergenceBits();
        return ExportedAnswer.fromASubjectScheme(scheme.scheme(), statedPath, level.subject(),
                String.format(Locale.ROOT, "%.3f bits nearer than chance reached", past), past);
    }

    /**
     * The concept this repository wrote most, of the length the rung qualified on.
     *
     * <p><b>A rung answers with the evidence that cleared its own bar.</b> The phrase bar is computed over
     * terms of more than one word, so answering it with a one-word concept would answer with evidence that
     * never faced it — strata answered {@code Value}, "perceived worth of something", where its phrases say
     * {@code PresentValue} written 1,429 times, and jPOS answered {@code Index} where its phrases say
     * {@code MerchantIdentifier}.
     *
     * <p><b>A defined concept is preferred, and a placed one over an unplaced one.</b> The definition is
     * what reaching a node is worth — a reading that reaches a node and prints its name has matched a name.
     * The placement matters for the same reason and was the later finding: a concept the publisher states
     * nothing above is a concept at the top of the publisher's own tree, and the top of a tree is its most
     * general node. FpML's roots are {@code Message} and {@code Document}, FIBO's include {@code Thing}.
     * Answering with one is <em>blocking</em> — stopping at an internal node when the evidence supports
     * descending — which this cascade already names as its hazard, and a blank placement is the reading
     * saying so out loud. Where the vocabulary matched other branches, one of those answers instead.
     *
     * <p>Occurrences break the tie last, so the rule never prefers a rare defined-and-placed concept to a
     * common one that is equally well stated.
     */
    private static Optional<ExportedConcept> answering(final ExportedTaxonomy vocabulary,
                                                                final int shortest) {
        return vocabulary.concepts().stream()
                .filter(concept -> shortest > SINGLE_WORD
                        ? concept.wordsInTerm() > SINGLE_WORD : concept.wordsInTerm() == SINGLE_WORD)
                .max(Comparator.comparing(AnswerRungs::isDefined)
                        .thenComparing(AnswerRungs::isPlaced)
                        .thenComparing(ExportedConcept::occurrences));
    }

    /** Whether the publisher says what the concept means, which is what reaching it buys. */
    private static boolean isDefined(final ExportedConcept concept) {
        return !concept.definition().isBlank();
    }

    /** Whether the publisher states anything above it, which a concept at the top of its tree does not. */
    private static boolean isPlaced(final ExportedConcept concept) {
        return !concept.placedUnder().isBlank();
    }

    /** The concept named, and what the publisher says it means where it says anything. */
    private static String stated(final ExportedConcept concept) {
        return concept.definition().isBlank()
                ? concept.concept() : concept.concept() + " — " + concept.definition();
    }

    /**
     * What the vocabulary covers, in the words the library states beside it, with the publisher's own name
     * dropped because it is already the source. It answers only where the publisher defines none of the
     * concepts this repository reached, and it says the same thing for every repository that vocabulary
     * fires on, which is why it is the last resort and not the answer.
     */
    private static String covers(final String vocabulary) {
        final String stated = DESCRIPTIONS.getOrDefault(vocabulary, "");
        final int publisher = stated.indexOf(AFTER_THE_PUBLISHER);
        return publisher < 0 ? stated : stated.substring(publisher + 1).strip();
    }

    private static int singleWordTerms(final ExportedTaxonomy vocabulary) {
        return (int) vocabulary.concepts().stream()
                .filter(concept -> concept.wordsInTerm() == SINGLE_WORD)
                .count();
    }

    private static final Map<String, String> DESCRIPTIONS = Stream.concat(
                    Stream.of(MatchedTaxonomies.values())
                            .map(one -> Map.entry(one.index().source(), one.description())),
                    Stream.of(ControlTaxonomies.values())
                            .map(one -> Map.entry(one.index().source(), one.description())))
            .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, Map.Entry::getValue));
}
