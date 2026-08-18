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
| `computing` | 0.1129 | 50.0% | 70,347 | 1,165 | 249,640 | 65.7% | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| `linguistics` | 0.0265 | 57.6% | 30,257 | 178 | 27,779 | 7.3% | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |

Read over 2,156 files and 380,237 lines: 552 topics, 44 files no topic could be resolved for, and 65.7% of the repository's lines led by its single strongest topic. **ι is a share of everything the reading observed**, and the topics sum to 32.7% of it; the other 67.3% is mass no topic was settled on — a phrase nothing could place at all, or one the resources named so many subjects for that none of them was settled. The columns beside ι are counts and do not sum. **From names** is how much of a theme the code itself carried rather than its prose.

## What distinguishes each scope from the repository

**A scope is a source set** — one `<module>/src/<set>/java` directory — so a module with a main and a test source set is two scopes here, not one. The repository's own markdown is one scope more.

**Each is read against a null of its own, and that is what decides which of them is ranked.** Every source set differs from the repository somewhat, and a small one differs a great deal by accident, so a distance means nothing until it is read against the distances a random group of that many files reaches. A source set whose distance chance reaches is still read in full and still contributes to the repository's distribution; what it does not get is a ranking of its own topics, because that ranking would be of noise.

The two share columns below are shares of the mass a topic was settled on, where ι above is a share of everything that was observed. A comparison is between what each side was placed in: a scope nothing could be read in is not a scope about something else, and counting what went unplaced as part of a divergence would report illegibility as a subject.

### `tika-annotation-processor/src/main/java`

**36.1%** of the maximum divergence from the repository, against a null median of 29.3% over 999 resamples of the same size — an excess of +6.8 points, and 211 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-annotation-processor/src/test/java`

**70.6%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of +27.6 points, and 109 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/main/java`

**14.5%** of the maximum divergence from the repository, against a null median of 23.2% over 999 resamples of the same size — an excess of -8.7 points, and 980 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-app/src/test/java`

**26.2%** of the maximum divergence from the repository, against a null median of 26.0% over 999 resamples of the same size — an excess of +0.1 points, and 496 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/main/java`

**43.4%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of +0.7 points, and 489 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-bundles/tika-bundle-standard/src/test/java`

**41.2%** of the maximum divergence from the repository, against a null median of 43.8% over 999 resamples of the same size — an excess of -2.5 points, and 563 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-core/src/main/java`

**4.8%** of the maximum divergence from the repository, against a null median of 1.0% over 999 resamples of the same size — an excess of +3.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.2% | `industry` | 0.0022 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 10.3% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 9.8% | `computer-languages` | 0.0033 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 6.3% | `computer-graphics` | 0.0216 | 0.0066 | **over** | `instance` 30.6% (572) `mpeg` 12.3% (48) `jpeg` 11.3% (49) `renderer` 11.0% (22) |
| 4.0% | `commerce` | 0.0003 | 0.0053 | under | `server` 69.0% (669) `packet` 11.0% (73) `package` 6.2% (206) `quote` 5.0% (66) |
| 3.9% | `linguistics` | 0.1147 | 0.0826 | **over** | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 3.8% | `geography` | 0.0286 | 0.0140 | **over** | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |
| 3.0% | `plants` | 0.0013 | 0.0068 | under | `root` 51.5% (457) `log` 28.6% (484) `stub` 4.6% (81) `complete` 4.2% (148) |

### `tika-core/src/test/java`

**7.7%** of the maximum divergence from the repository, against a null median of 3.5% over 999 resamples of the same size — an excess of +4.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.0% | `industry` | 0.0749 | 0.0197 | **over** | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 11.0% | `electrotechnology` | 0.0561 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 6.7% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.4% | `literature` | 0.0053 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 3.4% | `metrology` | 0.0002 | 0.0061 | under | `array` 29.6% (803) `entropy` 14.0% (90) `rate` 7.5% (140) `measurement` 5.9% (13) |
| 3.0% | `grammar` | 0.0015 | 0.0095 | under | `num` 60.6% (471) `clause` 7.9% (33) `modify` 5.3% (123) `number` 4.8% (737) |
| 3.0% | `programming` | 0.0811 | 0.0521 | **over** | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 2.4% | `cryptography` | 0.0001 | 0.0041 | under | `encrypt` 18.5% (97) `password` 15.6% (182) `private_key` 15.2% (25) `md5` 14.3% (21) |

### `tika-detectors/tika-detector-magika/src/main/java`

**30.6%** of the maximum divergence from the repository, against a null median of 42.9% over 999 resamples of the same size — an excess of -12.2 points, and 861 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-magika/src/test/java`

**35.7%** of the maximum divergence from the repository, against a null median of 34.5% over 999 resamples of the same size — an excess of +1.2 points, and 444 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/main/java`

**36.6%** of the maximum divergence from the repository, against a null median of 44.1% over 999 resamples of the same size — an excess of -7.5 points, and 695 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-detectors/tika-detector-siegfried/src/test/java`

**37.1%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of +3.0 points, and 390 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-grpc/src/test/java`

**26.0%** of the maximum divergence from the repository, against a null median of 25.5% over 999 resamples of the same size — an excess of +0.5 points, and 460 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-e2e-tests/tika-server/src/test/java`

**48.7%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of +14.5 points, and 115 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/main/java`

**18.3%** of the maximum divergence from the repository, against a null median of 16.9% over 999 resamples of the same size — an excess of +1.3 points, and 343 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-html/src/test/java`

**25.2%** of the maximum divergence from the repository, against a null median of 34.2% over 999 resamples of the same size — an excess of -9.0 points, and 876 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java`

**19.8%** of the maximum divergence from the repository, against a null median of 16.8% over 999 resamples of the same size — an excess of +3.0 points, and 216 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/java`

**50.9%** of the maximum divergence from the repository, against a null median of 41.9% over 999 resamples of the same size — an excess of +9.1 points, and 306 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/main/java`

**17.7%** of the maximum divergence from the repository, against a null median of 13.5% over 999 resamples of the same size — an excess of +4.2 points, and 74 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java`

**15.8%** of the maximum divergence from the repository, against a null median of 11.5% over 999 resamples of the same size — an excess of +4.3 points, and 31 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-encoding-detectors/tika-encoding-detector-universal/src/main/java`

**27.6%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of -6.4 points, and 782 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-app/src/main/java`

**16.5%** of the maximum divergence from the repository, against a null median of 7.7% over 999 resamples of the same size — an excess of +8.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.6% | `publishing` | 0.0851 | 0.0174 | **over** | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 7.4% | `computing` | 0.1808 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 6.5% | `arithmetic` | 0.0308 | 0.0021 | **over** | `extract` 91.5% (1,065) `integer` 3.7% (148) `subtract` 0.8% (15) `position` 0.7% (250) |
| 5.5% | `theatre` | 0.0300 | 0.0032 | **over** | `mime` 77.8% (595) `script` 18.6% (825) `extra` 2.3% (17) `jackson` 1.0% (72) |
| 4.9% | `industry` | 0.0006 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 4.4% | `geology` | 0.0201 | 0.0012 | **over** | `col` 55.4% (69) `delta` 13.5% (36) `julian` 5.4% (5) `sheet` 4.6% (149) |
| 4.0% | `electrotechnology` | 0.0005 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.8% | `electronics` | 0.0006 | 0.0156 | under | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |

### `tika-eval/tika-eval-app/src/test/java`

**21.8%** of the maximum divergence from the repository, against a null median of 16.0% over 999 resamples of the same size — an excess of +5.8 points, and 64 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-eval/tika-eval-core/src/main/java`

**22.2%** of the maximum divergence from the repository, against a null median of 7.0% over 999 resamples of the same size — an excess of +15.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 25.8% | `mathematics` | 0.2057 | 0.0258 | **over** | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 7.5% | `video-games` | 0.0523 | 0.0048 | **over** | `stats` 26.4% (45) `meta` 14.7% (175) `item` 12.2% (318) `mapper` 4.2% (309) |
| 4.2% | `computer-languages` | 0.0001 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 3.7% | `telecommunication` | 0.0014 | 0.0228 | under | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |
| 3.1% | `electronics` | 0.0003 | 0.0156 | under | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 2.8% | `metrology` | 0.0302 | 0.0061 | **over** | `array` 29.6% (803) `entropy` 14.0% (90) `rate` 7.5% (140) `measurement` 5.9% (13) |
| 2.8% | `quality` | 0.0221 | 0.0028 | **over** | `available` 10.9% (58) `internal` 9.3% (57) `external` 9.2% (131) `new` 7.2% (102) |
| 2.7% | `geography` | 0.0004 | 0.0140 | under | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |

### `tika-eval/tika-eval-core/src/test/java`

**19.2%** of the maximum divergence from the repository, against a null median of 19.2% over 999 resamples of the same size — an excess of +0.0 points, and 497 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-example/src/main/java`

**15.8%** of the maximum divergence from the repository, against a null median of 6.7% over 999 resamples of the same size — an excess of +9.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.5% | `telecommunication` | 0.1025 | 0.0228 | **over** | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |
| 6.5% | `geography` | 0.0576 | 0.0140 | **over** | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |
| 6.2% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 4.6% | `industry` | 0.0011 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 3.5% | `electrotechnology` | 0.0460 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.2% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 2.7% | `mathematics` | 0.0067 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 2.5% | `buildings` | 0.0003 | 0.0096 | under | `log` 23.4% (484) `window` 21.0% (349) `tear_down` 18.0% (48) `machine` 8.4% (38) |

### `tika-example/src/test/java`

**30.3%** of the maximum divergence from the repository, against a null median of 15.9% over 999 resamples of the same size — an excess of +14.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.2% | `chemistry` | 0.1189 | 0.0116 | **over** | `buffer` 17.1% (419) `builder` 16.4% (189) `type` 15.0% (3,459) `char` 9.7% (562) |
| 9.0% | `industry` | 0.1158 | 0.0197 | **over** | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 6.7% | `electrotechnology` | 0.0894 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 5.9% | `computing` | 0.1585 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 4.6% | `telecommunication` | 0.0853 | 0.0228 | **over** | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |
| 4.6% | `buildings` | 0.0579 | 0.0096 | **over** | `log` 23.4% (484) `window` 21.0% (349) `tear_down` 18.0% (48) `machine` 8.4% (38) |
| 4.3% | `programming` | 0.0080 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 2.3% | `person` | 0.0005 | 0.0168 | under | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |

### `tika-grpc/src/main/java`

**26.7%** of the maximum divergence from the repository, against a null median of 28.7% over 999 resamples of the same size — an excess of -1.9 points, and 603 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-grpc/src/test/java`

**34.2%** of the maximum divergence from the repository, against a null median of 25.3% over 999 resamples of the same size — an excess of +8.9 points, and 90 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-handlers/tika-handler-boilerpipe/src/main/java`

**38.5%** of the maximum divergence from the repository, against a null median of 43.4% over 999 resamples of the same size — an excess of -4.8 points, and 639 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-es-integration-tests/src/test/java`

**34.5%** of the maximum divergence from the repository, against a null median of 35.3% over 999 resamples of the same size — an excess of -0.9 points, and 536 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/java`

**35.5%** of the maximum divergence from the repository, against a null median of 41.9% over 999 resamples of the same size — an excess of -6.4 points, and 701 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/java`

**32.7%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of -1.4 points, and 562 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/java`

**39.3%** of the maximum divergence from the repository, against a null median of 34.8% over 999 resamples of the same size — an excess of +4.5 points, and 338 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/java`

**61.0%** of the maximum divergence from the repository, against a null median of 23.0% over 999 resamples of the same size — an excess of +38.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 30.2% | `hydraulics` | 0.4292 | 0.0103 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 21.8% | `christianity` | 0.2789 | 0.0017 | **over** | `use` 58.3% (4,071) `kind` 6.5% (2,190) `secret` 5.5% (59) `element` 5.0% (1,056) |
| 10.6% | `computing` | 0.0624 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 4.0% | `programming` | 0.0004 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 2.0% | `mathematics` | 0.0001 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 1.7% | `literature` | 0.0000 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 1.6% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 1.3% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |

### `tika-integration-tests/tika-resource-loading-tests/src/test/java`

**31.1%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -2.8 points, and 629 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-integration-tests/tika-woodstox-tests/src/test/java`

**48.9%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of +6.2 points, and 368 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/main/java`

**66.1%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of +32.7 points, and 9 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-java7/src/test/java`

**47.8%** of the maximum divergence from the repository, against a null median of 43.1% over 999 resamples of the same size — an excess of +4.7 points, and 386 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup-core/src/main/java`

**33.6%** of the maximum divergence from the repository, against a null median of 18.0% over 999 resamples of the same size — an excess of +15.6 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.0% | `mathematics` | 0.1633 | 0.0258 | **over** | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 7.3% | `computing` | 0.1372 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 5.7% | `programming` | 0.0031 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 4.8% | `art` | 0.0424 | 0.0021 | **over** | `flag` 46.6% (263) `artist` 21.9% (29) `write` 9.4% (844) `capture` 4.2% (64) |
| 4.8% | `rail-transport` | 0.0405 | 0.0016 | **over** | `pre` 25.4% (30) `exc` 24.0% (16) `helper` 14.1% (126) `uni` 8.3% (56) |
| 4.4% | `linguistics` | 0.1868 | 0.0826 | **over** | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 3.6% | `arithmetic` | 0.0339 | 0.0021 | **over** | `extract` 91.5% (1,065) `integer` 3.7% (148) `subtract` 0.8% (15) `position` 0.7% (250) |
| 3.3% | `computer_science` | 0.0008 | 0.0263 | under | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |

### `tika-langdetect/tika-langdetect-charsoup/src/main/java`

**30.6%** of the maximum divergence from the repository, against a null median of 29.0% over 999 resamples of the same size — an excess of +1.6 points, and 416 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-charsoup/src/test/java`

**20.0%** of the maximum divergence from the repository, against a null median of 7.0% over 999 resamples of the same size — an excess of +12.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.0% | `computing` | 0.1050 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 7.5% | `telecommunications` | 0.0381 | 0.0016 | **over** | `ext` 84.3% (103) `csd` 3.1% (3) `prefix` 2.2% (600) `read` 1.9% (1,016) |
| 4.9% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 4.2% | `linguistics` | 0.1570 | 0.0826 | **over** | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 3.8% | `geography` | 0.0497 | 0.0140 | **over** | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |
| 3.0% | `programming` | 0.0184 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 2.8% | `computer_science` | 0.0052 | 0.0263 | under | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |
| 2.7% | `networking` | 0.0000 | 0.0110 | under | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |

### `tika-langdetect/tika-langdetect-lingo24/src/main/java`

**39.1%** of the maximum divergence from the repository, against a null median of 43.3% over 999 resamples of the same size — an excess of -4.3 points, and 622 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-lingo24/src/test/java`

**74.8%** of the maximum divergence from the repository, against a null median of 43.5% over 999 resamples of the same size — an excess of +31.3 points, and 72 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/main/java`

**55.2%** of the maximum divergence from the repository, against a null median of 42.3% over 999 resamples of the same size — an excess of +12.9 points, and 253 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-mitll-text/src/test/java`

**80.3%** of the maximum divergence from the repository, against a null median of 42.5% over 999 resamples of the same size — an excess of +37.8 points, and 39 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/main/java`

**29.8%** of the maximum divergence from the repository, against a null median of 29.1% over 999 resamples of the same size — an excess of +0.6 points, and 469 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-opennlp/src/test/java`

**68.3%** of the maximum divergence from the repository, against a null median of 43.4% over 999 resamples of the same size — an excess of +24.9 points, and 109 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/main/java`

**34.2%** of the maximum divergence from the repository, against a null median of 34.5% over 999 resamples of the same size — an excess of -0.4 points, and 508 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-optimaize/src/test/java`

**60.9%** of the maximum divergence from the repository, against a null median of 42.0% over 999 resamples of the same size — an excess of +18.8 points, and 192 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-langdetect/tika-langdetect-test-commons/src/main/java`

**48.3%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of +5.6 points, and 355 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/main/java`

**29.0%** of the maximum divergence from the repository, against a null median of 29.2% over 999 resamples of the same size — an excess of -0.3 points, and 519 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-metadata-schema/src/test/java`

**36.4%** of the maximum divergence from the repository, against a null median of 17.8% over 999 resamples of the same size — an excess of +18.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.4% | `networking` | 0.1353 | 0.0110 | **over** | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 9.2% | `number` | 0.0820 | 0.0028 | **over** | `value` 39.5% (1,844) `digit` 13.4% (83) `first` 11.4% (89) `nothing` 10.4% (125) |
| 6.9% | `computing` | 0.1352 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 5.8% | `linguistics` | 0.0122 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 4.0% | `publishing` | 0.0762 | 0.0174 | **over** | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 3.6% | `computer_science` | 0.0000 | 0.0263 | under | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |
| 3.6% | `basketball` | 0.0275 | 0.0002 | **over** | `key` 38.1% (1,621) `three` 16.9% (63) `four` 7.6% (59) `drain` 6.7% (34) |
| 3.0% | `biology` | 0.0351 | 0.0036 | **over** | `emit` 64.7% (881) `bos` 5.7% (67) `reporter` 3.5% (105) `model` 2.7% (711) |

### `tika-ml/tika-ml-chardetect/src/main/java`

**21.6%** of the maximum divergence from the repository, against a null median of 20.8% over 999 resamples of the same size — an excess of +0.8 points, and 428 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-chardetect/src/test/java`

**60.3%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of +17.3 points, and 193 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/main/java`

**52.9%** of the maximum divergence from the repository, against a null median of 29.1% over 999 resamples of the same size — an excess of +23.8 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-core/src/test/java`

**58.9%** of the maximum divergence from the repository, against a null median of 43.6% over 999 resamples of the same size — an excess of +15.3 points, and 222 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/main/java`

**18.5%** of the maximum divergence from the repository, against a null median of 19.2% over 999 resamples of the same size — an excess of -0.7 points, and 590 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect-tools/src/test/java`

**23.2%** of the maximum divergence from the repository, against a null median of 25.3% over 999 resamples of the same size — an excess of -2.0 points, and 663 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/main/java`

**20.6%** of the maximum divergence from the repository, against a null median of 21.0% over 999 resamples of the same size — an excess of -0.4 points, and 537 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-ml/tika-ml-junkdetect/src/test/java`

**22.5%** of the maximum divergence from the repository, against a null median of 18.0% over 999 resamples of the same size — an excess of +4.5 points, and 118 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/main/java`

**47.2%** of the maximum divergence from the repository, against a null median of 44.2% over 999 resamples of the same size — an excess of +3.0 points, and 423 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-http-jdk/src/test/java`

**42.2%** of the maximum divergence from the repository, against a null median of 34.7% over 999 resamples of the same size — an excess of +7.5 points, and 226 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/main/java`

**26.6%** of the maximum divergence from the repository, against a null median of 34.5% over 999 resamples of the same size — an excess of -7.9 points, and 833 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/java`

**34.0%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of -0.0 points, and 501 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/main/java`

**16.3%** of the maximum divergence from the repository, against a null median of 16.8% over 999 resamples of the same size — an excess of -0.5 points, and 580 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/java`

**27.0%** of the maximum divergence from the repository, against a null median of 19.6% over 999 resamples of the same size — an excess of +7.5 points, and 58 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/java`

**53.9%** of the maximum divergence from the repository, against a null median of 44.1% over 999 resamples of the same size — an excess of +9.8 points, and 322 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/main/java`

**24.5%** of the maximum divergence from the repository, against a null median of 21.2% over 999 resamples of the same size — an excess of +3.3 points, and 233 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/java`

**30.1%** of the maximum divergence from the repository, against a null median of 43.5% over 999 resamples of the same size — an excess of -13.4 points, and 868 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/java`

**24.2%** of the maximum divergence from the repository, against a null median of 29.2% over 999 resamples of the same size — an excess of -5.0 points, and 774 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-inference/src/main/java`

**23.6%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +11.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.3% | `travel-industry` | 0.0616 | 0.0005 | **over** | `locator` 99.8% (61) `osi` 0.1% (3) `pseudo` 0.1% (8) `fit` 0.0% (29) |
| 7.3% | `linguistics` | 0.0166 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 7.0% | `buildings` | 0.0646 | 0.0096 | **over** | `log` 23.4% (484) `window` 21.0% (349) `tear_down` 18.0% (48) `machine` 8.4% (38) |
| 6.2% | `publishing` | 0.0769 | 0.0174 | **over** | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 4.1% | `industry` | 0.0001 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 3.4% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.5% | `time_period` | 0.0000 | 0.0119 | under | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 2.3% | `programming` | 0.0200 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |

### `tika-parsers/tika-parsers-ml/tika-inference/src/test/java`

**29.8%** of the maximum divergence from the repository, against a null median of 20.8% over 999 resamples of the same size — an excess of +9.0 points, and 49 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java`

**13.4%** of the maximum divergence from the repository, against a null median of 9.0% over 999 resamples of the same size — an excess of +4.4 points, and 5 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.1% | `linguistics` | 0.1624 | 0.0826 | **over** | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 6.7% | `astronomy` | 0.0256 | 0.0017 | **over** | `latitude` 14.7% (24) `longitude` 11.7% (23) `egress` 8.2% (26) `alt` 8.0% (70) |
| 6.0% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 5.5% | `industry` | 0.0010 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 4.4% | `electronics` | 0.0008 | 0.0156 | under | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 3.9% | `politics` | 0.0171 | 0.0017 | **over** | `pas` 32.4% (173) `country` 15.8% (47) `zip` 8.3% (624) `alignment` 3.7% (25) |
| 3.8% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.3% | `science-fiction` | 0.0126 | 0.0009 | **over** | `entity` 49.0% (298) `tesseract` 34.3% (170) `inner` 5.7% (49) `cred` 4.4% (17) |

### `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/java`

**23.7%** of the maximum divergence from the repository, against a null median of 20.9% over 999 resamples of the same size — an excess of +2.7 points, and 287 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/main/java`

**30.1%** of the maximum divergence from the repository, against a null median of 34.4% over 999 resamples of the same size — an excess of -4.3 points, and 675 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/java`

**22.3%** of the maximum divergence from the repository, against a null median of 26.2% over 999 resamples of the same size — an excess of -4.0 points, and 730 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/main/java`

**34.0%** of the maximum divergence from the repository, against a null median of 33.4% over 999 resamples of the same size — an excess of +0.6 points, and 468 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/java`

**65.8%** of the maximum divergence from the repository, against a null median of 43.4% over 999 resamples of the same size — an excess of +22.4 points, and 137 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/main/java`

**18.6%** of the maximum divergence from the repository, against a null median of 20.9% over 999 resamples of the same size — an excess of -2.3 points, and 720 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-ml/tika-vlm/src/test/java`

**31.0%** of the maximum divergence from the repository, against a null median of 22.8% over 999 resamples of the same size — an excess of +8.3 points, and 87 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java`

**11.9%** of the maximum divergence from the repository, against a null median of 3.9% over 999 resamples of the same size — an excess of +8.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.1% | `computing` | 0.4945 | 0.3089 | **over** | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 7.5% | `mathematics` | 0.0018 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 5.8% | `electrotechnology` | 0.0512 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.4% | `industry` | 0.0511 | 0.0197 | **over** | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 4.3% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.0% | `law` | 0.0065 | 0.0265 | under | `file` 18.2% (10,159) `client` 13.5% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 2.7% | `linguistics` | 0.0484 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 2.3% | `grammar` | 0.0011 | 0.0095 | under | `num` 60.6% (471) `clause` 7.9% (33) `modify` 5.3% (123) `number` 4.8% (737) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/main/java`

**14.3%** of the maximum divergence from the repository, against a null median of 14.9% over 999 resamples of the same size — an excess of -0.6 points, and 583 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/java`

**26.8%** of the maximum divergence from the repository, against a null median of 21.2% over 999 resamples of the same size — an excess of +5.6 points, and 142 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/main/java`

**15.6%** of the maximum divergence from the repository, against a null median of 7.3% over 999 resamples of the same size — an excess of +8.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.1% | `music` | 0.0783 | 0.0060 | **over** | `ti` 20.1% (1,144) `album` 8.0% (30) `composer` 5.2% (11) `label` 5.0% (356) |
| 6.5% | `art` | 0.0290 | 0.0021 | **over** | `flag` 46.6% (263) `artist` 21.9% (29) `write` 9.4% (844) `capture` 4.2% (64) |
| 6.3% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 4.2% | `computer-graphics` | 0.0321 | 0.0066 | **over** | `instance` 30.6% (572) `mpeg` 12.3% (48) `jpeg` 11.3% (49) `renderer` 11.0% (22) |
| 3.8% | `industry` | 0.0021 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 3.5% | `programming` | 0.0997 | 0.0521 | **over** | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 3.3% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 2.9% | `acoustics` | 0.0102 | 0.0002 | **over** | `audio` 96.7% (158) `sound` 1.8% (3) `static` 0.9% (4) `noisiness` 0.5% (1) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/java`

**19.7%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +7.3 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 8.9% | `linguistics` | 0.0162 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 7.1% | `computing` | 0.4833 | 0.3089 | **over** | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 6.4% | `industry` | 0.0753 | 0.0197 | **over** | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 5.0% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 4.1% | `telecommunication` | 0.0015 | 0.0228 | under | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |
| 3.7% | `medicine` | 0.0006 | 0.0177 | under | `uri` 41.7% (301) `type` 12.0% (3,459) `start` 5.7% (1,211) `tmp` 4.7% (328) |
| 3.5% | `person` | 0.0006 | 0.0168 | under | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 3.2% | `publishing` | 0.0011 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/main/java`

**21.1%** of the maximum divergence from the repository, against a null median of 18.0% over 999 resamples of the same size — an excess of +3.1 points, and 218 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/java`

**32.8%** of the maximum divergence from the repository, against a null median of 26.1% over 999 resamples of the same size — an excess of +6.7 points, and 143 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/main/java`

**15.1%** of the maximum divergence from the repository, against a null median of 19.6% over 999 resamples of the same size — an excess of -4.5 points, and 913 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/java`

**31.0%** of the maximum divergence from the repository, against a null median of 21.2% over 999 resamples of the same size — an excess of +9.8 points, and 33 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/main/java`

**22.7%** of the maximum divergence from the repository, against a null median of 25.5% over 999 resamples of the same size — an excess of -2.8 points, and 695 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/java`

**34.8%** of the maximum divergence from the repository, against a null median of 23.0% over 999 resamples of the same size — an excess of +11.8 points, and 37 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/main/java`

**41.7%** of the maximum divergence from the repository, against a null median of 29.0% over 999 resamples of the same size — an excess of +12.6 points, and 78 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/test/java`

**83.3%** of the maximum divergence from the repository, against a null median of 43.8% over 999 resamples of the same size — an excess of +39.6 points, and 22 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-digest-commons/src/main/java`

**48.5%** of the maximum divergence from the repository, against a null median of 24.9% over 999 resamples of the same size — an excess of +23.7 points, and 6 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/main/java`

**24.8%** of the maximum divergence from the repository, against a null median of 34.0% over 999 resamples of the same size — an excess of -9.2 points, and 890 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/java`

**33.3%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of -9.4 points, and 774 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java`

**28.5%** of the maximum divergence from the repository, against a null median of 21.2% over 999 resamples of the same size — an excess of +7.3 points, and 80 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/java`

**23.7%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of -10.2 points, and 905 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/main/java`

**13.2%** of the maximum divergence from the repository, against a null median of 11.8% over 999 resamples of the same size — an excess of +1.4 points, and 254 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/java`

**28.2%** of the maximum divergence from the repository, against a null median of 14.4% over 999 resamples of the same size — an excess of +13.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.9% | `computing` | 0.7116 | 0.3089 | **over** | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 14.1% | `linguistics` | 0.0004 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 4.0% | `programming` | 0.0101 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 3.5% | `mathematics` | 0.0012 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 3.5% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 2.8% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.6% | `person` | 0.0004 | 0.0168 | under | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 2.5% | `law` | 0.0037 | 0.0265 | under | `file` 18.2% (10,159) `client` 13.5% (715) `allow` 2.4% (362) `retry` 2.3% (51) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-jdbc-commons/src/main/java`

**24.2%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of -9.3 points, and 911 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java`

**28.2%** of the maximum divergence from the repository, against a null median of 34.5% over 999 resamples of the same size — an excess of -6.4 points, and 781 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/test/java`

**31.9%** of the maximum divergence from the repository, against a null median of 34.2% over 999 resamples of the same size — an excess of -2.3 points, and 589 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/main/java`

**17.8%** of the maximum divergence from the repository, against a null median of 29.0% over 999 resamples of the same size — an excess of -11.2 points, and 981 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/java`

**27.2%** of the maximum divergence from the repository, against a null median of 33.6% over 999 resamples of the same size — an excess of -6.3 points, and 782 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java`

**8.0%** of the maximum divergence from the repository, against a null median of 1.1% over 999 resamples of the same size — an excess of +6.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.9% | `computer-languages` | 0.0004 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 9.4% | `electrotechnology` | 0.0001 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 6.5% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 6.0% | `industry` | 0.0032 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 5.8% | `electronics` | 0.0017 | 0.0156 | under | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 5.3% | `computer_science` | 0.0572 | 0.0263 | **over** | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |
| 3.9% | `metrology` | 0.0211 | 0.0061 | **over** | `array` 29.6% (803) `entropy` 14.0% (90) `rate` 7.5% (140) `measurement` 5.9% (13) |
| 3.3% | `networking` | 0.0018 | 0.0110 | under | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/java`

**15.2%** of the maximum divergence from the repository, against a null median of 5.1% over 999 resamples of the same size — an excess of +10.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `industry` | 0.1013 | 0.0197 | **over** | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 7.6% | `aviation` | 0.0398 | 0.0045 | **over** | `max` 37.9% (1,140) `rtf` 37.5% (101) `threshold` 5.3% (186) `fis` 2.9% (5) |
| 5.8% | `linguistics` | 0.0308 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 4.7% | `literature` | 0.0589 | 0.0204 | **over** | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 3.8% | `medicine` | 0.0016 | 0.0177 | under | `uri` 41.7% (301) `type` 12.0% (3,459) `start` 5.7% (1,211) `tmp` 4.7% (328) |
| 3.7% | `person` | 0.0013 | 0.0168 | under | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 3.4% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 3.3% | `computing` | 0.4083 | 0.3089 | **over** | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/main/java`

**10.2%** of the maximum divergence from the repository, against a null median of 6.3% over 999 resamples of the same size — an excess of +3.9 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 6.1% | `computer-languages` | 0.0019 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 5.8% | `linguistics` | 0.1431 | 0.0826 | **over** | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 5.1% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.3% | `electrotechnology` | 0.0021 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.1% | `chemistry` | 0.0341 | 0.0116 | **over** | `buffer` 17.1% (419) `builder` 16.4% (189) `type` 15.0% (3,459) `char` 9.7% (562) |
| 4.0% | `arithmetic` | 0.0153 | 0.0021 | **over** | `extract` 91.5% (1,065) `integer` 3.7% (148) `subtract` 0.8% (15) `position` 0.7% (250) |
| 4.0% | `medicine` | 0.0435 | 0.0177 | **over** | `uri` 41.7% (301) `type` 12.0% (3,459) `start` 5.7% (1,211) `tmp` 4.7% (328) |
| 3.9% | `programming` | 0.0919 | 0.0521 | **over** | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/java`

**25.2%** of the maximum divergence from the repository, against a null median of 14.1% over 999 resamples of the same size — an excess of +11.1 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.5% | `computer-languages` | 0.1455 | 0.0198 | **over** | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 12.5% | `industry` | 0.1269 | 0.0197 | **over** | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 8.0% | `linguistics` | 0.0132 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 4.8% | `algebra` | 0.0555 | 0.0105 | **over** | `content` 76.2% (2,501) `unknown` 8.2% (275) `normalizer` 4.6% (16) `index` 3.8% (909) |
| 4.3% | `telecommunication` | 0.0002 | 0.0228 | under | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |
| 3.2% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.0% | `mathematics` | 0.0029 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 2.1% | `networking` | 0.0000 | 0.0110 | under | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/main/java`

**18.9%** of the maximum divergence from the repository, against a null median of 33.8% over 999 resamples of the same size — an excess of -14.9 points, and 992 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/java`

**31.3%** of the maximum divergence from the repository, against a null median of 43.5% over 999 resamples of the same size — an excess of -12.2 points, and 847 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/main/java`

**24.1%** of the maximum divergence from the repository, against a null median of 23.0% over 999 resamples of the same size — an excess of +1.2 points, and 411 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/java`

**28.7%** of the maximum divergence from the repository, against a null median of 35.1% over 999 resamples of the same size — an excess of -6.3 points, and 765 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/main/java`

**19.3%** of the maximum divergence from the repository, against a null median of 9.0% over 999 resamples of the same size — an excess of +10.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 12.0% | `publishing` | 0.0998 | 0.0174 | **over** | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 5.1% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 5.0% | `computer-graphics` | 0.0404 | 0.0066 | **over** | `instance` 30.6% (572) `mpeg` 12.3% (48) `jpeg` 11.3% (49) `renderer` 11.0% (22) |
| 5.0% | `software` | 0.0322 | 0.0034 | **over** | `shift_jis` 13.0% (59) `pdf` 12.0% (134) `factory_class` 11.5% (20) `excel` 9.8% (98) |
| 4.7% | `information-science` | 0.0256 | 0.0017 | **over** | `document` 96.3% (1,456) `align` 2.3% (54) `controlled_vocabulary` 0.5% (14) `keyword` 0.4% (7) |
| 4.3% | `statistics` | 0.0246 | 0.0020 | **over** | `sigma` 21.2% (49) `histogram` 8.0% (22) `class` 7.3% (1,450) `raw_data` 7.1% (6) |
| 4.2% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.9% | `motor-racing` | 0.0173 | 0.0004 | **over** | `dpi` 81.0% (23) `observer` 8.2% (22) `intermediate` 5.5% (84) `place` 2.5% (122) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java`

**23.7%** of the maximum divergence from the repository, against a null median of 19.6% over 999 resamples of the same size — an excess of +4.0 points, and 177 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/main/java`

**18.4%** of the maximum divergence from the repository, against a null median of 15.8% over 999 resamples of the same size — an excess of +2.7 points, and 210 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/java`

**18.9%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +6.5 points, and 7 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/main/java`

**16.4%** of the maximum divergence from the repository, against a null median of 14.8% over 999 resamples of the same size — an excess of +1.6 points, and 307 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/java`

**23.5%** of the maximum divergence from the repository, against a null median of 19.5% over 999 resamples of the same size — an excess of +4.0 points, and 155 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/main/java`

**23.5%** of the maximum divergence from the repository, against a null median of 28.5% over 999 resamples of the same size — an excess of -5.0 points, and 792 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/java`

**41.4%** of the maximum divergence from the repository, against a null median of 29.5% over 999 resamples of the same size — an excess of +11.8 points, and 93 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java`

**23.8%** of the maximum divergence from the repository, against a null median of 12.4% over 999 resamples of the same size — an excess of +11.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.3% | `medicine` | 0.1459 | 0.0177 | **over** | `uri` 41.7% (301) `type` 12.0% (3,459) `start` 5.7% (1,211) `tmp` 4.7% (328) |
| 5.6% | `programming` | 0.1333 | 0.0521 | **over** | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 4.4% | `computing` | 0.4577 | 0.3089 | **over** | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 4.1% | `law` | 0.0015 | 0.0265 | under | `file` 18.2% (10,159) `client` 13.5% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 3.8% | `industry` | 0.0003 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 3.5% | `person` | 0.0000 | 0.0168 | under | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 3.4% | `publishing` | 0.0001 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 3.4% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/java`

**30.7%** of the maximum divergence from the repository, against a null median of 19.3% over 999 resamples of the same size — an excess of +11.5 points, and 14 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/main/java`

**24.6%** of the maximum divergence from the repository, against a null median of 23.3% over 999 resamples of the same size — an excess of +1.3 points, and 393 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/java`

**44.3%** of the maximum divergence from the repository, against a null median of 29.6% over 999 resamples of the same size — an excess of +14.6 points, and 48 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java`

**21.8%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +10.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.5% | `linguistics` | 0.2499 | 0.0826 | **over** | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 6.0% | `furniture` | 0.0304 | 0.0007 | **over** | `counter` 87.5% (74) `drawer` 8.1% (12) `phone` 1.7% (29) `mirror` 0.9% (57) |
| 4.7% | `literature` | 0.0000 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 4.5% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 4.4% | `telecommunication` | 0.0721 | 0.0228 | **over** | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |
| 4.4% | `computer_science` | 0.0015 | 0.0263 | under | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |
| 3.8% | `person` | 0.0000 | 0.0168 | under | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 3.6% | `industry` | 0.0008 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |

### `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/java`

**39.7%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of +5.8 points, and 286 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/main/java`

**20.6%** of the maximum divergence from the repository, against a null median of 22.8% over 999 resamples of the same size — an excess of -2.2 points, and 688 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-async-cli/src/test/java`

**32.6%** of the maximum divergence from the repository, against a null median of 25.9% over 999 resamples of the same size — an excess of +6.7 points, and 161 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-httpclient-commons/src/main/java`

**49.5%** of the maximum divergence from the repository, against a null median of 29.6% over 999 resamples of the same size — an excess of +19.9 points, and 21 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-api/src/main/java`

**26.4%** of the maximum divergence from the repository, against a null median of 9.7% over 999 resamples of the same size — an excess of +16.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 10.7% | `biology` | 0.0740 | 0.0036 | **over** | `emit` 64.7% (881) `bos` 5.7% (67) `reporter` 3.5% (105) `model` 2.7% (711) |
| 9.1% | `electronics` | 0.0981 | 0.0156 | **over** | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 6.6% | `hydraulics` | 0.0689 | 0.0103 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.4% | `glassblowing` | 0.0263 | 0.0005 | **over** | `found` 98.3% (293) `step` 1.0% (48) `web` 0.6% (61) `way` 0.2% (91) |
| 3.8% | `literature` | 0.0000 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 3.7% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 3.4% | `linguistics` | 0.0306 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 3.2% | `mathematics` | 0.0726 | 0.0258 | **over** | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |

### `tika-pipes/tika-pipes-config-store-ignite/src/main/java`

**37.0%** of the maximum divergence from the repository, against a null median of 23.0% over 999 resamples of the same size — an excess of +14.1 points, and 16 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-config-store-ignite/src/test/java`

**64.2%** of the maximum divergence from the repository, against a null median of 43.4% over 999 resamples of the same size — an excess of +20.8 points, and 144 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-core/src/main/java`

**11.8%** of the maximum divergence from the repository, against a null median of 4.0% over 999 resamples of the same size — an excess of +7.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.9% | `electronics` | 0.0649 | 0.0156 | **over** | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 8.3% | `biology` | 0.0330 | 0.0036 | **over** | `emit` 64.7% (881) `bos` 5.7% (67) `reporter` 3.5% (105) `model` 2.7% (711) |
| 7.6% | `hydraulics` | 0.0466 | 0.0103 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 5.4% | `industry` | 0.0018 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 4.6% | `publishing` | 0.0017 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 4.4% | `linguistics` | 0.0410 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 3.2% | `geography` | 0.0019 | 0.0140 | under | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |
| 2.8% | `telecommunication` | 0.0482 | 0.0228 | **over** | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |

### `tika-pipes/tika-pipes-core/src/test/java`

**17.2%** of the maximum divergence from the repository, against a null median of 12.5% over 999 resamples of the same size — an excess of +4.7 points, and 39 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/main/java`

**25.9%** of the maximum divergence from the repository, against a null median of 25.7% over 999 resamples of the same size — an excess of +0.2 points, and 486 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-fork-parser/src/test/java`

**34.1%** of the maximum divergence from the repository, against a null median of 43.5% over 999 resamples of the same size — an excess of -9.4 points, and 764 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-integration-tests/src/test/java`

**17.8%** of the maximum divergence from the repository, against a null median of 9.4% over 999 resamples of the same size — an excess of +8.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.2% | `hydraulics` | 0.1128 | 0.0103 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 5.2% | `literature` | 0.0002 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 4.2% | `publishing` | 0.0004 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 4.2% | `computing` | 0.4320 | 0.3089 | **over** | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 4.0% | `tennis` | 0.0254 | 0.0032 | **over** | `get` 96.1% (1,670) `return` 1.1% (1,430) `server` 1.0% (669) `single` 0.5% (447) |
| 3.8% | `geography` | 0.0001 | 0.0140 | under | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |
| 2.4% | `administration` | 0.0132 | 0.0012 | **over** | `manager` 51.6% (306) `title` 21.8% (180) `branch` 5.7% (43) `resolution` 2.8% (59) |
| 2.3% | `person` | 0.0026 | 0.0168 | under | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |

### `tika-pipes/tika-pipes-iterator-commons/src/main/java`

**48.1%** of the maximum divergence from the repository, against a null median of 34.5% over 999 resamples of the same size — an excess of +13.6 points, and 129 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java`

**26.8%** of the maximum divergence from the repository, against a null median of 21.1% over 999 resamples of the same size — an excess of +5.7 points, and 148 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/java`

**52.5%** of the maximum divergence from the repository, against a null median of 43.0% over 999 resamples of the same size — an excess of +9.6 points, and 292 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/main/java`

**29.1%** of the maximum divergence from the repository, against a null median of 15.9% over 999 resamples of the same size — an excess of +13.2 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.6% | `time_period` | 0.0984 | 0.0119 | **over** | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 7.1% | `electronics` | 0.0895 | 0.0156 | **over** | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 6.8% | `hydraulics` | 0.0744 | 0.0103 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 5.7% | `computing` | 0.1628 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 5.0% | `military` | 0.0557 | 0.0080 | **over** | `column` 11.3% (259) `predict` 9.9% (119) `password` 7.0% (183) `base` 6.3% (805) |
| 4.3% | `transport` | 0.0386 | 0.0033 | **over** | `container` 29.7% (469) `train` 18.0% (201) `stop` 8.0% (42) `driver` 6.7% (18) |
| 3.5% | `graphical-user-interface` | 0.0253 | 0.0009 | **over** | `container` 68.1% (469) `label` 10.3% (356) `widget` 5.4% (11) `chooser` 4.2% (2) |
| 3.3% | `sports` | 0.0360 | 0.0049 | **over** | `timeout` 29.7% (360) `min` 16.7% (262) `buf` 15.0% (112) `bos` 3.9% (67) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/java`

**38.8%** of the maximum divergence from the repository, against a null median of 25.8% over 999 resamples of the same size — an excess of +13.0 points, and 47 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/main/java`

**36.0%** of the maximum divergence from the repository, against a null median of 26.0% over 999 resamples of the same size — an excess of +10.0 points, and 73 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/java`

**30.9%** of the maximum divergence from the repository, against a null median of 34.2% over 999 resamples of the same size — an excess of -3.3 points, and 653 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/main/java`

**24.1%** of the maximum divergence from the repository, against a null median of 15.6% over 999 resamples of the same size — an excess of +8.5 points, and 18 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/java`

**43.1%** of the maximum divergence from the repository, against a null median of 34.8% over 999 resamples of the same size — an excess of +8.2 points, and 234 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/main/java`

**23.0%** of the maximum divergence from the repository, against a null median of 12.5% over 999 resamples of the same size — an excess of +10.5 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 7.5% | `time_period` | 0.0718 | 0.0119 | **over** | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 6.5% | `electronics` | 0.0743 | 0.0156 | **over** | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 6.3% | `computer-languages` | 0.0815 | 0.0198 | **over** | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 5.8% | `hydraulics` | 0.0584 | 0.0103 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 5.5% | `computer_science` | 0.0001 | 0.0263 | under | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |
| 4.0% | `sociology` | 0.0305 | 0.0032 | **over** | `status` 60.5% (290) `priority` 7.2% (33) `class` 6.1% (1,451) `common` 5.8% (248) |
| 3.5% | `industry` | 0.0007 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 3.5% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/java`

**25.9%** of the maximum divergence from the repository, against a null median of 19.7% over 999 resamples of the same size — an excess of +6.2 points, and 99 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/main/java`

**31.0%** of the maximum divergence from the repository, against a null median of 15.9% over 999 resamples of the same size — an excess of +15.1 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 9.8% | `time_period` | 0.1044 | 0.0119 | **over** | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 8.9% | `electronics` | 0.1073 | 0.0156 | **over** | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 7.4% | `mechanics` | 0.0594 | 0.0028 | **over** | `bucket` 48.7% (377) `override` 20.3% (136) `reset` 13.0% (87) `throttle` 10.4% (23) |
| 6.7% | `hydraulics` | 0.0766 | 0.0103 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 4.3% | `computing` | 0.1761 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 3.7% | `computer-hardware` | 0.0246 | 0.0003 | **over** | `storage` 87.9% (140) `cpu` 5.9% (31) `ram` 4.2% (99) `device` 1.0% (11) |
| 3.0% | `person` | 0.0598 | 0.0168 | **over** | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 2.9% | `telecommunication` | 0.0009 | 0.0228 | under | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/java`

**28.9%** of the maximum divergence from the repository, against a null median of 25.8% over 999 resamples of the same size — an excess of +3.1 points, and 312 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/main/java`

**31.2%** of the maximum divergence from the repository, against a null median of 25.6% over 999 resamples of the same size — an excess of +5.6 points, and 199 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/java`

**47.1%** of the maximum divergence from the repository, against a null median of 43.6% over 999 resamples of the same size — an excess of +3.6 points, and 410 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/main/java`

**35.9%** of the maximum divergence from the repository, against a null median of 16.9% over 999 resamples of the same size — an excess of +19.0 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.2% | `exchange` | 0.1372 | 0.0008 | **over** | `issuer` 85.8% (17) `stock` 9.1% (22) `put` 2.7% (17) `option` 2.3% (129) |
| 12.0% | `cryptography` | 0.1077 | 0.0041 | **over** | `encrypt` 18.5% (97) `password` 15.6% (182) `private_key` 15.2% (25) `md5` 14.3% (21) |
| 9.1% | `networking` | 0.1067 | 0.0110 | **over** | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 5.3% | `programming` | 0.0032 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 3.5% | `literature` | 0.0762 | 0.0204 | **over** | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 2.5% | `mathematics` | 0.0018 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 2.4% | `industry` | 0.0004 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 2.3% | `publishing` | 0.0001 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/java`

**38.5%** of the maximum divergence from the repository, against a null median of 25.6% over 999 resamples of the same size — an excess of +12.9 points, and 38 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/main/java`

**24.5%** of the maximum divergence from the repository, against a null median of 15.8% over 999 resamples of the same size — an excess of +8.7 points, and 15 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/java`

**26.0%** of the maximum divergence from the repository, against a null median of 25.5% over 999 resamples of the same size — an excess of +0.5 points, and 461 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/main/java`

**48.0%** of the maximum divergence from the repository, against a null median of 25.5% over 999 resamples of the same size — an excess of +22.5 points, and 6 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/java`

**44.8%** of the maximum divergence from the repository, against a null median of 34.4% over 999 resamples of the same size — an excess of +10.3 points, and 163 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/main/java`

**25.8%** of the maximum divergence from the repository, against a null median of 19.7% over 999 resamples of the same size — an excess of +6.2 points, and 86 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/java`

**43.5%** of the maximum divergence from the repository, against a null median of 33.8% over 999 resamples of the same size — an excess of +9.7 points, and 192 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/main/java`

**39.4%** of the maximum divergence from the repository, against a null median of 17.9% over 999 resamples of the same size — an excess of +21.5 points, and 1 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 28.2% | `law` | 0.3324 | 0.0265 | **over** | `file` 18.2% (10,159) `client` 13.5% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 4.2% | `mechanics` | 0.0458 | 0.0028 | **over** | `bucket` 48.7% (377) `override` 20.3% (136) `reset` 13.0% (87) `throttle` 10.4% (23) |
| 3.5% | `town_planning` | 0.0315 | 0.0007 | **over** | `store` 41.6% (443) `current` 21.9% (74) `archive` 12.1% (76) `tenant` 9.8% (18) |
| 3.3% | `mathematics` | 0.0000 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 2.9% | `computing` | 0.1840 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 2.9% | `programming` | 0.0098 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 2.6% | `literature` | 0.0000 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 2.2% | `publishing` | 0.0000 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/java`

**37.1%** of the maximum divergence from the repository, against a null median of 34.1% over 999 resamples of the same size — an excess of +3.0 points, and 388 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/main/java`

**28.1%** of the maximum divergence from the repository, against a null median of 13.4% over 999 resamples of the same size — an excess of +14.8 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 15.6% | `computer-languages` | 0.1573 | 0.0198 | **over** | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 6.9% | `sociology` | 0.0530 | 0.0032 | **over** | `status` 60.5% (290) `priority` 7.2% (33) `class` 6.1% (1,451) `common` 5.8% (248) |
| 6.9% | `person` | 0.0885 | 0.0168 | **over** | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 4.4% | `plants` | 0.0475 | 0.0068 | **over** | `root` 51.5% (457) `log` 28.6% (484) `stub` 4.6% (81) `complete` 4.2% (148) |
| 3.3% | `industry` | 0.0001 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 3.0% | `networking` | 0.0466 | 0.0110 | **over** | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 2.9% | `publishing` | 0.0001 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 2.8% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/java`

**51.0%** of the maximum divergence from the repository, against a null median of 34.2% over 999 resamples of the same size — an excess of +16.8 points, and 86 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/main/java`

**23.7%** of the maximum divergence from the repository, against a null median of 16.0% over 999 resamples of the same size — an excess of +7.7 points, and 24 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/java`

**35.5%** of the maximum divergence from the repository, against a null median of 29.4% over 999 resamples of the same size — an excess of +6.1 points, and 239 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/main/java`

**32.2%** of the maximum divergence from the repository, against a null median of 18.3% over 999 resamples of the same size — an excess of +14.0 points, and 3 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.4% | `electronics` | 0.1449 | 0.0156 | **over** | `emitter` 55.3% (560) `ti` 11.4% (1,144) `input` 11.1% (1,030) `default` 2.4% (1,615) |
| 10.9% | `person` | 0.1286 | 0.0168 | **over** | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 7.6% | `computing` | 0.1371 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 7.2% | `hydraulics` | 0.0825 | 0.0103 | **over** | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 5.1% | `law` | 0.1001 | 0.0265 | **over** | `file` 18.2% (10,159) `client` 13.5% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 3.6% | `time_period` | 0.0574 | 0.0119 | **over** | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 3.2% | `telecommunication` | 0.0003 | 0.0228 | under | `file` 38.2% (3,338) `entry` 21.2% (811) `medium` 8.4% (438) `record` 4.0% (145) |
| 3.2% | `literature` | 0.0000 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |

### `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/java`

**29.9%** of the maximum divergence from the repository, against a null median of 29.3% over 999 resamples of the same size — an excess of +0.6 points, and 452 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-pipes/tika-pipes-reporter-commons/src/main/java`

**53.0%** of the maximum divergence from the repository, against a null median of 42.7% over 999 resamples of the same size — an excess of +10.3 points, and 286 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-plugins-core/src/main/java`

**34.3%** of the maximum divergence from the repository, against a null median of 19.4% over 999 resamples of the same size — an excess of +14.9 points, and 4 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 38.8% | `time_period` | 0.3284 | 0.0119 | **over** | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 5.1% | `plants` | 0.0601 | 0.0068 | **over** | `root` 51.5% (457) `log` 28.6% (484) `stub` 4.6% (81) `complete` 4.2% (148) |
| 3.8% | `computer_science` | 0.0000 | 0.0263 | under | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |
| 3.0% | `literature` | 0.0000 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 2.3% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 2.2% | `computer-languages` | 0.0599 | 0.0198 | **over** | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 2.0% | `geography` | 0.0000 | 0.0140 | under | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |
| 1.9% | `publishing` | 0.0010 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |

### `tika-plugins-core/src/test/java`

**33.9%** of the maximum divergence from the repository, against a null median of 28.7% over 999 resamples of the same size — an excess of +5.2 points, and 250 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-serialization/src/main/java`

**15.5%** of the maximum divergence from the repository, against a null median of 7.1% over 999 resamples of the same size — an excess of +8.4 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 19.1% | `graph-theory` | 0.0720 | 0.0024 | **over** | `component` 82.0% (597) `node` 6.6% (597) `size` 4.7% (781) `path` 2.7% (1,666) |
| 5.2% | `industry` | 0.0007 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 3.6% | `electrotechnology` | 0.0465 | 0.0160 | **over** | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 3.3% | `time_period` | 0.0003 | 0.0119 | under | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 3.3% | `psychology` | 0.0199 | 0.0030 | **over** | `confidence` 45.5% (226) `module` 19.1% (100) `self` 8.3% (49) `matter` 6.7% (59) |
| 3.1% | `geography` | 0.0011 | 0.0140 | under | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |
| 2.7% | `literature` | 0.0042 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 2.6% | `medicine` | 0.0031 | 0.0177 | under | `uri` 41.7% (301) `type` 12.0% (3,459) `start` 5.7% (1,211) `tmp` 4.7% (328) |

### `tika-serialization/src/test/java`

**13.5%** of the maximum divergence from the repository, against a null median of 6.9% over 999 resamples of the same size — an excess of +6.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 16.8% | `computer-languages` | 0.1042 | 0.0198 | **over** | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 5.9% | `publishing` | 0.0002 | 0.0174 | under | `table` 32.0% (856) `page` 18.5% (554) `text` 13.5% (2,092) `read` 9.2% (311) |
| 4.0% | `time_period` | 0.0001 | 0.0119 | under | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 3.8% | `hydraulics` | 0.0000 | 0.0103 | under | `pipe` 100.0% (1,025) `module` 0.0% (100) `accumulator` 0.0% (9) |
| 2.9% | `computing` | 0.3964 | 0.3089 | **over** | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 2.8% | `networking` | 0.0008 | 0.0110 | under | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 2.2% | `algebra` | 0.0013 | 0.0105 | under | `content` 76.2% (2,501) `unknown` 8.2% (275) `normalizer` 4.6% (16) `index` 3.8% (909) |
| 2.0% | `metrology` | 0.0001 | 0.0061 | under | `array` 29.6% (803) `entropy` 14.0% (90) `rate` 7.5% (140) `measurement` 5.9% (13) |

### `tika-server/tika-server-core/src/main/java`

**19.3%** of the maximum divergence from the repository, against a null median of 6.0% over 999 resamples of the same size — an excess of +13.3 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 18.9% | `networking` | 0.1162 | 0.0110 | **over** | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 13.4% | `commerce` | 0.0748 | 0.0053 | **over** | `server` 69.0% (669) `packet` 11.0% (73) `package` 6.2% (206) `quote` 5.0% (66) |
| 6.7% | `literature` | 0.0778 | 0.0204 | **over** | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |
| 4.8% | `industry` | 0.0001 | 0.0197 | under | `test` 81.6% (3,756) `extractor` 6.7% (394) `factory` 2.5% (524) `process` 1.9% (117) |
| 3.5% | `sociology` | 0.0247 | 0.0032 | **over** | `status` 60.5% (290) `priority` 7.2% (33) `class` 6.1% (1,451) `common` 5.8% (248) |
| 3.2% | `programming` | 0.0180 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 2.8% | `computer-languages` | 0.0026 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 2.7% | `mathematics` | 0.0054 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |

### `tika-server/tika-server-core/src/test/java`

**17.0%** of the maximum divergence from the repository, against a null median of 8.4% over 999 resamples of the same size — an excess of +8.6 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 14.3% | `networking` | 0.0873 | 0.0110 | **over** | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 7.9% | `law` | 0.0908 | 0.0265 | **over** | `file` 18.2% (10,159) `client` 13.5% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 6.2% | `anatomy` | 0.0370 | 0.0045 | **over** | `body` 40.9% (407) `socket` 18.1% (139) `iter` 8.4% (11) `colon` 5.8% (23) |
| 5.0% | `programming` | 0.0139 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 4.8% | `ecology` | 0.0182 | 0.0003 | **over** | `tl` 75.1% (40) `consumer` 17.2% (49) `range` 2.9% (291) `crash` 2.8% (172) |
| 4.7% | `electrotechnology` | 0.0000 | 0.0160 | under | `detector` 99.7% (1,108) `wire` 0.3% (3) `wiring` 0.0% (7) `soar` 0.0% (1) |
| 4.7% | `linguistics` | 0.0331 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 3.9% | `translation-studies` | 0.0182 | 0.0011 | **over** | `ti` 67.4% (1,144) `tl` 14.9% (40) `source_text` 7.7% (12) `source_language` 3.1% (75) |

### `tika-server/tika-server-standard/src/main/java`

**31.4%** of the maximum divergence from the repository, against a null median of 33.5% over 999 resamples of the same size — an excess of -2.1 points, and 592 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-server/tika-server-standard/src/test/java`

**21.2%** of the maximum divergence from the repository, against a null median of 11.9% over 999 resamples of the same size — an excess of +9.2 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 13.0% | `person` | 0.1099 | 0.0168 | **over** | `reader` 40.8% (376) `child` 11.1% (294) `mapper` 10.0% (309) `logger` 7.0% (39) |
| 9.8% | `networking` | 0.0784 | 0.0110 | **over** | `resource` 32.6% (733) `http` 32.5% (2,679) `request` 19.6% (692) `mime` 3.6% (596) |
| 7.5% | `programming` | 0.0054 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 6.7% | `computer-languages` | 0.0805 | 0.0198 | **over** | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 5.3% | `mathematics` | 0.0005 | 0.0258 | under | `count` 21.2% (923) `value` 9.3% (1,865) `from` 6.3% (242) `rel` 6.1% (66) |
| 4.2% | `linguistics` | 0.0305 | 0.0826 | under | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 2.7% | `time_period` | 0.0001 | 0.0119 | under | `extension` 47.4% (474) `future` 10.5% (90) `current` 8.6% (269) `year` 6.8% (24) |
| 2.4% | `computing` | 0.4088 | 0.3089 | **over** | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |

### `tika-translate/src/main/java`

**17.6%** of the maximum divergence from the repository, against a null median of 14.9% over 999 resamples of the same size — an excess of +2.7 points, and 185 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-translate/src/test/java`

**41.5%** of the maximum divergence from the repository, against a null median of 16.9% over 999 resamples of the same size — an excess of +24.7 points, and 0 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 17.1% | `botany` | 0.1542 | 0.0017 | **over** | `translator` 25.4% (126) `test` 13.6% (5,626) `key` 8.5% (1,621) `offset` 8.4% (444) |
| 13.3% | `linguistics` | 0.3240 | 0.0826 | **over** | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 10.8% | `software` | 0.1083 | 0.0034 | **over** | `shift_jis` 13.0% (59) `pdf` 12.0% (134) `factory_class` 11.5% (20) `excel` 9.8% (98) |
| 5.8% | `programming` | 0.0006 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 3.2% | `computer_science` | 0.0000 | 0.0263 | under | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |
| 2.7% | `law` | 0.0007 | 0.0265 | under | `file` 18.2% (10,159) `client` 13.5% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 2.4% | `computer-languages` | 0.0000 | 0.0198 | under | `json` 58.7% (623) `xml` 40.2% (368) `sql` 0.6% (36) `java` 0.3% (222) |
| 2.1% | `medicine` | 0.0000 | 0.0177 | under | `uri` 41.7% (301) `type` 12.0% (3,459) `start` 5.7% (1,211) `tmp` 4.7% (328) |

### `tika-xmp/src/main/java`

**23.1%** of the maximum divergence from the repository, against a null median of 15.9% over 999 resamples of the same size — an excess of +7.2 points, and 20 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `tika-xmp/src/test/java`

**34.0%** of the maximum divergence from the repository, against a null median of 33.9% over 999 resamples of the same size — an excess of +0.1 points, and 495 of those draws diverged at least as far. **The scope does not stand outside its own null**, so it has no topical content beyond its size and nothing is ranked.

### `documentation`

**30.8%** of the maximum divergence from the repository, against a null median of 18.3% over 999 resamples of the same size — an excess of +12.5 points, and 2 of those draws diverged at least as far. The scope stands outside its own null, so its topics are ranked below.

| Share of the divergence | Topic | In scope | In repository | | Carried by |
|--:|---|--:|--:|---|---|
| 20.7% | `law` | 0.2230 | 0.0265 | **over** | `file` 18.2% (10,159) `client` 13.5% (715) `allow` 2.4% (362) `retry` 2.3% (51) |
| 14.2% | `geography` | 0.1414 | 0.0140 | **over** | `stream` 22.1% (1,670) `main` 7.5% (107) `apache` 7.1% (6,823) `state` 6.9% (273) |
| 10.0% | `computing` | 0.1209 | 0.3089 | under | `metadata` 26.2% (4,114) `parser` 6.0% (2,583) `config` 6.0% (1,342) `byte` 3.6% (2,991) |
| 7.0% | `linguistics` | 0.2132 | 0.0826 | **over** | `name` 32.6% (3,791) `context` 19.3% (2,253) `prefix` 6.2% (600) `parse` 6.2% (2,824) |
| 4.1% | `physics` | 0.0421 | 0.0045 | **over** | `length` 58.4% (1,225) `weight` 12.7% (122) `free_space` 9.8% (26) `sql` 1.9% (36) |
| 3.2% | `programming` | 0.0119 | 0.0521 | under | `handler` 43.6% (1,912) `factory` 4.5% (525) `tmp` 3.0% (328) `context` 2.5% (2,253) |
| 2.3% | `computer_science` | 0.0037 | 0.0263 | under | `parser` 22.4% (2,583) `byte` 20.6% (2,991) `url` 12.3% (460) `format` 9.7% (615) |
| 2.1% | `literature` | 0.0020 | 0.0204 | under | `header` 42.0% (1,036) `writer` 16.6% (284) `text` 12.3% (2,092) `author` 11.2% (173) |

Read, compared and resampled in 64.7 s, recorded rather than estimated.
