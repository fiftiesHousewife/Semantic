package org.fifties.housewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

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
 * @param placedIn                  the nearest published subject, with the nearest chance one beside it
 * @param leadingWords              the words scoring highest, with their scores, highest first
 * @param leadingConcepts           the published concepts the repository writes most of, most first
 * @param distinctiveScopes         the parts that depart from the whole further than chance
 * @param shareOfWordsWithACitation of every word occurrence, how many a bundled resource can be cited for
 * @param shareOfMassOnNoSubject    of the mass observed, how much settled on no subject at all
 */
public record ExportedSummary(String repository, String commit, List<String> about,
                              ExportedTaxonomy.Placement placedIn, List<LeadingWord> leadingWords,
                              List<String> leadingConcepts, List<DistinctiveScope> distinctiveScopes,
                              double shareOfWordsWithACitation, double shareOfMassOnNoSubject,
                              Counts counts) {

    /** One part of the repository that departs from the whole, and what it writes more of. */
    public record DistinctiveScope(String scope, double divergenceBits, List<String> writesMoreOf) {

        public DistinctiveScope {
            writesMoreOf = List.copyOf(writesMoreOf);
        }
    }

    /** How long each section below is, so a consumer can size the read before making it. */
    public record Counts(int signals, int themes, int concepts) {
    }

    public ExportedSummary {
        Objects.requireNonNull(repository, "repository");
        Objects.requireNonNull(commit, "commit");
        about = List.copyOf(about);
        Objects.requireNonNull(placedIn, "placedIn");
        leadingWords = List.copyOf(leadingWords);
        leadingConcepts = List.copyOf(leadingConcepts);
        distinctiveScopes = List.copyOf(distinctiveScopes);
        Objects.requireNonNull(counts, "counts");
    }
}
