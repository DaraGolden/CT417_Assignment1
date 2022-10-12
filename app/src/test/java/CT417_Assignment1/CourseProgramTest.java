/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CT417_Assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dara
 */
public class CourseProgramTest {
    
    private CourseProgram exampleCourse;
    public ArrayList<CourseProgram> courseArray;
    private Lecturer lecturer;
    
    public CourseProgramTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        this.exampleCourse = new CourseProgram("CT");
        
        this.courseArray = new ArrayList<>();
        courseArray.add(this.exampleCourse);
             
        this.lecturer = null;
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class CourseProgram.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "CT";
        String result = exampleCourse.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class CourseProgram.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String age = "CT";
        exampleCourse.setName(age);

        String expResult = age;
        String result = exampleCourse.getName();
        assertEquals(expResult,result);
    }

    /**
     * Test of addModules method, of class CourseProgram.
     */
    @Test
    public void testAddModules() {
        System.out.println("addModules");
        Module module = new Module("Software Engineering 3","CT417", this.lecturer, this.courseArray);
        
        ArrayList<Module> expResult = new ArrayList<>();
        expResult.add(module);
        
        this.exampleCourse.addModules(expResult);
        ArrayList<Module> result = this.exampleCourse.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudents method, of class CourseProgram.
     */
    @Test
    public void testAddStudents() {
        System.out.println("setStudents");
        Module module = new Module("Software Engineering 3","CT417", this.lecturer, this.courseArray);
        ArrayList<Module> moduleArray = new ArrayList<>();
        moduleArray.add(module);
        
        Student student = new Student("Dara Golden", 22, "20/10/2000", this.exampleCourse, moduleArray);
        ArrayList<Student> studentArray = new ArrayList<>();
        studentArray.add(student);
        
        this.exampleCourse.addStudents(studentArray);
        
        Student expResult = student;
        Student result = exampleCourse.getStudents().get(0);
        assertEquals(expResult, result);
    }

    /**
     * Test of setStartDate method, of class CourseProgram.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        DateTime date = new DateTime();
        this.exampleCourse.setStartDate(date);
        
        DateTime result = this.exampleCourse.getStartDate();
        assertEquals(date, result);
    }

    /**
     * Test of setEndDate method, of class CourseProgram.
     */
    @Test
    public void testSetEndDate() {
        System.out.println("setEndDate");
        DateTime date = new DateTime();;
        this.exampleCourse.setEndDate(date);
        
        DateTime result = this.exampleCourse.getEndDate();
        assertEquals(date, result);
    }
    
}
