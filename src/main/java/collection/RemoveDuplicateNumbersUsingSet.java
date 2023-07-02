package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbersUsingSet {
  public static void main(String[] args) {


    Integer[] A = {22, 44, 44, 55, 33, 22};

    System.out.println("Before:");

    for (Integer num : A) {
      System.out.print(num + " ");
    }

   /* for (int i=0; i<A.length ; i++) {
      System.out.print(A[i] + " ");
    }*/

    HashSet<Integer> set1 = new HashSet<>();
    set1.addAll(Arrays.asList(A));


    System.out.println("\n After:");
    System.out.println(set1);

  }
}
