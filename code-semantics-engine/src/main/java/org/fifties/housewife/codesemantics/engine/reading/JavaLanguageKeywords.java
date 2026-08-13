package org.fifties.housewife.codesemantics.engine.reading;

import javax.lang.model.SourceVersion;

/**
 * Whether a token is one of the language's own words rather than one of the author's. The citation is the
 * platform's own implementation of its specification — {@link SourceVersion#isKeyword(CharSequence)}, which
 * answers for the keyword table of the Java Language Specification §3.9 together with the three literals
 * {@code true}, {@code false} and {@code null} — so no keyword list is written, bundled or maintained here.
 * The compiler API ships with the toolchain, which makes it the cheapest citable catalogue there is.
 *
 * <p>A contextual keyword ({@code var}, {@code record}, {@code sealed}, {@code yield}) is deliberately not
 * named: the specification makes it an identifier that only reads as a keyword in one position, and a
 * position is something a parse knows and a scan does not. Those tokens therefore go forward as the author's
 * words, which understates the demotion rather than overstating it.
 */
public final class JavaLanguageKeywords {

    public boolean names(final String token) {
        return SourceVersion.isKeyword(token);
    }
}
