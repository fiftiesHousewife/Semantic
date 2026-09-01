package io.github.fiftieshousewife.codesemantics.vocabulary.page;

import java.util.List;

/**
 * One branch of one publisher, and the concepts the repository wrote in it.
 *
 * @param branch      the concept the publisher states above them, empty where it states none
 * @param concepts    the concepts written there with what their publisher says about them, most-written first
 * @param occurrences how many times the repository wrote them in all
 */
public record WrittenBranch(String branch, List<WrittenConcept> concepts, int occurrences) {

    public WrittenBranch {
        concepts = List.copyOf(concepts);
    }
}
