package io.github.fiftieshousewife.codesemantics.engine.export;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.github.fiftieshousewife.codesemantics.engine.behaviour.Behaviour;
import io.github.fiftieshousewife.codesemantics.engine.behaviour.Behaviours;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedSourceSets;

/**
 * What a repository states it does, as clauses read from the method names it publishes.
 *
 * <p>Only published source sets are read. A test method name is a sentence about behaviour rather than the
 * behaviour, and a reading that added the two would report the suite's grammar as the program's.
 *
 * <p>A clause stated once is kept. Unlike a word, whose weight is how much more of it a repository writes
 * than a reference does, a clause is a statement the author made and repeating it says only that several
 * methods do the same thing. The count is reported and nothing is cut on it.
 */
public final class ExportedBehaviours {

    private final Behaviours behaviours;
    private final PublishedSourceSets published;

    public ExportedBehaviours(final Behaviours behaviours, final PublishedSourceSets published) {
        this.behaviours = behaviours;
        this.published = published;
    }

    public static ExportedBehaviours fromClasspath() {
        return new ExportedBehaviours(Behaviours.fromClasspath(), new PublishedSourceSets());
    }

    /** Every clause the published method names state, the most-stated first and then alphabetically. */
    public List<ExportedBehaviour> in(final List<ParsedFile> files) {
        final Map<String, Stated> byPhrase = new LinkedHashMap<>();
        files.stream()
                .filter(file -> published.publishes(file.scope()))
                .forEach(file -> clausesIn(file).forEach(clause ->
                        byPhrase.computeIfAbsent(clause.sentence(), phrase -> new Stated(clause)).again()));
        return byPhrase.values().stream()
                .map(Stated::exported)
                .sorted(Comparator.comparingInt(ExportedBehaviour::occurrences).reversed()
                        .thenComparing(ExportedBehaviour::phrase))
                .toList();
    }

    private List<Behaviour> clausesIn(final ParsedFile file) {
        return file.occurrences().stream()
                .filter(occurrence -> occurrence.form() == NameForm.METHOD)
                .map(occurrence -> behaviours.of(occurrence, file))
                .flatMap(java.util.Optional::stream)
                .toList();
    }

    /** One clause and how many method names state it; the site is the first one met. */
    private static final class Stated {

        private final Behaviour first;
        private int occurrences;

        private Stated(final Behaviour first) {
            this.first = first;
        }

        private void again() {
            occurrences++;
        }

        private ExportedBehaviour exported() {
            return ExportedBehaviour.builder()
                    .phrase(first.sentence())
                    .verb(first.verb())
                    .object(first.object())
                    .occurrences(occurrences)
                    .firstWrittenAt(SightingSite.of(first.site()))
                    .build();
        }
    }
}
