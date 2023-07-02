package threading;

import java.util.Scanner;

class Test {
	int amount = 0;

	synchronized void withdraw(int amount) {

		System.out.println("Current balance=" + this.amount);
		System.out.println("going to withdraw..." + amount);

		while (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
		System.out.println("Balance after withdraw="+this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("Current balance=" + this.amount);

		System.out.println("going to deposit..." + amount);
		this.amount += amount;
		System.out.println("deposit completed... ");
		System.out.println("Balance after deposit="+this.amount);

		notifyAll();
	}
}

public class ThreadWaitNotify {
	public static void main(String args[]) {
		final Test c = new Test();
		
		loop1: while(true){
			
			System.out.println("1.Withdraw \n2.Deposit \n3.Exit");
			Scanner sc = new Scanner(System.in);
			String input=sc.next();
			char cc=input.charAt(0);
			switch(cc){
			case '1': {
				
				System.out.println("Enter amount to withdraw:");
				final int amt= sc.nextInt();
				new Thread() {
					public void run() {
						c.withdraw(amt);
					}
				}.start();
				break;
			}
			
			case '2':{ 	System.out.println("Enter amount to deposit:");
			final int amt= sc.nextInt();
			new Thread() {
				public void run() {
					c.deposit(amt);
				}
			}.start(); break;
			}
			
			case '3' : {System.out.println("Bye"); break loop1;}
			
			}
			
		}
		
/*		

		new Thread() {
			public void run() {
				c.withdraw(500);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(1000);
			}
		}.start();*/

	}
}
