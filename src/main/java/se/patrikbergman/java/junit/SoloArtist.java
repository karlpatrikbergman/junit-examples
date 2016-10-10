package se.patrikbergman.java.junit;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SoloArtist {
    private String name;
    private int yearsActive;
    private boolean isActive;
    private int rockfactor;
}
