
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        EmployeeManagement empManagement = new EmployeeManagement();
        
        while(true){
            System.out.println("--- Employee Management Program---");
            System.out.println("1. Input employee information");
            System.out.println("2. Print list of employees");
            System.out.println("3. Search employee by name");
            System.out.println("4. Sort employees name order by descending");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(sc.nextLine());
            
            switch(choice){
                case 1:
                    empManagement.inputEmployee(); break;
                case 2:
                    empManagement.outputEmployees(); break;
                case 3:
                    empManagement.searchEmployeesByName(); break;
                case 4:
                    empManagement.sortEmployeesByName(); break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
