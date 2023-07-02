package inheritance;

public class ConcreteClass1 extends AbstractClass1{
    @Override
    public void displayMsg() {
        System.out.println("ConcreteClass1 message");
    }

    public void greet() {
        System.out.println("Hello from ConcreteClass1");
    }
}
