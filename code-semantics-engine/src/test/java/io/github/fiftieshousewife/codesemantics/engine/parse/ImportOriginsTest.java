package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.Set;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ImportOriginsTest {

    private final ImportOrigins origins = new ImportOrigins(PlatformPackages.ofSystem(),
            Set.of("io.github.fiftieshousewife.codesemantics.engine.theme"));

    @Test
    void readsAPackageThePlatformExportsAsThePlatformsOwnVocabulary() {
        assertAll(
                () -> assertThat(origins.of("java.util.List")).isEqualTo(ImportOrigin.PLATFORM),
                () -> assertThat(origins.of("java.util.stream.Collectors")).isEqualTo(ImportOrigin.PLATFORM),
                () -> assertThat(origins.of("javax.lang.model.SourceVersion")).isEqualTo(ImportOrigin.PLATFORM));
    }

    @Test
    void readsAPackageThisRepositoryDeclaresAsItsOwnCoordinates() {
        assertThat(origins.of("io.github.fiftieshousewife.codesemantics.engine.theme.TopicVote"))
                .isEqualTo(ImportOrigin.INTERNAL);
    }

    @Test
    void readsEverythingElseAsAChoiceThisRepositoryMade() {
        assertAll(
                () -> assertThat(origins.of("net.sf.extjwnl.data.POS")).isEqualTo(ImportOrigin.EXTERNAL),
                () -> assertThat(origins.of("com.github.javaparser.JavaParser")).isEqualTo(ImportOrigin.EXTERNAL),
                () -> assertThat(origins.of("org.junit.jupiter.api.Test")).isEqualTo(ImportOrigin.EXTERNAL));
    }

    @Test
    void sortsAStaticImportByThePackageAboveTheMemberAndTheType() {
        assertAll(
                () -> assertThat(origins.of("org.assertj.core.api.Assertions.assertThat"))
                        .isEqualTo(ImportOrigin.EXTERNAL),
                () -> assertThat(origins.of("java.util.Map.Entry")).isEqualTo(ImportOrigin.PLATFORM));
    }

    @Test
    void needsNoConventionAboutWhichSegmentIsAPackage() {
        assertThat(origins.of("java"))
                .as("a prefix walk answers from the resources themselves, capitalisation unread")
                .isEqualTo(ImportOrigin.EXTERNAL);
    }

    @Test
    void readsThePlatformsOwnStatementOfWhatItExports() {
        assertAll(
                () -> assertThat(PlatformPackages.ofSystem().size()).isGreaterThan(100),
                () -> assertThat(PlatformPackages.ofSystem().exports("java.util")).isTrue(),
                () -> assertThat(PlatformPackages.ofSystem().exports("net.sf.extjwnl")).isFalse());
    }
}
