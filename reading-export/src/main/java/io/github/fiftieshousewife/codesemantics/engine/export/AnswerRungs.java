package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.term.ControlTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.MatchedTaxonomies;

/**
 * The kinds of evidence a reading can answer from, strongest first. The first that qualifies answers, and
 * the rest are published beneath it.
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
 * <p>Where the concept the repository wrote most carries no definition — CSO defines none of its topics —
 * the next-most-written concept that does answers instead. That is Katz backoff at the answer, which is the
 * arithmetic this plan already runs on: the higher-order unit answers where it has a count, and the lower
 * order receives what it discounts.
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
        Optional<ExportedAnswer> of(final ReadingExport reading) {
            return reading.taxonomies().stream()
                    .filter(one -> one.bar().chanceExpectedBest() > 0)
                    .max(Comparator.comparingDouble(one -> one.bar().timesTheBar()))
                    .map(one -> answer(one, String.format(Locale.ROOT,
                            "%d phrases against the %d a deal of its own words reaches",
                            one.bar().phrases(), one.bar().chanceExpectedBest())));
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
        Optional<ExportedAnswer> of(final ReadingExport reading) {
            return reading.taxonomies().stream()
                    .filter(one -> singleWordTerms(one) > 0)
                    .max(Comparator.comparingInt(AnswerRungs::singleWordTerms))
                    .map(one -> answer(one, String.format(Locale.ROOT,
                            "%d one-word terms, each written beside another concept of its branch",
                            singleWordTerms(one))));
        }
    },

    /**
     * A subject scheme's placement, coarsest level first.
     *
     * <p>Nothing is matched here. A scheme publishes prose, so the answer is which subject's own
     * description this repository's vocabulary sits nearest to, and it qualifies where the repository sits
     * nearer to it than to every subject of a scheme of chance.
     */
    PLACED_SUBJECT {
        @Override
        Optional<ExportedAnswer> of(final ReadingExport reading) {
            return reading.summary().placedIn().stream()
                    .flatMap(scheme -> Stream.of(scheme.archive(), scheme.category())
                            .filter(ExportedPlacement.Level::standsApartFromChance)
                            .findFirst()
                            .map(level -> new ExportedAnswer(SCHEME, scheme.scheme(), "", level.subject(),
                                    String.format(Locale.ROOT, "%.3f bits nearer than chance reached",
                                            level.nearestByChanceBits() - level.divergenceBits())))
                            .stream())
                    .findFirst();
        }
    };

    private static final String TAXONOMY = "taxonomy";
    private static final String SCHEME = "subject scheme";
    private static final String AFTER_THE_PUBLISHER = ":";
    private static final String SEVERAL_PARENTS = "|";
    private static final int SINGLE_WORD = 1;

    /** What the reading is about, from the first rung that qualifies. */
    public static ExportedAnswer answering(final ReadingExport reading) {
        return Stream.of(values())
                .map(rung -> rung.of(reading))
                .flatMap(Optional::stream)
                .findFirst()
                .orElse(ExportedAnswer.NONE);
    }

    abstract Optional<ExportedAnswer> of(ReadingExport reading);

    private static ExportedAnswer answer(final ExportedTaxonomy vocabulary, final String qualifiedBy) {
        final Optional<ExportedTaxonomy.Concept> answering = answering(vocabulary);
        return new ExportedAnswer(TAXONOMY, vocabulary.vocabulary(),
                answering.map(ExportedTaxonomy.Concept::placedUnder).map(AnswerRungs::firstOf).orElse(""),
                answering.map(concept -> concept.concept() + " — " + concept.definition())
                        .orElseGet(() -> covers(vocabulary.vocabulary())),
                qualifiedBy);
    }

    /** A publisher naming several parents at once is taken at the first, because a path is one answer. */
    private static String firstOf(final String stated) {
        return stated.contains(SEVERAL_PARENTS)
                ? stated.substring(0, stated.indexOf(SEVERAL_PARENTS)).strip()
                : stated.strip();
    }

    /**
     * What the publisher says the concept this repository wrote most means, the concept named before it.
     *
     * <p>A concept the publisher defines nothing for is passed over for the next one it wrote, rather than
     * reported as a bare name: the definition is the whole of what reaching a node is worth. Where the
     * vocabulary defines none of what was matched — CSO defines none of its topics — what the vocabulary
     * covers is the most the publishers say, and that is stated as the vocabulary's own scope.
     */
    private static Optional<ExportedTaxonomy.Concept> answering(final ExportedTaxonomy vocabulary) {
        return vocabulary.concepts().stream()
                .filter(concept -> !concept.definition().isBlank())
                .max(Comparator.comparingInt(ExportedTaxonomy.Concept::occurrences));
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
