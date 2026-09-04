package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MediaTypeExtractionTest {

    @Test
    void refusesAFileSetThatIsNotTheOneThisClassCites() {
        final List<ContentDigest.Member> other = List.of(new ContentDigest.Member("application.csv",
                "Name,Template,Reference\n".getBytes(StandardCharsets.UTF_8)));
        assertThatThrownBy(() -> new MediaTypeExtraction().source().pinned(other))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1 registry CSVs digesting to");
    }
}
