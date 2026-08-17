package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * A bundled vocabulary nothing reads fails the build: the complement of {@code VocabularyProvenanceTest}.
 *
 * <p>A resource counts as read if a shipped class names it in its constant pool — the source says what was
 * written, the constant pool says what is asked for at run time. A name assembled at run time from pieces is
 * invisible here; load such a resource through a constant instead.
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
