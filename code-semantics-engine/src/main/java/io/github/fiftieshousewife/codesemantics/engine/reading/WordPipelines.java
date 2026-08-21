package io.github.fiftieshousewife.codesemantics.engine.reading;

import io.github.fiftieshousewife.codesemantics.engine.theme.ContentWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.FunctionWords;

/**
 * The pipeline this library reads Java with, built from the bundled resources.
 *
 * <p>It exists so that every reading names the same pipeline rather than each assembling one. A second
 * assembly is a second set of rules however identical it looks the day it is written.
 */
public final class WordPipelines {

    private WordPipelines() {
    }

    /**
     * Java's, over the bundled dictionaries: symbol length, cited shorthand, the words English supplies,
     * and WordNet's morphology.
     */
    public static WordPipeline overJava(final ContentWords content) {
        return new WordPipeline(content::tooShortToMean, CitedExpansions.fromClasspath(),
                FunctionWords.fromClasspath()::includes, content::lemmaOrSurface, Dialect.java());
    }
}
