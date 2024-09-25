
import java.util.Scanner;

public class EmployeeManagement {
    // Khai bao 1 cau truc du lieu de to chuc danh sach cac Employee
    Employee[] listEmployees;
    
    /***
     * Input Employee information
     */
    public void inputEmployee(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employee: ");
        n = Integer.parseInt(sc.nextLine());
        
        // Cap phat so phan tu cho listEmployees
        listEmployees = new Employee[n];
        
        for(int i=0; i<n; i++){
            int id;
            String name;
            String gender;
            String dob;
            boolean isMarried;
            
            System.out.println("Employee: #" + (i+1));
            System.out.print("Employee Id: ");
            id = Integer.parseInt(sc.nextLine());
            System.out.print("Employee Name: ");
            name = sc.nextLine();
            System.out.print("Gender: ");
            gender = sc.nextLine();
            System.out.print("Dob: ");
            dob = sc.nextLine();
            System.out.print("Is married: ");
            isMarried = Boolean.parseBoolean(sc.nextLine());
            
            // Dong goi thong tin cho doi tuong kieu Employee
            Employee newEmployee = new Employee(id, name, gender,dob, isMarried);
            // Them newEmployee vao mang listEmployees
            listEmployees[i] = newEmployee;
        }
    }
    
    public void outputEmployees(){
        System.out.println("List of Employees");
        for(Employee e : listEmployees){
            System.out.println(e);
        }
    }
    
    public void searchEmployeesByName(){
        System.out.println("Search method");
    }
    
    public void sortEmployeesByName(){
        System.out.println("Sort method");
    }
}