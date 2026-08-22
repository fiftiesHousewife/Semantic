/* Shows one pipeline stage at a time, with the words that stage left. */
(function () {
    "use strict";

    var BANDS = 5;
    var SMALLEST = 0.9;
    var LARGEST = 3.2;

    var repository = JSON.parse(document.getElementById("vocabulary").textContent).repository;
    var stages = repository.stages;
    var at = 0;

    var summary = document.querySelector(".summary");
    var panel = document.querySelector(".stages");

    function element(name, className, text) {
        var made = document.createElement(name);
        if (className) {
            made.className = className;
        }
        if (text !== undefined) {
            made.textContent = text;
        }
        return made;
    }

    function count(label, value) {
        var pair = element("div");
        pair.appendChild(element("dt", null, label));
        pair.appendChild(element("dd", null, value));
        return pair;
    }

    /* Largest words toward the middle, so a cloud reads from its centre outwards. */
    function centred(words) {
        var left = [];
        var right = [];
        words.forEach(function (word, index) {
            (index % 2 ? left : right).push(word);
        });
        return left.reverse().concat(right);
    }

    /* SIZE carries the claim in bits and COLOUR carries how far that claim stands outside chance, both on a
       logarithmic scale, because both quantities span some hundreds to one across a stage.

       Area used to carry the claim directly, with the linear dimension its square root. That is the truer
       statement of a quantity and it could not be read: a root compresses three hundred to one down to
       seventeen, and the range a cloud has to spend it over then squashed seven words in ten into a quarter
       of a rem. The picture was a dozen large words over a uniform mat. So a step in size is a fixed
       MULTIPLE of the claim rather than a fixed amount of it, and the page says so rather than leaving a
       reader to assume the older rule. */
    function tile(word, readout) {
        var joined = word.word.indexOf("_") >= 0;
        var made = element("b", joined ? "run" : null, word.word.replace(/_/g, " "));
        made.style.fontSize = (SMALLEST + (LARGEST - SMALLEST) * word.size).toFixed(2) + "rem";
        made.setAttribute("data-band", String(word.band));
        made.setAttribute("tabindex", "0");
        function show() {
            readout.textContent = word.word.replace(/_/g, " ") + " — "
                + word.claim.toFixed(4) + " bits from what it is read against, "
                + word.timesChance.toFixed(1) + " times what chance would have reached, written "
                + word.occurrences.toLocaleString()
                + (word.occurrences === 1 ? " time" : " times");
        }
        made.addEventListener("mouseenter", show);
        made.addEventListener("focus", show);
        return made;
    }

    function show(index) {
        at = (index + stages.length) % stages.length;
        var stage = stages[at];
        panel.textContent = "";

        var head = element("div", "head");
        head.appendChild(element("p", "counter", "Stage " + (at + 1) + " of " + stages.length));
        head.appendChild(element("h2", null, stage.keeps));
        head.appendChild(element("p", "removes", stage.removes
            ? "This stage takes out " + stage.removes + "."
            : "Nothing has been taken out yet."));
        panel.appendChild(head);

        summary.textContent = "";
        summary.appendChild(count("Words left", stage.words.toLocaleString()));
        summary.appendChild(count("Times written", stage.occurrences.toLocaleString()));
        summary.appendChild(count("Words taken out", stage.removedWords.toLocaleString()));
        summary.appendChild(count("Times written", stage.removedOccurrences.toLocaleString()));

        var cloud = element("div", "cloud");
        var readout = element("div", "readout", "Hover a word for how often it was written.");
        var strongest = stage.drawn.length ? stage.drawn[0].claim : 1;
        var weakest = stage.drawn.length ? stage.drawn[stage.drawn.length - 1].claim : 1;
        var claimSpan = Math.log(strongest / weakest);
        var loudest = stage.drawn.reduce(function (most, word) {
            return Math.max(most, word.timesChance);
        }, 1);
        var doublings = Math.log(loudest) / Math.LN2;
        stage.drawn.forEach(function (word) {
            word.size = claimSpan > 0 ? Math.log(word.claim / weakest) / claimSpan : 1;
            var above = Math.log(Math.max(word.timesChance, 1)) / Math.LN2;
            word.band = doublings > 0
                ? Math.min(BANDS - 1, Math.floor(above / doublings * BANDS))
                : BANDS - 1;
        });
        centred(stage.drawn).forEach(function (word) {
            cloud.appendChild(tile(word, readout));
        });
        panel.appendChild(cloud);
        panel.appendChild(readout);

        var paging = element("nav", "paging");
        var back = element("button", null, "Previous stage");
        var next = element("button", null, "Next stage");
        back.type = "button";
        next.type = "button";
        back.disabled = at === 0;
        next.disabled = at === stages.length - 1;
        back.addEventListener("click", function () { show(at - 1); });
        next.addEventListener("click", function () { show(at + 1); });
        paging.appendChild(back);
        paging.appendChild(element("span", "dots", stages.map(function (each, index) {
            return index === at ? "●" : "○";
        }).join(" ")));
        paging.appendChild(next);
        panel.appendChild(paging);
    }

    document.addEventListener("keydown", function (pressed) {
        if (pressed.key === "ArrowRight" && at < stages.length - 1) {
            show(at + 1);
        }
        if (pressed.key === "ArrowLeft" && at > 0) {
            show(at - 1);
        }
    });

    document.querySelector(".repository").textContent = repository.repository;
    show(0);
}());
