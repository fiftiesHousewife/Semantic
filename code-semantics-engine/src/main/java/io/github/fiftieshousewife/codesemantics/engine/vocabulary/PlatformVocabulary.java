package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.util.Map;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * What the Java platform's own API is written in: the type names it declares, split by the same grammar this
 * repository's names are split by, as a distribution over words.
 *
 * <p>It is the reference for the objection ordinary English cannot answer. {@code list}, {@code map},
 * {@code stream}, {@code buffer}, {@code handler} and {@code builder} are rare enough in English to look
 * like specialist vocabulary and are nothing of the kind: they are what Java is written in, and a repository
 * writing them at the platform's own rate has said only that it is a Java program.
 *
 * <p>The names are the platform's own statement of its API and the split is the splitter this library
 * already uses, so both sides of the comparison are made the same way. Nothing is listed here.
 */
public final class PlatformVocabulary implements ReferenceVocabulary {

    private static final String NAME = "the platform's own API";

    private final Map<String, Double> shareByWord;

    public PlatformVocabulary(final PlatformNames names, final IdentifierWords words) {
        final Map<String, Long> occurrences = names.declared().stream()
                .flatMap(name -> words.of(name).words().stream())
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        final double written = occurrences.values().stream().mapToLong(Long::longValue).sum();
        this.shareByWord = occurrences.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, word -> word.getValue() / written));
    }

    public static PlatformVocabulary ofSystem() {
        return new PlatformVocabulary(PlatformNames.ofSystem(), IdentifierWords.fromClasspath());
    }

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public Map<String, Double> shareByWord() {
        return shareByWord;
    }
}
