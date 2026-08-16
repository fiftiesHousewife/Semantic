package org.fifties.housewife.codesemantics.engine.term;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.fifties.housewife.codesemantics.engine.reading.CloneUnderReading;
import org.fifties.housewife.codesemantics.engine.reading.JavaSourceScopes;
import org.fifties.housewife.codesemantics.engine.reading.SourceScope;
import org.fifties.housewife.codesemantics.engine.theme.InjectedTaxonomy;

/**
 * Matches the declared names of the repository under reading against a term taxonomy held in a file, so a
 * candidate vocabulary can be tried before anything decides to bundle it.
 *
 * <p>A taxonomy stating no definition can only be read this way. CSO publishes 14,636 topics and no
 * definition for any of them, so the divergence arm has nothing to compare and the match is all there is.
 */
public final class InjectedTermMatchProbe {

    private static final int SHOWN = 30;

    private InjectedTermMatchProbe() {
    }

    public static void main(final String[] args) throws IOException {
        if (args.length < 1) {
            throw new IllegalArgumentException("Usage: InjectedTermMatchProbe <taxonomy tsv>");
        }
        final InjectedTaxonomy taxonomy = InjectedTaxonomy.named(Path.of(args[0]));
        final Path root = new CloneUnderReading().root();
        final List<SourceScope> scopes = new JavaSourceScopes().under(root);
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);

        final TermIndex terms = InjectedTerms.of(taxonomy, taxonomy.source());
        final CorroboratedReading reading =
                CorroboratedReading.of(terms, taxonomy.concepts(), parsed);
        final MatchedTerms matched = reading.matched();
        final MatchedTerms every = reading.every();

        System.out.printf("%n%s — %d terms published%n", taxonomy.source(), taxonomy.terms().size());
        System.out.printf("every match      %6d spans, %6.2f per thousand names, %4d distinct%n",
                every.spansFound(), every.perThousandNames(), every.distinctTerms());
        System.out.printf("corroborated     %6d spans, %6.2f per thousand names, %4d distinct%n%n",
                matched.spansFound(), matched.perThousandNames(), matched.distinctTerms());
        System.out.printf("%nwhere the matches concentrate — the branch, not the leaves%n");
        System.out.printf("%-42s %8s %8s %8s%n", "branch", "written", "below", "reach");
        WrittenSubtree.in(reading.tree()).stream().limit(SHOWN)
                .forEach(branch -> System.out.printf("%-42s %8d %8d %7.1f%%%n", branch.concept(),
                        branch.written(), branch.conceptsBelow(), 100.0 * branch.reach()));

        print("what the branch corroborated", matched, Integer.MAX_VALUE);
        print("what it refused, largest first", every, SHOWN);
    }

    private static void print(final String heading, final MatchedTerms terms, final int shown) {
        System.out.printf("%n%s%n%-34s %8s %6s  %s%n", heading, "term", "written", "words", "first site");
        terms.byMass(shown).forEach(sighting -> System.out.printf("%-34s %8d %6d  %s%n",
                sighting.term(), sighting.occurrences(), sighting.length(), sighting.firstSite()));
    }
}
