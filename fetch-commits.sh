#!/usr/bin/env bash
#
# Writes one repository's commit messages to a file a reading can be pointed at, pinned to the commit the
# clone is at. Run it from your own shell: the agent sandbox and the test JVMs have no network route, and
# the library reads no .git of its own, so what a history says arrives as a fetched local copy by path.
#
# It reads the clone and never the host. Select whose commits are taken with an author, as git matches one
# — a login, a name or an address — and take every author's by naming none.
#
# The messages are written verbatim, one commit per block, separated by a line holding only a full stop,
# which is what a prose reader takes as the end of a document. The manifest beside them pins the commit the
# clone was at and records how many commits each file holds, so a figure taken from these files is a figure
# of a named commit.
#
# Usage: ./fetch-commits.sh <clone-directory> [author] [target-directory]
#        ./fetch-commits.sh ~/evaluation/tika
#        ./fetch-commits.sh ~/evaluation/tika tballison ~/evaluation/commits/tika

set -euo pipefail

CLONE="${1:?the local clone whose history is read}"
AUTHOR="${2:-}"
TARGET="${3:-$HOME/commits/$(basename "$CLONE")}"
MANIFEST="$TARGET/commits.tsv"
SINCE="${COMMITS_SINCE:-}"

if [ ! -d "$CLONE/.git" ]; then
    printf 'No git clone at %s\n' "$CLONE" >&2
    exit 1
fi

mkdir -p "$TARGET"
HEAD_SHA=$(git -C "$CLONE" rev-parse HEAD)
NAME="${AUTHOR:-everyone}"
FILE="commits-$(printf '%s' "$NAME" | tr -cs '[:alnum:]._-' '-').md"

if [ ! -f "$MANIFEST" ]; then
    {
        printf '# Commit messages read from %s, each file written at the commit named below.\n' "$CLONE"
        printf '# Columns: author, head-sha, file, retrieved, commits\n'
        printf '#   author     the author the history was filtered on, or everyone where it was not\n'
        printf '#   head-sha   the commit the clone stood at. A reading of a moving target is not\n'
        printf '#              reproducible, and every figure published from these files is a reading\n'
        printf '#              of this commit\n'
        printf '#   file       the file holding the messages, relative to this manifest\n'
        printf '#   retrieved  the UTC date the history was read\n'
        printf '#   commits    how many commit messages the file holds\n'
    } > "$MANIFEST"
fi

log() {
    if [ -n "$AUTHOR" ]; then
        git -C "$CLONE" log --author="$AUTHOR" ${SINCE:+--since="$SINCE"} "$@"
    else
        git -C "$CLONE" log ${SINCE:+--since="$SINCE"} "$@"
    fi
}

COMMITS=$(log --oneline | wc -l | tr -d ' ')
if [ "$COMMITS" -eq 0 ]; then
    if [ -f "$CLONE/.git/shallow" ]; then
        printf 'The clone at %s is shallow and holds one commit, so it carries no history to read.\n' "$CLONE"
        printf 'Deepen it first: git -C %s fetch --unshallow\n' "$CLONE"
        exit 1
    fi
    printf 'No commits by %s in %s\n' "$NAME" "$CLONE"
    exit 0
fi

log --format='%B%n.%n' > "$TARGET/$FILE"
printf '%s\t%s\t%s\t%s\t%s\n' \
    "$NAME" "$HEAD_SHA" "$FILE" "$(date -u +%Y-%m-%d)" "$COMMITS" >> "$MANIFEST"
printf 'wrote    %s  %s  %s commit messages by %s\n' "$FILE" "$HEAD_SHA" "$COMMITS" "$NAME"
printf '\nThe messages are under %s and listed in %s\n' "$TARGET" "$MANIFEST"
