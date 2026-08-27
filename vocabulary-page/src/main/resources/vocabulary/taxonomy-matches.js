/* Switches the measure the bars draw and mirrors a segment's figures into the readout line. */
(function () {
    "use strict";

    var readout = document.querySelector(".readout");
    var buttons = Array.prototype.slice.call(document.querySelectorAll(".sources button"));
    var measures = Array.prototype.slice.call(document.querySelectorAll(".measure"));

    buttons.forEach(function (button) {
        button.addEventListener("click", function () {
            buttons.forEach(function (each) {
                each.className = each === button ? "chosen" : "";
            });
            measures.forEach(function (block) {
                block.className = block.getAttribute("data-measure") === button.getAttribute("data-measure")
                    ? "measure chosen" : "measure";
            });
        });
    });

    function mirror(event) {
        var seg = event.target.closest ? event.target.closest(".seg") : null;
        if (seg) {
            readout.textContent = seg.getAttribute("data-figures");
        }
    }

    document.addEventListener("mouseover", mirror);
    document.addEventListener("focusin", mirror);
}());
