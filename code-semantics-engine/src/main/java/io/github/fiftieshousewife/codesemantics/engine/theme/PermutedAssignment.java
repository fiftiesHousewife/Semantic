package io.github.fiftieshousewife.codesemantics.engine.theme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * The same statements a published framework holds, reassigned to its functions at chance, with each function
 * keeping the number of statements its publisher gave it.
 *
 * <p>It is the null a functional taxonomy needs, and it is not the one {@link SubjectNull} draws.
 * {@code SubjectNull} fills a description of real length with words drawn from the pooled vocabulary, which
 * asks whether a subject's <em>words</em> could have arrived by chance. A framework partitions statements
 * that all come from one document in one register, so its functions share a vocabulary by construction and
 * that question is already answered: they could. What is left to ask is whether the <em>partition</em>
 * carries anything — whether it matters which function a statement was filed under.
 *
 * <p>So everything is held except the assignment. Every statement is real, every function keeps its size,
 * and the only thing chance decides is which statements pool together. A framework whose functions a
 * repository cannot be told apart by is one whose partition this reading cannot see.
 */
public final class PermutedAssignment {

    /** The publisher's own order of functions is kept, so a pooled reading joins them the same way twice. */
    public Map<String, List<String>> of(final Map<String, List<String>> statedByFunction,
                                        final Random draws) {
        final List<String> everyStatement = statedByFunction.values().stream().flatMap(List::stream)
                .collect(java.util.stream.Collectors.toCollection(ArrayList::new));
        Collections.shuffle(everyStatement, draws);
        final Map<String, List<String>> drawn = new LinkedHashMap<>();
        int taken = 0;
        for (final Map.Entry<String, List<String>> stated : sorted(statedByFunction)) {
            final int held = stated.getValue().size();
            drawn.put(stated.getKey(), List.copyOf(everyStatement.subList(taken, taken + held)));
            taken += held;
        }
        return drawn;
    }

    /** A map's iteration order is not stable across JVMs, and a null that is not reproducible is not one. */
    private List<Map.Entry<String, List<String>>> sorted(final Map<String, List<String>> byFunction) {
        return byFunction.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList();
    }
}
