package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTraverse {

  public static void main(String args[]) {

    LinkedList<String> al = new LinkedList<String>();
    al.add("Ravi");
    al.add("Vijay");
    al.add("Ravi2");
    al.add("Ajay");

    al.addFirst("Anil");
    al.addLast("Priya");

    al.set(3, "Shruti");

   Iterator<String> itr = al.iterator();

    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

   /* for(String s : al){
      System.out.print(s + " ");
    }*/


  }
}