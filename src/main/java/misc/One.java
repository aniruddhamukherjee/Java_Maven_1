package misc;

import java.util.ArrayList;
import java.util.Scanner;

public class One {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> num = new ArrayList<Integer>();
    int size;
    System.out.println("How many value do you enter");
    size = sc.nextInt();
    System.out.println("Please enter the number");
    for (int i = 0; i < size; i++) {
      num.add(sc.nextInt());
    }

   int len = num.size();

    System.out.println("even numbers in the List are");

    int counter = 0;

    for (Integer val : num) {
      counter++;
      if (val % 2 == 0) {
        if(counter == len)
          System.out.print(val);
        else
         System.out.print(val + ",");
      }
    }
  }
}


