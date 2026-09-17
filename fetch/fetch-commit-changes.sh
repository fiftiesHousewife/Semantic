#!/usr/bin/env bash
#
# Writes each of a repository's own commits in the shape the statement path already reads: the files the
# commit changed at the commit, the same paths at its parent, and its message beside them. The reading then
# measures how far what a commit says sits from what it changes, exactly as it does for a pull request —
# the divergence against a chance bar of statements of the same shape.
#
# A commit is a smaller change than a pull request and there are far more of them, so a count caps the run.
# Commits are taken newest first, and a merge commit is left out: its message is git's own and the files it
# names are the branch's, not the merge's.
#
# The directories are named in the manifest rather than by a pattern, so the numbers here stand for nothing
# a host published — they order the commits and nothing else, and the sha beside each is what pins it.
#
# Usage: ./fetch-commit-changes.sh <clone-directory> <count> [target-directory]
#        ./fetch-commit-changes.sh . 200 ~/evaluation/commit-changes/self

set -euo pipefail

CLONE="${1:?the local clone whose commits are read}"
COUNT="${2:?how many commits to write}"
TARGET="${3:-$HOME/evaluation/commit-changes/$(basename "$(cd "$CLONE" && pwd)")}"
MANIFEST="$TARGET/pull-requests.tsv"

if [ ! -d "$CLONE/.git" ]; then
    printf 'No git clone at %s\n' "$CLONE" >&2
    exit 1
fi

REPOSITORY=$(git -C "$CLONE" config --get remote.origin.url \
    | sed -E 's#.*[:/]([^/]+/[^/]+)(\.git)?$#\1#' | sed 's/\.git$//')
mkdir -p "$TARGET"

{
    printf '# Commits of %s, each written out at the commit under the directory named below.\n' "$REPOSITORY"
    printf '# repository: %s\n' "$REPOSITORY"
    printf '# Columns: number, author, head-sha, base-sha, directory, retrieved, files\n'
    printf '#   number     the order this run wrote the commit in. A commit has no number a host states,\n'
    printf '#              so it stands for nothing beyond the ordering, and the sha is what pins it\n'
    printf '#   author     the commit author, as git records the name\n'
    printf '#   head-sha   the commit the files were read at\n'
    printf '#   base-sha   its first parent, which the same paths were read at\n'
    printf '#   directory  the directory holding the files the commit changed\n'
    printf '#   retrieved  the UTC date they were written\n'
    printf '#   files      how many files the commit changed\n'
} > "$MANIFEST"

n=0
for sha in $(git -C "$CLONE" log --no-merges --format=%H -n "$COUNT"); do
    n=$((n + 1))
    parent=$(git -C "$CLONE" rev-parse "$sha^" 2>/dev/null || true)
    if [ -z "$parent" ]; then
        continue
    fi
    head_dir="$TARGET/c-$n"
    base_dir="$TARGET/c-$n-base"
    rm -rf "$head_dir" "$base_dir"
    mkdir -p "$head_dir" "$base_dir"

    files=0
    while IFS= read -r file; do
        [ -n "$file" ] || continue
        mkdir -p "$head_dir/$(dirname "$file")" "$base_dir/$(dirname "$file")"
        git -C "$CLONE" show "$sha:$file" > "$head_dir/$file" 2>/dev/null || rm -f "$head_dir/$file"
        git -C "$CLONE" show "$parent:$file" > "$base_dir/$file" 2>/dev/null || rm -f "$base_dir/$file"
        files=$((files + 1))
    done < <(git -C "$CLONE" diff-tree --no-commit-id --name-only -r "$sha")

    git -C "$CLONE" log -1 --format=%B "$sha" > "$TARGET/c-$n-statement.md"
    printf '%s\t%s\t%s\t%s\t%s\t%s\t%s\n' \
        "$n" "$(git -C "$CLONE" log -1 --format=%an "$sha")" "$sha" "$parent" \
        "c-$n" "$(date -u +%Y-%m-%d)" "$files" >> "$MANIFEST"
done

printf 'wrote %s commits of %s under %s\n' "$n" "$REPOSITORY" "$TARGET"
