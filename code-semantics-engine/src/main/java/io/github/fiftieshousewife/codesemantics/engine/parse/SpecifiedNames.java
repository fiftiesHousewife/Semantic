package io.github.fiftieshousewife.codesemantics.engine.parse;

import java.util.Map;
import java.util.Set;

/**
 * The declared names a published specification requires as spelled, so writing one is compliance rather
 * than choice: {@code serialVersionUID} is the Java Object Serialization Specification's stream unique
 * identifier field, {@code main} is the method the JLS requires the launcher to find (§12.1.4), and
 * {@code setUp} and {@code tearDown} are the lifecycle methods JUnit's own {@code TestCase} declares,
 * whose spellings outlived the class. Each entry cites the specification that states it, which is what
 * keeps this from being a stop list.
 */
public final class SpecifiedNames {

    private static final Map<NameForm, Set<String>> STATED = Map.of(
            NameForm.FIELD, Set.of("serialVersionUID"),
            NameForm.METHOD, Set.of("main", "setUp", "tearDown"));

    /** Whether a specification states this exact spelling for a declaration of this form. */
    public boolean claims(final String name, final NameForm form) {
        return STATED.getOrDefault(form, Set.of()).contains(name);
    }
}
