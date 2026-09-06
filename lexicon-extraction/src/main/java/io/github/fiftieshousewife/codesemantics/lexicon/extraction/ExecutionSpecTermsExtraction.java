package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * Reads one fork of ethereum/execution-specs into the bundled TSV, from a checkout:
 * {@code -Psource=<path to an execution-specs checkout>}.
 *
 * <p>The fork is the one the specification schedules last, chosen by the packages' own
 * {@code FORK_CRITERIA} statements. The set is taken at a pinned commit rather than at a branch, and the
 * fork's modules are accepted only if together they digest to the value recorded here — a checkout of
 * another revision, and a newly scheduled fork changing the choice, each fail rather than being bundled.
 */
public final class ExecutionSpecTermsExtraction {

    private static final String REVISION = "903b48f152c932f6e47a615f0f7f009c56f1d92b";

    private static final String FORKS = "src/ethereum/forks";

    private final ExecutionSpecForks forks = new ExecutionSpecForks();

    private final ExecutionSpecConcepts concepts = new ExecutionSpecConcepts();

    private final ExecutionSpecTermsTsv tsv = new ExecutionSpecTermsTsv();

    private final PinnedSet modules = new PinnedSet(
            "https://github.com/ethereum/execution-specs/tree/" + REVISION + "/" + FORKS + "/bpo2",
            "specification modules",
            "df6dbdca52989902abd09cc4603cfab4922d5cf13cf0b2a3653e4aa7db3f0a91");

    public void extract(final Path checkout, final Path output) throws IOException {
        final String fork = forks.latestScheduled(checkout.resolve(FORKS));
        final List<ContentDigest.Member> members =
                modules.pinned(membersOf(checkout.resolve(FORKS).resolve(fork)));
        new BundledResource(output).written(rendered(concepts.in(textsOf(members), fork), fork));
    }

    /** The committed file for these concepts, rendered once so the test and the extraction agree on it. */
    String rendered(final List<SkosConcept> read, final String fork) {
        return tsv.render(read, fork, modules.citation(), modules.digest());
    }

    PinnedSet modules() {
        return modules;
    }

    /** The fork's Python modules under their fork-relative paths, in those paths' own order. */
    private static List<ContentDigest.Member> membersOf(final Path fork) throws IOException {
        try (Stream<Path> walked = Files.walk(fork)) {
            final List<Path> modules = walked.filter(path -> path.toString().endsWith(".py"))
                    .sorted(Comparator.comparing(path -> relativeTo(fork, path)))
                    .toList();
            final List<ContentDigest.Member> members = new ArrayList<>();
            for (final Path module : modules) {
                members.add(new ContentDigest.Member(relativeTo(fork, module), Files.readAllBytes(module)));
            }
            return members;
        }
    }

    private static String relativeTo(final Path fork, final Path module) {
        return fork.relativize(module).toString().replace('\\', '/');
    }

    private static Map<String, String> textsOf(final List<ContentDigest.Member> members) {
        final Map<String, String> texts = new LinkedHashMap<>();
        members.forEach(member -> texts.put(member.name(),
                new String(member.bytes(), StandardCharsets.UTF_8)));
        return texts;
    }
}
