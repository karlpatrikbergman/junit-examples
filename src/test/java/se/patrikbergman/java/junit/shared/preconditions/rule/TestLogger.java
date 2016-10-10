package se.patrikbergman.java.junit.shared.preconditions.rule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger implements TestRule {

    Logger logger;

    public Logger getLogger() {
        return logger;
    }

    @Override
    public Statement apply(final Statement base, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                logger = LoggerFactory.getLogger(description.getTestClass().getName() + '.' + description.getDisplayName());
                try {
                    base.evaluate();
                } finally {
                    logger = null;
                }
            }
        };
    }
}
