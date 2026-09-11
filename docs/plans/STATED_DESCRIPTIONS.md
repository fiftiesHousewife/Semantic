# Stated descriptions

Where a matched concept's prose comes from, and what a survey of the twelve committed readings says about each place it comes from. [`StatedDescriptions`](../../skos-matching/src/main/java/io/github/fiftieshousewife/codesemantics/engine/term/StatedDescriptions.java) takes the prose for a concept from the nearest node at or above it that its publisher says anything about, following the publisher's own placement, and the export publishes the prose as `description`, the node it was stated for as `descriptionStatedFor`, and the publisher's chain of parents as `statedPath` — so a reader can see how far above the concept the prose sits.

## The survey

Every concept is counted once per vocabulary across the twelve committed readings, 846 in all.

| Where the prose was found | Concepts |
|---|--:|
| at the concept's own node | 556 |
| one step above | 127 |
| two or more steps above | 102 |
| nowhere at or above it | 61 |

The three questions this survey left open are each measured below. No bar, placement or theme reads the prose, so a repair here moves what the export says about a match and leaves every verdict where it was.

## A description taken two or more steps up is usually about something else

All 102 concepts that take their prose from two or more steps above sit in CSO. Each was read beside the declared names that matched it, member by member, and judged on one question: does the prose describe the subject those repositories wrote that name for? Three outcomes cover all 102.

| The prose describes | Concepts |
|---|--:|
| a subject the matching repositories do not write | 58 |
| a broad field that says nothing about the concept | 25 |
| the concept as the repositories wrote it | 19 |

One worked example of each outcome:

- **A subject the repositories do not write.** besu writes `caching` 28 times and `cached` 88 times, meaning in-memory software caches. The nearest described ancestor is `microprocessor chips`, whose prose describes the integrated circuit that carries a CPU. The prose is two steps up and about hardware the repository never mentions.
- **A broad field.** besu writes `byte code` 24 times, meaning EVM bytecode. The nearest described ancestor is `computer programming languages`, whose prose defines computer programming. True of every repository in the corpus, so it distinguishes nothing.
- **The concept itself.** aeron writes `challenge response` 37 times, meaning its authentication handshake. The nearest described ancestor is `authentication`, whose prose defines authentication. Two steps up and still the subject aeron wrote.

The complete lists, each concept with the node its prose was stated for, so the judgment can be checked:

**A subject the repositories do not write (58):** `3g` (telecommunication traffic), `4g` (telecommunication traffic), `audio` (speech recognition), `audio files` (speech recognition), `audio stream` (speech recognition), `boosting` (classifiers), `boundary values` (approximation theory), `caching` (microprocessor chips), `character sets` (pattern recognition), `check nodes` (bit error rate), `code length` (bit error rate), `contracts` (information technology), `css` (human computer interaction), `data caches` (microprocessor chips), `data matrices` (matrix algebra), `decryption` (cryptography), `document frequency` (machine learning), `encryption/decryption` (cryptography), `extracting information` (data mining), `hog` (classifiers), `html` (human computer interaction), `intermediate node` (internet protocols), `least recently used` (microprocessor chips), `listening tests` (speech recognition), `load control` (load-frequency control), `message delivery` (internet protocols), `most significant bit` (steganography), `multithreaded` (microprocessor chips), `network interface` (human computer interaction), `no-reference` (image analysis), `number of threads` (microprocessor chips), `open services` (global navigation satellite systems), `parallelizing` (microprocessor chips), `priority queues` (queueing theory), `purchase` (information technology), `purchasing` (information technology), `queue` (queueing theory), `queueing delays` (queueing theory), `range size` (data mining), `read operation` (embedded systems), `reasoning` (theoretical computer science), `remote control` (robotics), `retrieval-augmented generation` (artificial intelligence), `retrieved images` (image retrieval), `servers` (computer security), `service contract` (information technology), `son` (mobile telecommunication systems), `source address` (computer crime), `spamming` (computer security), `storage formats` (microprocessor chips), `term frequency` (computational linguistics), `test vectors` (sequential circuits), `usage data` (web mining), `user information` (computer security), `validation` (software quality), `verification` (software quality), `verification method` (software quality), `zero padding` (channel estimation)

**A broad field only (25):** `attribute data` (software), `blogs` (internet), `broker` (software design), `bytecodes` (computer programming languages), `class labels` (computer systems), `consistency checking` (software design), `different frequency` (computer systems), `evaluation index` (computer systems), `failure data` (software engineering), `frequency ranges` (computer systems), `group members` (computer systems), `ins` (software), `java program` (computer programming languages), `layered` (software design), `map matching` (software), `message logging` (computer system recovery), `multi-threading` (computer programming languages), `multiple access` (computer systems), `on-body` (computer systems), `small files` (operating systems), `sub-arrays` (computer systems), `time windows` (computer networks), `transmitters` (computer systems), `user sessions` (internet), `web application` (internet)

**The concept as written (19):** `access permissions` (access control), `broadcast` (internet protocols), `challenge response` (authentication), `compression methods` (image compression), `compression ratio (machinery)` (image compression), `delegation` (access control), `ecc` (cryptography), `embedded images` (digital image storage), `malicious peer` (computer networks), `multicasts` (computer networks), `post-conditions` (software quality), `remote node` (computer networks), `rtt` (congestion control (communication)), `search queries` (information retrieval systems), `shared secrets` (cryptography), `skew angles` (digital image storage), `sms messages` (mobile computing), `source nodes` (internet protocols), `symmetric encryption` (cryptography)

**Three of the ancestors carry prose about the wrong thing at their own node, and CSO states the wrong link itself.** CSO's `owl:sameAs` — the [OWL](https://www.w3.org/TR/owl2-overview/) property asserting two identifiers name one thing — points `classifiers` at the Wikipedia article on Chinese measure words, `human computer interaction` at the article on the historical occupation of human computer, and `sequential circuits` at the article on the synthesizer company Sequential Circuits. The pinned CSO 3.5 release states all three triples, so every description walked to those nodes inherits the wrong article.

**What would settle a bound on the walk.** The 127 concepts whose prose sits exactly one step up (CSO 111, FIX 5, FpML 10, OLiA 1), read the same way. The two-step figure alone supports discounting a walked description four times in five; whether one step is trustworthy is unmeasured, and a bound must be derived from both readings together. Until then the export publishes `descriptionStatedFor` beside every description, which is what lets a consumer apply the discount.

## The first noun of a definition cannot tell an expansion from a definition

FIX documents most rows by expanding the row's name — `Password` states *"Password or passphrase."* — where FIBO, FpML and the two subject schemes state what a concept is: `Loan` states *"debt instrument whereby one party extends money or credit to another party"*. The candidate rule for telling the two apart without naming vocabularies: take the first noun of the prose and ask [WordNet](https://wordnet.princeton.edu/) whether it is a *hypernym* of the label — a word whose meaning contains the label's, as `debt` contains `loan`.

The rule ran over all 556 concepts described at their own node. The label's last word and the prose's first noun were reduced to dictionary form with WordNet's own exception list and suffix rules; the first noun is the first word carrying a WordNet noun entry, words of one or two letters excluded because WordNet lists the alphabet as nouns; where the prose contains *is* or *are*, the first noun after it, since encyclopedia prose opens with a framing clause.

| Vocabulary | First noun is a hypernym of the label | First noun restates a word of the label | Neither | Label or prose carries no WordNet noun |
|---|--:|--:|--:|--:|
| BIAN | 0 | 2 | 3 | 0 |
| CSO | 11 | 10 | 52 | 11 |
| CWE | 0 | 0 | 3 | 2 |
| FIBO | 28 | 32 | 95 | 1 |
| FIX | 1 | 25 | 64 | 12 |
| FpML | 3 | 22 | 93 | 4 |
| OLiA | 11 | 11 | 57 | 3 |

The rule is refused, on two measured grounds:

- **Restatement marks definitions as often as expansions.** FIBO restates on 32 of 156 rows and FpML on 22 of 122, beside FIX's 25 of 102 — because a compound label's own head word is also the head of its definition: FIBO's `TransactionDate` states *"date on which a specific transaction was initiated"*, a definition whose first noun is the label's last word.
- **The hypernym reading holds on 54 of 556 rows.** 53 of the 54 are genuine definitions, so where it holds it is right; FIBO, whose definitions most often open with the containing kind, reaches it on 28 of 156. A rule that finds one definition in six settles nothing about the rest.

## The 61 concepts no level describes

| Vocabulary | Concepts | What their rows and chains state |
|---|--:|---|
| CSO | 40 | 9 have a Wikipedia summary on the chain that the extraction join drops (measured below); the other 31 sit on chains that end in CSO's organising fields — `mathematics`, `economics`, `linguistics`, `communication`, `engineering`, `computer hardware`, `semantics`, `pattern matching`, `education` — for which CSO states no `sameAs` link at any level |
| FpML | 13 | each is a `complexType` — [XML Schema](https://www.w3.org/TR/xmlschema11-1/)'s named structure definition — with no stated parent and no `xsd:documentation`; FpML documents 1,181 of its 1,405 bundled rows |
| FIBO | 5 | `BusinessCenter`, `LegalEntity`, `OrganizationName`, `Party`, `ResponsibleParty`: the pinned FIBO ontologies state no definition and no superclass for any of the five |
| FIX | 2 | `Common`, a category, and `PriceLimits`, a component whose only stated ancestor is `Common`; FIX documents 2 of its 39 categories |
| OLiA | 1 | `Character`, whose one ancestor `OrthographicEntity` also carries no definition |

**The CSO abstracts join drops a quarter of the prose CSO states.** The topics extraction folds CSO's `relatedEquivalent` labels into one row — `bolometer` becomes an equivalent label on the `bolometers` row. The abstracts extraction keys each summary by the topic identifier its `sameAs` is stated on, and [`CsoTopics`](../../lexicon/src/main/java/io/github/fiftieshousewife/codesemantics/lexicon/CsoTopics.java) attaches a summary to a row only where the two identifiers are equal — so a summary stated on a folded-in equivalent attaches nowhere.

| | Count |
|---|--:|
| abstract rows in the bundled extraction | 5,294 |
| carrying summary text | 5,159 |
| attached to a topic row today | 3,811 |
| attached once a summary may claim any row stating its label | 4,233 |
| matching no row even then, the identifier carrying a URL-encoded disambiguator | 213 |

The repair attaches a summary to the row that states the summary's label as its preferred or equivalent label — the label CSO itself put on the row. It describes 422 more topics, and 9 of the 40 undescribed CSO concepts above gain a description through it: `correlation analysis`, `cosmic microwave backgrounds`, `mean square error`, `ontology`, `ontology concepts`, `services discovery`, `transform methods`, `transition probabilities`, `type errors`.

## What remains

1. **The abstracts join repair**, test-driven in `CsoTopics` or the extraction, priced by rereading the twelve readings: predicted +422 described topics, 9 fewer undescribed concepts, no verdict moved.
2. **The one-step reading**: the 127 one-step concepts judged the same three ways, and a walk bound derived from the two readings together.

## References

- [CSO — the Computer Science Ontology](https://cso.kmi.open.ac.uk/)
- [FIBO — the Financial Industry Business Ontology](https://spec.edmcouncil.org/fibo/)
- [FIX — the Financial Information eXchange orchestra](https://www.fixtrading.org/standards/)
- [FpML — Financial products Markup Language](https://www.fpml.org/)
- [OLiA — Ontologies of Linguistic Annotation](https://acoli-repo.github.io/olia/)
- [OWL 2 — the Web Ontology Language](https://www.w3.org/TR/owl2-overview/)
- [WordNet](https://wordnet.princeton.edu/)
- [XML Schema part 1](https://www.w3.org/TR/xmlschema11-1/)
