package io.github.fiftieshousewife.codesemantics.lexicon.extraction;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

import io.github.fiftieshousewife.codesemantics.lexicon.SkosConcept;

/**
 * The registrations of one IANA JOSE registry, read from the CSV the registry itself publishes. The
 * registered value in the first column — {@code HS256}, {@code kty}, {@code sig} — is the string a JOSE
 * implementation writes, and is carried byte for byte as {@code prefLabel}; the description in the second
 * column is the publisher's English name for what it does, and goes to {@code altLabel}. IANA states no
 * per-row permalink and registers one value more than once — {@code alg} under JWS and again under JWE —
 * so the concept scopes the value by its registry, and repeated registrations of one value merge into one
 * row whose statements join.
 *
 * <p>The usage locations, implementation requirements and change controllers are not carried: they state
 * conformance, not what a row names.
 */
public final class JoseConcepts {

    private static final String REFERENCE = "Reference";

    /** One field starts the row or follows a comma: quoted with doubled quotes inside, or comma-free. */
    private static final Pattern FIELD = Pattern.compile("(?:^|,)(\"(?:[^\"]|\"\")*\"|[^,]*)");

    private final JoinedStatements statements = new JoinedStatements();

    public List<SkosConcept> in(final String registry, final String kind, final String csv) {
        final List<List<String>> rows = csv.lines().map(JoseConcepts::fields).toList();
        final int reference = referenceColumnOf(registry, rows.getFirst());
        final Map<String, List<List<String>>> byValue = new LinkedHashMap<>();
        rows.stream()
                .skip(1)
                .forEach(row -> byValue.computeIfAbsent(row.getFirst(), value -> new ArrayList<>())
                        .add(row));
        return byValue.entrySet().stream()
                .map(registered -> concept(registry, kind, registered.getKey(), registered.getValue(),
                        reference))
                .toList();
    }

    private SkosConcept concept(final String registry, final String kind, final String value,
                                final List<List<String>> rows, final int reference) {
        return new SkosConcept(registry + "/" + value, value,
                statements.of(rows.stream().map(row -> row.get(1)).toList()),
                registry, kind, registry, "",
                statements.of(rows.stream().map(row -> row.get(reference)).toList()));
    }

    private static int referenceColumnOf(final String registry, final List<String> header) {
        final int reference = header.indexOf(REFERENCE);
        if (reference < 0) {
            throw new IllegalArgumentException(String.format(Locale.ROOT,
                    "The %s registry's CSV states no %s column: %s",
                    registry, REFERENCE, header));
        }
        return reference;
    }

    private static List<String> fields(final String row) {
        return FIELD.matcher(row).results()
                .map(field -> unquoted(field.group(1)))
                .toList();
    }

    private static String unquoted(final String field) {
        return field.startsWith("\"") && field.endsWith("\"") && field.length() >= 2
                ? field.substring(1, field.length() - 1).replace("\"\"", "\"")
                : field;
    }
}
