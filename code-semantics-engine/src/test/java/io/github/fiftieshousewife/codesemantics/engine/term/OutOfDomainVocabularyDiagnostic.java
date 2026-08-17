package io.github.fiftieshousewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.FiboTerms;
import io.github.fiftieshousewife.bi.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.ReportFolder;
import io.github.fiftieshousewife.codesemantics.engine.reading.TreeReading;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Reads one repository against two published vocabularies at once, one from the field it works in and one
 * from a field it has nothing to do with, and reports what each found.
 *
 * <p>This is the half of the measurement that can fail. A vocabulary firing on a repository in its own
 * domain shows only that it fires; what decides whether the matcher reads a field or reads Java is what the
 * out-of-domain vocabulary does on the same names. Both are read through the same {@link TermIndex}, the
 * same splitter and the same corroboration rule, so the only difference between the two rows is the
 * publisher.
 *
 * <p><b>Nothing directional is asserted here.</b> Pointed at a finance repository the rates should invert,
 * and a diagnostic that demanded FIBO stay quiet would fail on the tree it is meant to succeed on. What the
 * two rates are on any given tree is a finding about that tree and belongs beside the report.
 */
@Tag("diagnostic")
class OutOfDomainVocabularyDiagnostic {

    private static final String REPORT = "out-of-domain";

    private static final String PREAMBLE = """
            A domain vocabulary is worth something only where it fires on a repository in its domain and
            stays quiet on one outside it. Both vocabularies below are matched against the same declared
            names, by the same splitter and the same corroboration rule.

            **The figure is matched spans per thousand declared names.** A count on its own would say more
            about how many terms a publisher wrote than about this repository.
            """;

    @Test
    void readsThisRepositoryAgainstAVocabularyOfItsFieldAndAVocabularyOfAnother() throws IOException {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final Path root = tree.root();
        final ParsedRepository parsed = tree.parsed();

        final CorroboratedReading field = CorroboratedReading.of(LinguisticTerms.fromClasspath(),
                OliaTerms.fromClasspath().concepts(), parsed);
        final CorroboratedReading other = CorroboratedReading.of(FinanceTerms.fromClasspath(),
                FiboTerms.fromClasspath().concepts(), parsed);

        ReportFolder.forReadingOf(root).wrote(REPORT, """
                # A vocabulary of another field — %s

                %s
                | Vocabulary | Terms published | Spans | Per thousand names | Distinct terms | Files matched | Longer than one word |
                |---|--:|--:|--:|--:|--:|--:|
                %s%s
                ## Every term the out-of-domain vocabulary matched

                Named in full, because a rate says how loud a vocabulary was and only the terms say what it
                was hearing. Each row is a word FIBO publishes as a term of finance and this repository
                declares in some other sense.

                | Term | Occurrences | Concept FIBO publishes under it | First site |
                |---|--:|---|---|
                %s""".formatted(root.getFileName(), PREAMBLE, row("OLiA", field, OliaTerms.fromClasspath().terms().size()),
                row("FIBO", other, FiboTerms.fromClasspath().terms().size()),
                everyTerm(other.matched())), "A vocabulary of another field");

        assertAll(
                () -> assertThat(other.matched().perThousandNames()).isNotNegative(),
                () -> assertThat(other.matched().spansFound())
                        .isLessThanOrEqualTo(other.matched().namesRead()),
                () -> assertThat(field.matched().namesRead())
                        .as("both vocabularies must read the same names, or the two rows are not comparable")
                        .isEqualTo(other.matched().namesRead()));
    }

    /** All of them, not a head: 23 rows a reader can check beats a rate nobody can argue with. */
    private static String everyTerm(final MatchedTerms matched) {
        return matched.byMass(Integer.MAX_VALUE).stream()
                .map(sighting -> String.format("| `%s` | %d | %s | %s |%n", sighting.term(),
                        sighting.occurrences(), sighting.concepts().getFirst().prefLabel(),
                        sighting.firstSite()))
                .collect(java.util.stream.Collectors.joining());
    }

    private static String row(final String source, final CorroboratedReading reading, final int published) {
        final MatchedTerms matched = reading.matched();
        return String.format("| %s | %d | %d | %.2f | %d | %d | %d |%n", source, published,
                matched.spansFound(), matched.perThousandNames(), matched.distinctTerms(),
                matched.filesRead() - matched.filesWithNoMatch(), matched.longerThanOneWord().size());
    }
}
