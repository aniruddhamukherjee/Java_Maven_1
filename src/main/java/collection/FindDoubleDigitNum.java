package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDoubleDigitNum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<Double>();
    System.out.println("Enter 10 numbers");
    for (int i = 0; i < 10; i++) {
      Double num = sc.nextDouble();
      list.add(num);
    }
    System.out.println("All numbers you entered");
    System.out.println(list);
    System.out.println("print the Double digit numbers form the list");
    for (Double num : list) {
      if (num >= 10 && num < 100) {
        System.out.println(num);
      }
    }
  }
}