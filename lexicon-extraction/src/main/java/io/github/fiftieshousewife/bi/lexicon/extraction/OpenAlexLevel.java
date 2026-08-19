package io.github.fiftieshousewife.bi.lexicon.extraction;

/** One level of OpenAlex's hierarchy above a topic: the subfield, the field or the domain it is stated in. */
public record OpenAlexLevel(String concept, String label, String kind) {
}
