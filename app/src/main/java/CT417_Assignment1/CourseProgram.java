/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CT417_Assignment1;

import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author dara
 */
public class CourseProgram {
    private String name;
    private ArrayList<Module> modules = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private DateTime startDate;
    private DateTime endDate;   

    public CourseProgram(String name) {
        this.name = name;
        
    }
    
    
    //Name Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    
    //Modules Getter and Adder
    public ArrayList<Module> getModules() {
        return modules;
    }
    public void addModules(ArrayList<Module> modules) {
        this.modules.addAll(modules);
    }
    public void addModule(Module module) {
        this.modules.add(module);
    }
    
    
    //Student Getter and Adder
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudents(ArrayList<Student> students) {
        this.students.addAll(students);
    }

    
    //Start Date Getter and Setter
    public DateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    
    //End Date Getter and Setter
    public DateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    
    
    
}
