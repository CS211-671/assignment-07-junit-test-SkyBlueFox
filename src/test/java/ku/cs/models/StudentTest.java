package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testChangeName() {
        Student student = new Student("12345", "John Doe");
        student.changeName("Jane Doe");
        assertEquals("Jane Doe", student.getName());
    }

    @Test
    public void testAddScore() {
        Student student = new Student("12345", "John Doe");
        student.addScore(10);
        assertEquals(10, student.getScore(), 0.01);
    }

    @Test
    public void testGrade() {
        Student student = new Student("12345", "John Doe", 85);
        assertEquals("A", student.grade());
    }

    @Test
    public void testIsId() {
        Student student = new Student("12345", "John Doe");
        assertTrue(student.isId("12345"));
        assertFalse(student.isId("67890"));
    }

}