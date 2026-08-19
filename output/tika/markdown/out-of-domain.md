# A vocabulary of another field — tika

A domain vocabulary is worth something only where it fires on a repository in its domain and
stays quiet on one outside it. Both vocabularies below are matched against the same declared
names, by the same splitter and the same corroboration rule.

**The figure is matched spans per thousand declared names.** A count on its own would say more
about how many terms a publisher wrote than about this repository.

| Vocabulary | Terms published | Spans | Per thousand names | Distinct terms | Files matched | Longer than one word |
|---|--:|--:|--:|--:|--:|--:|
| OLiA | 1312 | 6082 | 104.93 | 171 | 1453 | 17 |
| FIBO | 1833 | 1195 | 20.62 | 62 | 414 | 13 |

## Every term the out-of-domain vocabulary matched

Named in full, because a rate says how loud a vocabulary was and only the terms say what it
was hearing. Each row is a word FIBO publishes as a term of finance and this repository
declares in some other sense.

| Term | Occurrences | Concept FIBO publishes under it | First site |
|---|--:|---|---|
| `index` | 481 | Index | tika-annotation-processor/src/main/java/org/apache/tika/annotation/TikaComponentProcessor.java:206 |
| `request` | 170 | Request | tika-app/src/main/java/org/apache/tika/gui/TikaGUI.java:628 |
| `control` | 75 | Control | tika-core/src/main/java/org/apache/tika/detect/TextDetector.java:76 |
| `strategy` | 42 | Strategy | tika-core/src/main/java/org/apache/tika/io/SpoolingStrategy.java:46 |
| `requested` | 36 | Request | tika-core/src/main/java/org/apache/tika/config/ParseTimeout.java:178 |
| `scheme` | 33 | Strategy | tika-core/src/main/java/org/apache/tika/metadata/XMPIdq.java:34 |
| `action` | 37 | Action | tika-app/src/main/java/org/apache/tika/gui/TikaGUI.java:264 |
| `address` | 32 | Address | tika-core/src/main/java/org/apache/tika/metadata/IPTC.java:410 |
| `futures` | 19 | Future | tika-core/src/test/java/org/apache/tika/detect/MagicDetectorTest.java:291 |
| `indices` | 18 | Index | tika-core/src/main/java/org/apache/tika/metadata/PageAnchoring.java:106 |
| `method` | 20 | Method | tika-app/src/main/java/org/apache/tika/cli/TikaCLI.java:411 |
| `mean` | 20 | Mean | tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java/org/apache/tika/ml/chardetect/CalibrateTopK.java:316 |
| `requests` | 16 | Request | tika-core/src/main/java/org/apache/tika/renderer/CompositeRenderer.java:61 |
| `minor` | 14 | Minor | tika-core/src/main/java/org/apache/tika/metadata/IPTC.java:953 |
| `kept` | 14 | Holding | tika-langdetect/tika-langdetect-charsoup/src/test/java/org/apache/tika/langdetect/charsoup/tools/TrainLanguageModel.java:746 |
| `keep` | 16 | Holding | tika-core/src/main/java/org/apache/tika/parser/multiple/AbstractMultipleParser.java:351 |
| `options` | 13 | Option | tika-app/src/test/java/org/apache/tika/cli/AsyncHelperTest.java:93 |
| `person` | 13 | Person | tika-core/src/main/java/org/apache/tika/metadata/IPTC.java:568 |
| `affiliations` | 7 | Affiliation | tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java/org/apache/tika/parser/journal/TEIDOMParser.java:194 |
| `plus` | 9 | Asset | tika-core/src/main/java/org/apache/tika/metadata/IPTC.java:37 |
| `rights` | 9 | Right | tika-core/src/main/java/org/apache/tika/metadata/DublinCore.java:159 |
| `actions` | 8 | Action | tika-app/src/main/java/org/apache/tika/gui/ParsingTransferHandler.java:119 |
| `keeps` | 7 | Holding | tika-core/src/test/java/org/apache/tika/extractor/EmbeddedDocumentUtilExtensionTest.java:106 |
| `affiliation` | 6 | Affiliation | tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java/org/apache/tika/parser/journal/TEIDOMParser.java:534 |
| `service providers` | 5 | ServiceProvider | tika-core/src/main/java/org/apache/tika/config/ServiceLoader.java:231 |
| `responsible party` | 5 | ResponsibleParty | tika-core/src/main/java/org/apache/tika/metadata/ISO19115.java:40 |
| `option` | 6 | Option | tika-app/src/test/java/org/apache/tika/cli/TikaCLITest.java:633 |
| `median` | 5 | Median | tika-langdetect/tika-langdetect-charsoup/src/test/java/org/apache/tika/langdetect/charsoup/tools/BucketSaturationAnalyzer.java:134 |
| `controls` | 5 | Control | tika-encoding-detectors/tika-encoding-detector-mojibuster/src/test/java/org/apache/tika/ml/chardetect/Utf16ColumnFeatureExtractorTest.java:331 |
| `set window` | 4 | PutWindow | tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java/org/apache/tika/parser/microsoft/chm/ChmLzxState.java:206 |
| `addresses` | 4 | Address | tika-parsers/tika-parsers-ml/tika-parser-nlp-module/src/main/java/org/apache/tika/parser/journal/TEIDOMParser.java:286 |
| `interest` | 5 | Interest | tika-eval/tika-eval-app/src/main/java/org/apache/tika/eval/app/ProfilerBase.java:98 |
| `persons` | 3 | Person | tika-core/src/main/java/org/apache/tika/metadata/Office.java:193 |
| `methods` | 3 | Method | tika-serialization/src/test/java/org/apache/tika/config/AllLimitsTest.java:125 |
| `tester` | 2 | Examiner | tika-eval/tika-eval-app/src/test/java/org/apache/tika/eval/app/db/AbstractBufferTest.java:88 |
| `generated resource` | 2 | GeneratedResource | tika-core/src/main/java/org/apache/tika/extractor/EmbeddedDocumentUtil.java:227 |
| `organization name` | 2 | OrganizationName | tika-core/src/main/java/org/apache/tika/metadata/ISO19115.java:46 |
| `future` | 3 | Future | tika-pipes/tika-pipes-core/src/main/java/org/apache/tika/pipes/core/async/AsyncEmitter.java:47 |
| `real property` | 2 | RealProperty | tika-core/src/test/java/org/apache/tika/metadata/MetadataTypedAccessorsTest.java:38 |
| `holding` | 2 | Holding | tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-xml-module/src/main/java/org/apache/tika/parser/xml/AttributeDependantMetadataHandler.java:41 |
| `testers` | 1 | Examiner | tika-eval/tika-eval-app/src/test/java/org/apache/tika/eval/app/db/AbstractBufferTest.java:52 |
| `indexed` | 1 | Index | tika-core/src/main/java/org/apache/tika/metadata/Photoshop.java:42 |
| `indexes` | 1 | Index | tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-zip-commons/src/main/java/org/apache/tika/detect/zip/FrictionlessPackageDetector.java:39 |
| `generate resource` | 1 | GeneratedResource | tika-core/src/main/java/org/apache/tika/extractor/EmbeddedDocumentUtil.java:214 |
| `relationships manager` | 1 | RelationshipManager | tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java/org/apache/tika/parser/microsoft/ooxml/xwpf/ml2006/RelationshipsManager.java:25 |
| `swap` | 1 | Swap | tika-core/src/main/java/org/apache/tika/metadata/filter/LegacyKeyMigrationFilter.java:238 |
| `street address` | 1 | StreetAddress | tika-core/src/main/java/org/apache/tika/metadata/IPTC.java:909 |
| `schemes` | 1 | Strategy | tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-html-module/src/main/java/org/apache/tika/parser/html/HtmlHandler.java:402 |
| `balanced` | 1 | Balance | tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-pdf-module/src/test/java/org/apache/tika/parser/pdf/PDFParserTest.java:1061 |
| `phone number` | 1 | TelephoneNumber | tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/resources/test-documents/testPhoneNumberExtractor.odt:1 |
| `service resources` | 1 | ServiceResource | tika-core/src/main/java/org/apache/tika/config/ServiceLoader.java:213 |
| `set feature` | 1 | PutFeature | tika-serialization/src/test/java/org/apache/tika/config/loader/ConfigLoaderTest.java:116 |
| `asset` | 1 | Asset | tika-parsers/tika-parsers-standard/tika-parsers-standard-integration-tests/src/test/java/org/apache/tika/parser/AndroidBinaryXMLTest.java:99 |
| `day of week` | 1 | DayOfWeek | tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-mail-commons/src/main/java/org/apache/tika/parser/mailcommons/MailDateParser.java:112 |
| `controlled` | 1 | Control | tika-core/src/main/java/org/apache/tika/metadata/IPTC.java:531 |
| `interesting` | 1 | Interest | tika-parsers/tika-parsers-standard/tika-parsers-standard-modules/tika-parser-microsoft-module/src/main/java/org/apache/tika/parser/microsoft/ooxml/XSSFExcelExtractorDecorator.java:1176 |
| `claims` | 1 | Claim | tika-pipes/tika-pipes-plugins/tika-pipes-atlassian-jwt/src/main/java/org/apache/tika/pipes/fetcher/atlassianjwt/AtlassianJwtGenerator.java:61 |
| `difference` | 1 | Difference | tika-server/tika-server-standard/src/test/java/org/apache/tika/server/standard/UnpackerResourceTest.java:627 |
| `individual` | 1 | Person | tika-serialization/src/test/java/org/apache/tika/config/AllLimitsTest.java:106 |
| `means` | 1 | Mean | tika-core/src/test/java/org/apache/tika/metadata/TestPageAnchoring.java:43 |
| `held` | 1 | Holding | tika-core/src/test/java/org/apache/tika/parser/CompositeParserTest.java:181 |
| `party` | 1 | Party | tika-core/src/main/java/org/apache/tika/metadata/ISO19115.java:36 |
