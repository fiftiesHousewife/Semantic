package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.github.fiftieshousewife.codesemantics.engine.export.SetAside;

/**
 * One published reading as the comparison page draws it: the repository, every source that answered with
 * the strength it answered at, and the figures that belong to the reading rather than to one answer.
 *
 * <p>Nothing is computed here that the reading does not carry, save the stated area, which comes from a
 * manifest the caller names.
 *
 * @param repository         the tree the reading was taken of
 * @param sourceType         the normalisation that answered — every answer of one reading comes from it
 * @param answers            every source that cleared that normalisation's bar, strongest first
 * @param citableShare       the share of word occurrences some bundled resource could be cited for
 * @param statedArea         the area a manifest states for this repository, absent where it states none
 * @param reachedItsArea     whether the reading's placement descends from that area, absent with the area
 * @param about              what the standards that answered are themselves about, strongest first —
 *                           {@code derivatives} for FpML, {@code linguistic annotation} for OLiA,
 *                           {@code financial information exchange} for FIX. A repository writing
 *                           {@code MsgSeqNum} is doing financial information exchange and the identifier
 *                           says so to nobody, so this is the frame that makes the concepts readable. It
 *                           stands above them and never in place of them: answering at the vocabulary is
 *                           the blocking the answering cascade refuses. A subject an outright majority of
 *                           the readings drawn name is left out and the list is empty where every answer
 *                           came from one
 * @param subjects           what the repository is about: every subject its publishers place its matched
 *                           phrases under, pooled across the answering vocabularies, ordered by how much
 *                           of the repository the publisher describes there
 * @param placedIn           where every subject scheme places the repository, at the levels that stand
 *                           apart from chance
 * @param belowTheirChanceBar every vocabulary the reading matched and set aside for failing its bar, each
 *                           with the count it reached and the count a deal of its own words reaches. The
 *                           refusal is a measurement and the page states it as one
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record DrawnReading(String repository, String sourceType, List<String> about,
                           List<DrawnAnswer> answers, List<Subject> subjects, List<Placement> placedIn,
                           double citableShare, String statedArea, Boolean reachedItsArea,
                           List<SetAside.RefusedVocabulary> belowTheirChanceBar) {

    public DrawnReading {
        about = List.copyOf(about);
        answers = List.copyOf(answers);
        subjects = List.copyOf(subjects);
        placedIn = List.copyOf(placedIn);
        belowTheirChanceBar = List.copyOf(belowTheirChanceBar);
    }

    /**
     * Where one subject scheme places the repository, at the levels that stand apart from chance.
     *
     * <p><b>A placement is drawn beside the matched subjects and never among them.</b> Nothing is matched
     * here: a scheme publishes prose rather than identifiers, so the repository's vocabulary is diverged
     * against each subject's own description and the answer is a distance. That is weaker evidence than a
     * publisher stating that a run of words this repository actually wrote is a term of its field, and
     * the two are headed apart so a reader is not invited to weigh them as one.
     *
     * <p>It is drawn all the same, because a scheme names a subject in ordinary English where a
     * vocabulary names an identifier. This repository writes {@code BaseForm}, which says nothing to a
     * reader; OpenAlex places it under <em>Artificial Intelligence</em> and arXiv under
     * <em>Computation and Language</em>, which say a great deal.
     *
     * @param scheme   the scheme, under the name it states
     * @param archive  its broadest grouping, empty where that level did not stand apart from chance
     * @param category the single subject it places the repository nearest to, empty on the same rule
     */
    public record Placement(String scheme, String archive, String category) {
    }

    /**
     * One subject a publisher places some of this repository's matched phrases under, and the phrases it
     * places there.
     *
     * <p><b>This is what a reader opens the page for.</b> A repository writes {@code key agreement} and
     * {@code public key certificates}, and CSO states that both sit under <em>public key cryptography</em>
     * — so the publisher has named the subject without this library choosing it. Pooling those names
     * across every vocabulary that answered is the nearest thing the reading has to a plain statement of
     * what the repository is about.
     *
     * <p>The subjects are <b>not</b> merged across publishers. CSO's {@code public key cryptography} and
     * FIX's {@code Session} stand as two entries because two publishers said two things, and deciding
     * that one subsumes the other would be a judgement this library cannot cite. The publisher is named
     * beside each.
     *
     * @param subject     the label the publisher states above the phrases
     * @param source      the publisher that states it
     * <p><b>The phrases carry their descriptions.</b> {@code PresentValue} is an identifier and says
     * nothing to a reader; FIBO's own "value of an asset today" is what it means, and a chip naming the
     * label without it has shown a name. Where a publisher describes no concept but describes the level
     * above it, that prose is carried with the level it is stated for named beside it.
     *
     * @param readable    the subject as a reader can read it: the publisher's own phrase where it wrote
     *                    one, the identifier split into its words where every one of them is English, and
     *                    what the publisher says the most-written concept here means where it is not
     * @param occurrences how often the repository wrote the phrases placed there
     * @param concepts    those phrases with what their publisher says about them, most-written first
     */
    public record Subject(String subject, String readable, String source, int occurrences,
                          List<WrittenConcept> concepts) {

        public Subject {
            concepts = List.copyOf(concepts);
        }
    }

    /** The strongest answer's strength, which is what the reading is ordered by. */
    public double strength() {
        return answers.stream().mapToDouble(DrawnAnswer::strength).max().orElse(0.0);
    }

    /**
     * One source's answer, with its strength in the unit its own source type states it in.
     *
     * <p>The two units never merge. A vocabulary states a multiple of the bar a deal of its own words
     * reaches; a scheme states a distance in bits nearer than a scheme of chance came. The figure carries
     * whichever the source stated and {@code unit} says which, so the figure is never drawn on the other
     * one's axis.
     *
     * @param source      the publisher, under the name it states
     * @param publishedAt where that publisher publishes, absent for a source neither enumeration names
     * @param statedPath  every level the publisher states above what answered, broadest first
     * @param concept     the concept or subject that answered
     * @param definition  what the publisher says it means, empty where the publisher states nothing
     * @param strength    the figure, in the unit below
     * @param unit        which quantity the figure is, and the axis the answer may be drawn on
     * @param qualifiedBy the same figure in the publisher's own words
     * @param phrases     how many of the publisher's phrases the repository wrote, zero for a scheme
     * @param beyondChance how many more of them than the count a deal of the publisher's own words
     *                    reaches — the evidence in the unit it was counted in, and zero for a scheme
     * @param chanceRate  how often chance alone reached this source's count, bounded in {@code [1/1000, 1]}
     *                    by the estimator's own definition. <b>This is what the answers are ranked by</b>,
     *                    because it is the only figure on the bar that compares two publishers of different
     *                    sizes: a count favours the publisher that states the most terms and a ratio
     *                    favours the one with the lowest bar. A scheme states none and carries 1.0, which
     *                    ranks it last among vocabularies and is where the cascade already puts it
     * @param branches    every branch the publisher states for those phrases, most-written first
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public record DrawnAnswer(String source, String publishedAt, List<String> statedPath, String concept,
                              String definition, double strength, String unit, String qualifiedBy,
                              int phrases, int beyondChance, double chanceRate,
                              List<WrittenBranch> branches) {

        /** The unit a vocabulary's strength is stated in. */
        public static final String TIMES_ITS_BAR = "times its bar";

        /** The unit a subject scheme's strength is stated in. */
        public static final String BITS_PAST_CHANCE = "bits past chance";

        /**
         * What a reading with no qualifying evidence answers in. It is not a strength of nothing: there
         * is no figure, so the answer stands on neither scale and the figure draws it no mark.
         */
        public static final String NO_EVIDENCE = "no evidence";

        public DrawnAnswer {
            statedPath = List.copyOf(statedPath);
            branches = List.copyOf(branches);
        }
    }

    /** The whole of what one page draws: every reading, and the vocabularies any of them answered from. */
    public record Drawing(List<DrawnReading> readings, List<String> publishers) {

        public Drawing {
            readings = List.copyOf(readings);
            publishers = List.copyOf(publishers);
        }
    }

    /** A concept named before its definition, as the export writes it, split back into the two. */
    static String conceptOf(final String result) {
        return named(result).orElse(result);
    }

    /** What the publisher says the concept means, and nothing where the export carries only a name. */
    static String definitionOf(final String result) {
        return named(result).map(concept -> result.substring(concept.length() + SEPARATOR.length()))
                .orElse("");
    }

    private static final String SEPARATOR = " — ";

    private static Optional<String> named(final String result) {
        final int separator = result.indexOf(SEPARATOR);
        return separator < 0 ? Optional.empty() : Optional.of(result.substring(0, separator));
    }
}
