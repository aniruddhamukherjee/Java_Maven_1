package multithreading;
public class app {

public static void main(String[] args) throws InterruptedException {
    app2.mt=Thread.currentThread();
    app2 t = new app2();
    t.start();
    System.out.println("Main starts");
    Thread.sleep(2000);
    System.out.println("Main ends");

  }
}

class app2 extends Thread{
static Thread mt;
public void run(){
    try {
       // mt.join();//waits till main thread dies.
    	Thread.sleep(5000);
    } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    System.out.println(mt.getName()+mt.isAlive());
    System.out.println(Thread.currentThread().getName()+Thread.currentThread().isAlive());
    //System.out.println("in child thread");
  }
}