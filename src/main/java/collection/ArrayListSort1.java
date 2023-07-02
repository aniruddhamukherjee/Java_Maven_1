package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSort1 {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(5);
    numbers.add(8);
    numbers.add(3);

    System.out.println("Before sorting: " + numbers);

    Collections.sort(numbers);

    System.out.println("After sorting: " + numbers);
  }
}

