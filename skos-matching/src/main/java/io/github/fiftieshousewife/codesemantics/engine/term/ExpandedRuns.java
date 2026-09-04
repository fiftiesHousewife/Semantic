package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;
import io.github.fiftieshousewife.codesemantics.lexicon.Lexicon;
import io.github.fiftieshousewife.codesemantics.lexicon.WiktionaryCitations;
import io.github.fiftieshousewife.codesemantics.lexicon.WordNetLexicon;

/**
 * A run of words with a shortened word written out as the expansion a citation states for it, and then in
 * its dictionary form: {@code extract info} as <em>extract information</em>, which is what a taxonomy
 * publishing {@code extracting information} wrote.
 *
 * <p>It sits between the lemma normalisation and the sense normalisation because that is the size of the step it takes.
 * A lemma is one word and its inflections. An expansion is one word and the longer word a dictionary states it stands
 * for, which is still one word — where a sense is any other word that happens to share a meaning, and is the
 * normalisation whose word-by-word reading had to be taken out for turning {@code set} into {@code put}.
 *
 * <p><b>A token several sources expand differently is not expanded at all.</b> Wiktionary cites
 * {@code msg} as <em>message</em>, <em>Madison Square Garden</em> and <em>monosodium glutamate</em>, and
 * {@code num} as <em>number</em>, <em>numeral</em>, <em>numbers</em> and the National Union of
 * Mineworkers. Nothing in the file ranks them — its own header says it cites usage and leaves the reader
 * to vote — so choosing one would be this library stating which reading a repository meant. Of the 22,411
 * tokens it cites, 15,048 carry exactly one expansion and only those are read; the rest keep the word as
 * written, which is what the narrower normalisations already compare.
 *
 * <p><b>A word English uses in its own right is written out only where the expansion means the same
 * thing.</b> Wiktionary cites an abbreviation sense for plenty of ordinary words — {@code head} as
 * <em>headline</em> in journalism, {@code part} as <em>participle</em> in grammar, {@code heads} as
 * <em>headphones</em>, {@code enter} as <em>enterprise</em> — and writing those out matched a repository's
 * {@code head} to FIX's {@code Headline} 533 times on one reading. So where WordNet knows the token as a
 * word, the expansion is taken only if WordNet carries the two in the same sense, which is what a
 * clipping is: {@code info} and {@code information} are one sense and {@code head} and {@code headline}
 * are two. A token WordNet does not know as a word at all — {@code svr}, {@code qty} — is a genuine
 * shortening and is written out without that test.
 *
 * <p><b>It is symmetric and idempotent.</b> The same normalisation is taken of the publisher's label and
 * of the words the repository wrote, and a word that is not a cited abbreviation is left alone — so
 * {@code information} normalises to itself and meets {@code info} written out.
 */
public final class ExpandedRuns implements TermNormalisation<List<String>> {

    private final Map<String, String> uniquelyCited;

    private final ContentWords words;

    public ExpandedRuns(final WiktionaryCitations citations, final java.util.Set<String> tokens,
                        final ContentWords words, final Lexicon lexicon) {
        this.uniquelyCited = tokens.stream()
                .map(token -> Map.entry(token, expansionsOf(citations, token)))
                .filter(cited -> cited.getValue().size() == 1)
                .filter(cited -> meansTheSame(lexicon, cited.getKey(), cited.getValue().getFirst()))
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        cited -> cited.getValue().getFirst()));
        this.words = words;
    }

    public static ExpandedRuns fromClasspath() {
        final WiktionaryCitations citations = WiktionaryCitations.fromClasspath();
        return new ExpandedRuns(citations, citations.tokens(), ContentWords.fromClasspath(),
                WordNetLexicon.fromClasspath());
    }

    /**
     * Whether writing the token out keeps its meaning: it is either a shortening English has no word for,
     * or WordNet carries it and its expansion in one sense.
     */
    private static boolean meansTheSame(final Lexicon lexicon, final String token,
                                        final String expansion) {
        return lexicon.commonestSense(token)
                .map(sense -> lexicon.commonestSense(expansion).filter(sense::equals).isPresent())
                .orElse(true);
    }

    private static List<String> expansionsOf(final WiktionaryCitations citations, final String token) {
        return citations.citationsOf(token).stream()
                .map(WiktionaryCitations.Citation::expansion)
                .map(expansion -> expansion.toLowerCase(Locale.ROOT))
                .distinct()
                .toList();
    }

    /**
     * The run written out and read as dictionary forms, or nothing where a word has no dictionary form —
     * the lemma normalisation's own rule, because this normalisation ends in a lemma.
     */
    @Override
    public Optional<List<String>> of(final List<String> run) {
        final List<String> read = run.stream()
                .map(this::writtenOut)
                .map(words::lemmaOf)
                .flatMap(Optional::stream)
                .toList();
        return Optional.of(read).filter(lemmas -> !lemmas.isEmpty() && lemmas.size() == run.size());
    }

    private String writtenOut(final String word) {
        return uniquelyCited.getOrDefault(word.toLowerCase(Locale.ROOT), word);
    }

    @Override
    public MatchNormalisation normalisation() {
        return MatchNormalisation.EXPANSIONS;
    }
}
