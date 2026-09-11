package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.term.BundledTaxonomies;

/**
 * One term vocabulary's answer: the concept this repository wrote most, of the length the kind qualified
 * on, under the publisher's own definition of it.
 */
final class AnswerFromATaxonomy {

    private static final String AFTER_THE_PUBLISHER = ":";

    private static final Map<String, String> DESCRIPTIONS = Stream.of(BundledTaxonomies.values())
            .map(one -> Map.entry(one.source(), one.description()))
            .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, Map.Entry::getValue));

    ExportedAnswer of(final ExportedTaxonomy vocabulary, final TermLength length,
                      final String qualifiedBy) {
        final Optional<ExportedConcept> answering = answering(vocabulary, length);
        return ExportedAnswer.fromATaxonomy(vocabulary.vocabulary(),
                answering.map(ExportedConcept::statedPath).orElseGet(List::of),
                answering.map(ExportedConcept::concept).orElse(""),
                answering.isPresent()
                        ? statedOrNothing(answering.get().definition())
                        : statedOrNothing(covers(vocabulary.vocabulary())),
                qualifiedBy, vocabulary.bar().timesTheBar());
    }

    /** The prose where the publisher states any, and an absent field rather than an empty one where not. */
    private static String statedOrNothing(final String prose) {
        return prose.isBlank() ? null : prose;
    }

    /**
     * The concept this repository wrote most, of the length the kind qualified on.
     *
     * <p><b>A kind answers with the evidence that cleared its own bar.</b> The phrase bar is computed over
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
     * descending — which the cascade already names as its hazard, and a blank placement is the reading
     * saying so out loud. Where the vocabulary matched other branches, one of those answers instead.
     *
     * <p>Occurrences break the tie last, so the rule never prefers a rare defined-and-placed concept to a
     * common one that is equally well stated.
     */
    private static Optional<ExportedConcept> answering(final ExportedTaxonomy vocabulary,
                                                       final TermLength length) {
        return vocabulary.concepts().stream()
                .filter(concept -> length.admits(concept.wordsInTerm()))
                .max(Comparator.comparing(AnswerFromATaxonomy::isDefined)
                        .thenComparing(AnswerFromATaxonomy::isPlaced)
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
}
