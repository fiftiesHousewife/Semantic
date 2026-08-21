"""Scores the committed evaluation-set readings against the subject area the manifest states for each member.

Reads output/<member>/json/reading.json at reading-export schema 10.0, and rolls a placement up through the
`broader` column of lexicon/src/main/resources/openalex-topics.tsv until it reaches the level the manifest's
`area` column names — a field such as Computer Science, or a subfield such as Finance.

Run from the repository root:  python3 .claude/skills/running-the-backtest/score.py
"""

import csv
import json
import pathlib
import statistics
import sys

ROOT = pathlib.Path.cwd()
TOPICS = ROOT / "lexicon/src/main/resources/openalex-topics.tsv"
MANIFEST = ROOT / "code-semantics-engine/src/test/resources/evaluation-set.tsv"
SCORED_LEVELS = ("OpenAlex archive", "OpenAlex category")


def rows(path):
    with path.open(encoding="utf-8") as file:
        yield from csv.reader((line for line in file if not line.startswith("#")), delimiter="\t")


def hierarchy():
    """concept identifier to label, and label to the identifier of the concept above it."""
    label, above = {}, {}
    for row in rows(TOPICS):
        if len(row) >= 5 and row[1] != "prefLabel":
            label[row[0]] = row[1]
            above[row[0]] = row[3]
    return label, above


def manifest():
    return {row[0]: row[4] for row in rows(MANIFEST) if len(row) >= 5}


def ancestry(subject, label, above):
    """The subject and every concept it rolls up to, by label."""
    identifier = {name: key for key, name in label.items()}.get(subject)
    walked = []
    while identifier:
        walked.append(label[identifier])
        identifier = above.get(identifier) or None
    return walked


def placements(member):
    reading = ROOT / f"output/{member}/json/reading.json"
    if not reading.exists():
        return None
    placed = json.loads(reading.read_text(encoding="utf-8"))["summary"]["placedIn"]
    return {f"{scheme['scheme']} {level}": value
            for scheme in placed for level, value in scheme.items() if level != "scheme"}


def main():
    label, above = hierarchy()
    areas = manifest()
    apart, margins, divergences, bars, band = 0, [], [], [], 0
    leads = {level: 0 for level in SCORED_LEVELS}
    reaches = {level: 0 for level in SCORED_LEVELS}
    read = []
    for member, area in areas.items():
        levels = placements(member)
        if levels is None:
            print(f"{member} has no reading under output/ — not scored")
            continue
        read.append(member)
        for name, value in levels.items():
            apart += 1 if value["standsApartFromChance"] else 0
            margins.append(value["nearestByChanceBits"] - value["divergenceBits"])
            divergences.append(value["divergenceBits"])
            bars.append(value["nearestByChanceBits"])
            band += len(value["nearerThanChance"])
            if name not in SCORED_LEVELS:
                continue
            if area in ancestry(value["subject"], label, above):
                leads[name] += 1
            if any(area in ancestry(near["subject"], label, above) for near in value["nearerThanChance"]):
                reaches[name] += 1
        stated = {name: levels[name]["subject"] for name in SCORED_LEVELS}
        print(f"{member:11} {area:17} {stated['OpenAlex archive']:42} {stated['OpenAlex category']}")
    if not read:
        sys.exit("No member reading was scored. Run the backtest first.")
    print()
    print(f"level readings         {len(divergences)}")
    print(f"stands apart           {apart}")
    print(f"mean margin            {statistics.fmean(margins):.4f}")
    print(f"mean divergence        {statistics.fmean(divergences):.4f}")
    print(f"mean chance bar        {statistics.fmean(bars):.4f}")
    print(f"subjects in the bands  {band}")
    for level in SCORED_LEVELS:
        print(f"{level:22} leader in the area {leads[level]}/{len(read)}"
              f"   band reaches it {reaches[level]}/{len(read)}")


if __name__ == "__main__":
    main()
