// A sunburst wedge is as wide as its share of the field, so most wedges are too thin to hold their own
// name — the label is dropped below the angle at which text fits, which on a taxonomy of 1,312 concepts is
// most of the ring. Every wedge already carries its full reading in an SVG <title>, but that is a native
// tooltip: it appears after a delay, in the platform's own styling, and a reader hunting for a name gives up
// before it arrives. This shows the same text immediately, at the cursor.
//
// The text is read from the wedge's own <title> rather than duplicated into a data attribute, so there is
// one statement of what a wedge says and the tooltip cannot drift from the accessible name.
(function () {
    'use strict';

    var OFFSET = 14;

    function tip() {
        var existing = document.querySelector('.sunburst-tip');
        if (existing) {
            return existing;
        }
        var made = document.createElement('div');
        made.className = 'sunburst-tip';
        made.setAttribute('role', 'status');
        document.body.appendChild(made);
        return made;
    }

    function textOf(arc) {
        var title = arc.querySelector('title');
        return title ? title.textContent : '';
    }

    function place(node, event) {
        var width = node.offsetWidth;
        var height = node.offsetHeight;
        var left = Math.min(event.clientX + OFFSET, document.documentElement.clientWidth - width - OFFSET);
        var top = event.clientY + OFFSET + height > document.documentElement.clientHeight
            ? event.clientY - height - OFFSET
            : event.clientY + OFFSET;
        node.style.left = Math.max(OFFSET, left) + 'px';
        node.style.top = Math.max(OFFSET, top) + 'px';
    }

    document.addEventListener('DOMContentLoaded', function () {
        var charts = document.querySelectorAll('svg');
        if (!charts.length) {
            return;
        }
        var node = tip();

        document.addEventListener('mousemove', function (event) {
            var target = event.target;
            var arc = target && target.closest ? target.closest('.arc') : null;
            if (!arc) {
                node.classList.remove('shown');
                return;
            }
            var text = textOf(arc);
            if (!text) {
                node.classList.remove('shown');
                return;
            }
            node.textContent = text;
            node.classList.add('shown');
            place(node, event);
        });

        // A wedge reached by keyboard says the same thing, anchored to the wedge rather than to a cursor
        // that is not there.
        document.addEventListener('focusin', function (event) {
            var arc = event.target && event.target.closest ? event.target.closest('.arc') : null;
            if (!arc) {
                node.classList.remove('shown');
                return;
            }
            var box = arc.getBoundingClientRect();
            node.textContent = textOf(arc);
            node.classList.add('shown');
            place(node, { clientX: box.left + box.width / 2, clientY: box.bottom });
        });
    });
}());
