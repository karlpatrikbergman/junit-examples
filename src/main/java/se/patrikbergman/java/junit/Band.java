package se.patrikbergman.java.junit;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
class Band {
    private String name;
    private int yearsActive;
    private boolean isActive;
}
