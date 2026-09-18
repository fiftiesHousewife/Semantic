# Static security analysis of a change

Three things a reviewer looks for and a parse can find: **transport security switched off**, **a secret or a key committed**, and **an algorithm the platform itself refuses**. Every rule below cites the party that defined it, and the parse decides every rule on its own.

**String literals enter here and nowhere else.** The semantic reading discards a literal as somebody else's vocabulary quoted. This path reads literals as shape — their bytes, their entropy, their structure — and nothing it finds reaches a subject figure, a signal or a concept. The two readings share the parse and share no number.

---

## A. Transport security switched off

The commonest way to disable TLS in Java is to supply an implementation of the platform's own verification interfaces that verifies nothing. It is a shape, and the platform names every part of it.

| The parse measures | Weakness | The definition quoted |
|---|---|---|
| a type implementing a platform TLS interface, whose overriding method carries no statements | [CWE-295](https://cwe.mitre.org/data/definitions/295.html), Improper Certificate Validation | The product does not validate, or incorrectly validates, a certificate |
| a `verify` body that is a single `return true` | [CWE-297](https://cwe.mitre.org/data/definitions/297.html), Improper Validation of Certificate with Host Mismatch | The product communicates with a host that provides a certificate, but the product does not properly ensure that the certificate is actually associated with that host |
| a `checkServerTrusted` or `checkClientTrusted` body that is a single `return` | CWE-295 | as above |
| a call to `setDefaultHostnameVerifier` or `setDefaultSSLSocketFactory` | CWE-295 | the platform declares both, and each replaces verification process-wide |

**How the parse knows the interface without a symbol solver.** The type name is written in the text — at the `implements` clause, or at the anonymous class creation `new X509TrustManager() { … }`. Which of those names belong to the platform is the platform's own statement: [`PlatformPackages`](../../code-semantics-engine/src/main/java/io/github/fiftieshousewife/codesemantics/engine/parse/PlatformPackages.java) already asks `ModuleFinder.ofSystem()` which packages it exports, and Java 25 carries [`java.lang.classfile`](https://openjdk.org/jeps/484) in the platform itself, so the JDK's own class files state which types in `javax.net.ssl` are interfaces and what methods each declares. No name is written down here.

**Worked example.**

```java
sslContext.init(null, new TrustManager[] { new X509TrustManager() {
    public void checkServerTrusted(X509Certificate[] chain, String type) { }
    public void checkClientTrusted(X509Certificate[] chain, String type) { }
    public X509Certificate[] getAcceptedIssuers() { return null; }
} }, new SecureRandom());
```

`X509TrustManager` is a type `javax.net.ssl` exports, and the class file declares `checkServerTrusted` on it. The change writes that method with no statements. The report states the file, the line, CWE-295 and MITRE's sentence. It states nothing about whether the code runs in a test.

**What it overstates.** A repository declaring its own `X509TrustManager` in a package of its own matches on the simple name. That reports a finding where the platform's interface is not involved, which overstates rather than hides — the direction `PlatformPackages` already errs in, for the same reason.

**What settles it**: the rule fires on a tree with a known trust-all manager and reaches nothing on Maven and Aeron.

---

## B. Secrets and keys

Four rules, ranked by how little curation each needs.

### B1. A private key, from the standard that defines one

[RFC 7468](https://www.rfc-editor.org/rfc/rfc7468) defines the textual encapsulation of PKIX and PKCS structures: the exact `-----BEGIN <label>-----` boundary, and the labels themselves. Four of them are a private key — `PRIVATE KEY`, `RSA PRIVATE KEY`, `EC PRIVATE KEY`, `ENCRYPTED PRIVATE KEY`.

A string literal or a resource file carrying one of those boundaries holds a key. The rule is the RFC's own grammar and nothing else, so it needs no catalogue and cannot go stale against anything but the RFC. [CWE-321](https://cwe.mitre.org/data/definitions/321.html), Use of Hard-coded Cryptographic Key.

### B2. A token, from the standard that defines one

[RFC 7519](https://www.rfc-editor.org/rfc/rfc7519) §3.1 defines the JWT compact serialisation: three base64url segments separated by dots, the first decoding to a JSON object carrying `alg`. A literal matching that structure is a token, decided by decoding rather than by pattern. [CWE-798](https://cwe.mitre.org/data/definitions/798.html), Use of Hard-coded Credentials.

### B3. A provider's own documented key format

Providers document the shape of their own credentials: AWS states the `AKIA` and `ASIA` prefixes for an access key identifier, GitHub states `ghp_`, `gho_`, `ghs_` and `github_pat_` for its tokens. A bundled TSV carries **one row per provider, each citing that provider's own documentation URL** — the [`sql-functions.tsv`](../../lexicon/src/main/resources/sql-functions.tsv) precedent, which is a curated statement of published standards rather than a curated observation of a corpus.

**What is refused here**: adopting a detection tool's whole rule set as a blob. A rule whose row cannot name the publisher that documented the format does not go in the file.

### B4. A literal too disordered for this repository's own prose

The key nobody published a format for still has a property: it is closer to random bytes than the repository's other literals. Shannon entropy per character measures that, and the bound is **derived from the tree rather than chosen**, by the machinery the reading already uses everywhere:

1. Measure the entropy per character of each string literal a change adds.
2. Draw 999 literals of the same length band at random from the tree at base.
3. Report the literal only where its entropy exceeds all 999.

**Worked example.** A change adds `"hJ8kQ2mZ7xR4nP1vB6wL9tY3"`, 24 characters at 4.42 bits each. Among 999 literals of 20 to 29 characters drawn from the same repository — SQL fragments, format strings, file names — the highest reaches 3.71. The literal is reported, and the figure stated is 4.42 against 3.71.

**The two products meet here.** A high-entropy literal initialising a field the bundled resources place under a security or cryptography subject is a stronger finding than either half alone, and both halves cite a publisher: the entropy against the tree's own null, and the subject from WordNet Domains and Wiktionary. The word list a rule like this usually needs — `password`, `secret`, `apiKey`, `token` — is what the resources already answer, so none is written here.

**What settles B4**: precision on the eleven members. A rule reporting base64-encoded test fixtures as secrets is measuring length, not disorder, and the length band is what has to absorb that.

---

## C. An algorithm the platform itself refuses

**Ask the runtime.** `java.security.Security.getProperty("jdk.tls.disabledAlgorithms")` and `"jdk.certpath.disabledAlgorithms"` state what the running JDK refuses — MD5, SHA1, DES, RC4, SSLv3, TLSv1, TLSv1.1, and the key sizes beneath its floors. That is the platform's own statement, read the way `PlatformPackages` reads the export list, and an extracted copy of it would go stale against every JDK release while a delegation cannot.

| The parse measures | Weakness | Cited by |
|---|---|---|
| a string literal naming an algorithm the platform's own disabled list names, at a change that adds it | [CWE-327](https://cwe.mitre.org/data/definitions/327.html), Use of a Broken or Risky Cryptographic Algorithm | the JDK's `java.security` properties, and [NIST SP 800-131A Rev. 2](https://doi.org/10.6028/NIST.SP.800-131Ar2) for the transition each reflects |
| a file importing `java.util.Random` that also imports a platform security package | [CWE-338](https://cwe.mitre.org/data/definitions/338.html), Use of Cryptographically Weak PRNG | `java.util.Random`'s own javadoc states instances are not cryptographically secure |

**Worked example.** A change writes `MessageDigest.getInstance("MD5")`. `jdk.certpath.disabledAlgorithms` on the running JDK names `MD5`. The report states the file, the line, the algorithm, the property that names it, and CWE-327's definition. It does not state that the digest is used for security — a checksum over a cache key is the same call, and deciding which needs the dataflow refused below.

---

## What is refused

| Refused | Why |
|---|---|
| taint or dataflow analysis | it needs type resolution and a call graph. No symbol solver is on the classpath, and the honest answer to a question the machinery cannot ask is silence |
| whether a finding is reachable or exploitable | the same gap. Every rule reports a shape at a line |
| a severity score | CWE publishes no severity, and CVSS scores an instance of a vulnerability, of which there is none here |
| a detection tool's rule set adopted whole | a row whose publisher cannot be named is an assertion |
| the words *insecure*, *vulnerable* and *unsafe* | the report states the shape and names who defined it |

---

## What the whole thing is measured on

**A security library writes security code as its job.** Apache Santuario declares TLS types and names algorithms in abundance, all of it correct, so a rule counted against Santuario measures the domain rather than the defect. Three controls are needed and only the first two exist:

| Control | Expected | Status |
|---|---|---|
| Maven, Aeron, Besu | near zero on every rule — no bundled rule should reach a build tool or a transport | the [evaluation set](../METHOD.md#the-evaluation-set) carries them |
| Santuario, jPOS | findings stated, none of them called a defect, and the report readable beside the domain | the same |
| a tree with known planted findings | every rule fires where the answer key says | **missing**, and it is what the routes above are worth nothing without |

For the third, [the OWASP Benchmark](https://owasp.org/www-project-benchmark/) is a purpose-built Java suite publishing its own answer key per test case, which satisfies *do not mark your own homework* in a way a fixture written here would not. **Check first** whether it sits in the pooled reference corpus draw: a member of the corpus the reading is scored against cannot also be the ground truth.

---

## Order

1. **C, the disabled-algorithm list.** One runtime delegation, one literal comparison, and no new resource file.
2. **B1 and B2**, which are two RFC grammars and need no catalogue.
3. **A**, which needs the class-file read of `javax.net.ssl` and gives the highest-value finding.
4. **B4, the entropy null**, which needs the literal corpus indexed per tree.
5. **B3**, the provider TSV, last because it is the one file that goes stale and the one that needs a row-by-row citation pass.

Each ships with the eleven members re-read. **Abandon a rule if** it cannot be decided by the parse alone, or if its count on Maven, Aeron and Besu is not near zero.

## References

- [CWE](https://cwe.mitre.org/), The MITRE Corporation, catalog 4.13. Weaknesses 295, 297, 321, 327, 338 and 798.
- [JEP 484: Class-File API](https://openjdk.org/jeps/484).
- [NIST SP 800-131A Rev. 2](https://doi.org/10.6028/NIST.SP.800-131Ar2), Transitioning the Use of Cryptographic Algorithms and Key Lengths.
- [OWASP Benchmark](https://owasp.org/www-project-benchmark/).
- [RFC 7468](https://www.rfc-editor.org/rfc/rfc7468), Textual Encodings of PKIX, PKCS, and CMS Structures.
- [RFC 7519](https://www.rfc-editor.org/rfc/rfc7519), JSON Web Token.
