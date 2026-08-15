package org.fifties.housewife.codesemantics.engine.parse;

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
 * <p>Three things are left out and each is the declaration-against-use rule arriving inside prose.
 * {@code @param}, {@code @return} and {@code @throws} are the tool's tag names rather than words about a
 * subject — Tika writes them 2,768, 1,430 and 746 times, and {@code return} is a word about finance to a
 * topical resource. The name a {@code @param} tag carries is the parameter, already read where it was
 * declared. And what an inline tag points at — a linked type, a quoted literal — is a use of something
 * declared elsewhere, which is the one distinction the whole reading turns on.
 *
 * <p>Javadoc's structure is what says which is which, read through the parser's own model of it rather than
 * through a list of tags kept here. A comment the model cannot make sense of is read as the text it is,
 * which overstates what the author wrote rather than losing it.
 */
public final class JavadocProse {

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
                .collect(Collectors.joining(" "));
    }
}
