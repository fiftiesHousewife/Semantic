package io.github.fiftieshousewife.codesemantics.vocabulary.page;

/**
 * The spelling a reader sees for a word the export publishes. The topical resources join a published run
 * with underscores and the export currently writes that joiner, so {@code interest_rate} reads as an
 * identifier where the author wrote a term; a page shows the words with the space between them.
 */
final class PublishedSpelling {

    private PublishedSpelling() {
    }

    static String shown(final String word) {
        return word.replace('_', ' ');
    }
}
