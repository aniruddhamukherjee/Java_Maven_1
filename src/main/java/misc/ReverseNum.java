package misc;import java.util.Scanner;


public class ReverseNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nmbr");
		int n = sc.nextInt();
		int rev=0;
		while(n>0){
			
			rev = rev*10;
			rev= rev+n%10;
			n=n/10;
		}
		System.out.println("reverse="+rev);
		
	}
}
