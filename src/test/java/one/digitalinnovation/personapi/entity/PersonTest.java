package one.digitalinnovation.personapi.entity;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testCanEqual() {
        // Arrange, Act and Assert
        assertFalse((new Person()).canEqual("other"));
    }

    @Test
    public void testCanEqual2() {
        // Arrange
        Person person = new Person();
        person.setLastName("Doe");
        person.setBirthDate(LocalDate.ofEpochDay(1L));
        person.setCpf("Cpf");
        person.setId(123L);
        person.setPhones(new ArrayList<>());
        person.setFirstName("Jane");

        // Act and Assert
        assertTrue((new Person()).canEqual(person));
    }

    @Test
    public void testConstructor() {
        // Arrange, Act and Assert
        assertEquals("Person(id=null, firstName=null, lastName=null, cpf=null, birthDate=null, phones=[])",
                (new Person()).toString());
    }

    @Test
    public void testConstructor2() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);

        // Act
        Person actualPerson = new Person(123L, "Jane", "Doe", "Cpf", birthDate, new ArrayList<>());

        // Assert
        assertEquals("Doe", actualPerson.getLastName());
        assertEquals(123L, actualPerson.getId().longValue());
        assertEquals("Person(id=123, firstName=Jane, lastName=Doe, cpf=Cpf, birthDate=1970-01-02, phones=[])",
                actualPerson.toString());
        assertEquals("Jane", actualPerson.getFirstName());
        assertEquals("Cpf", actualPerson.getCpf());
    }

    @Test
    public void testEquals() {
        // Arrange, Act and Assert
        assertNotEquals((new Person()), "o");
    }

    @Test
    public void testEquals10() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Person person = new Person(123L, "Jane", "Doe", null, birthDate, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testEquals11() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(0L);
        Person person = new Person(123L, "Jane", "Doe", "Cpf", birthDate, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testEquals12() {
        // Arrange
        Person person = new Person(123L, "Jane", "Doe", "Cpf", null, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testEquals13() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Phone phone = new Phone();
        phone.setNumber("Jane");
        phone.setType(null);
        phone.setId(123L);
        ArrayList<Phone> phoneList = new ArrayList<>();
        phoneList.add(phone);
        Person person = new Person(123L, "Jane", "Doe", "Cpf", birthDate, phoneList);
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testEquals14() {
        // Arrange
        Person person = new Person();
        person.setLastName("Doe");
        person.setBirthDate(LocalDate.ofEpochDay(1L));
        person.setCpf("Cpf");
        person.setId(null);
        person.setPhones(new ArrayList<>());
        person.setFirstName(null);

        // Act and Assert
        assertNotEquals(person, (new Person()));
    }

    @Test
    public void testEquals2() {
        // Arrange
        Person person = new Person();
        person.setLastName("Doe");
        person.setBirthDate(LocalDate.ofEpochDay(1L));
        person.setCpf("Cpf");
        person.setId(123L);
        person.setPhones(new ArrayList<>());
        person.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person, (new Person()));
    }

    @Test
    public void testEquals3() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Person person = new Person(123L, "Jane", "Doe", "Cpf", birthDate, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertEquals(person1, person);
    }

    @Test
    public void testEquals4() {
        // Arrange
        Person person = new Person();
        person.setLastName("Doe");
        person.setBirthDate(LocalDate.ofEpochDay(1L));
        person.setCpf("Cpf");
        person.setId(null);
        person.setPhones(new ArrayList<>());
        person.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person, (new Person()));
    }

    @Test
    public void testEquals5() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Person person = new Person(0L, "Jane", "Doe", "Cpf", birthDate, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testEquals6() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Person person = new Person(123L, "Doe", "Doe", "Cpf", birthDate, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testEquals7() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Person person = new Person(123L, "Jane", "Jane", "Cpf", birthDate, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testEquals8() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Person person = new Person(123L, "Jane", null, "Cpf", birthDate, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testEquals9() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Person person = new Person(123L, "Jane", "Doe", "Jane", birthDate, new ArrayList<>());
        Person person1 = new Person();
        person1.setLastName("Doe");
        person1.setBirthDate(LocalDate.ofEpochDay(1L));
        person1.setCpf("Cpf");
        person1.setId(123L);
        person1.setPhones(new ArrayList<>());
        person1.setFirstName("Jane");

        // Act and Assert
        assertNotEquals(person1, person);
    }

    @Test
    public void testHashCode() {
        // Arrange, Act and Assert
        assertEquals(437864507, (new Person()).hashCode());
    }

    @Test
    public void testHashCode2() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);

        // Act and Assert
        assertEquals(1005232790, (new Person(123L, "Jane", "Doe", "Cpf", birthDate, new ArrayList<>())).hashCode());
    }

    @Test
    public void testSetBirthDate() {
        // Arrange
        LocalDate birthDate = LocalDate.ofEpochDay(1L);
        Person person = new Person();

        // Act
        person.setBirthDate(birthDate);

        // Assert
        assertEquals("Person(id=null, firstName=null, lastName=null, cpf=null, birthDate=1970-01-02, phones=[])",
                person.toString());
    }

    @Test
    public void testSetCpf() {
        // Arrange
        Person person = new Person();

        // Act
        person.setCpf("Cpf");

        // Assert
        assertEquals("Cpf", person.getCpf());
    }

    @Test
    public void testSetFirstName() {
        // Arrange
        Person person = new Person();

        // Act
        person.setFirstName("Jane");

        // Assert
        assertEquals("Jane", person.getFirstName());
    }

    @Test
    public void testSetId() {
        // Arrange
        Person person = new Person();

        // Act
        person.setId(123L);

        // Assert
        assertEquals(123L, person.getId().longValue());
    }

    @Test
    public void testSetLastName() {
        // Arrange
        Person person = new Person();

        // Act
        person.setLastName("Doe");

        // Assert
        assertEquals("Doe", person.getLastName());
    }

    @Test
    public void testSetPhones() {
        // Arrange
        Person person = new Person();

        // Act
        person.setPhones(new ArrayList<>());

        // Assert
        assertEquals("Person(id=null, firstName=null, lastName=null, cpf=null, birthDate=null, phones=[])",
                person.toString());
    }

    @Test
    public void testToString() {
        // Arrange, Act and Assert
        assertEquals("Person(id=null, firstName=null, lastName=null, cpf=null, birthDate=null, phones=[])",
                (new Person()).toString());
    }
}

