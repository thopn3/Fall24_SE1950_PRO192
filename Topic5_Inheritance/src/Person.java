
public class Person {
    // Data fields
    private int id;
    private String name;
    private String dob;
    private String address;
    
    // Constructors

    public Person() {
    }

    /***
     * Instance object Person type
     * @param id Indentifier
     * @param name Fullname
     * @param dob Date of Birth
     * @param address Address
     */
    public Person(int id, String name, String dob, String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
    }
    
    // Encapsulation: Setters/ Getters

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    // Override method of Object class

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dob: " + dob + ", Address: " + address;
    }
    
}
