package io.github.fiftieshousewife.codesemantics.vocabulary.page;

/**
 * One published term of more than one word that the repository wrote.
 *
 * @param vocabulary  the publisher that states it
 * @param term        the label the publisher states
 * @param occurrences how often the repository wrote it
 * @param placedUnder the concept the publisher places it under
 */
public record WrittenPhrase(String vocabulary, String term, int occurrences, String placedUnder) {
}
