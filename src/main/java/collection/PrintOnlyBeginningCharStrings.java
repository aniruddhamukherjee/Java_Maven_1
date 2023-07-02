package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintOnlyBeginningCharStrings
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<String>();
    System.out.println("Enter five names");
    for (int i = 0; i < 5; i++) {
      String name = sc.nextLine();
      names.add(name);
    }
    System.out.println("All five names you Entered in ArrayList");
    System.out.println(names);

    System.out.println("Names with A & a");
    for (String name : names) {
      if (name.startsWith("A") || name.startsWith("a")) {
        System.out.println(name);
      }
    }
  }
}

//Ab
//acd