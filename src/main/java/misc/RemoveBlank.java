package misc;import java.util.Scanner;


public class RemoveBlank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String result="";
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				result = result+s.charAt(i);
			}
		}
		System.out.println("Without space :"+result);
	}
}
