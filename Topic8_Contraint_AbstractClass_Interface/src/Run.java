
public class Run {
    public static void main(String[] args) {
        Student s = new Student();
        s.input(1, "Nguyen Ngoc Hoang");
        s.output();
        System.out.println(s);
        
        s.login("student", "123");
        s.permission();
    }
}
