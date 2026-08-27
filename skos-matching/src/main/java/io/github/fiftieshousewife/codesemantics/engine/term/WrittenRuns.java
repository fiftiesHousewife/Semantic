package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.List;
import java.util.Locale;

import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedRepository;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * Every run of words a repository's declared names state, in reading order.
 *
 * <p>It is the reading {@link TermReading} takes, stopped one step earlier: the same declared names, split by
 * the same grammar into the same runs, kept as words rather than matched against a source. What a term
 * reading matches and what a null deals out again have to be the same words, or the null is of a different
 * repository.
 *
 * <p>The runs are folded to lower case once here. An identifier's capitalisation is a convention of the
 * language it was written in and says nothing about the word, and a null that folded it again on every
 * deal would spend its time on the fold rather than on the count.
 */
public final class WrittenRuns {

    private final IdentifierWords words;

    public WrittenRuns(final IdentifierWords words) {
        this.words = words;
    }

    public static WrittenRuns fromClasspath() {
        return new WrittenRuns(IdentifierWords.fromClasspath());
    }

    public List<WrittenRun> in(final ParsedRepository parsed) {
        return parsed.files().stream()
                .flatMap(file -> namesIn(file).stream())
                .toList();
    }

    private List<WrittenRun> namesIn(final ParsedFile file) {
        return file.occurrences().stream()
                .filter(occurrence -> occurrence.form().isChosenName())
                .flatMap(occurrence -> runsOf(occurrence).stream())
                .filter(run -> !run.words().isEmpty())
                .toList();
    }

    private static List<String> lowered(final List<String> words) {
        return words.stream().map(word -> word.toLowerCase(Locale.ROOT)).toList();
    }

    private List<WrittenRun> runsOf(final NameOccurrence occurrence) {
        return occurrence.form().vocabulary().phrasesOf(occurrence.text(), words).stream()
                .map(phrase -> new WrittenRun(lowered(phrase.words()), occurrence))
                .toList();
    }
}
