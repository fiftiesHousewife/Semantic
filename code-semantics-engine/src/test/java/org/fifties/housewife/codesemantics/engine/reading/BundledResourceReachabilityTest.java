package org.fifties.housewife.codesemantics.engine.reading;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * The other half of the resource contract: a bundled vocabulary nothing reads fails the build.
 *
 * <p>The provenance half has been enforced since the frequency list arrived with no source cited. This half
 * is the one that catches the opposite mistake — a file that keeps its header, keeps its licence obligation
 * and keeps its place in the jar long after the last thing that read it was deleted. Nothing fails when that
 * happens. The jar quietly grows, the attribution is still owed, and a reader looking for what the library
 * knows is handed a file the library stopped consulting.
 *
 * <p>A resource is read if some class this project ships names it. That is checked against the constant
 * pools of the compiled classes rather than against the source, because the source says what was written and
 * the constant pool says what is asked for at run time — a resource name spelled in a comment passes a grep
 * and answers nothing.
 *
 * <p>The one thing it cannot see is a name assembled at run time from pieces. If a resource is ever loaded
 * that way this test will call it unread, and the fix is to name it as a constant, which is the better
 * spelling in any case.
 */
class BundledResourceReachabilityTest {

    private final BundledArtefacts bundled = new BundledArtefacts();

    private final List<byte[]> classes = bundled.classes();

    @Test
    void findsTheArtefactsToAskAboutBeforeAskingAnything() {
        assertAll(
                () -> assertThat(bundled.entries())
                        .as("a classpath carrying none of this project's own resources would make every "
                                + "question below answer itself")
                        .contains("wordnet-domains.txt", "olia-terms.tsv", "common-english-words.txt"),
                () -> assertThat(classes).hasSizeGreaterThan(100));
    }

    @Test
    void callsAResourceUnreadWhenNothingNamesIt() {
        assertThat(readBy("fibo-interest-rate-swaps.tsv"))
                .as("a check that answers yes to everything has not been run, and this one is asked of "
                        + "every file in the jar")
                .isFalse();
    }

    @Test
    void everyBundledResourceIsNamedBySomethingThatShipsBesideIt() {
        assertAll(bundled.entries().stream().map(entry -> () -> assertThat(readBy(entry))
                .as("%s ships in a jar and no class this project publishes names it. A bundled resource "
                        + "nothing reads is weight in the artefact, an attribution still owed for data no "
                        + "longer used, and a file the next reader will take for part of what the library "
                        + "knows. Delete it, or land the reading that consults it.", entry)
                .isTrue()));
    }

    private boolean readBy(final String entry) {
        final byte[] name = entry.getBytes(StandardCharsets.UTF_8);
        return classes.stream().anyMatch(compiled -> holds(compiled, name));
    }

    /**
     * A string constant is stored in the constant pool as its own bytes, so the name a class asks the loader
     * for is present verbatim in the class file. A resource asked for as {@code /wordnet-domains.txt} and one
     * asked for as {@code wordnet-domains.txt} both carry the entry's own name, so the leading slash the
     * loader takes either way needs no special case here.
     */
    private static boolean holds(final byte[] compiled, final byte[] name) {
        for (int start = 0; start <= compiled.length - name.length; start++) {
            if (java.util.Arrays.equals(compiled, start, start + name.length, name, 0, name.length)) {
                return true;
            }
        }
        return false;
    }
}
