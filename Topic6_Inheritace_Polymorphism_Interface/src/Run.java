
public class Run {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10.5, 5);
        Square s = new Square(15);
        Circle c = new Circle(6);
        
        // Khoi tao cac doi tuong kieu Interface
        IShape squareShape = new Square(10);
        System.out.println(squareShape);
        
        // IShape shape1 = new Circle(5.5); - Error
        squareShape = new Rectangle(20, 10);
        System.out.println(squareShape);
        
        squareShape = new Shape(15.5);
        System.out.println(squareShape);
        /*
        System.out.println(r);
        System.out.println(s);
        System.out.println(c);
        
        System.out.println(squareShape);
        System.out.println(rectShape);
        System.out.println(shape);
        */
        
    }
}
