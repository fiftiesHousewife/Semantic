package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The packages the running platform declares it exports — its own statement of its API surface, read from
 * {@link ModuleFinder#ofSystem()} rather than from any list bundled here.
 *
 * <p>It answers one question: is this import the platform's vocabulary or the author's? {@code java.util} is
 * the platform saying what it offers; {@code net.sf.extjwnl.data} is a choice this repository made, and the
 * choice is the interesting one. This is the same move {@code JavaLanguageKeywords} makes for the keyword
 * table — where a standard's own runtime can be asked, ask it, because an extracted copy can go stale
 * against the standard and a delegation cannot.
 *
 * <p>It reads the platform running the analysis, so a repository built for a newer platform may name a
 * package this one does not export. That reads as an author's choice rather than the platform's, which
 * overstates the finding rather than hiding it — the direction an unverified reading should err in.
 */
public final class PlatformPackages {

    private final Set<String> exported;

    PlatformPackages(final Set<String> exported) {
        this.exported = Set.copyOf(exported);
    }

    public static PlatformPackages ofSystem() {
        return SYSTEM;
    }

    /** Whether the platform itself exports the package, or any package enclosing it. */
    public boolean exports(final String packageName) {
        return exported.contains(packageName);
    }

    public int size() {
        return exported.size();
    }

    private static PlatformPackages load() {
        return new PlatformPackages(ModuleFinder.ofSystem().findAll().stream()
                .map(ModuleReference::descriptor)
                .flatMap(descriptor -> descriptor.exports().stream())
                .map(ModuleDescriptor.Exports::source)
                .collect(Collectors.toUnmodifiableSet()));
    }

    private static final PlatformPackages SYSTEM = load();
}
