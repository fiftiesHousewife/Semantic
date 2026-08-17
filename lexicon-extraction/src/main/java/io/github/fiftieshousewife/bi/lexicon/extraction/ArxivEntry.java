package io.github.fiftieshousewife.bi.lexicon.extraction;

/**
 * One entry of arXiv's own subject taxonomy — a group, an archive or a category — read to what a taxonomy
 * row needs of it: the identifier arXiv classifies under, the name it publishes for it, the alias it
 * publishes beside that, the entry it is stated inside, and the prose describing what the subject covers.
 *
 * <p>{@code active} and {@code test} are arXiv's own flags. A subsumed archive stays in the module carrying
 * the category that replaced it, and one group exists only to test the site, so both are the publisher
 * saying what is not part of the live scheme — which is why they are carried this far and refused
 * afterwards rather than filtered out on the way past.
 */
public record ArxivEntry(String id, String kind, String name, String alias, String broader,
        String description, boolean active, boolean test) implements Nested {

    /** Whether arXiv states this entry as part of the scheme it currently classifies under. */
    public boolean published() {
        return active && !test;
    }
}
