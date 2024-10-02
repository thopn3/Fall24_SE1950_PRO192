
public class Run {
    public static void main(String[] args) {
        Profesor p = new Profesor(123, "David", "20/10/1981", "Ha Noi", "IT");
        Student s = new Student(456, "John", "10/05/2005", "Hai Phong", "HE123456", "SE", 9.75);
        
        System.out.println(p);
        System.out.println(s);
    }
}
