package misc;import java.util.Scanner;


public class Max {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("enter a number");
		int a = sc.nextInt();
		System.out.println("enter a number");
		int b = sc.nextInt();
		System.out.println("enter a number");
		int c = sc.nextInt();
		int max=0;
		
		if(a>b){
			max=a;
		}
		else {
			max=b;
		}
		
		if(c>max){
			max=c;
		}
		System.out.println(max);
	
	}

}
