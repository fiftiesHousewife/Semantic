package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.export.ExportedAnswer;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedConcept;
import io.github.fiftieshousewife.codesemantics.engine.export.ExportedTaxonomy;
import io.github.fiftieshousewife.codesemantics.engine.export.ReadingExport;
import io.github.fiftieshousewife.codesemantics.lexicon.TermVocabularies;

/**
 * The landing card's sentences: the subject-first claim in the repository's own words, and the Also line
 * naming every further source that qualified. The member page's fuller sentences stay in
 * {@link FindingSentences}; a card carries claims, and the figures stand in the marks beside them.
 */
final class CardSentences {

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
        final String counted = FindingSentences.aBarWasFormed(reading)
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
                .map(CardSentences::alsoOne)
                .collect(Collectors.joining("; "));
        return others.isEmpty() ? "" : "Also: " + others + ".";
    }

    private static String alsoOne(final ExportedAnswer answer) {
        final String placed = answer.statedPath().isEmpty() ? ""
                : ", under " + PublishedSpelling.shown(answer.statedPath().getLast());
        return answer.source() + " \u2014 " + PublishedSpelling.shown(answer.result()) + placed;
    }
}
