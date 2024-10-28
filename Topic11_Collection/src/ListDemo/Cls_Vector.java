
package ListDemo;

import java.util.Iterator;
import java.util.Vector;

class Product{
    private int productId;
    private String productName;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

public class Cls_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(10);
        v.add("Hello");
        v.add(1, new Product(100, "Product 1"));
        
        // C1: Thong qua index
        for(int i = 0 ; i< v.size(); i++){
            System.out.println(v.get(i));
        }
        
        // C2: Thong qua Iterator va iterator()
        Iterator loop = v.iterator();
        while(loop.hasNext()){
            System.out.println(loop.next());
        }
    }
}
