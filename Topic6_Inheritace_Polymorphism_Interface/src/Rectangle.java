
public class Rectangle extends Shape{
    private double width;
    
    public Rectangle(double l, double w){
        super(l);
        width = w;
    }
    
    @Override
    public double area() {
        return super.side * width;
    }
    
    @Override
    public double perimeter() {
        return 2 * (super.side + width);
    }
    
    @Override
    public String toString(){
        return "Rectangle: Area = " + area() + ", Perimeter = " + perimeter();
    }
}
