# Taxonomies for the domains software itself works in

Seven domains to cover: computer science, data analysis, DevOps and testing, cyber security, AI, workflow, and business intelligence. [The industry plan](INDUSTRY_VOCABULARIES.md) covers the field a repository sits *beside* — finance, and the standards a repository implements. This one covers the field a repository sits *in*, which is where nearly every tree the panel will ever hold actually lives.

**It is the answer to a defect already stated.** arXiv classifies research: it has `cs.SE` for the whole of software engineering, no category for a payments system, and none for a test harness or a build tool either. A reading that places a Kubernetes operator in *Systems and Control* has been given no better option. These seven are the vocabulary a repository writes rather than the field a paper is filed under.

## The rule that decides what a candidate is

| Kind | Read as | Fires on | Example |
|---|---|---|---|
| **Term taxonomy** | matched against declared names, span by span | an identifier the publisher defined | OpenTelemetry's `http.request.method`; ONNX's `MatMul`; BPMN's `ExclusiveGateway` |
| **Functional taxonomy** | a distribution to compare against | prose, pooled per category | NIST CSF's `GV.OC-01`, which states nothing without the sentence NIST defines it by |

**A schema beats a thesaurus, and the doctrine already says so.** `sql-functions.tsv`'s header states it: a token equal to a published function's name is a fact about the standard the tool executes rather than an observation of a corpus. The strongest candidates below are the ones whose terms are *already identifiers*, because a match is then identifier to identifier with no English in between — and the weakest are the ones spelled in ordinary English, which is precisely where OLiA's noise comes from.

## The candidates, by domain

**Every licence line below is unread unless it says otherwise.** Nothing is extracted until a verdict is written down in this table, in the form [the industry plan](INDUSTRY_VOCABULARIES.md) uses. That is the same line ACM CCS stopped at.

### Computer science

| Candidate | Publishes | Identifier-shaped | Licence |
|---|---|--:|---|
| **CSO**, Computer Science Ontology | ~15,000 topics, SKOS-derived, `klink:relatedEquivalent` for synonymy | no — English topic names | CC BY 4.0 on the publisher's pages, **not stated on the download page**. Already queued at stage 3 of the industry plan and blocked there for this reason |
| **SEVOCAB**, ISO/IEC/IEEE 24765 | the systems and software engineering vocabulary, term and definition | no | unread. It is an ISO product served through a free browser, which is the shape that usually permits use and not redistribution |
| ACM CCS | SKOS | no | **ruled out** — educational and research use only, and a jar on Maven Central is neither |
| arXiv `cs.*` | 40 category descriptions | — | **bundled**, and functional. It is the incumbent this plan exists to beat |

**The honest reading of this row: computer science has no good term taxonomy.** Its vocabulary is ordinary English — *cache*, *tree*, *stream*, *thread* — which is the exact collision the term matcher already fails on. The six domains below are narrower and their vocabularies are better spelled.

### Data analysis

| Candidate | Publishes | Identifier-shaped | Licence |
|---|---|--:|---|
| **DCAT** (W3C) | the data catalogue vocabulary — `dcat:Dataset`, `dcat:Distribution`, `dcat:accessURL` | **yes** | unread. W3C states a document licence and a software licence and they differ |
| **DCMI terms** | `dc:title`, `dc:creator`, `dc:subject` | **yes** | unread — already queued by the industry plan for the same reason |
| **SDMX** | statistical data and metadata exchange: concepts, code lists | partly | unread |
| **STATO** | an ontology of statistical methods and results | no — English terms | unread; OBO-family ontologies commonly state CC BY |
| **Croissant** (MLCommons) | a metadata format for ML datasets | **yes** | unread |

### DevOps and testing

| Candidate | Publishes | Identifier-shaped | Licence |
|---|---|--:|---|
| **OpenTelemetry semantic conventions** | the attribute registry — `service.name`, `http.request.method`, `db.system`, `k8s.pod.name` — with a stated definition per attribute, and a namespace hierarchy that gives `broader` for free | **yes, and it is the best-shaped candidate in this document** | unread. The project states Apache-2.0 on its repositories; the conventions repository must be read on its own |
| **Kubernetes API** | resource kinds and field names — `Deployment`, `StatefulSet`, `livenessProbe` | **yes** | unread |
| **CDEvents** (CDF) | a vocabulary of CI/CD events | **yes** | unread |
| **SPDX** | licence identifiers and a document model | **yes** | unread |
| ISTQB glossary | the testing vocabulary — *equivalence partitioning*, *boundary value analysis* | no | unread, and glossaries of this kind usually forbid redistribution |
| ISO/IEC/IEEE 29119 | software testing | no | ISO sells its standards; least likely to clear |

**OpenTelemetry is the one to read first.** Its attributes are dotted identifiers with a stated namespace, so `broader` falls out of the name itself with no inference — the same property that made FpML's `Commodity:Agricultural:Dairy:Option` the strongest source the industry plan found. And no English sentence contains `k8s.pod.name`, so a hit cannot be a coincidence of ordinary vocabulary.

### Cyber security

| Candidate | Publishes | Identifier-shaped | Licence |
|---|---|--:|---|
| **NIST CSF 2.0** | six functions, categories, subcategories, each with the outcome NIST states | no — functional | **bundled already**, as `nist-csf-functions.tsv`. It is a distribution to diverge against, not a vocabulary to match |
| **MITRE ATT&CK** | tactics, techniques, sub-techniques, each with an identifier and a definition | partly — `T1055` is an identifier, *Process Injection* is English | unread. MITRE states its own terms of use for ATT&CK, and they must be read against *redistribute in a derived artefact* |
| **CWE** | weakness types — `CWE-79`, *Improper Neutralization of Input* | partly | unread, MITRE again |
| **IANA cryptographic registries** | the algorithm names a security codebase actually declares — JOSE `alg` values, TLS cipher suites, COSE | **yes** | unread. IANA registry terms are the same read the industry plan queues for media types |
| **OSCAL / SP 800-53** | control catalogues | no | US Government work, commonly public domain — to be verified, not assumed |
| STIX / TAXII (OASIS) | threat intelligence object types — `indicator`, `malware`, `attack-pattern` | **yes** | unread |

### AI

| Candidate | Publishes | Identifier-shaped | Licence |
|---|---|--:|---|
| **ONNX operator sets** | `Conv`, `MatMul`, `Softmax`, `LayerNormalization` — the operators a model implementation declares | **yes** | unread. The project states MIT on its repository; the operator documentation must be read on its own |
| **Hugging Face task taxonomy** | pipeline tags — `text-classification`, `token-classification`, `zero-shot-image-classification` | **yes** | unread |
| **CSO's machine-learning branch** | topics | no | as CSO above |
| arXiv `cs.AI`, `cs.LG`, `cs.CL`, `stat.ML` | descriptions | — | **bundled**, functional |

**AI is the domain where the term/functional split matters most.** A library that *implements* models writes ONNX's operator names; a library that *applies* them writes nothing of the kind and can only be placed by distribution. Both arms are needed and they answer different questions.

### Workflow

| Candidate | Publishes | Identifier-shaped | Licence |
|---|---|--:|---|
| **BPMN** (OMG) | element names — `ExclusiveGateway`, `IntermediateCatchEvent`, `ServiceTask` — which is exactly what a workflow engine declares | **yes** | unread. OMG specification licences differ by document and must be read per document |
| **CNCF Serverless Workflow** | a DSL's own vocabulary | **yes** | unread |
| **XPDL** (WfMC) | process definition elements | **yes** | unread |
| Workflow Patterns | the academic pattern catalogue | no | unread |

### Business intelligence

| Candidate | Publishes | Identifier-shaped | Licence |
|---|---|--:|---|
| **XBRL** | financial reporting taxonomies, element names | **yes** | unread. XBRL International states its own terms |
| **SDMX** | as above, and it is the strongest BI candidate for the same reason | partly | unread |
| **Common Warehouse Metamodel** (OMG) | dimension, cube, measure, hierarchy | **yes** | unread |
| DAMA-DMBOK | the data management vocabulary | no | a copyrighted book — **ruled out** without a read |
| `sql-functions.tsv` | the query language's own function catalogue | **yes** | **bundled**, and the precedent the whole approach rests on |

## The pre-work, in order

**None of it is extraction, and none of it is blocked on the panel.**

| | What | Produces | Blocked on |
|--:|---|---|---|
| 1 | **Read the licences.** One verdict per candidate, written into the tables above in the same form the industry plan uses: what the publisher says about redistribution in a derived artefact, quoted, with the URL and the date read | a verdict per row, and a shorter list | nothing |
| 2 | **Name the evaluation set, before anything is measured.** Two repositories per domain that are in it and two that are outside it, each with its domain stated by somebody outside this project — the category token its own DOAP, `package.json` or Trove classifier states — recorded before the reading runs | `panel.tsv` rows | nothing |
| 3 | **Run FIBO as the control that costs nothing.** It is bundled, `FiboTerms` is read by nothing but its own test, and a linguistics library is a repository a finance ontology should be silent about. It settles whether the matcher is measuring Java before a single new source is fetched | one number, on a source already in the tree | nothing |
| 4 | **Restructure the extractors** | one `PinnedSource`, one `Extraction`, one runner | it is [its own plan](THE_EXTRACTORS.md), and no new source lands before it |
| 5 | **Extract the cleared sources, best-shaped first** | one TSV per source, each with a provenance header | 1 and 4 |

**Step 3 is deliberately first among the measurements.** Every source below it costs a licence read and an extraction; FIBO costs neither and answers the question that would invalidate all of them.

## What settles it, stated before it runs

A domain vocabulary must fire on a repository in its domain and **stay silent on one outside it**. The figure is matched spans per thousand declared names, split by term length, in-domain against out-of-domain, judged against a null that permutes the term-to-concept assignment within the taxonomy while preserving branch and term-length distributions — so the matcher hits the same spans in the same places and only the branch reported is chance.

**Abandon a source if** its in-domain rate does not clear the null; if it discriminates only once single-word terms are excluded by hand; or if an audit of 50 sampled spans finds fewer than 40 genuine.

**And the doctrine's own trap is live here.** These seven domains are the ones this library's author works in, so a source chosen after reading this repository and then measured on it would be marking its own homework twice over. The evaluation set of step 2 is named before step 5 extracts anything, and this tree is not in it.
