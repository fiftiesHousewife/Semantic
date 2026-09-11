#!/usr/bin/env bash
#
# Fetches pull requests of one GitHub repository as directories a reading can be pointed at: each selected
# pull request's changed files at its head commit, relative paths preserved, written into one directory per
# pull request beside a pull-requests.tsv manifest that pins every fetch by sha. Run it from your own shell:
# the agent sandbox and the test JVMs have no network route, so the reading takes a fetched local copy by
# path, and this script is where the copies come from.
#
# The selection starts at an author: PR_AUTHOR names the GitHub login whose pull requests are taken, and
# PR_NUMBERS, where set, names pull requests outright and PR_AUTHOR is not consulted. GITHUB_TOKEN raises
# the API rate limit where set; a public repository needs none, and the token is never written to the
# manifest or printed.
#
# A file the pull request removes exists at neither end of the reading and is not written; the repository's
# own .readingignore travels with every pull request that has one at its head, because a copy without the
# tree's stated exclusions would read files the original refuses.
#
# Usage: ./fetch-pull-requests.sh <owner/name> <clone-directory> [target-directory]
#        PR_AUTHOR=<login>  ./fetch-pull-requests.sh apache/tika ~/evaluation/tika
#        PR_NUMBERS="7 213" ./fetch-pull-requests.sh apache/tika ~/evaluation/tika ~/pull-requests/tika

set -euo pipefail

REPOSITORY="${1:?the GitHub repository, as owner/name}"
CLONE="${2:?the local clone the pull request heads are fetched into}"
TARGET="${3:-$HOME/pull-requests/${REPOSITORY#*/}}"
MANIFEST="$TARGET/pull-requests.tsv"
STATE="${PR_STATE:-all}"
PAGES="${PR_PAGES:-3}"

mkdir -p "$TARGET"
if [ ! -f "$MANIFEST" ]; then
    {
        printf '# Pull requests of %s, each written out at its head commit under the directory named below.\n' "$REPOSITORY"
        printf '# Columns: number, author, head-sha, base-sha, directory, retrieved, files\n'
        printf '#   number     the pull request number the repository states\n'
        printf '#   author     the GitHub login the selection was filtered on\n'
        printf '#   head-sha   the commit the files were read at. A reading of a moving target is not\n'
        printf '#              reproducible, and every figure published from these directories is a reading\n'
        printf '#              of this commit\n'
        printf '#   base-sha   the commit of the branch the pull request asks to change, as the API stated\n'
        printf '#              it at retrieval\n'
        printf '#   directory  the directory holding the changed files, relative to this manifest\n'
        printf '#   retrieved  the UTC date the pull request was fetched\n'
        printf '#   files      how many changed files were written, not counting .readingignore\n'
    } > "$MANIFEST"
fi

api() {
    local path="$1"
    if [ -n "${GITHUB_TOKEN:-}" ]; then
        curl -fsSL --retry 3 -H "Authorization: Bearer $GITHUB_TOKEN" "https://api.github.com/$path"
    else
        curl -fsSL --retry 3 "https://api.github.com/$path"
    fi
}

row='[.number, .user.login, .head.sha, .base.sha] | @tsv'

selected() {
    if [ -n "${PR_NUMBERS:-}" ]; then
        local number
        for number in $PR_NUMBERS; do
            api "repos/$REPOSITORY/pulls/$number" | jq -r "$row"
        done
        return
    fi
    local author="${PR_AUTHOR:?set PR_AUTHOR to the login whose pull requests are taken, or PR_NUMBERS to name them}"
    local page
    for page in $(seq 1 "$PAGES"); do
        api "repos/$REPOSITORY/pulls?state=$STATE&per_page=100&page=$page" \
            | jq -r --arg author "$author" ".[] | select(.user.login == \$author) | $row"
    done
}

changed_files() {
    local number="$1" page listed
    for page in $(seq 1 10); do
        listed=$(api "repos/$REPOSITORY/pulls/$number/files?per_page=100&page=$page" \
            | jq -r '.[] | select(.status != "removed") | .filename')
        [ -n "$listed" ] || break
        printf '%s\n' "$listed"
    done
}

fetch() {
    local number="$1" author="$2" head="$3" base="$4"
    local directory="pr-$number"
    if [ -d "$TARGET/$directory" ]; then
        printf 'kept     %s (already present; delete it to re-fetch)\n' "$directory"
        return
    fi
    git -C "$CLONE" fetch --quiet origin "refs/pull/$number/head"
    local pathspecs=()
    while IFS= read -r file; do
        [ -n "$file" ] && pathspecs+=("$file")
    done < <(changed_files "$number")
    local changed="${#pathspecs[@]}"
    if [ "$changed" -eq 0 ]; then
        printf 'skipped  %s (every changed file is a removal, so there is nothing to read)\n' "$directory"
        return
    fi
    if git -C "$CLONE" cat-file -e "$head:.readingignore" 2>/dev/null; then
        pathspecs+=(".readingignore")
    fi
    mkdir -p "$TARGET/$directory"
    git -C "$CLONE" archive "$head" -- "${pathspecs[@]}" | tar -x -C "$TARGET/$directory"
    printf '%s\t%s\t%s\t%s\t%s\t%s\t%s\n' \
        "$number" "$author" "$head" "$base" "$directory" "$(date -u +%Y-%m-%d)" "$changed" >> "$MANIFEST"
    printf 'fetched  %s  %s  %s changed files\n' "$directory" "$head" "$changed"
}

while IFS=$'\t' read -r number author head base; do
    fetch "$number" "$author" "$head" "$base"
done < <(selected)

printf '\nEvery pull request is under %s and listed in %s\n' "$TARGET" "$MANIFEST"
