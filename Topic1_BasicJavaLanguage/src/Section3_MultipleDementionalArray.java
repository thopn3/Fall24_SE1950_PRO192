
public class Section3_MultipleDementionalArray {
    public static void main(String[] args) {
        int m[][] = {{1,2,3,4}, {91,92}, {201,202}};
        
        // Phan tu dau tien cua mang m
        int e1[] = m[0];
        int e2[] = m[1];
        int e3[] = m[2];
        
        int repl[] = {50, 60, 70};
        m[1] = repl;
        // In ra phan tu thu 2 cua mang m
        System.out.print("Phan tu thu 2 cua mang m: ");
        for(int i: m[1]){
            System.out.print(i + "; ");
        }
    }
}
