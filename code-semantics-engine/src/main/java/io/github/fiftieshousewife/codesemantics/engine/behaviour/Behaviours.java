package io.github.fiftieshousewife.codesemantics.engine.behaviour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import io.github.fiftieshousewife.bi.lexicon.Lexicon;
import io.github.fiftieshousewife.bi.lexicon.WordNetLexicon;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameForm;
import io.github.fiftieshousewife.codesemantics.engine.parse.NameOccurrence;
import io.github.fiftieshousewife.codesemantics.engine.parse.ParsedFile;
import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * What this repository does, read from the names of the things that do it.
 *
 * <p>Every declared method is offered to the dictionary as a clause: the leading word is a verb where WordNet
 * carries a verb entry for it, and everything after it is what the verb acts on. Nothing here knows any verbs
 * — the dictionary is asked, and a name whose first word is not a verb yields no behaviour at all rather than
 * a guessed one. That is why {@code massByTopic} produces nothing and {@code resolveNextPage} produces
 * resolve / next page.
 *
 * <p>A test method is the best-behaved case of this and not a special one, because a test name is written to
 * be read as a sentence in the first place. Where the convention holds, the suite is a specification and this
 * reading recovers it; where it does not, the verb is simply absent and the reading says so by omitting it.
 */
public final class Behaviours {

    private final Lexicon lexicon;
    private final IdentifierWords words;

    public Behaviours(final Lexicon lexicon, final IdentifierWords words) {
        this.lexicon = lexicon;
        this.words = words;
    }

    public static Behaviours fromClasspath() {
        return new Behaviours(WordNetLexicon.fromClasspath(), IdentifierWords.fromClasspath());
    }

    public List<Behaviour> in(final List<ParsedFile> files) {
        final List<Behaviour> read = new ArrayList<>();
        files.forEach(file -> file.occurrences().stream()
                .filter(occurrence -> occurrence.form() == NameForm.METHOD)
                .forEach(occurrence -> of(occurrence, file).ifPresent(read::add)));
        return List.copyOf(read);
    }

    /** The clause one declaration states, or nothing where its first word is not a verb the dictionary has. */
    public Optional<Behaviour> of(final NameOccurrence occurrence, final ParsedFile file) {
        final List<String> clause = words.of(occurrence.text()).words();
        if (clause.isEmpty()) {
            return Optional.empty();
        }
        return lexicon.verbBase(clause.getFirst())
                .map(verb -> new Behaviour(verb, clause.subList(1, clause.size()), occurrence.text(),
                        file.path() + ":" + occurrence.line()));
    }

    /** The verbs a set of behaviours performs, the most performed first, each with what it acts on. */
    public static Map<String, List<Behaviour>> byVerb(final List<Behaviour> behaviours) {
        final Map<String, List<Behaviour>> grouped = new LinkedHashMap<>();
        behaviours.stream()
                .sorted(Comparator.comparing(Behaviour::verb).thenComparing(Behaviour::sentence))
                .forEach(behaviour -> grouped.computeIfAbsent(behaviour.verb(), verb -> new ArrayList<>())
                        .add(behaviour));
        return grouped.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, List<Behaviour>>>comparingInt(
                        verb -> verb.getValue().size()).reversed().thenComparing(Map.Entry::getKey))
                .collect(LinkedHashMap::new, (map, verb) -> map.put(verb.getKey(), List.copyOf(verb.getValue())),
                        LinkedHashMap::putAll);
    }
}
