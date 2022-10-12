package CT417_Assignment1;

import java.util.ArrayList;
/**
 *
 * @author dara
 */
public class Lecturer {
    private String name;
    private int age;
    private String dob;
    private static long id;
    private long lecturerId;
    private String username;
    private ArrayList<Module> modules = new ArrayList<>();

    public Lecturer(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.lecturerId = this.id++;
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
    
    public long getLecturerId() {
        return lecturerId;
    }
    
}
   

    
    


