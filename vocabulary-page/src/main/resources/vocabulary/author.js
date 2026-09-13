/* Draws one cloud of merged words per pull request from the data block beside it: each word's size is its
   score in bits against whichever reference writes it lower, and its shade is how far that score stands
   outside the pull request's own chance threshold. */
(function () {
    "use strict";

    var SMALLEST = 0.8;
    var LARGEST = 2.0;
    var BANDS = 5;

    var block = document.getElementById("pull-requests");
    if (block === null) {
        return;
    }
    var data = JSON.parse(block.textContent);

    function element(tag, className) {
        var made = document.createElement(tag);
        if (className) {
            made.className = className;
        }
        return made;
    }

    function statement(word) {
        var forms = word.forms.length > 1 ? " — written " + word.forms.join(", ") : "";
        return word.word + ": " + word.occurrences.toLocaleString() + " occurrences, "
            + word.claim.toFixed(4) + " bits" + forms + ".";
    }

    /* Largest toward the middle, so the cloud reads from its centre outwards. */
    function centred(words) {
        var left = [];
        var right = [];
        words.forEach(function (word, index) {
            (index % 2 === 0 ? left : right).push(word);
        });
        return left.reverse().concat(right);
    }

    data.pullRequests.forEach(function (pullRequest) {
        var cloud = document.querySelector('.cloud[data-pull-request="' + pullRequest.number + '"]');
        var readout = document.querySelector('.cloud-readout[data-pull-request="'
            + pullRequest.number + '"]');
        if (cloud === null || pullRequest.words.length === 0) {
            return;
        }
        var claims = pullRequest.words.map(function (word) { return word.claim; });
        var weakest = Math.min.apply(null, claims);
        var strongest = Math.max.apply(null, claims);
        var span = strongest > weakest ? Math.log(strongest / weakest) : 0;
        centred(pullRequest.words).forEach(function (word) {
            var made = element("b", word.forms.length > 1 ? "merged" : null);
            made.appendChild(document.createTextNode(word.word));
            var share = span > 0 ? Math.log(word.claim / weakest) / span : 0;
            made.style.fontSize = (SMALLEST + (LARGEST - SMALLEST) * share).toFixed(2) + "rem";
            made.setAttribute("data-band", String(Math.min(BANDS - 1, Math.floor(share * BANDS))));
            made.setAttribute("tabindex", "0");
            made.addEventListener("mouseenter", function () {
                readout.textContent = statement(word);
            });
            made.addEventListener("focus", function () {
                readout.textContent = statement(word);
            });
            cloud.appendChild(made);
        });
        readout.textContent = pullRequest.words.length.toLocaleString()
            + " words. Rest on one for its figures.";
    });
}());
