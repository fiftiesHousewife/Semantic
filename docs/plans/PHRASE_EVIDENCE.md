# Phrase evidence reaches the divergence arithmetic

**This document is a commission, not a design.** Pippa commissioned the design on 2026-08-27 with the instruction that it not be done in haste: the design is to be written in full, after deep reading of the published research, before any code. This page records what is known, what is constrained, and what must be read, so the design session starts from evidence rather than from memory.

## The measurements that motivate it

All figures are readings of the named commits (`d99a2ff` through `05088b2`), regenerable with the probes named beside them; do not quote them without re-running.

- Every Jensen–Shannon figure in the reading rests on single-word atoms. The vocabulary ranking's divergence is over words against word-frequency references; the placement divergences compare topic distributions that words vote into through their senses. The term-matching path — the only place phrases exist — feeds no distribution, by the design step 8 of `BACKLOG.md` states.
- Phrase matches separate fields at a strength the word path never reaches. Distinct multi-word phrases per repository, `injectedTermMatch` over the bundled vocabularies: FIBO 84 on fineract and 72 on strata against at most 12 on any control; FpML 92 and 106 against at most 29; FIX put quickfixj at 162 corroborated spans per thousand names with the protocol's own session vocabulary. Single-word rates ran 3–10× field-to-control; phrase rates ran 10–100×.
- The venn's word placements rest on label containment: `owl` sits in artificial intelligence because CSO labels carry the word, and the topic label that carried it — the phrase — is discarded at index time. `CountedSenseDomains` keeps the area labels and drops the subject's own name.

## The candidate directions, as stated so far

1. **Carry the placing phrase into the sense record.** Extend the sense record so each placed word can name the topic labels that placed it. Display honesty first: every placement becomes checkable against a publisher's phrase, and the weak placements become visible. Ripples through `lexicon` (the record) and the WordNet path (what fills the field there).
2. **Phrase-corroborated sense weighting.** A sense whose full label the repository wrote as a phrase — already recorded in `evidence.json` `matches` — takes counted weight instead of the uncounted 0.5, before words vote into the topic distributions. The placement divergences then inherit phrase structure without a phrase-frequency reference existing. This moves the reading and takes the full backtest, criterion stated first.
3. **A derived phrase unit in the pooling itself.** Step 2 already reads a run of adjacent words a topical resource publishes as one entry (`CollocatedWords`, 69,713 published phrases). What is not designed: whether the pooled unit of step 5 should be the published phrase where one was written, with the word the fallback — and what reference such a unit's chance bar could be derived from, since no bundled resource states phrase frequencies.

## Constraints the design must hold to

- A bound must be derived, never chosen. A phrase has no frequency in the bundled references, so any chance bar for phrase evidence needs a stated derivation — a permutation of the phrases the repository itself wrote, a citation-side null, or an argument that no bar is needed because the citation is the evidence.
- A signal that cannot speak must abstain, not vote zero.
- The corpus is never filtered alone — a unit changed on one side of a divergence changes the denominator on both.
- The repositories the design is tuned on and measured on stay disjoint; the backtest criterion is stated before the run.

## What must be read before designing

The design session reads the published literature first and cites what it keeps. The areas, named so the search starts somewhere: multiword-expression recognition and its evaluation; collocation measures (pointwise mutual information and its variants, log-likelihood ratio); termhood and unithood measures from automatic term recognition (C-value/NC-value and successors); phrase-aware topic models and n-gram language-model smoothing as precedents for mixing units of different order; and the word-sense-disambiguation literature already cited by `AGREED_SENSES.md`, whose one-sense-per-discourse machinery is the nearest landed precedent for direction 2.
