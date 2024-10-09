public class Circle extends Shape{
    private double r;

    public void setR(double r) {
        this.r = r;
    }
    
    
    public Circle() {
    }
    
    public Circle(double r) {
        this.r = r;
    }
    
    
    @Override
    public double circumstance() {
        return 2 * Math.PI * r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
