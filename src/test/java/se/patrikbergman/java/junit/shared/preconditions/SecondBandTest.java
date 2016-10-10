package se.patrikbergman.java.junit;

import lombok.extern.slf4j.Slf4j;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

@Slf4j
public class SecondBandTest extends SharedPreconditions {

    @Rule
    public TestName name = new TestName();


    @Test
    public void test() {
        log.debug("Running {}", name.getMethodName());
        log.debug("Shared precondition: {}", AllTests.someSharedTestPrecondition);
        log.debug("Some shared precondition: {}", sharedSetupValue);
    }
}
