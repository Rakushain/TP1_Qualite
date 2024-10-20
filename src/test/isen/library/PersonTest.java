package test.isen.library;

import main.isen.library.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void Person() {
//        fail("Not yet implemented");
    }

    @Test
    void setYears() {
//        fail("Not yet implemented");
    }

    @Test
    void setName() {
//        fail("Not yet implemented");
    }

    // 3) annotation fail qui devraient être mises en oeuvre, effectué sous intelliJ

    @Test
    void testPerson() {
        Person person = new Person();
        assertEquals("unknown", person.getName());
        assertEquals(22, person.getYears());
        person.setName("Marc");
        person.setYears(24);
        assertEquals("Marc", person.getName());
        assertEquals(24, person.getYears());
    }
}