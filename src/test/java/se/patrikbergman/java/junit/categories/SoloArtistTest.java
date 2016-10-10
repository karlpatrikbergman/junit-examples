package se.patrikbergman.java.junit.categories;

import lombok.extern.slf4j.Slf4j;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.TestName;
import se.patrikbergman.java.junit.SoloArtist;

import static org.junit.Assert.assertTrue;

@Slf4j
public class SoloArtistTest {

    @Rule
    public TestName name = new TestName();
    private final int MINIMAL_ACCEPTED_ROCKFACTOR = 7;
    private final SoloArtist soloArtist = SoloArtist.builder()
            .isActive(false)
            .name("Johnny Thunders")
            .yearsActive(25)
            .rockfactor(9)
            .build();

    @Category(RockFactorTests.class)
    @Test
    public void rockFactorTest() {
        log.debug("Running {}", name.getMethodName());
        assertTrue(MINIMAL_ACCEPTED_ROCKFACTOR < soloArtist.getRockfactor());
    }

    @Category(SelloutFactorTest.class)
    @Test
    public void selloutFactorTest() {
        log.debug("Running {}", name.getMethodName());
        assertTrue(5 < (soloArtist.getYearsActive() - soloArtist.getRockfactor()*2));
    }
}
