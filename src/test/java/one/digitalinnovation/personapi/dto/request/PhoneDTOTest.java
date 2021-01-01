package one.digitalinnovation.personapi.dto.request;

import one.digitalinnovation.personapi.enums.PhoneType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneDTOTest {

    @Test
    public void testCanEqual() {
        // Arrange, Act and Assert
        assertFalse((new PhoneDTO()).canEqual("other"));
    }

    @Test
    public void testCanEqual2() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO();

        // Act and Assert
        assertTrue(phoneDTO.canEqual(new PhoneDTO()));
    }

    @Test
    public void testEquals() {
        // Arrange, Act and Assert
        assertNotEquals((new PhoneDTO()), "o");
    }

    @Test
    public void testEquals2() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO();

        // Act and Assert
        assertEquals(new PhoneDTO(), phoneDTO);
    }

    @Test
    public void testEquals3() {
        // Arrange
        PhoneDTO o = new PhoneDTO(123L, PhoneType.HOME, "Number");

        // Act and Assert
        assertNotEquals(o, (new PhoneDTO()));
    }

    @Test
    public void testEquals4() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO(123L, PhoneType.HOME, "Number");

        // Act and Assert
        assertNotEquals(new PhoneDTO(), phoneDTO);
    }

    @Test
    public void testEquals5() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO(123L, PhoneType.HOME, "Number");

        // Act and Assert
        assertEquals(new PhoneDTO(123L, PhoneType.HOME, "Number"), phoneDTO);
    }

    @Test
    public void testEquals6() {
        // Arrange
        PhoneDTO o = new PhoneDTO(null, PhoneType.HOME, "Number");

        // Act and Assert
        assertNotEquals(o, (new PhoneDTO()));
    }

    @Test
    public void testEquals7() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO(null, PhoneType.HOME, "Number");

        // Act and Assert
        assertNotEquals(new PhoneDTO(), phoneDTO);
    }

    @Test
    public void testEquals8() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO(123L, PhoneType.HOME, null);

        // Act and Assert
        assertNotEquals(new PhoneDTO(123L, PhoneType.HOME, "Number"), phoneDTO);
    }

    @Test
    public void testEquals9() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO(123L, PhoneType.HOME, "one.digitalinnovation.personapi.dto.request.PhoneDTO");

        // Act and Assert
        assertNotEquals(new PhoneDTO(123L, PhoneType.HOME, "Number"), phoneDTO);
    }

    @Test
    public void testHashCode() {
        // Arrange, Act and Assert
        assertEquals(357642, (new PhoneDTO()).hashCode());
    }

    @Test
    public void testSetId() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO();

        // Act
        phoneDTO.setId(123L);

        // Assert
        assertEquals(123L, phoneDTO.getId().longValue());
    }

    @Test
    public void testSetNumber() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO();

        // Act
        phoneDTO.setNumber("Number");

        // Assert
        assertEquals("Number", phoneDTO.getNumber());
    }

    @Test
    public void testSetType() {
        // Arrange
        PhoneDTO phoneDTO = new PhoneDTO();

        // Act
        phoneDTO.setType(PhoneType.HOME);

        // Assert
        assertEquals(PhoneType.HOME, phoneDTO.getType());
    }

    @Test
    public void testToString() {
        // Arrange, Act and Assert
        assertEquals("PhoneDTO(id=null, type=null, number=null)", (new PhoneDTO()).toString());
    }
}

