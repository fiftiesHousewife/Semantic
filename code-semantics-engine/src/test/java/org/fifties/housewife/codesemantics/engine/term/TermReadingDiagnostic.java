package org.fifties.housewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.CloneUnderReading;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Matches this repository's declared names against a published taxonomy's own terms, and writes what it found.
 *
 * <p>OLiA is the taxonomy, and this repository is <em>in its domain</em> — a library of lemmas, senses,
 * phrases and word frequencies is working in linguistic annotation whether or not it says so. That makes this
 * the cheap half of the measurement the matcher exists for: a domain vocabulary must fire on a repository in
 * its domain and not on one outside it, and the first half can be run here with nothing cloned.
 *
 * <p>It is a smoke test and not the measurement. The taxonomy that fits this tree was chosen after reading the
 * tree, which is exactly what the doctrine means by marking your own homework, and the out-of-domain arm — the
 * one that decides — needs repositories this reading was not written for. What the assertions state is the
 * expectation rather than the figures: that terms fire at all, that the noise the design predicts is visible
 * where it was predicted, and that the ontology's multi-word terms are the ones carrying the reading.
 */
@Tag("diagnostic")
class TermReadingDiagnostic {

    private static final String REPORT = "build/reports/self-reading/terms.md";
    private static final String GRAPH = "build/reports/self-reading/terms.json";
    private static final String PAGE = "build/reports/self-reading/terms.html";

    private static final int TERMS_HELD = 100;

    private static final String PREAMBLE = """
            Where this repository writes the vocabulary of a published taxonomy — the Ontologies of Linguistic
            Annotation, 1,197 terms whose concepts are already identifiers.

            **This is matched, not diverged against**, and it is the other half of what a taxonomy can be. A
            subject scheme places a whole repository and can say nothing about any line in it, because nobody
            writes `cs.CL`. A term taxonomy publishes names a program in its field actually declares, so the
            match is identifier to identifier: the ontology's `AdjectivePhrase` and this repository's
            `adjectivePhrase` read as the same two words, and a hit is the ontology stating that this is a
            term of its field rather than anyone here deciding so.

            Only **declared names** are read. A term in a sentence is an author writing about a field and a
            term in a name is a program working in it, and reading the prose would let this repository's own
            documentation supply the evidence that it is about what it says it is about.

            **Read the split by term length before the rate.** The measurement that shaped this design matched
            3,837 finance-ontology labels against a repository with no finance in it and got 1,789 hits on
            one-word terms against three on terms of two words or more: the one-word match is what a taxonomy
            does to a repository it knows nothing about. No term is excluded for that — a list of words to
            ignore is what the doctrine forbids — so the weight comes from the bundled frequency list instead,
            and a run of everyday words is worth a fraction of a run the list barely carries.
            """;

    @Test
    void matchesThisRepositoryAgainstThePublishedTermsOfItsOwnField() throws IOException {
        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);
        final LinguisticTerms terms = LinguisticTerms.fromClasspath();

        final MatchedTerms matched = TermReading.over(terms).of(parsed);

        write(root, terms, matched, TermGraph.of(root.getFileName().toString(), terms.source(),
                matched, TermRung.WORDS, new StatedAncestry(terms)));

        final List<String> carrying = matched.byMass(TERMS_HELD).stream().map(TermSighting::term).toList();
        final List<String> longer = matched.longerThanOneWord().stream().map(TermSighting::term).toList();
        assertAll(
                () -> assertThat(matched.spansFound())
                        .as("a taxonomy of grammar must fire on a library that reads grammar")
                        .isPositive(),
                () -> assertThat(carrying)
                        .as("this repository declares the ontology's own terms")
                        .contains("phrase", "verb", "noun", "sentence"),
                () -> assertThat(longer)
                        .as("and it declares terms no everyday sentence would contain")
                        .contains("common noun", "base form"),
                () -> assertThat(matched.filesWithNoMatch())
                        .as("a vocabulary matching every file would be measuring English, not a field")
                        .isPositive(),
                () -> assertThat(matched.sightings()).allSatisfy(sighting ->
                        assertThat(sighting.specificity()).isBetween(0.0, 1.0)),
                () -> assertThat(Files.readString(Path.of(PAGE)))
                        .as("the page draws the same reading the report states")
                        .contains(TermProse.HEADING),
                () -> assertThat(oneWordShare(matched))
                        .as("A FINDING, PINNED. In domain, on the repository this reading was developed "
                                + "against, the taxonomy is fired almost entirely by one-word terms — the "
                                + "same shape a finance ontology showed on a repository with no finance in "
                                + "it. The frequency weight narrows the gap and does not close it: `first` "
                                + "carries more than `sentence` does. So the one-word rate is not yet known "
                                + "to discriminate, and only the out-of-domain arm can settle it.")
                        .isGreaterThan(0.9),
                () -> assertThat(longer)
                        .as("A DEFECT, PINNED. `Collocation` reads as col / location because the frequency "
                                + "list does not carry the compound, and it matches only because the "
                                + "ontology's own term broke the same way on the same grammar. When the "
                                + "splitter learns the boundary this must fail and be rewritten.")
                        .contains("col location"));
    }

    private static double oneWordShare(final MatchedTerms matched) {
        return matched.spansByLength().getOrDefault(1, 0) / (double) matched.spansFound();
    }

    private static void write(final Path root, final LinguisticTerms terms, final MatchedTerms matched,
                              final TermGraph graph) throws IOException {
        final Path report = Path.of(REPORT);
        Files.createDirectories(report.getParent());
        new ObjectMapper().writerWithDefaultPrettyPrinter().writeValue(Path.of(GRAPH).toFile(), graph);
        Files.writeString(Path.of(PAGE), new TermPage().of(graph));
        Files.writeString(report, """
                # Terms — %s

                %s
                %s""".formatted(root.getFileName(), PREAMBLE,
                new TermReport().render(terms.source(), matched, TERMS_HELD)));
    }
}
