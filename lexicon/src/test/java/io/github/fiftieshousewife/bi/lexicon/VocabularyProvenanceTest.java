package io.github.fiftieshousewife.bi.lexicon;

import java.nio.file.Path;
import java.util.Locale;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Every bundled vocabulary says where it came from and on what terms.
 *
 * <p>A word list is evidence, and evidence without a source cannot be checked, corrected or replaced. The
 * cost is not hypothetical: the frequency list deciding term familiarity and segmentation cost arrived in one
 * commit with no source cited, and stayed that way through every review the naming code had. Its consumers
 * documented it as carrying junk and worked around that with magic rank thresholds, which is what reasoning
 * about a list you cannot look up eventually forces.
 *
 * <p>The header is prose and this test does not read it — it only insists that both questions are answered
 * somewhere in it. What the answer says is for the person reading the diff, which is the point: a file whose
 * terms turn out to be restrictive states so in the one place nobody bundling it can miss.
 */
class VocabularyProvenanceTest {

    private static final String SOURCE = "source:";

    private static final String LICENCE = "licence:";

    @Test
    void everyBundledVocabularyDeclaresItsSourceAndItsLicence() {
        assertAll(BundledVocabulary.files().stream().map(file -> () -> assertThat(header(file))
                .as("%s ships in the jar without declaring both where it came from and on what terms. A "
                        + "bundled list is evidence, and evidence that cannot be traced cannot be checked, "
                        + "corrected or replaced — nor can anyone tell whether it may be shipped at all. "
                        + "Give it a leading comment block carrying a Source: line and a Licence: line, "
                        + "saying what is actually known rather than what would be convenient.",
                        file.getFileName())
                .contains(SOURCE)
                .contains(LICENCE)));
    }

    private static String header(final Path file) {
        return BundledVocabulary.header(file).toLowerCase(Locale.ROOT);
    }
}
