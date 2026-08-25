package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.OpenAlexTopics;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;
import io.github.fiftieshousewife.codesemantics.engine.term.SenseRuns;

/**
 * Which words stop a published keyword being read as a run of senses.
 *
 * <p>A sense match needs both sides to reach the same key, so the scheme's own side bounds the arm however
 * well the repository's side reads. This counts what the dictionary cannot read on the scheme side and
 * names the words responsible, so a decision to bundle a catalogue of abbreviations is taken against the
 * words that would actually be bought rather than against the ones it is easy to imagine.
 */
public final class UnreadRunsProbe {

    private static final int SHOWN = 40;

    private UnreadRunsProbe() {
    }

    public static void main(final String[] args) {
        final List<SkosConcept> keywords = new PublishedKeywords().in(OpenAlexTopics.fromClasspath()
                .described());
        final IdentifierWords identifiers = IdentifierWords.fromClasspath();
        final SenseRuns senses = SenseRuns.fromClasspath();
        final WordNetLexicon lexicon = WordNetLexicon.fromClasspath();

        final Map<String, Integer> blocking = new HashMap<>();
        int runs = 0;
        int multiWord = 0;
        int read = 0;
        int multiWordRead = 0;
        for (final SkosConcept keyword : keywords) {
            final List<String> words = identifiers.of(keyword.prefLabel()).words();
            if (words.isEmpty()) {
                continue;
            }
            runs++;
            final boolean longer = words.size() > 1;
            multiWord += longer ? 1 : 0;
            if (senses.of(words).isPresent()) {
                read++;
                multiWordRead += longer ? 1 : 0;
                continue;
            }
            words.stream().filter(word -> lexicon.commonestSense(word).isEmpty())
                    .forEach(word -> blocking.merge(word, 1, Integer::sum));
        }

        System.out.printf("%n%d keyword runs, %d of them more than one word%n", runs, multiWord);
        System.out.printf("read as senses: %d (%.1f%%); of the multi-word runs %d (%.1f%%)%n",
                read, 100.0 * read / runs, multiWordRead, 100.0 * multiWordRead / multiWord);
        System.out.printf("%d distinct words the dictionary cannot read at all%n%n", blocking.size());

        System.out.printf("%-28s %8s%n", "word", "runs it blocks");
        blocking.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Comparator.comparing(Map.Entry::getKey)))
                .limit(SHOWN)
                .forEach(word -> System.out.printf("%-28s %8d%n", word.getKey(), word.getValue()));
    }
}
