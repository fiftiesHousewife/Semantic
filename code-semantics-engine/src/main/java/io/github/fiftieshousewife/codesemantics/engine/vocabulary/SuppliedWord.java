package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

/**
 * One word the reading scored, admitted against every reference, and left out anyway because two published
 * resources place it inside the language rather than in the dictionary — {@code by}, {@code from},
 * {@code beside}. English put it inside a name, so writing it was not a choice about a subject.
 *
 * <p>It is a different loss from {@link RefusedWord}, which names the references whose bar a word did not
 * clear. This word cleared every bar. Pooling the two into one count is what makes a figure called
 * <em>words below every threshold</em> include words below none.
 *
 * @param word        the surface the repository wrote
 * @param occurrences how often it wrote it
 * @param share       the share of every word occurrence in the repository this word holds
 * @param site        one place to go and look at it
 */
public record SuppliedWord(String word, int occurrences, double share, String site) {
}
