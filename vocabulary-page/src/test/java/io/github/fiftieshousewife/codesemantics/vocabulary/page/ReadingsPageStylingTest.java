package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReadingsPageStylingTest {

    private static final Pattern EMITTED = Pattern.compile("element\\(\\s*\"[a-z]+\"\\s*,\\s*\"([^\"]+)\"");

    private static Set<String> classesEmitted() throws IOException {
        final Matcher emitted = EMITTED.matcher(ReadingsCommand.read(ReadingsCommand.BEHAVIOUR));
        return emitted.results()
                .map(found -> found.group(1))
                .flatMap(named -> List.of(named.split(" ")).stream())
                .collect(Collectors.toSet());
    }

    private static String stylesheets() throws IOException {
        return ReadingsCommand.read(ReadingsCommand.SHARED) + ReadingsCommand.read(ReadingsCommand.STYLESHEET);
    }

    @Test
    void statesARuleForEveryClassTheReadingsPageEmits() throws IOException {
        final String rules = stylesheets();
        assertThat(classesEmitted())
                .isNotEmpty()
                .allSatisfy(named -> assertThat(rules).contains("." + named));
    }
}
