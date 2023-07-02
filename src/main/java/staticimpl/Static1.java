package staticimpl;

public class Static1 {

     static int counter1 = 0;

     int counter2 = 0;

     static {
         System.out.println("I am in static block");
     }


    {
        System.out.println("I am in instance block");
    }

    public static void main(String[] args) {
        Static1 obj1 =  new Static1();

        Static1 obj2 =  new Static1();

        Static1 obj3 =  new Static1();

        obj1.increaseCounter();
        obj1.increaseCounter();

        obj2.increaseCounter();
        obj2.increaseCounter();

        System.out.println("For obj1 -->");
        obj1.displayCount();

       System.out.println("For obj2 -->");
       obj2.displayCount();

        Static1.greet();

       System.out.println(Math.pow(2,3));

    }

    public void increaseCounter(){
        counter1++;  //static var
        counter2++;  //non static var
    }

    public void displayCount(){
        System.out.println("Counter1 = " + counter1);
        System.out.println("Counter2 = " + counter2);
    }

    public static void greet(){
        System.out.println("Hello from Static1");
    }
}
