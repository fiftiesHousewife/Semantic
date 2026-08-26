/* Draws one tile per sense, weighed by the claims of the words that resolve to it. */
(function () {
    "use strict";

    var SMALLEST = 0.95;
    var LARGEST = 2.6;

    var data = JSON.parse(document.getElementById("synsets").textContent);
    var cloud = data.cloud;
    var leading = data.leadingDomains || [];
    var readout = document.querySelector(".readout");
    readout.textContent = "Rest on a meaning for its figures.";
    document.querySelector(".repository").textContent = cloud.repository;

    var least = cloud.senses.reduce(function (found, sense) {
        return Math.min(found, sense.claim);
    }, Infinity);
    var most = cloud.senses.reduce(function (found, sense) {
        return Math.max(found, sense.claim);
    }, 0);

    /* Size is a fixed multiple of the claim, the scale the word cloud page states. */
    function sized(claim) {
        if (most <= least) {
            return SMALLEST;
        }
        var share = (Math.log(claim) - Math.log(least)) / (Math.log(most) - Math.log(least));
        return SMALLEST + (LARGEST - SMALLEST) * share;
    }

    function label(sense) {
        return sense.members.map(function (member) {
            return member.word.replace(/_/g, " ");
        }).join(" · ");
    }

    function statement(sense) {
        var parts = [label(sense) + " — " + sense.claim.toFixed(4) + " bits",
            sense.partOfSpeech + " '" + sense.name.replace(/_/g, " ") + "'"];
        if (sense.domains.length) {
            parts.push(sense.domains.join(", "));
        }
        if (sense.members.length > 1) {
            parts.push("one meaning written " + sense.members.length + " ways");
        }
        return parts.join(" · ");
    }

    /* Largest tiles toward the middle of the block, so the cloud reads from its centre outwards. */
    function centred(senses) {
        var left = [];
        var right = [];
        senses.forEach(function (sense, index) {
            (index % 2 ? left : right).push(sense);
        });
        return left.reverse().concat(right);
    }

    function chipFor(sense) {
        var at = -1;
        sense.domains.forEach(function (domain) {
            var place = leading.indexOf(domain);
            if (place >= 0 && (at < 0 || place < at)) {
                at = place;
            }
        });
        if (at < 0) {
            return null;
        }
        var chip = document.createElement("span");
        chip.className = "chip set-" + at;
        return chip;
    }

    var panel = document.querySelector(".cloud");
    centred(cloud.senses).forEach(function (sense) {
        var made = document.createElement("a");
        var chip = chipFor(sense);
        if (chip !== null) {
            made.appendChild(chip);
        }
        made.appendChild(document.createTextNode(label(sense)));
        made.href = "vocabulary.html#w-" + encodeURIComponent(sense.members[0].word);
        made.style.fontSize = sized(sense.claim).toFixed(2) + "rem";
        if (sense.members.length > 1) {
            made.className = "merged";
        }
        function show() {
            readout.textContent = statement(sense);
        }
        made.addEventListener("mouseenter", show);
        made.addEventListener("focus", show);
        panel.appendChild(made);
    });

    document.querySelector(".foot").textContent = "The export's " + data.signals + " signals become "
        + cloud.significantWords + " words once two spellings with one dictionary form count once; "
        + (cloud.significantWords - cloud.wordsWithoutASense) + " resolve to " + cloud.senses.length
        + " meanings, and " + cloud.wordsWithoutASense
        + " have no dictionary sense and contribute no tile. A coloured mark names one of the three "
        + "leading domains: " + leading.join(", ") + ".";
}());
