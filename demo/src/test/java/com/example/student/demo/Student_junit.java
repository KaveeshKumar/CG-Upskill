package com.example.student.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.student.demo.model.Student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class Student_junit {

    @Test
    public void testStudentDetails() {
        // Create a Student object
        Student student = new Student();
        student.setName("kaveesh");
        student.setAge(23);
        student.setSalary(15000);

        // Verify student details
        assertEquals("Kaveesh", student.getName());
        assertEquals(23, student.getAge());
        assertEquals(15000, student.getSalary(), 0.001); // Using delta for double comparison
    }

    @Test
    public void testDefaultStudentValues() {
        // Create a Student object with default values
        Student student = new Student();

        // Verify default values
        assertNull(student.getName());
        assertEquals(0, student.getAge());
        assertEquals(0.0, student.getSalary(), 0.001);
    }
    @Test   
    public void testGetAllStudents() {        
    Object studentService;
	List<Student> students = ((Object) studentService).getAllStudents();       
    assertNotNull(students);  
    assertTrue(students.size() > 0);     }
}



