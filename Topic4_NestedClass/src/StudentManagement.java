
import java.util.ArrayList;

public class StudentManagement {
    static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" + "id=" + id + ", name=" + name + '}';
        }
        
        
    }
    
    ArrayList<Student> students = new ArrayList<Student>();
    
    public void inputStudent(){
        students.add(new Student(1, "Hoang"));
    }
    
    public void outputStudents(){
        for(Student s : students){
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        StudentManagement s = new StudentManagement();
        s.inputStudent();
        s.outputStudents();
    }
}
