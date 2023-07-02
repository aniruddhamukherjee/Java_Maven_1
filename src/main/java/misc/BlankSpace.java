package misc;
import java.util.Scanner;


public class BlankSpace {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String");
		String s= sc.nextLine();
		int counter=0;
		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			switch(c){
			case ' ':{
			counter++;
			break;
			}
			default : 	break;
			}
			
		}
		
		System.out.println("No. of spaces:"+counter);
	}

}
