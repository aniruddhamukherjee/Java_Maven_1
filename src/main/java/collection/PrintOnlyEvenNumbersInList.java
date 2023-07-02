package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintOnlyEvenNumbersInList {


  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    List<Integer> numList = new ArrayList<Integer>();

    int size;
    System.out.println("How many value do you enter");
    size = sc.nextInt();
    System.out.println("Please enter the numbers");

    for (int i = 0; i <= size; i++) {
      numList.add(sc.nextInt());
    }

    List<Integer> numListEven = new ArrayList<Integer>();

    for (Integer val : numList) {
      if (val % 2 == 0) {
        numListEven.add(val);
      }
    }

    System.out.println("Even number list is :  " + numListEven);
  }
}