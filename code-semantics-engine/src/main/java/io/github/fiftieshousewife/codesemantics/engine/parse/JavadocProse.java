package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.github.javaparser.ast.comments.JavadocComment;
import com.github.javaparser.javadoc.Javadoc;
import com.github.javaparser.javadoc.JavadocBlockTag;
import com.github.javaparser.javadoc.description.JavadocDescription;
import com.github.javaparser.javadoc.description.JavadocSnippet;

/**
 * The sentences an author wrote in a javadoc comment, without the parts Javadoc's own syntax put there.
 *
 * <p>Three things are left out, each by the declaration-against-use rule. {@code @param}, {@code @return}
 * and {@code @throws} are the tool's tag names rather than words about a subject. The name a {@code @param}
 * tag carries is the parameter, already read where it was declared. And what an inline tag points at — a
 * linked type, a quoted literal — is a use of something declared elsewhere.
 *
 * <p>A fourth is markup. A doc comment is written in HTML, which the Javadoc specification states, so
 * {@code <p>} and {@code <em>} are the format's own syntax standing where a word would be. The tags go and
 * what they mark up stays.
 *
 * <p>Javadoc's structure says which is which, read through the parser's own model rather than a list of
 * tags kept here. A comment the model cannot make sense of is read as the text it is, which overstates
 * what the author wrote rather than losing it.
 */
public final class JavadocProse {

    /** An HTML tag, which the specification allows a doc comment to be written in and an author to mean. */
    private static final Pattern MARKUP = Pattern.compile("</?[A-Za-z][^>]*>");

    /** The author's own sentences, joined by the blank the reading splits them on again. */
    public String in(final JavadocComment comment) {
        return sentences(comment).filter(text -> !text.isBlank())
                .map(String::trim)
                .collect(Collectors.joining(" "))
                .trim();
    }

    private static Stream<String> sentences(final JavadocComment comment) {
        final Javadoc parsed = comment.parse();
        return Stream.concat(Stream.of(written(parsed.getDescription())),
                parsed.getBlockTags().stream().map(JavadocProse::written));
    }

    /**
     * A block tag's own sentence. Its tag name is Javadoc's and its {@code name} is a parameter or an
     * exception this file declares or imports, so only the content is the author writing about a subject.
     */
    private static String written(final JavadocBlockTag tag) {
        return written(tag.getContent());
    }

    /** Only the snippets: an inline tag's content is a name, and a name in prose is a use. */
    private static String written(final JavadocDescription description) {
        return description.getElements().stream()
                .filter(JavadocSnippet.class::isInstance)
                .map(JavadocSnippet.class::cast)
                .map(JavadocSnippet::toText)
                .map(text -> MARKUP.matcher(text).replaceAll(" "))
                .collect(Collectors.joining(" "));
    }
}
