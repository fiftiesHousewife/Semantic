#!/usr/bin/env bash
#
# The reference corpus, end to end: draw the sample, fetch it, pool it, and check that no two drawn
# repositories are one corpus counted twice.
#
# Run it from anywhere. It needs a shell that reaches GitHub, which the agent session is not.
#
#     bash reference-corpus-extraction/draw-the-corpus.sh
#
# It runs five stages. Name one to start there, which is what to do where a later stage failed and the
# manifest on disk is already the one wanted:
#
#     bash reference-corpus-extraction/draw-the-corpus.sh fetch
#
# The frame, the seed and the date ceiling are the ones the published manifest states in its own header,
# fixed before a single rank was drawn. THE FRAME COUNT IS ASSERTED, not read afterwards: a rank resolves to
# a repository through counts taken live, so a drifted frame maps the same seeded ranks to different
# repositories. The draw refuses before it writes anything if the count has moved.

set -euo pipefail

# Which stage to start at. Naming a later one keeps the manifest and record already on disk.
case "${1:-draw}" in
  draw)   readonly FROM=1 ;;
  fetch)  readonly FROM=2 ;;
  check)  readonly FROM=3 ;;
  pool)   readonly FROM=4 ;;
  bundle) readonly FROM=5 ;;
  *) echo "Start at one of: draw fetch check pool bundle" >&2; exit 2 ;;
esac

readonly ROOT="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
readonly RESOURCES="reference-corpus-extraction/src/main/resources"
readonly MANIFEST="$RESOURCES/reference-corpus-published.tsv"
readonly RECORD="$RESOURCES/published-draw.json"
readonly BUNDLED="reference-corpus/src/main/resources/reference-corpus-shares.tsv"

readonly FRAME='language:Java fork:false mirror:false size:>=1000 pushed:>=2025-01-01 license:apache-2.0 license:mit license:gpl-3.0 license:gpl-2.0 license:bsd-3-clause license:bsd-2-clause license:epl-2.0 license:mpl-2.0 license:lgpl-2.1 license:agpl-3.0 license:unlicense license:bsl-1.0 license:cc0-1.0'
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

# The nine repositories the reading is scored on. A denominator built partly from the repositories it will
# be measured against would agree with them for that reason alone, so a rank landing on one is refused. The
# names are read from the evaluation set's own manifest rather than written here, so the two cannot drift.
readonly EVALUATION_SET="code-semantics-engine/src/test/resources/evaluation-set.tsv"

readonly CLONES="${CS_CORPUS_DIR:-$HOME/corpus}"
readonly TABLES="${CS_CORPUS_TABLES:-$HOME/corpus-tables}"

# A token triples the rate GitHub allows: ten queries a minute becomes thirty, so the pace drops from nine
# seconds a query to three. GitHubSearch reads GITHUB_TOKEN from the environment, so exporting one before
# this runs is the whole of it. Without one the draw still works and takes about three times as long.
if [ -z "${GITHUB_TOKEN:-}" ]; then
  echo "NOTE: no GITHUB_TOKEN in the environment. The draw will pace at nine seconds a query rather than"
  echo "      three. Export a token with public read access and re-run to finish in about a third of the time."
  echo
fi

cd "$ROOT"
mkdir -p "$CLONES" "$TABLES"

draw=(:reference-corpus-extraction:corpusDraw "-Dcs.draw.frame=$FRAME" "-Dcs.draw.until=$UNTIL" "-Dcs.draw.seed=$SEED" "-Dcs.draw.count=$COUNT" -Dcs.draw.publishes "-Dcs.draw.out=$RECORD" "-Dcs.draw.manifest=$MANIFEST")
# An `&&` guard here would return non-zero when the variable is empty, and set -e would stop the script.
if [ -n "$TOTAL" ]; then draw+=("-Dcs.draw.total=$TOTAL"); fi
scored=$(awk '!/^#/ && NF {print $2}' "$EVALUATION_SET" | sed -e 's|^https://github.com/||' -e 's|\.git$||' | paste -sd, -)
if [ -z "$scored" ]; then
  echo "Read no repository from $EVALUATION_SET. Refusing to draw a corpus that could contain one of the" >&2
  echo "repositories the reading is scored on." >&2
  exit 1
fi
refused="$scored${DRAWN_TWICE:+,$DRAWN_TWICE}"
draw+=("-Dcs.draw.exclude=$refused")

if [ "$FROM" -le 1 ]; then
echo "==> 1/5  Drawing $COUNT repositories at seed $SEED${TOTAL:+, asserting a frame of $TOTAL}"
echo "         refusing: $refused"
./gradlew --quiet "${draw[@]}"
if [ -z "$TOTAL" ]; then
  echo "     Record this frame count in TOTAL so a later run asserts it: $(python3 -c "import json;print(json.load(open('$RECORD'))['total'])")"
fi
fi

if [ "$FROM" -le 2 ]; then
echo "==> 2/5  Fetching the clones into $CLONES (trees already at their pins transfer nothing)"
./gradlew --quiet :reference-corpus-extraction:corpusFetch "-Dcs.corpus.dir=$CLONES" "-Dcs.corpus.manifest=$MANIFEST"
fi

if [ "$FROM" -le 3 ]; then
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
fi

if [ "$FROM" -le 4 ]; then
echo "==> 4/5  Pooling into $TABLES/tables (cs.corpus.out names a directory, not a file)"
./gradlew --quiet :reference-corpus-extraction:corpusPool "-Dcs.corpus.dir=$CLONES" "-Dcs.corpus.manifest=$MANIFEST" "-Dcs.corpus.out=$TABLES/tables"
fi

if [ "$FROM" -le 5 ]; then
echo "==> 5/5  Bundling the mean of shares, which is the weighting the library ships"
cp "$TABLES/tables/reference-corpus-mean-of-shares.tsv" "$BUNDLED"
fi

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
