package one.digitalinnovation.personapi.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PhoneTypeTest {

    @Test
    public void testValueOf() {
        // Arrange, Act and Assert
        assertEquals(PhoneType.COMMERCIAL, PhoneType.valueOf("COMMERCIAL"));
    }

    @Test
    public void testValues() {
        // Arrange, Act and Assert
        assertEquals(3, PhoneType.values().length);
    }
}

