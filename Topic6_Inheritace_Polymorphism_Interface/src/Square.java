
public class Square extends Shape{
    public Square(double side){
        super(side);
    }
    
    @Override
    public String toString(){
        return "Square: Area = " + super.area() + ", Perimeter = " + super.perimeter();
    }
}
