package org.fifties.housewife.codesemantics.engine.reading;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.fifties.housewife.codesemantics.engine.parse.ImportOrigin;
import org.fifties.housewife.codesemantics.engine.parse.ParsedRepository;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * What the parse found in this repository, held in place.
 *
 * <p>Each of these was asserted by {@link SelfReadingDiagnostic} as though it held of any repository, and
 * none of them does. A tree can legitimately declare no Java where a build states its sources somewhere this
 * reading does not look; a tree can legitimately name no dependency outside itself; and a tree can
 * legitimately hold a file the parser refuses, which is the whole subject of the parse plan's recovery
 * question. On a panel each of those is a member to be reported, not a build to be failed — so what is
 * asserted here is asserted of this tree, which parses end to end and does name its dependencies.
 */
@Tag("pinned")
class PinnedLegibilityFindings {

    @Test
    void parsesThisTreeEndToEndAndNamesWhatItDependsOn() {
        final Path root = new HostTree().root();
        final List<SourceScope> scopes = Stream.concat(new JavaSourceScopes().under(root).stream(),
                new DocumentationScope().under(root).stream()).toList();
        final ParsedRepository parsed = ParsedRepository.of(root, scopes);

        assertAll(
                () -> assertThat(scopes).as("a repository with no Java sources cannot be read").isNotEmpty(),
                () -> assertThat(LegibilityReading.fromClasspath().of(parsed).repository().counts()
                        .declarations()).isPositive(),
                () -> assertThat(parsed.unsoundFiles())
                        .as("every file in this tree parses cleanly, which is a fact about this tree and "
                                + "the reason nothing here ever exercised the recovery path")
                        .isZero(),
                () -> assertThat(parsed.importsFrom(ImportOrigin.EXTERNAL)).isPositive());
    }
}
