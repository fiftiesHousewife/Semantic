package io.github.fiftieshousewife.codesemantics.corpus;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * Prints the occurrence count below which a drawn repository tells the reference nothing a resample would
 * not have.
 *
 * <p>Properties: {@code cs.corpus.dir} names the directory holding the clones and
 * {@code cs.corpus.manifest} the draw that chose them. It writes no file.
 */
public final class CorpusFloorCommand {

    /** The seed every null in this library is drawn at, so two runs of one corpus cut it in one place. */
    public static final long SEED = 20260813L;

    private CorpusFloorCommand() {
    }

    public static void main(final String[] arguments) {
        final Path corpus = ReferenceCorpus.directory();
        final DrawnManifest draw = ReferenceCorpus.drawnManifest();
        final List<CountedRepository> drawn = PooledWords.fromClasspath().each(draw.manifest(), corpus);
        Stream.of(CorpusPooling.values()).forEach(pooling -> System.out.println(measured(drawn, pooling)));
    }

    static String measured(final List<CountedRepository> drawn, final CorpusPooling pooling) {
        final OccurrenceFloor floor = OccurrenceFloor.seeded(SEED);
        final List<OccurrenceFloor.Judged> judged = floor.over(drawn, pooling);
        return new FloorReport().of(pooling, judged, floor.at(judged));
    }
}
