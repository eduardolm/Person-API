package one.digitalinnovation.personapi.entity;

import one.digitalinnovation.personapi.enums.PhoneType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneTest {

    @Test
    public void testCanEqual() {
        // Arrange, Act and Assert
        assertFalse((new Phone()).canEqual("other"));
    }

    @Test
    public void testCanEqual2() {
        // Arrange
        Phone phone = new Phone();
        phone.setNumber("Number");
        phone.setType(PhoneType.HOME);
        phone.setId(123L);

        // Act and Assert
        assertTrue((new Phone()).canEqual(phone));
    }

    @Test
    public void testEquals() {
        // Arrange, Act and Assert
        assertNotEquals((new Phone()), "o");
    }

    @Test
    public void testEquals10() {
        // Arrange
        Phone phone = new Phone(123L, PhoneType.HOME, null);
        Phone phone1 = new Phone();
        phone1.setNumber(null);
        phone1.setType(PhoneType.HOME);
        phone1.setId(123L);

        // Act and Assert
        assertEquals(phone1, phone);
    }

    @Test
    public void testEquals2() {
        // Arrange
        Phone phone = new Phone();
        phone.setNumber("Number");
        phone.setType(PhoneType.HOME);
        phone.setId(123L);

        // Act and Assert
        assertNotEquals(phone, (new Phone()));
    }

    @Test
    public void testEquals3() {
        // Arrange
        Phone phone = new Phone(123L, PhoneType.HOME, "Number");
        Phone phone1 = new Phone();
        phone1.setNumber("Number");
        phone1.setType(PhoneType.HOME);
        phone1.setId(123L);

        // Act and Assert
        assertEquals(phone1, phone);
    }

    @Test
    public void testEquals4() {
        // Arrange
        Phone phone = new Phone();
        phone.setNumber("Number");
        phone.setType(PhoneType.HOME);
        phone.setId(null);

        // Act and Assert
        assertNotEquals(phone, (new Phone()));
    }

    @Test
    public void testEquals5() {
        // Arrange
        Phone phone = new Phone(0L, PhoneType.HOME, "Number");
        Phone phone1 = new Phone();
        phone1.setNumber("Number");
        phone1.setType(PhoneType.HOME);
        phone1.setId(123L);

        // Act and Assert
        assertNotEquals(phone1, phone);
    }

    @Test
    public void testEquals6() {
        // Arrange
        Phone phone = new Phone(123L, PhoneType.MOBILE, "Number");
        Phone phone1 = new Phone();
        phone1.setNumber("Number");
        phone1.setType(PhoneType.HOME);
        phone1.setId(123L);

        // Act and Assert
        assertNotEquals(phone1, phone);
    }

    @Test
    public void testEquals7() {
        // Arrange
        Phone phone = new Phone(123L, PhoneType.HOME, null);
        Phone phone1 = new Phone();
        phone1.setNumber("Number");
        phone1.setType(PhoneType.HOME);
        phone1.setId(123L);

        // Act and Assert
        assertNotEquals(phone1, phone);
    }

    @Test
    public void testEquals8() {
        // Arrange
        Phone phone = new Phone(123L, PhoneType.HOME, "one.digitalinnovation.personapi.entity.Phone");
        Phone phone1 = new Phone();
        phone1.setNumber("Number");
        phone1.setType(PhoneType.HOME);
        phone1.setId(123L);

        // Act and Assert
        assertNotEquals(phone1, phone);
    }

    @Test
    public void testEquals9() {
        // Arrange
        Phone phone = new Phone();
        phone.setNumber("Number");
        phone.setType(null);
        phone.setId(null);

        // Act and Assert
        assertNotEquals(phone, (new Phone()));
    }

    @Test
    public void testHashCode() {
        // Arrange, Act and Assert
        assertEquals(357642, (new Phone()).hashCode());
    }

    @Test
    public void testSetId() {
        // Arrange
        Phone phone = new Phone();

        // Act
        phone.setId(123L);

        // Assert
        assertEquals(123L, phone.getId().longValue());
    }

    @Test
    public void testSetNumber() {
        // Arrange
        Phone phone = new Phone();

        // Act
        phone.setNumber("Number");

        // Assert
        assertEquals("Number", phone.getNumber());
    }

    @Test
    public void testSetType() {
        // Arrange
        Phone phone = new Phone();

        // Act
        phone.setType(PhoneType.HOME);

        // Assert
        assertEquals(PhoneType.HOME, phone.getType());
    }

    @Test
    public void testToString() {
        // Arrange, Act and Assert
        assertEquals("Phone(id=null, type=null, number=null)", (new Phone()).toString());
    }
}

