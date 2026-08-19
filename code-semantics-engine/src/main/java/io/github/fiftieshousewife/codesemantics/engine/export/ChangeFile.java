package io.github.fiftieshousewife.codesemantics.engine.export;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Writes {@link ReadingChanges} as JSON, and reads it back.
 *
 * <p>What moved is itself a reading, so it is written in the form every other reading is written in. A
 * consumer deciding whether a change did what it was meant to reads this file; nothing has to be looked at
 * by eye for the question to be answered.
 *
 * <p>Pretty-printed, because the file is committed and a diff of one long line tells a reviewer nothing.
 */
public final class ChangeFile {

    /** What a run writes when it has a previous reading of the same shape to compare against. */
    public static final String NAME = "changes.json";

    private final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public void wrote(final Path file, final ReadingChanges changes) throws IOException {
        Files.createDirectories(file.toAbsolutePath().getParent());
        Files.writeString(file, mapper.writeValueAsString(changes));
    }

    /** The same object back, which is what says the shape survives a round trip. */
    public ReadingChanges in(final Path file) throws IOException {
        return mapper.readValue(Files.readString(file), ReadingChanges.class);
    }
}
