package io.github.fiftieshousewife.codesemantics.engine.reading;

/**
 * One word a stage took out, with how often it had been written and which stage removed it.
 *
 * <p>A word absent from the end of the pipeline and a word no stage ever saw are different findings, and
 * this is what keeps them apart.
 *
 * @param word        the word as the stage that removed it spelled it
 * @param occurrences how often the repository had written it when it was removed
 * @param stage       the stage whose rule removed it
 */
public record RemovedWord(String word, int occurrences, WordStage stage) {
}
