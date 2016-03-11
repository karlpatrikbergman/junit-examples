package se.patrikbergman.java.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.slf4j.Logger;
import se.patrikbergman.java.junit.rule.TestLogger;

public abstract class SharedPreconditions {

    @Rule
    public final TestLogger logger = new TestLogger();
    protected Logger log;
    protected final  String sharedSetupValue = "Some shared setup value";

    @Before
    public void setup() {
        log = logger.getLogger();
        log.debug("Setting up shared preconditions");
    }

    @After
    public void teardown() {
        log.debug("Tearing down preconditions");
    }
}
