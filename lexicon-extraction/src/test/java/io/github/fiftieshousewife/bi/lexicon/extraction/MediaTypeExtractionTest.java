package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MediaTypeExtractionTest {

    @Test
    void refusesAFileSetThatIsNotTheOneThisClassCites() {
        final List<ContentDigest.Member> other = List.of(new ContentDigest.Member("application.csv",
                "Name,Template,Reference\n".getBytes(StandardCharsets.UTF_8)));
        assertThatThrownBy(() -> new MediaTypeExtraction().pinned(other))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("where the file set this class cites digests to");
    }
}
