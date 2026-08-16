# What the author chose

One question, asked of every word that reaches a reading: **did somebody choose this word to say something, or did the language, the platform, the tool, the licence or this library's own arithmetic put it there?**

The vocabulary reading states the partition and every later step consumes it. Nothing here needs a list of words: each rule is either about the position a name holds in the grammar, or a question put to a resource that states its own contents. Nothing here is a gate either — a word the reading did not choose keeps the place it earned and is reported under what put it there, which is why the ranking's numbering has gaps.

## The partition

| The word arrived because | What says so | State |
|---|---|---|
| **English requires it** — `by` in `massByTopic` | a word no open class carries that the frequency list does | landed |
| **The syntax bound it** — `catch (IOException e)`, `TikaInputStream tis`, `Set<String> mimeSet` | the position the name holds in the parse | landed |
| **Somebody else wrote it** — the platform's API, a licence header, a Javadoc tag | the platform's own runtime, the count of files a comment appears in, Javadoc's own model of itself | landed |
| **This library manufactured it** — `ab` from `abstains`, `wa` from `was`, `s` from a possessive | a dictionary that carries the run whole, and UAX #29 | landed, except `doe` |

---

## What is left

### 1. A word weighs observed against expected, never frequency alone

`WordSpecificity` is `log(rank) / log(size)`: how rare a word is in English, and nothing about whether this author reached for it. Under it a word written once and a word written two hundred times weigh the same, and a word this repository writes at exactly English's own rate weighs whatever its rank happens to be.

The vocabulary ranking already computes the right statistic in a place where it does not vote: this repository's share of a word against a reference's share of it, as a term of the Jensen–Shannon divergence, non-negative and bounded at one bit. `PhraseSpecificity` inherits the wrong one, so every term match is ranked by it too.

**What settles it:** the placement. The reading places this repository in Computer Science against a taxonomy of chance; a weight that states what the author chose more accurately should not move it away. Report the placement, the leading themes and the term ranking before and after. **Abandon if** the placement degrades — in which case frequency alone was carrying something the ratio is not.

**Blast radius:** every figure in `output/`.

### 2. Step 8 consumes the rest of the partition

The type a declaration writes beside its name is consumed, and the table at the end carries what that removed. What is not consumed is the rest of the partition: `TermSpans` still has not been told which of a name's remaining words English supplied, and `FunctionWords` already states 38 of this tree's 843.

**Measurement:** spans lost, concept by concept, on both trees. **Abandon if** it removes a name whose author plainly meant the word.

### 3. `doe` — one derived reading against another

| Offered as | Occurrences | Rank in the frequency list | Weight it votes at | What it was |
|---|--:|--:|--:|---|
| `doe` | 191 | 14,598 | **0.968** | `does` |

`wa` and `ha` are closed, because WordNet's exception list *states* that `was` is a form of `be` and `has` a form of `have`, and a stated inflection outranks a derived one. `does` is a *regular* `-es` form, so the exception list states nothing and both readings are derived — strip `es` for the verb `do`, strip `s` for the noun `doe` — and the standing preference for the noun decides it.

What would settle it is a rule for choosing between two derived readings, and every candidate so far is a threshold rather than a statement: preferring the commoner lemma reads `leaves` as `leave` rather than `leaf`, which is wrong in code.

### 4. What the splitter still owes

- **Byte offsets.** A token should carry the offset it began at, which is what lets a token's evidence carry a line-accurate permalink rather than a line-accurate-to-the-declaration one.
- **The adjective edge.** A published run whose first word is an adjective the reading refuses alone is refused with it: `geometric mean`, `lexical semantics`, `lexical database`. `ContentWords` asks for a noun or a verb, so an adjective reaches the resources only where the dictionary also carries it as a noun. It is a change to step 3 rather than to the walk.
- **The cited catalogues.** `CitedTokens.NONE` recognises nothing, so `userid` refuses to split — `id` ranks 4690 and a two-letter piece must rank inside 1000. The Wikidata initialism registry looks like it would fill the seam and does not: `CitedTokenCatalogueTest` measures 14,322 three-letter tokens and 1,195 of the ten thousand commonest English words, including `CODE`, `DATA`, `NAME`, `TYPE`, `LIST`, `NODE`, `SIZE`. Narrowing it by the prominence the registry itself states is a **bound, so it must be derived** — on repositories this reading was not written for.
- **`Tokeniser` is the narrow schema-identifier grammar**, ported unchanged and known to be too narrow for code: `XMLHttpRequest`, `parseHTTPResponse`, `toJSONString`, `getDSLContext`, `IPv6Address`. The class javadoc names each and `TokeniserTest` pins each, so widening it is a deliberate change to a stated expectation.

---

## What landed, with the number that judged it

| Item | Result |
|---|---|
| A run the dictionary carries whole is one word | 31 of 49 distinct runs here; 91 of 325 on Tika, where `extractor` read as extract / or 244 times |
| A catch parameter is the type it stands for | 52 of 52 here, 1,675 of 1,744 on Tika |
| The possessive is not a word boundary (UAX #29 WB6, WB7) | `s` 589 gone; λ fell 0.992 → 0.984, having counted a false citation |
| A stated inflection outranks a derived one | `wa` 268 and `ha` 174 gone, and `netball` left the reading |
| A published run is one row of the ranking | `part_of_speech` 44th, where `part` fell to 382nd and `speech` left |
| The cutoff is a permutation null | 259 of 859 words clear 0.000194 bits, holding 86.5% of the divergence, where 250 rows had been picked |
| The ranking runs on a repository it was not written for | 805 of Tika's 4,582 words clear its bar, holding 88.2% of the divergence against 86.5% here |
| A word English put inside a name | `FunctionWords`, 38 of 843 named words; `by` stood fourth |
| Javadoc's own syntax is not the author's prose | on Tika: `param` 2,768, `code` 2,195, `link` 1,729, `return` 1,430 |
| The platform's own method names | `get` fell from **1st of 4,582** to last of 4,527, `set` from 21st to 4,507th; 96,631 method names read in 259 ms |
| A declared name that is its own type, abbreviated | 4,108 declarations over 242 names on Tika, against one here; `tis` fell from 7th to 147th; one accident, `id` of an `ImageDeskew` |
| A comment standing in *n* files weighs 1/*n* | `law` left Tika's reported themes, which is the criterion this item stated in advance: two topics are reported there now, `computing` 0.1215 and `linguistics` 0.0253, against `computing` 0.1113, `law` 0.0295 and `linguistics` 0.0234 before. Nothing entered or left here, where 0.3% of comment word occurrences stand in more than one file against Tika's 45.1% |
| A type restated inside a longer name | 1,850 spans refused on Tika — `string` 407, `result` 355, `object` 234, `writer` 175, `document` 125, `exception` 64 — taking the term reading from 8,614 spans to 6,764 over the same 108 concepts; 89 spans here, led by `source` 25 and `citations` 14. Root branches held at 13 on Tika and 12 here, so the stated abandon line was never approached |
