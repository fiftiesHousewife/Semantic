package io.github.fiftieshousewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.FiboTerms;
import io.github.fiftieshousewife.bi.lexicon.OliaTerms;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
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

    @Test
    void readsThisRepositoryAgainstAVocabularyOfItsFieldAndAVocabularyOfAnother() {
        final TreeReading tree = TreeReading.ofTheCloneUnderReading();
        final ParsedRepository parsed = tree.parsed();

        final CorroboratedReading field = tree.terms();
        final CorroboratedReading other = CorroboratedReading.of(FinanceTerms.fromClasspath(),
                FiboTerms.fromClasspath().concepts(), parsed);


        assertAll(
                () -> assertThat(other.matched().perThousandNames()).isNotNegative(),
                () -> assertThat(other.matched().spansFound())
                        .isLessThanOrEqualTo(other.matched().namesRead()),
                () -> assertThat(field.matched().namesRead())
                        .as("both vocabularies must read the same names, or the two rows are not comparable")
                        .isEqualTo(other.matched().namesRead()));
    }

}
