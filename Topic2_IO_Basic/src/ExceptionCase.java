
import java.util.Scanner;

public class ExceptionCase {

    public static void main(String[] args) {
        ExceptionCase.DemoInput(20, 10, "Pham Ngoc Tho");
    }
    
     /**
     * Input Employee information
     * @param age int
     * @param score double 
     * @param name String
     */
    public static void DemoInput(int age, double score, String name){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter score: ");
        score = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.println("Age is: " + age + "\nName is: " + name + "\nScore: " + score);
    }
}
