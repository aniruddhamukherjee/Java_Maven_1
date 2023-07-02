package arrays;

import java.util.Scanner;

public class Assingment4 {  // printing array elements row and column wise

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Please enter the number of row ");
    int row = sc.nextInt();
    System.out.println("Please enter the number of column ");
    int coloum = sc.nextInt();


    int[][] numbers = new int[row][coloum];
    //input
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < coloum; j++) {
        System.out.print("Enter row " + i + " and column " + j + " number");
        numbers[i][j] = sc.nextInt();
      }
    }
    //output
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < coloum; j++) {
        System.out.print(numbers[i][j] + "    ");
      }
      System.out.println();
    }
  }
}
