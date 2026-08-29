package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Objects;

/**
 * One source's statement of what a repository is about, and what that rests on. A reading holds one of
 * these per source that cleared the bar of the rung answering it.
 *
 * <p>The reading holds three kinds of evidence and they are not equally good. A published vocabulary's
 * multi-word terms are the strongest: a repository outside a field does not write {@code cap floor} or
 * {@code msg seq num} by accident, and the publisher states what the run means. Its single-word terms are
 * the weakest of the two, because {@code name}, {@code value} and {@code share} are class labels in a
 * finance ontology and everyday words everywhere else. A subject scheme is neither — it publishes prose
 * rather than identifiers, so nothing is matched and the answer is a distance.
 *
 * <p>So the answering rung is the first of those that qualifies, and every source of that rung which
 * cleared its bar states its own answer. A reading that names a subject scheme is a reading whose
 * vocabularies said nothing, which is a fact about the repository worth stating rather than a gap to fill
 * from a weaker source in silence.
 *
 * @param sourceType   what kind of thing answered — a taxonomy of terms, or a scheme of subjects
 * @param source       the publisher, under the name it states
 * @param placedUnder  where the publisher places what answered, kept because a definition read without
 *                     it is a sentence with no field around it: {@code Session} says which part of the
 *                     FIX protocol {@code MsgSeqNum} belongs to. Empty at a root of the taxonomy, and
 *                     empty for a subject scheme, which places a repository rather than a concept
 * @param atTheTopOfItsBranch the last concept the publisher's chain above it reaches. It differs from
 *                     {@code placedUnder} by how deep the publisher's tree is, and that difference is why
 *                     both are here: OLiA states nothing above {@code InflectionTypeFeature} so the two
 *                     read alike, while FIBO states {@code PresentValue} beneath {@code QuantitativeValue}
 *                     beneath {@code Value} and only the top says which part of FIBO it belongs to. Empty
 *                     for a subject scheme
 * @param result       what that publisher says this repository is: its own definition of the concept the
 *                     repository wrote most, or the subject it places the repository nearest to
 * @param qualifiedBy  how it cleared its own bar, in the unit that bar is set in
 */
public record ExportedAnswer(String sourceType, String source, String placedUnder,
                             String atTheTopOfItsBranch, String result, String qualifiedBy) {

    /** What a reading with no qualifying evidence answers. It is a result and not a missing field. */
    public static final ExportedAnswer NONE =
            new ExportedAnswer("nothing", "", "", "", "", "no evidence stood above chance");

    public ExportedAnswer {
        Objects.requireNonNull(sourceType, "sourceType");
        Objects.requireNonNull(source, "source");
        Objects.requireNonNull(placedUnder, "placedUnder");
        Objects.requireNonNull(atTheTopOfItsBranch, "atTheTopOfItsBranch");
        Objects.requireNonNull(result, "result");
        Objects.requireNonNull(qualifiedBy, "qualifiedBy");
    }
}
