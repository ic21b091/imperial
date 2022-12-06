package at.fhtw.imperial.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YardToMeterTests {
    // Given
    public final YardToMeter y2m = new YardToMeter();

    @Test
    public void testDefaultState() {
        assertEquals(y2m.getMeter(), 0);
    }

    @Test
    public void testConvertion() {
        // When
        y2m.convertValues(1);

        // Then
        assertEquals(y2m.getMeter(), 0.9144);

        // When
        y2m.convertValues(2);

        // Then
        assertEquals(y2m.getMeter(), 0.9144 * 2);
    }
}
