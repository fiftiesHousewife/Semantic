package io.github.fiftieshousewife.codesemantics.engine.reading;

import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Which class names a build takes to be tests, and what each of them tests.
 *
 * <p>The patterns are Maven Surefire's own defaults, which its documentation states as
 * {@code **}{@code /Test*.java}, {@code **}{@code /*Test.java}, {@code **}{@code /*Tests.java} and
 * {@code **}{@code /*TestCase.java}. A build tool's statement of which files it runs as tests is a
 * published standard in the same sense as a specification's keyword table, so the subject of
 * {@code TikaConfigTest} is {@code TikaConfig} by Surefire's rule rather than by a convention named here.
 *
 * <p>It names what a test is called and never what it covers. A type with no test of its own name may
 * still be exercised by another, and this says nothing about that.
 */
public final class SurefireTestNames {

    /**
     * Surefire's four default patterns, with the subject required to open as a type name does. Oracle's
     * Java code conventions state that a class name begins with a capital, which is what keeps
     * {@code Tests} from reading as a test of something called {@code s}.
     */
    private static final List<Pattern> PATTERNS = List.of(
            Pattern.compile("^Test(?<subject>[A-Z].*)$"),
            Pattern.compile("^(?<subject>[A-Z].*)Tests$"),
            Pattern.compile("^(?<subject>[A-Z].*)TestCase$"),
            Pattern.compile("^(?<subject>[A-Z].*)Test$"));

    /** What this name tests under Surefire's defaults, and nothing where it names no test. */
    public Optional<String> subjectOf(final String name) {
        return PATTERNS.stream()
                .map(pattern -> pattern.matcher(name))
                .filter(Matcher::matches)
                .map(matched -> matched.group("subject"))
                .filter(subject -> !subject.isEmpty())
                .findFirst();
    }

    /** Whether the name is one Surefire would run as a test. */
    public boolean names(final String name) {
        return subjectOf(name).isPresent();
    }
}
