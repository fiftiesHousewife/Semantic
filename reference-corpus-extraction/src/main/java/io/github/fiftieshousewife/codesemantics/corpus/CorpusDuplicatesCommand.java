package io.github.fiftieshousewife.codesemantics.corpus;

import java.nio.file.Path;
import java.util.List;

/**
 * Prints which drawn repositories are one corpus counted twice, and which of each pair a re-draw refuses.
 *
 * <p>Properties: {@code cs.corpus.dir} names the directory holding the clones and
 * {@code cs.corpus.manifest} the draw that chose them. It writes no file.
 */
public final class CorpusDuplicatesCommand {

    /** The seed every null in this library is drawn at, so two runs of one corpus cut it in one place. */
    public static final long SEED = 20260813L;

    private CorpusDuplicatesCommand() {
    }

    public static void main(final String[] arguments) {
        final Path corpus = ReferenceCorpus.directory();
        final DrawnManifest draw = ReferenceCorpus.drawnManifest();
        System.out.println(measured(PooledWords.fromClasspath().each(draw.manifest(), corpus)));
    }

    static String measured(final List<CountedRepository> drawn) {
        final NearDuplicates duplicates = NearDuplicates.seeded(SEED);
        final List<NearDuplicates.Judged> judged = duplicates.over(drawn);
        return new DuplicateReport().of(judged, duplicates.drawnTwice(judged));
    }
}
