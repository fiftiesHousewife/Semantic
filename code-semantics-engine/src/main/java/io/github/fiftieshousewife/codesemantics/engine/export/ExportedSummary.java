package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

import lombok.Builder;

/**
 * The answer, with none of the evidence under it. A consumer that reads this object alone knows what the
 * repository is about, where it was placed, which words and concepts carried it, and how much of it could be
 * read at all.
 *
 * <p>Nothing here is computed twice: every figure is one the sections below also carry, named rather than
 * re-derived, so the top of the file cannot disagree with the rest of it.
 *
 * @param repository                the directory the reading was pointed at
 * @param commit                    the commit the working tree stood on, stated by the caller
 * @param about                     the topics that make some part of this repository unlike the rest of it
 * @param placedIn                  where the scheme places it, at both the levels it states
 * @param leadingWords              the words scoring highest, with their scores, highest first
 * @param aboutStatedBy             the resources whose labels the {@code about} topics are, so a consumer
 *                                  reading a topic knows which vocabulary named it
 * @param leadingConcepts           the published concepts the repository writes most of, most first, each
 *                                  crediting the taxonomy that publishes it
 * @param leadingBehaviours         the clauses its published method names state most often, most first —
 *                                  what it does, as against what the words above say it is named after
 * @param distinctiveScopes         the parts that depart from the whole further than chance
 * @param shareOfWordsWithACitation of every word occurrence, how many a bundled resource can be cited for
 * @param shareOfMassOnNoSubject    of the mass observed, how much settled on no subject at all
 */
@Builder
public record ExportedSummary(String repository, String commit, List<String> about,
                              List<String> aboutStatedBy,
                              ExportedPlacement placedIn, List<LeadingWord> leadingWords,
                              List<LeadingConcept> leadingConcepts, List<String> leadingBehaviours,
                              List<DistinctiveScope> distinctiveScopes,
                              double shareOfWordsWithACitation, double shareOfMassOnNoSubject,
                              Counts counts) {

    /** One part of the repository that departs from the whole, and what it writes more of. */
    public record DistinctiveScope(String scope, double divergenceBits, List<String> writesMoreOf) {

        public DistinctiveScope {
            writesMoreOf = List.copyOf(writesMoreOf);
        }
    }

    /** How long each section below is, so a consumer can size the read before making it. */
    @Builder
    public record Counts(int signals, int themes, int concepts, int behaviours) {
    }

    /**
     * One concept and the taxonomy that publishes it.
     *
     * <p>A summary naming {@code ontology} beside {@code Verb} is naming two vocabularies' answers as though
     * they were one list. Which published it decides what the concept means and how far a reader should
     * trust it, so it travels with the name rather than being recoverable only by searching the taxonomies.
     */
    public record LeadingConcept(String concept, String publishedBy) {
    }

    public ExportedSummary {
        Objects.requireNonNull(repository, "repository");
        Objects.requireNonNull(commit, "commit");
        about = List.copyOf(about);
        aboutStatedBy = List.copyOf(aboutStatedBy);
        Objects.requireNonNull(placedIn, "placedIn");
        leadingWords = List.copyOf(leadingWords);
        leadingConcepts = List.copyOf(leadingConcepts);
        leadingBehaviours = List.copyOf(leadingBehaviours);
        distinctiveScopes = List.copyOf(distinctiveScopes);
        Objects.requireNonNull(counts, "counts");
    }
}
