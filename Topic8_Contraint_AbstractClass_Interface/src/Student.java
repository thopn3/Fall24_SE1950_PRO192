
public class Student extends Person implements IAuthentication, IPolicy{

    @Override
    public void input(int _id, String _name) {
        this.id = _id;
        this.name = _name;
    }

    @Override
    public void output() {
        System.out.println("Child class: Id = " + this.id + ", Name = "+ this.name);
    }

    @Override
    public void login(String username, String password) {
        if("student".equals(username) && "123".equals(password)){
            System.out.println("Login successfully");
        }else{
            System.out.println("Login failse");
        }
    }

    @Override
    public void logout() {
        
    }

    @Override
    public void permission() {
        System.out.println("Role: View attendence; View scores");
    }
    
}
