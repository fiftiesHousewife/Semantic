package org.fifties.housewife.codesemantics.engine.reading;

import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * Accumulates one scope's identifier occurrences into a {@link ScopeLegibility}. Words are tallied as they
 * arrive and cited once each at the end, so a corpus writing {@code evidence} a thousand times pays for one
 * dictionary lookup rather than a thousand.
 *
 * <p>A token the language's own catalogue names is counted and then set aside rather than read as a word:
 * {@code final} and {@code return} are the specification's vocabulary, and letting the frequency list read
 * them as common English would inflate every legibility figure by about the share of a Java file that is
 * grammar.
 */
public final class LegibilityTally {

    private final CitedWords cited;
    private final IdentifierWords words;
    private final JavaLanguageKeywords keywords;

    private final Map<String, Integer> occurrencesByWord = new HashMap<>();
    private final Map<String, String> firstSiteByWord = new HashMap<>();

    private int identifiers;
    private int languageWords;
    private int gluedRunsRead;

    public LegibilityTally(final CitedWords cited, final IdentifierWords words,
                           final JavaLanguageKeywords keywords) {
        this.cited = cited;
        this.words = words;
        this.keywords = keywords;
    }

    public void add(final String site, final IdentifierOccurrence occurrence) {
        identifiers++;
        if (keywords.names(occurrence.identifier())) {
            languageWords++;
            return;
        }
        final IdentifierReading reading = words.of(occurrence.identifier());
        gluedRunsRead += reading.gluedRunsRead();
        reading.words().forEach(word -> {
            occurrencesByWord.merge(word, 1, Integer::sum);
            firstSiteByWord.putIfAbsent(word, site + ":" + occurrence.line());
        });
    }

    public ScopeLegibility reading(final String name, final int files) {
        final Map<String, Set<EvidenceSource>> sourcesByWord = occurrencesByWord.keySet().stream()
                .collect(Collectors.toUnmodifiableMap(Function.identity(), cited::citing));
        return new ScopeLegibility(name, files, counts(sourcesByWord), occurrencesBySource(sourcesByWord),
                soleOccurrencesBySource(sourcesByWord), unread(sourcesByWord));
    }

    private OccurrenceCounts counts(final Map<String, Set<EvidenceSource>> sourcesByWord) {
        return new OccurrenceCounts(identifiers, languageWords,
                occurrencesOf(occurrencesByWord.keySet()), occurrencesOf(cited(sourcesByWord)),
                gluedRunsRead, occurrencesByWord.size(), wordsSeenOnce());
    }

    private Map<EvidenceSource, Integer> occurrencesBySource(
            final Map<String, Set<EvidenceSource>> sourcesByWord) {
        final Map<EvidenceSource, Integer> bySource = new EnumMap<>(EvidenceSource.class);
        sourcesByWord.forEach((word, sources) ->
                sources.forEach(source -> bySource.merge(source, occurrencesByWord.get(word), Integer::sum)));
        return bySource;
    }

    /** What each resource carries by itself: the occurrences of words it is the only citation for. */
    private Map<EvidenceSource, Integer> soleOccurrencesBySource(
            final Map<String, Set<EvidenceSource>> sourcesByWord) {
        final Map<EvidenceSource, Integer> alone = new EnumMap<>(EvidenceSource.class);
        sourcesByWord.entrySet().stream()
                .filter(word -> word.getValue().size() == 1)
                .forEach(word -> alone.merge(word.getValue().iterator().next(),
                        occurrencesByWord.get(word.getKey()), Integer::sum));
        return alone;
    }

    private UnreadWords unread(final Map<String, Set<EvidenceSource>> sourcesByWord) {
        final Set<String> unread = sourcesByWord.entrySet().stream()
                .filter(word -> word.getValue().isEmpty())
                .map(Map.Entry::getKey)
                .collect(Collectors.toUnmodifiableSet());
        return new UnreadWords(
                unread.stream().collect(Collectors.toUnmodifiableMap(Function.identity(), occurrencesByWord::get)),
                unread.stream().collect(Collectors.toUnmodifiableMap(Function.identity(), firstSiteByWord::get)));
    }

    private static Set<String> cited(final Map<String, Set<EvidenceSource>> sourcesByWord) {
        return sourcesByWord.entrySet().stream()
                .filter(word -> !word.getValue().isEmpty())
                .map(Map.Entry::getKey)
                .collect(Collectors.toUnmodifiableSet());
    }

    private int occurrencesOf(final Collection<String> surfaces) {
        return surfaces.stream().mapToInt(occurrencesByWord::get).sum();
    }

    private int wordsSeenOnce() {
        return (int) occurrencesByWord.values().stream().filter(occurrences -> occurrences == 1).count();
    }
}
