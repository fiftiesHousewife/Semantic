# Self-reading — tika

A reading of this repository's own Java sources by the library that reads repositories, over a
parse of the working tree. What it reads is what this repository **declared** — its types,
methods, fields, parameters and locals — the **prose** it wrote in javadoc and comments, and the
**dependencies** it named that are neither the platform's nor its own.

Everything else a Java file contains is somebody else's vocabulary quoted: `String`, `List` and
`assertThat` are uses of declarations the platform and the test framework made, and a use is not
a word this codebase chose. Only a parse can tell the two apart, which is why this reading needs
one. λ is the share of those word occurrences at least one bundled resource can be cited for.

| Scope | Files | Declarations | Words in names | Words in prose | Read | λ |
|---|--:|--:|--:|--:|--:|--:|
| `tika-annotation-processor/src/main/java` | 3 | 90 | 157 | 1,429 (90.1%) | 1,570 | **0.990** |
| `tika-annotation-processor/src/test/java` | 1 | 9 | 35 | 126 (78.3%) | 161 | **1.000** |
| `tika-app/src/main/java` | 5 | 679 | 1,104 | 3,449 (75.8%) | 4,439 | **0.975** |
| `tika-app/src/test/java` | 4 | 349 | 738 | 1,925 (72.3%) | 2,618 | **0.983** |
| `tika-bundles/tika-bundle-standard/src/main/java` | 1 | 11 | 24 | 134 (84.8%) | 158 | **1.000** |
| `tika-bundles/tika-bundle-standard/src/test/java` | 1 | 44 | 84 | 235 (73.7%) | 314 | **0.984** |
| `tika-core/src/main/java` | 323 | 8,183 | 15,063 | 101,361 (87.1%) | 114,901 | **0.987** |
| `tika-core/src/test/java` | 83 | 3,080 | 6,255 | 18,531 (74.8%) | 24,353 | **0.983** |
| `tika-detectors/tika-detector-magika/src/main/java` | 1 | 104 | 212 | 315 (59.8%) | 493 | **0.935** |
| `tika-detectors/tika-detector-magika/src/test/java` | 2 | 19 | 43 | 495 (92.0%) | 516 | **0.959** |
| `tika-detectors/tika-detector-siegfried/src/main/java` | 1 | 93 | 192 | 235 (55.0%) | 420 | **0.984** |
| `tika-detectors/tika-detector-siegfried/src/test/java` | 2 | 20 | 41 | 250 (85.9%) | 290 | **0.997** |
| `tika-e2e-tests/tika-grpc/src/test/java` | 4 | 259 | 505 | 662 (56.7%) | 1,154 | **0.989** |
| `tika-e2e-tests/tika-server/src/test/java` | 2 | 131 | 228 | 720 (75.9%) | 922 | **0.973** |
| `tika-encoding-detectors/tika-encoding-detector-html/src/main/java` | 9 | 210 | 377 | 2,314 (86.0%) | 2,611 | **0.970** |
| `tika-encoding-detectors/tika-encoding-detector-html/src/test/java` | 2 | 129 | 254 | 815 (76.2%) | 1,022 | **0.956** |
| `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java` | 9 | 592 | 1,121 | 4,884 (81.3%) | 5,681 | **0.946** |
| `tika-encoding-detectors/tika-encoding-detector-icu4j/src/test/java` | 1 | 33 | 62 | 184 (74.8%) | 237 | **0.963** |
| `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/main/java` | 13 | 897 | 1,420 | 14,010 (90.8%) | 14,564 | **0.944** |
| `tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java` | 17 | 742 | 1,484 | 5,325 (78.2%) | 6,378 | **0.937** |
| `tika-encoding-detectors/tika-encoding-detector-universal/src/main/java` | 2 | 46 | 92 | 400 (81.3%) | 461 | **0.937** |
| `tika-eval/tika-eval-app/src/main/java` | 31 | 1,611 | 3,318 | 5,679 (63.1%) | 8,856 | **0.984** |
| `tika-eval/tika-eval-app/src/test/java` | 10 | 318 | 565 | 1,570 (73.5%) | 2,117 | **0.992** |
| `tika-eval/tika-eval-core/src/main/java` | 35 | 650 | 1,389 | 6,055 (81.3%) | 7,286 | **0.979** |
| `tika-eval/tika-eval-core/src/test/java` | 7 | 190 | 300 | 1,761 (85.4%) | 1,966 | **0.954** |
| `tika-example/src/main/java` | 37 | 834 | 1,485 | 7,651 (83.7%) | 9,017 | **0.987** |
| `tika-example/src/test/java` | 10 | 73 | 185 | 1,444 (88.6%) | 1,620 | **0.994** |
| `tika-grpc/src/main/java` | 3 | 238 | 593 | 1,095 (64.9%) | 1,617 | **0.958** |
| `tika-grpc/src/test/java` | 4 | 265 | 559 | 1,236 (68.9%) | 1,748 | **0.974** |
| `tika-handlers/tika-handler-boilerpipe/src/main/java` | 1 | 89 | 194 | 386 (66.6%) | 559 | **0.964** |
| `tika-integration-tests/tika-pipes-es-integration-tests/src/test/java` | 2 | 192 | 337 | 747 (68.9%) | 1,061 | **0.979** |
| `tika-integration-tests/tika-pipes-kafka-integration-tests/src/test/java` | 1 | 45 | 96 | 219 (69.5%) | 310 | **0.984** |
| `tika-integration-tests/tika-pipes-opensearch-integration-tests/src/test/java` | 2 | 153 | 280 | 654 (70.0%) | 913 | **0.978** |
| `tika-integration-tests/tika-pipes-s3-integration-tests/src/test/java` | 2 | 83 | 134 | 340 (71.7%) | 440 | **0.928** |
| `tika-integration-tests/tika-pipes-solr-integration-tests/src/test/java` | 5 | 83 | 194 | 708 (78.5%) | 865 | **0.959** |
| `tika-integration-tests/tika-resource-loading-tests/src/test/java` | 2 | 15 | 23 | 240 (91.3%) | 263 | **1.000** |
| `tika-integration-tests/tika-woodstox-tests/src/test/java` | 1 | 57 | 102 | 340 (76.9%) | 422 | **0.955** |
| `tika-java7/src/main/java` | 2 | 7 | 19 | 279 (93.6%) | 298 | **1.000** |
| `tika-java7/src/test/java` | 1 | 20 | 57 | 141 (71.2%) | 196 | **0.990** |
| `tika-langdetect/tika-langdetect-charsoup-core/src/main/java` | 8 | 741 | 1,217 | 4,444 (78.5%) | 5,335 | **0.942** |
| `tika-langdetect/tika-langdetect-charsoup/src/main/java` | 3 | 197 | 322 | 1,973 (86.0%) | 2,217 | **0.966** |
| `tika-langdetect/tika-langdetect-charsoup/src/test/java` | 34 | 3,453 | 5,472 | 14,322 (72.4%) | 18,754 | **0.947** |
| `tika-langdetect/tika-langdetect-lingo24/src/main/java` | 1 | 56 | 125 | 249 (66.6%) | 355 | **0.949** |
| `tika-langdetect/tika-langdetect-lingo24/src/test/java` | 1 | 10 | 16 | 151 (90.4%) | 164 | **0.982** |
| `tika-langdetect/tika-langdetect-mitll-text/src/main/java` | 1 | 47 | 99 | 153 (60.7%) | 243 | **0.964** |
| `tika-langdetect/tika-langdetect-mitll-text/src/test/java` | 1 | 8 | 11 | 127 (92.0%) | 137 | **0.993** |
| `tika-langdetect/tika-langdetect-opennlp/src/main/java` | 3 | 169 | 380 | 1,233 (76.4%) | 1,541 | **0.955** |
| `tika-langdetect/tika-langdetect-opennlp/src/test/java` | 1 | 11 | 22 | 120 (84.5%) | 140 | **0.986** |
| `tika-langdetect/tika-langdetect-optimaize/src/main/java` | 2 | 71 | 191 | 437 (69.6%) | 605 | **0.963** |
| `tika-langdetect/tika-langdetect-optimaize/src/test/java` | 1 | 40 | 62 | 405 (86.7%) | 455 | **0.974** |
| `tika-langdetect/tika-langdetect-test-commons/src/main/java` | 1 | 29 | 48 | 120 (71.4%) | 167 | **0.994** |
| `tika-metadata-schema/src/main/java` | 3 | 228 | 300 | 1,643 (84.6%) | 1,886 | **0.971** |
| `tika-metadata-schema/src/test/java` | 8 | 146 | 277 | 1,797 (86.6%) | 2,033 | **0.980** |
| `tika-ml/tika-ml-chardetect/src/main/java` | 6 | 752 | 1,135 | 4,866 (81.1%) | 5,597 | **0.933** |
| `tika-ml/tika-ml-chardetect/src/test/java` | 1 | 25 | 67 | 239 (78.1%) | 301 | **0.984** |
| `tika-ml/tika-ml-core/src/main/java` | 3 | 176 | 259 | 1,269 (83.0%) | 1,487 | **0.973** |
| `tika-ml/tika-ml-core/src/test/java` | 1 | 37 | 78 | 186 (70.5%) | 262 | **0.992** |
| `tika-ml/tika-ml-junkdetect-tools/src/main/java` | 7 | 906 | 1,414 | 6,134 (81.3%) | 7,202 | **0.954** |
| `tika-ml/tika-ml-junkdetect-tools/src/test/java` | 4 | 416 | 761 | 3,320 (81.4%) | 3,908 | **0.958** |
| `tika-ml/tika-ml-junkdetect/src/main/java` | 6 | 747 | 1,225 | 9,303 (88.4%) | 9,771 | **0.928** |
| `tika-ml/tika-ml-junkdetect/src/test/java` | 8 | 493 | 973 | 4,064 (80.7%) | 4,764 | **0.946** |
| `tika-parsers/tika-http-jdk/src/main/java` | 1 | 74 | 146 | 707 (82.9%) | 828 | **0.971** |
| `tika-parsers/tika-http-jdk/src/test/java` | 2 | 113 | 199 | 790 (79.9%) | 972 | **0.983** |
| `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/main/java` | 2 | 114 | 252 | 600 (70.4%) | 848 | **0.995** |
| `tika-parsers/tika-parsers-extended/tika-parser-ocr-encode-module/src/test/java` | 2 | 134 | 249 | 378 (60.3%) | 617 | **0.984** |
| `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/main/java` | 9 | 535 | 1,123 | 2,048 (64.6%) | 3,065 | **0.967** |
| `tika-parsers/tika-parsers-extended/tika-parser-scientific-module/src/test/java` | 7 | 115 | 215 | 1,115 (83.8%) | 1,289 | **0.969** |
| `tika-parsers/tika-parsers-extended/tika-parser-scientific-package/src/test/java` | 1 | 15 | 25 | 176 (87.6%) | 198 | **0.985** |
| `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/main/java` | 6 | 111 | 212 | 1,226 (85.3%) | 1,408 | **0.979** |
| `tika-parsers/tika-parsers-extended/tika-parser-sqlite3-module/src/test/java` | 1 | 11 | 22 | 759 (97.2%) | 707 | **0.905** |
| `tika-parsers/tika-parsers-extended/tika-parsers-extended-integration-tests/src/test/java` | 3 | 94 | 157 | 580 (78.7%) | 725 | **0.984** |
| `tika-parsers/tika-parsers-ml/tika-inference/src/main/java` | 15 | 544 | 1,211 | 3,549 (74.6%) | 4,680 | **0.983** |
| `tika-parsers/tika-parsers-ml/tika-inference/src/test/java` | 6 | 244 | 427 | 904 (67.9%) | 1,324 | **0.995** |
| `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java` | 24 | 1,002 | 2,148 | 5,884 (73.3%) | 7,837 | **0.976** |
| `tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/test/java` | 6 | 58 | 92 | 741 (89.0%) | 830 | **0.996** |
| `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/main/java` | 2 | 207 | 507 | 1,437 (73.9%) | 1,886 | **0.970** |
| `tika-parsers/tika-parsers-ml/tika-parser-tess4j-module/src/test/java` | 4 | 161 | 337 | 936 (73.5%) | 1,248 | **0.980** |
| `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/main/java` | 2 | 129 | 453 | 686 (60.2%) | 1,097 | **0.963** |
| `tika-parsers/tika-parsers-ml/tika-transcribe-aws/src/test/java` | 1 | 89 | 202 | 719 (78.1%) | 898 | **0.975** |
| `tika-parsers/tika-parsers-ml/tika-vlm/src/main/java` | 6 | 468 | 1,142 | 2,002 (63.7%) | 3,074 | **0.978** |
| `tika-parsers/tika-parsers-ml/tika-vlm/src/test/java` | 5 | 251 | 491 | 778 (61.3%) | 1,257 | **0.991** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java` | 75 | 2,180 | 4,207 | 17,385 (80.5%) | 21,065 | **0.976** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/main/java` | 11 | 599 | 1,191 | 2,362 (66.5%) | 3,440 | **0.968** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-apple-module/src/test/java` | 6 | 131 | 276 | 1,315 (82.7%) | 1,543 | **0.970** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/main/java` | 33 | 1,597 | 2,908 | 11,755 (80.2%) | 13,975 | **0.953** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-audiovideo-module/src/test/java` | 15 | 402 | 869 | 4,889 (84.9%) | 5,467 | **0.949** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/main/java` | 8 | 335 | 728 | 2,079 (74.1%) | 2,681 | **0.955** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-cad-module/src/test/java` | 4 | 104 | 188 | 614 (76.6%) | 785 | **0.979** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/main/java` | 7 | 346 | 698 | 1,454 (67.6%) | 2,070 | **0.962** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-code-module/src/test/java` | 6 | 76 | 159 | 800 (83.4%) | 947 | **0.987** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/main/java` | 4 | 247 | 600 | 1,096 (64.6%) | 1,599 | **0.943** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-crypto-module/src/test/java` | 5 | 52 | 126 | 780 (86.1%) | 888 | **0.980** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/main/java` | 3 | 42 | 94 | 433 (82.2%) | 520 | **0.987** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-datauri-commons/src/test/java` | 1 | 17 | 40 | 127 (76.0%) | 165 | **0.988** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-digest-commons/src/main/java` | 4 | 90 | 182 | 693 (79.2%) | 838 | **0.958** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/main/java` | 2 | 69 | 188 | 386 (67.2%) | 572 | **0.997** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-font-module/src/test/java` | 1 | 13 | 21 | 167 (88.8%) | 186 | **0.989** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java` | 6 | 244 | 425 | 1,618 (79.2%) | 1,990 | **0.974** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/test/java` | 2 | 341 | 585 | 1,216 (67.5%) | 1,675 | **0.930** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/main/java` | 16 | 688 | 1,552 | 3,761 (70.8%) | 5,170 | **0.973** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-image-module/src/test/java` | 12 | 229 | 408 | 2,443 (85.7%) | 2,767 | **0.971** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-jdbc-commons/src/main/java` | 2 | 138 | 217 | 558 (72.0%) | 763 | **0.985** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java` | 2 | 83 | 194 | 1,003 (83.8%) | 1,120 | **0.936** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/test/java` | 2 | 40 | 75 | 411 (84.6%) | 454 | **0.934** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/main/java` | 3 | 239 | 544 | 911 (62.6%) | 1,404 | **0.965** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-module/src/test/java` | 2 | 136 | 243 | 637 (72.4%) | 854 | **0.970** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java` | 294 | 11,141 | 25,660 | 74,965 (74.5%) | 97,924 | **0.973** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/test/java` | 53 | 1,957 | 4,134 | 12,792 (75.6%) | 16,303 | **0.963** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/main/java` | 40 | 1,597 | 2,963 | 10,016 (77.2%) | 12,641 | **0.974** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-miscoffice-module/src/test/java` | 12 | 285 | 517 | 2,514 (82.9%) | 2,927 | **0.966** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/main/java` | 2 | 203 | 346 | 1,737 (83.4%) | 1,996 | **0.958** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-news-module/src/test/java` | 1 | 14 | 21 | 150 (87.7%) | 171 | **1.000** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/main/java` | 5 | 466 | 902 | 2,239 (71.3%) | 2,986 | **0.951** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-ocr-module/src/test/java` | 2 | 120 | 246 | 406 (62.3%) | 637 | **0.977** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/main/java` | 25 | 1,840 | 4,782 | 9,300 (66.0%) | 13,639 | **0.969** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java` | 7 | 463 | 868 | 3,063 (77.9%) | 3,770 | **0.959** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/main/java` | 10 | 464 | 1,084 | 2,904 (72.8%) | 3,874 | **0.971** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pkg-module/src/test/java` | 15 | 321 | 580 | 3,227 (84.8%) | 3,729 | **0.980** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/main/java` | 11 | 578 | 1,184 | 3,306 (73.6%) | 4,422 | **0.985** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-text-module/src/test/java` | 7 | 218 | 424 | 1,195 (73.8%) | 1,553 | **0.959** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/main/java` | 3 | 151 | 302 | 458 (60.3%) | 740 | **0.974** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-webarchive-module/src/test/java` | 3 | 17 | 41 | 444 (91.5%) | 476 | **0.981** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java` | 15 | 379 | 631 | 2,673 (80.9%) | 3,266 | **0.988** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/test/java` | 7 | 75 | 157 | 891 (85.0%) | 1,037 | **0.990** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/main/java` | 5 | 218 | 299 | 1,748 (85.4%) | 1,993 | **0.974** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xmp-commons/src/test/java` | 3 | 102 | 251 | 1,011 (80.1%) | 1,227 | **0.972** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java` | 16 | 425 | 974 | 4,045 (80.6%) | 4,917 | **0.980** |
| `tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/test/java` | 2 | 28 | 55 | 274 (83.3%) | 329 | **1.000** |
| `tika-pipes/tika-async-cli/src/main/java` | 5 | 304 | 661 | 1,446 (68.6%) | 2,051 | **0.973** |
| `tika-pipes/tika-async-cli/src/test/java` | 4 | 141 | 310 | 1,042 (77.1%) | 1,316 | **0.973** |
| `tika-pipes/tika-httpclient-commons/src/main/java` | 3 | 194 | 630 | 465 (42.5%) | 1,090 | **0.995** |
| `tika-pipes/tika-pipes-api/src/main/java` | 22 | 242 | 481 | 4,096 (89.5%) | 4,529 | **0.990** |
| `tika-pipes/tika-pipes-config-store-ignite/src/main/java` | 5 | 142 | 294 | 768 (72.3%) | 1,058 | **0.996** |
| `tika-pipes/tika-pipes-config-store-ignite/src/test/java` | 1 | 38 | 79 | 130 (62.2%) | 205 | **0.981** |
| `tika-pipes/tika-pipes-core/src/main/java` | 72 | 2,642 | 5,888 | 22,721 (79.4%) | 28,074 | **0.981** |
| `tika-pipes/tika-pipes-core/src/test/java` | 15 | 445 | 978 | 3,638 (78.8%) | 4,499 | **0.975** |
| `tika-pipes/tika-pipes-fork-parser/src/main/java` | 4 | 121 | 261 | 2,970 (91.9%) | 3,160 | **0.978** |
| `tika-pipes/tika-pipes-fork-parser/src/test/java` | 1 | 167 | 309 | 529 (63.1%) | 810 | **0.967** |
| `tika-pipes/tika-pipes-integration-tests/src/test/java` | 23 | 1,425 | 3,007 | 8,117 (73.0%) | 10,828 | **0.973** |
| `tika-pipes/tika-pipes-iterator-commons/src/main/java` | 2 | 48 | 95 | 419 (81.5%) | 501 | **0.975** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java` | 6 | 266 | 699 | 889 (56.0%) | 1,539 | **0.969** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/test/java` | 1 | 5 | 13 | 129 (90.8%) | 137 | **0.965** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/main/java` | 10 | 249 | 641 | 1,486 (69.9%) | 2,089 | **0.982** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-az-blob/src/test/java` | 4 | 54 | 99 | 557 (84.9%) | 646 | **0.985** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/main/java` | 4 | 102 | 237 | 780 (76.7%) | 999 | **0.982** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-csv/src/test/java` | 2 | 52 | 89 | 277 (75.7%) | 361 | **0.986** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/main/java` | 10 | 302 | 677 | 1,697 (71.5%) | 2,345 | **0.988** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-es/src/test/java` | 2 | 54 | 110 | 391 (78.0%) | 495 | **0.988** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/main/java` | 15 | 330 | 744 | 2,205 (74.8%) | 2,898 | **0.983** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-file-system/src/test/java` | 7 | 180 | 370 | 1,396 (79.0%) | 1,725 | **0.977** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/main/java` | 10 | 187 | 447 | 1,377 (75.5%) | 1,794 | **0.984** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-gcs/src/test/java` | 4 | 66 | 111 | 548 (83.2%) | 649 | **0.985** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/main/java` | 4 | 99 | 283 | 512 (64.4%) | 776 | **0.976** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-google-drive/src/test/java` | 1 | 5 | 14 | 129 (90.2%) | 141 | **0.986** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/main/java` | 9 | 361 | 996 | 1,373 (58.0%) | 2,309 | **0.975** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-http/src/test/java` | 4 | 92 | 181 | 640 (78.0%) | 798 | **0.972** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/main/java` | 10 | 452 | 887 | 1,810 (67.1%) | 2,657 | **0.985** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-jdbc/src/test/java` | 4 | 245 | 375 | 611 (62.0%) | 977 | **0.991** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/main/java` | 4 | 47 | 106 | 524 (83.2%) | 621 | **0.986** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-json/src/test/java` | 2 | 19 | 41 | 258 (86.3%) | 297 | **0.993** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/main/java` | 7 | 164 | 411 | 934 (69.4%) | 1,324 | **0.984** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-kafka/src/test/java` | 2 | 35 | 56 | 288 (83.7%) | 340 | **0.988** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/main/java` | 8 | 131 | 353 | 1,017 (74.2%) | 1,354 | **0.988** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-microsoft-graph/src/test/java` | 2 | 25 | 66 | 249 (79.0%) | 310 | **0.984** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/main/java` | 13 | 338 | 788 | 2,050 (72.2%) | 2,806 | **0.989** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-opensearch/src/test/java` | 2 | 19 | 40 | 269 (87.1%) | 309 | **1.000** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/main/java` | 10 | 358 | 1,000 | 1,426 (58.8%) | 2,318 | **0.955** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-s3/src/test/java` | 3 | 52 | 79 | 416 (84.0%) | 482 | **0.974** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/main/java` | 8 | 250 | 750 | 1,350 (64.3%) | 1,958 | **0.932** |
| `tika-pipes/tika-pipes-plugins/tika-pipes-solr/src/test/java` | 3 | 49 | 176 | 514 (74.5%) | 678 | **0.983** |
| `tika-pipes/tika-pipes-reporter-commons/src/main/java` | 1 | 31 | 47 | 137 (74.5%) | 184 | **1.000** |
| `tika-plugins-core/src/main/java` | 7 | 170 | 391 | 1,868 (82.7%) | 2,174 | **0.962** |
| `tika-plugins-core/src/test/java` | 3 | 130 | 324 | 590 (64.6%) | 908 | **0.993** |
| `tika-serialization/src/main/java` | 34 | 1,186 | 2,550 | 13,365 (84.0%) | 15,538 | **0.976** |
| `tika-serialization/src/test/java` | 35 | 1,328 | 2,682 | 7,895 (74.6%) | 10,397 | **0.983** |
| `tika-server/tika-server-core/src/main/java` | 42 | 1,626 | 3,988 | 11,837 (74.8%) | 15,587 | **0.985** |
| `tika-server/tika-server-core/src/test/java` | 27 | 1,149 | 2,391 | 6,215 (72.2%) | 8,430 | **0.980** |
| `tika-server/tika-server-standard/src/main/java` | 2 | 63 | 167 | 281 (62.7%) | 446 | **0.996** |
| `tika-server/tika-server-standard/src/test/java` | 16 | 810 | 1,706 | 3,856 (69.3%) | 5,477 | **0.985** |
| `tika-translate/src/main/java` | 11 | 423 | 930 | 3,316 (78.1%) | 4,177 | **0.984** |
| `tika-translate/src/test/java` | 9 | 108 | 199 | 1,155 (85.3%) | 1,348 | **0.996** |
| `tika-xmp/src/main/java` | 10 | 294 | 695 | 3,077 (81.6%) | 3,701 | **0.981** |
| `tika-xmp/src/test/java` | 2 | 86 | 266 | 344 (56.4%) | 603 | **0.989** |
| `documentation` | 8 | 0 | 0 | 7,374 (100.0%) | 6,615 | **0.897** |
| **repository** | 2,156 | 81,271 | 166,692 | 602,918 (78.3%) | 748,262 | **0.972** |

The repository's own words are 769,610 occurrences of 14,116 distinct surfaces, 4,919 of them (34.8%) written exactly once. 2,669 glued runs no boundary divided were read by the segmenter; 21,348 occurrences across 4,887 surfaces nothing could be cited for at all.

| Resource | Occurrences it can be cited for | Share | Resting on it alone |
|---|--:|--:|--:|
| `lexicon:word-frequency` | 662,943 | 86.1% | 19,093 |
| `lexicon:wordnet-sense` | 505,737 | 65.7% | 9,631 |
| `lexicon:wiktionary-topic` | 494,665 | 64.3% | 8,030 |
| `lexicon:wordnet-domain` | 355,631 | 46.2% | 5,882 |
| `lexicon:wikidata-initialism` | 340,687 | 44.3% | 2,256 |
| `lexicon:wiktionary-abbreviation` | 290,120 | 37.7% | 1,885 |
| `lexicon:wikidata-name` | 276,053 | 35.9% | 3,279 |
| `catalogue:query-language-function` | 18,230 | 2.4% | 148 |

| Word | Occurrences | First seen |
|---|--:|---|
| `fetcher` | 561 | `tika-app/src/main/java/org/apache/tika/cli/TikaCLI.java:350` |
| `fasterxml` | 339 | `tika-app/src/main/java/org/apache/tika/cli/XmlToJsonConfigConverter.java:36` |
| `utils` | 236 | `tika-app/src/main/java/org/apache/tika/gui/TikaGUI.java:69` |
| `doesn't` | 179 | `tika-app/src/main/java/org/apache/tika/cli/TikaCLI.java:223` |
| `solr` | 144 | `tika-core/src/test/java/org/apache/tika/MultiThreadedTikaTest.java:58` |
| `poifs` | 139 | `tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java/org/apache/tika/config/ComponentRegistryIntegrationTest.java:51` |
| `charsets` | 138 | `tika-core/src/main/java/org/apache/tika/detect/BOMDetector.java:59` |
| `can't` | 135 | `tika-app/src/main/java/org/apache/tika/cli/TikaCLI.java:1180` |
| `1252` | 129 | `tika-core/src/main/java/org/apache/tika/detect/AutoDetectReader.java:133` |
| `codepoints` | 128 | `tika-core/src/main/java/org/apache/tika/detect/HighByteLetterStats.java:56` |
| `8859` | 126 | `tika-core/src/main/java/org/apache/tika/detect/AutoDetectReader.java:129` |
| `codepoint` | 122 | `tika-encoding-detectors/tika-encoding-detector-icu4j/src/main/java/org/apache/tika/detect/icu4j/CharsetRecog_sbcs.java:1636` |
| `0x` | 121 | `tika-core/src/main/java/org/apache/tika/detect/HighByteLetterStats.java:56` |
| `langs` | 121 | `tika-eval/tika-eval-app/src/main/java/org/apache/tika/eval/app/tools/CommonTokenOverlapCounter.java:57` |
| `configs` | 118 | `tika-app/src/main/java/org/apache/tika/cli/TikaCLI.java:1019` |

Read 2,156 files in 10.5 s — 4.9 ms a file, recorded rather than estimated.

Imports read as this repository's own choice: 2908. Set aside as the platform's own vocabulary: 9240. Set aside as this repository's own coordinates: 8745. Set aside as the toolchain a source set nothing is published from is checked with: 3061. Files the parser refused: 0.