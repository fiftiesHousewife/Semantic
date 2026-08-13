(function () {
  const data = JSON.parse(document.getElementById('themes').textContent);
  const svg = document.getElementById('arcs');
  const panel = document.getElementById('evidence');
  const rows = Array.from(svg.querySelectorAll('.row'));
  const arcs = Array.from(svg.querySelectorAll('.arc'));
  const fmt = (n) => n.toLocaleString('en-US');

  function shared(topic) {
    return data.edges
      .filter((e) => e.from === topic || e.to === topic)
      .map((e) => ({ other: e.from === topic ? e.to : e.from, occurrences: e.occurrences, words: e.words }))
      .sort((a, b) => b.occurrences - a.occurrences)
      .slice(0, 6);
  }

  // A site is a link only where the reading rendered one this page can open; otherwise it is named.
  function site(s) {
    return s.url
      ? `<a class="site" href="${s.url}">${s.where}</a>`
      : `<span class="site dead">${s.where}</span>`;
  }

  // The phrase is what was read, so it is what is quoted — with the witnessing word marked inside it.
  function quoted(phrase, word) {
    return phrase.split(' ')
      .map((w) => (w === word ? `<b>${w}</b>` : w))
      .join(' ');
  }

  function show(topic, dim) {
    const node = data.nodes[topic];
    if (!node) { return; }
    const witnesses = node.carriedBy.map((w) =>
      `<li><span class="w">${w.word}</span><span class="c">${fmt(w.occurrences)} · ` +
      `${w.mass.toFixed(1)} mass</span>` +
      `<span class="src">${w.sources.join(' · ')}</span>` +
      `<ul class="quotes">${w.quotations.map((q) =>
        `<li><span class="phrase">${quoted(q.phrase, w.word)}</span>${site(q.site)}</li>`)
        .join('')}</ul></li>`).join('');
    const links = shared(topic).map((s) =>
      `<li><span>${s.other} <span class="n">${s.words.slice(0, 3).join(', ')}</span></span>` +
      `<span class="n">${fmt(s.occurrences)}</span></li>`).join('');
    panel.innerHTML =
      `<p class="kicker">Why this theme was read</p><h3>${topic}</h3>` +
      `<p class="note" style="font-size:13.5px;margin:8px 0 0">${fmt(node.wordsBehind)} distinct words ` +
      `carried it across ${fmt(node.files)} files; it leads ${fmt(node.leads)} of them, ` +
      `${fmt(node.linesLed)} lines.</p>` +
      `<ul class="witness-list">${witnesses}</ul>` +
      `<div class="shared"><p class="kicker" style="margin:0">Words shared with</p><ul>${links}</ul></div>`;
    rows.forEach((row) => row.classList.toggle('on', row.dataset.topic === topic));
    arcs.forEach((arc) => arc.classList.toggle('lit',
      arc.dataset.from === topic || arc.dataset.to === topic));
    svg.classList.toggle('selected', dim !== false);
  }

  rows.forEach((row) => {
    row.addEventListener('click', () => show(row.dataset.topic, true));
    row.addEventListener('keydown', (event) => {
      if (event.key === 'Enter' || event.key === ' ') { event.preventDefault(); show(row.dataset.topic, true); }
    });
  });
  show(rows[0].dataset.topic, false);
}());
