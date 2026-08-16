package org.fifties.housewife.codesemantics.engine.vocabulary;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReader;
import java.lang.module.ModuleReference;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type names the running platform declares in the packages it says it exports, read from
 * {@link ModuleFinder#ofSystem()} rather than from any list bundled here.
 *
 * <p>It is the same move {@code PlatformPackages} makes and for the same reason: where a standard's own
 * runtime can be asked the question, ask it, because an extracted table goes stale against its standard and
 * a delegation cannot. What it answers is what Java itself is written in — the words a program written in
 * this language will contain whatever it is for.
 *
 * <p>Only what the platform exports is read. A name inside a package nobody can import is not vocabulary a
 * programmer ever meets. An anonymous class carries a number where its name would be and is passed over; so
 * is any class file whose name a Java identifier could not hold, which is how the compilation units the
 * language mandates — {@code package-info}, {@code module-info} — leave without being named.
 */
public final class PlatformNames {

    private static final String CLASS_SUFFIX = ".class";

    private static final char PACKAGE_SEPARATOR = '/';

    private static final char NESTED_SEPARATOR = '$';

    private static final PlatformNames SYSTEM = load();

    private final List<String> declared;

    PlatformNames(final List<String> declared) {
        this.declared = List.copyOf(declared);
    }

    public static PlatformNames ofSystem() {
        return SYSTEM;
    }

    /** Every declared simple type name, one entry per type the platform declares. */
    public List<String> declared() {
        return declared;
    }

    public int size() {
        return declared.size();
    }

    private static PlatformNames load() {
        final Set<String> exported = ModuleFinder.ofSystem().findAll().stream()
                .map(ModuleReference::descriptor)
                .flatMap(descriptor -> descriptor.exports().stream())
                .map(export -> export.source().replace('.', PACKAGE_SEPARATOR))
                .collect(Collectors.toUnmodifiableSet());
        return new PlatformNames(ModuleFinder.ofSystem().findAll().stream()
                .flatMap(module -> typesIn(module, exported))
                .toList());
    }

    private static Stream<String> typesIn(final ModuleReference module, final Set<String> exported) {
        try (ModuleReader reader = module.open()) {
            return reader.list()
                    .filter(entry -> entry.endsWith(CLASS_SUFFIX))
                    .filter(entry -> exported.contains(packageOf(entry)))
                    .map(PlatformNames::simpleNameOf)
                    .filter(PlatformNames::isADeclaredName)
                    .toList()
                    .stream();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read the module " + module.descriptor().name(), e);
        }
    }

    private static String packageOf(final String entry) {
        return entry.substring(0, Math.max(entry.lastIndexOf(PACKAGE_SEPARATOR), 0));
    }

    private static String simpleNameOf(final String entry) {
        final String type = entry.substring(0, entry.length() - CLASS_SUFFIX.length());
        return type.substring(Math.max(type.lastIndexOf(PACKAGE_SEPARATOR), type.lastIndexOf(NESTED_SEPARATOR)) + 1);
    }

    /** What a Java identifier can hold, which an anonymous class's number and a mandated file name cannot. */
    private static boolean isADeclaredName(final String name) {
        return !name.isEmpty() && Character.isJavaIdentifierStart(name.charAt(0))
                && name.chars().allMatch(Character::isJavaIdentifierPart);
    }
}
