package threading;
public class FirstClass {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Main start....");
        SecondClass t1 = new SecondClass();
        t1.setName("First Thread");
        SecondClass t2 = new SecondClass();
        t2.setName("Second Thread");
        t1.start();
        t1.run(5);
        Thread.currentThread().sleep(5000);
        t2.start();
        for(int i=0;i<5;i++)
        {System.out.println("t1 alive?"+t1.isAlive());
        //t1.sleep(1000);
        System.out.println("t2 alive?"+t2.isAlive());}
        //t2.sleep(1000);
       
        //Thread.currentThread().sleep(5000);
        for(int i=0;i<5;i++)
        {  System.out.println("t1 alive?"+t1.isAlive());
        System.out.println("t2 alive?"+t2.isAlive());
        	System.out.println("main alive?"+Thread.currentThread().isAlive());
        //Thread.sleep(5000);
        } 
        System.out.println("Main close...");
    }
}