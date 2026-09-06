package io.github.fiftieshousewife.codesemantics.engine.export;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryReading;
import io.github.fiftieshousewife.codesemantics.engine.summary.ReadingSummary;
import io.github.fiftieshousewife.codesemantics.engine.term.BundledTaxonomies;
import io.github.fiftieshousewife.codesemantics.engine.term.CorroboratedReading;
import io.github.fiftieshousewife.codesemantics.engine.term.LinguisticTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.ProvidedTermIndexes;
import io.github.fiftieshousewife.codesemantics.engine.term.SpecificTerms;
import io.github.fiftieshousewife.codesemantics.engine.term.TermIndex;
import io.github.fiftieshousewife.codesemantics.engine.theme.PlacedField;
import io.github.fiftieshousewife.codesemantics.engine.theme.RepositoryThemes;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.PublishedNames;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;
import io.github.fiftieshousewife.codesemantics.lexicon.OliaTerms;

/**
 * One working tree read into the export a consumer receives, and the whole of what a program embedding this
 * library has to call: a directory in, one validated document out. A caller already holding a
 * {@link RepositoryReading}, a term reading or a field placement passes it instead of paying for it twice.
 * Every reading it composes runs at the reading's own seed, so two callers of one tree state the same
 * figures.
 */
public final class ExportedReading {

    /** Enough words behind a topic to check the row; the whole tail is in the reports. */
    private static final int WITNESSES_HELD = 8;

    private static final int TOPICS_PER_SCOPE = 3;

    /**
     * Every bundled term vocabulary, which is what a caller naming no others gets.
     *
     * <p><b>All seven, and not the two this repository is in the field of.</b> Which vocabulary is a
     * control is a fact about the repository being read and not about the vocabulary: FIBO is out of
     * domain here and is the in-domain one on a derivatives library. Judging only the two would mean
     * quickfixj could never publish FIX and strata could never publish FIBO, whatever their phrase counts,
     * which is the enum deciding in advance the question the chance bar exists to ask.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit) {
        return of(reading, commit, vocabulariesBesidesOlia());
    }

    /**
     * The whole of the published surface: a directory in, one validated export out.
     *
     * <p>The commit is an argument because the library reads no {@code .git}. What a working tree is
     * checked out at is a fact its caller states, and a caller with none states the empty string.
     *
     * <p>The reading it takes is not shared with any other, which is {@link RepositoryReading}'s rule:
     * a caller reading one tree twice, or several trees in one program, decides for itself how long a
     * reading lives.
     */
    public ReadingExport of(final Path directory, final String commit) {
        return of(RepositoryReading.of(directory), commit);
    }

    /**
     * The field the default reading judges besides OLiA, which the reading holds separately: every bundled
     * term vocabulary, then any the classpath provides through {@code ServiceLoader<TermIndex>}, in the
     * order of their sources' own names. One statement of the list, so a caller supplying its own term
     * reading judges the same field the default does — a provided vocabulary is judged by the same
     * permutation bar as the bundled ones, and {@code taxonomies[].bar.fieldMembers} records that it was
     * in the field.
     */
    public static List<TermIndex> vocabulariesBesidesOlia() {
        return Stream.concat(
                        BundledTaxonomies.besides(BundledTaxonomies.OLIA).stream(),
                        ProvidedTermIndexes.fromClasspath().stream())
                .toList();
    }

    /**
     * The enumerated taxonomies and any the caller supplies, each matched and reported as its own taxonomy.
     * A consumer injects its own by path and passes the index here, or registers it through
     * {@code ServiceLoader<TermIndex>} and takes the default.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched) {
        return of(reading, commit, alsoMatched,
                CorroboratedReading.of(SpecificTerms.of(LinguisticTerms.fromClasspath()),
                        OliaTerms.fromClasspath().concepts(), reading.parsed()),
                PlacedField.ofArxiv(reading.themes().repository().comparison(), reading.seed()));
    }

    /**
     * The same, over a term reading and a field placement the caller already holds, so a run whose
     * diagnostics took them does not take them again. They must be of this reading's tree at its seed,
     * and the term reading must be over {@link SpecificTerms}: a vocabulary published here is judged on
     * the terms that are its own, and one read over the publisher's whole index would carry matches the
     * other vocabularies' counts had removed.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched, final CorroboratedReading terms,
                            final PlacedField field) {
        return of(reading, commit, alsoMatched, terms, field,
                ChosenWords.againstEnglishAndTheCorpus()
                        .chanceFor(new PublishedNames().published(reading.legibility()), reading.seed()));
    }

    /**
     * The same again, over chance bars the caller already drew — they must be over this reading's published
     * names at its seed, or the signals are cut where another tree's null puts the bar.
     */
    public ReadingExport of(final RepositoryReading reading, final String commit,
                            final List<TermIndex> alsoMatched, final CorroboratedReading terms,
                            final PlacedField field, final List<VocabularyNull.Bar> namesChance) {
        final RepositoryThemes themes = reading.themes();
        final RepositoryLegibility legibility = reading.legibility();
        final ReadingSummary summary = ReadingSummary.of(reading.root().getFileName().toString(),
                legibility, themes, field, TOPICS_PER_SCOPE);
        final Vocabulary vocabulary = Vocabulary.of(legibility, namesChance);
        final List<ExportedSignal> signals = vocabulary.signals();
        final List<ExportedTheme> reported = new ExportedThemes(WITNESSES_HELD).in(summary, themes);
        final JudgedTaxonomies.Judgement judgement =
                new JudgedTaxonomies().of(reading, alsoMatched, terms);
        final ReadingExport answered = ReadingExport.builder()
                .summary(new ExportedSummaries().of(reading, commit, summary, signals, reported,
                        judgement.published(), new ExportedPlacements().in(reading, themes, field)))
                .signals(signals)
                .thresholds(vocabulary.bars())
                .themes(reported)
                .taxonomies(judgement.published())
                .setAside(SetAside.counted(summary, vocabulary, legibility, terms, reading.parsed(),
                        judgement.refused(), judgement.termsWorkingJavaAlsoWrites(), reading))
                .build();
        return answering(answered);
    }

    /**
     * The same reading with {@code summary.answers} filled from every source that cleared the bar of the
     * most specific normalisation that qualified. They are taken from the finished export rather than from the
     * readings behind it, so the answers and the blocks a consumer reads them against are one document.
     */
    private static ReadingExport answering(final ReadingExport export) {
        return new ReadingExport(export.schemaVersion(),
                ExportedSummaries.answered(export.summary(), EvidenceKinds.answering(export)),
                export.signals(), export.thresholds(), export.themes(), export.taxonomies(),
                export.setAside());
    }
}
