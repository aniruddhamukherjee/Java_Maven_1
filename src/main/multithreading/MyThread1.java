package threading;
public class MyThread1 extends Thread{

	public void run(){
	for(int i=0;i<10;i++){
		System.out.println("Child thread");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
}
