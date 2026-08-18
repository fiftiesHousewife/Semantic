package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

import io.github.fiftieshousewife.codesemantics.engine.behaviour.Behaviour;
import io.github.fiftieshousewife.codesemantics.engine.behaviour.Behaviours;
import io.github.fiftieshousewife.codesemantics.engine.behaviour.PropertyAccessors;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import io.github.fiftieshousewife.bi.lexicon.WiktionaryCitations;
import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;
import io.github.fiftieshousewife.codesemantics.engine.theme.WordSpecificity;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.FunctionWords;

/**
 * Every word and multi-word phrase a tree's chosen names state four or more times: the words folded to
 * their dictionary forms, the phrases as written — except that a method name stating a clause is carried
 * as that clause, verb first in its dictionary form. A word spelling the source set the file sits in
 * restates the layout and is left out, and an accessor's stated prefix is left out the same way; the
 * property words it names are kept. It is the flat view the weighted rankings rest on, printed so the raw
 * counts can be looked at with no weighting in the way.
 */
public final class WordAndPhraseProbe {

    private static final int LEAST_WRITTEN = 4;

    private WordAndPhraseProbe() {
    }

    public static void main(final String[] args) {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final Tally tally = new Tally();
        reading.parsed().files().forEach(tally::read);
        System.out.printf("%n%s — chosen names: %,d distinct words, %,d distinct phrases%n",
                reading.root().getFileName(), tally.words.size(), tally.phrases.size());
        tally.print();
    }

    /** The two counts, fed by every chosen name of every file. */
    private static final class Tally {

        private final IdentifierWords split = IdentifierWords.fromClasspath();
        private final ContentWords dictionary = ContentWords.fromClasspath();
        private final Behaviours behaviours = Behaviours.fromClasspath();
        private final PropertyAccessors accessors = new PropertyAccessors();
        private final FunctionWords language = FunctionWords.fromClasspath();
        private final WiktionaryCitations abbreviations = WiktionaryCitations.fromClasspath();
        private final WordSpecificity specificity = WordSpecificity.fromClasspath();
        private final Map<String, Integer> words = new HashMap<>();
        private final Map<String, Integer> phrases = new HashMap<>();
        private int languageSupplied;
        private int expanded;

        void read(final ParsedFile file) {
            file.occurrences().stream()
                    .filter(occurrence -> occurrence.form().isChosenName())
                    .forEach(occurrence -> counted(occurrence, file));
        }

        private void counted(final NameOccurrence occurrence, final ParsedFile file) {
            final List<String> chosen = split.of(occurrence.text()).words().stream()
                    .map(word -> word.toLowerCase(Locale.ROOT))
                    .filter(word -> !word.equals(PublishedSourceSets.sourceSetOf(file.scope())))
                    .toList();
            if (chosen.isEmpty()) {
                return;
            }
            if (occurrence.form() == NameForm.METHOD) {
                final Optional<Behaviour> clause = behaviours.of(occurrence, file);
                if (clause.isPresent()) {
                    phraseOf(clause.get().verb(), clause.get().object());
                    return;
                }
                if (accessors.claims(chosen)) {
                    phraseOf("", chosen.subList(1, chosen.size()));
                    return;
                }
            }
            phraseOf("", chosen);
        }

        /** A word the language supplied is counted apart, the way the vocabulary report partitions it. */
        private void worded(final String word) {
            if (dictionary.tooShortToMean(word) || language.includes(word)) {
                languageSupplied++;
                return;
            }
            words.merge(dictionary.lemmaOf(word).orElseGet(() -> expansionOf(word)), 1, Integer::sum);
        }

        /** The one expansion the abbreviations resource states, or the word: an ambiguous entry abstains. */
        private String expansionOf(final String word) {
            final List<String> stated = abbreviations.citationsOf(word).stream()
                    .map(WiktionaryCitations.Citation::expansion)
                    .distinct()
                    .toList();
            if (stated.size() != 1 || stated.getFirst().contains(" ")) {
                return word;
            }
            expanded++;
            return stated.getFirst();
        }

        /** One name's contribution: each word to the word count, the whole run to the phrase count. */
        private void phraseOf(final String verb, final List<String> object) {
            if (!verb.isEmpty()) {
                words.merge(verb, 1, Integer::sum);
            }
            object.forEach(this::worded);
            final List<String> stated = verb.isEmpty() ? object
                    : java.util.stream.Stream.concat(java.util.stream.Stream.of(verb), object.stream()).toList();
            if (stated.size() > 1) {
                phrases.merge(String.join(" ", stated), 1, Integer::sum);
            }
        }

        void print() {
            System.out.printf("  %,d word occurrences were the language's own, set apart as the ranking "
                            + "sets them; %,d were an abbreviation its resource states one expansion for%n",
                    languageSupplied, expanded);
            printed(words, "word, as its dictionary form");
            printed(phrases, "phrase — a clause verb first, any other name as written");
        }

        private void printed(final Map<String, Integer> counts, final String label) {
            System.out.printf("%n  %-52s %7s %9s%n", label, "written", "weighted");
            counts.entrySet().stream()
                    .filter(entry -> entry.getValue() >= LEAST_WRITTEN)
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .forEach(entry -> System.out.printf("  %-52s %7d %9.1f%n", entry.getKey(),
                            entry.getValue(), entry.getValue() * specificity.of(entry.getKey())));
        }
    }
}
