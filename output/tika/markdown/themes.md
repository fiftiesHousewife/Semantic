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
| `computing` | 0.1215 | 84.4% | 71,386 | 1,225 | 259,775 | 68.3% | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| `linguistics` | 0.0253 | 79.3% | 30,288 | 164 | 25,004 | 6.6% | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |

Read over 2,156 files and 380,237 lines: 552 topics, 42 files no topic could be resolved for, and 68.3% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 32.8% of it; the other 67.2% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `tika-annotation-processor/src/main/java`

**34.9%** of the maximum divergence from the repository, against a null median of 28.2% over 999 resamples of the same size — an excess of +6.7 points, and 199 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-annotation-processor/src/test/java`

**71.0%** of the maximum divergence from the repository, against a null median of 41.1% over 999 resamples of the same size — an excess of +29.8 points, and 101 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/main/java`

**13.8%** of the maximum divergence from the repository, against a null median of 22.2% over 999 resamples of the same size — an excess of -8.3 points, and 979 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/test/java`

**25.7%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of +0.5 points, and 453 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/main/java`

**40.7%** of the maximum divergence from the repository, against a null median of 41.3% over 999 resamples of the same size — an excess of -0.5 points, and 520 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/test/java`

**40.9%** of the maximum divergence from the repository, against a null median of 41.3% over 999 resamples of the same size — an excess of -0.4 points, and 511 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-core/src/main/java`

**4.5%** of the maximum divergence from the repository, against a null median of 1.0% over 999 resamples of the same size — an excess of +3.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.3% | `industry` | 0.0033 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 9.7% | `computer-languages` | 0.0037 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 8.2% | `hydraulics` | 0.0001 | 0.0078 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 6.8% | `computer-graphics` | 0.0227 | 0.0071 | **over** | `renderer` 54 `instance` 572 `mpeg` 48 `jpeg` 49 |
| 5.9% | `geography` | 0.0288 | 0.0117 | **over** | `stream` 1,670 `apache` 6,823 `state` 273 `time_zone` 26 |
| 4.8% | `linguistics` | 0.1132 | 0.0791 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 3.8% | `commerce` | 0.0003 | 0.0049 | under | `server` 670 `packet` 73 `quote` 66 `package` 206 |
| 3.4% | `plants` | 0.0012 | 0.0069 | under | `root` 458 `log` 484 `stub` 81 `complete` 142 |

### `tika-core/src/test/java`

**7.8%** of the maximum divergence from the repository, against a null median of 3.4% over 999 resamples of the same size — an excess of +4.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.8% | `industry` | 0.0743 | 0.0196 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 10.6% | `electrotechnology` | 0.0543 | 0.0156 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 5.0% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 4.1% | `literature` | 0.0052 | 0.0196 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 3.1% | `metrology` | 0.0002 | 0.0058 | under | `array` 804 `entropy` 90 `rate` 140 `measurement` 13 |
| 3.1% | `grammar` | 0.0012 | 0.0091 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |
| 3.1% | `tennis` | 0.0030 | 0.0130 | under | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 2.7% | `programming` | 0.0789 | 0.0517 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |

### `tika-detectors/tika-detector-magika/src/main/java`

**28.6%** of the maximum divergence from the repository, against a null median of 41.1% over 999 resamples of the same size — an excess of -12.5 points, and 881 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-magika/src/test/java`

**33.0%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of -0.1 points, and 502 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/main/java`

**34.0%** of the maximum divergence from the repository, against a null median of 41.8% over 999 resamples of the same size — an excess of -7.8 points, and 726 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/test/java`

**34.9%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of +2.0 points, and 414 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-grpc/src/test/java`

**24.8%** of the maximum divergence from the repository, against a null median of 24.5% over 999 resamples of the same size — an excess of +0.3 points, and 476 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-server/src/test/java`

**48.0%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of +15.3 points, and 101 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/main/java`

**17.7%** of the maximum divergence from the repository, against a null median of 16.1% over 999 resamples of the same size — an excess of +1.5 points, and 327 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 33.0% over 999 resamples of the same size — an excess of -7.7 points, and 826 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java`

**18.9%** of the maximum divergence from the repository, against a null median of 16.1% over 999 resamples of the same size — an excess of +2.8 points, and 229 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/java`

**45.4%** of the maximum divergence from the repository, against a null median of 39.9% over 999 resamples of the same size — an excess of +5.5 points, and 381 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/main/java`

**16.3%** of the maximum divergence from the repository, against a null median of 12.9% over 999 resamples of the same size — an excess of +3.4 points, and 123 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java`

**15.9%** of the maximum divergence from the repository, against a null median of 11.1% over 999 resamples of the same size — an excess of +4.9 points, and 22 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-universal/src/main/java`

**26.4%** of the maximum divergence from the repository, against a null median of 32.7% over 999 resamples of the same size — an excess of -6.3 points, and 784 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/main/java`

**16.5%** of the maximum divergence from the repository, against a null median of 7.4% over 999 resamples of the same size — an excess of +9.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.7% | `publishing` | 0.0859 | 0.0157 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 8.7% | `computing` | 0.1865 | 0.3287 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 6.6% | `arithmetic` | 0.0314 | 0.0022 | **over** | `extract` 1,065 `integer` 148 `position` 250 `subtract` 15 |
| 4.4% | `theatre` | 0.0254 | 0.0030 | **over** | `mime` 595 `script` 825 `extra` 17 `jackson` 72 |
| 4.3% | `geology` | 0.0194 | 0.0011 | **over** | `col` 69 `delta` 36 `julian` 5 `sheet` 149 |
| 3.9% | `electrotechnology` | 0.0005 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.5% | `electronics` | 0.0005 | 0.0143 | under | `emitter` 562 `ti` 1,145 `input` 1,031 `default` 1,616 |
| 3.4% | `industry` | 0.0023 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |

### `tika-eval/tika-eval-app/src/test/java`

**20.6%** of the maximum divergence from the repository, against a null median of 15.4% over 999 resamples of the same size — an excess of +5.2 points, and 76 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-core/src/main/java`

**21.4%** of the maximum divergence from the repository, against a null median of 6.7% over 999 resamples of the same size — an excess of +14.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 24.9% | `mathematics` | 0.1957 | 0.0257 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 7.8% | `video-games` | 0.0539 | 0.0054 | **over** | `stats` 50 `meta` 187 `item` 318 `row` 314 |
| 4.4% | `computer-languages` | 0.0001 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.6% | `telecommunication` | 0.0015 | 0.0221 | under | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 3.5% | `tennis` | 0.0472 | 0.0130 | **over** | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 2.9% | `electronics` | 0.0003 | 0.0143 | under | `emitter` 562 `ti` 1,145 `input` 1,031 `default` 1,616 |
| 2.7% | `person` | 0.0009 | 0.0156 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 2.5% | `industry` | 0.0025 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |

### `tika-eval/tika-eval-core/src/test/java`

**19.2%** of the maximum divergence from the repository, against a null median of 18.5% over 999 resamples of the same size — an excess of +0.7 points, and 431 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-example/src/main/java`

**14.3%** of the maximum divergence from the repository, against a null median of 6.5% over 999 resamples of the same size — an excess of +7.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `telecommunication` | 0.1128 | 0.0221 | **over** | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 6.8% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 5.0% | `industry` | 0.0012 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.1% | `electrotechnology` | 0.0467 | 0.0156 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.8% | `mathematics` | 0.0071 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 2.7% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 2.6% | `buildings` | 0.0004 | 0.0094 | under | `log` 484 `window` 349 `tear_down` 48 `machine` 38 |
| 2.3% | `networking` | 0.0009 | 0.0102 | under | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |

### `tika-example/src/test/java`

**30.7%** of the maximum divergence from the repository, against a null median of 15.1% over 999 resamples of the same size — an excess of +15.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.3% | `chemistry` | 0.1188 | 0.0110 | **over** | `buffer` 420 `builder` 189 `type` 3,463 `max` 1,148 |
| 7.9% | `industry` | 0.1081 | 0.0196 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 7.2% | `computing` | 0.1575 | 0.3287 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 5.7% | `electrotechnology` | 0.0812 | 0.0156 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 5.3% | `video-games` | 0.0531 | 0.0054 | **over** | `stats` 50 `meta` 187 `item` 318 `row` 314 |
| 4.7% | `telecommunication` | 0.0853 | 0.0221 | **over** | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 4.6% | `buildings` | 0.0579 | 0.0094 | **over** | `log` 484 `window` 349 `tear_down` 48 `machine` 38 |
| 4.3% | `programming` | 0.0076 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |

### `tika-grpc/src/main/java`

**26.8%** of the maximum divergence from the repository, against a null median of 27.5% over 999 resamples of the same size — an excess of -0.7 points, and 539 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/test/java`

**32.9%** of the maximum divergence from the repository, against a null median of 24.3% over 999 resamples of the same size — an excess of +8.6 points, and 101 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-handlers/tika-handler-boilerpipe/src/main/java`

**37.7%** of the maximum divergence from the repository, against a null median of 41.4% over 999 resamples of the same size — an excess of -3.7 points, and 626 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-es-integration-tests/src/test/java`

**30.3%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -3.6 points, and 655 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/java`

**37.8%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of -2.9 points, and 594 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/java`

**29.5%** of the maximum divergence from the repository, against a null median of 32.7% over 999 resamples of the same size — an excess of -3.2 points, and 663 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/java`

**38.7%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of +5.6 points, and 306 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/java`

**61.6%** of the maximum divergence from the repository, against a null median of 22.0% over 999 resamples of the same size — an excess of +39.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 31.0% | `hydraulics` | 0.4301 | 0.0078 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 21.6% | `christianity` | 0.2791 | 0.0017 | **over** | `use` 4,071 `kind` 2,190 `secret` 59 `element` 1,056 |
| 12.4% | `computing` | 0.0568 | 0.3287 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 3.9% | `programming` | 0.0004 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.0% | `mathematics` | 0.0001 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 1.6% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 1.6% | `literature` | 0.0000 | 0.0196 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 1.3% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |

### `tika-integration-tests/tika-resource-loading-tests/src/test/java`

**29.8%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of -3.1 points, and 633 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-woodstox-tests/src/test/java`

**50.4%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of +9.2 points, and 309 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/main/java`

**66.9%** of the maximum divergence from the repository, against a null median of 32.4% over 999 resamples of the same size — an excess of +34.6 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/test/java`

**49.4%** of the maximum divergence from the repository, against a null median of 41.0% over 999 resamples of the same size — an excess of +8.4 points, and 318 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup-core/src/main/java`

**33.9%** of the maximum divergence from the repository, against a null median of 17.4% over 999 resamples of the same size — an excess of +16.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.1% | `mathematics` | 0.1739 | 0.0257 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 8.7% | `computing` | 0.1367 | 0.3287 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 5.5% | `programming` | 0.0031 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 5.0% | `arithmetic` | 0.0448 | 0.0022 | **over** | `extract` 1,065 `integer` 148 `position` 250 `subtract` 15 |
| 4.9% | `linguistics` | 0.1881 | 0.0791 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.6% | `rail-transport` | 0.0400 | 0.0017 | **over** | `pre` 37 `exc` 16 `helper` 126 `uni` 56 |
| 4.6% | `art` | 0.0403 | 0.0018 | **over** | `flag` 263 `artist` 29 `write` 844 `key` 1,630 |
| 2.9% | `computer_science` | 0.0008 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |

### `tika-langdetect/tika-langdetect-charsoup/src/main/java`

**31.0%** of the maximum divergence from the repository, against a null median of 27.5% over 999 resamples of the same size — an excess of +3.5 points, and 341 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/test/java`

**20.6%** of the maximum divergence from the repository, against a null median of 6.8% over 999 resamples of the same size — an excess of +13.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.1% | `computing` | 0.1055 | 0.3287 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 7.3% | `telecommunications` | 0.0383 | 0.0016 | **over** | `ext` 104 `csd` 3 `read` 1,016 `prefix` 605 |
| 4.8% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.5% | `linguistics` | 0.1565 | 0.0791 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 2.9% | `programming` | 0.0185 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.4% | `networking` | 0.0000 | 0.0102 | under | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 2.4% | `computer_science` | 0.0051 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 2.1% | `mathematics` | 0.0571 | 0.0257 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |

### `tika-langdetect/tika-langdetect-lingo24/src/main/java`

**37.4%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of -3.8 points, and 624 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-lingo24/src/test/java`

**75.3%** of the maximum divergence from the repository, against a null median of 41.3% over 999 resamples of the same size — an excess of +33.9 points, and 69 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/main/java`

**53.9%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of +13.3 points, and 260 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/test/java`

**80.7%** of the maximum divergence from the repository, against a null median of 40.1% over 999 resamples of the same size — an excess of +40.6 points, and 34 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/main/java`

**27.6%** of the maximum divergence from the repository, against a null median of 28.0% over 999 resamples of the same size — an excess of -0.4 points, and 526 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/test/java`

**72.6%** of the maximum divergence from the repository, against a null median of 40.8% over 999 resamples of the same size — an excess of +31.8 points, and 69 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/main/java`

**33.1%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of +0.0 points, and 498 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/test/java`

**61.7%** of the maximum divergence from the repository, against a null median of 40.2% over 999 resamples of the same size — an excess of +21.5 points, and 172 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-test-commons/src/main/java`

**49.5%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of +8.9 points, and 318 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/main/java`

**29.2%** of the maximum divergence from the repository, against a null median of 28.3% over 999 resamples of the same size — an excess of +0.9 points, and 435 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/test/java`

**35.1%** of the maximum divergence from the repository, against a null median of 17.0% over 999 resamples of the same size — an excess of +18.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.0% | `networking` | 0.1339 | 0.0102 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 8.6% | `number` | 0.0745 | 0.0027 | **over** | `value` 1,848 `digit` 83 `first` 89 `nothing` 125 |
| 5.7% | `linguistics` | 0.0118 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 5.6% | `computing` | 0.1662 | 0.3287 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 4.5% | `publishing` | 0.0762 | 0.0157 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 3.4% | `computer_science` | 0.0000 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 3.2% | `basketball` | 0.0236 | 0.0002 | **over** | `key` 1,630 `three` 63 `four` 59 `drain` 34 |
| 2.9% | `biology` | 0.0337 | 0.0035 | **over** | `emit` 883 `bos` 67 `reporter` 105 `model` 711 |

### `tika-ml/tika-ml-chardetect/src/main/java`

**21.7%** of the maximum divergence from the repository, against a null median of 19.9% over 999 resamples of the same size — an excess of +1.8 points, and 347 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-chardetect/src/test/java`

**60.5%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of +19.9 points, and 182 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/main/java`

**50.5%** of the maximum divergence from the repository, against a null median of 28.1% over 999 resamples of the same size — an excess of +22.4 points, and 15 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/test/java`

**58.6%** of the maximum divergence from the repository, against a null median of 41.3% over 999 resamples of the same size — an excess of +17.3 points, and 208 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/main/java`

**19.5%** of the maximum divergence from the repository, against a null median of 18.5% over 999 resamples of the same size — an excess of +1.0 points, and 400 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/test/java`

**23.8%** of the maximum divergence from the repository, against a null median of 24.3% over 999 resamples of the same size — an excess of -0.5 points, and 535 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/main/java`

**21.3%** of the maximum divergence from the repository, against a null median of 19.9% over 999 resamples of the same size — an excess of +1.4 points, and 395 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/test/java`

**23.1%** of the maximum divergence from the repository, against a null median of 17.2% over 999 resamples of the same size — an excess of +5.8 points, and 71 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/main/java`

**44.7%** of the maximum divergence from the repository, against a null median of 42.6% over 999 resamples of the same size — an excess of +2.2 points, and 440 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/test/java`

**44.2%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of +10.7 points, and 151 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/main/java`

**26.4%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of -6.3 points, and 795 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/java`

**32.8%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of -0.1 points, and 502 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/main/java`

**15.9%** of the maximum divergence from the repository, against a null median of 16.1% over 999 resamples of the same size — an excess of -0.2 points, and 532 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/java`

**26.4%** of the maximum divergence from the repository, against a null median of 18.9% over 999 resamples of the same size — an excess of +7.6 points, and 55 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/java`

**55.0%** of the maximum divergence from the repository, against a null median of 41.8% over 999 resamples of the same size — an excess of +13.2 points, and 265 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/main/java`

**24.1%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +3.7 points, and 192 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/java`

**29.2%** of the maximum divergence from the repository, against a null median of 41.6% over 999 resamples of the same size — an excess of -12.4 points, and 860 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/java`

**23.3%** of the maximum divergence from the repository, against a null median of 28.0% over 999 resamples of the same size — an excess of -4.7 points, and 761 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-inference/src/main/java`

**22.6%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +10.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.7% | `travel-industry` | 0.0514 | 0.0004 | **over** | `locator` 61 `osi` 3 `pseudo` 8 `fit` 29 |
| 9.4% | `linguistics` | 0.0106 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 8.1% | `tennis` | 0.0772 | 0.0130 | **over** | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 5.7% | `publishing` | 0.0688 | 0.0157 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 5.5% | `buildings` | 0.0540 | 0.0094 | **over** | `log` 484 `window` 349 `tear_down` 48 `machine` 38 |
| 4.2% | `industry` | 0.0001 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.4% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.9% | `programming` | 0.0171 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |

### `tika-parsers/tika-parsers-ml/tika-inference/src/test/java`

**27.6%** of the maximum divergence from the repository, against a null median of 20.0% over 999 resamples of the same size — an excess of +7.6 points, and 74 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java`

**12.8%** of the maximum divergence from the repository, against a null median of 8.7% over 999 resamples of the same size — an excess of +4.1 points, and 8 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/java`

**22.8%** of the maximum divergence from the repository, against a null median of 20.1% over 999 resamples of the same size — an excess of +2.7 points, and 295 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/main/java`

**27.2%** of the maximum divergence from the repository, against a null median of 33.0% over 999 resamples of the same size — an excess of -5.7 points, and 746 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/java`

**22.5%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of -2.7 points, and 660 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/main/java`

**32.0%** of the maximum divergence from the repository, against a null median of 31.9% over 999 resamples of the same size — an excess of +0.1 points, and 497 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/java`

**66.1%** of the maximum divergence from the repository, against a null median of 41.4% over 999 resamples of the same size — an excess of +24.7 points, and 115 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/main/java`

**17.6%** of the maximum divergence from the repository, against a null median of 20.1% over 999 resamples of the same size — an excess of -2.5 points, and 723 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/test/java`

**30.2%** of the maximum divergence from the repository, against a null median of 21.9% over 999 resamples of the same size — an excess of +8.3 points, and 81 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java`

**11.7%** of the maximum divergence from the repository, against a null median of 3.7% over 999 resamples of the same size — an excess of +8.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.4% | `computing` | 0.5038 | 0.3287 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 7.7% | `mathematics` | 0.0018 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 5.8% | `electrotechnology` | 0.0498 | 0.0156 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 4.3% | `industry` | 0.0501 | 0.0196 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.1% | `law` | 0.0061 | 0.0258 | under | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |
| 3.7% | `tennis` | 0.0010 | 0.0130 | under | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 3.5% | `linguistics` | 0.0423 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 3.3% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/main/java`

**14.2%** of the maximum divergence from the repository, against a null median of 14.3% over 999 resamples of the same size — an excess of -0.1 points, and 506 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/java`

**25.8%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +5.5 points, and 132 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/main/java`

**14.6%** of the maximum divergence from the repository, against a null median of 7.0% over 999 resamples of the same size — an excess of +7.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.2% | `music` | 0.0545 | 0.0058 | **over** | `ti` 1,145 `label` 356 `album` 30 `arr` 36 |
| 7.1% | `tennis` | 0.0559 | 0.0130 | **over** | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 6.8% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.5% | `art` | 0.0202 | 0.0018 | **over** | `flag` 263 `artist` 29 `write` 844 `key` 1,630 |
| 4.4% | `computer-graphics` | 0.0326 | 0.0071 | **over** | `renderer` 54 `instance` 572 `mpeg` 48 `jpeg` 49 |
| 3.9% | `industry` | 0.0023 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.7% | `programming` | 0.0986 | 0.0517 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.1% | `acoustics` | 0.0102 | 0.0002 | **over** | `audio` 158 `sound` 3 `static` 4 `noisiness` 1 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/java`

**18.8%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +6.9 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.0% | `linguistics` | 0.0153 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 6.7% | `industry` | 0.0752 | 0.0196 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 6.4% | `computing` | 0.4933 | 0.3287 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 4.1% | `telecommunication` | 0.0015 | 0.0221 | under | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 3.9% | `medicine` | 0.0006 | 0.0178 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 3.8% | `computer-languages` | 0.0013 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.3% | `person` | 0.0006 | 0.0156 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 3.0% | `publishing` | 0.0010 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/main/java`

**19.6%** of the maximum divergence from the repository, against a null median of 17.3% over 999 resamples of the same size — an excess of +2.2 points, and 278 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/java`

**32.1%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of +6.9 points, and 127 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/main/java`

**14.2%** of the maximum divergence from the repository, against a null median of 18.8% over 999 resamples of the same size — an excess of -4.5 points, and 929 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/java`

**31.0%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +10.7 points, and 22 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/main/java`

**22.6%** of the maximum divergence from the repository, against a null median of 24.3% over 999 resamples of the same size — an excess of -1.7 points, and 623 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/java`

**36.0%** of the maximum divergence from the repository, against a null median of 22.3% over 999 resamples of the same size — an excess of +13.7 points, and 22 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/main/java`

**39.0%** of the maximum divergence from the repository, against a null median of 27.9% over 999 resamples of the same size — an excess of +11.1 points, and 96 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/test/java`

**79.6%** of the maximum divergence from the repository, against a null median of 41.5% over 999 resamples of the same size — an excess of +38.0 points, and 36 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-digest-commons/src/main/java`

**50.7%** of the maximum divergence from the repository, against a null median of 24.0% over 999 resamples of the same size — an excess of +26.8 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.6% | `mathematics` | 0.2688 | 0.0257 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 15.0% | `publishing` | 0.2202 | 0.0157 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 9.2% | `engineering` | 0.1057 | 0.0020 | **over** | `datum` 1,929 `encoder` 16 `generator` 42 `mill` 359 |
| 6.6% | `computing` | 0.1267 | 0.3287 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 4.4% | `linguistics` | 0.0098 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 2.7% | `computer_science` | 0.0877 | 0.0244 | **over** | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 2.6% | `buildings` | 0.0560 | 0.0094 | **over** | `log` 484 `window` 349 `tear_down` 48 `machine` 38 |
| 2.2% | `law` | 0.0005 | 0.0258 | under | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/main/java`

**23.5%** of the maximum divergence from the repository, against a null median of 32.7% over 999 resamples of the same size — an excess of -9.2 points, and 890 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/java`

**32.4%** of the maximum divergence from the repository, against a null median of 40.8% over 999 resamples of the same size — an excess of -8.5 points, and 772 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java`

**28.7%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +8.4 points, and 55 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/java`

**22.6%** of the maximum divergence from the repository, against a null median of 32.4% over 999 resamples of the same size — an excess of -9.8 points, and 913 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/main/java`

**12.4%** of the maximum divergence from the repository, against a null median of 11.3% over 999 resamples of the same size — an excess of +1.1 points, and 290 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/java`

**27.0%** of the maximum divergence from the repository, against a null median of 13.8% over 999 resamples of the same size — an excess of +13.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.3% | `computing` | 0.7116 | 0.3287 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 14.1% | `linguistics` | 0.0004 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.1% | `programming` | 0.0101 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.7% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.7% | `mathematics` | 0.0012 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 2.9% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.5% | `law` | 0.0037 | 0.0258 | under | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |
| 2.4% | `person` | 0.0004 | 0.0156 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-jdbc-commons/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 32.4% over 999 resamples of the same size — an excess of -8.3 points, and 878 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java`

**27.2%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of -5.9 points, and 776 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/test/java`

**32.0%** of the maximum divergence from the repository, against a null median of 32.7% over 999 resamples of the same size — an excess of -0.7 points, and 522 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/main/java`

**16.3%** of the maximum divergence from the repository, against a null median of 28.0% over 999 resamples of the same size — an excess of -11.7 points, and 989 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/java`

**26.4%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of -6.1 points, and 778 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java`

**7.5%** of the maximum divergence from the repository, against a null median of 1.1% over 999 resamples of the same size — an excess of +6.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.5% | `computer-languages` | 0.0004 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 9.8% | `electrotechnology` | 0.0001 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 5.6% | `electronics` | 0.0016 | 0.0143 | under | `emitter` 562 `ti` 1,145 `input` 1,031 `default` 1,616 |
| 5.4% | `computer_science` | 0.0536 | 0.0244 | **over** | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 5.3% | `industry` | 0.0041 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 5.2% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 4.2% | `metrology` | 0.0206 | 0.0058 | **over** | `array` 804 `entropy` 90 `rate` 140 `measurement` 13 |
| 3.4% | `mathematics` | 0.0484 | 0.0257 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/java`

**14.3%** of the maximum divergence from the repository, against a null median of 5.0% over 999 resamples of the same size — an excess of +9.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.6% | `industry` | 0.0987 | 0.0196 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 7.5% | `aviation` | 0.0374 | 0.0045 | **over** | `rtf` 105 `max` 1,148 `threshold` 186 `fis` 5 |
| 5.8% | `linguistics` | 0.0298 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 5.1% | `literature` | 0.0584 | 0.0196 | **over** | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 4.0% | `medicine` | 0.0016 | 0.0178 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 3.6% | `person` | 0.0012 | 0.0156 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 2.8% | `algebra` | 0.0306 | 0.0100 | **over** | `content` 2,501 `unknown` 275 `normalizer` 16 `index` 910 |
| 2.7% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/main/java`

**9.5%** of the maximum divergence from the repository, against a null median of 6.0% over 999 resamples of the same size — an excess of +3.5 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 6.5% | `computer-languages` | 0.0020 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 6.2% | `linguistics` | 0.1383 | 0.0791 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 5.7% | `arithmetic` | 0.0188 | 0.0022 | **over** | `extract` 1,065 `integer` 148 `position` 250 `subtract` 15 |
| 4.8% | `electrotechnology` | 0.0017 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 4.2% | `medicine` | 0.0434 | 0.0178 | **over** | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 4.1% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 3.9% | `programming` | 0.0893 | 0.0517 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.8% | `law` | 0.0079 | 0.0258 | under | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/java`

**25.4%** of the maximum divergence from the repository, against a null median of 13.7% over 999 resamples of the same size — an excess of +11.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.0% | `computer-languages` | 0.1739 | 0.0198 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 12.4% | `industry` | 0.1267 | 0.0196 | **over** | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 7.5% | `linguistics` | 0.0129 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.1% | `telecommunication` | 0.0002 | 0.0221 | under | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |
| 4.0% | `algebra` | 0.0488 | 0.0100 | **over** | `content` 2,501 `unknown` 275 `normalizer` 16 `index` 910 |
| 3.1% | `mathematics` | 0.0026 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 3.0% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.1% | `medicine` | 0.0020 | 0.0178 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/main/java`

**18.2%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of -14.3 points, and 994 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/java`

**30.4%** of the maximum divergence from the repository, against a null median of 41.7% over 999 resamples of the same size — an excess of -11.3 points, and 834 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/main/java`

**22.7%** of the maximum divergence from the repository, against a null median of 21.9% over 999 resamples of the same size — an excess of +0.8 points, and 443 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/java`

**29.3%** of the maximum divergence from the repository, against a null median of 33.6% over 999 resamples of the same size — an excess of -4.3 points, and 691 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/main/java`

**19.3%** of the maximum divergence from the repository, against a null median of 8.6% over 999 resamples of the same size — an excess of +10.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.7% | `publishing` | 0.0947 | 0.0157 | **over** | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 9.3% | `computer-graphics` | 0.0620 | 0.0071 | **over** | `renderer` 54 `instance` 572 `mpeg` 48 `jpeg` 49 |
| 5.1% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.7% | `software` | 0.0308 | 0.0034 | **over** | `shift_jis` 59 `pdf` 153 `excel` 98 `factory_class` 20 |
| 4.5% | `information-science` | 0.0246 | 0.0017 | **over** | `document` 1,456 `align` 54 `controlled_vocabulary` 14 `keyword` 7 |
| 4.0% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.9% | `statistics` | 0.0237 | 0.0022 | **over** | `sigma` 49 `ignorable` 31 `histogram` 22 `class` 1,452 |
| 3.5% | `furniture` | 0.0171 | 0.0007 | **over** | `counter` 74 `drawer` 12 `phone` 29 `settle` 1 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java`

**24.6%** of the maximum divergence from the repository, against a null median of 18.8% over 999 resamples of the same size — an excess of +5.8 points, and 93 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/main/java`

**18.5%** of the maximum divergence from the repository, against a null median of 15.1% over 999 resamples of the same size — an excess of +3.3 points, and 167 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/java`

**18.0%** of the maximum divergence from the repository, against a null median of 12.0% over 999 resamples of the same size — an excess of +6.0 points, and 10 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/main/java`

**15.2%** of the maximum divergence from the repository, against a null median of 14.3% over 999 resamples of the same size — an excess of +0.9 points, and 370 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/java`

**22.6%** of the maximum divergence from the repository, against a null median of 18.6% over 999 resamples of the same size — an excess of +4.0 points, and 159 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/main/java`

**22.5%** of the maximum divergence from the repository, against a null median of 27.4% over 999 resamples of the same size — an excess of -4.9 points, and 804 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/java`

**39.7%** of the maximum divergence from the repository, against a null median of 28.6% over 999 resamples of the same size — an excess of +11.1 points, and 103 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java`

**22.5%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +10.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.3% | `medicine` | 0.1457 | 0.0178 | **over** | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 5.1% | `programming` | 0.1259 | 0.0517 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 4.3% | `law` | 0.0014 | 0.0258 | under | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |
| 3.9% | `industry` | 0.0003 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.7% | `computing` | 0.4636 | 0.3287 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 3.5% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.4% | `person` | 0.0000 | 0.0156 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 3.3% | `linguistics` | 0.1469 | 0.0791 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/java`

**29.7%** of the maximum divergence from the repository, against a null median of 18.5% over 999 resamples of the same size — an excess of +11.2 points, and 14 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/main/java`

**23.9%** of the maximum divergence from the repository, against a null median of 22.3% over 999 resamples of the same size — an excess of +1.6 points, and 372 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/java`

**43.5%** of the maximum divergence from the repository, against a null median of 28.4% over 999 resamples of the same size — an excess of +15.1 points, and 44 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java`

**20.9%** of the maximum divergence from the repository, against a null median of 11.4% over 999 resamples of the same size — an excess of +9.5 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.3% | `linguistics` | 0.2449 | 0.0791 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 6.4% | `furniture` | 0.0310 | 0.0007 | **over** | `counter` 74 `drawer` 12 `phone` 29 `settle` 1 |
| 4.7% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 4.7% | `literature` | 0.0000 | 0.0196 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 4.2% | `computer_science` | 0.0015 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 3.8% | `industry` | 0.0007 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 3.6% | `person` | 0.0000 | 0.0156 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 3.5% | `telecommunication` | 0.0628 | 0.0221 | **over** | `file` 3,477 `entry` 811 `medium` 440 `record` 161 |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/java`

**39.0%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of +6.5 points, and 266 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/main/java`

**18.4%** of the maximum divergence from the repository, against a null median of 21.9% over 999 resamples of the same size — an excess of -3.5 points, and 791 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/test/java`

**30.8%** of the maximum divergence from the repository, against a null median of 24.8% over 999 resamples of the same size — an excess of +6.0 points, and 188 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-httpclient-commons/src/main/java`

**49.3%** of the maximum divergence from the repository, against a null median of 28.5% over 999 resamples of the same size — an excess of +20.8 points, and 17 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-api/src/main/java`

**26.7%** of the maximum divergence from the repository, against a null median of 9.3% over 999 resamples of the same size — an excess of +17.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.5% | `biology` | 0.0788 | 0.0035 | **over** | `emit` 883 `bos` 67 `reporter` 105 `model` 711 |
| 9.5% | `electronics` | 0.0981 | 0.0143 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `default` 1,616 |
| 7.6% | `hydraulics` | 0.0690 | 0.0078 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 4.4% | `glassblowing` | 0.0263 | 0.0005 | **over** | `found` 293 `step` 48 `web` 61 `way` 91 |
| 3.7% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.7% | `literature` | 0.0000 | 0.0196 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 3.4% | `programming` | 0.1154 | 0.0517 | **over** | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.9% | `mathematics` | 0.0704 | 0.0257 | **over** | `count` 925 `value` 1,869 `from` 292 `rel` 66 |

### `tika-pipes/tika-pipes-config-store-ignite/src/main/java`

**32.2%** of the maximum divergence from the repository, against a null median of 22.1% over 999 resamples of the same size — an excess of +10.1 points, and 53 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-config-store-ignite/src/test/java`

**48.3%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of +7.0 points, and 354 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-core/src/main/java`

**10.9%** of the maximum divergence from the repository, against a null median of 3.9% over 999 resamples of the same size — an excess of +7.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.5% | `electronics` | 0.0617 | 0.0143 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `default` 1,616 |
| 8.9% | `biology` | 0.0325 | 0.0035 | **over** | `emit` 883 `bos` 67 `reporter` 105 `model` 711 |
| 7.9% | `hydraulics` | 0.0401 | 0.0078 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 5.1% | `linguistics` | 0.0371 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.8% | `industry` | 0.0026 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.8% | `publishing` | 0.0013 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 3.1% | `electrotechnology` | 0.0029 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.0% | `geography` | 0.0015 | 0.0117 | under | `stream` 1,670 `apache` 6,823 `state` 273 `time_zone` 26 |

### `tika-pipes/tika-pipes-core/src/test/java`

**15.6%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +3.7 points, and 61 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/main/java`

**23.5%** of the maximum divergence from the repository, against a null median of 24.6% over 999 resamples of the same size — an excess of -1.2 points, and 588 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/test/java`

**34.0%** of the maximum divergence from the repository, against a null median of 41.6% over 999 resamples of the same size — an excess of -7.6 points, and 732 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-integration-tests/src/test/java`

**15.7%** of the maximum divergence from the repository, against a null median of 9.0% over 999 resamples of the same size — an excess of +6.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.8% | `hydraulics` | 0.0908 | 0.0078 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 6.2% | `computing` | 0.4755 | 0.3287 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 5.7% | `literature` | 0.0002 | 0.0196 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 4.3% | `publishing` | 0.0004 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 3.6% | `geography` | 0.0001 | 0.0117 | under | `stream` 1,670 `apache` 6,823 `state` 273 `time_zone` 26 |
| 2.8% | `computer_science` | 0.0058 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 2.5% | `grammar` | 0.0002 | 0.0091 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |
| 2.3% | `person` | 0.0027 | 0.0156 | under | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |

### `tika-pipes/tika-pipes-iterator-commons/src/main/java`

**47.1%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of +14.0 points, and 124 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java`

**23.6%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +3.3 points, and 263 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/java`

**46.4%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of +5.2 points, and 384 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 15.2% over 999 resamples of the same size — an excess of +9.0 points, and 11 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/java`

**32.5%** of the maximum divergence from the repository, against a null median of 24.8% over 999 resamples of the same size — an excess of +7.7 points, and 125 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/main/java`

**30.3%** of the maximum divergence from the repository, against a null median of 24.9% over 999 resamples of the same size — an excess of +5.4 points, and 177 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 33.0% over 999 resamples of the same size — an excess of -7.7 points, and 846 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/main/java`

**21.4%** of the maximum divergence from the repository, against a null median of 15.1% over 999 resamples of the same size — an excess of +6.3 points, and 36 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/java`

**40.1%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of +6.6 points, and 282 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/main/java`

**20.9%** of the maximum divergence from the repository, against a null median of 12.0% over 999 resamples of the same size — an excess of +8.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.8% | `time_period` | 0.0663 | 0.0104 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 6.8% | `electronics` | 0.0692 | 0.0143 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `default` 1,616 |
| 5.9% | `computer-languages` | 0.0752 | 0.0198 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 5.7% | `computer_science` | 0.0001 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 4.0% | `hydraulics` | 0.0395 | 0.0078 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 3.7% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.2% | `sociology` | 0.0239 | 0.0029 | **over** | `status` 293 `priority` 33 `class` 1,453 `common` 248 |
| 3.0% | `publishing` | 0.0006 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/java`

**25.0%** of the maximum divergence from the repository, against a null median of 18.8% over 999 resamples of the same size — an excess of +6.2 points, and 92 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/main/java`

**26.4%** of the maximum divergence from the repository, against a null median of 15.3% over 999 resamples of the same size — an excess of +11.1 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.2% | `electronics` | 0.0956 | 0.0143 | **over** | `emitter` 562 `ti` 1,145 `input` 1,031 `default` 1,616 |
| 9.0% | `time_period` | 0.0839 | 0.0104 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 8.3% | `mechanics` | 0.0550 | 0.0023 | **over** | `bucket` 379 `override` 147 `throttle` 23 `restart` 103 |
| 5.6% | `hydraulics` | 0.0558 | 0.0078 | **over** | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 3.3% | `computer-hardware` | 0.0193 | 0.0003 | **over** | `storage` 140 `cpu` 31 `ram` 99 `device` 11 |
| 3.0% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.8% | `publishing` | 0.0001 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 2.7% | `computer_science` | 0.0028 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 24.7% over 999 resamples of the same size — an excess of +0.6 points, and 460 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/main/java`

**27.5%** of the maximum divergence from the repository, against a null median of 24.6% over 999 resamples of the same size — an excess of +3.0 points, and 330 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/java`

**44.4%** of the maximum divergence from the repository, against a null median of 41.4% over 999 resamples of the same size — an excess of +3.0 points, and 422 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/main/java`

**33.3%** of the maximum divergence from the repository, against a null median of 16.2% over 999 resamples of the same size — an excess of +17.1 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.0% | `exchange` | 0.1323 | 0.0008 | **over** | `issuer` 17 `stock` 22 `option` 129 `put` 13 |
| 12.8% | `cryptography` | 0.1063 | 0.0040 | **over** | `encrypt` 97 `password` 186 `private_key` 25 `md5` 21 |
| 8.0% | `networking` | 0.0911 | 0.0102 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 5.8% | `programming` | 0.0028 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.9% | `literature` | 0.0761 | 0.0196 | **over** | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 2.6% | `industry` | 0.0003 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 2.3% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.3% | `publishing` | 0.0001 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/java`

**34.2%** of the maximum divergence from the repository, against a null median of 24.8% over 999 resamples of the same size — an excess of +9.5 points, and 79 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/main/java`

**22.1%** of the maximum divergence from the repository, against a null median of 15.2% over 999 resamples of the same size — an excess of +7.0 points, and 20 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/java`

**23.1%** of the maximum divergence from the repository, against a null median of 24.5% over 999 resamples of the same size — an excess of -1.4 points, and 603 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/main/java`

**37.1%** of the maximum divergence from the repository, against a null median of 24.6% over 999 resamples of the same size — an excess of +12.5 points, and 42 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/java`

**36.1%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of +3.2 points, and 380 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/main/java`

**22.3%** of the maximum divergence from the repository, against a null median of 18.9% over 999 resamples of the same size — an excess of +3.4 points, and 216 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/java`

**35.2%** of the maximum divergence from the repository, against a null median of 32.3% over 999 resamples of the same size — an excess of +2.9 points, and 396 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/main/java`

**35.9%** of the maximum divergence from the repository, against a null median of 17.3% over 999 resamples of the same size — an excess of +18.6 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 29.2% | `law` | 0.3157 | 0.0258 | **over** | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |
| 4.1% | `mechanics` | 0.0402 | 0.0023 | **over** | `bucket` 379 `override` 147 `throttle` 23 `restart` 103 |
| 3.7% | `town_planning` | 0.0295 | 0.0005 | **over** | `store` 443 `current` 74 `archive` 76 `tenant` 18 |
| 3.6% | `mathematics` | 0.0000 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 3.2% | `programming` | 0.0094 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.7% | `literature` | 0.0000 | 0.0196 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 2.4% | `industry` | 0.0004 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 2.2% | `publishing` | 0.0000 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/java`

**32.8%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of +0.3 points, and 490 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/main/java`

**25.0%** of the maximum divergence from the repository, against a null median of 12.9% over 999 resamples of the same size — an excess of +12.1 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.8% | `computer-languages` | 0.1345 | 0.0198 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 8.8% | `person` | 0.0929 | 0.0156 | **over** | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 7.0% | `sociology` | 0.0481 | 0.0029 | **over** | `status` 293 `priority` 33 `class` 1,453 `common` 248 |
| 6.2% | `plants` | 0.0554 | 0.0069 | **over** | `root` 458 `log` 484 `stub` 81 `complete` 142 |
| 3.1% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.9% | `publishing` | 0.0002 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 2.7% | `time_period` | 0.0402 | 0.0104 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 2.2% | `networking` | 0.0360 | 0.0102 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/java`

**45.2%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of +12.4 points, and 144 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/main/java`

**21.0%** of the maximum divergence from the repository, against a null median of 15.4% over 999 resamples of the same size — an excess of +5.7 points, and 60 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/java`

**28.8%** of the maximum divergence from the repository, against a null median of 27.8% over 999 resamples of the same size — an excess of +0.9 points, and 450 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/main/java`

**29.0%** of the maximum divergence from the repository, against a null median of 17.4% over 999 resamples of the same size — an excess of +11.6 points, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/java`

**26.6%** of the maximum divergence from the repository, against a null median of 27.9% over 999 resamples of the same size — an excess of -1.4 points, and 571 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-reporter-commons/src/main/java`

**61.5%** of the maximum divergence from the repository, against a null median of 40.9% over 999 resamples of the same size — an excess of +20.6 points, and 178 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-plugins-core/src/main/java`

**34.8%** of the maximum divergence from the repository, against a null median of 18.4% over 999 resamples of the same size — an excess of +16.4 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 39.8% | `time_period` | 0.3338 | 0.0104 | **over** | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 4.2% | `plants` | 0.0530 | 0.0069 | **over** | `root` 458 `log` 484 `stub` 81 `complete` 142 |
| 3.8% | `computer-languages` | 0.0775 | 0.0198 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.5% | `computer_science` | 0.0000 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 2.8% | `literature` | 0.0000 | 0.0196 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 2.3% | `mathematics` | 0.0026 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 2.2% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.0% | `software` | 0.0255 | 0.0034 | **over** | `shift_jis` 59 `pdf` 153 `excel` 98 `factory_class` 20 |

### `tika-plugins-core/src/test/java`

**33.0%** of the maximum divergence from the repository, against a null median of 27.5% over 999 resamples of the same size — an excess of +5.5 points, and 232 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/main/java`

**14.3%** of the maximum divergence from the repository, against a null median of 6.8% over 999 resamples of the same size — an excess of +7.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.6% | `graph-theory` | 0.0552 | 0.0021 | **over** | `component` 599 `node` 598 `size` 784 `path` 1,674 |
| 5.3% | `industry` | 0.0009 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 4.1% | `electrotechnology` | 0.0465 | 0.0156 | **over** | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 3.8% | `psychology` | 0.0200 | 0.0027 | **over** | `confidence` 226 `module` 100 `self` 50 `matter` 59 |
| 3.4% | `computer-languages` | 0.0501 | 0.0198 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.0% | `medicine` | 0.0029 | 0.0178 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |
| 2.8% | `time_period` | 0.0005 | 0.0104 | under | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 2.7% | `literature` | 0.0042 | 0.0196 | under | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |

### `tika-serialization/src/test/java`

**13.2%** of the maximum divergence from the repository, against a null median of 6.7% over 999 resamples of the same size — an excess of +6.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.8% | `computer-languages` | 0.0917 | 0.0198 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 5.5% | `publishing` | 0.0002 | 0.0157 | under | `table` 860 `page` 554 `text` 2,092 `read` 277 |
| 5.2% | `computing` | 0.4495 | 0.3287 | **over** | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 3.6% | `time_period` | 0.0001 | 0.0104 | under | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 2.9% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 1,028 `module` 100 `accumulator` 9 |
| 2.7% | `networking` | 0.0007 | 0.0102 | under | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 2.3% | `electrotechnology` | 0.0034 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 2.2% | `grammar` | 0.0009 | 0.0091 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |

### `tika-server/tika-server-core/src/main/java`

**18.7%** of the maximum divergence from the repository, against a null median of 5.8% over 999 resamples of the same size — an excess of +13.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.7% | `networking` | 0.1105 | 0.0102 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 13.9% | `commerce` | 0.0737 | 0.0049 | **over** | `server` 670 `packet` 73 `quote` 66 `package` 206 |
| 7.4% | `literature` | 0.0791 | 0.0196 | **over** | `header` 1,039 `writer` 284 `text` 2,092 `author` 173 |
| 3.5% | `computer-languages` | 0.0016 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 3.3% | `programming` | 0.0178 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.2% | `sociology` | 0.0217 | 0.0029 | **over** | `status` 293 `priority` 33 `class` 1,453 `common` 248 |
| 3.1% | `industry` | 0.0021 | 0.0196 | under | `test` 3,756 `extractor` 394 `string` 130 `factory` 525 |
| 2.6% | `mathematics` | 0.0059 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |

### `tika-server/tika-server-core/src/test/java`

**15.0%** of the maximum divergence from the repository, against a null median of 8.1% over 999 resamples of the same size — an excess of +6.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.7% | `networking` | 0.0835 | 0.0102 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 8.7% | `law` | 0.0887 | 0.0258 | **over** | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |
| 7.1% | `anatomy` | 0.0369 | 0.0043 | **over** | `body` 409 `socket` 144 `iter` 11 `colon` 23 |
| 6.1% | `linguistics` | 0.0280 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 5.1% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 1,108 `wire` 3 `wiring` 7 `soar` 1 |
| 5.0% | `programming` | 0.0153 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 3.1% | `commerce` | 0.0231 | 0.0049 | **over** | `server` 670 `packet` 73 `quote` 66 `package` 206 |
| 2.6% | `grammar` | 0.0003 | 0.0091 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |

### `tika-server/tika-server-standard/src/main/java`

**30.5%** of the maximum divergence from the repository, against a null median of 32.1% over 999 resamples of the same size — an excess of -1.6 points, and 569 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-standard/src/test/java`

**20.4%** of the maximum divergence from the repository, against a null median of 11.5% over 999 resamples of the same size — an excess of +9.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `person` | 0.1063 | 0.0156 | **over** | `reader` 376 `child` 294 `mapper` 309 `logger` 39 |
| 10.1% | `networking` | 0.0765 | 0.0102 | **over** | `resource` 733 `http` 2,683 `request` 695 `mime` 596 |
| 7.8% | `programming` | 0.0052 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 6.9% | `computer-languages` | 0.0801 | 0.0198 | **over** | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 5.5% | `mathematics` | 0.0005 | 0.0257 | under | `count` 925 `value` 1,869 `from` 292 `rel` 66 |
| 4.0% | `linguistics` | 0.0302 | 0.0791 | under | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 2.4% | `time_period` | 0.0001 | 0.0104 | under | `extension` 478 `future` 90 `current` 269 `duration` 76 |
| 2.2% | `grammar` | 0.0000 | 0.0091 | under | `num` 476 `clause` 33 `modify` 123 `number` 737 |

### `tika-translate/src/main/java`

**17.7%** of the maximum divergence from the repository, against a null median of 14.3% over 999 resamples of the same size — an excess of +3.3 points, and 143 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-translate/src/test/java`

**41.5%** of the maximum divergence from the repository, against a null median of 16.3% over 999 resamples of the same size — an excess of +25.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.2% | `botany` | 0.1541 | 0.0016 | **over** | `translator` 126 `test` 5,626 `key` 1,630 `offset` 444 |
| 13.9% | `linguistics` | 0.3240 | 0.0791 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 10.8% | `software` | 0.1083 | 0.0034 | **over** | `shift_jis` 59 `pdf` 153 `excel` 98 `factory_class` 20 |
| 5.7% | `programming` | 0.0006 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.9% | `computer_science` | 0.0000 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |
| 2.6% | `law` | 0.0007 | 0.0258 | under | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |
| 2.4% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 834 `xml` 418 `sql` 38 `java` 222 |
| 2.1% | `medicine` | 0.0000 | 0.0178 | under | `uri` 334 `type` 3,463 `start` 1,211 `tmp` 331 |

### `tika-xmp/src/main/java`

**22.9%** of the maximum divergence from the repository, against a null median of 15.3% over 999 resamples of the same size — an excess of +7.6 points, and 12 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-xmp/src/test/java`

**32.6%** of the maximum divergence from the repository, against a null median of 32.4% over 999 resamples of the same size — an excess of +0.1 points, and 496 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `documentation`

**31.8%** of the maximum divergence from the repository, against a null median of 17.7% over 999 resamples of the same size — an excess of +14.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.3% | `law` | 0.2230 | 0.0258 | **over** | `file` 10,172 `client` 720 `retry` 54 `allow` 363 |
| 14.7% | `geography` | 0.1414 | 0.0117 | **over** | `stream` 1,670 `apache` 6,823 `state` 273 `time_zone` 26 |
| 11.3% | `computing` | 0.1209 | 0.3287 | under | `metadata` 4,118 `config` 2,430 `parser` 2,583 `byte` 2,993 |
| 7.3% | `linguistics` | 0.2132 | 0.0791 | **over** | `name` 3,802 `context` 2,255 `parse` 2,825 `prefix` 605 |
| 4.0% | `physics` | 0.0421 | 0.0044 | **over** | `length` 1,226 `weight` 122 `free_space` 26 `sql` 38 |
| 3.0% | `programming` | 0.0119 | 0.0517 | under | `handler` 1,912 `factory` 525 `iterator` 127 `tmp` 331 |
| 2.0% | `tennis` | 0.0000 | 0.0130 | under | `get` 4,191 `return` 1,431 `server` 670 `single` 447 |
| 1.9% | `computer_science` | 0.0037 | 0.0244 | under | `parser` 2,583 `byte` 2,993 `url` 466 `format` 613 |

Read, compared and resampled in 70.4 s, recorded rather than estimated.
