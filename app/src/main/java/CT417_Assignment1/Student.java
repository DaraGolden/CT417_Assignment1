package CT417_Assignment1;

import java.util.ArrayList;
/**
 *
 * @author dara
 */
public class Student {
    private String name;
    private int age;
    private String dob;
    private static long id;
    private long studentId;
    private String username;
    private CourseProgram course;
    private ArrayList<Module> modules = new ArrayList<>();

    public Student(String name, int age, String dob, CourseProgram course, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.course = course;
        this.modules = modules;
        this.studentId = this.id++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        this.username = this.name + this.age;
        return username;
    }

    public CourseProgram getCourse() {
        return course;
    }

    public void setCourse(CourseProgram course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void addModules(ArrayList<Module> modules) {
        this.modules.addAll(modules);
    }
    public void removeModules(ArrayList<Module> modules){
        modules.forEach(module -> {
            this.modules.remove(module);
        });
    }
    
    public long getStudentId() {
        return studentId;
    }
    
}
   

    
    

