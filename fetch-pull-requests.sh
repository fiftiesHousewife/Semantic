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
# Where the statement references issues of the repository's own tracker, the tracker's statements are
# pinned too: pom.xml at the head commit names the tracker in <issueManagement>, the statement is searched
# for keys of the project that URL names, and each referenced issue's own type and summary are written to
# pr-<number>-issues.tsv beside the statement, as the tracker states them at retrieval. Each repository
# resolves to its own tracker, and a self-hosted server with a context path and a cloud site both do —
# the site root is read off the stated /browse/<KEY> or /projects/<KEY> URL. A repository whose pom
# states no JIRA tracker, a statement referencing no issue, and a tracker that does not answer each get
# no file.
#
# What the pull request says — its title, its description and the messages of its commits, as the API states
# them at retrieval — is written verbatim to pr-<number>-statement.md beside the directory, never inside it:
# a statement inside the directory would be read as one of the changed files, and the reading keeps what a
# pull request says apart from what it writes. The repository's own pull request template at the head
# commit, where it states one, is written to pr-<number>-template.md beside the statement, so the reading
# can tell the author's words from the lines the host's template supplied. Re-running the script writes a
# missing statement or template for a directory it keeps.
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

statement() {
    local number="$1" file="pr-$number-statement.md"
    if [ -f "$TARGET/$file" ]; then
        return
    fi
    {
        api "repos/$REPOSITORY/pulls/$number" | jq -r '.title, "", (.body // "")'
        local page listed
        for page in $(seq 1 3); do
            listed=$(api "repos/$REPOSITORY/pulls/$number/commits?per_page=100&page=$page")
            [ "$(printf '%s' "$listed" | jq 'length')" -gt 0 ] || break
            printf '%s' "$listed" | jq -r '.[] | "", .commit.message'
        done
    } > "$TARGET/$file"
    printf 'stated   %s\n' "$file"
}

# The <issueManagement> block of pom.xml at the head commit, flattened to one line, or nothing.
issue_management() {
    local head="$1"
    git -C "$CLONE" cat-file blob "$head:pom.xml" 2>/dev/null | tr -d '\n\r' \
        | grep -o '<issueManagement>.*</issueManagement>' | head -1 || true
}

issues() {
    local number="$1" head="$2" file="pr-$number-issues.tsv"
    local statement_file="$TARGET/pr-$number-statement.md"
    if [ -f "$TARGET/$file" ] || [ ! -f "$statement_file" ]; then
        return 0
    fi
    local management system url
    management=$(issue_management "$head")
    [ -n "$management" ] || return 0
    system=$(printf '%s' "$management" | grep -o '<system>[^<]*</system>' | sed 's/<[^>]*>//g')
    url=$(printf '%s' "$management" | grep -o '<url>[^<]*</url>' | sed 's/<[^>]*>//g' | sed 's|/$||')
    if [ "$(printf '%s' "$system" | tr '[:lower:]' '[:upper:]')" != "JIRA" ] || [ -z "$url" ]; then
        return 0
    fi
    # The project key is the URL's last path segment, in the shape Jira gives keys, and the site root is
    # what stands before the /browse or /projects segment — so a server with a context path
    # (issues.apache.org/jira/browse/TIKA) and a cloud site (example.atlassian.net/browse/PROJ or
    # .../projects/PROJ) all resolve, each repository to its own tracker. A URL of any other shape
    # states no project this script can read, and no file is written.
    local project="${url##*/}" root
    printf '%s' "$project" | grep -qE '^[A-Z][A-Z0-9]*$' || return 0
    case "$url" in
        */browse/"$project")   root="${url%/browse/"$project"}" ;;
        */projects/"$project") root="${url%/projects/"$project"}" ;;
        *) return 0 ;;
    esac
    local issue_api="$root/rest/api/2/issue" browse="$root/browse"
    local keys
    keys=$(grep -oE "${project}-[0-9]+" "$statement_file" | awk '!seen[$0]++' || true)
    [ -n "$keys" ] || return 0
    local rows issue_key stated type summary
    rows=$(mktemp)
    for issue_key in $keys; do
        stated=$(curl -fsSL --retry 3 "$issue_api/$issue_key?fields=issuetype,summary" || true)
        if [ -z "$stated" ]; then
            printf 'unread   %s (the tracker at %s did not answer)\n' "$issue_key" "$issue_api"
            continue
        fi
        type=$(printf '%s' "$stated" | jq -r '.fields.issuetype.name // ""' \
            | tr '\t\n\r' '   ' | sed 's/[[:space:]]*$//')
        summary=$(printf '%s' "$stated" | jq -r '.fields.summary // ""' \
            | tr '\t\n\r' '   ' | sed 's/[[:space:]]*$//')
        printf '%s\t%s\t%s\t%s\t%s\n' \
            "$issue_key" "$type" "$browse/$issue_key" "$(date -u +%Y-%m-%d)" "$summary" >> "$rows"
    done
    if [ ! -s "$rows" ]; then
        rm -f "$rows"
        return 0
    fi
    {
        printf '# Issues the statement of pull request %s references, as the tracker states them.\n' "$number"
        printf '# The tracker is the repository'"'"'s own statement: pom.xml <issueManagement> at the head\n'
        printf '# commit names %s (%s), and only keys of that project are read.\n' "$url" "$system"
        printf '# Columns: key, type, url, retrieved, summary\n'
        printf '#   key        the issue key, as the statement writes it\n'
        printf '#   type       the issue type the tracker states, verbatim\n'
        printf '#   url        the tracker'"'"'s own page for the issue\n'
        printf '#   retrieved  the UTC date the issue was read from the tracker\n'
        printf '#   summary    the issue'"'"'s own summary line, verbatim, tabs and line breaks blanked\n'
        cat "$rows"
    } > "$TARGET/$file"
    rm -f "$rows"
    printf 'issues   %s\n' "$file"
}

# The paths GitHub reads a pull request template from, most specific first.
TEMPLATE_PATHS=".github/pull_request_template.md .github/PULL_REQUEST_TEMPLATE.md \
pull_request_template.md PULL_REQUEST_TEMPLATE.md docs/pull_request_template.md \
docs/PULL_REQUEST_TEMPLATE.md"

template() {
    local number="$1" head="$2" file="pr-$number-template.md"
    if [ -f "$TARGET/$file" ]; then
        return
    fi
    local path
    for path in $TEMPLATE_PATHS; do
        if git -C "$CLONE" cat-file -e "$head:$path" 2>/dev/null; then
            git -C "$CLONE" cat-file blob "$head:$path" > "$TARGET/$file"
            printf 'template %s (%s at the head commit)\n' "$file" "$path"
            return
        fi
    done
}

fetch() {
    local number="$1" author="$2" head="$3" base="$4"
    local directory="pr-$number"
    if [ -d "$TARGET/$directory" ]; then
        printf 'kept     %s (already present; delete it to re-fetch)\n' "$directory"
        statement "$number"
        template "$number" "$head"
        issues "$number" "$head"
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
    statement "$number"
    template "$number" "$head"
    issues "$number" "$head"
}

while IFS=$'\t' read -r number author head base; do
    fetch "$number" "$author" "$head" "$base"
done < <(selected)

printf '\nEvery pull request is under %s and listed in %s\n' "$TARGET" "$MANIFEST"
