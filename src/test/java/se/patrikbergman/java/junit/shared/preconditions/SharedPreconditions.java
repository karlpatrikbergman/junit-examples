package se.patrikbergman.java.junit.shared.preconditions;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import se.patrikbergman.java.junit.shared.preconditions.rule.TestLogger;

public abstract class SharedPreconditions {

    @Rule
    public final TestLogger logger = new TestLogger();
    protected final  String sharedSetupValue = "Some shared setup value";

    @Before
    public void setup() {
        logger.getLogger().debug("Setting up shared preconditions");
    }

    @After
    public void teardown() {
        logger.getLogger().debug("Tearing down preconditions");
    }
}
