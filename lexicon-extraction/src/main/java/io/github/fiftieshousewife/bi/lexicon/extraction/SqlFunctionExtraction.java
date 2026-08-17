package io.github.fiftieshousewife.bi.lexicon.extraction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads the embedded engine's own function catalogue into the bundled TSV. The engine is asked in
 * memory with no database attached, so the extraction states what the shipped version answers to and
 * nothing about any corpus. Scalar and aggregate functions are taken; table, pragma and macro entries
 * name statements rather than computations and cite nothing a column token could mean.
 */
public final class SqlFunctionExtraction {

    private static final String IN_MEMORY = "jdbc:duckdb:";

    private static final String CATALOGUE = """
            SELECT DISTINCT function_name, coalesce(description, '')
            FROM duckdb_functions()
            WHERE function_type IN ('scalar', 'aggregate')
            ORDER BY function_name""";

    private static final String VERSION = "SELECT version()";

    private final SqlFunctionTsv tsv = new SqlFunctionTsv();

    public static void main(final String[] args) throws IOException, SQLException {
        if (args.length < 1 || args[0].isBlank()) {
            throw new IllegalArgumentException("Usage: SqlFunctionExtraction <sql functions tsv>");
        }
        new SqlFunctionExtraction().extract(Path.of(args[0]));
    }

    public void extract(final Path output) throws IOException, SQLException {
        try (Connection connection = DriverManager.getConnection(IN_MEMORY)) {
            final String text = tsv.render(catalogue(connection), version(connection));
            Files.createDirectories(output.toAbsolutePath().getParent());
            Files.writeString(output, text);
        }
    }

    private static List<SqlFunction> catalogue(final Connection connection) throws SQLException {
        final List<SqlFunction> functions = new ArrayList<>();
        try (Statement statement = connection.createStatement();
             ResultSet rows = statement.executeQuery(CATALOGUE)) {
            while (rows.next()) {
                functions.add(new SqlFunction(rows.getString(1), oneLine(rows.getString(2))));
            }
        }
        return functions;
    }

    private static String version(final Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement();
             ResultSet rows = statement.executeQuery(VERSION)) {
            rows.next();
            return rows.getString(1);
        }
    }

    /** A description is one TSV field, and the catalogue writes a few of them across several lines. */
    private static String oneLine(final String description) {
        return description.replace('\n', ' ').replace('\t', ' ').trim();
    }
}
