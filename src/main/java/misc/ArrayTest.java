package misc;
import java.util.Scanner;


public class ArrayTest {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 int arr[] = new int[5];
	 String arrS[] = {"kolkata","delhi","mumbai"};
	 System.out.println("Enter 5 nos.");
	 for(int i=0;i<5;i++){
		 arr[i]= sc.nextInt();
	 }
	 
	 printArr(arr);
 }
 
 public static void printArr(int a[]){
	 for(int i:a){
		 System.out.print(i);
	 }
 }
}
