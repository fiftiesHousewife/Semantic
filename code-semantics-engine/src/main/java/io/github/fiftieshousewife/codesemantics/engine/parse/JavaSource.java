package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.nio.file.Path;
import java.util.List;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.ast.nodeTypes.NodeWithName;

/**
 * Reads one Java file into the names its author declared and the prose they wrote, and nothing else.
 *
 * <p>Every occurrence here is a <em>declaration</em> or a comment. A type mentioned in a signature, a method
 * invoked, a field read — none of those are collected, because none of them is a word this repository chose:
 * they are the vocabulary of whatever declared them, quoted. That single rule is what removes {@code String},
 * {@code List}, {@code assertThat} and the rest of the platform and framework surface from the reading
 * without naming any of them, and it is available only to a parse. The declarations themselves are walked by
 * {@link DeclaredOccurrences}, under the forms {@link DeclaredNameForms} reads each as.
 *
 * <p>Error tolerance is a requirement and not a nicety, because the commits that most need reading are the
 * ones that do not compile. A file the parser had problems with keeps whatever it recovered and is reported
 * as {@link ParseOutcome#RECOVERED}; only a file it could make nothing at all of reads as
 * {@link ParsedSource#unreadable()}. Neither throws, and neither is silently dropped.
 */
public final class JavaSource implements SourceReader {

    private static final String JAVA_SUFFIX = ".java";

    private final JavaParser parser;
    private final DeclaredOccurrences declarations;
    private final JavadocProse javadoc = new JavadocProse();

    public JavaSource(final ParserConfiguration configuration, final DeclaredTypeWords typeWords) {
        this.parser = new JavaParser(configuration);
        this.declarations = new DeclaredOccurrences(typeWords);
    }

    public static JavaSource newInstance() {
        return new JavaSource(new ParserConfiguration()
                .setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21),
                DeclaredTypeWords.fromClasspath());
    }

    @Override
    public boolean reads(final Path file) {
        return file.getFileName().toString().endsWith(JAVA_SUFFIX);
    }

    @Override
    public ParsedSource read(final Path file, final String source) {
        final ParseResult<CompilationUnit> result = parser.parse(source);
        return result.getResult()
                .map(unit -> occurrencesIn(unit,
                        result.getProblems().isEmpty() ? ParseOutcome.CLEAN : ParseOutcome.RECOVERED))
                .orElseGet(ParsedSource::unreadable);
    }

    private ParsedSource occurrencesIn(final CompilationUnit unit, final ParseOutcome outcome) {
        final List<NameOccurrence> occurrences = declarations.in(unit);
        unit.getAllComments().forEach(comment -> prose(comment, occurrences));
        return new ParsedSource(unit.getPackageDeclaration()
                .map(NodeWithName::getNameAsString).orElse(""), occurrences, outcome);
    }

    /**
     * A comment as the author's own sentences. A javadoc is read through {@link JavadocProse}, which leaves
     * out Javadoc's tag names and the names its inline tags point at; any other comment is the text it is.
     */
    private void prose(final Comment comment, final List<NameOccurrence> occurrences) {
        if (comment instanceof JavadocComment written) {
            declarations.add(javadoc.in(written), NameForm.JAVADOC, comment, occurrences);
            return;
        }
        declarations.add(comment.getContent(), NameForm.COMMENT, comment, occurrences);
    }
}
