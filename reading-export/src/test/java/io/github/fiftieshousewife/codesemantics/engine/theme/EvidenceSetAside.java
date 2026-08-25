package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.List;

import io.github.fiftieshousewife.codesemantics.engine.reading.RepositoryLegibility;
import io.github.fiftieshousewife.codesemantics.engine.reading.UnreadWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.ChosenWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.RefusedWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.RefusedWords;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.SuppliedWord;
import io.github.fiftieshousewife.codesemantics.engine.vocabulary.VocabularyNull;

/**
 * The rows behind two of the counts {@code reading.json} states under {@code setAside}: the words no bundled
 * resource has an entry for, and the words a resource read and the vocabulary null cut.
 *
 * <p>Three different losses, three lists. A word nothing could read was never scored; a word below every
 * threshold was scored and found no denser here than in ordinary English or the platform; a word English
 * supplies cleared every threshold and was left out anyway. Pooling them would need a discriminator meaning
 * different things on each side.
 *
 * <p><b>The last two reconcile the export's count and it does not name them apart.</b>
 * {@code setAside.wordsBelowEveryThreshold} subtracts the signals from the ranking, so it carries both rules
 * under the name of one.
 *
 * <p>Both are carried whole rather than ranked and truncated. They are what a reading cannot see, so a
 * ceiling on them would be the reading deciding how much of its own blindness to report.
 *
 * @param wordsNoResourceCovers    every word no bundled resource has an entry for, most-written first
 * @param wordsBelowEveryThreshold every word a reference's own bar refused, with which references and by how much
 * @param wordsTheLanguageSupplies every word that cleared every bar and is English rather than a subject
 */
record EvidenceSetAside(List<UnreadWords.Sighting> wordsNoResourceCovers,
                        List<RefusedWord> wordsBelowEveryThreshold,
                        List<SuppliedWord> wordsTheLanguageSupplies) {

    static EvidenceSetAside of(final RepositoryLegibility legibility, final List<ChosenWord> ranked,
                               final List<VocabularyNull.Bar> bars) {
        final UnreadWords unread = legibility.repository().unread();
        final RefusedWords refused = new RefusedWords();
        final java.util.Map<String, Double> byReference = VocabularyNull.byReference(bars);
        return new EvidenceSetAside(unread.mostWritten(unread.occurrences().size()),
                refused.in(ranked, byReference), refused.suppliedByTheLanguage(ranked, byReference));
    }
}
