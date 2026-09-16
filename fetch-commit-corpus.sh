#!/usr/bin/env bash
#
# Writes the commit messages of every repository a corpus manifest names, so the pooling step has a
# reference for what a commit message says. Run it from your own shell: the agent sandbox and the test JVMs
# have no network route, and the library reads no .git of its own, so a history arrives as a fetched local
# copy by path.
#
# Each repository is cloned with its full history and none of its file contents — `--filter=blob:none
# --no-checkout` — because the messages are all that is read here. tika's ten thousand commits cost 26 MB
# that way against 2.5 GB for its tree. The clone is deleted once its messages are written: the messages
# are the artefact, and the sha recorded beside them is what makes the reading of them reproducible.
#
# The messages are written verbatim, one commit per block, separated by a line holding only a full stop,
# which is what a prose reader takes as the end of a document — the same shape fetch-commits.sh writes.
# History is taken at the commit the manifest pins, so the reference is a reading of stated commits and
# not of whatever each repository's default branch says today.
#
# Usage: ./fetch-commit-corpus.sh <manifest.tsv> [target-directory]
#        ./fetch-commit-corpus.sh reference-corpus-extraction/src/main/resources/reference-corpus-published.tsv
#        ./fetch-commit-corpus.sh <manifest.tsv> ~/corpus-commits

set -euo pipefail

MANIFEST_IN="${1:?the corpus manifest naming the repositories to read}"
TARGET="${2:-$HOME/corpus-commits}"
MANIFEST="$TARGET/commits.tsv"
WORK="$TARGET/.clones"

if [ ! -f "$MANIFEST_IN" ]; then
    printf 'No manifest at %s\n' "$MANIFEST_IN" >&2
    exit 1
fi

mkdir -p "$TARGET" "$WORK"

if [ ! -f "$MANIFEST" ]; then
    {
        printf '# Commit messages read from the repositories %s names, each at the commit it pins.\n' \
            "$(basename "$MANIFEST_IN")"
        printf '# Columns: name, sha, file, retrieved, commits\n'
        printf '#   name       the repository, as the corpus manifest names it\n'
        printf '#   sha        the commit its history was read at, which the corpus manifest pins. A\n'
        printf '#              denominator read from a moving target moves under the reading\n'
        printf '#   file       the file holding the messages, relative to this manifest\n'
        printf '#   retrieved  the UTC date the history was read\n'
        printf '#   commits    how many commit messages the file holds\n'
    } > "$MANIFEST"
fi

read_one() {
    local name="$1" origin="$2" sha="$3"
    local file="$name.md"
    local tree="$WORK/$name"

    if grep -q "^$name	" "$MANIFEST" 2>/dev/null; then
        printf 'already  %s\n' "$name"
        return 0
    fi

    rm -rf "$tree"
    if ! git clone --filter=blob:none --no-checkout --quiet "$origin" "$tree" 2>/dev/null; then
        printf 'no clone %s  %s\n' "$name" "$origin" >&2
        return 0
    fi

    local at="$sha"
    if ! git -C "$tree" cat-file -e "$sha^{commit}" 2>/dev/null; then
        at=$(git -C "$tree" rev-parse HEAD)
        printf 'moved    %s  the pinned commit is gone; read at %s\n' "$name" "$at" >&2
    fi

    local commits
    commits=$(git -C "$tree" rev-list --count "$at")
    git -C "$tree" log --format='%B%n.%n' "$at" > "$TARGET/$file"
    printf '%s\t%s\t%s\t%s\t%s\n' \
        "$name" "$at" "$file" "$(date -u +%Y-%m-%d)" "$commits" >> "$MANIFEST"
    printf 'wrote    %s  %s  %s commits\n' "$file" "${at:0:12}" "$commits"
    rm -rf "$tree"
}

while IFS=$'\t' read -r name origin sha _rest; do
    case "$name" in
        '#'*|'') continue ;;
    esac
    read_one "$name" "$origin" "$sha"
done < "$MANIFEST_IN"

rmdir "$WORK" 2>/dev/null || true
printf '\nThe messages are under %s and listed in %s\n' "$TARGET" "$MANIFEST"
printf '%s repositories read.\n' "$(grep -vc '^#' "$MANIFEST" || true)"
