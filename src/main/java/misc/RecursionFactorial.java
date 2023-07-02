package misc;import java.util.Scanner;


public class RecursionFactorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nmbr");
		int num=sc.nextInt();
		System.out.println("Factorial= "+fact(num));
	}
	
	public static int fact(int n){
		int result=1;
		if(n!=1){
			
		
			result=n*fact(n-1);
		}
		return result;
	}
}
