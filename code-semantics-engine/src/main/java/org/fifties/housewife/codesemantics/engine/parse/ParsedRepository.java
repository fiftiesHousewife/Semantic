package org.fifties.housewife.codesemantics.engine.parse;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.fifties.housewife.codesemantics.engine.reading.SourceScope;

/**
 * A whole working tree, parsed once. Two passes, and the second needs the first: an import can only be known
 * for this repository's own coordinates once every package this repository declares has been seen.
 *
 * <p>Nothing is dropped silently. Files the parser refused are counted, and so is every import set aside —
 * a reading that quietly narrowed its corpus would report a cleaner result than it earned.
 */
public final class ParsedRepository {

    /** The dot the tail begins with once its shared coordinate is taken off, which names no rung. */
    private static final Pattern LEADING_QUALIFIER = Pattern.compile("^\\.");

    private final List<ParsedFile> files;
    private final int unsoundFiles;
    private final Map<ImportOrigin, Integer> importsByOrigin;

    private ParsedRepository(final List<ParsedFile> files, final int unsoundFiles,
                             final Map<ImportOrigin, Integer> importsByOrigin) {
        this.files = List.copyOf(files);
        this.unsoundFiles = unsoundFiles;
        this.importsByOrigin = Map.copyOf(importsByOrigin);
    }

    public static ParsedRepository of(final Path root, final List<SourceScope> scopes) {
        return of(root, scopes, List.of(JavaSource.newInstance(), new MarkdownSource()),
                PlatformPackages.ofSystem());
    }

    /**
     * The package prefix every file in the repository shares, which is the organisation's coordinate rather
     * than anything an author chose per file — {@code org.fifties.housewife.codesemantics}. It is derived
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
     * What a file's package says that its neighbours' do not. These are the most deliberate names in a
     * repository — {@code parse}, {@code reading}, {@code theme}, {@code term} — chosen once each to divide
     * the work, and until now read only to sort imports.
     *
     * <p><b>The separator stays the one the identifier grammar knows.</b> This handed on a tail with its
     * dots replaced by spaces, which reads well and was read by nothing: the identifier splitter divides at
     * case boundaries, underscores, hyphens and the qualifier dot, and a space is none of those, so a
     * two-rung tail arrived as one token nothing could be cited for. Every deep package in this tree was in
     * the unread tail on that account — {@code codesemantics engine theme} eighty-one times — and the words
     * an author chose to divide their work by were the words the reading never saw.
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
        final Map<ImportOrigin, Integer> imports = new EnumMap<>(ImportOrigin.class);
        final String coordinate = sharedPackagePrefix(read);
        final List<ParsedFile> files = read.stream()
                .map(source -> source.retaining(origins, imports,
                        packageWords(source.parsed().packageName(), coordinate)))
                .toList();
        return new ParsedRepository(files,
                (int) read.stream().filter(source -> !source.parsed().sound()).count(), imports);
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

    /** How many imports each origin accounted for, including the two the reading sets aside. */
    public int importsFrom(final ImportOrigin origin) {
        return importsByOrigin.getOrDefault(origin, 0);
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

        ParsedFile retaining(final ImportOrigins origins, final Map<ImportOrigin, Integer> tally,
                             final List<NameOccurrence> alsoDeclared) {
            final List<NameOccurrence> kept = new ArrayList<>(alsoDeclared);
            parsed.occurrences().forEach(occurrence -> {
                if (occurrence.form() != NameForm.IMPORT) {
                    kept.add(occurrence);
                    return;
                }
                final ImportOrigin origin = origins.of(occurrence.text());
                tally.merge(origin, 1, Integer::sum);
                if (origin == ImportOrigin.EXTERNAL) {
                    kept.add(occurrence);
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
