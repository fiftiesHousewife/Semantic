package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * One fork package of ethereum/execution-specs as concepts: each declared name is a row, its docstring's
 * first paragraph is the definition, the class holding a field or member is {@code broader}, and the
 * module is the file's own dotted path inside the fork. The concept is the specification's own reference
 * form — the dotted Python path its docstrings cite with {@code ref:} links.
 */
public final class ExecutionSpecConcepts {

    private static final String PACKAGE = "ethereum.forks.";

    private final PythonDeclarations declarations = new PythonDeclarations();

    /** The concepts of the fork's modules, keyed by path relative to the fork package, in path order. */
    public List<SkosConcept> in(final Map<String, String> modulesByPath, final String fork) {
        return modulesByPath.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .flatMap(module -> conceptsOf(module.getKey(), module.getValue(), fork))
                .toList();
    }

    private Stream<SkosConcept> conceptsOf(final String path, final String text, final String fork) {
        final String module = moduleOf(path);
        return declarations.in(text.lines().toList()).stream()
                .map(declared -> new SkosConcept(conceptOf(fork, module, declared), declared.name(), "",
                        declared.owner(), declared.kind(), module, cleaned(declared.docstring()), ""));
    }

    /** {@code vm/gas.py} is the module {@code vm.gas}; a package's own {@code __init__.py} is the package. */
    private static String moduleOf(final String path) {
        final String dotted = path.substring(0, path.length() - ".py".length()).replace('/', '.');
        if (dotted.equals("__init__")) {
            return "";
        }
        return dotted.endsWith(".__init__")
                ? dotted.substring(0, dotted.length() - ".__init__".length())
                : dotted;
    }

    private static String conceptOf(final String fork, final String module,
                                    final PythonDeclarations.Declaration declared) {
        final StringBuilder concept = new StringBuilder(PACKAGE).append(fork);
        if (!module.isEmpty()) {
            concept.append('.').append(module);
        }
        if (!declared.owner().isEmpty()) {
            concept.append('.').append(declared.owner());
        }
        return concept.append('.').append(declared.name()).toString();
    }

    /** The TSV cannot carry a tab, and a docstring quoting one is not stating vocabulary with it. */
    private static String cleaned(final String docstring) {
        return docstring.replace('\t', ' ');
    }
}
