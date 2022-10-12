/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CT417_Assignment1;

import java.util.ArrayList;

/**
 *
 * @author dara
 */
public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<CourseProgram> courses = new ArrayList<>();
    private Lecturer lecturer;

    //Constructor 
    public Module(String name, String id, Lecturer lecturer, ArrayList<CourseProgram> courses) {
        this.name = name;
        this.id = id;
        this.lecturer = lecturer;
        this.courses = courses;
    }

    //Name Getter and Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Students Getter and Adder
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudents(ArrayList<Student> students) {
        this.students.addAll(students);
    }

    //Courses Getter and Setter
    public ArrayList<CourseProgram> getCourses() {
        return courses;
    }
    public void setCourses(ArrayList<CourseProgram> courses) {
        this.courses = courses;
    }

    //Lecturer Getter and Setter
    public Lecturer getLecturer() {
        return lecturer;
    }
    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    //ID Getter
    public String getId() {
        return id;
    } 
}
