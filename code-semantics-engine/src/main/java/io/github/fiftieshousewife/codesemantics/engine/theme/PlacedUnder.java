package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import io.github.fiftieshousewife.bi.lexicon.PublishedSubjects;
import io.github.fiftieshousewife.bi.lexicon.SkosConcept;

/**
 * Whether a subject sits under the area of the scheme's own hierarchy the expected result names.
 *
 * <p>This replaces marking a subject by whether its prose contains a word. That test cannot tell one sense
 * of a word from another and the collision rate is high: {@code security} marked 151 OpenAlex topics
 * including Food Security, Pesticide Exposure and Retirement and Disability; {@code content} marked Peanut
 * Plant Research and Hibiscus Plant Research, where the word means concentration. Worse, it marked against
 * the reading — Apache Tika's nearest topic is <em>Natural Language Processing Techniques</em>, which states
 * no {@code content} and was scored wrong for it.
 *
 * <p>An identifier cannot collide with another sense. Every topic OpenAlex publishes is assigned to a
 * subfield, that to a field and that to a domain, by the publisher, so a subject either descends from the
 * named area or does not.
 *
 * <p>Which area a repository is expected under is still this project's judgement, and the evaluation
 * manifest says so: it is recorded before the reading runs and never revised afterwards, which is the only
 * safeguard a fixture of this kind can carry.
 */
public final class PlacedUnder {

    private final String area;

    private final Map<String, String> broaderByConcept;

    private final Map<String, String> labelByConcept;

    PlacedUnder(final String area, final Map<String, String> broaderByConcept,
                final Map<String, String> labelByConcept) {
        this.area = area.toLowerCase(Locale.ROOT);
        this.broaderByConcept = Map.copyOf(broaderByConcept);
        this.labelByConcept = Map.copyOf(labelByConcept);
    }

    /** The expectation over one scheme's own hierarchy, at whatever level the area is stated. */
    public static PlacedUnder in(final PublishedSubjects taxonomy, final String area) {
        final List<SkosConcept> concepts = taxonomy.concepts();
        final Map<String, String> broader = new HashMap<>();
        final Map<String, String> labels = new HashMap<>();
        concepts.forEach(concept -> {
            broader.put(concept.concept(), concept.broader());
            labels.put(concept.concept(), concept.prefLabel());
        });
        if (labels.values().stream().noneMatch(label -> label.equalsIgnoreCase(area))) {
            throw new IllegalArgumentException("The scheme states no subject area called " + area
                    + ", so an expectation naming it would mark nothing and read as a failed reading");
        }
        return new PlacedUnder(area, broader, labels);
    }

    /** Whether this subject is the named area or descends from it. */
    public ProbabilityOfSuperiority.Expectation of(final SkosConcept subject) {
        return descendsFromTheArea(subject.concept())
                ? ProbabilityOfSuperiority.Expectation.MEETS_IT
                : ProbabilityOfSuperiority.Expectation.DOES_NOT;
    }

    /**
     * A walk up the publisher's own {@code broader} chain. It stops at the first concept the scheme does
     * not place, which is the top of the hierarchy — a scheme stating a cycle would hang here, and none of
     * the bundled ones does because each is generated from a source that states a tree.
     */
    private boolean descendsFromTheArea(final String concept) {
        String above = concept;
        while (!above.isBlank() && labelByConcept.containsKey(above)) {
            if (labelByConcept.get(above).toLowerCase(Locale.ROOT).equals(area)) {
                return true;
            }
            above = broaderByConcept.getOrDefault(above, "");
        }
        return false;
    }
}
