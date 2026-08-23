package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.nio.file.Path;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.reference.PooledWordShares;

/**
 * What working Java is written in, taken from a corpus of repositories drawn from a stated frame and pooled
 * into one distribution over the names they declare.
 *
 * <p>It is the reference neither ordinary English nor the platform's own API can be. English calls
 * {@code get}, {@code id} and {@code buf} rare, and the platform declares none of them in its API index, so
 * against those two a repository writing them looks like it chose them. A corpus of working repositories
 * writes them densely, which is the only evidence that says otherwise.
 */
public final class CorpusVocabulary implements ReferenceVocabulary {

    private static final String NAME = "the reference corpus";

    private final Map<String, Double> shareByWord;

    public CorpusVocabulary(final PooledWordShares corpus) {
        this.shareByWord = corpus.shareByWord();
    }

    /** The corpus this library bundles. */
    public static CorpusVocabulary fromClasspath() {
        return new CorpusVocabulary(PooledWordShares.fromClasspath());
    }

    /** A corpus table at a path, so a candidate can be measured before anything decides to bundle it. */
    public static CorpusVocabulary at(final Path table) {
        return new CorpusVocabulary(PooledWordShares.at(table));
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
