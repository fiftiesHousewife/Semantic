package io.github.fiftieshousewife.codesemantics.engine.vocabulary;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReader;
import java.lang.module.ModuleReference;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The names the running platform declares in the packages it says it exports — the types and the methods
 * a caller can write — read from {@link ModuleFinder#ofSystem()} rather than from any list bundled here.
 *
 * <p>It is the same move {@code PlatformPackages} makes and for the same reason: where a standard's own
 * runtime can be asked the question, ask it, because an extracted table goes stale against its standard and
 * a delegation cannot. What it answers is what Java itself is written in — the words a program written in
 * this language will contain whatever it is for.
 *
 * <p><b>The methods are where most of that vocabulary is.</b> {@code get} and {@code set} echo no type, so
 * a reference built from type names alone has nothing to say about them; the platform declares them
 * thousands of times as methods. {@link ClassFileMethods} reads them out of the class file, so the whole
 * platform is enumerated without loading a class.
 *
 * <p>Only what the platform exports is read, and within an exported type only what a caller could write. A
 * name inside a package nobody can import is not vocabulary a programmer ever meets. An anonymous class
 * carries a number where its name would be and is passed over; so is any name a Java identifier could not
 * hold, which is how the compilation units the language mandates — {@code package-info},
 * {@code module-info} — and the constructors the class file spells {@code <init>} leave without being named.
 */
public final class PlatformNames {

    private static final String CLASS_SUFFIX = ".class";

    private static final char PACKAGE_SEPARATOR = '/';

    private static final char NESTED_SEPARATOR = '$';

    private static final ClassFileMethods METHODS = new ClassFileMethods();

    private static final PlatformNames SYSTEM = load();

    private final List<String> declared;

    PlatformNames(final List<String> declared) {
        this.declared = List.copyOf(declared);
    }

    public static PlatformNames ofSystem() {
        return SYSTEM;
    }

    /** Every declared name, one entry per type and per method the platform declares. */
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
                .flatMap(module -> namesIn(module, exported))
                .toList());
    }

    private static Stream<String> namesIn(final ModuleReference module, final Set<String> exported) {
        try (ModuleReader reader = module.open()) {
            return reader.list()
                    .filter(entry -> entry.endsWith(CLASS_SUFFIX))
                    .filter(entry -> exported.contains(packageOf(entry)))
                    .flatMap(entry -> declaredBy(reader, entry))
                    .filter(PlatformNames::isADeclaredName)
                    .toList()
                    .stream();
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read the module " + module.descriptor().name(), e);
        }
    }

    /** The type the class file declares, and the methods a caller of it can write. */
    private static Stream<String> declaredBy(final ModuleReader reader, final String entry) {
        try (InputStream bytes = reader.open(entry).orElseThrow()) {
            return Stream.concat(Stream.of(simpleNameOf(entry)), METHODS.declaredBy(bytes).stream());
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read the class file " + entry, e);
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
