package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.theme.InjectedTaxonomy;
import io.github.fiftieshousewife.codesemantics.lexicon.CweTerms;
import io.github.fiftieshousewife.codesemantics.lexicon.FixTerms;
import io.github.fiftieshousewife.codesemantics.lexicon.FpmlTerms;
import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.lexicon.TermVocabularies;

/**
 * Every term vocabulary this library bundles, in one list, matched against declared names the same way.
 *
 * <p>It was two lists — the ones a reading matched and the ones it matched as out-of-domain controls — and
 * both enums' own javadoc said which is which depends on the repository under reading rather than on the
 * vocabulary. A finance ontology is the control on a linguistics library and the subject of a trading
 * system, and nothing in the file says which repository it will meet.
 *
 * <p>What each vocabulary <em>is</em> is not stated here. The name a match cites, the publisher, the link,
 * the one-line description and the subject the standard is about all come off the resource's own provenance
 * header through {@link TermVocabularies}, so a vocabulary that is re-extracted or re-published carries its
 * own account of what it became.
 *
 * <p>A consumer wanting one more injects it by path and passes the index alongside these.
 */
public enum BundledTaxonomies {

    /** The Ontologies of Linguistic Annotation, the in-domain case for this repository. */
    OLIA(TermVocabularies.OLIA) {
        @Override
        public TermIndex index() {
            return LinguisticTerms.fromClasspath();
        }
    },

    /** The Computer Science Ontology, the field the read repositories are software in. */
    CSO(TermVocabularies.CSO) {
        @Override
        public TermIndex index() {
            return ComputingTerms.fromClasspath();
        }

        /**
         * CSO's concepts are the ones its index reaches a term for, and OLiA's are the whole published
         * list. The two answer it from different places and that is preserved rather than settled here:
         * making them agree moves CSO's reading, which is a measurement rather than a tidy-up.
         */
        @Override
        public List<SkosConcept> publishedConcepts() {
            return index().publishedConcepts();
        }
    },

    /** The Financial Industry Business Ontology: what a financial thing is. */
    FIBO(TermVocabularies.FIBO) {
        @Override
        public TermIndex index() {
            return FinanceTerms.fromClasspath();
        }
    },

    /** The Financial products Markup Language: how a derivatives trade is written down on the wire. */
    FPML(TermVocabularies.FPML) {
        @Override
        public TermIndex index() {
            return InjectedTerms.of(FpmlTerms.fromClasspath(), source());
        }
    },

    /** The FIX protocol as FIX Orchestra states it. */
    FIX(TermVocabularies.FIX) {
        @Override
        public TermIndex index() {
            return InjectedTerms.of(FixTerms.fromClasspath(), source());
        }
    },

    /** The Common Weakness Enumeration: a weakness's name is a phrase a security program writes. */
    CWE(TermVocabularies.CWE) {
        @Override
        public TermIndex index() {
            return InjectedTerms.of(CweTerms.fromClasspath(), source());
        }
    },

    /**
     * The BIAN Service Landscape's domain names. Its rows carry prose, so it is placement-read where it is
     * read for an answer; here its labels are matched as terms, because a name like {@code TermDeposit} is
     * what a banking repository writes and a document parser does not.
     */
    BIAN(TermVocabularies.BIAN) {
        @Override
        public TermIndex index() {
            return InjectedTerms.of(InjectedTaxonomy.of(publishedConcepts(), source()), source());
        }
    };

    private final TermVocabularies vocabulary;

    BundledTaxonomies(final TermVocabularies vocabulary) {
        this.vocabulary = vocabulary;
    }

    public abstract TermIndex index();

    /** What a match cites, off the resource's own header. */
    public String source() {
        return vocabulary.publisher();
    }

    /** The publisher and what its terms state, in one sentence, for a page naming the vocabulary. */
    public String description() {
        return vocabulary.stated().description();
    }

    /**
     * The subject the standard itself is about, in as few words as the publisher's own name and scope
     * statement allow. It is a curated statement of a published standard and not of a corpus, which is why
     * it is read off the resource's own header rather than written here.
     */
    public String subject() {
        return vocabulary.stated().subject();
    }

    /** Where the publisher publishes it, so a page naming a vocabulary can link to the thing it names. */
    public String publishedAt() {
        return vocabulary.stated().publishedAt();
    }

    /** What the branch rule is told the publisher states, which decides which concepts sit beside which. */
    public List<SkosConcept> publishedConcepts() {
        return vocabulary.concepts();
    }

    /** Both readings of one parsed tree against this vocabulary — every match, and the corroborated ones. */
    public CorroboratedReading reading(final ParsedRepository parsed) {
        return CorroboratedReading.of(index(), publishedConcepts(), parsed);
    }

    /** The indexes matched beside the named one, for a reading that already holds it. */
    public static List<TermIndex> besides(final BundledTaxonomies held) {
        return Stream.of(values()).filter(taxonomy -> taxonomy != held)
                .map(BundledTaxonomies::index).toList();
    }
}
