package org.fifties.housewife.bi.lexicon.extraction;

import org.junit.jupiter.api.Test;

import java.io.UncheckedIOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertAll;

class AbbreviationSensesTest {

    private final AbbreviationSenses senses = new AbbreviationSenses();

    @Test
    void extractsAnAbbreviationSenseWithItsTopics() {
        final List<AbbreviationSense> extracted = senses.fromEntryJson("""
                {"word":"avg","lang_code":"en","pos":"noun","senses":[{"tags":["abbreviation","alt-of"],\
                "alt_of":[{"word":"average"}],"topics":["mathematics"],"glosses":["Abbreviation of average."]}]}""");
        assertAll(
                () -> assertThat(extracted).hasSize(1),
                () -> assertThat(extracted.getFirst().token()).isEqualTo("avg"),
                () -> assertThat(extracted.getFirst().expansion()).isEqualTo("average"),
                () -> assertThat(extracted.getFirst().kind()).isEqualTo("abbreviation"),
                () -> assertThat(extracted.getFirst().topics()).containsExactly("mathematics"));
    }

    @Test
    void readsInitialismAcronymAndClippingKinds() {
        final List<AbbreviationSense> extracted = senses.fromEntryJson("""
                {"word":"bp","lang_code":"en","senses":[\
                {"tags":["initialism"],"alt_of":[{"word":"break point"}],"topics":["tennis"]},\
                {"tags":["acronym"],"alt_of":[{"word":"blood pressure"}],"topics":["medicine"]},\
                {"tags":["clipping"],"alt_of":[{"word":"boilerplate"}]}]}""");
        assertThat(extracted).extracting(AbbreviationSense::kind)
                .containsExactly("initialism", "acronym", "clipping");
    }

    @Test
    void readsAClippingTargetFromFormOf() {
        final List<AbbreviationSense> extracted = senses.fromEntryJson("""
                {"word":"abs","lang_code":"en","senses":[{"tags":["clipping"],"form_of":[{"word":"abdominals"}]}]}""");
        assertThat(extracted.getFirst().expansion()).isEqualTo("abdominals");
    }

    @Test
    void readsEveryExpansionASenseNames() {
        final List<AbbreviationSense> extracted = senses.fromEntryJson("""
                {"word":"pt","lang_code":"en","senses":[{"tags":["abbreviation"],\
                "alt_of":[{"word":"point"},{"word":"pint"}]}]}""");
        assertThat(extracted).extracting(AbbreviationSense::expansion).containsExactly("point", "pint");
    }

    @Test
    void extractsATranslingualUnitSymbolWithItsQuantity() {
        final List<AbbreviationSense> extracted = senses.fromEntryJson("""
                {"word":"kJ","lang_code":"mul","pos":"symbol","senses":[{"tags":["alt-of","symbol"],\
                "alt_of":[{"word":"kilojoule","extra":"an SI unit of work or energy equal to 10\\u00b3 joules"}],\
                "topics":["metrology"],"glosses":["Symbol for kilojoule."]}]}""");
        assertAll(
                () -> assertThat(extracted).hasSize(1),
                () -> assertThat(extracted.getFirst().token()).isEqualTo("kj"),
                () -> assertThat(extracted.getFirst().expansion()).isEqualTo("kilojoule"),
                () -> assertThat(extracted.getFirst().kind()).isEqualTo("symbol"),
                () -> assertThat(extracted.getFirst().topics()).containsExactly("metrology"),
                () -> assertThat(extracted.getFirst().quantity()).isEqualTo("work or energy"));
    }

    @Test
    void aSymbolWithoutAUnitDescriptionCarriesNoQuantity() {
        final List<AbbreviationSense> extracted = senses.fromEntryJson("""
                {"word":"Ag","lang_code":"mul","pos":"symbol","senses":[{"tags":["alt-of","symbol"],\
                "alt_of":[{"word":"antigen"}]}]}""");
        assertThat(extracted.getFirst().quantity()).isEmpty();
    }

    @Test
    void refusesASymbolWhoseTargetIsAnotherSymbol() {
        assertThat(senses.fromEntryJson("""
                {"word":"kWh","lang_code":"mul","pos":"symbol","senses":[{"tags":["alt-of","alternative"],\
                "alt_of":[{"word":"kW\\u00b7h"}],"glosses":["Alternative form of kW\\u00b7h"]}]}""")).isEmpty();
    }

    @Test
    void refusesASymbolTargetNotWrittenInWords() {
        assertThat(senses.fromEntryJson("""
                {"word":"Gy","lang_code":"mul","pos":"symbol","senses":[{"tags":["alt-of","symbol"],\
                "alt_of":[{"word":"gray(s)"}],"topics":["metrology"]}]}""")).isEmpty();
    }

    @Test
    void aSymbolSenseWithoutATargetCitesNothing() {
        assertThat(senses.fromEntryJson("""
                {"word":"kcal","lang_code":"mul","pos":"symbol","senses":[{"glosses":["kilocalorie"]}]}""")).isEmpty();
    }

    @Test
    void ignoresASenseWithoutAQualifyingTag() {
        assertThat(senses.fromEntryJson("""
                {"word":"average","lang_code":"en","senses":[{"tags":["uncountable"],\
                "alt_of":[{"word":"mean"}]}]}""")).isEmpty();
    }

    @Test
    void ignoresANonEnglishEntry() {
        assertThat(senses.fromEntryJson("""
                {"word":"avg","lang_code":"de","senses":[{"tags":["abbreviation"],\
                "alt_of":[{"word":"average"}]}]}""")).isEmpty();
    }

    @Test
    void normalisesTheTokensTrailingDotAndCase() {
        final List<AbbreviationSense> extracted = senses.fromEntryJson("""
                {"word":"Avg.","lang_code":"en","senses":[{"tags":["abbreviation"],\
                "alt_of":[{"word":"Average"}]}]}""");
        assertAll(
                () -> assertThat(extracted.getFirst().token()).isEqualTo("avg"),
                () -> assertThat(extracted.getFirst().expansion()).isEqualTo("average"));
    }

    @Test
    void skipsAMultiWordToken() {
        assertThat(senses.fromEntryJson("""
                {"word":"et al.","lang_code":"en","senses":[{"tags":["abbreviation"],\
                "alt_of":[{"word":"et alii"}]}]}""")).isEmpty();
    }

    @Test
    void skipsAnExpansionEqualToTheToken() {
        assertThat(senses.fromEntryJson("""
                {"word":"avg","lang_code":"en","senses":[{"tags":["abbreviation"],\
                "alt_of":[{"word":"AVG"}]}]}""")).isEmpty();
    }

    @Test
    void aMalformedLineFailsTheExtraction() {
        assertThatThrownBy(() -> senses.fromEntryJson("{not json"))
                .isInstanceOf(UncheckedIOException.class);
    }
}
