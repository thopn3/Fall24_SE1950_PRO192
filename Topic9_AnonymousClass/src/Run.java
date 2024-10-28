
public class Run {
    public static void main(String[] args) {
        IPerson p = new IPerson(){
            @Override
            public void printMessage() {
                System.out.println("Hello World");
            }
        };
        
        p.printMessage();
    }
}
