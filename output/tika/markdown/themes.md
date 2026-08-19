# Themes — tika

What this repository's names are about, read through the two bundled resources that assign a word
to a subject: WordNet Domains, which labels each of a word's senses, and Wiktionary's topic
vocabulary, which labels the headword. Each word occurrence commits one unit of mass per resource,
divided among the readings that resource names, so an ambiguous word does not shout.

A label another label of the same word already implies is not one of those readings. The topic
vocabulary publishes a closure over its own hierarchy — a word labelled `computing` arrives
carrying `engineering`, `mathematics`, `natural-sciences`, `physical-sciences` and `sciences`
besides — and the hierarchy that derived them, published by the same extractor, is what folds
them back into the label they came from. Nothing is excluded and no list is written: where the
hierarchy is silent, every label the word carries stands.

**Read the ranking below as the weak reading it is.** A topic's intensity over one scope counts
every occurrence of every word, and the commonest words in Java source are also the most
ambiguous ones — `string`, `set`, `map`, `assert`, `of`. Their senses spray mass across subjects
that have nothing to do with this codebase, which is why the witnesses are printed beside every
row: a topic carried by one word is one word's opinion, and the table says so.

The reading worth acting on is the comparison underneath it. A topic written at much the same
density everywhere contributes almost nothing to a divergence, so the ambiguity that dominates a
count cancels in a comparison — and each scope's divergence is judged against the field of
divergences a scope of its own size draws by chance, so a small scope cannot look interesting
merely by being small.

## What the whole repository reads as

Only the topics that **earned a place**: a topic reaches this table where it makes some part of this repository unlike the rest of it — a scope that departed further than the furthest of a field of chance draws — and where more than one word carries it. A topic held at the same density everywhere distinguishes nothing, and a topic one word holds a majority of is that word's opinion. Both bars follow from the reading; neither is a list.

| Topic | ι | From names | References | Leads | Lines led | Share of lines | Carried by |
|---|--:|--:|--:|--:|--:|--:|---|
| `computing` | 0.1194 | 51.8% | 70,347 | 1,187 | 254,895 | 67.0% | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| `linguistics` | 0.0272 | 58.3% | 30,257 | 181 | 27,789 | 7.3% | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |

Read over 2,156 files and 380,237 lines: 552 topics, 39 files no topic could be resolved for, and 67.0% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 33.6% of it; the other 66.4% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `tika-annotation-processor/src/main/java`

**35.7%** of the maximum divergence from the repository, against a null median of 29.1% over 999 resamples of the same size — an excess of +6.7 points, and 211 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-annotation-processor/src/test/java`

**67.5%** of the maximum divergence from the repository, against a null median of 42.6% over 999 resamples of the same size — an excess of +25.0 points, and 136 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/main/java`

**13.8%** of the maximum divergence from the repository, against a null median of 23.2% over 999 resamples of the same size — an excess of -9.3 points, and 986 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/test/java`

**22.4%** of the maximum divergence from the repository, against a null median of 25.8% over 999 resamples of the same size — an excess of -3.5 points, and 727 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/main/java`

**42.6%** of the maximum divergence from the repository, against a null median of 42.5% over 999 resamples of the same size — an excess of +0.1 points, and 493 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/test/java`

**41.1%** of the maximum divergence from the repository, against a null median of 43.3% over 999 resamples of the same size — an excess of -2.1 points, and 553 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-core/src/main/java`

**4.2%** of the maximum divergence from the repository, against a null median of 1.0% over 999 resamples of the same size — an excess of +3.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.6% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 10.7% | `computer-languages` | 0.0033 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 6.7% | `computer-graphics` | 0.0216 | 0.0070 | **over** | `instance` 28.4% (572) `jpeg` 15.8% (49) `mpeg` 11.3% (48) `renderer` 10.6% (22) |
| 5.3% | `geography` | 0.0286 | 0.0129 | **over** | `stream` 23.4% (1,670) `apache` 7.5% (6,823) `state` 7.5% (273) `time_zone` 3.1% (26) |
| 4.6% | `commerce` | 0.0003 | 0.0054 | under | `server` 68.2% (669) `packet` 10.7% (73) `package` 6.1% (206) `quote` 6.1% (66) |
| 4.1% | `linguistics` | 0.1148 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 3.5% | `plants` | 0.0013 | 0.0068 | under | `root` 51.0% (457) `log` 28.1% (484) `stub` 4.5% (81) `complete` 4.1% (148) |
| 2.2% | `computing` | 0.2770 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |

### `tika-core/src/test/java`

**6.2%** of the maximum divergence from the repository, against a null median of 3.6% over 999 resamples of the same size — an excess of +2.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.1% | `electrotechnology` | 0.0550 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 8.2% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.5% | `literature` | 0.0065 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 4.3% | `metrology` | 0.0001 | 0.0062 | under | `array` 29.7% (803) `entropy` 13.8% (90) `rate` 7.7% (140) `measurement` 5.9% (13) |
| 3.6% | `programming` | 0.0817 | 0.0528 | **over** | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 3.6% | `grammar` | 0.0017 | 0.0096 | under | `num` 60.2% (471) `clause` 7.9% (33) `modify` 5.3% (123) `number` 4.9% (737) |
| 3.3% | `cryptography` | 0.0001 | 0.0046 | under | `encrypt` 21.4% (97) `password` 15.9% (182) `private_key` 13.9% (25) `md5` 13.0% (21) |
| 3.0% | `plants` | 0.0009 | 0.0068 | under | `root` 51.0% (457) `log` 28.1% (484) `stub` 4.5% (81) `complete` 4.1% (148) |

### `tika-detectors/tika-detector-magika/src/main/java`

**30.2%** of the maximum divergence from the repository, against a null median of 42.6% over 999 resamples of the same size — an excess of -12.4 points, and 860 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-magika/src/test/java`

**40.8%** of the maximum divergence from the repository, against a null median of 34.2% over 999 resamples of the same size — an excess of +6.6 points, and 262 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/main/java`

**36.2%** of the maximum divergence from the repository, against a null median of 43.6% over 999 resamples of the same size — an excess of -7.4 points, and 703 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/test/java`

**41.7%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of +7.8 points, and 237 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-grpc/src/test/java`

**26.1%** of the maximum divergence from the repository, against a null median of 25.4% over 999 resamples of the same size — an excess of +0.8 points, and 442 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-server/src/test/java`

**48.7%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of +14.8 points, and 112 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/main/java`

**19.1%** of the maximum divergence from the repository, against a null median of 16.9% over 999 resamples of the same size — an excess of +2.2 points, and 255 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/test/java`

**25.6%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of -8.5 points, and 844 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java`

**19.2%** of the maximum divergence from the repository, against a null median of 16.8% over 999 resamples of the same size — an excess of +2.3 points, and 263 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/java`

**43.9%** of the maximum divergence from the repository, against a null median of 41.4% over 999 resamples of the same size — an excess of +2.5 points, and 430 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/main/java`

**17.2%** of the maximum divergence from the repository, against a null median of 13.5% over 999 resamples of the same size — an excess of +3.7 points, and 106 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java`

**15.3%** of the maximum divergence from the repository, against a null median of 11.5% over 999 resamples of the same size — an excess of +3.8 points, and 47 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-universal/src/main/java`

**26.9%** of the maximum divergence from the repository, against a null median of 33.8% over 999 resamples of the same size — an excess of -6.8 points, and 801 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/main/java`

**15.7%** of the maximum divergence from the repository, against a null median of 7.7% over 999 resamples of the same size — an excess of +8.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.2% | `publishing` | 0.0852 | 0.0175 | **over** | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 8.0% | `computing` | 0.1846 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 6.7% | `arithmetic` | 0.0308 | 0.0023 | **over** | `extract` 91.4% (1,065) `integer` 3.9% (148) `subtract` 0.7% (15) `position` 0.7% (250) |
| 5.7% | `theatre` | 0.0300 | 0.0033 | **over** | `mime` 77.9% (595) `script` 18.5% (825) `extra` 2.3% (17) `jackson` 1.0% (72) |
| 4.6% | `geology` | 0.0202 | 0.0012 | **over** | `col` 54.8% (69) `delta` 13.0% (36) `julian` 5.2% (5) `sheet` 4.4% (149) |
| 4.3% | `electrotechnology` | 0.0005 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.0% | `databases` | 0.0224 | 0.0028 | **over** | `entity` 19.3% (298) `jdbc` 15.5% (36) `bookmark` 8.4% (26) `select` 6.7% (69) |
| 3.9% | `electronics` | 0.0006 | 0.0153 | under | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |

### `tika-eval/tika-eval-app/src/test/java`

**21.4%** of the maximum divergence from the repository, against a null median of 16.0% over 999 resamples of the same size — an excess of +5.4 points, and 79 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-core/src/main/java`

**21.8%** of the maximum divergence from the repository, against a null median of 7.0% over 999 resamples of the same size — an excess of +14.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 26.3% | `mathematics` | 0.2057 | 0.0260 | **over** | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 7.6% | `video-games` | 0.0523 | 0.0049 | **over** | `stats` 26.1% (45) `meta` 15.2% (175) `item` 12.0% (318) `oom` 4.2% (35) |
| 4.2% | `computer-languages` | 0.0001 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 4.0% | `telecommunication` | 0.0014 | 0.0238 | under | `file` 41.2% (3,338) `entry` 19.9% (811) `medium` 7.8% (438) `record` 3.7% (145) |
| 3.0% | `electronics` | 0.0003 | 0.0153 | under | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 2.9% | `metrology` | 0.0302 | 0.0062 | **over** | `array` 29.7% (803) `entropy` 13.8% (90) `rate` 7.7% (140) `measurement` 5.9% (13) |
| 2.6% | `quality` | 0.0221 | 0.0032 | **over** | `available` 10.2% (58) `external` 8.8% (131) `internal` 8.5% (57) `new` 6.9% (102) |
| 2.5% | `geography` | 0.0004 | 0.0129 | under | `stream` 23.4% (1,670) `apache` 7.5% (6,823) `state` 7.5% (273) `time_zone` 3.1% (26) |

### `tika-eval/tika-eval-core/src/test/java`

**19.3%** of the maximum divergence from the repository, against a null median of 19.2% over 999 resamples of the same size — an excess of +0.1 points, and 488 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-example/src/main/java`

**14.9%** of the maximum divergence from the repository, against a null median of 6.8% over 999 resamples of the same size — an excess of +8.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.4% | `telecommunication` | 0.1173 | 0.0238 | **over** | `file` 41.2% (3,338) `entry` 19.9% (811) `medium` 7.8% (438) `record` 3.7% (145) |
| 6.4% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 3.8% | `electrotechnology` | 0.0468 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.3% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 2.8% | `mathematics` | 0.0071 | 0.0260 | under | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 2.7% | `buildings` | 0.0003 | 0.0097 | under | `log` 22.9% (484) `window` 20.8% (349) `tear_down` 17.6% (48) `machine` 8.3% (38) |
| 2.3% | `sport` | 0.0135 | 0.0021 | **over** | `ref` 36.7% (188) `balancer` 20.7% (16) `split` 8.7% (125) `champion` 7.7% (20) |
| 2.3% | `networking` | 0.0010 | 0.0107 | under | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |

### `tika-example/src/test/java`

**28.4%** of the maximum divergence from the repository, against a null median of 15.9% over 999 resamples of the same size — an excess of +12.5 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.7% | `chemistry` | 0.1033 | 0.0116 | **over** | `buffer` 16.8% (419) `builder` 16.2% (189) `type` 14.8% (3,459) `max` 9.6% (1,140) |
| 7.7% | `electrotechnology` | 0.0933 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.5% | `buildings` | 0.0554 | 0.0097 | **over** | `log` 22.9% (484) `window` 20.8% (349) `tear_down` 17.6% (48) `machine` 8.3% (38) |
| 4.2% | `telecommunication` | 0.0813 | 0.0238 | **over** | `file` 41.2% (3,338) `entry` 19.9% (811) `medium` 7.8% (438) `record` 3.7% (145) |
| 4.2% | `computing` | 0.1871 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 3.8% | `programming` | 0.0108 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 3.5% | `linguistics` | 0.1668 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 2.5% | `person` | 0.0004 | 0.0166 | under | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |

### `tika-grpc/src/main/java`

**26.4%** of the maximum divergence from the repository, against a null median of 28.5% over 999 resamples of the same size — an excess of -2.1 points, and 622 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/test/java`

**34.9%** of the maximum divergence from the repository, against a null median of 25.0% over 999 resamples of the same size — an excess of +9.9 points, and 80 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-handlers/tika-handler-boilerpipe/src/main/java`

**38.7%** of the maximum divergence from the repository, against a null median of 43.1% over 999 resamples of the same size — an excess of -4.3 points, and 618 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-es-integration-tests/src/test/java`

**35.4%** of the maximum divergence from the repository, against a null median of 35.0% over 999 resamples of the same size — an excess of +0.4 points, and 485 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/java`

**38.1%** of the maximum divergence from the repository, against a null median of 41.5% over 999 resamples of the same size — an excess of -3.4 points, and 618 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/java`

**33.5%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of -0.5 points, and 517 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/java`

**44.0%** of the maximum divergence from the repository, against a null median of 34.4% over 999 resamples of the same size — an excess of +9.6 points, and 206 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/java`

**63.3%** of the maximum divergence from the repository, against a null median of 22.9% over 999 resamples of the same size — an excess of +40.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 38.5% | `hydraulics` | 0.5502 | 0.0102 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 14.8% | `christianity` | 0.1985 | 0.0015 | **over** | `use` 57.9% (4,071) `kind` 6.4% (2,190) `secret` 5.4% (59) `element` 5.1% (1,056) |
| 11.0% | `computing` | 0.0590 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 3.9% | `programming` | 0.0006 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 2.0% | `mathematics` | 0.0001 | 0.0260 | under | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 1.6% | `literature` | 0.0000 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 1.5% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 1.4% | `computer_science` | 0.0029 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |

### `tika-integration-tests/tika-resource-loading-tests/src/test/java`

**32.6%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -1.1 points, and 558 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-woodstox-tests/src/test/java`

**45.0%** of the maximum divergence from the repository, against a null median of 42.6% over 999 resamples of the same size — an excess of +2.4 points, and 439 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/main/java`

**66.2%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of +33.0 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/test/java`

**38.9%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of -4.1 points, and 616 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup-core/src/main/java`

**33.4%** of the maximum divergence from the repository, against a null median of 18.0% over 999 resamples of the same size — an excess of +15.4 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.0% | `mathematics` | 0.1633 | 0.0260 | **over** | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 7.8% | `computing` | 0.1372 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 5.8% | `programming` | 0.0031 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 4.8% | `art` | 0.0424 | 0.0021 | **over** | `flag` 44.6% (263) `artist` 20.8% (29) `write` 9.0% (844) `art` 4.3% (30) |
| 4.7% | `rail-transport` | 0.0405 | 0.0017 | **over** | `pre` 24.5% (30) `exc` 23.2% (16) `helper` 15.5% (126) `uni` 8.3% (56) |
| 4.3% | `linguistics` | 0.1868 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 3.6% | `computer_science` | 0.0008 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 3.6% | `arithmetic` | 0.0339 | 0.0023 | **over** | `extract` 91.4% (1,065) `integer` 3.9% (148) `subtract` 0.7% (15) `position` 0.7% (250) |

### `tika-langdetect/tika-langdetect-charsoup/src/main/java`

**30.7%** of the maximum divergence from the repository, against a null median of 28.7% over 999 resamples of the same size — an excess of +2.0 points, and 397 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/test/java`

**20.3%** of the maximum divergence from the repository, against a null median of 7.1% over 999 resamples of the same size — an excess of +13.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.1% | `computing` | 0.1069 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 7.1% | `telecommunications` | 0.0369 | 0.0016 | **over** | `ext` 84.1% (103) `csd` 3.1% (3) `prefix` 2.1% (600) `read` 2.0% (1,016) |
| 4.8% | `linguistics` | 0.1652 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 4.8% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 4.1% | `geography` | 0.0497 | 0.0129 | **over** | `stream` 23.4% (1,670) `apache` 7.5% (6,823) `state` 7.5% (273) `time_zone` 3.1% (26) |
| 3.0% | `computer_science` | 0.0056 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 3.0% | `programming` | 0.0188 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 2.6% | `networking` | 0.0000 | 0.0107 | under | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |

### `tika-langdetect/tika-langdetect-lingo24/src/main/java`

**38.7%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of -4.3 points, and 620 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-lingo24/src/test/java`

**74.4%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of +31.4 points, and 76 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/main/java`

**55.3%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of +13.0 points, and 244 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/test/java`

**83.0%** of the maximum divergence from the repository, against a null median of 42.1% over 999 resamples of the same size — an excess of +40.9 points, and 32 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/main/java`

**29.3%** of the maximum divergence from the repository, against a null median of 29.1% over 999 resamples of the same size — an excess of +0.2 points, and 488 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/test/java`

**63.3%** of the maximum divergence from the repository, against a null median of 43.3% over 999 resamples of the same size — an excess of +20.0 points, and 160 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/main/java`

**33.7%** of the maximum divergence from the repository, against a null median of 34.3% over 999 resamples of the same size — an excess of -0.6 points, and 516 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/test/java`

**61.1%** of the maximum divergence from the repository, against a null median of 42.1% over 999 resamples of the same size — an excess of +19.1 points, and 189 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-test-commons/src/main/java`

**48.5%** of the maximum divergence from the repository, against a null median of 42.2% over 999 resamples of the same size — an excess of +6.3 points, and 334 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/main/java`

**28.6%** of the maximum divergence from the repository, against a null median of 29.0% over 999 resamples of the same size — an excess of -0.4 points, and 525 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/test/java`

**33.8%** of the maximum divergence from the repository, against a null median of 17.7% over 999 resamples of the same size — an excess of +16.1 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.6% | `networking` | 0.1055 | 0.0107 | **over** | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |
| 9.3% | `number` | 0.0784 | 0.0030 | **over** | `value` 37.2% (1,844) `digit` 13.8% (83) `first` 10.6% (89) `nothing` 9.9% (125) |
| 7.5% | `linguistics` | 0.0088 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 6.0% | `publishing` | 0.0924 | 0.0175 | **over** | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 4.2% | `computer_science` | 0.0000 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 3.7% | `basketball` | 0.0267 | 0.0002 | **over** | `key` 36.1% (1,621) `three` 15.1% (63) `reject` 7.5% (147) `four` 7.2% (59) |
| 3.1% | `literature` | 0.0000 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 2.9% | `nautical` | 0.0347 | 0.0043 | **over** | `datum` 28.0% (1,926) `src` 26.2% (57) `att` 4.7% (79) `port` 4.1% (115) |

### `tika-ml/tika-ml-chardetect/src/main/java`

**20.7%** of the maximum divergence from the repository, against a null median of 20.7% over 999 resamples of the same size — an excess of -0.1 points, and 503 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-chardetect/src/test/java`

**48.5%** of the maximum divergence from the repository, against a null median of 43.1% over 999 resamples of the same size — an excess of +5.4 points, and 362 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/main/java`

**53.5%** of the maximum divergence from the repository, against a null median of 29.1% over 999 resamples of the same size — an excess of +24.5 points, and 10 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/test/java`

**62.1%** of the maximum divergence from the repository, against a null median of 43.4% over 999 resamples of the same size — an excess of +18.8 points, and 181 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/main/java`

**18.1%** of the maximum divergence from the repository, against a null median of 19.2% over 999 resamples of the same size — an excess of -1.2 points, and 621 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/test/java`

**22.4%** of the maximum divergence from the repository, against a null median of 25.3% over 999 resamples of the same size — an excess of -2.8 points, and 700 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/main/java`

**20.5%** of the maximum divergence from the repository, against a null median of 20.9% over 999 resamples of the same size — an excess of -0.4 points, and 535 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/test/java`

**22.1%** of the maximum divergence from the repository, against a null median of 18.0% over 999 resamples of the same size — an excess of +4.1 points, and 137 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/main/java`

**46.7%** of the maximum divergence from the repository, against a null median of 43.5% over 999 resamples of the same size — an excess of +3.2 points, and 422 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/test/java`

**42.3%** of the maximum divergence from the repository, against a null median of 34.4% over 999 resamples of the same size — an excess of +8.0 points, and 215 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/main/java`

**25.7%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of -8.3 points, and 858 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/java`

**32.6%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -1.3 points, and 549 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/main/java`

**15.5%** of the maximum divergence from the repository, against a null median of 16.7% over 999 resamples of the same size — an excess of -1.3 points, and 684 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/java`

**28.1%** of the maximum divergence from the repository, against a null median of 19.5% over 999 resamples of the same size — an excess of +8.6 points, and 40 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/java`

**51.3%** of the maximum divergence from the repository, against a null median of 43.6% over 999 resamples of the same size — an excess of +7.7 points, and 339 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/main/java`

**23.6%** of the maximum divergence from the repository, against a null median of 21.2% over 999 resamples of the same size — an excess of +2.4 points, and 285 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/java`

**29.9%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of -13.1 points, and 863 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/java`

**25.2%** of the maximum divergence from the repository, against a null median of 28.9% over 999 resamples of the same size — an excess of -3.8 points, and 715 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-inference/src/main/java`

**22.8%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +10.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.7% | `travel-industry` | 0.0616 | 0.0005 | **over** | `locator` 99.8% (61) `osi` 0.1% (3) `pseudo` 0.1% (8) `fit` 0.0% (29) |
| 7.8% | `linguistics` | 0.0166 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 7.2% | `buildings` | 0.0646 | 0.0097 | **over** | `log` 22.9% (484) `window` 20.8% (349) `tear_down` 17.6% (48) `machine` 8.3% (38) |
| 6.4% | `publishing` | 0.0769 | 0.0175 | **over** | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 3.5% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.6% | `time_period` | 0.0000 | 0.0120 | under | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 2.4% | `programming` | 0.0200 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 2.3% | `law` | 0.0057 | 0.0266 | under | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |

### `tika-parsers/tika-parsers-ml/tika-inference/src/test/java`

**26.9%** of the maximum divergence from the repository, against a null median of 20.6% over 999 resamples of the same size — an excess of +6.3 points, and 113 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java`

**12.8%** of the maximum divergence from the repository, against a null median of 9.1% over 999 resamples of the same size — an excess of +3.7 points, and 16 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/java`

**23.8%** of the maximum divergence from the repository, against a null median of 20.8% over 999 resamples of the same size — an excess of +3.0 points, and 264 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/main/java`

**29.4%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of -4.8 points, and 697 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/java`

**22.3%** of the maximum divergence from the repository, against a null median of 26.0% over 999 resamples of the same size — an excess of -3.8 points, and 717 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/main/java`

**33.4%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of +0.2 points, and 492 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/java`

**66.3%** of the maximum divergence from the repository, against a null median of 42.9% over 999 resamples of the same size — an excess of +23.4 points, and 131 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/main/java`

**17.7%** of the maximum divergence from the repository, against a null median of 20.9% over 999 resamples of the same size — an excess of -3.2 points, and 777 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/test/java`

**30.4%** of the maximum divergence from the repository, against a null median of 22.7% over 999 resamples of the same size — an excess of +7.7 points, and 105 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java`

**11.5%** of the maximum divergence from the repository, against a null median of 3.9% over 999 resamples of the same size — an excess of +7.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.2% | `computing` | 0.5081 | 0.3156 | **over** | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 7.7% | `mathematics` | 0.0019 | 0.0260 | under | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 6.2% | `electrotechnology` | 0.0518 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.4% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.7% | `law` | 0.0071 | 0.0266 | under | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 2.7% | `linguistics` | 0.0499 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 2.3% | `publishing` | 0.0049 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 2.3% | `economy` | 0.0001 | 0.0060 | under | `property` 40.0% (1,106) `manager` 14.0% (306) `total` 9.2% (216) `mark_down` 7.2% (31) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/main/java`

**13.5%** of the maximum divergence from the repository, against a null median of 14.9% over 999 resamples of the same size — an excess of -1.3 points, and 687 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/java`

**25.1%** of the maximum divergence from the repository, against a null median of 21.2% over 999 resamples of the same size — an excess of +3.9 points, and 209 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/main/java`

**15.0%** of the maximum divergence from the repository, against a null median of 7.3% over 999 resamples of the same size — an excess of +7.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.5% | `music` | 0.0783 | 0.0061 | **over** | `ti` 20.1% (1,144) `album` 7.8% (30) `composer` 5.1% (11) `label` 4.9% (356) |
| 6.6% | `art` | 0.0290 | 0.0021 | **over** | `flag` 44.6% (263) `artist` 20.8% (29) `write` 9.0% (844) `art` 4.3% (30) |
| 6.4% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 4.2% | `computer-graphics` | 0.0321 | 0.0070 | **over** | `instance` 28.4% (572) `jpeg` 15.8% (49) `mpeg` 11.3% (48) `renderer` 10.6% (22) |
| 3.5% | `programming` | 0.0997 | 0.0528 | **over** | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 3.4% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.0% | `acoustics` | 0.0102 | 0.0002 | **over** | `audio` 96.7% (158) `sound` 1.8% (3) `static` 0.8% (4) `noisiness` 0.5% (1) |
| 3.0% | `algebra` | 0.0003 | 0.0104 | under | `content` 75.9% (2,501) `unknown` 8.6% (275) `normalizer` 4.5% (16) `index` 3.8% (909) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/java`

**18.7%** of the maximum divergence from the repository, against a null median of 12.5% over 999 resamples of the same size — an excess of +6.3 points, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.2% | `linguistics` | 0.0199 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 7.8% | `computing` | 0.4964 | 0.3156 | **over** | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 5.1% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 3.9% | `art` | 0.0230 | 0.0021 | **over** | `flag` 44.6% (263) `artist` 20.8% (29) `write` 9.0% (844) `art` 4.3% (30) |
| 3.7% | `medicine` | 0.0010 | 0.0184 | under | `uri` 40.9% (301) `type` 12.0% (3,459) `start` 5.5% (1,211) `doc` 5.3% (449) |
| 3.6% | `telecommunication` | 0.0028 | 0.0238 | under | `file` 41.2% (3,338) `entry` 19.9% (811) `medium` 7.8% (438) `record` 3.7% (145) |
| 3.3% | `publishing` | 0.0011 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 3.2% | `person` | 0.0010 | 0.0166 | under | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/main/java`

**20.5%** of the maximum divergence from the repository, against a null median of 18.0% over 999 resamples of the same size — an excess of +2.4 points, and 265 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/java`

**33.8%** of the maximum divergence from the repository, against a null median of 26.0% over 999 resamples of the same size — an excess of +7.9 points, and 118 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/main/java`

**14.9%** of the maximum divergence from the repository, against a null median of 19.5% over 999 resamples of the same size — an excess of -4.6 points, and 911 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/java`

**29.3%** of the maximum divergence from the repository, against a null median of 21.0% over 999 resamples of the same size — an excess of +8.3 points, and 61 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/main/java`

**21.9%** of the maximum divergence from the repository, against a null median of 25.3% over 999 resamples of the same size — an excess of -3.5 points, and 740 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/java`

**35.3%** of the maximum divergence from the repository, against a null median of 23.1% over 999 resamples of the same size — an excess of +12.2 points, and 35 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/main/java`

**40.9%** of the maximum divergence from the repository, against a null median of 28.9% over 999 resamples of the same size — an excess of +12.0 points, and 84 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/test/java`

**83.9%** of the maximum divergence from the repository, against a null median of 43.5% over 999 resamples of the same size — an excess of +40.4 points, and 20 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-digest-commons/src/main/java`

**48.6%** of the maximum divergence from the repository, against a null median of 24.8% over 999 resamples of the same size — an excess of +23.8 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/main/java`

**23.9%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -9.8 points, and 906 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/java`

**32.1%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of -10.3 points, and 802 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java`

**28.1%** of the maximum divergence from the repository, against a null median of 21.1% over 999 resamples of the same size — an excess of +7.0 points, and 90 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/java`

**25.0%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -8.7 points, and 863 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/main/java`

**12.5%** of the maximum divergence from the repository, against a null median of 11.8% over 999 resamples of the same size — an excess of +0.7 points, and 380 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/java`

**27.5%** of the maximum divergence from the repository, against a null median of 14.4% over 999 resamples of the same size — an excess of +13.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.9% | `computing` | 0.7039 | 0.3156 | **over** | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 14.6% | `linguistics` | 0.0005 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 3.7% | `mathematics` | 0.0012 | 0.0260 | under | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 3.5% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 2.9% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.8% | `programming` | 0.0158 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 2.6% | `person` | 0.0004 | 0.0166 | under | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |
| 2.5% | `law` | 0.0040 | 0.0266 | under | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-jdbc-commons/src/main/java`

**24.3%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of -8.8 points, and 894 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java`

**27.6%** of the maximum divergence from the repository, against a null median of 34.2% over 999 resamples of the same size — an excess of -6.6 points, and 790 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/test/java`

**34.7%** of the maximum divergence from the repository, against a null median of 33.8% over 999 resamples of the same size — an excess of +0.9 points, and 465 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/main/java`

**17.5%** of the maximum divergence from the repository, against a null median of 28.8% over 999 resamples of the same size — an excess of -11.3 points, and 985 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 33.3% over 999 resamples of the same size — an excess of -8.0 points, and 848 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java`

**7.4%** of the maximum divergence from the repository, against a null median of 1.1% over 999 resamples of the same size — an excess of +6.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.4% | `computer-languages` | 0.0004 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 10.1% | `electrotechnology` | 0.0001 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 6.9% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 6.0% | `electronics` | 0.0017 | 0.0153 | under | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 4.7% | `computer_science` | 0.0572 | 0.0287 | **over** | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 4.2% | `metrology` | 0.0211 | 0.0062 | **over** | `array` 29.7% (803) `entropy` 13.8% (90) `rate` 7.7% (140) `measurement` 5.9% (13) |
| 3.4% | `networking` | 0.0018 | 0.0107 | under | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |
| 3.1% | `mathematics` | 0.0475 | 0.0260 | **over** | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/java`

**13.6%** of the maximum divergence from the repository, against a null median of 5.1% over 999 resamples of the same size — an excess of +8.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `aviation` | 0.0424 | 0.0047 | **over** | `rtf` 38.1% (101) `max` 36.9% (1,140) `threshold` 5.1% (186) `fis` 2.8% (5) |
| 6.5% | `literature` | 0.0656 | 0.0207 | **over** | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 6.2% | `tennis` | 0.0306 | 0.0039 | **over** | `get` 96.7% (1,670) `return` 0.9% (1,430) `server` 0.8% (669) `single` 0.5% (447) |
| 5.4% | `linguistics` | 0.0354 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 4.4% | `medicine` | 0.0016 | 0.0184 | under | `uri` 40.9% (301) `type` 12.0% (3,459) `start` 5.5% (1,211) `doc` 5.3% (449) |
| 4.1% | `person` | 0.0013 | 0.0166 | under | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |
| 3.8% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.7% | `computing` | 0.4160 | 0.3156 | **over** | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/main/java`

**9.7%** of the maximum divergence from the repository, against a null median of 6.3% over 999 resamples of the same size — an excess of +3.4 points, and 5 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 6.1% | `computer-languages` | 0.0019 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 5.8% | `linguistics` | 0.1431 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 5.2% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.5% | `electrotechnology` | 0.0021 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.3% | `chemistry` | 0.0341 | 0.0116 | **over** | `buffer` 16.8% (419) `builder` 16.2% (189) `type` 14.8% (3,459) `max` 9.6% (1,140) |
| 4.0% | `arithmetic` | 0.0153 | 0.0023 | **over** | `extract` 91.4% (1,065) `integer` 3.9% (148) `subtract` 0.7% (15) `position` 0.7% (250) |
| 4.0% | `law` | 0.0079 | 0.0266 | under | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 3.9% | `programming` | 0.0919 | 0.0528 | **over** | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/java`

**22.1%** of the maximum divergence from the repository, against a null median of 14.2% over 999 resamples of the same size — an excess of +7.9 points, and 6 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/main/java`

**18.2%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of -15.3 points, and 994 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/java`

**30.4%** of the maximum divergence from the repository, against a null median of 43.2% over 999 resamples of the same size — an excess of -12.8 points, and 863 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/main/java`

**23.7%** of the maximum divergence from the repository, against a null median of 23.0% over 999 resamples of the same size — an excess of +0.8 points, and 437 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/java`

**26.9%** of the maximum divergence from the repository, against a null median of 34.7% over 999 resamples of the same size — an excess of -7.8 points, and 828 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/main/java`

**19.0%** of the maximum divergence from the repository, against a null median of 9.0% over 999 resamples of the same size — an excess of +10.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.1% | `publishing` | 0.0998 | 0.0175 | **over** | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 5.0% | `software` | 0.0322 | 0.0035 | **over** | `excel` 17.1% (98) `pdf` 13.1% (134) `shift_jis` 11.1% (59) `factory_class` 9.9% (20) |
| 5.0% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 4.9% | `computer-graphics` | 0.0404 | 0.0070 | **over** | `instance` 28.4% (572) `jpeg` 15.8% (49) `mpeg` 11.3% (48) `renderer` 10.6% (22) |
| 4.7% | `information-science` | 0.0256 | 0.0018 | **over** | `document` 96.5% (1,456) `align` 2.1% (54) `controlled_vocabulary` 0.4% (14) `keyword` 0.4% (7) |
| 4.3% | `statistics` | 0.0246 | 0.0020 | **over** | `sigma` 20.5% (49) `histogram` 7.7% (22) `class` 7.1% (1,450) `raw_data` 6.9% (6) |
| 4.2% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.9% | `motor-racing` | 0.0173 | 0.0004 | **over** | `dpi` 81.4% (23) `observer` 8.0% (22) `intermediate` 5.4% (84) `place` 2.4% (122) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java`

**21.9%** of the maximum divergence from the repository, against a null median of 19.6% over 999 resamples of the same size — an excess of +2.4 points, and 292 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/main/java`

**18.9%** of the maximum divergence from the repository, against a null median of 15.7% over 999 resamples of the same size — an excess of +3.2 points, and 179 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/java`

**19.2%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +6.8 points, and 8 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/main/java`

**15.7%** of the maximum divergence from the repository, against a null median of 14.9% over 999 resamples of the same size — an excess of +0.9 points, and 388 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/java`

**23.3%** of the maximum divergence from the repository, against a null median of 19.4% over 999 resamples of the same size — an excess of +3.9 points, and 169 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/main/java`

**23.7%** of the maximum divergence from the repository, against a null median of 28.4% over 999 resamples of the same size — an excess of -4.7 points, and 771 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/java`

**43.0%** of the maximum divergence from the repository, against a null median of 29.6% over 999 resamples of the same size — an excess of +13.4 points, and 70 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java`

**23.0%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +10.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.6% | `medicine` | 0.1459 | 0.0184 | **over** | `uri` 40.9% (301) `type` 12.0% (3,459) `start` 5.5% (1,211) `doc` 5.3% (449) |
| 5.6% | `programming` | 0.1333 | 0.0528 | **over** | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 4.3% | `law` | 0.0015 | 0.0266 | under | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 4.1% | `computing` | 0.4577 | 0.3156 | **over** | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 3.6% | `publishing` | 0.0001 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 3.5% | `person` | 0.0000 | 0.0166 | under | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |
| 3.5% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.8% | `linguistics` | 0.1481 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/java`

**30.9%** of the maximum divergence from the repository, against a null median of 19.2% over 999 resamples of the same size — an excess of +11.7 points, and 14 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/main/java`

**24.0%** of the maximum divergence from the repository, against a null median of 23.3% over 999 resamples of the same size — an excess of +0.8 points, and 428 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/java`

**35.3%** of the maximum divergence from the repository, against a null median of 29.4% over 999 resamples of the same size — an excess of +5.9 points, and 214 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java`

**21.2%** of the maximum divergence from the repository, against a null median of 12.0% over 999 resamples of the same size — an excess of +9.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.7% | `linguistics` | 0.2499 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 6.1% | `furniture` | 0.0304 | 0.0008 | **over** | `counter` 87.5% (74) `drawer` 8.0% (12) `phone` 1.7% (29) `mirror` 0.9% (57) |
| 5.1% | `computer_science` | 0.0015 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 4.9% | `literature` | 0.0000 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 4.5% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 4.3% | `telecommunication` | 0.0721 | 0.0238 | **over** | `file` 41.2% (3,338) `entry` 19.9% (811) `medium` 7.8% (438) `record` 3.7% (145) |
| 3.8% | `person` | 0.0000 | 0.0166 | under | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |
| 3.4% | `electrotechnology` | 0.0518 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/java`

**44.8%** of the maximum divergence from the repository, against a null median of 33.6% over 999 resamples of the same size — an excess of +11.2 points, and 161 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/main/java`

**20.1%** of the maximum divergence from the repository, against a null median of 22.8% over 999 resamples of the same size — an excess of -2.7 points, and 735 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/test/java`

**32.0%** of the maximum divergence from the repository, against a null median of 25.8% over 999 resamples of the same size — an excess of +6.2 points, and 167 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-httpclient-commons/src/main/java`

**49.1%** of the maximum divergence from the repository, against a null median of 29.3% over 999 resamples of the same size — an excess of +19.8 points, and 21 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-api/src/main/java`

**26.6%** of the maximum divergence from the repository, against a null median of 9.7% over 999 resamples of the same size — an excess of +16.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.7% | `biology` | 0.0740 | 0.0036 | **over** | `emit` 64.5% (881) `bos` 5.7% (67) `reporter` 3.6% (105) `model` 2.7% (711) |
| 9.1% | `electronics` | 0.0981 | 0.0153 | **over** | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 6.6% | `hydraulics` | 0.0689 | 0.0102 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.4% | `glassblowing` | 0.0263 | 0.0005 | **over** | `found` 98.3% (293) `step` 0.9% (48) `web` 0.6% (61) `way` 0.2% (91) |
| 3.9% | `literature` | 0.0000 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 3.6% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 3.5% | `linguistics` | 0.0306 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 3.1% | `mathematics` | 0.0726 | 0.0260 | **over** | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |

### `tika-pipes/tika-pipes-config-store-ignite/src/main/java`

**36.7%** of the maximum divergence from the repository, against a null median of 22.9% over 999 resamples of the same size — an excess of +13.8 points, and 18 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-config-store-ignite/src/test/java`

**61.2%** of the maximum divergence from the repository, against a null median of 42.9% over 999 resamples of the same size — an excess of +18.2 points, and 170 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-core/src/main/java`

**11.3%** of the maximum divergence from the repository, against a null median of 4.0% over 999 resamples of the same size — an excess of +7.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.6% | `electronics` | 0.0649 | 0.0153 | **over** | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 8.7% | `biology` | 0.0330 | 0.0036 | **over** | `emit` 64.5% (881) `bos` 5.7% (67) `reporter` 3.6% (105) `model` 2.7% (711) |
| 8.1% | `hydraulics` | 0.0466 | 0.0102 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.9% | `publishing` | 0.0017 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 4.8% | `linguistics` | 0.0410 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 3.0% | `geography` | 0.0018 | 0.0129 | under | `stream` 23.4% (1,670) `apache` 7.5% (6,823) `state` 7.5% (273) `time_zone` 3.1% (26) |
| 2.9% | `electrotechnology` | 0.0033 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.9% | `algebra` | 0.0010 | 0.0104 | under | `content` 75.9% (2,501) `unknown` 8.6% (275) `normalizer` 4.5% (16) `index` 3.8% (909) |

### `tika-pipes/tika-pipes-core/src/test/java`

**16.8%** of the maximum divergence from the repository, against a null median of 12.5% over 999 resamples of the same size — an excess of +4.3 points, and 50 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/main/java`

**25.1%** of the maximum divergence from the repository, against a null median of 25.5% over 999 resamples of the same size — an excess of -0.4 points, and 529 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/test/java`

**34.8%** of the maximum divergence from the repository, against a null median of 43.1% over 999 resamples of the same size — an excess of -8.3 points, and 738 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-integration-tests/src/test/java`

**17.8%** of the maximum divergence from the repository, against a null median of 9.4% over 999 resamples of the same size — an excess of +8.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 22.5% | `hydraulics` | 0.1217 | 0.0102 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 5.3% | `literature` | 0.0003 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 4.2% | `publishing` | 0.0005 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 3.4% | `geography` | 0.0001 | 0.0129 | under | `stream` 23.4% (1,670) `apache` 7.5% (6,823) `state` 7.5% (273) `time_zone` 3.1% (26) |
| 3.1% | `computing` | 0.4215 | 0.3156 | **over** | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 2.4% | `administration` | 0.0135 | 0.0013 | **over** | `manager` 49.0% (306) `title` 20.5% (180) `branch` 5.4% (43) `file_folder` 4.8% (5) |
| 2.3% | `person` | 0.0026 | 0.0166 | under | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |
| 2.3% | `grammar` | 0.0002 | 0.0096 | under | `num` 60.2% (471) `clause` 7.9% (33) `modify` 5.3% (123) `number` 4.9% (737) |

### `tika-pipes/tika-pipes-iterator-commons/src/main/java`

**47.8%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of +13.8 points, and 133 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java`

**26.7%** of the maximum divergence from the repository, against a null median of 20.9% over 999 resamples of the same size — an excess of +5.8 points, and 142 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/java`

**48.3%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of +5.4 points, and 367 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/main/java`

**28.8%** of the maximum divergence from the repository, against a null median of 15.8% over 999 resamples of the same size — an excess of +12.9 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.7% | `time_period` | 0.0984 | 0.0120 | **over** | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 7.3% | `electronics` | 0.0895 | 0.0153 | **over** | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 6.9% | `hydraulics` | 0.0744 | 0.0102 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 6.2% | `computing` | 0.1628 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 4.9% | `military` | 0.0557 | 0.0083 | **over** | `column` 11.1% (259) `predict` 9.8% (119) `password` 7.2% (183) `base` 6.2% (805) |
| 4.4% | `transport` | 0.0386 | 0.0033 | **over** | `container` 29.8% (469) `train` 17.8% (201) `stop` 7.9% (42) `driver` 6.6% (18) |
| 3.6% | `graphical-user-interface` | 0.0253 | 0.0009 | **over** | `container` 67.0% (469) `label` 10.1% (356) `widget` 5.3% (11) `chooser` 4.1% (2) |
| 3.3% | `sports` | 0.0360 | 0.0049 | **over** | `timeout` 30.2% (360) `min` 16.8% (262) `buf` 14.8% (112) `match` 3.8% (572) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/java`

**36.1%** of the maximum divergence from the repository, against a null median of 25.6% over 999 resamples of the same size — an excess of +10.5 points, and 73 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/main/java`

**35.7%** of the maximum divergence from the repository, against a null median of 25.9% over 999 resamples of the same size — an excess of +9.8 points, and 79 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/java`

**26.9%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of -7.1 points, and 811 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/main/java`

**23.7%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +8.1 points, and 19 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/java`

**41.1%** of the maximum divergence from the repository, against a null median of 34.5% over 999 resamples of the same size — an excess of +6.7 points, and 279 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/main/java`

**22.5%** of the maximum divergence from the repository, against a null median of 12.6% over 999 resamples of the same size — an excess of +9.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.6% | `time_period` | 0.0718 | 0.0120 | **over** | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 6.8% | `electronics` | 0.0743 | 0.0153 | **over** | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 6.6% | `computer-languages` | 0.0815 | 0.0193 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 6.2% | `computer_science` | 0.0001 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 6.0% | `hydraulics` | 0.0584 | 0.0102 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.9% | `sociology` | 0.0305 | 0.0035 | **over** | `status` 55.2% (290) `integration` 10.6% (40) `priority` 6.6% (33) `common` 5.6% (248) |
| 3.6% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.1% | `publishing` | 0.0007 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 19.6% over 999 resamples of the same size — an excess of +5.7 points, and 105 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/main/java`

**30.7%** of the maximum divergence from the repository, against a null median of 15.9% over 999 resamples of the same size — an excess of +14.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.9% | `time_period` | 0.1044 | 0.0120 | **over** | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 9.1% | `electronics` | 0.1073 | 0.0153 | **over** | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 7.4% | `mechanics` | 0.0594 | 0.0028 | **over** | `bucket` 48.0% (377) `override` 21.0% (136) `reset` 13.0% (87) `throttle` 10.4% (23) |
| 6.7% | `hydraulics` | 0.0766 | 0.0102 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.7% | `computing` | 0.1761 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 3.7% | `computer-hardware` | 0.0246 | 0.0003 | **over** | `storage` 87.8% (140) `cpu` 5.9% (31) `ram` 4.2% (99) `device` 1.0% (11) |
| 3.1% | `telecommunication` | 0.0009 | 0.0238 | under | `file` 41.2% (3,338) `entry` 19.9% (811) `medium` 7.8% (438) `record` 3.7% (145) |
| 3.0% | `person` | 0.0598 | 0.0166 | **over** | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/java`

**27.4%** of the maximum divergence from the repository, against a null median of 25.5% over 999 resamples of the same size — an excess of +1.8 points, and 385 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/main/java`

**30.8%** of the maximum divergence from the repository, against a null median of 25.3% over 999 resamples of the same size — an excess of +5.5 points, and 211 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/java`

**46.4%** of the maximum divergence from the repository, against a null median of 43.2% over 999 resamples of the same size — an excess of +3.2 points, and 416 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/main/java`

**35.4%** of the maximum divergence from the repository, against a null median of 16.8% over 999 resamples of the same size — an excess of +18.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.5% | `exchange` | 0.1372 | 0.0008 | **over** | `issuer` 85.8% (17) `stock` 9.1% (22) `put` 2.7% (17) `option` 2.4% (129) |
| 12.0% | `cryptography` | 0.1077 | 0.0046 | **over** | `encrypt` 21.4% (97) `password` 15.9% (182) `private_key` 13.9% (25) `md5` 13.0% (21) |
| 9.3% | `networking` | 0.1067 | 0.0107 | **over** | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |
| 5.4% | `programming` | 0.0032 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 3.5% | `literature` | 0.0762 | 0.0207 | **over** | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 2.6% | `mathematics` | 0.0018 | 0.0260 | under | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 2.6% | `computer_science` | 0.0027 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 2.4% | `publishing` | 0.0001 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/java`

**36.8%** of the maximum divergence from the repository, against a null median of 25.6% over 999 resamples of the same size — an excess of +11.2 points, and 60 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 15.7% over 999 resamples of the same size — an excess of +8.5 points, and 17 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/java`

**24.8%** of the maximum divergence from the repository, against a null median of 25.5% over 999 resamples of the same size — an excess of -0.7 points, and 552 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/main/java`

**48.0%** of the maximum divergence from the repository, against a null median of 25.4% over 999 resamples of the same size — an excess of +22.6 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/java`

**36.3%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of +2.3 points, and 416 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/main/java`

**25.7%** of the maximum divergence from the repository, against a null median of 19.6% over 999 resamples of the same size — an excess of +6.1 points, and 88 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/java`

**39.3%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of +5.8 points, and 289 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/main/java`

**39.0%** of the maximum divergence from the repository, against a null median of 17.9% over 999 resamples of the same size — an excess of +21.1 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 28.5% | `law` | 0.3324 | 0.0266 | **over** | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 4.3% | `mechanics` | 0.0458 | 0.0028 | **over** | `bucket` 48.0% (377) `override` 21.0% (136) `reset` 13.0% (87) `throttle` 10.4% (23) |
| 3.5% | `town_planning` | 0.0315 | 0.0007 | **over** | `store` 42.0% (443) `current` 20.8% (74) `archive` 12.7% (76) `tenant` 9.5% (18) |
| 3.3% | `mathematics` | 0.0000 | 0.0260 | under | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 3.2% | `computing` | 0.1840 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 3.0% | `programming` | 0.0098 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 2.7% | `literature` | 0.0000 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 2.2% | `publishing` | 0.0000 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/java`

**33.3%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -0.4 points, and 522 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/main/java`

**27.7%** of the maximum divergence from the repository, against a null median of 13.4% over 999 resamples of the same size — an excess of +14.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.0% | `computer-languages` | 0.1573 | 0.0193 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 7.0% | `person` | 0.0885 | 0.0166 | **over** | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |
| 6.8% | `sociology` | 0.0530 | 0.0035 | **over** | `status` 55.2% (290) `integration` 10.6% (40) `priority` 6.6% (33) `common` 5.6% (248) |
| 4.5% | `plants` | 0.0475 | 0.0068 | **over** | `root` 51.0% (457) `log` 28.1% (484) `stub` 4.5% (81) `complete` 4.1% (148) |
| 3.2% | `networking` | 0.0466 | 0.0107 | **over** | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |
| 3.0% | `publishing` | 0.0001 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 2.9% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.7% | `programming` | 0.0161 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/java`

**46.9%** of the maximum divergence from the repository, against a null median of 33.8% over 999 resamples of the same size — an excess of +13.1 points, and 129 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/main/java`

**23.7%** of the maximum divergence from the repository, against a null median of 16.0% over 999 resamples of the same size — an excess of +7.8 points, and 21 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/java`

**29.8%** of the maximum divergence from the repository, against a null median of 29.2% over 999 resamples of the same size — an excess of +0.6 points, and 470 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/main/java`

**32.1%** of the maximum divergence from the repository, against a null median of 18.2% over 999 resamples of the same size — an excess of +13.9 points, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.6% | `electronics` | 0.1449 | 0.0153 | **over** | `emitter` 55.2% (560) `ti` 11.3% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 11.0% | `person` | 0.1286 | 0.0166 | **over** | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |
| 8.1% | `computing` | 0.1371 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 7.2% | `hydraulics` | 0.0825 | 0.0102 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 5.1% | `law` | 0.1001 | 0.0266 | **over** | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 3.6% | `time_period` | 0.0574 | 0.0120 | **over** | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 3.4% | `telecommunication` | 0.0003 | 0.0238 | under | `file` 41.2% (3,338) `entry` 19.9% (811) `medium` 7.8% (438) `record` 3.7% (145) |
| 3.2% | `literature` | 0.0000 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/java`

**28.1%** of the maximum divergence from the repository, against a null median of 28.9% over 999 resamples of the same size — an excess of -0.8 points, and 548 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-reporter-commons/src/main/java`

**52.5%** of the maximum divergence from the repository, against a null median of 42.8% over 999 resamples of the same size — an excess of +9.7 points, and 290 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-plugins-core/src/main/java`

**34.2%** of the maximum divergence from the repository, against a null median of 19.3% over 999 resamples of the same size — an excess of +14.9 points, and 4 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 38.8% | `time_period` | 0.3284 | 0.0120 | **over** | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 5.1% | `plants` | 0.0601 | 0.0068 | **over** | `root` 51.0% (457) `log` 28.1% (484) `stub` 4.5% (81) `complete` 4.1% (148) |
| 4.1% | `computer_science` | 0.0000 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 3.0% | `literature` | 0.0000 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 2.3% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.3% | `computer-languages` | 0.0599 | 0.0193 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 2.0% | `medicine` | 0.0011 | 0.0184 | under | `uri` 40.9% (301) `type` 12.0% (3,459) `start` 5.5% (1,211) `doc` 5.3% (449) |
| 1.9% | `publishing` | 0.0010 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |

### `tika-plugins-core/src/test/java`

**34.8%** of the maximum divergence from the repository, against a null median of 28.4% over 999 resamples of the same size — an excess of +6.3 points, and 207 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/main/java`

**14.9%** of the maximum divergence from the repository, against a null median of 7.1% over 999 resamples of the same size — an excess of +7.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.7% | `graph-theory` | 0.0720 | 0.0025 | **over** | `component` 82.1% (597) `node` 6.6% (597) `size` 4.6% (781) `path` 2.7% (1,666) |
| 3.8% | `electrotechnology` | 0.0465 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.5% | `psychology` | 0.0199 | 0.0028 | **over** | `confidence` 46.6% (226) `module` 19.4% (100) `self` 8.6% (49) `matter` 6.7% (59) |
| 3.5% | `time_period` | 0.0003 | 0.0120 | under | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 2.9% | `medicine` | 0.0031 | 0.0184 | under | `uri` 40.9% (301) `type` 12.0% (3,459) `start` 5.5% (1,211) `doc` 5.3% (449) |
| 2.9% | `literature` | 0.0042 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 2.8% | `geography` | 0.0011 | 0.0129 | under | `stream` 23.4% (1,670) `apache` 7.5% (6,823) `state` 7.5% (273) `time_zone` 3.1% (26) |
| 2.6% | `hydraulics` | 0.0005 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |

### `tika-serialization/src/test/java`

**13.5%** of the maximum divergence from the repository, against a null median of 7.0% over 999 resamples of the same size — an excess of +6.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.6% | `computer-languages` | 0.1021 | 0.0193 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 5.9% | `publishing` | 0.0002 | 0.0175 | under | `table` 32.1% (856) `page` 18.3% (554) `text` 13.5% (2,092) `read` 9.1% (311) |
| 4.1% | `time_period` | 0.0001 | 0.0120 | under | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 4.0% | `computing` | 0.4201 | 0.3156 | **over** | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 3.7% | `hydraulics` | 0.0000 | 0.0102 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 2.8% | `graph-theory` | 0.0157 | 0.0025 | **over** | `component` 82.1% (597) `node` 6.6% (597) `size` 4.6% (781) `path` 2.7% (1,666) |
| 2.6% | `networking` | 0.0009 | 0.0107 | under | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |
| 2.1% | `algebra` | 0.0014 | 0.0104 | under | `content` 75.9% (2,501) `unknown` 8.6% (275) `normalizer` 4.5% (16) `index` 3.8% (909) |

### `tika-server/tika-server-core/src/main/java`

**18.9%** of the maximum divergence from the repository, against a null median of 6.1% over 999 resamples of the same size — an excess of +12.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.6% | `networking` | 0.1162 | 0.0107 | **over** | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |
| 13.8% | `commerce` | 0.0752 | 0.0054 | **over** | `server` 68.2% (669) `packet` 10.7% (73) `package` 6.1% (206) `quote` 6.1% (66) |
| 6.8% | `literature` | 0.0778 | 0.0207 | **over** | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |
| 3.4% | `programming` | 0.0180 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 3.4% | `sociology` | 0.0247 | 0.0035 | **over** | `status` 55.2% (290) `integration` 10.6% (40) `priority` 6.6% (33) `common` 5.6% (248) |
| 2.8% | `mathematics` | 0.0054 | 0.0260 | under | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 2.8% | `computer-languages` | 0.0026 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 2.2% | `time_period` | 0.0009 | 0.0120 | under | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |

### `tika-server/tika-server-core/src/test/java`

**16.2%** of the maximum divergence from the repository, against a null median of 8.4% over 999 resamples of the same size — an excess of +7.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.0% | `networking` | 0.0787 | 0.0107 | **over** | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |
| 7.8% | `law` | 0.0886 | 0.0266 | **over** | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 6.0% | `anatomy` | 0.0354 | 0.0045 | **over** | `body` 41.3% (407) `socket` 17.8% (139) `iter` 8.2% (11) `colon` 5.7% (23) |
| 5.4% | `linguistics` | 0.0317 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 5.0% | `ecology` | 0.0181 | 0.0003 | **over** | `tl` 75.2% (40) `consumer` 17.0% (49) `range` 3.0% (291) `crash` 2.7% (172) |
| 4.9% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.1% | `translation-studies` | 0.0181 | 0.0011 | **over** | `ti` 67.2% (1,144) `tl` 15.1% (40) `source_text` 7.7% (12) `source_language` 3.1% (75) |
| 3.9% | `tennis` | 0.0253 | 0.0039 | **over** | `get` 96.7% (1,670) `return` 0.9% (1,430) `server` 0.8% (669) `single` 0.5% (447) |

### `tika-server/tika-server-standard/src/main/java`

**30.8%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of -2.3 points, and 604 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-standard/src/test/java`

**21.7%** of the maximum divergence from the repository, against a null median of 12.0% over 999 resamples of the same size — an excess of +9.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.0% | `person` | 0.1053 | 0.0166 | **over** | `reader` 40.9% (376) `child` 11.1% (294) `mapper` 9.8% (309) `logger` 7.0% (39) |
| 9.5% | `networking` | 0.0775 | 0.0107 | **over** | `http` 32.6% (2,679) `resource` 32.4% (733) `request` 19.6% (692) `mime` 3.5% (596) |
| 7.6% | `programming` | 0.0051 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 7.1% | `computer-languages` | 0.0827 | 0.0193 | **over** | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |
| 5.2% | `mathematics` | 0.0006 | 0.0260 | under | `count` 20.9% (923) `value` 9.3% (1,865) `from` 6.5% (242) `rel` 6.0% (66) |
| 4.6% | `linguistics` | 0.0292 | 0.0839 | under | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 2.6% | `time_period` | 0.0001 | 0.0120 | under | `extension` 47.5% (474) `future` 10.3% (90) `current` 8.5% (269) `year` 6.7% (24) |
| 2.2% | `grammar` | 0.0000 | 0.0096 | under | `num` 60.2% (471) `clause` 7.9% (33) `modify` 5.3% (123) `number` 4.9% (737) |

### `tika-translate/src/main/java`

**17.0%** of the maximum divergence from the repository, against a null median of 14.9% over 999 resamples of the same size — an excess of +2.0 points, and 239 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-translate/src/test/java`

**41.1%** of the maximum divergence from the repository, against a null median of 16.9% over 999 resamples of the same size — an excess of +24.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.0% | `linguistics` | 0.3695 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 12.9% | `botany` | 0.1155 | 0.0014 | **over** | `translator` 30.5% (126) `offset` 9.3% (444) `key` 9.0% (1,621) `node` 6.7% (597) |
| 8.4% | `software` | 0.0874 | 0.0035 | **over** | `excel` 17.1% (98) `pdf` 13.1% (134) `shift_jis` 11.1% (59) `factory_class` 9.9% (20) |
| 6.0% | `programming` | 0.0005 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 3.5% | `computer_science` | 0.0000 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 3.0% | `quality` | 0.0372 | 0.0032 | **over** | `available` 10.2% (58) `external` 8.8% (131) `internal` 8.5% (57) `new` 6.9% (102) |
| 2.8% | `law` | 0.0007 | 0.0266 | under | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 2.3% | `computer-languages` | 0.0000 | 0.0193 | under | `json` 58.1% (623) `xml` 40.6% (368) `sql` 0.6% (36) `javascript` 0.3% (6) |

### `tika-xmp/src/main/java`

**24.1%** of the maximum divergence from the repository, against a null median of 15.9% over 999 resamples of the same size — an excess of +8.2 points, and 14 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-xmp/src/test/java`

**34.9%** of the maximum divergence from the repository, against a null median of 33.6% over 999 resamples of the same size — an excess of +1.4 points, and 451 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `documentation`

**31.0%** of the maximum divergence from the repository, against a null median of 18.2% over 999 resamples of the same size — an excess of +12.8 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.6% | `law` | 0.2230 | 0.0266 | **over** | `file` 18.2% (10,159) `client` 13.4% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 14.6% | `geography` | 0.1414 | 0.0129 | **over** | `stream` 23.4% (1,670) `apache` 7.5% (6,823) `state` 7.5% (273) `time_zone` 3.1% (26) |
| 10.5% | `computing` | 0.1209 | 0.3156 | under | `metadata` 25.4% (4,114) `config` 6.4% (1,342) `parser` 6.1% (2,583) `byte` 3.5% (2,991) |
| 6.8% | `linguistics` | 0.2132 | 0.0839 | **over** | `name` 32.3% (3,791) `context` 19.0% (2,253) `parse` 6.2% (2,824) `prefix` 6.2% (600) |
| 4.0% | `physics` | 0.0421 | 0.0046 | **over** | `length` 57.7% (1,225) `weight` 12.4% (122) `free_space` 9.7% (26) `sql` 1.9% (36) |
| 3.2% | `programming` | 0.0119 | 0.0528 | under | `handler` 42.9% (1,912) `factory` 4.7% (525) `tmp` 2.9% (328) `context` 2.4% (2,253) |
| 2.6% | `computer_science` | 0.0037 | 0.0287 | under | `parser` 22.4% (2,583) `byte` 19.3% (2,991) `url` 12.0% (460) `format` 9.4% (615) |
| 2.1% | `literature` | 0.0020 | 0.0207 | under | `header` 41.9% (1,036) `writer` 16.5% (284) `text` 12.3% (2,092) `author` 11.3% (173) |

Read, compared and resampled in 61.9 s, recorded rather than estimated.
