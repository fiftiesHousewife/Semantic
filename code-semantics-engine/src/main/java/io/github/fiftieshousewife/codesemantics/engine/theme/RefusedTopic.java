package io.github.fiftieshousewife.codesemantics.engine.theme;

/** A topic a phrase's words voted for, and the rule that kept it out of the phrase's reading. */
public record RefusedTopic(String topic, RefusalRule rule) {
}
