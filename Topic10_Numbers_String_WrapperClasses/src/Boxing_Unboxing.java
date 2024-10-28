class Student{
    private String name;
    private int age;
    public Student(String _name, int _age){
        name = _name;
        age = _age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Boxing_Unboxing {
    public static void main(String[] args) {
        Student s1 = new Student("A", 20);
        Student s2 = new Student("B", 20);
        
        // Ky thuat Boxing de dong goi tuoi cua 2 Student
        // Integer ageS1 = new Integer(s1.getAge()); // Unboxing: Lay gia tri kieu int trong object
        // Integer ageS2 = new Integer(s2.getAge());
        // So sanh 2 doi tuong
        // int result = ageS1.compareTo(ageS2); // 0 || >0 || <0
        
        int result = Integer.compare(s1.getAge(), s2.getAge());
        
        if(result==0)
            System.out.println("2 sinh vien bang tuoi nhau");
        else if(result > 0)
            System.out.println("Sinh vien S1 lon tuoi hon S2");
        else
            System.out.println("Sinh vien S1 nho tuoi hon S2");
    }
}
