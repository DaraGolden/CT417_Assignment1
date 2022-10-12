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
public class LecturerTest {
    
    private DateTime startDate;
    private DateTime endDate;
    private Lecturer exampleLecturer;   
    ArrayList<CourseProgram> coursesArray;


    public LecturerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
       
      
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        this.exampleLecturer = new Lecturer("Liam Golden", 75, "19/12/1945");
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAge method, of class Lecturer.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        
        int expResult = 75;
        int result = exampleLecturer.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Lecturer.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 25;
        exampleLecturer.setAge(age);

        int expResult = age;
        int result = exampleLecturer.getAge();
        assertEquals(expResult,result);
    }

    /**
     * Test of getUsername method, of class Lecturer.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "Liam Golden75";
        String result = exampleLecturer.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModules method, of class Lecturer.
     */
    @Test
    public void testGetModules() {
        System.out.println("getModules");
        
        ArrayList<Module> modulesArray = new ArrayList<>(); //creating a sample modules array
        
        ArrayList<Module> expResult = modulesArray;
        ArrayList<Module> result = exampleLecturer.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of addModules method, of class Lecturer.
     */
    @Test
    public void testAddModules() {
        System.out.println("addModules");
        Lecturer lecturer = null;

        //creating 2 sample modules 1 of which is identical to that on the 
        Module module = new Module("Software Engineering 3", "CT417",lecturer,this.coursesArray);
        ArrayList<Module> modulesArray = new ArrayList<>(); //creating a sample modules array
        modulesArray.add(module);
         
        exampleLecturer.addModules(modulesArray);
        
        ArrayList<Module> expResult = modulesArray;
        ArrayList<Module> result = this.exampleLecturer.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of removeModules method, of class Lecturer.
     */
    @Test
    public void testRemoveModules() {
        System.out.println("removeModules");
        Lecturer lecturer = null;

        //creating 2 sample modules 1 of which is identical to that on the 
        Module module = new Module("Software Engineering 3", "CT417",lecturer,this.coursesArray);
        ArrayList<Module> modulesArray = new ArrayList<>(); //creating a sample modules array
        modulesArray.add(module);
         
        exampleLecturer.removeModules(modulesArray);
        
        modulesArray.clear();
        ArrayList<Module> expResult = modulesArray;
        ArrayList<Module> result = this.exampleLecturer.getModules();
        assertEquals(expResult, result);
    }
    
}
