package io.github.fiftieshousewife.codesemantics.engine.theme;

/**
 * How much writing a word narrows what a phrase is about, on a scale its own reference bounds at one.
 *
 * <p>Two references answer it and they answer about different populations. Prose is English, so the
 * published frequency list is what says {@code the} narrows nothing. A declared name is working Java, so a
 * corpus of working Java is what says {@code get} and {@code id} narrow nothing — English calls both rare
 * and is wrong about code.
 */
public interface WordNarrowing {

    /** How much the word narrows a subject, between nothing and the whole of one word's worth. */
    double of(String word);
}
