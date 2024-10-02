
public class Profesor extends Person{
    private String department;
    
    // Constructors

    public Profesor() {
        // Reuse parent constructor
        super();
    }

    public Profesor(int id, String name, String dob, String address, String department) {
        super(id, name, dob, address);
        this.department = department;
    }

    // Encapsulation: Getter/ Setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    // Methods

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
    
}
