import Bussiness.Employees.*;
import Bussiness.Manager.*;
import java.util.Scanner;

public class IOBasic {
    public static void main(String[] args) {
        int a[], n;
        //Khoi tao doi tuong cho nhap du lieu tu ban phim
        Scanner sc = new Scanner(System.in);
        
        // Nhap gia tri cho n
        System.out.print("Enter n: ");
        n = Integer.parseInt(sc.nextLine());
        // Cap phat cho mang a
        a = new int[n];
        
        System.out.println("Input the elements of array a:");
        // Nhap gia tri cho cac phan tu cua mang a
        for(int i=0; i<n; i++){
            System.out.print("Element "+ (i+1) + "/" + n + ": ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
        
        System.out.print("Output the elements of array: ");
        for(int item : a){
            System.out.format("%5d", item);
        }
        
        System.out.print("\nSum of elements: ");
        int sum = 0;
        for(int item : a){
            sum += item;
        }
        System.out.println(sum);
        
        Bussiness.Employees.Test t1 = new Bussiness.Employees.Test();
        Bussiness.Manager.Test t2 = new Bussiness.Manager.Test();
    }
}
