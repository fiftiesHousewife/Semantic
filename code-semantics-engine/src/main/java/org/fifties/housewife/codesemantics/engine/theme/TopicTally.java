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
 *
 * <p>What counts as one of those words is settled first, by {@link CollocatedWords}: a run a resource
 * publishes as a single entry is one word here, so {@code partOfSpeech} is read as the term a dictionary
 * states rather than as three words whose subjects are pooled. It happens before anything is offered,
 * because offering drops the words nothing can be cited for and a dropped word would close the gap between
 * two the author never wrote next to each other.
 */
public final class TopicTally {

    private final IdentifierWords words;
    private final CollocatedWords collocated;
    private final OfferedWords offered;
    private final PhraseTopics phrases;
    private final TopicWitnesses witnesses;
    private final WordSightings sightings;

    private final Map<String, Double> massByTopic = new HashMap<>();
    private final Map<String, Double> nameMassByTopic = new HashMap<>();
    private final Map<String, Integer> referencesByTopic = new HashMap<>();

    private double unplacedMass;
    private int unreadableOccurrences;
    private int phraseOccurrences;

    public TopicTally(final IdentifierWords words, final CollocatedWords collocated,
                      final OfferedWords offered, final PhraseTopics phrases,
                      final TopicWitnesses witnesses, final WordSightings sightings) {
        this.words = words;
        this.collocated = collocated;
        this.offered = offered;
        this.phrases = phrases;
        this.witnesses = witnesses;
        this.sightings = sightings;
    }

    public void add(final String site, final NameOccurrence occurrence) {
        final NameForm form = occurrence.form();
        form.vocabulary().phrasesOf(occurrence.text(), words)
                .forEach(phrase -> read(collocated.of(phrase.words()), form,
                        site + ":" + occurrence.line()));
    }

    public FileTopics reading(final String path, final int lines) {
        return new FileTopics(path, lines, massByTopic, unplacedMass, nameMassByTopic, referencesByTopic,
                unreadableOccurrences, phraseOccurrences);
    }

    /**
     * One phrase, read as a whole. Its words are offered in their dictionary form, weighed against each other
     * for what they agree about, and the phrase commits a single unit of mass however many words it took to
     * say it — scaled by what its form is worth, by how far its words settled on one subject, and by how
     * much of those words the resources spoke for at all.
     *
     * <p>Whatever those three scalings take off the unit is kept, rather than dropped: a phrase is worth what
     * its form is worth however it reads, so what the resources could not settle on a subject is exactly what
     * is left of it. A phrase nothing could place at all keeps the whole of its form's worth and is counted
     * as unreadable besides. That total is what keeps a file of unread names from reading as confidently
     * about the little that was read as a file every name of which the resources spoke for.
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
        final double worth = offered.formWorth(form);
        final PhraseTopics.Reading reading = phrases.of(lemmas, worthOf(form, lemmas), form);
        if (reading.isEmpty()) {
            unreadableOccurrences++;
            unplacedMass += worth;
            return;
        }
        final double unit = worth * reading.coherence() * reading.credence();
        unplacedMass += worth - unit;
        reading.shareByTopic().forEach((topic, share) -> {
            final double said = unit * share;
            massByTopic.merge(topic, said, Double::sum);
            referencesByTopic.merge(topic, 1, Integer::sum);
            if (form.isChosenName()) {
                nameMassByTopic.merge(topic, said, Double::sum);
            }
            witness(topic, said, reading.agreementByTopic().get(topic), String.join(" ", phrase), site);
        });
    }

    /**
     * Every word that agreed on the topic is a witness to it, and shares the mass the phrase committed —
     * quoting the phrase it agreed in, because that phrase and not the word is what was read.
     */
    private void witness(final String topic, final double said, final Set<String> agreeing,
                         final String phrase, final String site) {
        agreeing.forEach(word -> witnesses.record(topic, word, phrase, site, EvidenceSource.TOPICAL_DOMAIN,
                said / agreeing.size()));
    }


    private Map<String, Double> worthOf(final NameForm form, final List<String> lemmas) {
        return lemmas.stream().distinct()
                .collect(Collectors.toUnmodifiableMap(lemma -> lemma, lemma -> offered.narrowing(form, lemma)));
    }
}
