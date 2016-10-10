package se.patrikbergman.java.junit.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import se.patrikbergman.java.junit.Band;

import static org.junit.Assert.assertTrue;

public class CategoryTest {

    private final int MINIMAL_ACCEPTED_ROCKFACTOR = 8;
    private final Band bandUnderTest = Band.builder()
            .isActive(true)
            .name("Judas Priest")
            .yearsActive(47)
            .Rockfactor(9)
            .build();

    @Category(RockFactorTests.class)
    @Test
    public void testRockFactor() {
        assertTrue(MINIMAL_ACCEPTED_ROCKFACTOR < bandUnderTest.getRockfactor());
    }
}
