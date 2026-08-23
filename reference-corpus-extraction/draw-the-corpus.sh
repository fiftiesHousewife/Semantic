#!/usr/bin/env bash
#
# The reference corpus, end to end: draw the sample, fetch it, pool it, and check that no two drawn
# repositories are one corpus counted twice.
#
# Run it from anywhere. It needs a shell that reaches GitHub, which the agent session is not.
#
#     bash reference-corpus-extraction/draw-the-corpus.sh
#
# The frame, the seed and the date ceiling are the ones the published manifest states in its own header,
# fixed before a single rank was drawn. THE FRAME COUNT IS ASSERTED, not read afterwards: a rank resolves to
# a repository through counts taken live, so a drifted frame maps the same seeded ranks to different
# repositories. The draw refuses before it writes anything if the count has moved.

set -euo pipefail

readonly ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
readonly RESOURCES="reference-corpus-extraction/src/main/resources"
readonly MANIFEST="$RESOURCES/reference-corpus-published.tsv"
readonly RECORD="$RESOURCES/published-draw.json"
readonly BUNDLED="reference-corpus/src/main/resources/reference-corpus-shares.tsv"

readonly FRAME='language:Java fork:false mirror:false size:>=1000 pushed:>=2025-01-01 license:apache-2.0 license:mit license:gpl-3.0 license:gpl-2.0 license:bsd-3-clause license:bsd-2-clause license:epl-2.0 license:mpl-2.0 license:lgpl-2.1 license:agpl-3.0 license:unlicense license:bsl-1.0 license:cc0-1.0'
readonly UNTIL='2026-08-20T23:59:59Z'
readonly SEED=20260821
readonly TOTAL=112183

# How many repositories the reference is pooled over. A budget rather than a derived bound, argued in the
# manifest's own header.
readonly COUNT="${CS_CORPUS_COUNT:-100}"

# Drawn twice: benchmarkjava and codemedics-sample are both the OWASP Benchmark. Named here because a
# measurement named it — corpusDuplicates found one pair of 435 below chance — and not because it looked
# awkward. codemedics-sample holds the earlier rank, so benchmarkjava is the rejection.
readonly DRAWN_TWICE='coyote-engineering/BenchmarkJava'

readonly CLONES="${CS_CORPUS_DIR:-$HOME/corpus}"
readonly TABLES="${CS_CORPUS_TABLES:-$HOME/corpus-tables}"

cd "$ROOT"
mkdir -p "$CLONES" "$TABLES"

echo "==> 1/4  Drawing $COUNT repositories at seed $SEED, refusing $DRAWN_TWICE"
./gradlew --quiet :reference-corpus-extraction:corpusDraw "-Dcs.draw.frame=$FRAME" "-Dcs.draw.until=$UNTIL" "-Dcs.draw.seed=$SEED" "-Dcs.draw.count=$COUNT" "-Dcs.draw.total=$TOTAL" -Dcs.draw.publishes "-Dcs.draw.exclude=$DRAWN_TWICE" "-Dcs.draw.out=$RECORD" "-Dcs.draw.manifest=$MANIFEST"

echo "==> 2/4  Fetching the clones into $CLONES (trees already at their pins transfer nothing)"
./gradlew --quiet :reference-corpus-extraction:corpusFetch "-Dcs.corpus.dir=$CLONES" "-Dcs.corpus.manifest=$MANIFEST"

echo "==> 3/4  Checking no two of them are one corpus counted twice"
./gradlew --quiet :reference-corpus-extraction:corpusDuplicates "-Dcs.corpus.dir=$CLONES" "-Dcs.corpus.manifest=$MANIFEST" | tee "$TABLES/duplicates.txt"

echo "==> 4/5  Pooling into $TABLES/tables (cs.corpus.out names a directory, not a file)"
./gradlew --quiet :reference-corpus-extraction:corpusPool "-Dcs.corpus.dir=$CLONES" "-Dcs.corpus.manifest=$MANIFEST" "-Dcs.corpus.out=$TABLES/tables"

echo "==> 5/5  Bundling the mean of shares, which is the weighting the library ships"
cp "$TABLES/tables/reference-corpus-mean-of-shares.tsv" "$BUNDLED"

echo
echo "Done. Two things to read before trusting any of it."
echo
echo "  1. $TABLES/duplicates.txt — a pair reported as one corpus is a repository counted twice, and the"
echo "     later-drawn member belongs in DRAWN_TWICE at the top of this script. Re-run if any turns up."
echo "  2. git diff $MANIFEST — the rows already recorded keep their ranks; only additions are expected."
echo
echo "Then, in this shell: ./gradlew cleanTest checkAll && ./gradlew read"
