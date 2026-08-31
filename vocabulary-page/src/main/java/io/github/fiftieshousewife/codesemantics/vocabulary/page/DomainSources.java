package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * What every bundled domain source made of one reading's words, as one row each — the summary the page
 * opens on, in place of a picker that made a reader choose a source before seeing anything.
 *
 * <p><b>The rows are not pooled and the labels are never mapped.</b> WordNet's {@code computer_science},
 * OpenAlex's {@code Artificial Intelligence} and CSO's {@code computer systems} are three publishers'
 * words for overlapping subject matter, and deciding which of them mean the same thing would be this
 * project curating an observation of its own corpus. Each source therefore states what it states, in its
 * own words, and the summary is what a reader compares.
 *
 * <p>What can be compared without a mapping is coverage: how many of the same significant words a source
 * labelled with anything. A source that labels a tenth of them is stating a leading domain about a tenth
 * of the repository, and a reader who cannot see that takes its leader for the answer.
 *
 * <p><b>The share of <em>weight</em> a source placed is not that comparison and is not reported.</b> It
 * is each overlap's {@code shareOfClaimOnUnlabelledSenses} inverted, and that share is taken over the
 * words the source states any sense for — so a source whose every sense carries a label by construction,
 * which is every subject scheme here, reads 100% however few words it reached. Four of five sources
 * reported 100% under it while covering between 32 and 163 of one repository's 283 words. Counting the
 * words is the same arithmetic for all five.
 */
record DomainSources(List<Row> rows, int significantWords, int mostWordsPlaced) {

    DomainSources {
        rows = List.copyOf(rows);
    }

    /**
     * One source's standing.
     *
     * @param source        the source's own name, which is also the overlap the row opens
     * @param description   what the source labels a word by
     * @param leading       the domains it put most of the weight on, largest first
     * @param placedWords   how many of the significant words it labelled with anything
     * @param placedShare   those words as a share of the significant words, which is the one figure
     *                      computed the same way for every source
     */
    record Row(String source, String description, List<Leading> leading, int placedWords,
               double placedShare) {

        Row {
            leading = List.copyOf(leading);
        }
    }

    /** One of a source's leading domains, with its share of the weight that source placed. */
    record Leading(String domain, double share) {
    }

    /** What each source labels a word by, in the words the page states them in. */
    private static final Map<String, String> DESCRIBED = described();

    private static Map<String, String> described() {
        final Map<String, String> described = new LinkedHashMap<>();
        described.put("WordNet Domains",
                "every domain any of the word's WordNet senses states, weighted by the counts WordNet's "
                        + "own tagged corpus publishes.");
        described.put("eXtended WordNet Domains",
                "the same senses under the extended labelling, which covers senses the original leaves "
                        + "unlabelled.");
        described.put("arXiv categories",
                "every arXiv category whose published description carries the word, at its written form "
                        + "or its dictionary base form.");
        described.put("OpenAlex subfields",
                "every OpenAlex subfield holding a topic whose keywords carry the word.");
        described.put("CSO topics",
                "every area of the Computer Science Ontology holding a topic whose own label carries the "
                        + "word. CSO states labels and no prose.");
        return Map.copyOf(described);
    }

    /**
     * Every source's row, the source placing most of the weight first, with how many of the words the
     * widest-covering source reached.
     *
     * <p><b>How many words <em>no</em> source reached is not stated, because it cannot be read off these
     * rows.</b> Each row carries a count of the words its own source is silent about, and the words two
     * sources are silent about are not the same words. Answering it would need the sets rather than the
     * counts, and stating the smallest count instead would be an upper bound printed as a total.
     */
    static DomainSources of(final Map<String, DomainOverlap> bySource) {
        final List<Row> rows = bySource.entrySet().stream()
                .map(source -> row(source.getKey(), source.getValue()))
                .sorted(Comparator.comparingInt(Row::placedWords).reversed()
                        .thenComparing(Row::source))
                .toList();
        final DomainOverlap any = bySource.values().iterator().next();
        return new DomainSources(rows, any.significantWords(),
                rows.stream().mapToInt(Row::placedWords).max().orElse(0));
    }

    private static Row row(final String source, final DomainOverlap overlap) {
        final double placed = overlap.domains().stream().mapToDouble(DomainOverlap.Drawn::claim).sum()
                + overlap.otherDomains().stream().mapToDouble(DomainOverlap.LeftOut::claim).sum();
        final int words = overlap.significantWords() - overlap.wordsWithoutALabelledSense();
        return new Row(source, DESCRIBED.getOrDefault(source, ""),
                overlap.domains().stream()
                        .map(drawn -> new Leading(drawn.domain(),
                                placed == 0 ? 0 : drawn.claim() / placed))
                        .toList(),
                words,
                overlap.significantWords() == 0 ? 0 : (double) words / overlap.significantWords());
    }
}
