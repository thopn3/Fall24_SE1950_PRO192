
public class Run {
    // Entry point
    public static void main(String[] args) {
        // Khoi tao 2 doi tuong co kieu Person class
        Person p1 = new Person();
        p1.inputInfo(123, "ABC", "DED", 2003, false);
        Person p2 = new Person(360860, "Hoang", "Nguyen", 2004, true);
        
        Person p3 = new Person();
        p3.setId(9999);
        p3.setFirstName("Tho");
        
        System.out.println(p1.printInfo());
        System.out.println(p2.printInfo());
        System.out.println(p3.printInfo());
    }
}
