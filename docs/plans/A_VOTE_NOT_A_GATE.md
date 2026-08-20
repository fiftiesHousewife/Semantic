# A vote and not a gate: two classes state the contract and break it

Two classes in the reading say in their own javadoc that they weigh a signal rather than silence it, and both give a weight of exactly zero. One of them decides which topics a file can reach at all. Fixing it is not a design change — it is making the code do what it says.

## The defect

`PhraseTopics.under` is the second pass: a phrase is read again with the file's own first-pass answer as context. Its javadoc states the contract:

> It is a vote and not a gate. A topic the file barely holds is quietened rather than removed, and a topic the file has never read at all is not in the prior and so cannot be conditioned on.

The code:

```java
final double score = agreed(...) * agreeing.size() / distinct.count() * expectedIn(topic);
if (score > 0.0) { scores.put(topic, score); agreement.put(topic, agreeing); }

private double expectedIn(final String topic) {
    return prior.isEmpty() ? 1.0 : prior.shareOf(topic);   // getOrDefault(topic, 0.0)
}
```

**A topic the first pass did not reach is multiplied by zero and dropped.** It is conditioned on, and it is removed.

### What that costs, measured

| | |
|---|---|
| The doctrine | *a signal that cannot speak must abstain, not vote zero*. Here a signal that **can** speak — a resource labelled that sense — is forced to zero by context |
| Self-reinforcement | the second pass cannot introduce a topic the first missed. It only redistributes within the first pass's support, so **the topic set of the whole reading is decided by pass 1** |
| The worked case | on Apache Santuario, `signature` votes `linguistics` 0.42, `law` 0.42, `cryptography` 0.04, and the word `cryptography` votes nothing at all — 0 votes, coverage 0.000. Pass 1 lands on linguistics and law; pass 2 multiplies cryptography by its near-zero share and drops it. The right sense is not outvoted, it is deleted |

### The same defect, second instance

`WordSpecificity` states *"it is a weight and never a gate: the commonest word in English still votes, at the smallest weight the list can express"*, and computes `log(rank) / log(size)`. `WordRanks` states rank 1 for the most frequent word, so `log(1) = 0` and it votes nothing. Measured on a second frequency list during the topic-size work: Tika reached 862 topics under that form against 863 under every other, the missing one being the top-ranked topic silenced rather than weighed. Already in [the backlog](../../BACKLOG.md) as its own item, and it moves every figure in the tree, so it is not fixed here.

## The fix

`expectedIn` becomes `1 + prior.shareOf(topic)`.

| Case | Now | After |
|---|--:|--:|
| A topic the file is 30% about | ×0.30 | ×1.30 |
| A topic the file barely reads | ×0.02 | ×1.02 |
| **A topic the first pass missed** | **×0, dropped** | **×1.00, unchanged** |

**The bound is derived and nothing is chosen.** A share lies in `[0, 1]` by its own definition, so the factor lies in `[1, 2]`. Context can promote and never delete, which is what the javadoc already promises.

### The bonus runs through the published hierarchy

The topic vocabulary states a generalisation map — `StatedTopics` and `BroaderTopics` already use it, and it is why a sense given `computing` arrives carrying `engineering`, `mathematics` and `sciences` beside it. Under literal string matching a sense labelled `phonetics` earns nothing from a file that reads `linguistics`, which is the same label one step up.

So a topic is in the file's context if the file reads **that label or anything it implies**, walked through the publisher's own map. Nothing is written by hand and the map is the one already bundled.

## What settles it

| | |
|---|---|
| Measures | the field distribution of the ten nearest, and the leader, on Tika, Maven and Santuario, against the subject area the manifest records — and `publishing`'s and `law`'s share of this repository's own reading, reported beside them |
| Settles it | no member's field concentration falls, and at least one of them gains a sense the gate was deleting. The Santuario case is the named one: `cryptography` reaching the reading at all |
| Ends it | a member's ranking falls, or `publishing` grows here without a member gaining. Nothing is silenced any more, so **D5 is the thing most likely to grow**, and it is the figure to watch rather than a side effect to explain afterwards |

**Every figure in the tree moves.** This is in the core scoring path, not on the subject side. The pinned findings move, the self-read moves, `changes.json` will be large. Run `./gradlew read` and the `pinned` tag before and after, and keep both.

## Order

1. **This.** It is a defect against a stated contract, it is three lines, and it gates everything else.
2. **D11 — a topic vocabulary's own labels do not label themselves.** 470 of 719, including `cryptography`. It adds the vocabulary that identifies a repository, and it is worth more once the gate is not deleting it.
3. **D12 — selecting a sense.** Only after 1 and 2, because the published grounding — Gale, Church & Yarowsky (1992) one sense per discourse, Yarowsky (ACL 1995) bootstrapping — assumes a seed set worth bootstrapping from, and D11 is what supplies it.

Each is measured separately. Two changes at once cannot be told apart, which is the rule the coverage work established and the keyword-specificity work confirmed.

## What this is not

It is not sense disambiguation. No sense is chosen and none is removed; a sense whose domain the file already reads is worth more than one it does not. Choosing is step 3, and it needs the confidence floor Yarowsky's own method carries, because a first pass that lands on `publishing` — which `read` votes for at mass 1.00 — would otherwise entrench it.
