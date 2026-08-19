package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * Whether a subject states the category token a project's own publisher gives for it.
 *
 * <p>This is the expected result of the phrase arm, and it is written this way so that nothing here picks a
 * winner. The Apache Software Foundation states {@code content} for Tika, {@code build-management} for
 * Maven and {@code security} for Santuario, in a DOAP record published separately from the code. OpenAlex
 * states what each of its topics covers. A subject meets the expectation when the second contains the
 * first, and both halves are somebody else's statement.
 *
 * <p>A token of several words is met only where the subject states <em>every</em> one of them.
 * {@code build-management} is one category rather than two, so a topic about management that has nothing to
 * do with building has not met it.
 *
 * <p>The match is on whole words. A topic stating {@code contentious} has not stated {@code content}, and a
 * substring test would mark several hundred subjects that share a stem with the token and nothing else.
 */
public final class StatedDomainToken {

    /** What separates the words of a category token: the DOAP records hyphenate, so this is their spelling. */
    private static final Pattern TOKEN_WORDS = Pattern.compile("[^\\p{L}]+");

    private final List<String> words;

    public StatedDomainToken(final String token) {
        this.words = TOKEN_WORDS.splitAsStream(token.toLowerCase(Locale.ROOT))
                .filter(word -> !word.isEmpty())
                .toList();
        if (words.isEmpty()) {
            throw new IllegalArgumentException("A category token of no words marks every subject or none, "
                    + "and either way states no expectation: " + token);
        }
    }

    /** Whether this subject states every word of the token, in whatever order and wherever in its account. */
    public ProbabilityOfSuperiority.Expectation of(final SkosConcept subject) {
        final String stated = subject.definition().toLowerCase(Locale.ROOT);
        return words.stream().allMatch(word -> states(stated, word))
                ? ProbabilityOfSuperiority.Expectation.MEETS_IT
                : ProbabilityOfSuperiority.Expectation.DOES_NOT;
    }

    private static boolean states(final String stated, final String word) {
        return Pattern.compile("\\b" + Pattern.quote(word) + "\\b").matcher(stated).find();
    }
}
