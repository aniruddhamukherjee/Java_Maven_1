package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperations2 {
  public static void main(String args[]) {
    Integer[] A = {22, 45, 33, 66, 55, 34, 77};
    Integer[] B = {33, 2, 83, 45, 3, 12, 55};

    //ud = empty
    //ud = set1
    //ud = ud + set2

    Set<Integer> set1 = new HashSet<>();

    set1.addAll(Arrays.asList(A));

    Set<Integer> set2 = new HashSet<>();
    set2.addAll(Arrays.asList(B));

    System.out.println("Set1 ==>" + set1);

    System.out.println("Set2 ==>" + set2);


    // Finding Union of set1 and set2

    Set<Integer> union_data = new HashSet<>(set1);
    union_data.addAll(set2); // (set1 + set2) minus common elements!
    //union_data - 22, 33, 66, 34, 77, 2, 83, 45, 3, 12, 55

    System.out.print("Union of set1 and set2 is:");
    System.out.println(union_data);

    // Finding Intersection of set1 and set2
    Set<Integer> intersection_data = new HashSet<Integer>(set1);
    intersection_data.retainAll(set2); // common elements in set1 and set2

    System.out.print("Intersection of set1 and set2 is:");
    System.out.println(intersection_data);

    // Finding Difference of set1 and set2
    Set<Integer> difference_data = new HashSet<Integer>(set1);
    difference_data.removeAll(set2);
    //set1 minus [elements that are common in set1 and set2]

    System.out.print("Set1 minus set2: ");
    System.out.println(difference_data);
  }
}