package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * One source's statement of what a repository is about, and what that rests on. A reading holds one of
 * these per source that cleared the bar of the normalisation answering it.
 *
 * <p>The reading holds three kinds of evidence and they are not equally good. A published vocabulary's
 * multi-word terms are the strongest: a repository outside a field does not write {@code cap floor} or
 * {@code msg seq num} by accident, and the publisher states what the run means. Its single-word terms are
 * the weakest of the two, because {@code name}, {@code value} and {@code share} are class labels in a
 * finance ontology and everyday words everywhere else. A subject scheme is neither — it publishes prose
 * rather than identifiers, so nothing is matched and the answer is a distance.
 *
 * <p>So the answering normalisation is the first of those that qualifies, and every source of that normalisation which
 * cleared its bar states its own answer. A reading that names a subject scheme is a reading whose
 * vocabularies said nothing, which is a fact about the repository worth stating rather than a gap to fill
 * from a weaker source in silence.
 *
 * <p><b>The two strengths are different quantities and neither is stated in the other's unit.</b> A
 * vocabulary clears a permutation bar and its strength is a multiple of it; a scheme stands a distance in
 * bits nearer than a scheme of chance reaches. A source that cannot speak in a unit leaves that field out
 * rather than writing a zero into it, so a consumer reading {@code timesItsBar} across a reading gets the
 * vocabularies and nothing else.
 *
 * @param sourceType     what kind of thing answered — a taxonomy of terms, or a scheme of subjects
 * @param source         the publisher, under the name it states
 * @param statedPath     every level the publisher states above what answered, broadest first, and where
 *                       it states none, the module it files the concept in. The levels naming the
 *                       publisher's own field are stepped over. Empty where the publisher states
 *                       neither, which FIX does for the rows it places under {@code Common} and files
 *                       in nothing. It is the whole path and not its two ends: FIX places 5,434 of its
 *                       7,170 rows one level down, so the two ends were the same label on those, and
 *                       FIBO states
 *                       {@code Aspect → Value → QuantitativeValue → PresentValue}, where the two ends
 *                       dropped {@code Value}. For a subject scheme it is the archive the category sits in
 * @param result         what that publisher says this repository is: its own definition of the concept the
 *                       repository wrote most, or the subject it places the repository nearest to
 * @param qualifiedBy    how it cleared its own bar, in the unit that bar is set in
 * @param timesItsBar    how many times its own chance bar a vocabulary's phrase count reached, and absent
 *                       for every other source type
 * @param bitsPastChance how much nearer than the nearest subject of a scheme of chance a scheme's
 *                       placement stood, and absent for every other source type
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ExportedAnswer(String sourceType, String source, List<String> statedPath, String result,
                             String qualifiedBy, Double timesItsBar, Double bitsPastChance) {

    static final String TAXONOMY = "taxonomy";
    static final String SCHEME = "subject scheme";
    static final String NOTHING = "nothing";

    /** What a reading with no qualifying evidence answers. It is a result and not a missing field. */
    public static final ExportedAnswer NONE =
            new ExportedAnswer(NOTHING, "", List.of(), "", "no evidence stood above chance", null, null);

    public ExportedAnswer {
        Objects.requireNonNull(sourceType, "sourceType");
        Objects.requireNonNull(source, "source");
        Objects.requireNonNull(result, "result");
        Objects.requireNonNull(qualifiedBy, "qualifiedBy");
        statedPath = List.copyOf(statedPath);
        if (TAXONOMY.equals(sourceType) == (timesItsBar == null)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "a %s answer states timesItsBar=%s, and only a taxonomy has a chance bar to clear",
                    sourceType, timesItsBar));
        }
        if (SCHEME.equals(sourceType) == (bitsPastChance == null)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "a %s answer states bitsPastChance=%s, and only a subject scheme stands a distance",
                    sourceType, bitsPastChance));
        }
    }

    /** A vocabulary's answer, whose strength is a multiple of the bar a deal of its own words reaches. */
    public static ExportedAnswer fromATaxonomy(final String source, final List<String> statedPath,
                                               final String result, final String qualifiedBy,
                                               final double timesItsBar) {
        return new ExportedAnswer(TAXONOMY, source, statedPath, result, qualifiedBy, timesItsBar, null);
    }

    /** A scheme's answer, whose strength is how far inside the chance figure the placement stood. */
    public static ExportedAnswer fromASubjectScheme(final String source, final List<String> statedPath,
                                                    final String result, final String qualifiedBy,
                                                    final double bitsPastChance) {
        return new ExportedAnswer(SCHEME, source, statedPath, result, qualifiedBy, null, bitsPastChance);
    }
}
