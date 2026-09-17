#!/usr/bin/env bash
#
# Fetches the candidate vocabulary sources surveyed in docs/plans/EXTENDING_THE_TAXONOMIES.md, one file
# set per candidate, into a directory outside this repository. Run it from your own shell: the agent
# sandbox and the extraction JVMs have no network route, so an extraction takes a fetched local copy by
# path, and this script is where the copies come from.
#
# Every download is recorded in manifest.tsv with its sha256 and the pin the publisher offers — a
# version, a tag, a commit or, where the publisher states none, the digest and the date alone. A file
# already present is not fetched again.
#
# Usage: ./fetch-candidate-vocabularies.sh [target-directory]     (default ~/vocabulary-sources)

set -euo pipefail

TARGET="${1:-$HOME/vocabulary-sources}"
MANIFEST="$TARGET/manifest.tsv"

# Publisher release identifiers, current on 2026-09-06. A newer release changes these and nothing else.
PRONOM_VERSION="${PRONOM_VERSION:-125}"
PRONOM_CONTAINER_DATE="${PRONOM_CONTAINER_DATE:-20260119}"
EDAM_TAG="${EDAM_TAG:-1.25.20260626T1230Z}"

JOSE_REGISTRIES=(
    web-signature-encryption-header-parameters
    web-signature-encryption-algorithms
    web-encryption-compression-algorithms
    web-key-types
    web-key-elliptic-curve
    web-key-parameters
    web-key-use
    web-key-operations
    web-key-set-parameters
)

mkdir -p "$TARGET"
[ -f "$MANIFEST" ] || printf 'file\tpin\tsha256\tfetched\n' > "$MANIFEST"

fetched() {
    local file="$1" pin="$2"
    local digest
    digest=$(shasum -a 256 "$TARGET/$file" | cut -d' ' -f1)
    printf '%s\t%s\t%s\t%s\n' "$file" "$pin" "$digest" "$(date -u +%Y-%m-%d)" >> "$MANIFEST"
    printf 'fetched  %s  %s  %s\n' "$file" "$pin" "$digest"
}

fetch() {
    local file="$1" pin="$2" url="$3"
    if [ -f "$TARGET/$file" ]; then
        printf 'kept     %s (already present; delete it to re-fetch)\n' "$file"
        return
    fi
    curl -fSL --retry 3 -o "$TARGET/$file" "$url"
    fetched "$file" "$pin"
}

# PRONOM — document formats. Open Government Licence v3.0. Pinned by numbered signature-file release.
fetch "DROID_SignatureFile_V${PRONOM_VERSION}.xml" "V${PRONOM_VERSION}" \
    "https://cdn.nationalarchives.gov.uk/documents/DROID_SignatureFile_V${PRONOM_VERSION}.xml"
fetch "container-signature-${PRONOM_CONTAINER_DATE}.xml" "${PRONOM_CONTAINER_DATE}" \
    "https://cdn.nationalarchives.gov.uk/documents/container-signature-${PRONOM_CONTAINER_DATE}.xml"

# EDAM — document formats, second candidate. CC BY-SA 4.0. Pinned by dated release tag.
fetch "EDAM_${EDAM_TAG}.owl" "${EDAM_TAG}" \
    "https://github.com/edamontology/edamontology/releases/download/${EDAM_TAG}/EDAM.owl"

# ethereum/execution-specs — distributed ledger. CC0 1.0. Pinned by the commit the fetch resolves.
SPECS_SHA=$(git ls-remote https://github.com/ethereum/execution-specs.git HEAD | cut -f1)
fetch "execution-specs-${SPECS_SHA}.tar.gz" "${SPECS_SHA}" \
    "https://github.com/ethereum/execution-specs/archive/${SPECS_SHA}.tar.gz"

# NIST CSRC glossary — XML security. Public information; rebuilt daily with no version, so the pin is
# the digest and the date the manifest records.
fetch "csrc-glossary-export.zip" "none-published" \
    "https://csrc.nist.gov/csrc/media/glossary/glossary-export.zip"

# IANA JOSE registries — XML security, second candidate. CC0 1.0. Dated tables, pinned by digest.
for registry in "${JOSE_REGISTRIES[@]}"; do
    fetch "jose-${registry}.csv" "none-published" \
        "https://www.iana.org/assignments/jose/${registry}.csv"
done

printf '\nAll files are under %s and listed in %s\n' "$TARGET" "$MANIFEST"
