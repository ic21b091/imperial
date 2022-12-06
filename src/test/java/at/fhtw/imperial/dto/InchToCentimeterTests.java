package at.fhtw.imperial.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InchToCentimeterTests {
    // Given
    public final InchToCentimeter i2c = new InchToCentimeter();

    @Test
    public void testDefaultState() {
        assertEquals(i2c.getCentimeter(), 0);
    }

    @Test
    public void testConvertion() {
        // When
        i2c.convertValues(1);

        // Then
        assertEquals(i2c.getCentimeter(), 2.54);

        // When
        i2c.convertValues(2);

        // Then
        assertEquals(i2c.getCentimeter(), 2.54 * 2);
    }
}
