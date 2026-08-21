/* Shows one pipeline stage at a time, with the words that stage left. */
(function () {
    "use strict";

    var BANDS = 5;
    var SMALLEST = 0.8;
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

    /* Area carries the count, so the linear dimension carries its square root. */
    function tile(word, heaviest, readout) {
        var share = Math.sqrt(word.weight / heaviest);
        var joined = word.word.indexOf("_") >= 0;
        var made = element("b", joined ? "run" : null, word.word.replace(/_/g, " "));
        made.style.fontSize = (SMALLEST + (LARGEST - SMALLEST) * share).toFixed(2) + "rem";
        made.setAttribute("data-band", String(Math.min(BANDS - 1, Math.floor(share * BANDS))));
        made.setAttribute("tabindex", "0");
        function show() {
            readout.textContent = word.word.replace(/_/g, " ") + " — written "
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
        head.appendChild(element("p", "step", "Step " + (at + 1) + " of " + stages.length));
        head.appendChild(element("h2", null, stage.keeps));
        head.appendChild(element("p", "removes", stage.removes
            ? "This step takes out " + stage.removes + "."
            : "Nothing has been taken out yet."));
        panel.appendChild(head);

        summary.textContent = "";
        summary.appendChild(count("Words left", stage.words.toLocaleString()));
        summary.appendChild(count("Times written", stage.occurrences.toLocaleString()));
        summary.appendChild(count("Words taken out", stage.removedWords.toLocaleString()));
        summary.appendChild(count("Times written", stage.removedOccurrences.toLocaleString()));

        var cloud = element("div", "cloud");
        var readout = element("div", "readout", "Hover a word for how often it was written.");
        var heaviest = stage.drawn.length ? stage.drawn[0].weight : 1;
        centred(stage.drawn).forEach(function (word) {
            cloud.appendChild(tile(word, heaviest, readout));
        });
        panel.appendChild(cloud);
        panel.appendChild(readout);

        var steps = element("nav", "steps");
        var back = element("button", null, "Previous step");
        var next = element("button", null, "Next step");
        back.type = "button";
        next.type = "button";
        back.disabled = at === 0;
        next.disabled = at === stages.length - 1;
        back.addEventListener("click", function () { show(at - 1); });
        next.addEventListener("click", function () { show(at + 1); });
        steps.appendChild(back);
        steps.appendChild(element("span", "dots", stages.map(function (each, index) {
            return index === at ? "●" : "○";
        }).join(" ")));
        steps.appendChild(next);
        panel.appendChild(steps);
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
