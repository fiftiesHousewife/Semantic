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

readonly FRAME='language:Java fork:false mirror:false size:>=1000 pushed:2025-01-01..2026-08-20 license:apache-2.0 license:mit license:gpl-3.0 license:gpl-2.0 license:bsd-3-clause license:bsd-2-clause license:epl-2.0 license:mpl-2.0 license:lgpl-2.1 license:agpl-3.0 license:unlicense license:bsl-1.0 license:cc0-1.0'
readonly UNTIL='2026-08-20T23:59:59Z'
readonly SEED=20260821

# The exact frame count the sample was drawn against, asserted so a drifted population is refused rather
# than silently drawn from. EMPTY UNTIL THE FIRST DRAW UNDER THIS FRAME REPORTS IT: there is nothing to
# reproduce yet, and a number invented here would assert a population nobody counted.
readonly TOTAL="${CS_CORPUS_TOTAL:-}"

# How many repositories the reference is pooled over. A budget rather than a derived bound, argued in the
# manifest's own header.
readonly COUNT="${CS_CORPUS_COUNT:-100}"

# Repositories a rank may land on and be refused. EMPTY, AND IT STAYS EMPTY UNLESS A MEASUREMENT FILLS IT.
# Step 3 below judges every pair of the drawn sample against what two draws of their sizes reach by chance
# and names any repository that is a second copy of another; that name, and only that name, belongs here on
# a re-run. Carrying a name over from a sample it was measured on to one it was not is the hand exclusion
# list the doctrine refuses.
readonly DRAWN_TWICE="${CS_DRAWN_TWICE:-}"

readonly CLONES="${CS_CORPUS_DIR:-$HOME/corpus}"
readonly TABLES="${CS_CORPUS_TABLES:-$HOME/corpus-tables}"

cd "$ROOT"
mkdir -p "$CLONES" "$TABLES"

draw=(:reference-corpus-extraction:corpusDraw "-Dcs.draw.frame=$FRAME" "-Dcs.draw.until=$UNTIL" "-Dcs.draw.seed=$SEED" "-Dcs.draw.count=$COUNT" -Dcs.draw.publishes "-Dcs.draw.out=$RECORD" "-Dcs.draw.manifest=$MANIFEST")
# An `&&` guard here would return non-zero when the variable is empty, and set -e would stop the script.
if [ -n "$TOTAL" ]; then draw+=("-Dcs.draw.total=$TOTAL"); fi
if [ -n "$DRAWN_TWICE" ]; then draw+=("-Dcs.draw.exclude=$DRAWN_TWICE"); fi

echo "==> 1/5  Drawing $COUNT repositories at seed $SEED${TOTAL:+, asserting a frame of $TOTAL}${DRAWN_TWICE:+, refusing $DRAWN_TWICE}"
./gradlew --quiet "${draw[@]}"
if [ -z "$TOTAL" ]; then
  echo "     Record this frame count in TOTAL so a later run asserts it: $(python3 -c "import json;print(json.load(open('$RECORD'))['total'])")"
fi

echo "==> 2/5  Fetching the clones into $CLONES (trees already at their pins transfer nothing)"
./gradlew --quiet :reference-corpus-extraction:corpusFetch "-Dcs.corpus.dir=$CLONES" "-Dcs.corpus.manifest=$MANIFEST"

echo "==> 3/5  Checking no two of them are one corpus counted twice"
./gradlew --quiet :reference-corpus-extraction:corpusDuplicates "-Dcs.corpus.dir=$CLONES" "-Dcs.corpus.manifest=$MANIFEST" | tee "$TABLES/duplicates.txt"

if grep -q 'drawn twice, so a re-draw refuses' "$TABLES/duplicates.txt"; then
  echo
  echo "STOPPING BEFORE THE POOL. A repository in this sample is a second copy of another, and pooling it"
  echo "would count one corpus twice. The measurement names which one:"
  grep 'drawn twice, so a re-draw refuses' "$TABLES/duplicates.txt"
  echo
  echo "Re-run naming it, which makes the draw take the next rank rather than deleting a row:"
  echo "  CS_DRAWN_TWICE=<owner>/<name> bash reference-corpus-extraction/draw-the-corpus.sh"
  exit 1
fi

echo "==> 4/5  Pooling into $TABLES/tables (cs.corpus.out names a directory, not a file)"
./gradlew --quiet :reference-corpus-extraction:corpusPool "-Dcs.corpus.dir=$CLONES" "-Dcs.corpus.manifest=$MANIFEST" "-Dcs.corpus.out=$TABLES/tables"

echo "==> 5/5  Bundling the mean of shares, which is the weighting the library ships"
cp "$TABLES/tables/reference-corpus-mean-of-shares.tsv" "$BUNDLED"

echo
echo "Done. Two things to read before trusting any of it."
echo
echo "  1. $TABLES/duplicates.txt — a pair reported as one corpus is a repository counted twice, and the"
echo "     later-drawn member belongs in DRAWN_TWICE at the top of this script. Re-run if any turns up."
echo "  2. git diff $MANIFEST — under an unchanged frame the recorded rows keep their ranks and only"
echo "     additions appear. A wholly different set of rows means the frame moved, and TOTAL should have"
echo "     caught it: check that it is set."
echo
echo "Then, in this shell: ./gradlew cleanTest checkAll && ./gradlew read"
