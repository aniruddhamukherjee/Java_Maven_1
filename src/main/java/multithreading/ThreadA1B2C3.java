package threading;

import java.util.ArrayList;
import java.util.List;

class MyThreadAlpha implements Runnable{ // Thread {
	Test1 tt;
	public MyThreadAlpha(Test1 tt){
		this.tt=tt;
	}
  


	public void run() {

		try {
			this.tt.printAlpha();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class MyThreadNum implements Runnable{ // Thread {
	Test1 tt;
	public MyThreadNum(Test1 tt){
		this.tt=tt;
	}

	public void run() {

		try {
			this.tt.printNum();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Test1 {
	static List<String> alpha = new ArrayList<String>();
	static List<Integer> num = new ArrayList<Integer>();

	public static void init() {
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");

		num.add(1);
		num.add(2);
		num.add(3);

	}
	
	static{
		System.out.println("loaded init method");
		init();
	}

	public synchronized void printAlpha() throws InterruptedException {
		
		for (int i = 0; i < 3; i++) {
			System.out.print(this.alpha.get(i) + " ");
			Thread.sleep(2000);
			notify();
		//	if(Thread.activeCount()>0)
			 wait();
		}
        notify();
	}

	public synchronized void printNum() throws InterruptedException {
		
		for (int i = 0; i < 3; i++) {
			
			System.out.print(this.num.get(i) + " ");
			Thread.sleep(2000);
			notify();
			wait();
		}

	}

}

public class ThreadA1B2C3 {
	public static void main(String[] args) {
   
    final Test1 obj = new Test1();
    ThreadGroup tg1 = new ThreadGroup("Group A");   
	Thread t1= new Thread(tg1,new MyThreadAlpha(obj));
	Thread t2= new Thread(tg1,new MyThreadNum(obj));
   
    
    t1.start();
    t2.start();
}

}
