package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedConcept;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.engine.export.SetAside;
import io.github.fiftieshousewife.codesemantics.lexicon.TermVocabularies;

/**
 * A reading's answers as plain-English sentences, one per answering source, with the figure beside the
 * words: the count, the count a deal reaches, the publisher's placement and its own prose. A reading with
 * no qualifying evidence yields one sentence saying so with the count of vocabularies judged.
 *
 * <p>The order is the export's own ranking and nothing here reorders it. Every figure in a sentence is one
 * the export states, so a sentence and the published reading cannot disagree.
 */
public final class FindingSentences {

    private static final String LEVEL_SEPARATOR = " › ";

    /**
     * Each bundled vocabulary's stated subject, keyed by the short name a match cites. The card leads with
     * it because a source's name answers nothing on its own: FIX says finance only to a reader who knows
     * FIX, where its own header states "financial information exchange". A vocabulary the classpath
     * provides states no header here and its claim stands without the prefix.
     */
    private static final Map<String, String> SUBJECT_BY_SOURCE = Stream.of(TermVocabularies.values())
            .collect(Collectors.toMap(TermVocabularies::publisher,
                    vocabulary -> vocabulary.stated().subject()));

    /** How many matched terms a card quotes; the whole list is on the member page. */
    private static final int QUOTED_TERMS = 4;

    /**
     * The claim alone, for a card, in the repository's own words: the subject the source's header states,
     * the count, and the most-written matched terms — {@code present value, settlement date, trade date}
     * says finance as no concept path does. The figures stand in the marks beside it and the workings once
     * in the page's own lede.
     */
    public String cardClaim(final ReadingExport reading, final ExportedAnswer answer) {
        final ExportedTaxonomy vocabulary = reading.taxonomies().stream()
                .filter(one -> one.vocabulary().equals(answer.source()))
                .findFirst()
                .orElseThrow();
        final String counted = aBarWasFormed(reading)
                ? String.format(Locale.ROOT, "writes %d of %s\u2019s phrases",
                        vocabulary.bar().phrases(), vocabulary.vocabulary())
                : String.format(Locale.ROOT, "writes %d of %s\u2019s one-word terms",
                        vocabulary.concepts().stream()
                                .filter(concept -> concept.wordsInTerm() == 1)
                                .count(),
                        vocabulary.vocabulary());
        final String terms = mostWrittenTerms(vocabulary);
        final String claim = terms.isEmpty() ? counted + "." : counted + " \u2014 " + terms + ".";
        final String subject = SUBJECT_BY_SOURCE.get(answer.source());
        return subject == null ? capitalised(claim) : "About " + subject + ": " + claim;
    }

    /** The most-written matched terms, phrases before single words, as the repository spelled them. */
    private static String mostWrittenTerms(final ExportedTaxonomy vocabulary) {
        return vocabulary.concepts().stream()
                .sorted(Comparator.comparingInt((ExportedConcept concept) -> concept.wordsInTerm() > 1
                                ? 0 : 1)
                        .thenComparing(Comparator.comparingInt(ExportedConcept::occurrences).reversed()))
                .map(ExportedConcept::term)
                .map(PublishedSpelling::shown)
                .distinct()
                .limit(QUOTED_TERMS)
                .collect(Collectors.joining(", "));
    }

    private static String capitalised(final String sentence) {
        return Character.toUpperCase(sentence.charAt(0)) + sentence.substring(1);
    }

    /**
     * Every other source that cleared its bar, each with the concept it places and where the publisher
     * files it — the export's own warning is that naming only the best hides the rest: on jpos only BIAN
     * places its concept under Cards. Empty where the lead was the only qualifying source.
     */
    public String alsoAnswered(final ReadingExport reading, final String leadSource) {
        final String others = reading.summary().answers().stream()
                .filter(answer -> ExportedAnswer.TAXONOMY.equals(answer.sourceType()))
                .filter(answer -> !answer.source().equals(leadSource))
                .filter(answer -> !answer.result().isEmpty())
                .map(FindingSentences::alsoOne)
                .collect(Collectors.joining("; "));
        return others.isEmpty() ? "" : "Also: " + others + ".";
    }

    private static String alsoOne(final ExportedAnswer answer) {
        final String placed = answer.statedPath().isEmpty() ? ""
                : ", under " + PublishedSpelling.shown(answer.statedPath().getLast());
        return answer.source() + " \u2014 " + PublishedSpelling.shown(answer.result()) + placed;
    }

    /** One sentence per entry of {@code summary.answers}, in the export's own order. */
    public List<String> of(final ReadingExport reading) {
        if (ExportedAnswer.NOTHING.equals(reading.summary().answers().getFirst().sourceType())) {
            return List.of(nothingQualified(reading));
        }
        return reading.summary().answers().stream()
                .map(answer -> answered(reading, answer))
                .toList();
    }

    /**
     * One placement level as a sentence: the nearest subject with both figures, and what the shuffle —
     * the same scheme with its subjects' descriptions dealt among them at random — leaves the reading
     * entitled to say.
     */
    public String placement(final String scheme, final ExportedPlacement.Level level) {
        final String figures = String.format(Locale.ROOT,
                "%s’s nearest subject is %s, at %.3f bits against the %.3f its shuffle reaches",
                scheme, level.subject(), level.divergenceBits(), level.nearestByChanceBits());
        if (!level.standsApartFromChance()) {
            return figures + " — no nearer than the shuffle, so the scheme places this repository nowhere.";
        }
        if (level.nearerThanChance().size() > 1) {
            return String.format(Locale.ROOT,
                    "%s — %d subjects are nearer than the shuffle, and the instrument cannot separate "
                            + "them.",
                    figures, level.nearerThanChance().size());
        }
        return figures + ", and no other subject is nearer than the shuffle.";
    }

    /** One refused vocabulary as a sentence carrying the two counts the refusal rests on. */
    public String refused(final SetAside.RefusedVocabulary vocabulary) {
        return String.format(Locale.ROOT,
                "The repository writes %d of %s’s phrases; a deal of %s’s own words reaches %d, so %s "
                        + "says nothing here.",
                vocabulary.bar().phrases(), vocabulary.vocabulary(), vocabulary.vocabulary(),
                vocabulary.bar().chanceExpectedBest(), vocabulary.vocabulary());
    }

    private String answered(final ReadingExport reading, final ExportedAnswer answer) {
        if (ExportedAnswer.SCHEME.equals(answer.sourceType())) {
            return fromAScheme(answer);
        }
        return fromAVocabulary(reading, answer);
    }

    private String fromAVocabulary(final ReadingExport reading, final ExportedAnswer answer) {
        final ExportedTaxonomy vocabulary = reading.taxonomies().stream()
                .filter(one -> one.vocabulary().equals(answer.source()))
                .findFirst()
                .orElseThrow();
        return (aBarWasFormed(reading) ? phrases(vocabulary) : oneWordTerms(vocabulary))
                + named(answer) + quoted(answer);
    }

    /**
     * Whether any published vocabulary's deals reached a count at the quantile the field sets. Where none
     * did, the answers came from one-word terms — the same cascade the export's own answering runs.
     */
    private static boolean aBarWasFormed(final ReadingExport reading) {
        return reading.taxonomies().stream()
                .anyMatch(one -> one.bar().chanceExpectedBest() > 0);
    }

    private static String phrases(final ExportedTaxonomy vocabulary) {
        return String.format(Locale.ROOT,
                "%s states %d of its phrases in this repository’s declared names, against the %d the "
                        + "best of a field of %d reaches by dealing its own words at random.",
                vocabulary.vocabulary(), vocabulary.bar().phrases(),
                vocabulary.bar().chanceExpectedBest(), vocabulary.bar().field());
    }

    private static String oneWordTerms(final ExportedTaxonomy vocabulary) {
        return String.format(Locale.ROOT,
                "The repository writes %d of %s’s one-word terms, each beside another concept of the "
                        + "branch its publisher files it in.",
                vocabulary.concepts().stream().filter(concept -> concept.wordsInTerm() == 1).count(),
                vocabulary.vocabulary());
    }

    private static String named(final ExportedAnswer answer) {
        if (answer.result().isEmpty()) {
            return answer.definition() == null
                    ? "" : " The vocabulary covers " + answer.definition() + ".";
        }
        if (answer.statedPath().isEmpty()) {
            return " Its most-written concept is " + answer.result() + ".";
        }
        return " It places " + answer.result() + " under "
                + String.join(LEVEL_SEPARATOR, answer.statedPath()) + ".";
    }

    private static String quoted(final ExportedAnswer answer) {
        return answer.definition() == null || answer.result().isEmpty()
                ? "" : " “" + answer.definition() + "”";
    }

    private static String fromAScheme(final ExportedAnswer answer) {
        final String where = answer.statedPath().isEmpty()
                ? String.format(Locale.ROOT, "%s’s nearest top-level grouping is %s",
                        answer.source(), answer.result())
                : String.format(Locale.ROOT, "%s’s nearest subject is %s, inside %s",
                        answer.source(), answer.result(),
                        String.join(LEVEL_SEPARATOR, answer.statedPath()));
        return String.format(Locale.ROOT,
                "%s — %.3f bits nearer than the nearest subject of a scheme built by shuffling the "
                        + "real descriptions.",
                where, answer.bitsPastChance());
    }

    private static String nothingQualified(final ReadingExport reading) {
        return String.format(Locale.ROOT,
                "Nothing qualified: the %d vocabularies judged wrote no more of their phrases here than "
                        + "deals of their own words reach, and no scheme’s nearest subject is nearer "
                        + "than its shuffle reaches.",
                reading.taxonomies().size()
                        + reading.setAside().vocabulariesBelowTheirChanceBar().size());
    }
}
