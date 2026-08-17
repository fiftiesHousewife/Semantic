package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import io.github.fiftieshousewife.codesemantics.engine.reading.PublishedSourceSets;
import io.github.fiftieshousewife.codesemantics.engine.reading.SourceScope;

/**
 * A whole working tree, parsed once. Two passes, and the second needs the first: an import can only be known
 * for this repository's own coordinates once every package this repository declares has been seen, and a
 * comment can only be known to stand in three hundred files once every file has been read.
 *
 * <p>Nothing is dropped silently. Files the parser refused are counted, and so is every import set aside —
 * a reading that quietly narrowed its corpus would report a cleaner result than it earned.
 */
public final class ParsedRepository {

    /** The dot the tail begins with once its shared coordinate is taken off, which names no rung. */
    private static final Pattern LEADING_QUALIFIER = Pattern.compile("^\\.");

    private final List<ParsedFile> files;
    private final int unsoundFiles;
    private final ImportTally imports;

    private ParsedRepository(final List<ParsedFile> files, final int unsoundFiles,
                             final ImportTally imports) {
        this.files = List.copyOf(files);
        this.unsoundFiles = unsoundFiles;
        this.imports = imports;
    }

    public static ParsedRepository of(final Path root, final List<SourceScope> scopes) {
        return of(root, scopes, List.of(JavaSource.newInstance(), new MarkdownSource()),
                PlatformPackages.ofSystem());
    }

    /**
     * The package prefix every file in the repository shares, which is the organisation's coordinate rather
     * than anything an author chose per file — {@code io.github.fiftieshousewife.codesemantics}. It is derived
     * from the tree in hand and not written down anywhere, so a repository with two root packages shares a
     * shorter prefix and one with none shares nothing, which is the correct answer in both cases.
     */
    static String sharedPackagePrefix(final List<Read> read) {
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

    /**
     * What a file's package says that its neighbours' do not — the most deliberate names in a repository,
     * chosen once each to divide the work.
     *
     * <p><b>Chosen once, so counted once.</b> A package is one naming decision however many files are filed
     * under it. Read per file, the organisation's own coordinate outvotes every subject the repository is
     * about, while the files already carry their own names. So the words are counted at the first file read
     * from each package and nowhere else.
     *
     * <p>The tail keeps its qualifier dots, which the identifier splitter divides at; a separator the
     * grammar does not know would leave the tail one token nothing could be cited for.
     */
    private static List<NameOccurrence> packageWords(final String declared, final String coordinate) {
        if (declared.isEmpty() || !declared.startsWith(coordinate)) {
            return List.of();
        }
        final String distinguishing = declared.substring(coordinate.length());
        return distinguishing.isBlank() ? List.of()
                : List.of(new NameOccurrence(LEADING_QUALIFIER.matcher(distinguishing).replaceFirst(""),
                        NameForm.PACKAGE, 1));
    }

    public static ParsedRepository of(final Path root, final List<SourceScope> scopes,
                                      final List<SourceReader> readers, final PlatformPackages platform) {
        final List<Read> read = scopes.stream()
                .flatMap(scope -> scope.files().stream()
                        .map(file -> read(root, scope.name(), file, readers)))
                .toList();
        final ImportOrigins origins = new ImportOrigins(platform, read.stream()
                .map(source -> source.parsed().packageName())
                .filter(name -> !name.isEmpty())
                .collect(Collectors.toUnmodifiableSet()));
        final ImportTally imports = new ImportTally();
        final PublishedSourceSets published = new PublishedSourceSets();
        final String coordinate = sharedPackagePrefix(read);
        final Set<String> declaresItsPackage = firstFileOfEachPackage(read);
        final CopiedComments copied = CopiedComments.over(read.stream()
                .map(source -> source.parsed().occurrences())
                .toList());
        final List<ParsedFile> files = read.stream()
                .map(source -> source.retaining(origins, imports,
                        declaresItsPackage.contains(source.path())
                                ? packageWords(source.parsed().packageName(), coordinate) : List.of(),
                        published, copied))
                .toList();
        return new ParsedRepository(files,
                (int) read.stream().filter(source -> !source.parsed().sound()).count(), imports);
    }

    /** The one file per package that its package's words are read at, so a package is named once. */
    private static Set<String> firstFileOfEachPackage(final List<Read> read) {
        final Set<String> packages = new HashSet<>();
        return read.stream()
                .filter(source -> packages.add(source.parsed().packageName()))
                .map(Read::path)
                .collect(Collectors.toUnmodifiableSet());
    }

    public List<ParsedFile> files() {
        return files;
    }

    /**
     * Files the parser had problems with. What it recovered from them is still read; the count is reported
     * because a corpus that did not parse cleanly is a finding about the corpus and about the parser.
     */
    public int unsoundFiles() {
        return unsoundFiles;
    }

    /** What the parse did with every import it met, including the ones the reading sets aside. */
    public ImportTally imports() {
        return imports;
    }

    private static Read read(final Path root, final String scope, final Path file,
                             final List<SourceReader> readers) {
        final String source = contentOf(file);
        return new Read(scope, root.relativize(file).toString(), (int) source.lines().count(),
                readers.stream()
                        .filter(reader -> reader.reads(file))
                        .findFirst()
                        .map(reader -> reader.read(source))
                        .orElseGet(ParsedSource::unreadable));
    }

    private static String contentOf(final Path file) {
        try {
            return Files.readString(file);
        } catch (final IOException e) {
            throw new UncheckedIOException("Failed to read " + file, e);
        }
    }

    /** One file after the parse and before its imports have been sorted. */
    private record Read(String scope, String path, int lines, ParsedSource parsed) {

        ParsedFile retaining(final ImportOrigins origins, final ImportTally tally,
                             final List<NameOccurrence> alsoDeclared, final PublishedSourceSets published,
                             final CopiedComments copied) {
            final List<NameOccurrence> kept = new ArrayList<>(alsoDeclared);
            parsed.occurrences().forEach(occurrence -> {
                if (occurrence.form() != NameForm.IMPORT) {
                    kept.add(copied.weighing(occurrence));
                    return;
                }
                final ImportOrigin origin = origins.of(occurrence.text());
                tally.counted(origin);
                if (origin != ImportOrigin.EXTERNAL) {
                    return;
                }
                if (published.publishes(scope)) {
                    kept.add(occurrence);
                } else {
                    tally.setAsideAsToolchain();
                }
            });
            return new ParsedFile(scope, path, lines, kept, parsed.sound());
        }
    }

    /** Every scope name the tree was read over, in the order the scopes were given. */
    public Set<String> scopes() {
        return files.stream().map(ParsedFile::scope).collect(Collectors.toCollection(java.util.LinkedHashSet::new));
    }
}
