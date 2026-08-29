package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;

import io.github.fiftieshousewife.bi.lexicon.CweTerms;
import io.github.fiftieshousewife.bi.lexicon.FixTerms;
import io.github.fiftieshousewife.bi.lexicon.FpmlTerms;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.bi.lexicon.TermVocabularies;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.theme.InjectedTaxonomy;

/**
 * The out-of-domain controls, enumerated the way {@link MatchedTaxonomies} enumerates what every run
 * matches: term vocabularies of a field the read repositories are not in, matched by the same index, the
 * same splitter and the same corroboration rule, and never joined to the matched list — a control that
 * joined the reading it controls would be measuring itself.
 *
 * <p>What a control's matching is worth is the comparison. A domain vocabulary is evidence only if it
 * produces close to nothing on a repository outside its domain, and its multi-word terms are the half that
 * can show it: a phrase is what a repository outside the field does not write by accident, where its
 * one-word labels are the everyday English any repository hits.
 */
public enum ControlTaxonomies {

    /** The Financial Industry Business Ontology, the terms a program working in finance writes. */
    FIBO {
        @Override
        public TermIndex index() {
            return FinanceTerms.fromClasspath();
        }

        @Override
        public String description() {
            return "The Financial Industry Business Ontology: what a financial thing is — instruments, parties and agreements.";
        }

        @Override
        public String publishedAt() {
            return "https://spec.edmcouncil.org/fibo/";
        }

        @Override
        public List<SkosConcept> publishedConcepts() {
            return TermVocabularies.FIBO.concepts();
        }
    },

    /**
     * The Financial products Markup Language, the types a derivatives trading system writes on the wire.
     * FIBO states what a financial thing is; FpML states how a trade is written down, so the two firing
     * together on one repository is stronger evidence than either alone.
     */
    FPML {
        @Override
        public TermIndex index() {
            return InjectedTerms.of(FpmlTerms.fromClasspath(), "FpML");
        }

        @Override
        public String description() {
            return "The Financial products Markup Language: how a derivatives trade is written down on the wire.";
        }

        @Override
        public String publishedAt() {
            return "https://www.fpml.org/";
        }

        @Override
        public List<SkosConcept> publishedConcepts() {
            return TermVocabularies.FPML.concepts();
        }
    },

    /**
     * The FIX protocol as FIX Orchestra states it, the third finance-side vocabulary: FIBO states what a
     * financial thing is, FpML how a derivatives trade is written down, and FIX how the front office talks
     * to the market and the back office settles what it did.
     */
    FIX {
        @Override
        public TermIndex index() {
            return InjectedTerms.of(FixTerms.fromClasspath(), name());
        }

        @Override
        public String description() {
            return "The FIX protocol as FIX Orchestra states it: how the front office talks to the market and the back office settles.";
        }

        @Override
        public String publishedAt() {
            return "https://www.fixtrading.org/standards/fix-orchestra/";
        }

        @Override
        public List<SkosConcept> publishedConcepts() {
            return TermVocabularies.FIX.concepts();
        }
    },

    /**
     * The Common Weakness Enumeration, the security-side vocabulary: a weakness's name is a phrase a
     * program working in security writes, and each concept is the weakness's own MITRE permalink.
     */
    CWE {
        @Override
        public TermIndex index() {
            return InjectedTerms.of(CweTerms.fromClasspath(), name());
        }

        @Override
        public String description() {
            return "The Common Weakness Enumeration: the names MITRE states for software weaknesses.";
        }

        @Override
        public String publishedAt() {
            return "https://cwe.mitre.org/";
        }

        @Override
        public List<SkosConcept> publishedConcepts() {
            return TermVocabularies.CWE.concepts();
        }
    },

    /**
     * The BIAN Service Landscape's domain names. The taxonomy is functional and placement-read where it is
     * read for an answer; the control matches its labels as terms, because a name like
     * {@code TermDeposit} is what a banking repository writes and a document parser does not.
     */
    BIAN {
        @Override
        public TermIndex index() {
            return InjectedTerms.of(InjectedTaxonomy.of(publishedConcepts(), name()), name());
        }

        @Override
        public String description() {
            return "The BIAN Service Landscape: the business capabilities a bank's services are named by.";
        }

        @Override
        public String publishedAt() {
            return "https://bian.org/servicelandscape/";
        }

        @Override
        public List<SkosConcept> publishedConcepts() {
            return TermVocabularies.BIAN.concepts();
        }
    };

    public abstract TermIndex index();

    /** The publisher and what its terms state, in one sentence, for a page naming the vocabulary. */
    public abstract String description();

    /** Where the publisher publishes it, so a page naming a vocabulary can link to the thing it names. */
    public abstract String publishedAt();

    /** What the branch rule is told the publisher states, the same contract as the matched list. */
    public abstract List<SkosConcept> publishedConcepts();

    /** Both readings of one parsed tree against this control — every match, and the corroborated ones. */
    public CorroboratedReading reading(final ParsedRepository parsed) {
        return CorroboratedReading.of(index(), publishedConcepts(), parsed);
    }
}
