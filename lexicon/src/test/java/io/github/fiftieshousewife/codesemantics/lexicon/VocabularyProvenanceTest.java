package io.github.fiftieshousewife.codesemantics.lexicon;

import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Every bundled vocabulary says what it is, who publishes it, where it came from and on what terms.
 *
 * <p>A word list is evidence, and evidence without a source cannot be checked, corrected or replaced. The
 * cost is not hypothetical: the frequency list deciding term familiarity and segmentation cost arrived in one
 * commit with no source cited, and stayed that way through every review the naming code had. Its consumers
 * documented it as carrying junk and worked around that with magic rank thresholds, which is what reasoning
 * about a list you cannot look up eventually forces.
 *
 * <p>Source and Licence are prose and this test does not read them — it only insists that both questions are
 * answered somewhere in the header. Name, Publisher and Kind are read, because a reading that discovers what
 * it bundles from these lines cannot fall back on a class stating them a second time.
 */
class VocabularyProvenanceTest {

    private static final String SOURCE = "source:";

    private static final String LICENCE = "licence:";

    private static final String NAME = "Name";

    private static final String PUBLISHER = "Publisher";

    private static final String KIND = "Kind";

    /**
     * What a row is, which is a fact about the publisher's file and not about this library's use of it.
     *
     * <p>{@code terms} and {@code subjects} are the two ways a taxonomy of concepts can be read, and are
     * what a reading selects on. The other three are not taxonomies at all: {@code words} is what a
     * dictionary or a name registry states about a word or a sense, {@code identifiers} is a name a
     * standard's own registry or runtime states, and {@code frequencies} is a count or a share read as a
     * denominator.
     */
    private static final List<String> KINDS =
            List.of("terms", "subjects", "words", "identifiers", "frequencies");

    /** The two kinds a reading reads as a taxonomy of concepts, matching one and placing against the other. */
    private static final List<String> TAXONOMY_KINDS = List.of("terms", "subjects");

    /** What a taxonomy states beyond the three every bundled resource does. */
    private static final List<String> TAXONOMY_KEYS =
            List.of("Short name", "Published at", "Description", "Subject");

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

    @Test
    void everyBundledVocabularyNamesItselfAndWhoPublishesIt() {
        assertAll(BundledVocabulary.files().stream().map(file -> () -> assertAll(
                () -> assertThat(BundledVocabulary.stated(file, NAME))
                        .as("%s states no Name: line. The header is where a reading finds out what a "
                                + "resource is, and a name stated in a class beside it is a second "
                                + "statement nothing checks against this one.", file.getFileName())
                        .isNotBlank(),
                () -> assertThat(BundledVocabulary.stated(file, PUBLISHER))
                        .as("%s states no Publisher: line. Name whoever publishes it and link where they "
                                + "publish it, so a page citing this file can link the thing it names.",
                                file.getFileName())
                        .isNotBlank())));
    }

    @Test
    void everyBundledTaxonomyStatesWhatACitationSaysAndWhatItIsAbout() {
        assertAll(BundledVocabulary.files().stream().filter(VocabularyProvenanceTest::isATaxonomy)
                .map(file -> () -> assertAll(TAXONOMY_KEYS.stream().map(key -> () ->
                        assertThat(BundledVocabulary.stated(file, key))
                                .as("%s states Kind: %s, so a reading places or matches it and needs a %s: "
                                        + "line. A taxonomy's own header is where the pages, the export and "
                                        + "the evidence read what it is; a class stating it beside them is a "
                                        + "second statement nothing checks against this one.",
                                        file.getFileName(), BundledVocabulary.stated(file, KIND), key)
                                .isNotBlank()))));
    }

    @Test
    void everyBundledVocabularyStatesWhichKindOfThingItsRowsAre() {
        assertAll(BundledVocabulary.files().stream().map(file -> () ->
                assertThat(BundledVocabulary.stated(file, KIND))
                        .as("%s states no Kind: line naming one of %s. It is what a reading selects a "
                                + "taxonomy on without enumerating one by hand, so it is a closed set and "
                                + "a new value is a deliberate change to it.", file.getFileName(), KINDS)
                        .isIn(KINDS)));
    }

    private static boolean isATaxonomy(final Path file) {
        return TAXONOMY_KINDS.contains(BundledVocabulary.stated(file, KIND));
    }

    private static String header(final Path file) {
        return BundledVocabulary.header(file).toLowerCase(Locale.ROOT);
    }
}
