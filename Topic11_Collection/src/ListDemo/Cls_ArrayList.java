
package ListDemo;

import java.util.ArrayList;

class Student{
    int id;
    String name;
    public Student(int _id, String _name){
        id = _id;
        name = _name;
    }
}

public class Cls_ArrayList {
    public static void main(String[] args) {
        // Khai bao 1 collection kieu 'list' chua moi doi tuong
        ArrayList listData = new ArrayList();
        
        // Them cac doi tuong vao listData
        listData.add(10);
        listData.add(true);
        int [] numbers = {1, 3, 6, 4};
        listData.add(numbers);
        listData.add(new Student(1, "Marry"));
        
        // Doc tung phan tu tu collection listData
        for(int i=0; i<listData.size(); i++){
            System.out.println(listData.get(i));
        }
    }
}
