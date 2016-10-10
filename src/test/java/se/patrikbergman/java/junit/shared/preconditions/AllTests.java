package se.patrikbergman.java.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * After experimenting it seems that this enclosing class is not suitable
 * for setting up common pre-conditions. It would maybe work with static
 * initialing block
 */

//@Slf4j
@RunWith(Suite.class)
@Suite.SuiteClasses({ FirstBandTest.class, SecondBandTest.class })
public class AllTests {
    static final String someSharedTestPrecondition = "someSharedTestPrecondition";

    //Execution order seems non consistent
//    @BeforeClass
//    public static void setupBeforeClass() {
//        log.debug("setupBeforeClass()");
//    }

    //Is not executed
//    @Before
//    public void setup() {
//        System.out.println("setup()");
//    }

    //Is not executed
//    @After
//    public void teardown() {
//        System.out.println("teardown()");
//    }

    //Execution order seems non consistent
//    @AfterClass
//    public static void teardownAfterClass() {
//        log.debug("teardownAfterClass()");
//    }
}
