
public abstract class Person {
    protected int id;
    protected String name;
    
    public abstract void input(int _id, String _name);
    public abstract void output();
    
    @Override
    public String toString(){
        return "ID: " + this.id + ", Name: " + this.name;
    }
}
