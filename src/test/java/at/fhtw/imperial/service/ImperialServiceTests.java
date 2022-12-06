package at.fhtw.imperial.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ImperialServiceTests {
    // Given
    public final ImperialService iService = new ImperialService();

    @Test
    public void testDefaultState() {
        assertEquals(iService.getCentimeter(), 0);
        assertEquals(iService.getMeter(), 0);
    }

    @Test
    public void testConvertion() {
        // When
        iService.calculateCentimeter(1);
        iService.calculateMeter(1);

        // Then
        assertEquals(iService.getCentimeter(), 2.54);
        assertEquals(iService.getMeter(), 0.9144);

        // When
        iService.calculateCentimeter(2);
        iService.calculateMeter(2);

        // Then
        assertEquals(iService.getCentimeter(), 2.54 * 2);
        assertEquals(iService.getMeter(), 0.9144 * 2);
    }
}
