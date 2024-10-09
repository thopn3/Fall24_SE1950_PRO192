
public class Circle{
    
    private double radius;
    public Circle(double r){
        radius = r;
    }
    
    @Override
    public String toString(){
        return "Area circle = " + IShape.areaCircle(radius);
    }
}
