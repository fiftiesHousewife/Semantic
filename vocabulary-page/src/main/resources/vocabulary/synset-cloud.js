/* Draws one tile per sense, weighed by the claims of the words that resolve to it. */
(function () {
    "use strict";

    var SMALLEST = 0.95;
    var LARGEST = 2.6;

    var cloud = JSON.parse(document.getElementById("synsets").textContent).cloud;
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

    var panel = document.querySelector(".cloud");
    cloud.senses.forEach(function (sense) {
        var made = document.createElement("a");
        made.textContent = label(sense);
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

    document.querySelector(".foot").textContent = "Of the " + cloud.significantWords
        + " significant words, " + (cloud.significantWords - cloud.wordsWithoutASense)
        + " resolve to " + cloud.senses.length + " meanings; " + cloud.wordsWithoutASense
        + " have no dictionary sense and contribute no tile.";
}());
