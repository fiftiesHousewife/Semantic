# Sense disambiguation, and the resources that label only specialist senses

## Sense disambiguation — the parts context does not reach

**The sibling half has landed.** `PhraseTopics` reads a phrase's words as context for one another: a subject
scores by the geometric mean of what its agreeing words committed, times the share of the phrase that agrees,
and the phrase commits what it settled on. That is the plan's first disambiguating vote, and it took `law`
from 39 files led to 28 without anything being excluded.

Two of the plan's three contexts remain, and both reach further than a phrase can:

The **enclosing declaration's** tokens, decayed by scope distance — a local called `key` inside
`HttpHeaderParser` reads differently from one inside `EncryptionService`, and neither phrase contains the
other's words. And the **file's pooled topical domain** as a prior over its own phrases, which is what would
finally settle `jupiter` in an import as the test framework a test file imports rather than a Roman god.
Each a vote, none a gate. The sibling reading is also still shallower than the plan asks: it agrees on
labels where the plan intersects hypernym chains, so two words meaning neighbouring things agree on nothing.

**Measurement, now available as a baseline rather than a prediction:** `mythology` is a qualified theme of
one source set and its witness is `jupiter`, from the JUnit Jupiter import — the dictionary knows Jupiter as
a Roman god, and nothing in the reading knows the file meant a test framework. A disambiguation that does not
remove that reading has not helped.

## The domain resources only label specialist senses — what is left of it

The theme reading finds this repository to be about **law**, and it is not. The cause is not polysemy, which
is what it looks like; it is the opposite, and it is stated in the bundled resource's own header: *"Factotum
(domain-less) entries are absent from the published lift."* A word's everyday sense carries no domain label,
so **only its specialist senses ever vote**, and the specialist sense is usually not the one the code means.

Measured, on the words carrying the theme:

| Word | What the resources say | Coherence |
|---|---|--:|
| `cite` | `law` — and nothing else, from both resources | **1.000** |
| `licence` | `law` — and nothing else | **1.000** |
| `attribution` | `law` — and nothing else | **1.000** |
| `claim` | `law` 0.88, `insurance` 0.13 | 0.781 |
| `answer` | `law` 0.75, `physiology` 0.25 | 0.625 |
| `word` | `linguistics` 0.19, `religion` 0.19, `computer_science` 0.17, and 18 more | 0.112 |
| `read` | 23 labels, none above 0.10 | 0.060 |

The bibliographic sense of `cite` — the only sense this repository ever means — is domain-less and therefore
invisible. The legal sense is the whole of what the resources say about the word.

**And the coherence rule amplifies exactly this.** A phrase commits Simpson's index over its own shares, so a
word whose only labelled sense is specialist commits a full unit while a word whose meaning is genuinely
general commits almost nothing. One `cite` outweighs roughly forty-seven occurrences of `word` — where `word`
appears 727 times and is unambiguously what this repository is about. Narrowness was taken as confidence; it
is a symptom of missing coverage.

**The control confirms it is the instrument and not the corpus.** `law` is *under*-represented in
`lexicon/src/main/java` — the module ported verbatim from another project — by 14.4% of that scope's
divergence, and *over*-represented in the source sets written for this reading. `witness`, `evidence`,
`attribution`, `claim`, `vote` and `commitment` are names chosen while building an evidence engine, and
English files that vocabulary under law. This is the doctrine's own rule failing: *do not mark your own
homework — the repositories a reading is tuned on and the repositories it is measured on are drawn
disjointly.*

**Fix 1 has landed and it worked.** `SenseCoverage` scales the sense-labelled resource's votes and the
phrase's committed mass by *labelled senses / total senses*, both read from WordNet. Measured on this tree:
`law` went from **first at ι 0.0723 leading 28 files** to **fourth at ι 0.0530 leading 20**, and `linguistics`
is now the theme leading the most files. It also raised the count of files no topic could be resolved for
from 0 to 53, which is the honest consequence: a reading resting on words the resources barely cover should
say so rather than resolve confidently.

**Fix 2 has landed and it worked too.** With the sense-labelled resource properly discounted, the
headword-labelled one dominated — and it labels with a hierarchy it publishes as a closure, so one statement
about a word arrived as six:

| Label | ι before | Leads before | ι after | Carried by, before |
|---|--:|--:|--:|---|
| `sciences` | 0.0651 | 20 | — | occurrence, topic, site, from |
| `natural-sciences` | 0.0403 | 1 | — | topic, site, resource, word |
| `physical-sciences` | 0.0365 | 0 | — | topic, site, resource, word |
| `engineering` | 0.0344 | 0 | — | topic, site, resource, word |
| `computing` | 0.0313 | 0 | **0.0824**, leading 36 | topic, site, resource, word |
| `human-sciences` | 0.0269 | 0 | — | occurrence, least, citation, initialism |
| **together** | **0.2344** | 21 | — | — |

Four had *identical* witnesses and led nothing between them: one theme counted six times, holding 23% of all
topical mass. `StatedTopics` folds a derived label back into the label it was derived from, citing the same
published map that derived it. The vocabulary went from 519 distinct topics to 479, the files no topic could
be resolved for from 54 to 17, and `computing` — a defensible answer for a library that reads code — leads
where five restatements of *sciences* used to sit.

**The rest of the fixes, in the order they are worth doing:**

3. **Read the most frequent sense, as the plan already says.** Stage 9 of the plan is explicitly reduced to
   WordNet's most frequent sense as a stated baseline. The reading currently pools every labelled sense
   equally, which is worse than the baseline it was supposed to start from — and WordNet carries the corpus
   use counts that would settle it. The fold sharpened the case rather than settling it: `music` is now
   fourth, carried by `topic`, whose everyday sense is the one the resource never labelled.
4. **Stop treating narrowness as confidence.** Coherence should be agreement between the phrase's words, not
   the shape of one word's entry.
5. **Read a repository this reading was not written for.** `-Dcs.clone.dir` already points the diagnostic at
   another clone, and until it has been run on one, every figure here is an instrument reading itself.
