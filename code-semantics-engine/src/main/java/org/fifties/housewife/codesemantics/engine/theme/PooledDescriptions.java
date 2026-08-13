package org.fifties.housewife.codesemantics.engine.theme;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.fifties.housewife.bi.lexicon.ArxivSubjects;
import org.fifties.housewife.bi.lexicon.SkosConcept;

/**
 * Every description under one broader subject, pooled into one — the taxonomy read at the level it reports
 * at rather than at its leaves.
 *
 * <p>This exists because of what a divergence between unequal breadths actually measures. A repository
 * writes about many things and its intensity is spread across hundreds of topics; a single subject
 * description is thirty words and lands on a handful. Most of the distance between them is then the
 * difference in <em>breadth</em>, and the nearest leaf is whichever one happened to be vaguest — which is a
 * property of the description, not a statement about the code.
 *
 * <p>Pooling puts the two on comparable footing without touching either reading: an archive's description is
 * the descriptions of the categories the publisher states inside it, joined. The grouping is the taxonomy's
 * own — it is what the {@code broader} column already holds — so nothing here decides which subjects belong
 * together.
 */
public class PooledDescriptions {

    private static final String JOINED = " ";

    private static final String POOLED = "archive";

    public List<SkosConcept> broaderThan(final List<SkosConcept> described, final ArxivSubjects taxonomy) {
        final Map<String, List<SkosConcept>> byBroader = described.stream().collect(Collectors.groupingBy(
                SkosConcept::broader, LinkedHashMap::new, Collectors.toList()));
        return byBroader.entrySet().stream().map(entry -> pooled(entry.getKey(), entry.getValue(), taxonomy))
                .toList();
    }

    private static SkosConcept pooled(final String broader, final List<SkosConcept> under,
                                      final ArxivSubjects taxonomy) {
        final SkosConcept stated = taxonomy.conceptOf(broader);
        return new SkosConcept(broader, stated.prefLabel(), stated.altLabel(), stated.broader(), POOLED,
                stated.module(),
                under.stream().map(SkosConcept::definition).collect(Collectors.joining(JOINED)));
    }
}
