# Semantic analysis in computational linguistics: a field survey

A general survey of how computational linguistics recovers semantic content from text — theory, methods,
tools and literature. It is reference material about the field, not about this repository, and nothing in it
is a proposal for this codebase.

Compiled 2026-08-15 from eight parallel reviews, each required to verify claims against primary sources and
to mark what it could not verify.

**How to read the verification marks.** Figures and APIs are marked ✓ where a reviewer fetched and read the
primary source during compilation, and ⚠ where the claim rests on background knowledge that could not be
confirmed. Unmarked statements are uncontroversial background. Two cautions apply to the whole document:
during compilation one automated fetch of a well-known paper **returned a fabricated results table**, caught
only by decoding the PDF locally; and reviewers disagreed with one another on several resource licences,
which are recorded as contested rather than resolved. Treat any unmarked number as worth checking before it
carries weight.

---

## Part I — Theory

Every technique carries a theory of meaning, and the theories disagree. This part states each one's claim,
what it buys, and where it fails, because mixing artefacts whose theories conflict is where systems quietly
produce nonsense.

### The distributional hypothesis

**The claim.** Difference in meaning correlates with difference in distribution: words occurring in the same
environments are semantically similar. Harris states it as structuralist methodology — distribution is the
only observable a linguist has, so semantic relations must be recoverable from it. Firth's slogan "you shall
know a word by the company it keeps" is a claim about *collocation* within a theory of context of situation,
not a theory of reference.

Harris, *Distributional Structure*, Word 10(2–3), 1954. Firth, *A Synopsis of Linguistic Theory 1930–55*,
1957. The move to vector spaces: Landauer & Dumais (LSA, 1997); Schütze, *Automatic Word Sense
Discrimination*, CL 24(1), 1998. The survey worth reading instead of fifty papers is **Turney & Pantel, *From
Frequency to Meaning: Vector Space Models of Semantics*, JAIR 37, 2010** ✓, which organises the field by
matrix type: **term–document** (topical similarity), **word–context** (attributional similarity),
**pair–pattern** (relational similarity). Those are three *different* similarity notions and are routinely
conflated.

**What it buys.** Unsupervised, corpus-derivable, continuous-valued similarity for every word, graded where
lexicographic categories are discrete. It scales and degrades gracefully.

**What it cannot express.** The hypothesis is about *similarity*, not *content*. A vector space cannot
represent **negation** (*good* and *bad* are distributionally near-identical — antonymy and synonymy collapse
into one geometry), **quantification and scope**, **reference** (nothing picks out an entity in a world),
**truth conditions**, or **compositional novelty** with any guarantee. Emerson, *What are the Goals of
Distributional Semantics?* (ACL 2020) ✓ sorts the desiderata vectors do and do not deliver. Note that "meaning
is use" is Wittgensteinian rather than Harris's, and commits you to meaning as a relational property with no
anchor outside language — a substantive position, not a neutral default.

### Formal and compositional semantics

**The claim.** The meaning of a complex expression is determined by the meanings of its parts and the rule
combining them. Montague's addition is that this determination be a *homomorphism* from a syntactic algebra to
a semantic algebra of typed functions over possible worlds — English treated with the rigour of a formal
language. Montague, *Universal Grammar* (1970) and *The Proper Treatment of Quantification in Ordinary
English* (1973); see the Stanford Encyclopedia entries on
[compositionality](https://plato.stanford.edu/entries/compositionality/) and
[Montague semantics](https://plato.stanford.edu/entries/montague-semantics/) ✓.

**What it buys.** Truth conditions, entailment, scope, binding, intensionality; a type discipline (⟨e⟩, ⟨t⟩,
⟨e,t⟩ …) making ill-formed combination a type error; systematicity and productivity from a finite lexicon.

**Divergence and partial rejoining.** The 1990s statistical turn dropped logical form for annotated-corpus
tasks. The rejoining is **semantic parsing to executable logical form** — Zettlemoyer & Collins (UAI 2005);
Berant et al., *Semantic Parsing on Freebase from Question-Answer Pairs* (EMNLP 2013) ✓, where supervision is
denotations rather than annotated forms. Today's text-to-SQL and tool-calling systems are this tradition
whether or not they cite it.

**Known limits.** Compositionality constrains the *form* of a semantic theory and is near-vacuous unless
syntax and meaning algebra are independently fixed — with enough freedom in either, almost anything can be
made compositional. It also gives you no lexicon: it says how *cat* combines, never what *cat* means. And it
is brittle — no logical form, no output.

### Compositional distributional semantics

**The claim.** Compose vectors the way Montague composes functions, keeping distributional lexical content.

In escalating structure: **Mitchell & Lapata** (ACL 2008) ✓ — additive and multiplicative composition against
human similarity judgements, with multiplicative (acting as intersective feature selection) generally
beating additive. **Baroni & Zamparelli**, *Nouns are Vectors, Adjectives are Matrices* (EMNLP 2010) ✓ — a
functor's meaning is a linear map learned by regression, so formal semantics' type distinction reappears as
tensor order. **Coecke, Sadrzadeh & Clark** (2010) ✓ — DisCoCat: pregroup grammar and finite-dimensional
vector spaces are both compact closed categories, so a grammatical reduction *is* a linear map on the tensor
product. Empirical test: Grefenstette & Sadrzadeh (EMNLP 2011) ✓.

**What was demonstrated:** structured composition beats bag-of-words on small controlled tasks —
transitive-sentence and adjective-noun similarity, verb disambiguation in context — with datasets in the
hundreds to low thousands. A real result, and narrow.

**Why the line lost momentum.** Tensor order grows with arity, so a ditransitive verb is a rank-4 tensor with
dimension⁴ parameters; the maps must be estimated from corpora containing few instances of most functors; and
there was no account of logical words. End-to-end neural models took the same evaluation tasks with learned,
non-linear, task-supervised composition and no commitment to grammar. The line was **out-competed on the
metrics both sides had agreed to use, not refuted.**

### Lexical semantics

**The claim.** Words have internal semantic structure and stand in a relational network; a "sense" is a
theoretical posit, not an observable.

Cruse, *Lexical Semantics* (CUP 1986) supplies the relation inventory — hyponymy, meronymy, antonymy of
several kinds, troponymy — that WordNet operationalises. **Pustejovsky, *The Generative Lexicon*** (CL 17(4),
1991) ✓ replaces sense enumeration with **qualia structure** (formal, constitutive, telic, agentive) plus
generative devices (type coercion, co-composition), so *fast car* / *fast typist* / *finish the book* are
computed rather than listed. Regular polysemy: Apresjan (1974). Metonymy: Nunberg, *Transfers of Meaning*
(1995). **Kilgarriff, *I don't believe in word senses*** (1997) ✓ argues senses "exist only relative to a
task" — corpus citations are the primary objects and senses are clusterings over them. Rosch's prototype
theory (1975) establishes graded category membership and basic-level terms, so necessary-and-sufficient
definitions are the wrong model of a concept.

**What it buys.** An account of productive sense extension without an infinite dictionary; a principled
distinction between **homonymy** (unrelated meanings sharing a form) and **polysemy** (related meanings of one
lexeme); and a reason why sense-granularity disputes are not resolvable in the abstract.

**Known limits.** Qualia structure is hand-built with no agreed acquisition procedure. Prototype effects are
robust, but typicality measured by similarity is not obviously *meaning*. Kilgarriff's point is corrosive to
any pipeline whose interface is a fixed sense identifier.

### Frame and role semantics

**The claim.** Understanding a word requires the conceptual scene it evokes; participants take roles in that
scene, and those roles are the interface to who-did-what-to-whom.

Fillmore, *The Case for Case* (1968) and *Frame Semantics* (1982). Role inventories: PropBank's per-predicate
numbered arguments — Palmer, Gildea & Kingsbury, *The Proposition Bank* (CL 31(1), 2005) ✓; **Dowty**,
*Thematic Proto-Roles and Argument Selection* (Language 67, 1991), which dissolves the failed search for a
small discrete role list by treating proto-agent and proto-patient as clusters of entailments; Levin's verb
classes (1993).

**Event semantics.** Davidson, *The Logical Form of Action Sentences* (1967) — adverbial modification and the
entailment pattern (*buttered the toast in the bathroom* ⊨ *buttered the toast*) fall out if verbs take a
hidden **event variable**. Neo-Davidsonian (Parsons 1990) conjoins all participants as predicates over that
variable: ∃e[Butter(e) ∧ Agent(e,j) ∧ Theme(e,t) ∧ In(e,b)].

**What it buys.** Optional, unordered, arbitrarily many modifiers with correct entailments, and a reified
event you can co-refer to, timestamp, negate or count. This is the shape an extraction target should have:
**an event node with typed edges, not an n-ary tuple of fixed arity.**

**Known limits.** Frame inventories are hand-built and incomplete; role labels do not transfer cleanly between
inventories; event individuation — when are two descriptions the same event? — is unsolved.

### Ontology, and four words people muddle

- **Taxonomy** — a hierarchy under a *single* relation, normally subsumption. No axioms, no inference beyond
  transitivity.
- **Thesaurus** — terms plus a small fixed relation set (broader/narrower/related, preferred/non-preferred)
  built for *retrieval*. SKOS's `skos:broader` is deliberately **not** logical subsumption. A thesaurus
  organises *words*; an ontology organises *things*.
- **Ontology** — a logical theory: classes, properties and **axioms** (disjointness, cardinality,
  domain/range, restrictions) with a model-theoretic semantics, so entailments are computable and
  inconsistency detectable.
- **Knowledge graph** — an *extensional* store of instance assertions with a light schema. Wikidata's scale is
  in the instances, not the axioms.

The routine error is treating a taxonomy or thesaurus as though its edges licensed inference, or calling a
triple store an ontology.

Description logics: Baader et al., *The Description Logic Handbook*. [OWL 2 Document Overview](https://www.w3.org/TR/owl2-overview/) ✓,
whose **EL / QL / RL** profiles are the explicit expressiveness-versus-tractability trade — polynomial-time
classification, query rewriting into relational databases, and rule-engine reasoning over RDF respectively.
Upper ontologies: **DOLCE** (descriptive, cognitively biased, endurant/perdurant), **BFO** (realist,
continuant/occurrent, ISO/IEC 21838-2, dominant in biomedicine), **SUMO** (first-order, mapped to WordNet).
They buy a shared set of top-level distinctions so independently-built domain ontologies merge without silent
equivocation between an *object*, a *process*, a *role* and an *information artefact*. They cost a high and
disputed adoption effort, and the realist/descriptive split is a live philosophical disagreement rather than a
style preference. OWL's open-world assumption and absence of unique names surprise practitioners expecting
database behaviour; full OWL 2 DL reasoning is N2ExpTime-complete, which is why the profiles exist.

### The current dispute, stated fairly

**Bender & Koller**, *Climbing towards NLU: On Meaning, Form, and Understanding in the Age of Data*
(ACL 2020) ✓ argue that **form** (observable text) and **meaning** (the relation between form and
communicative intent, or something external) are distinct in principle, so a system trained on form alone
cannot in principle learn meaning. The **octopus thought experiment**: an intelligent octopus taps an undersea
cable, learns the distribution of two islanders' messages perfectly, impersonates one — and fails the moment
a message requires acting on an unseen physical situation. Formal support: Merrill, Goldberg, Schwartz &
Smith, *Provable Limitations of Acquiring Meaning from Ungrounded Form* (TACL 2021) ✓ — under stated
assumptions, assertions alone do not determine semantic relations such as equivalence. The antecedent is
Harnad, *The Symbol Grounding Problem* (1990) ✓: symbols interpreted only by other symbols are like learning
Chinese from a Chinese–Chinese dictionary.

**The reply.** Piantadosi & Hill, *Meaning without reference in large language models* (2022) ✓ — the argument
presupposes a *referential* theory of meaning; on **conceptual role semantics**, meaning is constituted by
relations among internal states, and reference is neither necessary nor the whole story. Human concepts
(*prime number*, *justice*, *seven*) are largely fixed by inferential role too.

**The honest position.** The disagreement is substantially about which theory of meaning is presupposed, and
both sides are internally coherent. What is defensible and contested by few: distributional models represent
**distributional facts**, which are strong evidence about inferential role and weak-to-absent evidence about
reference, truth and communicative intent. Whether inferential role *is* meaning is the open question — a
dispute in philosophy of language that predates NLP and is not settled by any benchmark either camp runs.
Scale changes the empirics; it does not decide the conceptual question. Treat anyone declaring it closed, in
either direction, as arguing beyond the evidence.

### What you assert by choosing a method

| Choice | What it commits you to |
|---|---|
| **Cosine over embeddings** | Meaning is a point in a metric space; similarity is symmetric (Tversky showed it is not — *China is like North Korea* ≠ the converse); antonyms are near-synonyms; *how similar* is well-formed independently of *similar in what respect* |
| **A synset or sense id** | The inventory is task-appropriate at *its* granularity (against Kilgarriff); polysemy is enumerable rather than generative (against Pustejovsky); membership is all-or-nothing (against Rosch) |
| **A frame with roles** | Words evoke scenes; participants are typed by scene-relative role; usually also that the event is a first-class entity |
| **A taxonomy edge** | Subsumption is the relation that matters and is transitive — and you have asserted nothing a reasoner can use unless axioms accompany it |
| **An OWL ontology** | Open world, no unique names, monotonic entailment, and a chosen point on the expressiveness/tractability curve |
| **A logical form** | Compositionality and truth-conditionality; that the target formalism's ontology is right; and that failing to parse beats an approximate answer |
| **An end-to-end neural model** | Meaning is whatever the training objective induces, judged only by task performance — the theory is implicit and therefore unfalsifiable by argument |

**The practical corollary:** pick the theory that matches the question. Similarity questions are
distributional. Who-did-what-to-whom is event-and-role. "Is this consistent, and what follows?" is a logic.

---

## Part II — Meaning representation and semantic parsing

The structured formalisms used to write down what a sentence means, and how well parsing into them works.

### Abstract Meaning Representation

A rooted, directed, acyclic, node-labelled graph over PropBank frames, abstracting away from syntax
([Banarescu et al., LAW 2013](https://aclanthology.org/W13-2322/) ✓).

```
(w / want-01
   :ARG0 (b / boy)
   :ARG1 (b2 / believe-01
            :ARG0 (g / girl)
            :ARG1 b))     ; re-entrancy: "him" = the boy
```

**The omissions are deliberate.** Tense, aspect, articles, number and quantifier scope are not encoded. AMR's
goal was an annotation task cheap and reliable enough to build a large sembank, and it buys inter-annotator
agreement by discarding exactly the phenomena hardest to annotate consistently. Negation *is* present
(`:polarity -`) and coreference is present within the sentence via re-entrancy — but only within the sentence.

**Evaluation.** Smatch ([Cai & Knight, ACL 2013](https://aclanthology.org/P13-2131/) ✓) maximises F1 over
triple overlap under a variable alignment — an NP-hard search solved by hill-climbing, so scores are
stochastic. Its weaknesses are now their own literature: ensemble parsers can "exploit SMATCH metric
weaknesses to obtain higher scores, but sometimes result in corrupted graphs" ✓; graph-matching metrics
capture "surface overlap rather than logical equivalence" ✓.

**Performance on AMR 3.0:** SPRING 83.0, AMRBART 84.2 ✓; a 2025 evaluation of fine-tuned decoder-only LLMs
reports LLaMA 3.2 at 0.804, matching IBM's APT+Silver, against a best entry of 0.854 ✓. **State of the art has
sat in the mid-80s Smatch for roughly three years.**

### The others, and what distinguishes them

**UCCA** ([Abend & Rappoport, ACL 2013](https://aclanthology.org/P13-1023/) ✓) builds a hierarchy of *scenes*
over foundational categories (Process, State, Participant, Adverbial, Linker), designed to be typologically
portable and annotatable by non-experts. No frames, no word sense, no scope.

**DRT / DRS** is the only formalism here with a model theory. Boxes introduce discourse referents with
accessibility constraints, so donkey anaphora, negation, implication and quantifier scope are genuinely
represented, and a DRS translates to first-order logic:

```
[x, y | boy(x), girl(y), ¬[ e | believe(e), Agent(e,y), Theme(e,x) ]]
```

The [Parallel Meaning Bank](https://pmb.let.rug.nl/) ✓ (English, German, Dutch, Italian) provides gold data.

**MRS** with the English Resource Grammar is *underspecified* semantics — an unordered bag of elementary
predications plus handle constraints, so a scopally ambiguous sentence gets one MRS that enumerates readings
on demand rather than n parses. Produced by a hand-built precision grammar, so it is deep and principled and
has coverage gaps shallow parsers do not.

**Universal Decompositional Semantics** ([White et al., EMNLP 2016](https://aclanthology.org/D16-1177/))
declines to commit to a role inventory at all, annotating *scalar* protorole properties (volition, causation,
change-of-state), genericity and factuality over Universal Dependencies. It cannot be executed or reasoned
over, but it degrades gracefully where a categorical scheme forces an arbitrary choice.

| Formalism | Scope | Negation | Quantification | Coreference | Events | Executable |
|---|---|---|---|---|---|---|
| AMR | No | Yes (`:polarity`) | Only as concepts | Intra-sentence | PropBank frames | No |
| UCCA | No | Surface only | No | Limited | Scenes | No |
| DRS | **Yes** | Yes | **Yes** | **Cross-sentence** | Neo-Davidsonian | **Via FOL / theorem prover** |
| MRS | Underspecified | Yes | Yes | Partial | Yes | Via scope resolution |
| UDS | No | Factuality scalar | No | Via UD | Protorole scalars | No |
| PropBank SRL | No | `ARGM-NEG` | No | No | Predicate-argument | No |
| SQL / λ-DCS | Implicit | Yes | Yes | No | No | **Yes, by definition** |

### Semantic role labelling

PropBank assigns verb-specific numbered arguments (ARG0–ARG5 plus ARGM modifiers) and is deliberately shallow
and cheap; FrameNet assigns frame-specific named roles (Buyer, Goods, Seller) and is richer and sparser.
Span-based SRL labels constituent spans (CoNLL-2005/2012); dependency-based SRL labels syntactic heads
(CoNLL-2009). **These are different tasks and their numbers are not comparable.**

CoNLL-2005: He et al. 2017 81.5 → He et al. 2018 + ELMo 87.4 → Tian et al. 2022 + XLNet **89.80**.
CoNLL-2012/OntoNotes: 81.7 → 85.5 → **87.67** ✓. Essentially all of the 8-point gain since 2017 comes from
pre-trained contextual encoders; structured decoding contributes a point or two. SRL is the one formalism here
genuinely used downstream at scale, because it is cheap and its output is a flat table.

### Executable semantic parsing

**Text-to-SQL** is where the representation *is* the product, and it shows. [Spider](https://aclanthology.org/D18-1425/)
made the task cross-database and is now saturated — GPT-4o reaches **86.6% execution accuracy** ✓. BIRD added
large, dirty, real databases and tops out at **81.95% test** against a 92.96 human baseline ✓.
[Spider 2.0](https://spider2-sql.github.io/) — 632 enterprise workflow problems, 1000+ column databases,
100+ line queries — collapses the same models to **10.1% for GPT-4o and 17.1% for o1-preview** ✓. That gap
between saturated academic benchmarks and real workloads is the most striking single number in this survey.

The known measurement problem: **execution accuracy overstates semantic correctness.** A query can return the
right table for the wrong reason — a missing join that happens not to matter on the given data, an aggregation
over a column with no duplicates — while exact-match under-counts correct paraphrases. BIRD's R-VES metric is
an admission that binary result comparison is not the target.

The arc from Zettlemoyer & Collins (CCG lexicons to λ-calculus) through Liang's λ-DCS to
[Berant et al.](https://aclanthology.org/D13-1160/) ✓ (learning from denotations, not annotated forms) to
seq2seq to LLM prompting is the field's clearest single trend, and **each step traded compositional guarantees
for coverage.**

### Sentence-level relations, and the artefact problem

NLI tests whether a model behaves as if it computed meaning without committing to a notation. SNLI (570k
pairs), MultiNLI, ANLI (adversarial, human-in-the-loop).

The finding that matters: a classifier reading **the hypothesis alone** classifies **~67% of SNLI and ~53% of
MultiNLI** correctly ([Gururangan et al., NAACL 2018](https://aclanthology.org/N18-2017/) ✓) against a ~33%
majority class, and [Poliak et al.](https://aclanthology.org/S18-2023/) ✓ confirm this across **ten distinct
NLI datasets**. Crowdworkers writing contradictions reach for negation and writing entailments generalise
("animal" for "dog") — the model learns the annotator, not the inference. STS and paraphrase corpora have
analogous lexical-overlap shortcuts.

### Beyond the sentence

**Coreference** on OntoNotes/CoNLL-2012: end-to-end 67.2 → SpanBERT 79.6 → wl-coref+RoBERTa **81.0** ✓. Note
the ceiling is far lower than SRL's, on a task humans agree on well.

**Discourse.** RST builds a single tree over the whole document with nucleus/satellite asymmetry — it commits
to global structure. PDTB annotates only *local* connectives and their two arguments, with no tree — it
commits to nothing global and has far better agreement. Explicit-connective classification is easy; implicit
relation classification is the hard residue.

**Why document level is unsolved:** sentence-level tasks have bounded output spaces and local evidence;
document-level ones require entity and event identity across thousands of tokens, annotation is expensive,
disagreement is high, and errors compound — every downstream link inherits every upstream mistake. There is no
document-level equivalent of Smatch that is both meaningful and cheap.

### What LLMs left standing

Off-the-shelf prompting is *bad* at these formalisms: GPT-3, ChatGPT and GPT-4 show "virtually 0% success in
producing fully accurate parses" without fine-tuning ✓. Fine-tuned open LLMs do reach parity with dedicated
parsers, which reframes parsing as a fine-tuning target rather than an architecture problem.

What survives and why: **SQL absolutely**, because the representation is the product and execution is the
check. **SRL**, because it is cheap and consumed downstream. **DRS**, because it is the only representation
here you can hand to a theorem prover. **AMR** mainly as evaluation substrate and as a probe of whether a
model has compositional structure at all. The standing argument for explicit representation is verifiability:
an LLM's answer cannot be checked against a specification, whereas a logical form can be executed, proved,
diffed or audited — and that argument is strongest exactly where it is already winning, wherever the meaning
representation is itself the deliverable.

---

## Part III — The processing pipeline

From raw text to analysable units. This layer is unglamorous and is where most errors in a semantic pipeline
actually originate.

### Segmentation and tokenisation

**Settled.** Word and grapheme boundaries are specified by Unicode Standard Annex #29, and hand-rolling them
is a mistake. The tiering:

- **ICU4J / ICU4C / ICU4X** implement the annex with locale tailorings, including dictionary-based breaking
  for Thai, Japanese, Chinese and Khmer. ICU4J 78.3, Unicode-3.0 licence ✓.
- **Java's `java.text.BreakIterator`** implements an older, un-tailored approximation — materially worse on
  emoji sequences and CJK.
- **Python's stdlib `re`** does not implement UAX #29 at all; the third-party `regex` module does, via `\X`
  for grapheme clusters.

```java
BreakIterator it = BreakIterator.getWordInstance(ULocale.ENGLISH);
it.setText(text);
int start = it.first();
for (int end = it.next(); end != BreakIterator.DONE; start = end, end = it.next()) {
    System.out.println(text.substring(start, end));
}
```

The trap: **UAX #29 word boundaries are not linguistic tokens.** `don't` breaks into three segments,
`co-operate` splits, `3.14` may or may not hold. UAX #29 gives a standard-cited floor; a linguistic tokeniser
(spaCy, Stanza, CoreNLP) gives tokens a parser can consume. They serve different purposes and a serious
pipeline uses both.

**Subword tokenisation** — BPE, WordPiece, SentencePiece unigram — is a *model-input* concern, not a semantic
one. It matters for semantics in exactly two cases: counting tokens against a context budget, and
reconstructing character offsets from model output. Subword pieces are not units of meaning; BPE merges are
frequency artefacts of the training corpus, and `tokenisation` and `tokenization` split differently.
HuggingFace `tokenizers` 0.23.1 carries `offset_mapping` back to the original string ⚠.

### Sentence splitting

**Not settled**, and the most under-rated failure point in a pipeline.

| Approach | Tool | Character |
|---|---|---|
| Rule-based with curated abbreviation lists | pySBD 0.3.4, MIT | Port of Ruby `pragmatic_segmenter`; handles `Dr.`, `Fig. 3`, decimals, `et al.` |
| Tokeniser-coupled | syntok 1.4.4, MIT | Unusually good on hyphenated line breaks and OCR-ish text |
| Statistical / neural | Stanza | Character-level tagging jointly with tokenisation |
| Configurable cost | spaCy | `parser` (accurate, expensive), `senter` (fast), `sentencizer` (punctuation rule) |

The failure cases are the same across all of them and worth testing directly on your own text:
abbreviations before a capitalised name (`Prof. Newbold`), decimals and version numbers, legal and academic
citations (`Cf. Smith v. Jones, 12 U.S. 34 (1990).`), enumerations, and quoted speech ending `?"` mid-sentence.
For legal, biomedical or code-adjacent text, **published scores transfer badly — measure locally.**

### Morphology

Stemming (Porter, Snowball) is lossy string truncation with no lexicon; it is correct when you need recall in
an inverted index and nothing else. Lemmatisation returns a real dictionary form and is what you want whenever
output is read by a human or joined against a lexicon.

| Tool | Reported accuracy | Measured on |
|---|---|---|
| LemmInflect 0.2.3 | 95.6% overall (verb 96.1, noun 95.4, adj/adv 93.9); spaCy lookups 84.7%, NLTK 52.6% on the same test | AGID corpus, 119,194 inflected words |
| simplemma 2.0.0 | 0.96 English; 0.91–0.97 across 34 languages; 0.85–0.90 for morphologically rich ones | Universal Dependencies treebanks |
| Stanza neural lemmatiser | 96.63 | UD English EWT, end-to-end with predicted tokenisation and POS |
| WordNet morphy | rule + exception list; abstains cleanly on unknown forms | needs a POS to disambiguate `saw` |

The confound in every such comparison: a lemmatiser given gold POS is being scored on an easier task than one
that predicts it. Stanza's figure is the most honest of the four because it is end-to-end.

### Part of speech and syntax

**Settled.** Universal Dependencies is the de facto annotation standard — one tagset and one relation
inventory across 150+ languages. CoreNLP's Penn Treebank tags and Stanford Dependencies are legacy by
comparison.

| | Corpus | POS | UAS | LAS | NER F |
|---|---|---|---|---|---|
| Stanza `en_ewt` | UD 2.12 EWT test, end-to-end | 96.20 UPOS | 88.90 | 86.77 | — |
| spaCy `en_core_web_trf` | OntoNotes 5.0 dev | 97.8 | 95.1 | — | 89.8 |
| spaCy `en_core_web_lg` | OntoNotes 5.0 dev | 97.4 | 92.0 | — | 85.5 |

**These are different corpora and must not be compared directly.** EWT is web text with a high annotation
disagreement rate; the human ceiling on English UD parsing sits in the low 90s LAS, so 86.77 is nearer the
ceiling than it appears. Anyone quoting >95 LAS on English is quoting a different corpus.

**When a parse actually buys semantic information** — three cases justify the cost:

1. **Predicate–argument identity** — who did what to whom, which bag-of-words and window co-occurrence both
   get wrong on passives and relative clauses.
2. **Negation and modal scope** — `neg`/`advmod` attachment says which proposition is denied. No lexical
   method recovers this.
3. **Modifier attachment** — `open source software licence` versus `open source software licence agreement`,
   where dependency arcs are the only thing distinguishing readings.

Outside those, a POS tagger plus a lemmatiser usually captures the available signal at a fraction of the cost.

```python
import stanza
nlp = stanza.Pipeline(lang='en', processors='tokenize,pos,lemma,depparse')
doc = nlp("The library reads declarations, not uses.")
for w in doc.sentences[0].words:
    print(w.text, w.upos, w.lemma, w.head, w.deprel)
```

### Entities

**Recognition is settled; linking is not.** Transformer NER has sat at roughly 93–94 F1 on CoNLL-03 English
for years ⚠; spaCy's `trf` pipeline reports 89.8 F1 on OntoNotes. The genuine recent change is **zero-shot**:
GLiNER 0.2.28 takes an arbitrary label set at inference time, trading a few points of F1 on fixed schemas for
the ability to name a new entity type without retraining.

```python
from gliner import GLiNER
model = GLiNER.from_pretrained("gliner-community/gliner_small-v2.5")
model.predict_entities(text, ["person", "licence", "library"], threshold=0.5)
```

**Linking** to Wikidata or DBpedia is where the field is unsettled. ReFinED reports 85.0 F1 on AIDA-CoNLL with
its tuned model, 90.2 with NIL mentions filtered, 78.3 for the general Wikipedia model — and its README argues
most remaining errors are dataset annotation errors, which is the honest state of a benchmark near exhaustion.
BLINK is the bi-encoder-plus-cross-encoder baseline; DBpedia Spotlight and OpenTapioca are the
deployable-without-a-GPU options and are considerably weaker ⚠.

### Pipeline architecture, and the JVM's honest position

In Python the default is a spaCy pipeline with components swapped in — spaCy for tokenisation, tagging,
parsing and fast NER; Stanza or Trankit for UD-faithful output; a HuggingFace model wrapped as a custom
component for anything specialised. `spacy-stanza` and `spacy-transformers` exist so the `Doc` stays the single
carrier of annotations and offsets. **Keep character offsets into the original string on every layer** — that
is the one architectural decision that is hard to retrofit.

On the JVM, the gap is real. CoreNLP 4.5.10 is mature with a pleasant API, but is GPL-3.0 with a separate
commercial licence, its models predate the transformer era, and release velocity is low. Apache OpenNLP
2.5.11 is permissively licensed and actively released but trails visibly on accuracy. DKPro Core is at
3.0.0-beta-1; GATE Embedded's last Maven Central release was 9.0.1 in March 2021. What the JVM does have
unambiguously: **ICU4J**, the reference UAX #29 implementation and better than anything in Python;
**Lucene analysers**, the best-tested IR normalisation stack anywhere; and **extjwnl** for clean WordNet
access. The realistic JVM architecture is ICU4J + Lucene + WordNet for everything citable and offset-exact,
with any neural layer called out to a Python service or run through ONNX Runtime.

| Library | Version | Language | Licence |
|---|---|---|---|
| ICU4J | 78.3 | Java | Unicode-3.0 |
| spaCy | 3.8.15 | Python | MIT |
| Stanza | 1.14.0 | Python | Apache-2.0 |
| Trankit | 1.1.2 | Python | Apache-2.0 (last release Oct 2024 — stalling) |
| Flair | 0.15.1 | Python | MIT |
| GLiNER | 0.2.28 | Python | Apache-2.0 |
| pySBD | 0.3.4 | Python | MIT |
| syntok | 1.4.4 | Python | MIT |
| simplemma | 2.0.0 | Python | MIT |
| LemmInflect | 0.2.3 | Python | MIT (English only) |
| SentencePiece | 0.2.2 | C++/Python | Apache-2.0 |
| HF `tokenizers` | 0.23.1 | Rust/Python | Apache-2.0 |
| ReFinED | V1 tag | Python | Apache-2.0 (research release, frozen) |
| CoreNLP | 4.5.10 | Java | GPL-3.0 / paid commercial |
| Apache OpenNLP | 2.5.11 | Java | Apache-2.0 |
| Lucene analysis-common | 10.5.1 | Java | Apache-2.0 |
| extjwnl | 2.0.5 | Java | BSD |

---

## Part IV — Lexical and knowledge resources

### WordNet and its family

Start at **Open English WordNet**, not Princeton. Princeton 3.0 (2006) and 3.1 (2011) stopped moving; OEWN
ships annually — the 2025 edition landed 31 December 2025 with 161,875 words, 120,564 synsets and 419,226
relations ✓, under CC BY 4.0.

The `wn` package (1.1.1) is the current-generation Python access layer, reading WN-LMF so that OEWN, the Open
Multilingual WordNet and any other LMF lexicon load into one SQLite store:

```python
import wn
en = wn.Wordnet('oewn:2025+')
ss = en.synsets('win', pos='v')[0]
ss.definition()   # 'be the winner in a contest or competition; be victorious'
ss.hypernyms()
```

NLTK's `wordnet` reader remains the most widely deployed path but is pinned to older data. On the JVM,
extJWNL 2.0.5 is the maintained option; MIT's JWI is the alternative ⚠.

**What WordNet answers well:** synonymy, hypernymy, morphology, sense counts. **Badly:** domain, proper nouns,
neologisms, and adjective structure — adjectives are organised by antonym clusters rather than a hierarchy.
The sense inventory is famously fine-grained, and practitioners disagree sharply over whether to collapse
senses; no collapsing scheme has won.

### Topic labels over senses — the weakest link

There is **no full-coverage, commercially redistributable domain labelling over WordNet senses.** The options:

- **WordNet's own `;c` domain pointers** — sparse (6,471 synsets, 440 topics, measured against the bundled
  3.1 database) but carry the base licence.
- **WordNet Domains** — the classic ~166-label mapping. **Licence contested:** one reviewer reported checking
  `wndomains.fbk.eu` and finding CC BY 3.0 Unported, explicitly noting it is *not* NC-SA "contrary to common
  report"; another reported CC BY-NC-SA 3.0 ⚠. Older releases are widely cited as NC-SA. Read the licence
  inside the downloaded package.
- **eXtended WordNet Domains** — weighted, full-coverage domain vectors over 170 domains, which is already the
  shape of a graded vote rather than a single label. Its host `adimen.si.ehu.es` **did not resolve** during
  compilation ⚠; assume mirror-only distribution.
- **BabelDomains** — inherits BabelNet's research-only terms. On its authors' own gold set of 1,540 synsets it
  scores P 81.7 / R 68.7 / F 74.6 against WordNet Domains 3.2's P 93.6 / R 64.4 / F 76.3 — the larger, newer
  resource is *less* precise.

Teams needing full coverage generally build from Wikipedia categories or Wikidata `P31`/`P279` chains instead,
which are CC0.

### Knowledge graphs

**Wikidata** is the default and the only major graph under CC0 — no attribution, no share-alike, no
contamination downstream. The JSON dump is roughly 130 GiB compressed; prefer the *truthy* N-Triples dump if
you only need `P31`/`P279`/labels. The public query endpoint enforces timeouts and throttling, so bulk
enumeration belongs in a local triple store.

**ConceptNet** is CC BY-SA 4.0 — share-alike, with mixed upstream terms — and its API states a limit of 3,600
requests per hour. **YAGO 4.5** (2024) is 49M entities and 109M facts as Turtle with a SHACL schema, the
cleanest typing of the three. **BabelNet** is the richest multilingual sense graph and the most constrained:
its licence permits redistribution only to research institutions.

The pitfall that costs real money is **licence contamination** — one CC BY-SA input makes the derived resource
share-alike, and a single BabelNet-derived column makes it non-commercial.

### Frames and roles

A synset says what a word *means*; a frame says what a predicate *needs*. `sell`, `buy` and `pay` sit far
apart in WordNet's hierarchy but share FrameNet's Commerce frames with Buyer, Seller, Goods, Money — argument
structure a synset does not encode.

**PropBank frames 3.4** is the pragmatic choice (XML rolesets, actively released, CC BY-SA 4.0).
**VerbNet 3.4** gives classes with thematic roles and syntactic frames; its licence is not stated on the
repository ⚠. **FrameNet 1.7** requires a request form.

Tooling is the sore point: **AllenNLP, long the default SRL implementation, was archived on 16 December 2022**
and is read-only, its maintainers pointing users at Flair and HuggingFace. There is no consensus successor for
English SRL, and practitioners disagree over running a frozen model, fine-tuning, or prompting an LLM.

### Subject taxonomies

**SKOS** is the lingua franca — `skos:prefLabel`, `skos:broader`, `skos:narrower` — and anything published as
SKOS/RDF loads into `rdflib` or Apache Jena. The split that matters is legal, not technical. Broadly
redistributable: AGROVOC, EuroVoc, STW, GND, LCSH via `id.loc.gov`. Not: SNOMED CT (affiliate licence), UMLS
(licence agreement), Dewey (proprietary). MeSH is the friendly one in biomedicine. ACM CCS, MSC, JEL and the
IEEE Thesaurus generally permit use in indexing but not wholesale redistribution ⚠.

### Frequency data

**`wordfreq` is deliberately frozen.** Its README states the data is "a snapshot of language usage through
about 2021" and "unlikely to be updated again", because generative text has polluted the web sources it drew
on ✓. Code is Apache-2.0; **the data is CC BY-SA 4.0**, which is share-alike and routinely overlooked. Its
frozen status is a virtue for reproducibility and a defect for neologisms — and practitioners disagree over
whether any post-2021 web frequency count is trustworthy at all.

**SUBTLEX** (film subtitles) predicts lexical decision times better than corpus counts and under-represents
technical vocabulary. **Google Books Ngrams v3** is unmatched for diachronic trends and badly skewed by OCR
errors, publishing volume and duplicate editions. **Leipzig Corpora Collection** offers per-language sentence
and co-occurrence packages, scored with Dunning's log-likelihood; its licence was reported as CC BY 4.0 by one
reviewer and as unverified-possibly-NC by another ⚠.

---

## Part V — Representing and comparing meaning

### The classical line still matters

The result every practitioner should know is **Levy, Goldberg & Dagan, TACL 3 (2015)**, *Improving
Distributional Similarity with Lessons Learned from Word Embeddings* ✓: "much of the performance gains of word
embeddings are due to certain system design choices and hyperparameter optimizations, rather than the
embedding algorithms themselves." Transplant dynamic context windows, subsampling, negative-sampling shifts
and context distribution smoothing into PPMI-SVD and the gap to word2vec/GloVe largely closes. The
counter-paper usually cited against it is **Baroni, Dinu & Kruszewski, ACL 2014**, *Don't count, predict!* ⚠.
The honest summary of the pair: predict-based wins at default settings, count-based ties under tuning.

What each is still good for: **PPMI-SVD / LSA** on small closed corpora where you want an inspectable matrix
and no GPU; **fastText** where character n-grams give vectors for out-of-vocabulary and morphologically rich
tokens; **random indexing** for streaming settings. None of them do word sense — `bank` gets one vector, and
that is the ceiling.

### Sentence encoders

**Why naive BERT vectors underperform:** MLM pretraining never optimises the pooled vector for a metric space;
a siamese contrastive objective does. Reimers & Gurevych's *Sentence-BERT* (EMNLP 2019) ✓ reports that finding
the most similar pair among 10,000 sentences takes ~65 hours with cross-encoder BERT versus **~5 seconds with
SBERT** at comparable accuracy.

| Model | Params | Licence | Note |
|---|---|---|---|
| `all-MiniLM-L6-v2` | 22.7M | Apache-2.0 | 384-dim, 256 wordpiece cap; still the CPU baseline |
| `BAAI/bge-m3` | ~560M | MIT | 8192 context; dense + sparse + multi-vector in one model |
| `Qwen/Qwen3-Embedding-8B` | 8B | Apache-2.0 | 32,768 context; MTEB multilingual mean 70.58, English 75.22 (model card ✓, **not verified against the live leaderboard**) |
| `BAAI/bge-reranker-v2-m3` | 0.6B | Apache-2.0 | Cross-encoder reranker |

**Instruction-tuned embeddings** are now normal at the top of the table — prepend a task description to the
query side, for a stated 1–5% improvement ✓. The cost: a query embedded with the wrong instruction is silently
worse, and index and query path must agree forever.

**Matryoshka representations** train one model so every prefix of the vector is usable, reported at up to 14×
smaller embeddings at iso-accuracy and up to 14× retrieval speedups ✓. In practice: index at 256 dims, rerank
the top-k at full width.

### Similarity, and where it goes wrong

**Anisotropy.** Raw contextual embeddings occupy a narrow cone; arbitrary sentence pairs score 0.7+ cosine.
Subtract the corpus mean and renormalise, or whiten. A properly contrastively-trained encoder mostly solves
this at training time — whitening is a repair for models not trained for cosine.

**The Steck critique, stated correctly.** Steck, Ekanadham & Kallus, *Is Cosine-Similarity of Embeddings Really
About Similarity?* ✓ is an analytic result about **regularized linear models**: in some, learned similarities
are not unique; in others, the regularisation implicitly determines them, so cosine "can yield arbitrary and
therefore meaningless 'similarities'". They extend the caution to deep models and advise against applying
cosine by default. **What it does not claim** is that cosine fails on models trained with a cosine objective.
If your encoder's loss was cosine-based contrastive, cosine is the metric it was fit for. Citing this paper as
a universal condemnation of cosine is the most common misreading in the current literature.

**Bi-encoder versus cross-encoder.** The settled architecture is retrieve top-50 to top-200 with a bi-encoder
(plus BM25 in hybrid), then rerank with a cross-encoder. **Calibration:** cosine scores are not probabilities
and are not comparable across models, query types or index refreshes. Fit thresholds with Platt scaling or
isotonic regression on held-out data; a threshold copied from a blog post is fashion, not measurement.

### LLMs as semantic analysers

Zero- and few-shot classification beats a supervised classifier when you have under ~200 labels per class,
when the label set churns, or when the task needs world knowledge. A fine-tuned encoder wins with thousands of
labels, a fixed schema, latency under ~50ms, or a need for reproducibility across time — a hosted model's
behaviour changes under you.

**Structured extraction with constrained decoding** is the mature part: constrain generation to a JSON Schema
or regex via a finite-state machine over the tokeniser, so malformed output is impossible rather than retried
(`outlines`, `guidance`, llama.cpp GBNF, native structured-output modes).

**LLM-as-judge.** Zheng et al., *Judging LLM-as-a-Judge with MT-Bench and Chatbot Arena* ✓: strong judges
reach **over 80% agreement with human preferences — the same level as human–human agreement**. The same paper
names the biases: **position** (order of candidates), **verbosity** (longer preferred),
**self-enhancement** (a model favouring its own outputs), and limited reasoning. Mitigations follow directly:
swap positions and average, control for length, never let a model judge its own family in published work.

### Grounding, interpretability, provenance

The hybrid design that holds up is **an embedding proposes and a symbolic resource confirms** — nearest
neighbours over a taxonomy's labels generate candidates; an exact match or rule against the published taxonomy
decides which survive. The embedding gives recall, the symbolic layer gives an auditable reason; neither alone
gives both.

On interpretability, the honest position: almost nothing defensible can be said about *why* an embedding model
judged as it did. Attribution methods — integrated gradients, SHAP, attention rollout — are unstable across
seeds and known to be unfaithful adversarially; sparse autoencoders are a research direction, not an audit
tool. What you *can* state is provenance: which neighbours were returned, at what score, from which index
version, and which span the answer cites. For most compliance purposes that is what is actually required, and
it is the practical argument for keeping a symbolic resource in the loop — a lexicon entry has a citation, a
4096-dimensional vector has a training run.

### Decision guide

| Task | Reach for first | Fallback |
|---|---|---|
| Cluster documents | `all-MiniLM-L6-v2` + UMAP + HDBSCAN | LSA/PPMI-SVD for a deterministic, inspectable basis |
| Classify, fixed schema, ample labels | Fine-tuned encoder | LLM zero-shot if labels churn |
| Classify, few or churning labels | LLM few-shot + constrained decoding | Few-shot on an encoder (SetFit-style) |
| Match to a published taxonomy | Embedding top-k over label strings, then exact/rule confirm | String matching if labels are canonical |
| Measure similarity | Contrastively-trained bi-encoder, threshold calibrated on held-out data | Cross-encoder if O(n) is affordable |
| Retrieval at scale | Hybrid BM25 + dense, Matryoshka-truncated index, cross-encoder rerank | ColBERT-style late interaction for out-of-domain robustness |
| Extract structure | Constrained decoding to a JSON Schema | Regex + parser if the format is rigid |

**Settled:** contrastive training is what makes a sentence vector usable; retrieve-then-rerank; constrained
decoding; hybrid lexical+dense retrieval; position and verbosity bias in LLM judges.
**Fashion:** leaderboard rank as a model-selection criterion; 7–8B embedding models where a 100M model closes
most of the gap; reflexive whitening; treating a judge's score as calibrated.
**Open:** faithful attribution for embedding decisions; calibration that transfers across domains.

---

## Part VI — Discovering what a text is about

The organising distinction for this whole part: **topic models and keyphrase extractors tell you which words
are prominent; only classification against a published vocabulary tells you what a text is about in terms
someone else can check.**

### Topics

Topic models give **unnamed clusters**. Nothing in LDA, NMF, BERTopic or Top2Vec produces a label checkable
against a published vocabulary — they produce a ranked word list which you name yourself.

| Implementation | Character |
|---|---|
| gensim 4.4.0 (LGPL-2.1) | Online variational Bayes; streams corpora larger than RAM; carries `CoherenceModel` |
| MALLET 2.1.1 (Java) | Gibbs sampling with hyperparameter optimisation; topics noticeably crisper, mostly from asymmetric-alpha optimisation. gensim's wrapper was removed in 4.x — shell out |
| scikit-learn 1.9.0 (BSD-3) | `LatentDirichletAllocation`; unremarkable, no coherence metric |
| tomotopy 0.14.0 (MIT) | Fastest; the only one shipping HDP, correlated, dynamic, supervised and labelled LDA as first-class classes |

**NMF beats LDA** when the corpus is small (a few thousand documents), documents are short, or determinism
matters. **Short text**: LDA degrades badly under ~50 tokens per document; GSDMM (one topic per document) and
biterm models are the classical answers, but exist mainly as small unmaintained ports ⚠.

**BERTopic 0.17.4** (MIT) is a pipeline rather than a model — sentence-transformers → UMAP → HDBSCAN →
class-based TF-IDF — and every stage is swappable, which is the real reason to use it. Note topic `-1`:
HDBSCAN assigns a large fraction of documents to no cluster at all (4,630 documents in the README's
20-newsgroups run ✓). That is an explicit abstention, and a feature, but budget for it.

**Choosing k, and the caution.** Coherence measures — `c_v`, `u_mass`, `c_npmi`, `c_uci` — come from Röder,
Both & Hinneburg (WSDM 2015). Two published cautions matter: Chang et al., *Reading Tea Leaves* (NIPS 2009),
found held-out likelihood **negatively** correlated with human interpretability on word intrusion; and Hoyle
et al., *Is Automated Topic Model Evaluation Broken?* (NeurIPS 2021), found automated coherence tracks human
judgement unreliably, especially across model families. Use NPMI rather than C_v when comparing across models,
sweep k, and treat the coherence curve as a shortlist generator rather than a decision.

**Topic labelling** is the unsolved half. Checkable: map top terms into a published thesaurus and cite the
concept URI, or classify the topic's top documents against that thesaurus. Not checkable: BERTopic's
`generate_topic_labels()` and LLM representation models, which produce fluent names with no external referent.

### Keyphrases and terminology — know your baselines

From `pke`'s own committed benchmark file, on Inspec (F1@5 / F1@10):

| Model | F@5 | F@10 |
|---|---|---|
| FirstPhrases | 24.17 | 28.68 |
| **TfIdf** | **28.37** | **35.00** |
| SingleRank | 27.40 | 34.15 |
| TextRank | 26.91 | 33.95 |
| PositionRank | 27.90 | 32.94 |
| MultipartiteRank | 25.02 | 29.34 |
| TopicRank | 24.57 | 28.35 |

**"Take the first phrases in the document" beats TopicRank at F@10, and plain TF-IDF beats every graph
method.** On SemEval-2010 it is worse for the graph camp: FirstPhrases 14.25 against TextRank 12.97. A large
literature does not report these baselines. If you ship a graph ranker without measuring it against
FirstPhrases and TF-IDF on your own data, you have established nothing.

**YAKE** is unsupervised, single-document, corpus-free, and *lower score is better*. **KeyBERT** is extraction
by document-embedding cosine, fast to adopt, with no published win over TF-IDF on Inspec ⚠. **RAKE** is
stopword-delimited chunking — cheap, noisy, no reason to prefer over YAKE. **Neural generation** (KeyBART,
KBIR) generates *absent* keyphrases, which no extractive method can, and that is the only reason to pay for it.

**Automatic term recognition** is a different task — ranking terms for a *domain*, not a document. C-value /
NC-value weights a candidate by frequency, length, and nesting inside longer candidates. Note its
methodology: the original uses a **229-word stop list built by hand from a 1/10 sample of the corpus it then
scores**, and reports precision of 31–38% over the full candidate list; its authors concede they can report
only "'relative' rather than 'absolute'" precision, which is why some published recall figures exceed 100%.
`pyate` implements C-value, Basic, ComboBasic, Weirdness and TermExtractor; TermSuite and ATR4S are fuller
research toolkits, both dormant ⚠.

### Classification against a taxonomy

The only approach in this part that yields a **checkable label — a concept URI in a real vocabulary.**

- **fastText 0.9.2** (MIT) — still the right first baseline for flat multi-label classification.
- **scikit-learn** — `TfidfVectorizer` + `OneVsRestClassifier(LinearSVC())` is the honest baseline many
  transformer papers fail to beat on domain data.
- **Extreme multi-label** — AttentionXML, LightXML, evaluated on the Extreme Classification Repository. The
  metric that matters is **PSP@k**, propensity-scored precision (Jain, Prabhu & Varma, KDD 2016), which
  reweights by inverse label propensity and exposes tail failure. If a vendor quotes only P@1, ask for PSP@5.
  Published gaps are stark: AttentionXML on EUR-Lex P@1 87.12 against PSP@1 44.97; Wiki-500K 76.95 against
  30.85; Wiki10-31K 87.47 against 15.57 ⚠.
- **Zero-shot / dataless** — NLI-based pipelines treat each label as a hypothesis; works when label names are
  English phrases, degrades sharply when they are codes. Label-description similarity (embed
  `skos:prefLabel` + `skos:definition`, cosine against the document) is cheaper and often as good. The
  reference results are Song & Roth (AAAI 2014): 20-Newsgroups **micro-F1 0.682** (26 labels), RCV1 **0.371**
  (103 labels), beating unsupervised OHLDA at 0.595 / 0.284. *A widely-quoted 85.29% for dataless
  classification is Chang et al. (AAAI 2008) and is an average over ten **binary** problems — it is not a
  multi-class result and is routinely misquoted as one.*
- **Annif 1.4.2** (Apache-2.0, National Library of Finland) is what libraries actually run in production.
  Backends: `tfidf`, `fasttext`, `omikuji`, `svc`, `mllm`, `stwfsa`, `yake`, `http`, plus `ensemble`,
  `nn_ensemble`, `pav`, `hyperopt`. The design point worth stealing is that it is a **harness over many weak
  indexers with a trained ensemble on top**, evaluated against a gold set. Maui and KEA are its ancestors.

The critical caveat for zero-shot at scale: on EURLEX57K (4,271 EuroVoc labels), BERT-BASE reports RP@5
**0.835 on frequent labels and 0.028 on zero-shot labels** — a thirty-fold collapse — and only the
architecture reading the label's own descriptor recovers anything, at 0.438. Fine-grained scientific topic
classification is harder still: SciPrompt reports **22.28% zero-shot accuracy over 53 arXiv subcategories**.

### Similarity and retrieval

**BM25 is hard to beat.** BEIR established the result everyone cites: BM25 outperformed most dense retrievers
on out-of-domain nDCG@10 across its 18 datasets. The correct modern reading is not "dense retrieval lost" but
"dense retrieval must be measured out-of-domain". `bm25s` is the fast modern implementation.

**Validate a clustering externally** wherever possible — against held-out metadata, subject headings, or human
word intrusion. Silhouette computed on UMAP coordinates measures UMAP, not your data.

### Corpus comparison and keyness

The standard toolchain is **log-likelihood** (Rayson & Garside 2000) for *whether* a difference exists and
**log ratio** (Hardie 2014) or %DIFF for *how big*; Bayes Factor via a BIC approximation (Wilson 2013) converts
log-likelihood into a strength-of-evidence scale.

The warning that must accompany all of it is Kilgarriff, *Language is never, ever, ever random* (2005): the
null hypothesis of random word distribution is always false, so in a large corpus every non-trivial word
reaches significance. **Rank by effect size; use significance only as a floor.** Note also that of this whole
family only Dice (bounded at 1), logDice (bounded at 14 by derivation) and NPMI (bounded in [−1,1]) have
maxima that follow from their definitions — log-likelihood, PMI, t-score, %DIFF and Bayes factors are all
unbounded and scale with corpus size.

Tools: AntConc, #LancsBox, CQPweb, and the `corpora` R package ⚠.

---

## Part VII — Evaluation and methodology

### Benchmarks

| Benchmark | Measures | State |
|---|---|---|
| WSD Unified Evaluation Framework | All-words WSD F1 | Unifies five standard sets on WordNet 3.0 ✓ |
| MTEB / MMTEB | Embedding quality across retrieval, clustering, STS, classification | Apache-2.0, actively maintained ✓ |
| BEIR | Zero-shot retrieval nDCG@10 | ~18 datasets, Apache-2.0 ✓ |
| Universal Dependencies | Syntax LAS/UAS | v2.18 (15 May 2026), >200 treebanks, >150 languages ✓. Mixed CC BY / CC BY-SA / **CC BY-NC-SA** / GPL — the NC ones matter commercially |
| OntoNotes 5.0 | NER, coreference, sense, PropBank | 2.9M words; **LDC paywalled** ✓ |
| GLUE / SuperGLUE | NLU aggregate | Both saturated; SuperGLUE's own abstract notes GLUE performance "surpassed the level of non-expert humans" ✓ |
| HELM | Multi-metric LM evaluation | 16 core scenarios × 7 metrics; raised dense coverage 17.9% → 96.0% ✓ |
| lm-evaluation-harness | Aggregate LLM harness | 60+ benchmarks; MIT; backs the HF leaderboard ✓ |

### Agreement is the ceiling

No supervised system can be *shown* to exceed the reliability of the labels it is scored against. Cohen's κ
(two coders), Fleiss's κ (many), Krippendorff's α (many coders, missing data, any measurement level — the only
one handling all three).

**The documented problem with κ** is the prevalence and bias paradoxes: with a skewed label distribution, high
observed agreement can yield near-zero κ, and coder bias can inflate it (Feinstein & Cicchetti 1990; for NLP,
Di Eugenio & Glass, *CL* 2004) ⚠. The 0.67/0.80 thresholds everyone quotes trace to Krippendorff via Carletta;
Artstein & Poesio (*CL* 34(4), 2008) is the standard reference arguing they are not task-independent.

**Semantic tasks agree worse than syntactic ones.** Fine-grained WordNet sense tagging is the canonical hard
case — the SemEval-2007 *coarse-grained* all-words task exists precisely because coarsening the inventory
raises agreement ✓.

### Is the result real?

**Significance.** The reference is Dror, Baumer, Shlomov & Reichart, *The Hitchhiker's Guide to Testing
Statistical Significance in NLP* (ACL 2018) ✓, whose survey of ACL/TACL 2017 papers found significance testing
"is often ignored or misused" ✓. The shape of its advice: NLP score distributions rarely satisfy parametric
assumptions, so prefer **non-parametric paired** tests, and distinguish **decomposable** measures (accuracy —
per-example scores exist, so sign test / McNemar / Wilcoxon apply) from **non-decomposable** ones (BLEU, corpus
F1 — use **paired bootstrap** or **approximate randomisation**). ⚠ *The paper's exact decision tree would not
extract during compilation; verify against its §4 before citing conditions.*

**Effect size versus significance.** With 10⁵ test items a 0.2-point difference can be significant and
useless. Report the difference, a confidence interval, and **variance across random seeds — seed variance
frequently exceeds the method delta** ⚠.

### Documented ways of fooling yourself

1. **Annotation artefacts.** Gururangan et al. (NAACL 2018) ✓: a classifier reading **only the hypothesis**
   gets **~67% on SNLI and ~53% on MultiNLI**, against 33% chance. Their conclusion verbatim: "the success of
   natural language inference models to date has been overestimated." **Always run the ablated-input
   baseline** — if input-half-only does well, your benchmark is partly a spurious-cue detector.
2. **Contamination.** The best-controlled public evidence is GSM1k ✓, a fresh benchmark mirroring GSM8k:
   accuracy drops up to 8%, "several families of models showing evidence of systematic overfitting", with a
   positive correlation between probability of memorising GSM8k and the performance gap. The honest reading is
   two-sided — frontier models showed minimal overfitting and all models "broadly demonstrate generalization
   to novel math problems". Contamination is real and measurable; it is not a universal explanation.
3. **Unfair baselines.** BM25 against dense retrievers; the most-frequent-sense baseline most WSD systems
   historically failed to beat; SIF weighted averaging as "a simple but tough-to-beat baseline"; Melis et al.
   (2018) showing tuned LSTMs matched claimed architectural advances ⚠.

### Human evaluation

**Best-worst scaling beats rating scales**: Kiritchenko & Mohammad (ACL 2017) ✓ — "with the same total number
of annotations, BWS produces significantly more reliable results than the rating scale."

### Reproducibility

**Pin everything by revision**, not by name — HF `revision=<sha>`, UD by release tag, harness by git SHA, since
task definitions change between versions ⚠. **Lexical-resource drift is the silent failure**: WordNet 3.0 and
3.1 use different synset offsets, so an offset resolved against the wrong version yields a plausible but wrong
sense with no error raised. The WSD Unified Framework is WordNet 3.0 ✓; mixing a 3.1-backed lookup into it
silently miscounts. Record the resource version in the results artefact and prefer stable sense *keys* over
offsets. **Croissant** (JSON-LD binding metadata, files, structure and ML semantics) is the emerging standard,
supported by HuggingFace, Kaggle, OpenML and TFDS ✓.

### Checklist

**Before running anything** — freeze the test set and record how many times it is evaluated; pin benchmark
version, licence and URL by revision; record the lexical resource version in the output artefact; define the
ablated-input baseline (hypothesis-only, query-only, label-prior); define the trivial baseline (majority class,
MFS, BM25, TF-IDF, FirstPhrases).

**Annotation** — at least two independent annotators on a real sample; compute α or κ; check prevalence and
bias before trusting κ; report agreement as the ceiling beside system scores.

**Analysis** — choose the paired significance test by measure type; correct for multiple comparisons across
datasets and settings; report variance across at least three seeds, plus effect size and confidence interval,
not only p.

**Judges** — best-worst or pairwise rather than rating scales; for LLM judges randomise order, control length,
disclose self-preference, and measure agreement with humans on your own data.

**Publication** — dataset card and model card; Croissant metadata; the exact evaluation command, harness SHA,
and raw per-example predictions.

---

## Part VIII — Reading list and reference tools

### Textbooks

**Jurafsky & Martin, *Speech and Language Processing*, 3rd edition** — free, and still a draft. Verified
15 August 2026 at [web.stanford.edu/~jurafsky/slp3](https://web.stanford.edu/~jurafsky/slp3/): current release
dated **6 January 2026**, explicitly incomplete ("When will the book be finished? Don't ask"). The 3rd edition
is **reorganised into two parts** — Ch. 1–16 *Large Language Models*, Ch. 17–25 *Annotating Linguistic
Structure* — so older chapter numbers circulating online are wrong. Semantics now lives in **Ch. 5
Embeddings**, **Ch. 20 Information Extraction**, **Ch. 21 Semantic Role Labeling**, and web-only appendices
**H** (logical representations), **I** (word senses and WordNet), **J** (PPMI). Note what the reorganisation
says: lexical semantics has been demoted to an appendix. Read the appendices anyway — they are the best short
treatment of WordNet and sense inventories in print.

- **Manning & Schütze, *Foundations of Statistical NLP*** (1999) — best on collocations, mutual information
  and the statistics of lexical association; out of date on everything neural. Sample chapters only ✓.
- **Eisenstein, *Introduction to NLP*** (MIT Press 2019) — pre-publication notes free on GitHub ✓. Part III is
  a more rigorous treatment of semantics than J&M's, better organised.
- **Goldberg, *Neural Network Methods for NLP*** (2017); the free precursor is his **JAIR 57 (2016) primer** ✓.
  Superseded on architectures, still the clearest account of why word representations behave as they do.
- **Lexical semantics:** Cruse, *Lexical Semantics* (CUP 1986) — the source of most of what NLP means by
  "sense"; Murphy, *Semantic Relations and the Lexicon* (CUP 2003) — the sharpest available critique of
  treating WordNet-style relations as psychologically real; Fellbaum (ed.), *WordNet* (MIT Press 1998) — read
  the first two chapters before using WordNet for anything.
- **Blackburn & Bos, *Representation and Inference for Natural Language*** (CSLI) — lambda calculus, DRT,
  model building and theorem proving with runnable Prolog. Nothing has replaced it ✓.
- **Xiao & Zhu, *Foundations of Large Language Models*** ([arXiv:2501.09223](https://arxiv.org/abs/2501.09223),
  CC-BY) ✓ — free and current on pre-training, prompting, alignment, inference.

### The canon, by subfield

*ACL Anthology IDs are given where they exist, and every one resolves directly:
`https://aclanthology.org/<ID>/` — so `P17-1008` is <https://aclanthology.org/P17-1008/>. Entries other than
those marked ✓ were not individually re-fetched; resolving the ID is the fastest way to confirm each.*

**Distributional semantics.** Harris (1954), *Distributional Structure* — the hypothesis. Firth (1957).
Church & Hanks (CL 16(1), 1990) — PMI as the association measure. Deerwester et al. (1990) — LSA.
**Turney & Pantel (JAIR 37, 2010)** ✓ — the taxonomy that still organises the field. Baroni, Dinu &
Kruszewski (ACL 2014, `P14-1023`) — "Don't count, predict!", **substantially contested** by Levy et al. below.

**Embeddings.** Bengio et al. (JMLR 3, 2003). Mikolov et al. ([arXiv:1301.3781](https://arxiv.org/abs/1301.3781))
— word2vec. Pennington et al. (EMNLP 2014, `D14-1162`) — GloVe. Levy & Goldberg (NIPS 2014) — SGNS is implicit
PMI matrix factorisation. **Levy, Goldberg & Dagan (TACL 3, 2015)** — hyperparameters, not algorithms, explain
the gains; read immediately after Baroni. Bojanowski et al. (TACL 5, 2017) — fastText subwords.
Vaswani et al. ([arXiv:1706.03762](https://arxiv.org/abs/1706.03762)). Peters et al. (NAACL 2018, `N18-1202`)
— ELMo. Devlin et al. (NAACL 2019, `N19-1423`) — BERT. **Ethayarajh (EMNLP 2019)** — contextual vectors are
highly anisotropic; the standard caution against naive cosine. Reimers & Gurevych (EMNLP 2019, `D19-1410`) —
Sentence-BERT.

**Word sense disambiguation.** Lesk (SIGDOC 1986) — gloss overlap, still the baseline. Gale, Church &
Yarowsky (1992) — one sense per discourse. Yarowsky (ACL 1995, `P95-1026`) — bootstrapping rivals supervised
WSD. **Navigli (ACM Computing Surveys 41(2), 2009)** — replaces the entire pre-neural literature.
Raganato, Camacho-Collados & Navigli (EACL 2017, `E17-1010`) — the unified evaluation framework; use it rather
than ad-hoc splits. Bevilacqua & Navigli (ACL 2020) — breaking the long-standing ~80% ceiling.

**Semantic roles.** Baker, Fillmore & Lowe (COLING-ACL 1998, `P98-1013`) — FrameNet. **Gildea & Jurafsky
(CL 28(3), 2002)** — the task as now defined. Palmer, Gildea & Kingsbury (CL 31(1), 2005) — PropBank.
He et al. (ACL 2017, `P17-1044`) — deep SRL.

**Meaning representation.** Zettlemoyer & Collins (UAI 2005). Berant et al. (EMNLP 2013, `D13-1160`).
Banarescu et al. (LAW 2013, `W13-2322`) — AMR. **Abend & Rappoport (ACL 2017, `P17-1008`)** ✓ — *The State of
the Art in Semantic Representation*, the right paper for comparing AMR, UCCA, MRS and UD.

**Entailment.** Dagan, Glickman & Magnini (PASCAL RTE 2005) — the task. Bowman et al. (EMNLP 2015, `D15-1075`)
— SNLI. Williams et al. (NAACL 2018, `N18-1101`) — MultiNLI. Then the three papers that partly demolish the
first two: Gururangan et al. (`N18-2017`), Poliak et al. (`S18-2023`), McCoy, Pavlick & Linzen (`P19-1334`,
HANS).

**Topics and terms.** Hofmann (SIGIR 1999) — pLSA. Blei, Ng & Jordan (JMLR 3, 2003) — LDA. Chang et al.
(NIPS 2009) — *Reading Tea Leaves*. Röder, Both & Hinneburg (WSDM 2015) — coherence measures. Witten et al.
(1999) — KEA. Frantzi, Ananiadou & Mima (IJDL 3(2), 2000) — C-value/NC-value. Mihalcea & Tarau (EMNLP 2004,
`W04-3252`) — TextRank. Campos et al. (Information Sciences 509, 2020) — YAKE.

**Entity linking.** Milne & Witten (CIKM 2008). Ratinov et al. (ACL 2011, `P11-1138`) — local versus global.
Hoffart et al. (EMNLP 2011, `D11-1072`) — AIDA. Wu et al. (EMNLP 2020) — BLINK. De Cao et al.
([arXiv:2010.00904](https://arxiv.org/abs/2010.00904)) — GENRE, autoregressive entity retrieval.

**Evaluation.** Wang et al. — GLUE and SuperGLUE, now saturated and best read as cautionary history.
Bender & Koller (ACL 2020, `2020.acl-main.463`). Ribeiro et al. (`2020.acl-main.442`) — CheckList.
**Bowman & Dahl (NAACL 2021, `2021.naacl-main.385`)** — what benchmarking would have to do to work.
Card et al. (EMNLP 2020) — statistical power in NLP experiments. Dror et al. (ACL 2018, `P18-1128`).

### Surveys that replace a stack of papers

Turney & Pantel (JAIR 2010) — thirty distributional papers. Navigli (CSUR 2009) — pre-neural WSD.
Erk (Language and Linguistics Compass 6(10), 2012) — the linguist's framing. Lenci (Annual Review of
Linguistics 4, 2018) and Boleda (ARL 6, 2020) — what distributional vectors do and do not model.
Bos (LLC 5(6), 2011) — the logic-based side. Rogers, Kovaleva & Rumshisky (TACL 8, 2020) — *A Primer in
BERTology*, replacing a large probing literature.

### Where the field publishes

**Conferences are the venue of record, not journals.** ACL, EMNLP and NAACL are top tier; EACL and AACL
regional; COLING biennial and independent; LREC for resources and annotation; CoNLL for empirical and
shared-task work; **\*SEM is the dedicated computational-semantics conference and is where a semantics reader
should look first.** **TACL** is a rolling-submission journal whose papers present at ACL conferences and is
usually the most careful work in the field; *Computational Linguistics* (MIT Press) is slower and more
architectural.

The **[ACL Anthology](https://aclanthology.org)** is the free canonical archive — every paper, open access,
stable IDs (`P17-1008` for ACL 2017; post-2020 IDs look like `2020.acl-main.463`), per-paper BibTeX, and a
downloadable full-corpus BibTeX dump for local grepping. Its site search is weak; site-scoped web search plus
author pages is the reliable technique.

**arXiv cs.CL** is where work is announced months before review, and its signal-to-noise ratio is poor and
worsening — no review, heavy self-promotion, many prompting papers with no baselines. Treat an arXiv-only
paper as a preprint claim and check whether it later appears in the Anthology. Filter by authors and groups
you have found reliable, not by topic feeds.

**Shared tasks matter more in semantics than elsewhere** — they define the datasets and metrics subsequent
papers are obliged to use, so the task-description paper is often the highest-value read in a subfield.

**Papers With Code is gone** — verified 15 August 2026: `paperswithcode.com` returns HTTP 302 to
`huggingface.co/papers/trending` ✓. Leaderboards and code links that lived there are unmaintained.

### Three routes, each in order

**Theory.** Harris 1954 → Firth 1957 → Cruse Ch. 1–4 → SLP3 Appendix I → Fellbaum Ch. 1–2 → Murphy 2003 →
SLP3 Appendix H → Blackburn & Bos Part I → Abend & Rappoport 2017 → Bender & Koller 2020.

**Applied.** SLP3 Ch. 5 and Appendix J → Church & Hanks 1990 → Mikolov 2013 → Pennington 2014 → Levy,
Goldberg & Dagan 2015 → Vaswani 2017 → Devlin 2019 → Reimers & Gurevych 2019 → Ethayarajh 2019 (why your
cosine similarities are all 0.9) → MTEB, then your task's shared-task paper.

**Frontier.** Turney & Pantel 2010 → Lenci 2018 → Raganato 2017 → Banarescu 2013 → Abend & Rappoport 2017 →
Bowman 2015 → Gururangan 2018 and McCoy 2019 as a pair → Rogers 2020 → Bowman & Dahl 2021 → Xiao & Zhu 2025,
then the last two \*SEM and TACL cycles.

### Reference tools

| Tool | Best for | Caveat |
|---|---|---|
| **Semantic Scholar** + its Graph API | Citation *contexts* — how a paper is cited, not just that it was; building a citation-following pipeline | Free key required for the API |
| **OpenAlex** | Bulk and coverage questions ("everything citing X, by year"); successor to Microsoft Academic Graph | No key, generous limits |
| **Connected Papers** | Orienting in an unfamiliar subfield in ten minutes | Co-citation similarity, not direct citation — edges are suggestive |
| **Google Scholar alerts** | Highest-recall notification | Set alerts on *authors* and on citations to anchor papers; keyword alerts flood |
| **ACL Anthology BibTeX** | Correct citations | Never cite from Scholar's export, which mangles venue names and mislabels workshop papers |
| **Zotero** | Reference management; its connector reads Anthology and arXiv pages correctly | — |

---

## Compilation notes

Eight parallel reviews, 2026-08-15, each instructed to verify against primary sources and to mark what it
could not. Two failure modes were observed and are worth recording as method notes for anyone commissioning
similar work:

1. **One automated fetch returned a fabricated results table** — plausible in format, wrong in content —
   caught only by decoding the PDF locally and comparing. Any figure here not marked ✓ carries the residual
   risk that survived that process.
2. **Two reviewers corrected their own headline figures unprompted** on re-examination. The most consequential
   was a widely-quoted 85.29% for dataless classification, which is an average over ten *binary* problems and
   not a multi-class result; the real multi-class figures are micro-F1 0.682 and 0.371.

**Contested between reviewers, unresolved here:** the WordNet Domains licence (CC BY 3.0 versus CC BY-NC-SA
3.0), the Leipzig co-occurrence licence, and whether eXtended WordNet Domains is still distributed at its
original host.

**Known gaps.** Not verified during compilation: Dror et al.'s exact significance decision tree; Artstein &
Poesio's text; SemEval-2007 coarse-grained agreement figures; PARSEME edition details (both candidate URLs
failed); several book edition numbers; and most §canon entries individually, which are given from
bibliographic knowledge with Anthology IDs for confirmation.
