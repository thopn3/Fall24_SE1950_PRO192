
public class Shape implements IShape{
    protected double side;
    
    public Shape(double s){
        side = s;
    }
    
    @Override
    public double area() {
        // Square
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
    
    @Override
    public String toString(){
        return "Area: " + this.area() + ", Perimeter: " + this.perimeter();
    }
}
