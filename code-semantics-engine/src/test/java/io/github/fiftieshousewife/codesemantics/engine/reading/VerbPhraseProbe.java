package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import io.github.fiftieshousewife.codesemantics.engine.behaviour.Behaviour;
import io.github.fiftieshousewife.codesemantics.engine.behaviour.Behaviours;
import io.github.fiftieshousewife.codesemantics.engine.behaviour.PropertyAccessors;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;

/**
 * Every clause {@link Behaviours} reads out of a tree's declared method names, printed before anything
 * downstream is built over them — whether these say what the code does is a judgement a reader makes by
 * looking at the list. The leading words the dictionary states no verb for are printed too, because that
 * tail is a finding of its own.
 *
 * <p>Published and test source sets are reported apart: a test method name is a sentence about behaviour,
 * and mixing the two would read the suite's grammar as the program's.
 */
public final class VerbPhraseProbe {

    private static final int PHRASES_PRINTED = 50;
    private static final int TAIL_PRINTED = 20;

    private VerbPhraseProbe() {
    }

    public static void main(final String[] args) {
        final TreeReading reading = TreeReading.ofTheCloneUnderReading();
        final PublishedSourceSets published = new PublishedSourceSets();
        System.out.printf("%n%s — verb phrases from declared method names%n", reading.root().getFileName());
        report("Published source sets", reading.parsed().files(),
                file -> published.publishes(file.scope()));
        report("Test source sets", reading.parsed().files(),
                file -> !published.publishes(file.scope()));
    }

    private static void report(final String heading, final List<ParsedFile> files,
                               final Predicate<ParsedFile> within) {
        final Tally tally = new Tally(Behaviours.fromClasspath(), IdentifierWords.fromClasspath());
        files.stream()
                .filter(within)
                .forEach(file -> file.occurrences().stream()
                        .filter(occurrence -> occurrence.form() == NameForm.METHOD)
                        .forEach(occurrence -> tally.read(occurrence, file)));
        tally.print(heading);
    }

    /** What each method name yielded: a clause, a verb with no object, or a leading word with no entry. */
    private static final class Tally {

        private final Behaviours behaviours;
        private final IdentifierWords words;
        private final PropertyAccessors accessors = new PropertyAccessors();
        private final Map<String, Integer> phrases = new HashMap<>();
        private final Map<String, Integer> verbAlone = new HashMap<>();
        private final Map<String, Integer> noVerbEntry = new HashMap<>();
        private int methods;
        private int accessorNames;

        private Tally(final Behaviours behaviours, final IdentifierWords words) {
            this.behaviours = behaviours;
            this.words = words;
        }

        void read(final NameOccurrence method, final ParsedFile file) {
            methods++;
            final List<String> clause = words.of(method.text()).words();
            if (accessors.claims(clause)) {
                accessorNames++;
                return;
            }
            behaviours.of(method, file).ifPresentOrElse(this::clauseOf,
                    () -> clause.stream()
                            .findFirst()
                            .ifPresent(leading -> noVerbEntry.merge(leading, 1, Integer::sum)));
        }

        private void clauseOf(final Behaviour behaviour) {
            if (behaviour.object().isEmpty()) {
                verbAlone.merge(behaviour.verb(), 1, Integer::sum);
            } else {
                phrases.merge(behaviour.sentence(), 1, Integer::sum);
            }
        }

        void print(final String heading) {
            System.out.printf("%n%s — %,d method names: %,d state a verb phrase, %,d a verb with no "
                            + "object, %,d lead with a word WordNet states no verb for, %,d are property "
                            + "accessors the JavaBeans specification claims%n",
                    heading, methods, counted(phrases), counted(verbAlone), counted(noVerbEntry),
                    accessorNames);
            printed(phrases, PHRASES_PRINTED, "phrase");
            printed(verbAlone, TAIL_PRINTED, "verb with no object in the name");
            printed(noVerbEntry, TAIL_PRINTED, "leading word without a verb entry");
        }

        private int counted(final Map<String, Integer> tallied) {
            return tallied.values().stream().mapToInt(Integer::intValue).sum();
        }

        private void printed(final Map<String, Integer> tallied, final int limit, final String label) {
            System.out.printf("%n  %-46s %s%n", label, "written");
            tallied.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                            .thenComparing(Map.Entry.comparingByKey()))
                    .limit(limit)
                    .forEach(entry -> System.out.printf("  %-46s %7d%n", entry.getKey(), entry.getValue()));
        }
    }
}
