package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads the Conventional Commits tokens into the bundled TSV, from two pinned statements: the v1.0.0
 * specification page's own markdown, and the Angular commit-message guidelines at the revision the
 * specification's own link pins for the types it recommends rather than defines. Each file is taken with
 * {@code -Psource=<spec>,<convention>}, or fetched from its permalink where a network route exists, and
 * accepted only if git would give its bytes the blob id its revision holds.
 */
public final class ConventionalCommitTypesExtraction {

    private static final String SPECIFICATION_REVISION = "7d293dc59e88abc8ce6c6698344d4da518ff3f27";

    private static final String SPECIFICATION_BLOB = "4fa8464d66f7659c3565a2a84ce0577839552046";

    private static final String SPECIFICATION_SOURCE =
            "https://github.com/conventional-commits/conventionalcommits.org/blob/"
                    + SPECIFICATION_REVISION + "/content/v1.0.0/index.md";

    private static final String CONVENTION_REVISION = "22b96b96902e1a42ee8c5e807720424abad3082a";

    private static final String CONVENTION_BLOB = "1419eea496864ec93ef92b4ffb9286206ab7a450";

    private static final String CONVENTION_SOURCE =
            "https://github.com/angular/angular/blob/" + CONVENTION_REVISION + "/CONTRIBUTING.md";

    private final ConventionalCommitConcepts concepts = new ConventionalCommitConcepts();

    private final ConventionalCommitTypesTsv tsv = new ConventionalCommitTypesTsv();

    private final PinnedSource specification = new PinnedSource(
            URI.create("https://raw.githubusercontent.com/conventional-commits/conventionalcommits.org/"
                    + SPECIFICATION_REVISION + "/content/v1.0.0/index.md"),
            SPECIFICATION_REVISION, SPECIFICATION_BLOB);

    private final PinnedSource convention = new PinnedSource(
            URI.create("https://raw.githubusercontent.com/angular/angular/"
                    + CONVENTION_REVISION + "/CONTRIBUTING.md"),
            CONVENTION_REVISION, CONVENTION_BLOB);

    public void extract(final String specificationCopy, final String conventionCopy, final Path output)
            throws IOException {
        final String stated = new String(specification.read(specificationCopy), StandardCharsets.UTF_8);
        final String defined = new String(convention.read(conventionCopy), StandardCharsets.UTF_8);
        new BundledResource(output).written(rendered(concepts.in(stated, defined)));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read) {
        return tsv.render(read, SPECIFICATION_SOURCE, CONVENTION_SOURCE);
    }

    PinnedSource specification() {
        return specification;
    }

    PinnedSource convention() {
        return convention;
    }
}
