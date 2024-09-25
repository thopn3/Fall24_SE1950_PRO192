// Khai bao class Employee -> Dac ta cau truc du lieu cho doi tuong kieu class Employee

public class Employee {
    // Khai bao cac data fields -> chua du lieu cho doi tuong

    private int employeeId;
    private String employeeName;
    private String gender;
    private String dob;
    private boolean isMarried;

    // Dinh nghia contructor -> Khoi tao doi tuong, gan gia tri ban dau cho doi tuong
    public Employee(int employeeId, String employeeName, String gender, String dob, boolean isMarried) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.dob = dob;
        this.isMarried = isMarried;
    }
    
    @Override
    public String toString(){
        return this.employeeId + "\t" + this.employeeName + "\t" + this.gender + "\t" + this.dob + "\t" + (this.isMarried==true? "Married": "Not married");
    }

}
