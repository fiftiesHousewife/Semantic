package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import io.github.fiftieshousewife.codesemantics.engine.reading.WrittenWords;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Ranks the words this repository wrote by how much more of it they are than of ordinary English or of the
 * Java platform's own API, and writes the ranking.
 *
 * <p>What it asserts holds of any repository it is pointed at: that a claim stays inside the bound the
 * statistic's definition gives it, and that the report was written. What this ranking found on <i>this</i>
 * tree belongs in a pinned class, not here.
 */
@Tag("diagnostic")
class VocabularyReadingDiagnostic {

    private static final String REPORT = "vocabulary";

    private static final String NAMES = "What it called things";

    private static final String CHECKS = "What it called the things that check it";

    private static final String PROSE = "And what it wrote about all of it";

    private static final String PREAMBLE = """
            The words this repository chose, and what it took to tell them from the words it had no choice
            about. Every word of every **declared name** is here — including the ones no bundled resource
            could be cited for, because what a repository wrote and what could be read of it are different
            questions.

            The ranking is over the **names** because that is where the choosing happens. A name is a word
            its author picked for a thing; a sentence is English, and English requires articles, copulas and
            conjunctions whatever it is about. The prose is read too and ranked the same way underneath, so
            which population a figure came from is stated rather than pooled.

            A count on its own answers neither question. The words a Java program contains most of are the words every
            Java program contains most of, and the words a body of prose contains most of are the ones English
            requires whatever it is about. So each word is scored against two references that state their own
            contents: the bundled frequency list, whose ordering says how common a word is in English, and
            the type names the running platform declares in the packages it exports, read from
            `ModuleFinder.ofSystem()` and split by the same grammar this repository's names are split by.

            The score is that word's term of the Jensen–Shannon divergence between what this repository is
            written in and what a reference is written in — non-negative, bounded at one bit by the
            statistic's own definition, and summing to the distance between the two. A word is ranked by the
            **weakest** claim any reference makes for it, so it reaches the top only where both agree this
            repository writes it more densely than they do. Pooling the two would need a weight per reference
            that nothing states; the weakest claim needs none.

            Neither reference can answer for a word English put inside a name. `massByTopic` is a name about
            mass and about topics, and `by` is what the language puts between the two; against a reference
            drawn from prose it looks specialist, because prose is not where a program's prepositions are
            written. Two bundled resources place such a word between them: WordNet carries no noun or verb
            entry for it, and the frequency list carries it as a word English is written in. A word placed
            outside the dictionary and inside the language is one its author had no choice about, and it is
            shown in its own table under **What the language supplied**. The conjunction is what makes the
            reading safe — the dictionary refuses `tsv`, `skos` and `synset` exactly as it refuses `by`, and
            the frequency list carries `class`, `part` and `first`, which a program may well be about.

            No word is excluded. A word a reference writes more densely than this repository does carries that
            reference's claim as a negative and sorts below everything that survived, which is where a reader
            can go and check that the references are refusing what they should. A word the language supplied
            keeps the place it earned and is printed with it, which is why the first table's numbering has
            gaps: the gap is where the reader should look for it.
            """;

    @Test
    void ranksTheWordsThisRepositoryChoseAndWritesTheReport() throws IOException {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Path root = reading.root();
        final RepositoryLegibility legibility = reading.legibility();
        final PublishedNames names = new PublishedNames();
        final WrittenWords written = legibility.repository().written();
        final WrittenWords named = names.published(legibility);
        final WrittenWords checked = names.checking(legibility);
        final ChosenWords chosen = ChosenWords.againstEnglishAndThePlatform();
        final List<ChosenWord> ranked = chosen.in(named);
        final ReportFolder reports = ReportFolder.forReadingOf(root);

        reports.wrote(REPORT, "# The vocabulary — %s%n%n%s%n%s%n%s%n%s".formatted(root.getFileName(), PREAMBLE,
                new VocabularyReport(reading.namesChance()).render(NAMES, ranked, named),
                report(chosen, checked).render(CHECKS, chosen.in(checked), checked),
                report(chosen, written).render(PROSE, chosen.in(written), written)),
                "The vocabulary");

        assertAll(
                () -> assertThat(ranked).as("a repository that named things has a vocabulary").isNotEmpty(),
                () -> assertThat(ranked).allSatisfy(word ->
                        assertThat(word.claim()).isBetween(-1.0, 1.0)),
                () -> assertThat(ranked).isSortedAccordingTo(
                        (first, second) -> Double.compare(second.claim(), first.claim())),
                () -> assertThat(Files.readString(reports.file(REPORT + ".md")))
                        .contains(NAMES, CHECKS, PROSE, "What a count on its own would have said"));
    }

    /** One population's report, cut where that population's own null puts the bar rather than at a count. */
    private static VocabularyReport report(final ChosenWords chosen, final WrittenWords written) {
        return new VocabularyReport(chosen.chanceFor(written, TreeReading.SEED));
    }

}
