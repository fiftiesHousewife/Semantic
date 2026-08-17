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
| `computing` | 0.1216 | 84.4% | 71,285 | 1,229 | 260,445 | 68.5% | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| `linguistics` | 0.0252 | 79.3% | 30,262 | 163 | 24,939 | 6.6% | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |

Read over 2,156 files and 380,237 lines: 552 topics, 42 files no topic could be resolved for, and 68.5% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 32.8% of it; the other 67.2% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `tika-annotation-processor/src/main/java`

**34.9%** of the maximum divergence from the repository, against a null median of 28.2% over 999 resamples of the same size — an excess of +6.7 points, and 197 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-annotation-processor/src/test/java`

**71.0%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of +29.8 points, and 101 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/main/java`

**13.8%** of the maximum divergence from the repository, against a null median of 22.1% over 999 resamples of the same size — an excess of -8.3 points, and 979 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/test/java`

**25.6%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of +0.5 points, and 452 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/main/java`

**40.7%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of -0.5 points, and 520 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/test/java`

**40.9%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of -0.4 points, and 511 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-core/src/main/java`

**4.5%** of the maximum divergence from the repository, against a null median of 1.0% over 999 resamples of the same size — an excess of +3.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.3% | `industry` | 0.0033 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 10.1% | `computer-languages` | 0.0036 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 8.1% | `hydraulics` | 0.0001 | 0.0078 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 6.8% | `computer-graphics` | 0.0227 | 0.0071 | **over** | `renderer` 29.9% (54) `instance` 22.4% (572) `mpeg` 9.5% (48) `jpeg` 8.8% (49) |
| 5.9% | `geography` | 0.0288 | 0.0117 | **over** | `stream` 24.0% (1,670) `apache` 7.8% (6,823) `state` 7.2% (273) `time_zone` 2.9% (26) |
| 4.9% | `linguistics` | 0.1132 | 0.0790 | **over** | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 3.8% | `commerce` | 0.0003 | 0.0049 | under | `server` 67.4% (669) `packet` 12.4% (73) `quote` 5.6% (66) `package` 5.2% (206) |
| 3.4% | `plants` | 0.0012 | 0.0069 | under | `root` 50.3% (457) `log` 30.1% (484) `stub` 4.7% (81) `complete` 3.6% (142) |

### `tika-core/src/test/java`

**7.8%** of the maximum divergence from the repository, against a null median of 3.4% over 999 resamples of the same size — an excess of +4.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.8% | `industry` | 0.0743 | 0.0196 | **over** | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 10.6% | `electrotechnology` | 0.0543 | 0.0156 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 5.0% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.1% | `literature` | 0.0052 | 0.0196 | under | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 3.1% | `metrology` | 0.0002 | 0.0058 | under | `array` 29.1% (804) `entropy` 13.8% (90) `rate` 7.5% (140) `measurement` 6.1% (13) |
| 3.1% | `grammar` | 0.0012 | 0.0091 | under | `num` 60.9% (476) `clause` 8.0% (33) `modify` 5.1% (123) `number` 5.0% (737) |
| 3.1% | `tennis` | 0.0030 | 0.0130 | under | `get` 98.2% (4,191) `return` 0.8% (1,431) `server` 0.3% (669) `single` 0.3% (447) |
| 2.7% | `programming` | 0.0789 | 0.0516 | **over** | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |

### `tika-detectors/tika-detector-magika/src/main/java`

**28.6%** of the maximum divergence from the repository, against a null median of 41.1% over 999 resamples of the same size — an excess of -12.5 points, and 880 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-magika/src/test/java`

**32.9%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of -0.1 points, and 504 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/main/java`

**34.0%** of the maximum divergence from the repository, against a null median of 41.8% over 999 resamples of the same size — an excess of -7.8 points, and 727 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/test/java`

**34.9%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of +2.0 points, and 417 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-grpc/src/test/java`

**24.8%** of the maximum divergence from the repository, against a null median of 24.5% over 999 resamples of the same size — an excess of +0.3 points, and 476 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-server/src/test/java`

**48.0%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of +15.3 points, and 100 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/main/java`

**17.7%** of the maximum divergence from the repository, against a null median of 16.1% over 999 resamples of the same size — an excess of +1.5 points, and 327 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 33.0% over 999 resamples of the same size — an excess of -7.7 points, and 826 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java`

**18.9%** of the maximum divergence from the repository, against a null median of 16.2% over 999 resamples of the same size — an excess of +2.8 points, and 228 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/java`

**45.4%** of the maximum divergence from the repository, against a null median of 39.9% over 999 resamples of the same size — an excess of +5.5 points, and 378 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/main/java`

**16.4%** of the maximum divergence from the repository, against a null median of 13.0% over 999 resamples of the same size — an excess of +3.4 points, and 119 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java`

**15.9%** of the maximum divergence from the repository, against a null median of 11.0% over 999 resamples of the same size — an excess of +4.9 points, and 22 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-universal/src/main/java`

**26.4%** of the maximum divergence from the repository, against a null median of 32.7% over 999 resamples of the same size — an excess of -6.3 points, and 783 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/main/java`

**16.5%** of the maximum divergence from the repository, against a null median of 7.4% over 999 resamples of the same size — an excess of +9.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.7% | `publishing` | 0.0859 | 0.0156 | **over** | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 8.7% | `computing` | 0.1865 | 0.3289 | under | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 6.6% | `arithmetic` | 0.0314 | 0.0022 | **over** | `extract` 93.4% (1,065) `integer` 2.6% (148) `position` 0.6% (250) `subtract` 0.5% (15) |
| 4.4% | `theatre` | 0.0254 | 0.0030 | **over** | `mime` 76.4% (595) `script` 19.9% (825) `extra` 2.5% (17) `jackson` 0.8% (72) |
| 4.3% | `geology` | 0.0194 | 0.0011 | **over** | `col` 53.7% (69) `delta` 13.8% (36) `julian` 5.5% (5) `sheet` 4.6% (149) |
| 3.9% | `electrotechnology` | 0.0005 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.5% | `electronics` | 0.0005 | 0.0143 | under | `emitter` 55.8% (560) `ti` 11.7% (1,144) `input` 11.3% (1,030) `default` 2.2% (1,615) |
| 3.4% | `industry` | 0.0023 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |

### `tika-eval/tika-eval-app/src/test/java`

**20.6%** of the maximum divergence from the repository, against a null median of 15.4% over 999 resamples of the same size — an excess of +5.2 points, and 77 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-core/src/main/java`

**21.4%** of the maximum divergence from the repository, against a null median of 6.7% over 999 resamples of the same size — an excess of +14.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 24.9% | `mathematics` | 0.1957 | 0.0257 | **over** | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 7.8% | `video-games` | 0.0539 | 0.0054 | **over** | `stats` 26.5% (50) `meta` 15.4% (187) `item` 11.3% (318) `row` 4.6% (314) |
| 4.5% | `computer-languages` | 0.0001 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 3.6% | `telecommunication` | 0.0015 | 0.0220 | under | `file` 38.6% (3,475) `entry` 21.4% (811) `medium` 7.5% (438) `record` 4.0% (161) |
| 3.5% | `tennis` | 0.0472 | 0.0130 | **over** | `get` 98.2% (4,191) `return` 0.8% (1,431) `server` 0.3% (669) `single` 0.3% (447) |
| 2.9% | `electronics` | 0.0003 | 0.0143 | under | `emitter` 55.8% (560) `ti` 11.7% (1,144) `input` 11.3% (1,030) `default` 2.2% (1,615) |
| 2.7% | `person` | 0.0009 | 0.0155 | under | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |
| 2.5% | `industry` | 0.0025 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |

### `tika-eval/tika-eval-core/src/test/java`

**19.2%** of the maximum divergence from the repository, against a null median of 18.5% over 999 resamples of the same size — an excess of +0.8 points, and 430 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-example/src/main/java`

**14.3%** of the maximum divergence from the repository, against a null median of 6.5% over 999 resamples of the same size — an excess of +7.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `telecommunication` | 0.1128 | 0.0220 | **over** | `file` 38.6% (3,475) `entry` 21.4% (811) `medium` 7.5% (438) `record` 4.0% (161) |
| 6.9% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 5.0% | `industry` | 0.0012 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 4.1% | `electrotechnology` | 0.0467 | 0.0156 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.8% | `mathematics` | 0.0071 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 2.6% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 2.6% | `buildings` | 0.0004 | 0.0094 | under | `log` 23.8% (484) `window` 20.8% (349) `tear_down` 18.5% (48) `machine` 8.7% (38) |
| 2.3% | `networking` | 0.0009 | 0.0102 | under | `resource` 34.5% (733) `http` 29.9% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |

### `tika-example/src/test/java`

**30.7%** of the maximum divergence from the repository, against a null median of 15.1% over 999 resamples of the same size — an excess of +15.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.3% | `chemistry` | 0.1188 | 0.0110 | **over** | `buffer` 18.1% (419) `builder` 17.4% (189) `type` 14.8% (3,459) `char` 9.7% (562) |
| 7.9% | `industry` | 0.1081 | 0.0196 | **over** | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 7.2% | `computing` | 0.1575 | 0.3289 | under | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 5.7% | `electrotechnology` | 0.0812 | 0.0156 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 5.3% | `video-games` | 0.0531 | 0.0054 | **over** | `stats` 26.5% (50) `meta` 15.4% (187) `item` 11.3% (318) `row` 4.6% (314) |
| 4.7% | `telecommunication` | 0.0853 | 0.0220 | **over** | `file` 38.6% (3,475) `entry` 21.4% (811) `medium` 7.5% (438) `record` 4.0% (161) |
| 4.6% | `buildings` | 0.0579 | 0.0094 | **over** | `log` 23.8% (484) `window` 20.8% (349) `tear_down` 18.5% (48) `machine` 8.7% (38) |
| 4.3% | `programming` | 0.0076 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |

### `tika-grpc/src/main/java`

**26.8%** of the maximum divergence from the repository, against a null median of 27.5% over 999 resamples of the same size — an excess of -0.7 points, and 540 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/test/java`

**32.9%** of the maximum divergence from the repository, against a null median of 24.2% over 999 resamples of the same size — an excess of +8.6 points, and 100 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-handlers/tika-handler-boilerpipe/src/main/java`

**37.7%** of the maximum divergence from the repository, against a null median of 41.4% over 999 resamples of the same size — an excess of -3.7 points, and 626 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-es-integration-tests/src/test/java`

**30.3%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -3.6 points, and 656 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/java`

**37.8%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of -2.8 points, and 594 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/java`

**29.5%** of the maximum divergence from the repository, against a null median of 32.7% over 999 resamples of the same size — an excess of -3.2 points, and 663 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/java`

**38.8%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of +5.6 points, and 304 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/java`

**61.6%** of the maximum divergence from the repository, against a null median of 22.0% over 999 resamples of the same size — an excess of +39.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 31.0% | `hydraulics` | 0.4301 | 0.0078 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 21.6% | `christianity` | 0.2791 | 0.0017 | **over** | `use` 58.6% (4,071) `kind` 6.5% (2,190) `secret` 5.1% (59) `element` 5.0% (1,056) |
| 12.4% | `computing` | 0.0568 | 0.3289 | under | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 3.9% | `programming` | 0.0004 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 2.0% | `mathematics` | 0.0001 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 1.6% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 1.6% | `literature` | 0.0000 | 0.0196 | under | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 1.3% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |

### `tika-integration-tests/tika-resource-loading-tests/src/test/java`

**29.8%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of -3.1 points, and 632 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-woodstox-tests/src/test/java`

**50.3%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of +9.1 points, and 310 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/main/java`

**66.9%** of the maximum divergence from the repository, against a null median of 32.3% over 999 resamples of the same size — an excess of +34.6 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/test/java`

**49.4%** of the maximum divergence from the repository, against a null median of 40.9% over 999 resamples of the same size — an excess of +8.5 points, and 317 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup-core/src/main/java`

**33.9%** of the maximum divergence from the repository, against a null median of 17.4% over 999 resamples of the same size — an excess of +16.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.1% | `mathematics` | 0.1739 | 0.0257 | **over** | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 8.7% | `computing` | 0.1367 | 0.3289 | under | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 5.5% | `programming` | 0.0031 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 5.0% | `arithmetic` | 0.0448 | 0.0022 | **over** | `extract` 93.4% (1,065) `integer` 2.6% (148) `position` 0.6% (250) `subtract` 0.5% (15) |
| 4.9% | `linguistics` | 0.1881 | 0.0790 | **over** | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 4.6% | `rail-transport` | 0.0400 | 0.0017 | **over** | `pre` 26.4% (37) `exc` 23.3% (16) `helper` 13.6% (126) `uni` 8.7% (56) |
| 4.6% | `art` | 0.0403 | 0.0018 | **over** | `flag` 51.6% (263) `artist` 13.5% (29) `write` 10.4% (844) `key` 4.4% (1,621) |
| 3.0% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |

### `tika-langdetect/tika-langdetect-charsoup/src/main/java`

**31.0%** of the maximum divergence from the repository, against a null median of 27.5% over 999 resamples of the same size — an excess of +3.5 points, and 340 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/test/java`

**20.6%** of the maximum divergence from the repository, against a null median of 6.8% over 999 resamples of the same size — an excess of +13.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 21.1% | `computing` | 0.1055 | 0.3289 | under | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 7.3% | `telecommunications` | 0.0383 | 0.0016 | **over** | `ext` 84.1% (104) `csd` 3.1% (3) `read` 2.3% (1,016) `prefix` 2.0% (600) |
| 4.9% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 4.6% | `linguistics` | 0.1565 | 0.0790 | **over** | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 2.9% | `programming` | 0.0185 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 2.4% | `networking` | 0.0000 | 0.0102 | under | `resource` 34.5% (733) `http` 29.9% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 2.4% | `computer_science` | 0.0051 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 2.1% | `mathematics` | 0.0571 | 0.0257 | **over** | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |

### `tika-langdetect/tika-langdetect-lingo24/src/main/java`

**37.4%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of -3.9 points, and 624 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-lingo24/src/test/java`

**75.3%** of the maximum divergence from the repository, against a null median of 41.4% over 999 resamples of the same size — an excess of +33.9 points, and 69 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/main/java`

**53.8%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of +13.3 points, and 260 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/test/java`

**80.7%** of the maximum divergence from the repository, against a null median of 40.1% over 999 resamples of the same size — an excess of +40.6 points, and 36 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/main/java`

**27.6%** of the maximum divergence from the repository, against a null median of 28.0% over 999 resamples of the same size — an excess of -0.4 points, and 526 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/test/java`

**72.7%** of the maximum divergence from the repository, against a null median of 40.9% over 999 resamples of the same size — an excess of +31.8 points, and 69 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/main/java`

**33.1%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of +0.0 points, and 497 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/test/java`

**61.7%** of the maximum divergence from the repository, against a null median of 40.2% over 999 resamples of the same size — an excess of +21.5 points, and 172 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-test-commons/src/main/java`

**49.5%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of +8.9 points, and 316 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/main/java`

**29.2%** of the maximum divergence from the repository, against a null median of 28.2% over 999 resamples of the same size — an excess of +0.9 points, and 435 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/test/java`

**35.1%** of the maximum divergence from the repository, against a null median of 17.0% over 999 resamples of the same size — an excess of +18.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.0% | `networking` | 0.1339 | 0.0102 | **over** | `resource` 34.5% (733) `http` 29.9% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 8.6% | `number` | 0.0745 | 0.0027 | **over** | `value` 39.1% (1,845) `digit` 13.6% (83) `first` 11.6% (89) `nothing` 10.4% (125) |
| 5.7% | `linguistics` | 0.0118 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 5.6% | `computing` | 0.1662 | 0.3289 | under | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 4.5% | `publishing` | 0.0762 | 0.0156 | **over** | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 3.4% | `computer_science` | 0.0000 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 3.2% | `basketball` | 0.0236 | 0.0002 | **over** | `key` 37.6% (1,621) `three` 17.2% (63) `four` 7.8% (59) `drain` 6.8% (34) |
| 2.9% | `biology` | 0.0337 | 0.0035 | **over** | `emit` 63.7% (881) `bos` 5.9% (67) `reporter` 3.6% (105) `model` 2.8% (711) |

### `tika-ml/tika-ml-chardetect/src/main/java`

**21.7%** of the maximum divergence from the repository, against a null median of 19.9% over 999 resamples of the same size — an excess of +1.8 points, and 345 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-chardetect/src/test/java`

**60.5%** of the maximum divergence from the repository, against a null median of 40.6% over 999 resamples of the same size — an excess of +19.9 points, and 182 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/main/java`

**50.5%** of the maximum divergence from the repository, against a null median of 28.1% over 999 resamples of the same size — an excess of +22.4 points, and 16 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/test/java`

**58.6%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of +17.4 points, and 208 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/main/java`

**19.5%** of the maximum divergence from the repository, against a null median of 18.5% over 999 resamples of the same size — an excess of +1.0 points, and 396 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/test/java`

**23.8%** of the maximum divergence from the repository, against a null median of 24.3% over 999 resamples of the same size — an excess of -0.5 points, and 535 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/main/java`

**21.3%** of the maximum divergence from the repository, against a null median of 19.9% over 999 resamples of the same size — an excess of +1.4 points, and 392 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/test/java`

**23.1%** of the maximum divergence from the repository, against a null median of 17.2% over 999 resamples of the same size — an excess of +5.9 points, and 69 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/main/java`

**44.7%** of the maximum divergence from the repository, against a null median of 42.6% over 999 resamples of the same size — an excess of +2.2 points, and 441 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/test/java`

**43.3%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of +9.8 points, and 171 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/main/java`

**26.4%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of -6.4 points, and 794 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/java`

**32.7%** of the maximum divergence from the repository, against a null median of 32.9% over 999 resamples of the same size — an excess of -0.1 points, and 503 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/main/java`

**15.9%** of the maximum divergence from the repository, against a null median of 16.1% over 999 resamples of the same size — an excess of -0.2 points, and 529 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/java`

**26.4%** of the maximum divergence from the repository, against a null median of 18.9% over 999 resamples of the same size — an excess of +7.6 points, and 56 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/java`

**55.0%** of the maximum divergence from the repository, against a null median of 41.8% over 999 resamples of the same size — an excess of +13.2 points, and 265 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/main/java`

**24.1%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +3.7 points, and 191 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/java`

**29.2%** of the maximum divergence from the repository, against a null median of 41.6% over 999 resamples of the same size — an excess of -12.4 points, and 860 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/java`

**23.3%** of the maximum divergence from the repository, against a null median of 28.0% over 999 resamples of the same size — an excess of -4.8 points, and 760 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-inference/src/main/java`

**22.6%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +10.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.7% | `travel-industry` | 0.0514 | 0.0004 | **over** | `locator` 99.8% (61) `osi` 0.1% (3) `pseudo` 0.1% (8) `fit` 0.0% (29) |
| 9.4% | `linguistics` | 0.0106 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 8.1% | `tennis` | 0.0772 | 0.0130 | **over** | `get` 98.2% (4,191) `return` 0.8% (1,431) `server` 0.3% (669) `single` 0.3% (447) |
| 5.7% | `publishing` | 0.0688 | 0.0156 | **over** | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 5.5% | `buildings` | 0.0540 | 0.0094 | **over** | `log` 23.8% (484) `window` 20.8% (349) `tear_down` 18.5% (48) `machine` 8.7% (38) |
| 4.2% | `industry` | 0.0001 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 3.4% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.9% | `programming` | 0.0171 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |

### `tika-parsers/tika-parsers-ml/tika-inference/src/test/java`

**27.6%** of the maximum divergence from the repository, against a null median of 20.0% over 999 resamples of the same size — an excess of +7.6 points, and 74 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java`

**12.8%** of the maximum divergence from the repository, against a null median of 8.7% over 999 resamples of the same size — an excess of +4.1 points, and 8 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/java`

**22.7%** of the maximum divergence from the repository, against a null median of 20.1% over 999 resamples of the same size — an excess of +2.7 points, and 295 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/main/java`

**27.2%** of the maximum divergence from the repository, against a null median of 33.0% over 999 resamples of the same size — an excess of -5.7 points, and 746 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/java`

**22.5%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of -2.7 points, and 663 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/main/java`

**32.0%** of the maximum divergence from the repository, against a null median of 31.9% over 999 resamples of the same size — an excess of +0.2 points, and 497 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/java`

**66.1%** of the maximum divergence from the repository, against a null median of 41.4% over 999 resamples of the same size — an excess of +24.7 points, and 115 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/main/java`

**17.5%** of the maximum divergence from the repository, against a null median of 20.1% over 999 resamples of the same size — an excess of -2.6 points, and 736 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/test/java`

**30.1%** of the maximum divergence from the repository, against a null median of 21.9% over 999 resamples of the same size — an excess of +8.2 points, and 81 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java`

**11.7%** of the maximum divergence from the repository, against a null median of 3.7% over 999 resamples of the same size — an excess of +8.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.4% | `computing` | 0.5038 | 0.3289 | **over** | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 7.7% | `mathematics` | 0.0018 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 5.8% | `electrotechnology` | 0.0498 | 0.0156 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.3% | `industry` | 0.0501 | 0.0196 | **over** | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 4.1% | `law` | 0.0061 | 0.0258 | under | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |
| 3.7% | `tennis` | 0.0010 | 0.0130 | under | `get` 98.2% (4,191) `return` 0.8% (1,431) `server` 0.3% (669) `single` 0.3% (447) |
| 3.5% | `linguistics` | 0.0423 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 3.3% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/main/java`

**14.2%** of the maximum divergence from the repository, against a null median of 14.3% over 999 resamples of the same size — an excess of -0.0 points, and 505 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/java`

**25.7%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +5.5 points, and 135 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/main/java`

**14.6%** of the maximum divergence from the repository, against a null median of 7.0% over 999 resamples of the same size — an excess of +7.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.2% | `music` | 0.0545 | 0.0058 | **over** | `ti` 21.3% (1,144) `label` 5.1% (356) `album` 4.8% (30) `arr` 4.6% (36) |
| 7.1% | `tennis` | 0.0559 | 0.0130 | **over** | `get` 98.2% (4,191) `return` 0.8% (1,431) `server` 0.3% (669) `single` 0.3% (447) |
| 6.9% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 4.5% | `art` | 0.0202 | 0.0018 | **over** | `flag` 51.6% (263) `artist` 13.5% (29) `write` 10.4% (844) `key` 4.4% (1,621) |
| 4.4% | `computer-graphics` | 0.0326 | 0.0071 | **over** | `renderer` 29.9% (54) `instance` 22.4% (572) `mpeg` 9.5% (48) `jpeg` 8.8% (49) |
| 3.9% | `industry` | 0.0023 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 3.7% | `programming` | 0.0986 | 0.0516 | **over** | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 3.1% | `acoustics` | 0.0102 | 0.0002 | **over** | `audio` 96.7% (158) `sound` 1.8% (3) `static` 0.9% (4) `noisiness` 0.5% (1) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/java`

**18.8%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +6.9 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.0% | `linguistics` | 0.0153 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 6.7% | `industry` | 0.0752 | 0.0196 | **over** | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 6.3% | `computing` | 0.4933 | 0.3289 | **over** | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 4.1% | `telecommunication` | 0.0015 | 0.0220 | under | `file` 38.6% (3,475) `entry` 21.4% (811) `medium` 7.5% (438) `record` 4.0% (161) |
| 3.9% | `medicine` | 0.0006 | 0.0178 | under | `uri` 43.6% (334) `type` 11.5% (3,459) `start` 5.7% (1,211) `tmp` 4.9% (331) |
| 3.8% | `computer-languages` | 0.0013 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 3.3% | `person` | 0.0006 | 0.0155 | under | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |
| 3.0% | `publishing` | 0.0010 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/main/java`

**19.6%** of the maximum divergence from the repository, against a null median of 17.3% over 999 resamples of the same size — an excess of +2.2 points, and 277 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/java`

**32.1%** of the maximum divergence from the repository, against a null median of 25.1% over 999 resamples of the same size — an excess of +6.9 points, and 127 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/main/java`

**14.2%** of the maximum divergence from the repository, against a null median of 18.8% over 999 resamples of the same size — an excess of -4.6 points, and 927 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/java`

**31.0%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +10.7 points, and 24 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/main/java`

**22.6%** of the maximum divergence from the repository, against a null median of 24.2% over 999 resamples of the same size — an excess of -1.6 points, and 622 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/java`

**36.0%** of the maximum divergence from the repository, against a null median of 22.3% over 999 resamples of the same size — an excess of +13.7 points, and 22 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/main/java`

**39.0%** of the maximum divergence from the repository, against a null median of 27.8% over 999 resamples of the same size — an excess of +11.1 points, and 96 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/test/java`

**79.6%** of the maximum divergence from the repository, against a null median of 41.6% over 999 resamples of the same size — an excess of +38.0 points, and 36 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-digest-commons/src/main/java`

**50.7%** of the maximum divergence from the repository, against a null median of 23.9% over 999 resamples of the same size — an excess of +26.8 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.6% | `mathematics` | 0.2688 | 0.0257 | **over** | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 15.1% | `publishing` | 0.2202 | 0.0156 | **over** | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 9.2% | `engineering` | 0.1057 | 0.0020 | **over** | `datum` 47.9% (1,926) `encoder` 21.5% (16) `generator` 16.3% (42) `mill` 4.4% (349) |
| 6.6% | `computing` | 0.1267 | 0.3289 | under | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 4.4% | `linguistics` | 0.0098 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 2.7% | `computer_science` | 0.0877 | 0.0243 | **over** | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 2.6% | `buildings` | 0.0560 | 0.0094 | **over** | `log` 23.8% (484) `window` 20.8% (349) `tear_down` 18.5% (48) `machine` 8.7% (38) |
| 2.2% | `law` | 0.0005 | 0.0258 | under | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/main/java`

**23.5%** of the maximum divergence from the repository, against a null median of 32.6% over 999 resamples of the same size — an excess of -9.2 points, and 890 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/java`

**32.4%** of the maximum divergence from the repository, against a null median of 40.9% over 999 resamples of the same size — an excess of -8.5 points, and 771 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java`

**28.7%** of the maximum divergence from the repository, against a null median of 20.2% over 999 resamples of the same size — an excess of +8.5 points, and 54 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/java`

**22.5%** of the maximum divergence from the repository, against a null median of 32.4% over 999 resamples of the same size — an excess of -9.8 points, and 915 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/main/java`

**12.4%** of the maximum divergence from the repository, against a null median of 11.3% over 999 resamples of the same size — an excess of +1.1 points, and 288 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/java`

**27.0%** of the maximum divergence from the repository, against a null median of 13.8% over 999 resamples of the same size — an excess of +13.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.3% | `computing` | 0.7116 | 0.3289 | **over** | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 14.1% | `linguistics` | 0.0004 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 4.1% | `programming` | 0.0101 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 3.7% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 3.7% | `mathematics` | 0.0012 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 2.9% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.5% | `law` | 0.0037 | 0.0258 | under | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |
| 2.4% | `person` | 0.0004 | 0.0155 | under | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-jdbc-commons/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 32.3% over 999 resamples of the same size — an excess of -8.1 points, and 877 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java`

**27.2%** of the maximum divergence from the repository, against a null median of 33.2% over 999 resamples of the same size — an excess of -5.9 points, and 779 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/test/java`

**32.0%** of the maximum divergence from the repository, against a null median of 32.7% over 999 resamples of the same size — an excess of -0.7 points, and 522 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/main/java`

**16.3%** of the maximum divergence from the repository, against a null median of 27.9% over 999 resamples of the same size — an excess of -11.6 points, and 989 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/java`

**26.4%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of -6.1 points, and 776 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java`

**7.6%** of the maximum divergence from the repository, against a null median of 1.1% over 999 resamples of the same size — an excess of +6.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.6% | `computer-languages` | 0.0004 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 9.8% | `electrotechnology` | 0.0001 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 5.6% | `electronics` | 0.0016 | 0.0143 | under | `emitter` 55.8% (560) `ti` 11.7% (1,144) `input` 11.3% (1,030) `default` 2.2% (1,615) |
| 5.4% | `computer_science` | 0.0536 | 0.0243 | **over** | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 5.3% | `industry` | 0.0041 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 5.1% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.2% | `metrology` | 0.0206 | 0.0058 | **over** | `array` 29.1% (804) `entropy` 13.8% (90) `rate` 7.5% (140) `measurement` 6.1% (13) |
| 3.4% | `mathematics` | 0.0484 | 0.0257 | **over** | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/java`

**14.3%** of the maximum divergence from the repository, against a null median of 4.9% over 999 resamples of the same size — an excess of +9.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.6% | `industry` | 0.0987 | 0.0196 | **over** | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 7.5% | `aviation` | 0.0374 | 0.0044 | **over** | `rtf` 39.8% (105) `max` 35.6% (1,140) `threshold` 5.3% (186) `fis` 3.0% (5) |
| 5.8% | `linguistics` | 0.0298 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 5.1% | `literature` | 0.0584 | 0.0196 | **over** | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 4.0% | `medicine` | 0.0016 | 0.0178 | under | `uri` 43.6% (334) `type` 11.5% (3,459) `start` 5.7% (1,211) `tmp` 4.9% (331) |
| 3.6% | `person` | 0.0012 | 0.0155 | under | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |
| 2.8% | `algebra` | 0.0306 | 0.0100 | **over** | `content` 77.3% (2,501) `unknown` 7.6% (275) `normalizer` 4.3% (16) `index` 3.7% (909) |
| 2.7% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/main/java`

**9.5%** of the maximum divergence from the repository, against a null median of 6.1% over 999 resamples of the same size — an excess of +3.5 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 6.6% | `computer-languages` | 0.0020 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 6.2% | `linguistics` | 0.1383 | 0.0790 | **over** | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 5.7% | `arithmetic` | 0.0188 | 0.0022 | **over** | `extract` 93.4% (1,065) `integer` 2.6% (148) `position` 0.6% (250) `subtract` 0.5% (15) |
| 4.8% | `electrotechnology` | 0.0017 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.2% | `medicine` | 0.0434 | 0.0178 | **over** | `uri` 43.6% (334) `type` 11.5% (3,459) `start` 5.7% (1,211) `tmp` 4.9% (331) |
| 4.1% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.9% | `programming` | 0.0893 | 0.0516 | **over** | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 3.8% | `law` | 0.0079 | 0.0258 | under | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/java`

**25.4%** of the maximum divergence from the repository, against a null median of 13.6% over 999 resamples of the same size — an excess of +11.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.9% | `computer-languages` | 0.1739 | 0.0201 | **over** | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 12.5% | `industry` | 0.1267 | 0.0196 | **over** | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 7.5% | `linguistics` | 0.0129 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 4.1% | `telecommunication` | 0.0002 | 0.0220 | under | `file` 38.6% (3,475) `entry` 21.4% (811) `medium` 7.5% (438) `record` 4.0% (161) |
| 4.0% | `algebra` | 0.0488 | 0.0100 | **over** | `content` 77.3% (2,501) `unknown` 7.6% (275) `normalizer` 4.3% (16) `index` 3.7% (909) |
| 3.1% | `mathematics` | 0.0026 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 3.0% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.1% | `medicine` | 0.0020 | 0.0178 | under | `uri` 43.6% (334) `type` 11.5% (3,459) `start` 5.7% (1,211) `tmp` 4.9% (331) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/main/java`

**18.2%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of -14.3 points, and 994 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/java`

**30.4%** of the maximum divergence from the repository, against a null median of 41.6% over 999 resamples of the same size — an excess of -11.2 points, and 834 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/main/java`

**22.7%** of the maximum divergence from the repository, against a null median of 21.9% over 999 resamples of the same size — an excess of +0.8 points, and 444 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/java`

**29.3%** of the maximum divergence from the repository, against a null median of 33.7% over 999 resamples of the same size — an excess of -4.4 points, and 693 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/main/java`

**19.3%** of the maximum divergence from the repository, against a null median of 8.6% over 999 resamples of the same size — an excess of +10.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.8% | `publishing` | 0.0947 | 0.0156 | **over** | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 9.3% | `computer-graphics` | 0.0620 | 0.0071 | **over** | `renderer` 29.9% (54) `instance` 22.4% (572) `mpeg` 9.5% (48) `jpeg` 8.8% (49) |
| 5.2% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 4.7% | `software` | 0.0308 | 0.0034 | **over** | `shift_jis` 13.3% (59) `pdf` 12.7% (153) `excel` 9.9% (98) `factory_class` 9.8% (20) |
| 4.5% | `information-science` | 0.0246 | 0.0017 | **over** | `document` 96.2% (1,456) `align` 2.4% (54) `controlled_vocabulary` 0.5% (14) `keyword` 0.4% (7) |
| 4.0% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.9% | `statistics` | 0.0237 | 0.0022 | **over** | `sigma` 18.1% (49) `ignorable` 18.1% (31) `histogram` 6.7% (22) `class` 6.1% (1,450) |
| 3.5% | `furniture` | 0.0171 | 0.0007 | **over** | `counter` 88.9% (74) `drawer` 7.3% (12) `phone` 1.7% (29) `settle` 0.9% (1) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java`

**24.5%** of the maximum divergence from the repository, against a null median of 18.8% over 999 resamples of the same size — an excess of +5.7 points, and 94 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/main/java`

**18.5%** of the maximum divergence from the repository, against a null median of 15.1% over 999 resamples of the same size — an excess of +3.3 points, and 164 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/java`

**18.0%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +6.1 points, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/main/java`

**15.2%** of the maximum divergence from the repository, against a null median of 14.3% over 999 resamples of the same size — an excess of +0.9 points, and 368 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/java`

**22.5%** of the maximum divergence from the repository, against a null median of 18.6% over 999 resamples of the same size — an excess of +4.0 points, and 161 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/main/java`

**22.5%** of the maximum divergence from the repository, against a null median of 27.5% over 999 resamples of the same size — an excess of -5.0 points, and 804 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/java`

**39.6%** of the maximum divergence from the repository, against a null median of 28.6% over 999 resamples of the same size — an excess of +11.1 points, and 103 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java`

**22.5%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +10.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.3% | `medicine` | 0.1457 | 0.0178 | **over** | `uri` 43.6% (334) `type` 11.5% (3,459) `start` 5.7% (1,211) `tmp` 4.9% (331) |
| 5.1% | `programming` | 0.1259 | 0.0516 | **over** | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 4.2% | `law` | 0.0014 | 0.0258 | under | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |
| 3.9% | `industry` | 0.0003 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 3.7% | `computing` | 0.4636 | 0.3289 | **over** | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 3.5% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.4% | `person` | 0.0000 | 0.0155 | under | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |
| 3.3% | `linguistics` | 0.1469 | 0.0790 | **over** | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/java`

**29.7%** of the maximum divergence from the repository, against a null median of 18.4% over 999 resamples of the same size — an excess of +11.2 points, and 14 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/main/java`

**23.9%** of the maximum divergence from the repository, against a null median of 22.3% over 999 resamples of the same size — an excess of +1.6 points, and 370 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/java`

**43.5%** of the maximum divergence from the repository, against a null median of 28.4% over 999 resamples of the same size — an excess of +15.1 points, and 44 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java`

**20.9%** of the maximum divergence from the repository, against a null median of 11.4% over 999 resamples of the same size — an excess of +9.5 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.4% | `linguistics` | 0.2449 | 0.0790 | **over** | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 6.4% | `furniture` | 0.0310 | 0.0007 | **over** | `counter` 88.9% (74) `drawer` 7.3% (12) `phone` 1.7% (29) `settle` 0.9% (1) |
| 4.8% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 4.7% | `literature` | 0.0000 | 0.0196 | under | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 4.2% | `computer_science` | 0.0015 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 3.8% | `industry` | 0.0007 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 3.6% | `person` | 0.0000 | 0.0155 | under | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |
| 3.5% | `telecommunication` | 0.0628 | 0.0220 | **over** | `file` 38.6% (3,475) `entry` 21.4% (811) `medium` 7.5% (438) `record` 4.0% (161) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/java`

**39.0%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of +6.5 points, and 266 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/main/java`

**18.4%** of the maximum divergence from the repository, against a null median of 21.9% over 999 resamples of the same size — an excess of -3.6 points, and 790 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/test/java`

**30.8%** of the maximum divergence from the repository, against a null median of 24.7% over 999 resamples of the same size — an excess of +6.1 points, and 186 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-httpclient-commons/src/main/java`

**49.3%** of the maximum divergence from the repository, against a null median of 28.6% over 999 resamples of the same size — an excess of +20.7 points, and 18 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-api/src/main/java`

**26.7%** of the maximum divergence from the repository, against a null median of 9.3% over 999 resamples of the same size — an excess of +17.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 11.5% | `biology` | 0.0786 | 0.0035 | **over** | `emit` 63.7% (881) `bos` 5.9% (67) `reporter` 3.6% (105) `model` 2.8% (711) |
| 9.5% | `electronics` | 0.0981 | 0.0143 | **over** | `emitter` 55.8% (560) `ti` 11.7% (1,144) `input` 11.3% (1,030) `default` 2.2% (1,615) |
| 7.6% | `hydraulics` | 0.0690 | 0.0078 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.4% | `glassblowing` | 0.0263 | 0.0005 | **over** | `found` 98.2% (293) `step` 1.0% (48) `web` 0.6% (61) `way` 0.2% (91) |
| 3.8% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 3.7% | `literature` | 0.0000 | 0.0196 | under | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 3.4% | `programming` | 0.1155 | 0.0516 | **over** | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 3.0% | `mathematics` | 0.0707 | 0.0257 | **over** | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |

### `tika-pipes/tika-pipes-config-store-ignite/src/main/java`

**32.1%** of the maximum divergence from the repository, against a null median of 22.1% over 999 resamples of the same size — an excess of +10.1 points, and 56 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-config-store-ignite/src/test/java`

**48.2%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of +7.0 points, and 354 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-core/src/main/java`

**10.8%** of the maximum divergence from the repository, against a null median of 3.9% over 999 resamples of the same size — an excess of +6.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.3% | `electronics` | 0.0605 | 0.0143 | **over** | `emitter` 55.8% (560) `ti` 11.7% (1,144) `input` 11.3% (1,030) `default` 2.2% (1,615) |
| 9.2% | `biology` | 0.0330 | 0.0035 | **over** | `emit` 63.7% (881) `bos` 5.9% (67) `reporter` 3.6% (105) `model` 2.8% (711) |
| 7.3% | `hydraulics` | 0.0382 | 0.0078 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 5.1% | `linguistics` | 0.0372 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 4.9% | `industry` | 0.0027 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 4.7% | `publishing` | 0.0014 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 3.1% | `electrotechnology` | 0.0029 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.0% | `geography` | 0.0015 | 0.0117 | under | `stream` 24.0% (1,670) `apache` 7.8% (6,823) `state` 7.2% (273) `time_zone` 2.9% (26) |

### `tika-pipes/tika-pipes-core/src/test/java`

**15.6%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +3.7 points, and 61 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/main/java`

**23.5%** of the maximum divergence from the repository, against a null median of 24.6% over 999 resamples of the same size — an excess of -1.1 points, and 590 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/test/java`

**34.0%** of the maximum divergence from the repository, against a null median of 41.6% over 999 resamples of the same size — an excess of -7.6 points, and 732 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-integration-tests/src/test/java`

**15.7%** of the maximum divergence from the repository, against a null median of 9.0% over 999 resamples of the same size — an excess of +6.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.9% | `hydraulics` | 0.0908 | 0.0078 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 6.2% | `computing` | 0.4755 | 0.3289 | **over** | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 5.7% | `literature` | 0.0002 | 0.0196 | under | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 4.3% | `publishing` | 0.0004 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 3.6% | `geography` | 0.0001 | 0.0117 | under | `stream` 24.0% (1,670) `apache` 7.8% (6,823) `state` 7.2% (273) `time_zone` 2.9% (26) |
| 2.8% | `computer_science` | 0.0058 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 2.5% | `grammar` | 0.0002 | 0.0091 | under | `num` 60.9% (476) `clause` 8.0% (33) `modify` 5.1% (123) `number` 5.0% (737) |
| 2.3% | `person` | 0.0027 | 0.0155 | under | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |

### `tika-pipes/tika-pipes-iterator-commons/src/main/java`

**47.1%** of the maximum divergence from the repository, against a null median of 33.1% over 999 resamples of the same size — an excess of +14.0 points, and 124 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java`

**23.6%** of the maximum divergence from the repository, against a null median of 20.3% over 999 resamples of the same size — an excess of +3.3 points, and 261 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/java`

**46.4%** of the maximum divergence from the repository, against a null median of 41.2% over 999 resamples of the same size — an excess of +5.2 points, and 383 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/main/java`

**24.1%** of the maximum divergence from the repository, against a null median of 15.2% over 999 resamples of the same size — an excess of +8.9 points, and 11 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/java`

**32.5%** of the maximum divergence from the repository, against a null median of 24.8% over 999 resamples of the same size — an excess of +7.7 points, and 125 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/main/java`

**30.3%** of the maximum divergence from the repository, against a null median of 24.9% over 999 resamples of the same size — an excess of +5.4 points, and 177 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 33.0% over 999 resamples of the same size — an excess of -7.7 points, and 847 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/main/java`

**21.7%** of the maximum divergence from the repository, against a null median of 15.0% over 999 resamples of the same size — an excess of +6.6 points, and 33 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/java`

**40.0%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of +6.5 points, and 284 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/main/java`

**21.1%** of the maximum divergence from the repository, against a null median of 12.0% over 999 resamples of the same size — an excess of +9.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.4% | `time_period` | 0.0643 | 0.0104 | **over** | `extension` 43.6% (474) `future` 12.3% (90) `current` 9.1% (269) `duration` 5.8% (76) |
| 6.9% | `electronics` | 0.0701 | 0.0143 | **over** | `emitter` 55.8% (560) `ti` 11.7% (1,144) `input` 11.3% (1,030) `default` 2.2% (1,615) |
| 6.8% | `computer-languages` | 0.0818 | 0.0201 | **over** | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 5.6% | `computer_science` | 0.0001 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 4.0% | `hydraulics` | 0.0395 | 0.0078 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.7% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.0% | `publishing` | 0.0006 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 2.9% | `sociology` | 0.0220 | 0.0028 | **over** | `status` 59.1% (290) `priority` 6.7% (33) `class` 6.2% (1,451) `common` 6.0% (248) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/java`

**24.9%** of the maximum divergence from the repository, against a null median of 18.8% over 999 resamples of the same size — an excess of +6.1 points, and 92 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/main/java`

**26.2%** of the maximum divergence from the repository, against a null median of 15.3% over 999 resamples of the same size — an excess of +10.9 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.6% | `electronics` | 0.0975 | 0.0143 | **over** | `emitter` 55.8% (560) `ti` 11.7% (1,144) `input` 11.3% (1,030) `default` 2.2% (1,615) |
| 8.8% | `time_period` | 0.0825 | 0.0104 | **over** | `extension` 43.6% (474) `future` 12.3% (90) `current` 9.1% (269) `duration` 5.8% (76) |
| 7.5% | `mechanics` | 0.0502 | 0.0022 | **over** | `bucket` 54.8% (377) `override` 23.6% (147) `throttle` 10.7% (23) `restart` 4.4% (103) |
| 5.6% | `hydraulics` | 0.0558 | 0.0078 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.3% | `computer-hardware` | 0.0193 | 0.0003 | **over** | `storage` 88.2% (140) `cpu` 5.9% (31) `ram` 4.0% (99) `device` 1.0% (11) |
| 3.0% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.8% | `publishing` | 0.0001 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 2.7% | `computer_science` | 0.0028 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/java`

**25.3%** of the maximum divergence from the repository, against a null median of 24.7% over 999 resamples of the same size — an excess of +0.6 points, and 462 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/main/java`

**27.5%** of the maximum divergence from the repository, against a null median of 24.6% over 999 resamples of the same size — an excess of +2.9 points, and 330 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/java`

**44.4%** of the maximum divergence from the repository, against a null median of 41.4% over 999 resamples of the same size — an excess of +3.0 points, and 423 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/main/java`

**33.3%** of the maximum divergence from the repository, against a null median of 16.2% over 999 resamples of the same size — an excess of +17.1 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.9% | `exchange` | 0.1323 | 0.0008 | **over** | `issuer` 86.3% (17) `stock` 10.6% (22) `option` 2.2% (129) `put` 0.8% (13) |
| 12.8% | `cryptography` | 0.1063 | 0.0040 | **over** | `encrypt` 19.2% (97) `private_key` 14.9% (25) `md5` 14.6% (21) `password` 14.3% (182) |
| 8.0% | `networking` | 0.0911 | 0.0102 | **over** | `resource` 34.5% (733) `http` 29.9% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 5.8% | `programming` | 0.0028 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 3.9% | `literature` | 0.0761 | 0.0196 | **over** | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 2.6% | `industry` | 0.0003 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 2.3% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.3% | `publishing` | 0.0001 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/java`

**34.2%** of the maximum divergence from the repository, against a null median of 24.8% over 999 resamples of the same size — an excess of +9.4 points, and 79 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/main/java`

**22.3%** of the maximum divergence from the repository, against a null median of 15.2% over 999 resamples of the same size — an excess of +7.1 points, and 19 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/java`

**23.1%** of the maximum divergence from the repository, against a null median of 24.5% over 999 resamples of the same size — an excess of -1.5 points, and 601 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/main/java`

**37.1%** of the maximum divergence from the repository, against a null median of 24.6% over 999 resamples of the same size — an excess of +12.5 points, and 42 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/java`

**36.0%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of +3.2 points, and 382 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/main/java`

**22.4%** of the maximum divergence from the repository, against a null median of 18.9% over 999 resamples of the same size — an excess of +3.6 points, and 210 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/java`

**35.1%** of the maximum divergence from the repository, against a null median of 32.3% over 999 resamples of the same size — an excess of +2.8 points, and 397 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/main/java`

**35.9%** of the maximum divergence from the repository, against a null median of 17.3% over 999 resamples of the same size — an excess of +18.6 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 29.2% | `law` | 0.3157 | 0.0258 | **over** | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |
| 4.2% | `mechanics` | 0.0402 | 0.0022 | **over** | `bucket` 54.8% (377) `override` 23.6% (147) `throttle` 10.7% (23) `restart` 4.4% (103) |
| 3.7% | `town_planning` | 0.0295 | 0.0005 | **over** | `store` 33.1% (443) `current` 24.0% (74) `archive` 14.7% (76) `tenant` 10.5% (18) |
| 3.6% | `mathematics` | 0.0000 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 3.2% | `programming` | 0.0094 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 2.7% | `literature` | 0.0000 | 0.0196 | under | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 2.4% | `industry` | 0.0004 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 2.2% | `publishing` | 0.0000 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/java`

**32.8%** of the maximum divergence from the repository, against a null median of 32.5% over 999 resamples of the same size — an excess of +0.3 points, and 487 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/main/java`

**26.0%** of the maximum divergence from the repository, against a null median of 12.9% over 999 resamples of the same size — an excess of +13.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.4% | `computer-languages` | 0.1548 | 0.0201 | **over** | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 8.0% | `person` | 0.0894 | 0.0155 | **over** | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |
| 6.8% | `sociology` | 0.0481 | 0.0028 | **over** | `status` 59.1% (290) `priority` 6.7% (33) `class` 6.2% (1,451) `common` 6.0% (248) |
| 6.0% | `plants` | 0.0554 | 0.0069 | **over** | `root` 50.3% (457) `log` 30.1% (484) `stub` 4.7% (81) `complete` 3.6% (142) |
| 3.0% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.0% | `programming` | 0.0149 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 2.8% | `publishing` | 0.0002 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 2.6% | `time_period` | 0.0402 | 0.0104 | **over** | `extension` 43.6% (474) `future` 12.3% (90) `current` 9.1% (269) `duration` 5.8% (76) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/java`

**45.2%** of the maximum divergence from the repository, against a null median of 32.8% over 999 resamples of the same size — an excess of +12.3 points, and 147 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/main/java`

**20.7%** of the maximum divergence from the repository, against a null median of 15.3% over 999 resamples of the same size — an excess of +5.4 points, and 67 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/java`

**28.7%** of the maximum divergence from the repository, against a null median of 27.8% over 999 resamples of the same size — an excess of +0.9 points, and 451 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/main/java`

**28.9%** of the maximum divergence from the repository, against a null median of 17.5% over 999 resamples of the same size — an excess of +11.4 points, and 10 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/java`

**26.6%** of the maximum divergence from the repository, against a null median of 27.9% over 999 resamples of the same size — an excess of -1.4 points, and 571 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-reporter-commons/src/main/java`

**61.5%** of the maximum divergence from the repository, against a null median of 40.9% over 999 resamples of the same size — an excess of +20.7 points, and 178 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-plugins-core/src/main/java`

**35.2%** of the maximum divergence from the repository, against a null median of 18.4% over 999 resamples of the same size — an excess of +16.7 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 42.0% | `time_period` | 0.3529 | 0.0104 | **over** | `extension` 43.6% (474) `future` 12.3% (90) `current` 9.1% (269) `duration` 5.8% (76) |
| 4.1% | `plants` | 0.0530 | 0.0069 | **over** | `root` 50.3% (457) `log` 30.1% (484) `stub` 4.7% (81) `complete` 3.6% (142) |
| 3.4% | `computer_science` | 0.0000 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 2.8% | `literature` | 0.0000 | 0.0196 | under | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 2.3% | `computer-languages` | 0.0624 | 0.0201 | **over** | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 2.2% | `mathematics` | 0.0026 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 2.2% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.0% | `software` | 0.0255 | 0.0034 | **over** | `shift_jis` 13.3% (59) `pdf` 12.7% (153) `excel` 9.9% (98) `factory_class` 9.8% (20) |

### `tika-plugins-core/src/test/java`

**33.0%** of the maximum divergence from the repository, against a null median of 27.5% over 999 resamples of the same size — an excess of +5.4 points, and 234 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/main/java`

**14.3%** of the maximum divergence from the repository, against a null median of 6.8% over 999 resamples of the same size — an excess of +7.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.8% | `graph-theory` | 0.0563 | 0.0021 | **over** | `component` 81.7% (597) `node` 6.7% (597) `size` 4.8% (781) `path` 2.6% (1,666) |
| 5.3% | `industry` | 0.0009 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 4.1% | `electrotechnology` | 0.0465 | 0.0156 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.7% | `psychology` | 0.0197 | 0.0027 | **over** | `confidence` 44.8% (226) `module` 20.7% (100) `self` 9.0% (49) `matter` 4.0% (59) |
| 3.4% | `computer-languages` | 0.0502 | 0.0201 | **over** | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 3.1% | `time_period` | 0.0003 | 0.0104 | under | `extension` 43.6% (474) `future` 12.3% (90) `current` 9.1% (269) `duration` 5.8% (76) |
| 3.0% | `medicine` | 0.0029 | 0.0178 | under | `uri` 43.6% (334) `type` 11.5% (3,459) `start` 5.7% (1,211) `tmp` 4.9% (331) |
| 2.7% | `literature` | 0.0042 | 0.0196 | under | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |

### `tika-serialization/src/test/java`

**13.1%** of the maximum divergence from the repository, against a null median of 6.7% over 999 resamples of the same size — an excess of +6.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.6% | `computer-languages` | 0.0917 | 0.0201 | **over** | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 5.5% | `publishing` | 0.0002 | 0.0156 | under | `table` 32.7% (856) `page` 19.2% (554) `text` 14.1% (2,092) `read` 6.1% (277) |
| 5.2% | `computing` | 0.4495 | 0.3289 | **over** | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 3.6% | `time_period` | 0.0001 | 0.0104 | under | `extension` 43.6% (474) `future` 12.3% (90) `current` 9.1% (269) `duration` 5.8% (76) |
| 2.9% | `hydraulics` | 0.0000 | 0.0078 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 2.8% | `networking` | 0.0007 | 0.0102 | under | `resource` 34.5% (733) `http` 29.9% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 2.3% | `electrotechnology` | 0.0034 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.2% | `grammar` | 0.0009 | 0.0091 | under | `num` 60.9% (476) `clause` 8.0% (33) `modify` 5.1% (123) `number` 5.0% (737) |

### `tika-server/tika-server-core/src/main/java`

**18.8%** of the maximum divergence from the repository, against a null median of 5.8% over 999 resamples of the same size — an excess of +13.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.7% | `networking` | 0.1105 | 0.0102 | **over** | `resource` 34.5% (733) `http` 29.9% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 13.9% | `commerce` | 0.0737 | 0.0049 | **over** | `server` 67.4% (669) `packet` 12.4% (73) `quote` 5.6% (66) `package` 5.2% (206) |
| 7.4% | `literature` | 0.0791 | 0.0196 | **over** | `header` 42.3% (1,036) `writer` 17.0% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 3.5% | `computer-languages` | 0.0017 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 3.3% | `programming` | 0.0178 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 3.2% | `sociology` | 0.0217 | 0.0028 | **over** | `status` 59.1% (290) `priority` 6.7% (33) `class` 6.2% (1,451) `common` 6.0% (248) |
| 3.1% | `industry` | 0.0021 | 0.0196 | under | `test` 78.2% (3,756) `extractor` 6.8% (394) `string` 5.0% (130) `factory` 2.4% (525) |
| 2.6% | `mathematics` | 0.0059 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |

### `tika-server/tika-server-core/src/test/java`

**15.0%** of the maximum divergence from the repository, against a null median of 8.1% over 999 resamples of the same size — an excess of +6.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.7% | `networking` | 0.0835 | 0.0102 | **over** | `resource` 34.5% (733) `http` 29.9% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 8.8% | `law` | 0.0887 | 0.0258 | **over** | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |
| 7.1% | `anatomy` | 0.0369 | 0.0042 | **over** | `body` 42.2% (406) `socket` 16.8% (139) `iter` 8.8% (11) `colon` 6.1% (23) |
| 6.1% | `linguistics` | 0.0280 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 5.1% | `electrotechnology` | 0.0000 | 0.0156 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 5.0% | `programming` | 0.0153 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 3.1% | `commerce` | 0.0231 | 0.0049 | **over** | `server` 67.4% (669) `packet` 12.4% (73) `quote` 5.6% (66) `package` 5.2% (206) |
| 2.6% | `grammar` | 0.0003 | 0.0091 | under | `num` 60.9% (476) `clause` 8.0% (33) `modify` 5.1% (123) `number` 5.0% (737) |

### `tika-server/tika-server-standard/src/main/java`

**30.5%** of the maximum divergence from the repository, against a null median of 32.1% over 999 resamples of the same size — an excess of -1.6 points, and 570 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-standard/src/test/java`

**20.4%** of the maximum divergence from the repository, against a null median of 11.4% over 999 resamples of the same size — an excess of +8.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `person` | 0.1063 | 0.0155 | **over** | `reader` 42.1% (376) `child` 11.4% (294) `mapper` 9.5% (309) `logger` 7.4% (39) |
| 10.1% | `networking` | 0.0765 | 0.0102 | **over** | `resource` 34.5% (733) `http` 29.9% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 7.8% | `programming` | 0.0052 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 6.8% | `computer-languages` | 0.0801 | 0.0201 | **over** | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 5.5% | `mathematics` | 0.0005 | 0.0257 | under | `count` 20.8% (925) `value` 9.3% (1,866) `from` 6.3% (292) `rel` 6.0% (66) |
| 4.0% | `linguistics` | 0.0302 | 0.0790 | under | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 2.4% | `time_period` | 0.0001 | 0.0104 | under | `extension` 43.6% (474) `future` 12.3% (90) `current` 9.1% (269) `duration` 5.8% (76) |
| 2.2% | `grammar` | 0.0000 | 0.0091 | under | `num` 60.9% (476) `clause` 8.0% (33) `modify` 5.1% (123) `number` 5.0% (737) |

### `tika-translate/src/main/java`

**17.7%** of the maximum divergence from the repository, against a null median of 14.3% over 999 resamples of the same size — an excess of +3.3 points, and 144 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-translate/src/test/java`

**41.5%** of the maximum divergence from the repository, against a null median of 16.3% over 999 resamples of the same size — an excess of +25.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.2% | `botany` | 0.1541 | 0.0016 | **over** | `translator` 24.4% (126) `test` 13.6% (5,626) `key` 8.5% (1,621) `offset` 8.5% (444) |
| 13.9% | `linguistics` | 0.3240 | 0.0790 | **over** | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 10.8% | `software` | 0.1083 | 0.0034 | **over** | `shift_jis` 13.3% (59) `pdf` 12.7% (153) `excel` 9.9% (98) `factory_class` 9.8% (20) |
| 5.7% | `programming` | 0.0006 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 2.9% | `computer_science` | 0.0000 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |
| 2.6% | `law` | 0.0007 | 0.0258 | under | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |
| 2.4% | `computer-languages` | 0.0000 | 0.0201 | under | `json` 57.2% (831) `xml` 41.7% (418) `sql` 0.5% (36) `java` 0.3% (222) |
| 2.1% | `medicine` | 0.0000 | 0.0178 | under | `uri` 43.6% (334) `type` 11.5% (3,459) `start` 5.7% (1,211) `tmp` 4.9% (331) |

### `tika-xmp/src/main/java`

**22.9%** of the maximum divergence from the repository, against a null median of 15.3% over 999 resamples of the same size — an excess of +7.6 points, and 12 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-xmp/src/test/java`

**32.5%** of the maximum divergence from the repository, against a null median of 32.4% over 999 resamples of the same size — an excess of +0.1 points, and 495 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `documentation`

**31.8%** of the maximum divergence from the repository, against a null median of 17.7% over 999 resamples of the same size — an excess of +14.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.3% | `law` | 0.2230 | 0.0258 | **over** | `file` 18.1% (10,159) `client` 13.0% (715) `allow` 2.4% (362) `knowledge` 2.3% (40) |
| 14.7% | `geography` | 0.1414 | 0.0117 | **over** | `stream` 24.0% (1,670) `apache` 7.8% (6,823) `state` 7.2% (273) `time_zone` 2.9% (26) |
| 11.3% | `computing` | 0.1209 | 0.3289 | under | `metadata` 23.5% (4,114) `config` 11.7% (2,424) `parser` 5.6% (2,583) `byte` 3.3% (2,991) |
| 7.3% | `linguistics` | 0.2132 | 0.0790 | **over** | `name` 32.2% (3,790) `context` 19.9% (2,253) `parse` 6.1% (2,824) `prefix` 6.0% (600) |
| 4.0% | `physics` | 0.0421 | 0.0044 | **over** | `length` 59.0% (1,225) `weight` 12.5% (122) `free_space` 9.0% (26) `sql` 1.9% (36) |
| 3.0% | `programming` | 0.0119 | 0.0516 | under | `handler` 42.3% (1,912) `factory` 4.3% (525) `iterator` 3.2% (127) `tmp` 3.0% (331) |
| 2.0% | `tennis` | 0.0000 | 0.0130 | under | `get` 98.2% (4,191) `return` 0.8% (1,431) `server` 0.3% (669) `single` 0.3% (447) |
| 1.9% | `computer_science` | 0.0037 | 0.0243 | under | `parser` 21.2% (2,583) `byte` 21.0% (2,991) `url` 12.2% (460) `format` 9.7% (613) |

Read, compared and resampled in 65.8 s, recorded rather than estimated.
