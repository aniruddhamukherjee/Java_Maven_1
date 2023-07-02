package arrays;

import java.util.Scanner;

public class Sum_prod_array {

  public static void main(String[] args) {
    int sum = 0;
    int prod = 1;
    int a[] = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 numbers");

    for (int i = 0; i < a.length; i++) {
      System.out.println("Enter " + (i + 1) + "position number");
      a[i] = sc.nextInt();

    }
    for (int i = 0; i < a.length; i++) {
      sum = sum + a[i];
      prod = prod * a[i];
    }
    System.out.println("sum=" + " " + sum);
    System.out.print("prod=2" + prod);

  }

}
