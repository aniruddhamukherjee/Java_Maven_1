package threading;
public class SleepJoin {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread1 m= new MyThread1();
		try {
			m.start();
			m.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<10;i++){
		System.out.println("Main thread");
		Thread.sleep(500);
		//m.join();
		//System.out.println(Thread.currentThread().isAlive());
		}
	}
}
