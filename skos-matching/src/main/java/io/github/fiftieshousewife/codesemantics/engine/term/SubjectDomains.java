package io.github.fiftieshousewife.codesemantics.engine.term;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import io.github.fiftieshousewife.bi.lexicon.CountedSenseDomains;
import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.PublishedSubjects;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * The concepts of one stated level a subject scheme places a word under — arXiv's categories, OpenAlex's
 * subfields — read from the scheme's own subject-matter accounts, in the shape a sense-domain reading
 * takes.
 *
 * <p>A subject scheme states no senses, so each described subject whose account carries the word stands as
 * one uncounted sense, labelled with the subject's nearest stated ancestors of the named kind. A word no
 * account carries yields nothing, and a subject above which the scheme states no concept of that kind is a
 * sense with no label; the consumer counts both rather than fills them.
 *
 * <p>An account's words are indexed at their written forms and their dictionary base forms, so a plural in
 * the publisher's prose meets the dictionary-form word the reading produces. Words arrive in lower case,
 * the same contract as {@link TermIndex}.
 */
public final class SubjectDomains {

    private static final Pattern WORDS = Pattern.compile("\\p{L}+");

    private final Map<String, List<CountedSenseDomains>> domainsByWord;

    /** @param level the {@code kind} of the ancestor concepts a sense is labelled with */
    public SubjectDomains(final PublishedSubjects scheme, final Lexicon lexicon, final String level) {
        this.domainsByWord = indexed(scheme, lexicon, level);
    }

    /**
     * One uncounted sense per described subject whose subject-matter account carries the word, each
     * labelled with the subject's ancestors of the stated level in the publisher's own order, and naming
     * the subject's own label as the sense's placing label.
     */
    public List<CountedSenseDomains> countedSenseDomainsOf(final String word) {
        return domainsByWord.getOrDefault(word, List.of());
    }

    private static Map<String, List<CountedSenseDomains>> indexed(final PublishedSubjects scheme,
                                                                  final Lexicon lexicon, final String level) {
        final Map<String, List<CountedSenseDomains>> byWord = new HashMap<>();
        scheme.describedBySubjectMatter().forEach(subject -> {
            final CountedSenseDomains sense = new CountedSenseDomains(
                    levelled(subject, scheme, level), 0, List.of(subject.prefLabel()));
            wordsOf(subject, lexicon).forEach(word ->
                    byWord.computeIfAbsent(word, missing -> new ArrayList<>()).add(sense));
        });
        return byWord.entrySet().stream()
                .collect(Collectors.toUnmodifiableMap(Map.Entry::getKey,
                        entry -> List.copyOf(entry.getValue())));
    }

    /** The labels of the nearest stated ancestors of the level's kind, empty where the scheme states none. */
    private static Set<String> levelled(final SkosConcept subject, final PublishedSubjects scheme,
                                        final String level) {
        final Set<String> labels = new TreeSet<>();
        climbed(subject, scheme, level, new HashSet<>(), labels);
        return Set.copyOf(labels);
    }

    private static void climbed(final SkosConcept concept, final PublishedSubjects scheme,
                                final String level, final Set<String> seen, final Set<String> labels) {
        if (level.equals(concept.kind())) {
            labels.add(concept.prefLabel());
            return;
        }
        concept.broaderConcepts().stream()
                .filter(seen::add)
                .map(scheme::conceptOf)
                .forEach(above -> climbed(above, scheme, level, seen, labels));
    }

    /** Every word an account writes, beside the base forms the dictionary states for each. */
    private static Set<String> wordsOf(final SkosConcept subject, final Lexicon lexicon) {
        return subject.definitions().stream()
                .flatMap(account -> WORDS.matcher(account.toLowerCase(Locale.ROOT)).results())
                .map(MatchResult::group)
                .flatMap(written -> Stream.concat(Stream.of(written), basesOf(written, lexicon)))
                .collect(Collectors.toSet());
    }

    private static Stream<String> basesOf(final String written, final Lexicon lexicon) {
        return Stream.of(lexicon.nounBase(written), lexicon.verbBase(written),
                        lexicon.adjectiveBase(written))
                .flatMap(Optional::stream);
    }
}
