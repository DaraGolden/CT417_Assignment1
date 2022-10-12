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
public class StudentTest {
    
    private final DateTime startDate = new DateTime();
    private final DateTime endDate = new DateTime();
    private Student exampleStudent;    
    ArrayList<CourseProgram> coursesArray;
    
    public StudentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        //creating a sample course and adding it to the courses array
        CourseProgram exampleCourse = new CourseProgram("ECE");
        this.coursesArray = new ArrayList<>();
        coursesArray.add(exampleCourse);
        
        ArrayList<Module> modulesArray = new ArrayList<>(); //creating a sample modules array
        
        //instantiating a student object to test on
        this.exampleStudent = new Student("Dara Golden", 22, "20/10/2000", exampleCourse, modulesArray);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 22;
        int result = exampleStudent.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 21;
        exampleStudent.setAge(age);
        
        int expResult = age;
        int result = exampleStudent.getAge();
        assertEquals(expResult,result);
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        
        String expResult = "DaraGolden22";
        String result = exampleStudent.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourse method, of class Student.
     */
    @Test
    public void testSetCourse() {
        System.out.println("setCourse");
        CourseProgram course = new CourseProgram("CT");
        exampleStudent.setCourse(course);
       
        CourseProgram expResult = course;
        CourseProgram result = exampleStudent.getCourse();
        assertEquals(expResult, result);

    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        
        ArrayList<Module> modulesArray = new ArrayList<>(); //creating a sample modules array
        
        ArrayList<Module> expResult = modulesArray;
        ArrayList<Module> result = exampleStudent.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of addModules method, of class Student.
     */
    @Test
    public void testAddModules() {
        System.out.println("addModules");
        
        Lecturer lecturer = null;

        //creating 2 sample modules 1 of which is identical to that on the 
        Module module = new Module("Software Engineering 3", "CT417",lecturer,this.coursesArray);
        ArrayList<Module> modulesArray = new ArrayList<>(); //creating a sample modules array
        modulesArray.add(module);
         
        exampleStudent.addModules(modulesArray);
        
        ArrayList<Module> expResult = modulesArray;
        ArrayList<Module> result = this.exampleStudent.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeModules method, of class Student.
     */
    @Test
    public void testRemoveModules() {
        System.out.println("removeModules");
        Lecturer lecturer = null;

        //creating 2 sample modules 1 of which is identical to that on the 
        Module module = new Module("Software Engineering 3", "CT417",lecturer,this.coursesArray);
        ArrayList<Module> modulesArray = new ArrayList<>(); //creating a sample modules array
        modulesArray.add(module);
         
        exampleStudent.removeModules(modulesArray);
        
        modulesArray.clear();
        ArrayList<Module> expResult = modulesArray;
        ArrayList<Module> result = this.exampleStudent.getModules();
        assertEquals(expResult, result);
    }
}
