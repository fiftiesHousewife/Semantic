package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedPlacement;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;

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
                "%s's nearest subject is %s, at %.3f bits against the %.3f its shuffle reaches",
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
                "%s states %d of its phrases in this repository's declared names, against the %d the "
                        + "best of a field of %d reaches by dealing its own words at random.",
                vocabulary.vocabulary(), vocabulary.bar().phrases(),
                vocabulary.bar().chanceExpectedBest(), vocabulary.bar().field());
    }

    private static String oneWordTerms(final ExportedTaxonomy vocabulary) {
        return String.format(Locale.ROOT,
                "The repository writes %d of %s's one-word terms, each beside another concept of the "
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
                ? String.format(Locale.ROOT, "%s's nearest top-level grouping is %s",
                        answer.source(), answer.result())
                : String.format(Locale.ROOT, "%s's nearest subject is %s, inside %s",
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
                        + "deals of their own words reach, and no scheme's nearest subject is nearer "
                        + "than its shuffle reaches.",
                reading.taxonomies().size()
                        + reading.setAside().vocabulariesBelowTheirChanceBar().size());
    }
}
