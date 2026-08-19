package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.List;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.engine.reading.IdentifierWords;

/**
 * The words one declaration writes, in the order the file writes them: the declarations it sits inside,
 * outermost first, then the type beside it, then its own name.
 *
 * <p>{@code class SourceCode { Analysis span; }} reads as source, code, analysis, span. Those words stand
 * next to each other in the text and inside no single identifier, so a publisher stating {@code Source Code
 * Analysis} can be met here and nowhere else. The order is the source's own, which is what separates it from
 * closing a gap between two words nobody wrote together.
 *
 * <p>The name's own words are the tail, so anything a name says on its own is still said here.
 */
public final class DeclarationWords {

    private final IdentifierWords words;

    public DeclarationWords(final IdentifierWords words) {
        this.words = words;
    }

    public static DeclarationWords fromClasspath() {
        return new DeclarationWords(IdentifierWords.fromClasspath());
    }

    /** Every word of the declaration this name sits in, its own last. Empty where the name splits into none. */
    public List<String> of(final NameOccurrence occurrence) {
        return Stream.of(named(occurrence.enclosing()), occurrence.typeWords().stream(),
                        named(List.of(occurrence.text())))
                .flatMap(run -> run)
                .toList();
    }

    private Stream<String> named(final List<String> names) {
        return names.stream().flatMap(name -> words.of(name).words().stream());
    }
}
