package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentListTest {

    @Test
    public void testAddNewStudent() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("12345", "John Doe");
        assertEquals(1, studentList.getStudents().size());
        Student student = studentList.getStudents().get(0);
        assertEquals("12345", student.getId());
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testFindStudentById() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("12345", "John Doe");
        Student student = studentList.findStudentById("12345");
        assertNotNull(student);
        assertEquals("12345", student.getId());
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGiveScoreToId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("12345", "John Doe");
        studentList.giveScoreToId("12345", 90.0);
        Student student = studentList.findStudentById("12345");
        assertEquals(90.0, student.getScore(), 0.01);
    }

    @Test
    public void testViewGradeOfId() {
        StudentList studentList = new StudentList();
        studentList.addNewStudent("12345", "John Doe");
        studentList.giveScoreToId("12345", 90.0);
        String grade = studentList.viewGradeOfId("12345");
        assertNotNull(grade);
        assertEquals("A", grade);
    }
}