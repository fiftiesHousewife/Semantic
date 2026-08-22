package io.github.fiftieshousewife.codesemantics.corpus;

import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

/**
 * Prints how far the reference still moves as the draw grows, and how far any one repository holds it.
 *
 * <p>Properties: {@code cs.corpus.dir} names the directory holding the clones and
 * {@code cs.corpus.manifest} the draw that chose them. It writes no file.
 */
public final class CorpusPlateauCommand {

    private CorpusPlateauCommand() {
    }

    public static void main(final String[] arguments) {
        final Path corpus = ReferenceCorpus.directory();
        final DrawnManifest draw = ReferenceCorpus.drawnManifest();
        final List<CountedRepository> drawn = PooledWords.fromClasspath().each(draw.manifest(), corpus);
        Stream.of(CorpusPooling.values()).forEach(pooling -> System.out.println(measured(drawn, pooling)));
    }

    static String measured(final List<CountedRepository> drawn, final CorpusPooling pooling) {
        final CorpusPlateau plateau = CorpusPlateau.newInstance();
        return new PlateauReport().of(pooling, plateau.over(drawn, pooling),
                plateau.leavingEachOut(drawn, pooling));
    }
}
