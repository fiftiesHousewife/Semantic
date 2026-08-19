package io.github.fiftieshousewife.codesemantics.engine.theme;

import io.github.fiftieshousewife.bi.lexicon.SkosConcept;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * How far a repository got towards one keyword a subject scheme published, in its declared names and in its
 * prose, reported apart.
 *
 * <p>The two populations are never summed. A run an author declared is the program working in a field and
 * the same run in a javadoc sentence is the author writing about it, and a census that added them would be
 * unable to say which of the two a repair would have to reach.
 */
public record KeywordReach(String concept, String keyword, String topic,
                           FurthestWritten.Reach inDeclarations, FurthestWritten.Reach inProse) {

    public static KeywordReach of(final SkosConcept keyword, final IdentifierWords identifiers,
                                  final FurthestWritten declarations, final FurthestWritten prose) {
        final java.util.List<String> words = identifiers.of(keyword.prefLabel()).words();
        return new KeywordReach(keyword.concept(), keyword.prefLabel(), keyword.broader(),
                declarations.of(words).reach(), prose.of(words).reach());
    }

    /** Written as this run in a sentence and never in a declared name, which is what a prose arm would buy. */
    public boolean writtenOnlyInProse() {
        return inDeclarations != FurthestWritten.Reach.AS_THIS_RUN
                && inProse == FurthestWritten.Reach.AS_THIS_RUN;
    }
}
