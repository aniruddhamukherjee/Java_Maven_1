package collection;


import java.util.*;

public class ListIteratorTest {
  public static void main(String[] args) {
    List<String> listObject = new ArrayList<String>();
    listObject.add("Java");
    listObject.add("Selenium");
    listObject.add("Python");
    listObject.add("Java Script");
    listObject.add("Cloud Computing");

    ListIterator it = listObject.listIterator();

    System.out.println("Iterating the elements in forward direction: ");
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    System.out.println("--------------------------------------------");


    System.out.println("Iterating the elements in backward direction: ");
    while (it.hasPrevious()) {
      System.out.println(it.previous());
    }
  }
}
