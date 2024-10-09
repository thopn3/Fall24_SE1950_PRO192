
public class Student extends Person{
    // Data fields
    private String code;
    private String major;
    private double avgScore;
    
    // Constructors: Declaration, Instance object and assigment value -> Data fields (Initial) 
    public Student() {
        super();
    }
    public Student(int id, String name, String dob, String address, String code, String major, double avgScore) {
        super(id, name, dob, address);
        this.code = code;
        this.major = major;
        this.avgScore = avgScore;
    }
    
    // Methods

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return super.toString() + ", Code: " + code + ", Major: " + major + ", AvgScore: " + avgScore;
        
    }
}
