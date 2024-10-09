public interface IShape {
    // Final fields
    final double PI = 3.14;
    
    // Static method
    public static double areaCircle(double r){
        return PI * r * r;
    }
    
    // Abstract methods
    public abstract double area();
    public abstract double perimeter();
}
