
public class Section2_OneDementionalArray {
    public static void main(String[] args) {
        // TH1: Khai bao mang 1 chieu
        int arr[];
        // Cap phat kich thuoc cho mang tren
        arr = new int[3];
        // Gan gia tri cho tung phan tu bang cach truy xuat vao phan tu muon gan thong qua chi so (index)
        arr[0] = 10; arr[1] = 3; arr[2] = 9;
        
        // TH2: Khai bao va cap phat kich thuoc cho mang
        double scores[] = new double[4];
        scores[0] = 6.5;
        scores[1] = 9.5;
        scores[2] = 7;
        scores[3] = 10;
        
        // TH3: Khai bao mang va gan gia tri ban dau tai thoi diem khai bao
        char names[] = {'T', 'h', 'o'};
        char ages[] = {20, 25, 19, 18};
        
        // Su dung cau truc Loop de duyet va in ra tung phan tu trong mang
        for(int e : arr){
            System.out.print(e + "; ");
        }
        
        System.out.println("\nDanh sách điểm kiểm tra:");
        /*
        for(double s: scores){ // Read Only - Chi doc
            s += 2;
        }
        */
        // Bonus cho moi dau diem them 2
        for(int i = 0; i < scores.length; i++){
            scores[i] += 2;
        }
        
        for(double s: scores){
            System.out.println(s + "; ");
        }
        
        System.out.print("Tên là: ");
        for(char c : names){
            System.out.print(c);
        }
        System.out.print("\n");
    }
}
