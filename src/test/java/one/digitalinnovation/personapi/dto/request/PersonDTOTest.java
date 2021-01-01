package one.digitalinnovation.personapi.dto.request;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonDTOTest {

    @Test
    public void testCanEqual() {
        // Arrange, Act and Assert
        assertFalse((new PersonDTO()).canEqual("other"));
    }

    @Test
    public void testCanEqual2() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();

        // Act and Assert
        assertTrue(personDTO.canEqual(new PersonDTO()));
    }

    @Test
    public void testEquals() {
        // Arrange, Act and Assert
        assertNotEquals((new PersonDTO()), "o");
    }

    @Test
    public void testEquals10() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();
        personDTO.setLastName("Doe");

        // Act and Assert
        assertNotEquals(personDTO, (new PersonDTO()));
    }

    @Test
    public void testEquals11() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();
        personDTO.setBirthDate("2020-03-01");

        // Act and Assert
        assertNotEquals(personDTO, (new PersonDTO()));
    }

    @Test
    public void testEquals12() {
        // Arrange
        PersonDTO personDTO = new PersonDTO(123L, "Jane", "Doe", "Jane", "2020-03-01", new ArrayList<>());

        // Act and Assert
        assertNotEquals(new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>()), personDTO);
    }

    @Test
    public void testEquals13() {
        // Arrange
        PersonDTO personDTO = new PersonDTO(123L, "Jane", "Doe", null, "2020-03-01", new ArrayList<>());

        // Act and Assert
        assertNotEquals(new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>()), personDTO);
    }

    @Test
    public void testEquals14() {
        // Arrange
        ArrayList<PhoneDTO> phoneDTOList = new ArrayList<>();
        phoneDTOList.add(null);
        PersonDTO personDTO = new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", phoneDTOList);

        // Act and Assert
        assertNotEquals(new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>()), personDTO);
    }

    @Test
    public void testEquals2() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();

        // Act and Assert
        assertEquals(new PersonDTO(), personDTO);
    }

    @Test
    public void testEquals3() {
        // Arrange
        PersonDTO o = new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>());

        // Act and Assert
        assertNotEquals(o, (new PersonDTO()));
    }

    @Test
    public void testEquals4() {
        // Arrange
        PersonDTO personDTO = new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>());

        // Act and Assert
        assertNotEquals(new PersonDTO(), personDTO);
    }

    @Test
    public void testEquals5() {
        // Arrange
        PersonDTO personDTO = new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>());

        // Act and Assert
        assertEquals(new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>()), personDTO);
    }

    @Test
    public void testEquals6() {
        // Arrange
        PersonDTO o = new PersonDTO(null, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>());

        // Act and Assert
        assertNotEquals(o, (new PersonDTO()));
    }

    @Test
    public void testEquals7() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();
        personDTO.setLastName("Doe");

        // Act and Assert
        assertNotEquals(new PersonDTO(), personDTO);
    }

    @Test
    public void testEquals8() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();
        personDTO.setBirthDate("2020-03-01");

        // Act and Assert
        assertNotEquals(new PersonDTO(), personDTO);
    }

    @Test
    public void testEquals9() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();
        personDTO.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(new PersonDTO(), personDTO);
    }

    @Test
    public void testHashCode() {
        // Arrange, Act and Assert
        assertEquals(437864549, (new PersonDTO()).hashCode());
        assertEquals(-54183938,
                (new PersonDTO(123L, "Jane", "Doe", "Cpf", "2020-03-01", new ArrayList<>())).hashCode());
    }

    @Test
    public void testSetBirthDate() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();

        // Act
        personDTO.setBirthDate("2020-03-01");

        // Assert
        assertEquals("2020-03-01", personDTO.getBirthDate());
    }

    @Test
    public void testSetCpf() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();

        // Act
        personDTO.setCpf("Cpf");

        // Assert
        assertEquals("Cpf", personDTO.getCpf());
    }

    @Test
    public void testSetFirstName() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();

        // Act
        personDTO.setFirstName("Jane");

        // Assert
        assertEquals("Jane", personDTO.getFirstName());
    }

    @Test
    public void testSetId() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();

        // Act
        personDTO.setId(123L);

        // Assert
        assertEquals(123L, personDTO.getId().longValue());
    }

    @Test
    public void testSetLastName() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();

        // Act
        personDTO.setLastName("Doe");

        // Assert
        assertEquals("Doe", personDTO.getLastName());
    }

    @Test
    public void testSetPhones() {
        // Arrange
        PersonDTO personDTO = new PersonDTO();

        // Act
        personDTO.setPhones(new ArrayList<>());

        // Assert
        assertEquals("PersonDTO(id=null, firstName=null, lastName=null, cpf=null, birthDate=null, phones=[])",
                personDTO.toString());
    }

    @Test
    public void testToString() {
        // Arrange, Act and Assert
        assertEquals("PersonDTO(id=null, firstName=null, lastName=null, cpf=null, birthDate=null, phones=null)",
                (new PersonDTO()).toString());
    }
}

