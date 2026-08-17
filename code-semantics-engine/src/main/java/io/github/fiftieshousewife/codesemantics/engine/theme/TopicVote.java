package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.Objects;

import io.github.fiftieshousewife.codesemantics.model.EvidenceSource;

/**
 * One resource's claim that a word belongs to a topical domain, carrying the mass that claim contributes.
 *
 * <p>The mass is a non-negative share and not a signed log-odds, and the difference is structural rather
 * than stylistic. A closed axis asks which of a few rival values holds, so its votes argue for and against
 * and pool as log-odds. A topical reading asks how a word's meaning is distributed over an open space of
 * subjects, where the rivals are not enumerable and no resource ever argues that a word is <em>not</em>
 * about something. What such a resource can say is how much of a word it commits to a subject, and the
 * honest arithmetic for that is a share: one word occurrence, one unit of mass per resource, divided among
 * the readings that resource names. A word that means four things does not therefore shout four times as
 * loudly.
 */
public record TopicVote(String topic, double mass, EvidenceSource source) {

    public TopicVote {
        Objects.requireNonNull(topic, "topic");
        Objects.requireNonNull(source, "source");
        if (mass < 0.0) {
            throw new IllegalArgumentException("a topical reading commits mass, never argues against: " + mass);
        }
    }
}
