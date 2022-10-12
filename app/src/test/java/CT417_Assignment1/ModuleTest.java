/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package CT417_Assignment1;

import java.util.ArrayList;
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
public class ModuleTest {
    
    private Module exampleModule;
    
    public ModuleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        Lecturer lecturer = null;
        ArrayList<CourseProgram> courses = new ArrayList<>();

        this.exampleModule = new Module("Software Engineering 3", "CT417", lecturer, courses);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Module.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Software Engineering 3";
        String result = exampleModule.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Module.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String age = "Software Engineering 3";
        exampleModule.setName(age);

        String expResult = age;
        String result = exampleModule.getName();
        assertEquals(expResult,result);
    }

    /**
     * Test of addStudents method, of class Module.
     */
    @Test
    public void testAddStudents() {
        System.out.println("addStudents");
        CourseProgram course = new CourseProgram("CT");
        ArrayList<Module> modulesArray = new ArrayList<>();
        
        Student student = new Student("Dara Golden", 22, "20/10/2000",course,modulesArray);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        
        exampleModule.addStudents(students);
        
        ArrayList<Student> expResult = students;
        ArrayList<Student> result = exampleModule.getStudents();
        assertEquals(expResult, result);
    }


    /**
     * Test of setCourses method, of class Module.
     */
    @Test
    public void testSetCourses() {
        System.out.println("setCourses");
        CourseProgram course = new CourseProgram("CT");
        ArrayList<CourseProgram> courses = new ArrayList<>();
        courses.add(course);
        
        this.exampleModule.setCourses(courses);
        
        ArrayList<CourseProgram> expResult = courses;
        ArrayList<CourseProgram> result = exampleModule.getCourses();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLecturer method, of class Module.
     */
    @Test
    public void testGetLecturer() {
        System.out.println("getLecturer");
        Lecturer expResult = null;
        Lecturer result = exampleModule.getLecturer();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLecturer method, of class Module.
     */
    @Test
    public void testSetLecturer() {
        System.out.println("setLecturer");
        Lecturer lecturer = new Lecturer("Liam Golden", 75, "19/12/1945");;
        exampleModule.setLecturer(lecturer);
        
        Lecturer expResult = lecturer;
        Lecturer result = exampleModule.getLecturer();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Module.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        String expResult = "CT417";
        String result = exampleModule.getId();
        assertEquals(expResult, result);
    }
    
}
