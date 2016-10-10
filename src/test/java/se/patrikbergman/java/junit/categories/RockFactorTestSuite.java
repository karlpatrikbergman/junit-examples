package se.patrikbergman.java.junit.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(RockFactorTests.class)
@Suite.SuiteClasses({BandTest.class, SoloArtistTest.class})
public class RockFactorTestSuite {
}
