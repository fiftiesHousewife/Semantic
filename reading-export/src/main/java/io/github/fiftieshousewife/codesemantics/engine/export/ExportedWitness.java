package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.List;
import java.util.Objects;

/**
 * One word's testimony for a topic: how often it was written, how much of the topic's mass it carried, the
 * resources that named the topic for it, and the phrases it was read in.
 *
 * <p>Occurrences and mass are both carried because they disagree. A word written five hundred times can
 * carry almost no mass where the frequency list says it narrows nothing, and a word written twice can carry
 * more, so a consumer ordering by count gets a different answer from the one the reading reports.
 *
 * @param word        the word as the splitter produced it
 * @param occurrences how often it was written
 * @param mass        how much of the topic's mass it carried
 * @param sources     the resources naming this topic for this word, in their own published spelling
 * @param quotations  the phrases it was read in, with where each was written
 */
public record ExportedWitness(String word, int occurrences, double mass, List<String> sources,
                              List<ExportedQuotation> quotations) {

    public ExportedWitness {
        Objects.requireNonNull(word, "word");
        sources = List.copyOf(sources);
        quotations = List.copyOf(quotations);
    }
}
