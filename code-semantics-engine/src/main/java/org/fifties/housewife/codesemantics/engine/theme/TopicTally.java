package org.fifties.housewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.engine.parse.NameForm;
import org.fifties.housewife.codesemantics.engine.parse.NameOccurrence;
import org.fifties.housewife.codesemantics.engine.reading.IdentifierWords;
import org.fifties.housewife.codesemantics.model.EvidenceSource;

/**
 * Accumulates one file's identifier occurrences into a {@link FileTopics}, recording as it goes which words
 * carried which topic into the shared {@link TopicWitnesses}.
 *
 * <p>The unit is the <b>phrase</b>, not the word. A declared name is one phrase and a sentence of prose is
 * one phrase, and each commits a single unit of mass however many words it took to say — so a twenty-word
 * javadoc sentence does not outvote a two-word field name by being longer. Inside a phrase the words are read
 * as context for one another, which is where the ambiguity of any single word is actually answered:
 * {@link PhraseTopics} scores a subject by what the words agree about and by how much of the phrase agrees.
 *
 * <p>What arrives is only what this repository declared and wrote — the parse has already left out every use
 * of a name someone else declared, which is what keeps a file's hundredth mention of {@code String} from
 * being read as a hundred statements about music. {@link OfferedWords} decides which of a phrase's words
 * reach the resources at all, in what dictionary form, and what each is worth on its own.
 */
public final class TopicTally {

    private final IdentifierWords words;
    private final OfferedWords offered;
    private final PhraseTopics phrases;
    private final TopicWitnesses witnesses;
    private final WordSightings sightings;

    private final Map<String, Double> massByTopic = new HashMap<>();
    private final Map<String, Double> nameMassByTopic = new HashMap<>();
    private final Map<String, Integer> referencesByTopic = new HashMap<>();

    private int unreadableOccurrences;
    private int phraseOccurrences;

    public TopicTally(final IdentifierWords words, final OfferedWords offered, final PhraseTopics phrases,
                      final TopicWitnesses witnesses, final WordSightings sightings) {
        this.words = words;
        this.offered = offered;
        this.phrases = phrases;
        this.witnesses = witnesses;
        this.sightings = sightings;
    }

    public void add(final String site, final NameOccurrence occurrence) {
        final NameForm form = occurrence.form();
        form.vocabulary().phrasesOf(occurrence.text(), words)
                .forEach(phrase -> read(phrase.words(), form, site + ":" + occurrence.line()));
    }

    public FileTopics reading(final String path, final int lines) {
        return new FileTopics(path, lines, massByTopic, nameMassByTopic, referencesByTopic,
                unreadableOccurrences, phraseOccurrences);
    }

    /**
     * One phrase, read as a whole. Its words are offered in their dictionary form, weighed against each other
     * for what they agree about, and the phrase commits a single unit of mass however many words it took to
     * say it — scaled by what its form is worth, by how far its words settled on one subject, and by how
     * much of those words the resources spoke for at all. A phrase nothing could place is counted as
     * unreadable,
     * which is what keeps a file of unread names from resolving confidently to whatever little was read.
     */
    private void read(final List<String> phrase, final NameForm form, final String site) {
        final List<String> lemmas = phrase.stream()
                .map(word -> offered.of(form, word))
                .flatMap(Optional::stream)
                .toList();
        if (lemmas.isEmpty()) {
            return;
        }
        phraseOccurrences++;
        lemmas.forEach(lemma -> sightings.saw(lemma, site, form.isChosenName()));
        final PhraseTopics.Reading reading = phrases.of(lemmas, worthOf(form, lemmas));
        if (reading.isEmpty()) {
            unreadableOccurrences++;
            return;
        }
        final double unit = offered.formWorth(form) * reading.coherence() * reading.credence();
        reading.shareByTopic().forEach((topic, share) -> {
            final double said = unit * share;
            massByTopic.merge(topic, said, Double::sum);
            referencesByTopic.merge(topic, 1, Integer::sum);
            if (form.isChosenName()) {
                nameMassByTopic.merge(topic, said, Double::sum);
            }
            witness(topic, said, reading.agreementByTopic().get(topic), site);
        });
    }

    /** Every word that agreed on the topic is a witness to it, and shares the mass the phrase committed. */
    private void witness(final String topic, final double said, final Set<String> agreeing, final String site) {
        agreeing.forEach(word -> witnesses.record(topic, word, site, EvidenceSource.TOPICAL_DOMAIN,
                said / agreeing.size()));
    }

    private Map<String, Double> worthOf(final NameForm form, final List<String> lemmas) {
        return lemmas.stream().distinct()
                .collect(Collectors.toUnmodifiableMap(lemma -> lemma, lemma -> offered.narrowing(form, lemma)));
    }
}
