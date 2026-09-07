package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * What a file's package says that its neighbours' do not — the most deliberate names in a repository,
 * chosen once each to divide the work.
 *
 * <p><b>Chosen once, so counted once.</b> A package is one naming decision however many files are filed
 * under it. Read per file, the organisation's own coordinate outvotes every subject the repository is
 * about, while the files already carry their own names. So the words are counted at the first file read
 * from each package and nowhere else.
 */
final class PackageWords {

    /** The dot the tail begins with once its shared coordinate is taken off, which names no normalisation. */
    private static final Pattern LEADING_QUALIFIER = Pattern.compile("^\\.");

    private final String coordinate;
    private final Set<String> firstFileOfEachPackage;

    PackageWords(final List<ReadFile> read) {
        this.coordinate = sharedPackagePrefix(read);
        this.firstFileOfEachPackage = firstFileOfEachPackage(read);
    }

    /**
     * The package prefix every file in the repository shares, which is the organisation's coordinate rather
     * than anything an author chose per file — {@code io.github.fiftieshousewife.codesemantics}. It is derived
     * from the tree in hand and not written down anywhere, so a repository with two root packages shares a
     * shorter prefix and one with none shares nothing, which is the correct answer in both cases.
     */
    static String sharedPackagePrefix(final List<ReadFile> read) {
        final List<String> packages = read.stream()
                .map(source -> source.parsed().packageName())
                .filter(name -> !name.isEmpty())
                .toList();
        if (packages.isEmpty()) {
            return "";
        }
        String prefix = packages.getFirst();
        for (final String name : packages) {
            while (!name.equals(prefix) && !name.startsWith(prefix + ".")) {
                final int lastDot = prefix.lastIndexOf('.');
                if (lastDot < 0) {
                    return "";
                }
                prefix = prefix.substring(0, lastDot);
            }
        }
        return prefix;
    }

    /** The one file per package that its package's words are read at, so a package is named once. */
    private static Set<String> firstFileOfEachPackage(final List<ReadFile> read) {
        final Set<String> packages = new HashSet<>();
        return read.stream()
                .filter(source -> packages.add(source.parsed().packageName()))
                .map(ReadFile::path)
                .collect(Collectors.toUnmodifiableSet());
    }

    /**
     * The package words read at this file: the tail its package adds beyond the shared coordinate, at the
     * first file read from the package, and nothing at any other file.
     *
     * <p>The tail keeps its qualifier dots, which the identifier splitter divides at; a separator the
     * grammar does not know would leave the tail one token nothing could be cited for.
     */
    List<NameOccurrence> atFile(final ReadFile source) {
        return firstFileOfEachPackage.contains(source.path())
                ? words(source.parsed().packageName())
                : List.of();
    }

    private List<NameOccurrence> words(final String declared) {
        if (declared.isEmpty() || !declared.startsWith(coordinate)) {
            return List.of();
        }
        final String distinguishing = declared.substring(coordinate.length());
        return distinguishing.isBlank() ? List.of()
                : List.of(new NameOccurrence(LEADING_QUALIFIER.matcher(distinguishing).replaceFirst(""),
                        NameForm.PACKAGE, 1));
    }
}
