package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
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

    private final List<ParsedFile> files;
    private final int unsoundFiles;
    private final ImportTally imports;
    private final ImportOrigins origins;

    private ParsedRepository(final List<ParsedFile> files, final int unsoundFiles,
                             final ImportTally imports, final ImportOrigins origins) {
        this.files = List.copyOf(files);
        this.unsoundFiles = unsoundFiles;
        this.imports = imports;
        this.origins = origins;
    }

    public static ParsedRepository of(final Path root, final List<SourceScope> scopes) {
        return of(root, scopes, List.of(new FixtureNameSource(), JavaSource.newInstance(), new MarkdownSource(),
                new AsciiDocSource(), new PomSource()), PlatformPackages.ofSystem());
    }

    public static ParsedRepository of(final Path root, final List<SourceScope> scopes,
                                      final List<SourceReader> readers, final PlatformPackages platform) {
        final List<ReadFile> read = scopes.stream()
                .flatMap(scope -> scope.files().stream()
                        .map(file -> ReadFile.of(root, scope.name(), file, readers)))
                .toList();
        final ImportOrigins origins = new ImportOrigins(platform, read.stream()
                .map(source -> source.parsed().packageName())
                .filter(name -> !name.isEmpty())
                .collect(Collectors.toUnmodifiableSet()));
        final ImportTally imports = new ImportTally();
        final PublishedSourceSets published = new PublishedSourceSets();
        final PackageWords packages = new PackageWords(read);
        final CopiedComments copied = CopiedComments.over(read.stream()
                .map(source -> source.parsed().occurrences())
                .toList());
        final List<ParsedFile> files = read.stream()
                .map(source -> source.retaining(origins, imports, packages.atFile(source), published, copied))
                .toList();
        return new ParsedRepository(files,
                (int) read.stream().filter(source -> !source.parsed().outcome().readCleanly()).count(),
                imports, origins);
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

    /** The sorting of a fully qualified name into platform, own and external, as the imports were sorted. */
    public ImportOrigins origins() {
        return origins;
    }

    /** Every scope name the tree was read over, in the order the scopes were given. */
    public Set<String> scopes() {
        return files.stream().map(ParsedFile::scope).collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
