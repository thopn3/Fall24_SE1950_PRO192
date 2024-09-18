
public class Person {
    // Fields:
    private int id;
    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private boolean gender;
    
    // Ky thuat bao dong du lieu cho doi tuong - Encapasulation

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    
    
    
    // Constructor:
    // Default constructor:
    public Person(){}
//    
    public Person(int id, String _fName, String _lName, int _year, boolean _gender){
        // Gan gia tri cho cac thuoc tinh
        this.id = id;
        firstName = _fName;
        lastName = _lName;
        yearOfBirth = _year;
        gender = _gender;
    }
    
    // Methods:
    // Nhap thong tin cho Person
    public void inputInfo(int id, String _fName, String _lName, int _year, boolean _gender){
        // Cho nguoi dung nhap tu ban phim -> Ve nha
        this.id = id;
        firstName = _fName;
        lastName = _lName;
        yearOfBirth = _year;
        gender = _gender;
    }
    
    // Hien thi thong tin cua Person
    public String printInfo(){
        String label = "Student information: \n";
        return label + "ID: "+ id + "\nFullname: " + firstName + " " + lastName + "\nYear of birth: " + yearOfBirth + "\nGender: "+ gender;
    }
}
