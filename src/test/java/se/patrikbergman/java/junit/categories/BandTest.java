package se.patrikbergman.java.junit.categories;

import lombok.extern.slf4j.Slf4j;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;
import se.patrikbergman.java.junit.Band;

import static org.junit.Assert.assertTrue;

@Slf4j
public class BandTest {
    @Rule
    public TestName name = new TestName();
    private final int MINIMAL_ACCEPTED_ROCKFACTOR = 8;
    private final Band band = Band.builder()
            .isActive(true)
            .name("Judas Priest")
            .yearsActive(47)
            .rockfactor(9)
            .build();

    @Category(RockFactorTests.class)
    @Test
    public void rockFactorTest() {
        log.debug("Running {}", name.getMethodName());
        assertTrue(MINIMAL_ACCEPTED_ROCKFACTOR < band.getRockfactor());
    }

    @Category(SelloutFactorTest.class)
    @Test
    public void selloutFactorTest() {
        log.debug("Running {}", name.getMethodName());
        assertTrue(5 < (band.getYearsActive() - band.getRockfactor()*2));
    }
}
