package io.github.fiftieshousewife.bi.lexicon.extraction;

/**
 * One node of an OSCAL catalog — a group or a control — read to what a taxonomy row needs of it: what the
 * publisher calls it, what class of thing it says the node is, the prose it defines it by, and the node it
 * was nested under.
 *
 * <p>{@code status} is the publisher's own field and {@code withdrawn} its own word for a concept a later
 * edition no longer states. Carrying it this far and refusing it afterwards is what lets the refusal cite
 * the document rather than a view about which parts of a framework are worth keeping.
 */
public record OscalControl(String id, String kind, String title, String label, String status,
        String definition, String broader) implements Nested {

    private static final String WITHDRAWN = "withdrawn";

    /** Whether the publisher states this concept as withdrawn from the edition the document publishes. */
    public boolean withdrawn() {
        return WITHDRAWN.equals(status);
    }
}
