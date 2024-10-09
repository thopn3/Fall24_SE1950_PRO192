
public class Run {
    public static void main(String[] args) {
        // Shape shape = new Shape(); - Vi pham: abstract class khong dc tao the hien rieng
        Shape shape = new Circle();
        // shape.setR(20); // Vi pham: Vi setR() khong ton tai trong lop cha
                
        Shape shape1 = new Circle(10.3);
        
        System.out.println("Circumstance: " + shape1.circumstance() + ", Area: " + shape1.area());
        
        shape1.printMessage();
        
    }
}
